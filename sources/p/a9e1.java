package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a9e1 {
    public static final a9e1 a;
    public static final a9e1 b;
    public static final a9e1 c;
    public static final a9e1 d;
    public static final /* synthetic */ a9e1[] e;

    static {
        a9e1 a9e1Var = new a9e1("StartInput", 0);
        a = a9e1Var;
        a9e1 a9e1Var2 = new a9e1("StopInput", 1);
        b = a9e1Var2;
        a9e1 a9e1Var3 = new a9e1("ShowKeyboard", 2);
        c = a9e1Var3;
        a9e1 a9e1Var4 = new a9e1("HideKeyboard", 3);
        d = a9e1Var4;
        e = new a9e1[]{a9e1Var, a9e1Var2, a9e1Var3, a9e1Var4};
    }

    public static a9e1 valueOf(String str) {
        return (a9e1) Enum.valueOf(a9e1.class, str);
    }

    public static a9e1[] values() {
        return (a9e1[]) e.clone();
    }
}
