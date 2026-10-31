package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class ResolverStyle {
    public static final ResolverStyle LENIENT;
    public static final ResolverStyle SMART;
    public static final ResolverStyle STRICT;
    public static final /* synthetic */ ResolverStyle[] a;

    static {
        ResolverStyle resolverStyle = new ResolverStyle("STRICT", 0);
        STRICT = resolverStyle;
        ResolverStyle resolverStyle2 = new ResolverStyle("SMART", 1);
        SMART = resolverStyle2;
        ResolverStyle resolverStyle3 = new ResolverStyle("LENIENT", 2);
        LENIENT = resolverStyle3;
        a = new ResolverStyle[]{resolverStyle, resolverStyle2, resolverStyle3};
    }

    public static ResolverStyle valueOf(String str) {
        return (ResolverStyle) Enum.valueOf(ResolverStyle.class, str);
    }

    public static ResolverStyle[] values() {
        return (ResolverStyle[]) a.clone();
    }
}
