package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ks20 implements mqw {
    public final /* synthetic */ js20 a;
    public final rtr b;

    public ks20(rtr rtrVar, o8n o8nVar) {
        this.a = new js20(zy00.h, zy00.i, yty.V0, rtrVar, true, o8nVar, false);
        this.b = rtrVar;
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return new is20(this.a, obj, (h141) ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b(obj, dtsVar, str);
    }

    public final mc41 c() {
        mc41 mc41Var = this.b.h;
        return mc41Var == null ? new o7x() : mc41Var;
    }

    public final Object d(Object obj) {
        return this.a.b.invoke(obj);
    }
}
