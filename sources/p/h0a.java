package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h0a {
    public static final h0a a;
    public static final h0a b;
    public static final /* synthetic */ h0a[] c;

    static {
        h0a h0aVar = new h0a("EXPONENTIAL", 0);
        a = h0aVar;
        h0a h0aVar2 = new h0a("LINEAR", 1);
        b = h0aVar2;
        c = new h0a[]{h0aVar, h0aVar2};
    }

    public static h0a valueOf(String str) {
        return (h0a) Enum.valueOf(h0a.class, str);
    }

    public static h0a[] values() {
        return (h0a[]) c.clone();
    }
}
