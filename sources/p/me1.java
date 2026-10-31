package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class me1 {
    public static final me1 a;
    public static final /* synthetic */ me1[] b;

    static {
        me1 me1Var = new me1("ButtonClicked", 0);
        a = me1Var;
        b = new me1[]{me1Var};
    }

    public static me1 valueOf(String str) {
        return (me1) Enum.valueOf(me1.class, str);
    }

    public static me1[] values() {
        return (me1[]) b.clone();
    }
}
