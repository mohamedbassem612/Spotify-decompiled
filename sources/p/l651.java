package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l651 {
    public static final l651 a;
    public static final l651 b;
    public static final /* synthetic */ l651[] c;

    static {
        l651 l651Var = new l651("PRIMARY", 0);
        a = l651Var;
        l651 l651Var2 = new l651("LIBRARY", 1);
        b = l651Var2;
        c = new l651[]{l651Var, l651Var2};
    }

    public static l651 valueOf(String str) {
        return (l651) Enum.valueOf(l651.class, str);
    }

    public static l651[] values() {
        return (l651[]) c.clone();
    }
}
