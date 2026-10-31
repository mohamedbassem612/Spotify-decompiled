package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g5n {
    public static final g5n a;
    public static final g5n b;
    public static final g5n c;
    public static final g5n d;
    public static final /* synthetic */ g5n[] e;

    static {
        g5n g5nVar = new g5n("LOCAL_FILE", 0);
        a = g5nVar;
        g5n g5nVar2 = new g5n("CACHE", 1);
        b = g5nVar2;
        g5n g5nVar3 = new g5n("NETWORK", 2);
        c = g5nVar3;
        g5n g5nVar4 = new g5n("UNKNOWN", 3);
        d = g5nVar4;
        e = new g5n[]{g5nVar, g5nVar2, g5nVar3, g5nVar4};
    }

    public static g5n valueOf(String str) {
        return (g5n) Enum.valueOf(g5n.class, str);
    }

    public static g5n[] values() {
        return (g5n[]) e.clone();
    }
}
