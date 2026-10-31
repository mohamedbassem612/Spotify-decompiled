package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bjm1 {
    public static final bjm1 a;
    public static final bjm1 b;
    public static final /* synthetic */ bjm1[] c;

    static {
        bjm1 bjm1Var = new bjm1("STORY", 0);
        a = bjm1Var;
        bjm1 bjm1Var2 = new bjm1("PLAYLIST", 1);
        b = bjm1Var2;
        c = new bjm1[]{bjm1Var, bjm1Var2};
    }

    public static bjm1 valueOf(String str) {
        return (bjm1) Enum.valueOf(bjm1.class, str);
    }

    public static bjm1[] values() {
        return (bjm1[]) c.clone();
    }
}
