package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class fn41 extends q6 implements e9n {
    public final lnm e;

    public fn41(lnm lnmVar, o8n o8nVar) {
        super(o8nVar, true, true);
        this.e = lnmVar;
    }

    @Override // p.saa0
    public void N(Object obj) {
        hr80.w(uap1.o(obj), aym.t(this.e));
    }

    @Override // p.saa0
    public void P(Object obj) {
        this.e.resumeWith(uap1.o(obj));
    }

    @Override // p.e9n
    public final e9n getCallerFrame() {
        lnm lnmVar = this.e;
        if (lnmVar instanceof e9n) {
            return (e9n) lnmVar;
        }
        return null;
    }

    @Override // p.saa0
    public final boolean l0() {
        return true;
    }

    public void B0() {
    }
}
