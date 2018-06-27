# BNDTOOLS OSGI Tutorial

## Introduction
I've been trying to learn OSGI, so I decided to use http://bndtools.org with eclipse, but when I've tried to follow the bndtools tutorial I wasn't able to make it work which made me wonder is OSGI a complex architecture that it can't be easy to make a simple tutorial work or am I just missing something. So after hours of struggling I discovered that the tutorial was outdated and it should be updated. I tried to combine **enroute** and **apache felix** tutorials which made me able to make this tutorial work, so I decided to share all steps and code via github to help any person who is trying to learn OSGI

## Step 1: Install 
At this step you can follow exactly what is http://bndtools.org/tutorial.html. Once your environment is set you can continue with step 2

## Step 2: Tutorial Updates
At this level i will describe how you can be able to make that tutorial work. So let's start:
1. All component annotation must be imported from org.osgi.service.component.annotations
2. In the GreetingCommand you need to use

import org.osgi.service.component.annotations.Component;

import org.osgi.service.component.annotations.Reference;

@Component(
		property = {
				"osgi.command.scope=example",
				"osgi.command.function=greet"
		    },
		    service=GreetingCommand.class
		    )
3. No need for osgi.cmpn to be imported in bnd decriptor(build tab) neither in the run descriptor file(Run Requirements) 
4. That's all

Here you go, I hope that this steps can help anyone who want to continue learning and using OSGI with bndtools. Please note that i've shared my workspace, so anyone can have a look at the central.maven in cnf folder and also the changes that i've made on the different classes to make the tutorial work. 