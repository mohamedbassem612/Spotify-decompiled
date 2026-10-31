package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class px3 {
    public static final px3 a;
    public static final px3 b;
    public static final px3 c;
    public static final /* synthetic */ px3[] d;

    static {
        px3 px3Var = new px3("NotAllowlisted", 0);
        a = px3Var;
        px3 px3Var2 = new px3("Granted", 1);
        b = px3Var2;
        px3 px3Var3 = new px3("Requestable", 2);
        c = px3Var3;
        d = new px3[]{px3Var, px3Var2, px3Var3};
    }

    public static px3 valueOf(String str) {
        return (px3) Enum.valueOf(px3.class, str);
    }

    public static px3[] values() {
        return (px3[]) d.clone();
    }
}
