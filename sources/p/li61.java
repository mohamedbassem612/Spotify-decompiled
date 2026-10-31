package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class li61 {
    public static final li61 a;
    public static final li61 b;
    public static final /* synthetic */ li61[] c;

    static {
        li61 li61Var = new li61("UIVisible", 0);
        a = li61Var;
        li61 li61Var2 = new li61("UIHidden", 1);
        b = li61Var2;
        c = new li61[]{li61Var, li61Var2};
    }

    public static li61 valueOf(String str) {
        return (li61) Enum.valueOf(li61.class, str);
    }

    public static li61[] values() {
        return (li61[]) c.clone();
    }
}
