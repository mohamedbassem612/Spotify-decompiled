package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h1z {
    public static final h1z a;
    public static final h1z b;
    public static final /* synthetic */ h1z[] c;

    static {
        h1z h1zVar = new h1z("TRAILER", 0);
        a = h1zVar;
        h1z h1zVar2 = new h1z("UNKNOWN", 1);
        b = h1zVar2;
        c = new h1z[]{h1zVar, h1zVar2};
        values();
    }

    public static h1z valueOf(String str) {
        return (h1z) Enum.valueOf(h1z.class, str);
    }

    public static h1z[] values() {
        return (h1z[]) c.clone();
    }
}
