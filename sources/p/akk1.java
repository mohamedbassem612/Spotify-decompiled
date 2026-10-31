package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class akk1 implements xsw {
    public final iu30 a;
    public boolean b;

    public akk1(wsw wswVar, iu30 iu30Var) {
        this.a = iu30Var;
        wswVar.a(rc11.a.b(usw.class), this);
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
