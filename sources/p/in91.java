package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class in91 {
    public static final in91 a;
    public static final in91 b;
    public static final in91 c;
    public static final /* synthetic */ in91[] d;

    static {
        in91 in91Var = new in91("SUCCESS", 0);
        a = in91Var;
        in91 in91Var2 = new in91("FAILURE", 1);
        b = in91Var2;
        in91 in91Var3 = new in91("FORBIDDEN", 2);
        c = in91Var3;
        d = new in91[]{in91Var, in91Var2, in91Var3};
    }

    public static in91 valueOf(String str) {
        return (in91) Enum.valueOf(in91.class, str);
    }

    public static in91[] values() {
        return (in91[]) d.clone();
    }
}
