package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mc91 {
    public static final mc91 a;
    public static final mc91 b;
    public static final mc91 c;
    public static final /* synthetic */ mc91[] d;

    static {
        mc91 mc91Var = new mc91("Content", 0);
        a = mc91Var;
        mc91 mc91Var2 = new mc91("Footer", 1);
        b = mc91Var2;
        mc91 mc91Var3 = new mc91("BottomFade", 2);
        c = mc91Var3;
        d = new mc91[]{mc91Var, mc91Var2, mc91Var3};
    }

    public static mc91 valueOf(String str) {
        return (mc91) Enum.valueOf(mc91.class, str);
    }

    public static mc91[] values() {
        return (mc91[]) d.clone();
    }
}
