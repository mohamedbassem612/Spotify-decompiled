package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class wml1 {
    public static final dt71 a;
    public static final ve01 b;
    public static final dt71 c;
    public static final ve01 d;
    public static volatile String e;

    static {
        dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
        a = dt71VarE;
        b = d5p1.g(dt71VarE);
        dt71 dt71VarE2 = mgo1.e(0, 1, 0, 5);
        c = dt71VarE2;
        d = d5p1.g(dt71VarE2);
    }

    public static void a() {
        e = null;
    }

    public static ve01 b() {
        return b;
    }

    public static ve01 c() {
        return d;
    }

    public static void d(String str) {
        e = str;
    }
}
