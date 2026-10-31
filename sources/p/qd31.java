package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qd31 {
    public static final qd31 a;
    public static final qd31 b;
    public static final qd31 c;
    public static final qd31 d;
    public static final /* synthetic */ qd31[] e;

    static {
        qd31 qd31Var = new qd31("Title", 0);
        a = qd31Var;
        qd31 qd31Var2 = new qd31("SubtitleMeasure", 1);
        b = qd31Var2;
        qd31 qd31Var3 = new qd31("Number", 2);
        c = qd31Var3;
        qd31 qd31Var4 = new qd31("Subtitle", 3);
        d = qd31Var4;
        e = new qd31[]{qd31Var, qd31Var2, qd31Var3, qd31Var4};
    }

    public static qd31 valueOf(String str) {
        return (qd31) Enum.valueOf(qd31.class, str);
    }

    public static qd31[] values() {
        return (qd31[]) e.clone();
    }
}
