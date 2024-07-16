from django.test import TestCase

# Create your tests here.
# myapp/tests/test_models.py
import pytest
from myapp.models import Book, Author

@pytest.mark.django_db
def test_book_godan_by_munshi_premchand():
    author = Author.objects.create(name="Munshi Premchand")
    book = Book.objects.create(title="Godan", author=author)
    assert Book.objects.filter(title="Godan", author=author).exists()

@pytest.mark.django_db
def test_book_the_brook_by_robert_frost():
    author = Author.objects.create(name="Robert Frost")
    book = Book.objects.create(title="The Brook", author=author)
    assert Book.objects.filter(title="The Brook", author=author).exists()