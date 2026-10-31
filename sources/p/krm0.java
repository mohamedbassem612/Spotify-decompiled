package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class krm0 {
    public static final krm0 a;
    public static final krm0 b;
    public static final /* synthetic */ krm0[] c;

    static {
        krm0 krm0Var = new krm0("TEXT", 0);
        a = krm0Var;
        krm0 krm0Var2 = new krm0("VOICE", 1);
        b = krm0Var2;
        c = new krm0[]{krm0Var, krm0Var2};
    }

    public static krm0 valueOf(String str) {
        return (krm0) Enum.valueOf(krm0.class, str);
    }

    public static krm0[] values() {
        return (krm0[]) c.clone();
    }
}
