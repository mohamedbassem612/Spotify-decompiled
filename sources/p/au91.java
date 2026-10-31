package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class au91 {
    public static final au91 a;
    public static final au91 b;
    public static final /* synthetic */ au91[] c;

    static {
        au91 au91Var = new au91("Dismissed", 0);
        a = au91Var;
        au91 au91Var2 = new au91("ActionPerformed", 1);
        b = au91Var2;
        c = new au91[]{au91Var, au91Var2};
    }

    public static au91 valueOf(String str) {
        return (au91) Enum.valueOf(au91.class, str);
    }

    public static au91[] values() {
        return (au91[]) c.clone();
    }
}
