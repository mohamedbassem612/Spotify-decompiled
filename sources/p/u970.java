package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class u970 implements w570, e670 {
    public static final int X;
    public static final int Y;
    public static final /* synthetic */ u970[] Z;
    public static final m970 c;
    public static final n970 d;
    public static final o970 e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int t;
    public final String a;
    public final String b;

    static {
        s570 s570Var = s570.ROW;
        m970 m970Var = new m970("BACKGROUND", 0, "glue:gradient", s570Var);
        c = m970Var;
        n970 n970Var = new n970("CAROUSEL", 1, "glue:carousel", s570Var);
        d = n970Var;
        o970 o970Var = new o970("EMPTY_VIEW", 2, "glue:emptyview", s570.CARD);
        e = o970Var;
        s570 s570Var2 = s570.HEADER;
        Z = new u970[]{m970Var, n970Var, o970Var, new p970("HEADER", 3, "glue:header", s570Var2), new q970("HEADER_COVER_ART", 4, "glue:header:cover", s570Var2), new r970("HEADER_LARGE", 5, "glue:header:large", s570Var2), new s970("HEADER_NEW", 6, "glue:header:header", s570Var2), new t970("SHUFFLE_BUTTON", 7, "glue:shuffleButton", s570Var)};
        f = 2131429179;
        g = 2131429185;
        h = 2131429186;
        i = 2131429187;
        t = 2131429189;
        X = 2131429188;
        Y = 2131429211;
    }

    public u970(String str, int i2, String str2, s570 s570Var) {
        super(str, i2);
        this.a = str2;
        s570Var.getClass();
        this.b = s570Var.a;
    }

    public static u970 valueOf(String str) {
        return (u970) Enum.valueOf(u970.class, str);
    }

    public static u970[] values() {
        return (u970[]) Z.clone();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
