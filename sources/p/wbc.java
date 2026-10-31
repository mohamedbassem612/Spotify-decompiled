package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wbc {
    public static final wbc m = new wbc();
    public final vz00 a;
    public final hf40 b;
    public final hf40 c;
    public final hf40 d;
    public final hf40 e;
    public final hf40 f;
    public final hf40 g;
    public final hf40 h;
    public final hf40 i;
    public final hf40 j;
    public final hf40 k;
    public final hf40 l;

    public wbc() {
        vz00 vz00Var = new vz00();
        acc.a(vz00Var);
        hf40 hf40Var = acc.c;
        hf40 hf40Var2 = acc.b;
        hf40 hf40Var3 = acc.d;
        hf40 hf40Var4 = acc.e;
        hf40 hf40Var5 = acc.f;
        hf40 hf40Var6 = acc.g;
        hf40 hf40Var7 = acc.i;
        hf40 hf40Var8 = acc.h;
        hf40 hf40Var9 = acc.j;
        hf40 hf40Var10 = acc.k;
        hf40 hf40Var11 = acc.l;
        this.a = vz00Var;
        this.b = hf40Var;
        this.c = hf40Var2;
        this.d = hf40Var3;
        this.e = hf40Var4;
        this.f = hf40Var5;
        this.g = hf40Var6;
        this.h = hf40Var7;
        this.i = hf40Var8;
        this.j = hf40Var9;
        this.k = hf40Var10;
        this.l = hf40Var11;
    }

    public static String a(kf30 kf30Var) {
        lf30 lf30Var = kf30Var.a;
        StringBuilder sb = new StringBuilder(lf30Var.a.replace('.', '/'));
        sb.append('/');
        sb.append((lf30Var.c() ? "default-package" : lf30Var.g().b()).concat(".kotlin_builtins"));
        return sb.toString();
    }
}
