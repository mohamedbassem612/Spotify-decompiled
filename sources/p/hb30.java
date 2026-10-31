package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hb30 {
    public static final hb30 a;
    public static final hb30 b;
    public static final /* synthetic */ hb30[] c;

    static {
        hb30 hb30Var = new hb30("Queue", 0);
        a = hb30Var;
        hb30 hb30Var2 = new hb30("Share", 1);
        b = hb30Var2;
        c = new hb30[]{hb30Var, hb30Var2, new hb30("MediaTrimmer", 2), new hb30("Agent", 3)};
    }

    public static hb30 valueOf(String str) {
        return (hb30) Enum.valueOf(hb30.class, str);
    }

    public static hb30[] values() {
        return (hb30[]) c.clone();
    }
}
