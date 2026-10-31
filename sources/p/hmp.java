package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hmp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ hmp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ti40 a(j2h1 j2h1Var, iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                kop kopVar = (kop) ((blp) ykqVar).c;
                xfx xfxVarC0 = kopVar.a.c0();
                c8o.l(xfxVarC0);
                return new ti40(new zfx(xfxVarC0.c, (byte) 1), new urk0((byte) 4), (yqg) kopVar.d.get(), j2h1Var, iu30Var);
            default:
                apq apqVar = (apq) ykqVar.c;
                xfx xfxVarC1 = apqVar.a.c0();
                c8o.l(xfxVarC1);
                return new ti40(new zfx(xfxVarC1.c, (byte) 1), new urk0((byte) 4), (yqg) apqVar.d.get(), j2h1Var, iu30Var);
        }
    }
}
