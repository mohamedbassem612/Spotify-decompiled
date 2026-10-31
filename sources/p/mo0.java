package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mo0 {
    public static final mo0 a;
    public static final mo0 b;
    public static final /* synthetic */ mo0[] c;

    static {
        mo0 mo0Var = new mo0("MENU_BACK_BUTTON", 0);
        a = mo0Var;
        mo0 mo0Var2 = new mo0("SYSTEM_BACK_BUTTON", 1);
        b = mo0Var2;
        c = new mo0[]{mo0Var, mo0Var2};
    }

    public static mo0 valueOf(String str) {
        return (mo0) Enum.valueOf(mo0.class, str);
    }

    public static mo0[] values() {
        return (mo0[]) c.clone();
    }
}
