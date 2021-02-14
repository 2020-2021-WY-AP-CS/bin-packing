# Bin Packing

You should already know the overview of what bin packing is and how we
represent it. Watch a video if you have not seen the next fit and best
fit packing strategies in action.

If you want code for repl.it, you should fork [the BinPackingWY
repl](https://repl.it/@maueroats/BinPackingWY). 

Get [the code from
GitHub](https://github.com/2020-2021-WY-AP-CS/bin-packing) using the
big green Code button. 

Check the [bin-packing wiki](https://github.com/2020-2021-WY-AP-CS/bin-packing/wiki) to see questions and answers, and any further information.

## Overview

The `PackingStrategy` interface is an abstract way of saying "an
object that knows how to place a single item". This is the key class
that "does the work" of packing. You will be making two classes that
implement different packing strategies.

The `Packer` class manages the grunt work of the packing process. It
follows whatever `PackingStrategy` you give it in the
constructor. This mean another object is determining exactly how an
item is placed in a bin.

There are four methods to implenent:

* `List<Integer> packAll(...)`: give a list of bins showing where the
  corresponding items go.
* `int binsUsed(...)`: helper function to find out how many bins are used in a
  list of bins.
* `int[] spaceUsed(...)`: returns an array of how much space is used in each bin.
* `void shipBin(...)`: a bin is shipped off, take the items in that
  bin out of the list, and remove the bin number as well (moving
  numbers above it down).

The `TestPacking` class contains tester code for each function in
`Packer` that you should implement. You could add tests for the
`itemPlace` function in `NextFit` and `BestFit`. (This would be a good
idea if you have trouble with them.)

## Details

One function you will be writing is `itemPlace`, which has the
following signature.

    public int itemPlace(List<Integer> bins,
                         int binCapacity,
                         int itemSize);


The first place to write `itemPlace` is in the `NextFit` class. That
method is pretty simple.

The last place to write `itemPlace` is in the `BestFit` class. You can
do that after you have all of the rest of the code working.

