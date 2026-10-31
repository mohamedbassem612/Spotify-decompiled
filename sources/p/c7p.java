package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c7p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ c7p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final nm1 a(d0r d0rVar) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                zl5 zl5Var = (zl5) ((b2p) jly0Var).c;
                zmg1 zmg1Var = (zmg1) ((hwj) zl5Var.c).s.get();
                c8o.l(zmg1Var);
                return new nm1(d0rVar, zmg1Var, (tag1) ((jly0) zl5Var.p).get(), zl5Var.s());
            default:
                z9p z9pVar = (z9p) ((ykq) jly0Var).c;
                zmg1 zmg1Var2 = (zmg1) ((v801) z9pVar.k).x.get();
                c8o.l(zmg1Var2);
                return new nm1(d0rVar, zmg1Var2, (tag1) ((jly0) z9pVar.c).get(), (otl0) ((ykq) z9pVar.m).get());
        }
    }
}
