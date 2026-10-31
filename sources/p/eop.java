package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class eop {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ eop(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final uh91 a(iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                kopVar.getClass();
                return new uh91(new td20(new urk0((byte) 4), (e8r0) kopVar.f16p.get()), iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                apqVar.getClass();
                return new uh91(new td20(new urk0((byte) 4), (e8r0) apqVar.o.get()), iu30Var);
        }
    }
}
