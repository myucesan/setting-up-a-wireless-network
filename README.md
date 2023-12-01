
**This is a minimum spanning tree variant. It is unfinished.**
# Wireless Network Problem
To set up internet connections in a large area in Cittagazze, stations are planned at locations with a high population density. These 𝑛
stations are connected through pairs of quite expensive directional antennas. The price of (a pair of) antennas depends on the required range, and for each pair of locations (𝑢,𝑣)
these costs are given by 𝑐(𝑢,𝑣)>0
. The main question of this exercise is which (undirected) connections to set up such that all locations are connected and the installation costs are as low as possible.

Unfortunately, there is insufficient budget for setting up the connected network computed above at once. The government decides to make as many connections of the optimal network as possible, given the available budget 𝐵
(and to complete the network in upcoming years). For example, if the network looks like this, a budget of 3 would select (𝑎,𝑏)
and (𝑑,𝑒)
and (𝑓,𝑔).

(a)--1--(b)--2--(c)--3--(d)--1--(e)--2--(f)--1--(g)

For any pair of locations that is not given, the costs of connecting can be assumed to be infinite. It is guaranteed that the network can be set up using finite costs.

Your output should be two numbers. The first number is the minimum total costs to connect all locations. The second number is the number of connections that can be built using the budget.

Example:
4 locations

5 possible connections with finite cost:

0-1, cost 6

1-2, cost 9

0-2, cost 7

1-3, cost 2

0-3, cost 8

A budget of 8

Connecting all 4 locations would take 15 and we can build 2 connections with our current budget.