# Start from a base Python image
FROM python:3.9-slim

# Set environment variables
ENV PYTHONDONTWRITEBYTECODE 1
ENV PYTHONUNBUFFERED 1

# Set the working directory in the container
WORKDIR /app

# Copy your application code to the container
COPY . /app/

# Expose the port your application runs on
EXPOSE 8000



# Specify the command to run your application
CMD ["pytest","python", "manage.py", "runserver", "0.0.0.0:8000"]
