(ns es.command
  (:require [es.command.count]
            [es.command.lifecycle]
            [es.command.health]
            [es.command.heap]
            [es.command.indices]
            [es.command.master]
            [es.command.nodes]
            [es.command.shards]
            [es.command.search]
            [es.command.version]
            [es.command.allocation]))

(def available
  ['count
   'lifecycle
   'health
   'heap
   'indices
   'master
   'nodes
   'search
   'shards
   'version
   'allocation])
