package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zt91 {
    public static final zt91 a;
    public static final /* synthetic */ zt91[] b;

    static {
        zt91 zt91Var = new zt91("Dismissed", 0);
        a = zt91Var;
        b = new zt91[]{zt91Var, new zt91("ActionPerformed", 1)};
    }

    public static zt91 valueOf(String str) {
        return (zt91) Enum.valueOf(zt91.class, str);
    }

    public static zt91[] values() {
        return (zt91[]) b.clone();
    }
}
