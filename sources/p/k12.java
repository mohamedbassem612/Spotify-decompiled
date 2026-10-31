package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k12 {
    public static final k12 a;
    public static final k12 b;
    public static final /* synthetic */ k12[] c;

    static {
        k12 k12Var = new k12("EDIT", 0);
        a = k12Var;
        k12 k12Var2 = new k12("VIEW", 1);
        b = k12Var2;
        c = new k12[]{k12Var, k12Var2};
    }

    public static k12 valueOf(String str) {
        return (k12) Enum.valueOf(k12.class, str);
    }

    public static k12[] values() {
        return (k12[]) c.clone();
    }
}
