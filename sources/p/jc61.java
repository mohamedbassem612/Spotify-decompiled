package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jc61 {
    public static final jc61 a;
    public static final jc61 b;
    public static final /* synthetic */ jc61[] c;

    static {
        jc61 jc61Var = new jc61("HideBottomActions", 0);
        a = jc61Var;
        jc61 jc61Var2 = new jc61("ShowBottomActions", 1);
        b = jc61Var2;
        c = new jc61[]{jc61Var, jc61Var2};
    }

    public static jc61 valueOf(String str) {
        return (jc61) Enum.valueOf(jc61.class, str);
    }

    public static jc61[] values() {
        return (jc61[]) c.clone();
    }
}
