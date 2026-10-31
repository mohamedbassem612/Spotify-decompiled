package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class h970 implements v970 {
    public static final d970 b;
    public static final e970 c;
    public static final f970 d;
    public static final g970 e;
    public static final h970[] f;
    public static final /* synthetic */ h970[] g;
    public final int a;

    static {
        d970 d970Var = new d970("NO_TEXT", 0, 2131429181);
        b = d970Var;
        e970 e970Var = new e970("TITLE", 1, 2131429182);
        c = e970Var;
        f970 f970Var = new f970("TITLE_METADATA", 2, 2131429183);
        d = f970Var;
        g970 g970Var = new g970("TITLE_SUBTITLE", 3, 2131429184);
        e = g970Var;
        g = new h970[]{d970Var, e970Var, f970Var, g970Var};
        f = values();
    }

    public h970(String str, int i, int i2) {
        super(str, i);
        this.a = i2;
    }

    public static h970 valueOf(String str) {
        return (h970) Enum.valueOf(h970.class, str);
    }

    public static h970[] values() {
        return (h970[]) g.clone();
    }

    public final int getId() {
        return this.a;
    }
}
