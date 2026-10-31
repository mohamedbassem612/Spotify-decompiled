package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class z670 implements v970 {
    public static final s670 b;
    public static final v670 c;
    public static final w670 d;
    public static final x670 e;
    public static final y670 f;
    public static final z670[] g;
    public static final /* synthetic */ z670[] h;
    public final int a;

    static {
        s670 s670Var = new s670("DESCRIPTION_ONLY", 0, 2131429153);
        b = s670Var;
        t670 t670Var = new t670("LARGE_DESCRIPTION_ONLY", 1, 2131429154);
        u670 u670Var = new u670("LARGE_NO_TEXT", 2, 2131429155);
        v670 v670Var = new v670("SUBTITLE_ONLY", 3, 2131429156);
        c = v670Var;
        w670 w670Var = new w670("TITLE", 4, 2131429157);
        d = w670Var;
        x670 x670Var = new x670("TITLE_METADATA", 5, 2131429158);
        e = x670Var;
        y670 y670Var = new y670("TITLE_SUBTITLE", 6, 2131429159);
        f = y670Var;
        h = new z670[]{s670Var, t670Var, u670Var, v670Var, w670Var, x670Var, y670Var};
        g = values();
    }

    public z670(String str, int i, int i2) {
        super(str, i);
        this.a = i2;
    }

    public static z670 valueOf(String str) {
        return (z670) Enum.valueOf(z670.class, str);
    }

    public static z670[] values() {
        return (z670[]) h.clone();
    }

    public final int getId() {
        return this.a;
    }
}
