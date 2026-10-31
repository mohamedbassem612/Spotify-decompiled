package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class er31 {
    public static final cr31 a = a(50);

    public static final cr31 a(int i) {
        ejs0 ejs0VarE = nko1.e(i);
        return new cr31(ejs0VarE, ejs0VarE, ejs0VarE, ejs0VarE);
    }

    public static final cr31 b(float f) {
        q3v q3vVarG = nko1.g(f);
        return new cr31(q3vVarG, q3vVarG, q3vVarG, q3vVarG);
    }

    public static final cr31 c(float f, float f2, float f3, float f4) {
        return new cr31(nko1.g(f), nko1.g(f2), nko1.g(f3), nko1.g(f4));
    }

    public static cr31 d(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return c(f, f2, f3, f4);
    }
}
