package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jjg1 {
    public static final jjg1 a;
    public static final jjg1 b;
    public static final /* synthetic */ jjg1[] c;

    static {
        jjg1 jjg1Var = new jjg1("REVERT", 0);
        a = jjg1Var;
        jjg1 jjg1Var2 = new jjg1("RE_SAVE", 1);
        b = jjg1Var2;
        c = new jjg1[]{jjg1Var, jjg1Var2};
    }

    public static jjg1 valueOf(String str) {
        return (jjg1) Enum.valueOf(jjg1.class, str);
    }

    public static jjg1[] values() {
        return (jjg1[]) c.clone();
    }
}
