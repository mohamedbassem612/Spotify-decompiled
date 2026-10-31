package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class gb70 implements w570, e670 {
    public static final ka70 b;
    public static final oa70 c;
    public static final qa70 d;
    public static final /* synthetic */ gb70[] e;
    public final String a;

    static {
        ka70 ka70Var = new ka70("ENTITY", 0, "glue:entityRow");
        b = ka70Var;
        la70 la70Var = new la70("MULTILINE", 1, "glue:text");
        ma70 ma70Var = new ma70("MULTILINE_CAPPED", 2, "glue:textRow");
        na70 na70Var = new na70("NAVIGATION", 3, "glue:navigationRow");
        oa70 oa70Var = new oa70("NORMAL", 4, "glue:row");
        c = oa70Var;
        pa70 pa70Var = new pa70("SMALL", 5, "glue:smallRow");
        qa70 qa70Var = new qa70("VIDEO", 6, "glue:videoRow");
        d = qa70Var;
        e = new gb70[]{ka70Var, la70Var, ma70Var, na70Var, oa70Var, pa70Var, qa70Var};
    }

    public gb70(String str, int i, String str2) {
        super(str, i);
        this.a = str2;
    }

    public static gb70 valueOf(String str) {
        return (gb70) Enum.valueOf(gb70.class, str);
    }

    public static gb70[] values() {
        return (gb70[]) e.clone();
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return s570.ROW.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
