package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g1z {
    public static final g1z a;
    public static final g1z b;
    public static final g1z c;
    public static final g1z d;
    public static final /* synthetic */ g1z[] e;

    static {
        g1z g1zVar = new g1z("FULL", 0);
        a = g1zVar;
        g1z g1zVar2 = new g1z("TRAILER", 1);
        b = g1zVar2;
        g1z g1zVar3 = new g1z("BONUS", 2);
        c = g1zVar3;
        g1z g1zVar4 = new g1z("UNKNOWN", 3);
        d = g1zVar4;
        e = new g1z[]{g1zVar, g1zVar2, g1zVar3, g1zVar4};
        values();
    }

    public static g1z valueOf(String str) {
        return (g1z) Enum.valueOf(g1z.class, str);
    }

    public static g1z[] values() {
        return (g1z[]) e.clone();
    }
}
