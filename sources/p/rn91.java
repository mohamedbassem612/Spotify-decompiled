package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rn91 {
    public static final rn91 a;
    public static final rn91 b;
    public static final /* synthetic */ rn91[] c;

    static {
        rn91 rn91Var = new rn91("SHUFFLE", 0);
        a = rn91Var;
        rn91 rn91Var2 = new rn91("SMART_SHUFFLE", 1);
        b = rn91Var2;
        c = new rn91[]{rn91Var, rn91Var2};
    }

    public static rn91 valueOf(String str) {
        return (rn91) Enum.valueOf(rn91.class, str);
    }

    public static rn91[] values() {
        return (rn91[]) c.clone();
    }
}
