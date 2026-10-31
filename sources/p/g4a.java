package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g4a {
    public static final g4a a;
    public static final g4a b;
    public static final g4a c;
    public static final g4a d;
    public static final /* synthetic */ g4a[] e;

    static {
        g4a g4aVar = new g4a("UNKNOWN", 0);
        a = g4aVar;
        g4a g4aVar2 = new g4a("DEFAULT", 1);
        b = g4aVar2;
        g4a g4aVar3 = new g4a("BANNED", 2);
        c = g4aVar3;
        g4a g4aVar4 = new g4a("ALLOWED", 3);
        d = g4aVar4;
        e = new g4a[]{g4aVar, g4aVar2, g4aVar3, g4aVar4};
    }

    public static g4a valueOf(String str) {
        return (g4a) Enum.valueOf(g4a.class, str);
    }

    public static g4a[] values() {
        return (g4a[]) e.clone();
    }
}
