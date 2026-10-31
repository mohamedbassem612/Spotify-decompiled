package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zgr0 {
    public static final zgr0 a;
    public static final zgr0 b;
    public static final zgr0 c;
    public static final zgr0 d;
    public static final /* synthetic */ zgr0[] e;

    static {
        zgr0 zgr0Var = new zgr0("BackButton", 0);
        a = zgr0Var;
        zgr0 zgr0Var2 = new zgr0("Title", 1);
        b = zgr0Var2;
        zgr0 zgr0Var3 = new zgr0("Actions", 2);
        c = zgr0Var3;
        zgr0 zgr0Var4 = new zgr0("ActionBackgrounds", 3);
        d = zgr0Var4;
        e = new zgr0[]{zgr0Var, zgr0Var2, zgr0Var3, zgr0Var4};
    }

    public static zgr0 valueOf(String str) {
        return (zgr0) Enum.valueOf(zgr0.class, str);
    }

    public static zgr0[] values() {
        return (zgr0[]) e.clone();
    }
}
