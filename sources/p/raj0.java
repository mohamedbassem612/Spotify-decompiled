package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class raj0 {
    public static final raj0 a;
    public static final raj0 b;
    public static final /* synthetic */ raj0[] c;

    static {
        raj0 raj0Var = new raj0("CancelButtonClicked", 0);
        a = raj0Var;
        raj0 raj0Var2 = new raj0("EnableMixButtonClicked", 1);
        b = raj0Var2;
        c = new raj0[]{raj0Var, raj0Var2};
    }

    public static raj0 valueOf(String str) {
        return (raj0) Enum.valueOf(raj0.class, str);
    }

    public static raj0[] values() {
        return (raj0[]) c.clone();
    }
}
