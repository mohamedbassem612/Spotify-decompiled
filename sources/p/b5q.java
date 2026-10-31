package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b5q implements yko {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ b5q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final dlo a(String str, iu30 iu30Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = (v5q) thqVar.c;
                return new dlo((lko) v5qVar.n6.get(), (ijr) v5qVar.o6.get(), (q8n) thqVar.b.E1.get(), str, iu30Var);
            default:
                r7q r7qVar2 = r7qVar;
                teq teqVar = r7qVar2.d;
                return new dlo((lko) teqVar.v6.get(), (ijr) teqVar.n5.get(), (q8n) r7qVar2.b.E1.get(), str, iu30Var);
        }
    }
}
