package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zjk1 implements xsw {
    public final tak1 a;
    public boolean b;

    public zjk1(xcn0 xcn0Var, tak1 tak1Var) {
        this.a = tak1Var;
        xcn0Var.a(rc11.a.b(usw.class), this);
    }

    public final void a(boolean z) {
        this.b = z;
    }

    public final void onNext(Object obj) {
        usw uswVar = (usw) obj;
        if (this.b) {
            this.a.invoke(Integer.valueOf(uswVar.a));
        }
    }
}
