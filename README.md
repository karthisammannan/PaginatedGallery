Paginated Gallery for Android [DEPRECATED - don't copy iOS on Android]
==========================================

An implementation of a Paginated image gallery for Android. It extends the ViewPager class 
from the Android support v4 library and Jake Wharton's [`CirclePageIndicator`][1].

Class automatically resizes the drawables to fit on screen according to the number of 
views required per page. It also includes an `OnClickListener` (although this is through the adapter and not through the gallery widget
it should be).


Classes
-------

The following have been added so far. You are welcome to fork or suggest improvements and additions

* `PaginatedGallery` -- a Paginated Gallery similar to iOS with page indicators and click listener (uses code imported from [ViewPagerIndicator][1] lib)
* `PaginatedGalleryAdapter` -- Adapter for the gallery
* `RemoteImageView` -- the background image loader from the Matthias Käppler's awesome [Ignition][2] library
 
Developed By
------------

* Saad Farooq - <unimpeccable@gmail.com>


Contributing
------------

Want to contribute? Great! Fork and if you have suggestions, contact me via GitHub...

1. Fork it.
2. Create a branch (`git checkout -b a-droid-lib`)
3. Commit your changes (`git commit -am "Added Something"`)
4. Push to the branch (`git push origin a-droid-lib`)
5. Create an [Issue][3] with a link to your branch

License
=======

    Copyright 2012 Saad Farooq
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.




[1]: https://github.com/JakeWharton/Android-ViewPagerIndicator/
[2]: https://github.com/kaeppler/ignition
[3]: http://github.com/github/markup/issues