package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class chz0 {
    public static final chz0 a;
    public static final chz0 b;
    public static final chz0 c;
    public static final /* synthetic */ chz0[] d;

    static {
        chz0 chz0Var = new chz0("YOUNGER", 0);
        a = chz0Var;
        chz0 chz0Var2 = new chz0("SAME_AGE", 1);
        b = chz0Var2;
        chz0 chz0Var3 = new chz0("OLDER", 2);
        c = chz0Var3;
        d = new chz0[]{chz0Var, chz0Var2, chz0Var3};
    }

    public static chz0 valueOf(String str) {
        return (chz0) Enum.valueOf(chz0.class, str);
    }

    public static chz0[] values() {
        return (chz0[]) d.clone();
    }
}
