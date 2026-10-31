package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class knp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ knp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ldo a(j2h1 j2h1Var, iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                urk0 urk0Var = new urk0((byte) 4);
                kop kopVar = (kop) ((blp) ykqVar).c;
                sd41 sd41VarO0 = kopVar.a.o0();
                c8o.l(sd41VarO0);
                fna fnaVar = new fna(sd41VarO0, (byte) 21);
                gw70 gw70VarB = kopVar.a.b();
                c8o.l(gw70VarB);
                return new ldo(urk0Var, fnaVar, gw70VarB, kopVar.L0, j2h1Var, iu30Var, (yqg) kopVar.d.get());
            default:
                urk0 urk0Var2 = new urk0((byte) 4);
                apq apqVar = (apq) ykqVar.c;
                sd41 sd41VarO1 = apqVar.a.o0();
                c8o.l(sd41VarO1);
                fna fnaVar2 = new fna(sd41VarO1, (byte) 21);
                gw70 gw70VarB2 = apqVar.a.b();
                c8o.l(gw70VarB2);
                return new ldo(urk0Var2, fnaVar2, gw70VarB2, apqVar.N0, j2h1Var, iu30Var, (yqg) apqVar.d.get());
        }
    }
}
