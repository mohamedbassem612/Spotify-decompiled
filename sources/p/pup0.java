package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pup0 {
    public static final pup0 a;
    public static final pup0 b;
    public static final /* synthetic */ pup0[] c;

    static {
        pup0 pup0Var = new pup0("Clicked", 0);
        a = pup0Var;
        pup0 pup0Var2 = new pup0("LongClicked", 1);
        b = pup0Var2;
        c = new pup0[]{pup0Var, pup0Var2};
    }

    public static pup0 valueOf(String str) {
        return (pup0) Enum.valueOf(pup0.class, str);
    }

    public static pup0[] values() {
        return (pup0[]) c.clone();
    }
}
