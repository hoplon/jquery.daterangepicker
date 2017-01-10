# jquery.daterangepicker

A [Hoplon][hoplon] wrapper for the [jQuery date range picker plugin][1].

## Dependency

[](dependency)
```clojure
[hoplon/jquery-daterange-picker "0.0.8-1"] ;; latest release
```
[](/dependency)

## Usage

Simple example page using it in a page:

```clojure
(page "index.html"
  (:require
    [hoplon.jquery.daterangepicker :refer [daterange]]))

(html
  (head)
  (body
    (daterange)))
```

The value can be bound to a [Javelin][javelin] cell:

```clojure
(defc selected-dates nil)
...
(daterange :state selected-dates)
```

Options may be passed to the constructor via the `:opts` attribute:

```clojure
(daterange :opts {:autoClose true})
```

Options (or anything else) can be bound to cells responsively:

```clojure
(defc auto-close? true)
...
(daterange :opts (cell= {:autoClose auto-close?}))
```

The date picker custom events can be used directly, if necessary:

```clojure
(daterange :datepicker-change #(js/alert "thanks for picking a date!"))
```

## License

Copyright © 2014, Alan Dipert and Micha Niskin

Distributed under the Eclipse Public License, the same as Clojure

[hoplon]: https://hoplon.io
[javelin]: https://github.com/hoplon/javelin
[1]: https://github.com/longbill/jquery-date-range-picker
