package p;

import j$.time.Clock;
import j$.time.format.DateTimeFormatter;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mcv0 {
    public static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss", new Locale(upn1.m()));
    public final Clock a;

    public mcv0(Clock clock) {
        this.a = clock;
    }
}
