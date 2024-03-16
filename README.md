1. In order to directly run this project, pull the docker image **docker pull nitishjha72/selenium-docker-aws:latest** and then run the following commands:
   1. docker-compose -f grid.yaml up --scale chrome=3
   2. BROWSER=chrome docker-compose -f test-suites.yaml up
 
      
