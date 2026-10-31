package p;

import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class lfk {
    public static final DateTimeFormatter a = DateTimeFormatter.ofPattern("EEE");

    public static final String a(OffsetDateTime offsetDateTime) {
        return xcg1.i(offsetDateTime.format(a), ", ", offsetDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.getDefault())));
    }
}
