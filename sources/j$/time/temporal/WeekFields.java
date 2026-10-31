package j$.time.temporal;

import j$.nio.file.r;
import j$.time.DayOfWeek;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class WeekFields implements Serializable {
    public static final ConcurrentMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final g h;
    private static final long serialVersionUID = -1177360819670808121L;
    public final DayOfWeek a;
    public final int b;
    public final transient p c;
    public final transient p d;
    public final transient p e;
    public final transient p f;

    static {
        new WeekFields(DayOfWeek.MONDAY, 4);
        a(DayOfWeek.SUNDAY, 1);
        h = h.d;
    }

    public WeekFields(DayOfWeek dayOfWeek, int i) {
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        ChronoUnit chronoUnit2 = ChronoUnit.WEEKS;
        this.c = new p("DayOfWeek", this, chronoUnit, chronoUnit2, p.f);
        this.d = new p("WeekOfMonth", this, chronoUnit2, ChronoUnit.MONTHS, p.g);
        g gVar = h.d;
        this.e = new p("WeekOfWeekBasedYear", this, chronoUnit2, gVar, p.i);
        this.f = new p("WeekBasedYear", this, gVar, ChronoUnit.FOREVER, ChronoField.YEAR.b);
        Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            r.a("Minimal number of days is invalid");
            throw null;
        }
        this.a = dayOfWeek;
        this.b = i;
    }

    public static WeekFields a(DayOfWeek dayOfWeek, int i) {
        String str = dayOfWeek.toString() + i;
        ConcurrentMap concurrentMap = g;
        WeekFields weekFields = (WeekFields) concurrentMap.get(str);
        if (weekFields != null) {
            return weekFields;
        }
        concurrentMap.putIfAbsent(str, new WeekFields(dayOfWeek, i));
        return (WeekFields) concurrentMap.get(str);
    }

    public static WeekFields of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        return a(DayOfWeek.a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return a(this.a, this.b);
        } catch (IllegalArgumentException e) {
            throw new InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeekFields) && hashCode() == obj.hashCode();
    }

    public DayOfWeek getFirstDayOfWeek() {
        return this.a;
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final String toString() {
        return "WeekFields[" + this.a + "," + this.b + "]";
    }
}
