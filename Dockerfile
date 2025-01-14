# Use the official Node.js image
FROM node:16-alpine

# Set environment variables for MongoDB connection
ENV MONGO_DB_USERNAME=admin \
    MONGO_DB_USERName=password \
    MONGO_URL=mongodb://admin:password@mongodb:27017

# Set the working directory inside the container
WORKDIR /app

# Copy the application code into the container
COPY . /app

# Install dependencies
RUN npm install

# Expose the app port
EXPOSE 3000

# Start the Node.js application
CMD [ "node", "index.js" ]
