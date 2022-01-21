FROM openjdk:16-bullseye

ARG USERNAME=coder
ARG USER_UID=1000
ARG USER_GID=$USER_UID

#
# Create a non-root user
RUN apt-get update \
    && groupadd --gid $USER_GID $USERNAME \
    && useradd -s /bin/bash --uid $USER_UID --gid $USER_GID -m $USERNAME \
    # Add sudo support for the non-root user
    && apt-get install -y sudo \
    && echo $USERNAME ALL=\(root\) NOPASSWD:ALL > /etc/sudoers.d/$USERNAME\
    && chmod 0440 /etc/sudoers.d/$USERNAME 

# Install Live Share dependencies
RUN apt-get install -y --no-install-recommends libicu[0-9][0-9] libkrb5-3 openssl zlib1g