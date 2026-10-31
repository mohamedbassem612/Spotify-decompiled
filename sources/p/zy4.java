package p;

import j$.time.format.DateTimeFormatter;
import j$.time.format.ResolverStyle;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zy4 {
    public static final se11 a = new se11("^profile_(?:trigger_2|trigger-type-2)_(\\d{4}-\\d{2}-\\d{2}-\\d{2}-\\d{2}-\\d{2})\\.perfetto-trace$");
    public static final DateTimeFormatter b = DateTimeFormatter.ofPattern("uuuu-MM-dd-HH-mm-ss", Locale.ROOT).withResolverStyle(ResolverStyle.STRICT);
}
