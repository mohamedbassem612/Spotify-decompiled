package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class r770 implements w570, e670 {
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final /* synthetic */ r770[] h;
    public final String a;
    public final String b;

    /* JADX INFO: Fake field, exist only in values array */
    r770 EF9;

    static {
        s570 s570Var = s570.ROW;
        h = new r770[]{new m770("CAROUSEL", 0, "glue2:carousel", s570Var), new n770("EMPTY_STATE", 1, "glue2:emptyState", s570.CARD), new o770("GRADIENT", 2, "glue2:gradient", s570Var), new p770("SIMPLE_HEADER", 3, "glue2:simpleHeader", s570.HEADER)};
        c = 2131429149;
        d = 2131429150;
        e = 2131429151;
        f = 2131429152;
        g = 2131429171;
    }

    public r770(String str, int i, String str2, s570 s570Var) {
        super(str, i);
        this.a = str2;
        s570Var.getClass();
        this.b = s570Var.a;
    }

    public static r770 valueOf(String str) {
        return (r770) Enum.valueOf(r770.class, str);
    }

    public static r770[] values() {
        return (r770[]) h.clone();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
