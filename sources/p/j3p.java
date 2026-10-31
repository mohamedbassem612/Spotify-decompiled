package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j3p implements fox0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ j3p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final iox0 a(d0r d0rVar, o3r o3rVar) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                s3p s3pVar = (s3p) ((b2p) jly0Var).c;
                lzn0 lzn0VarC = ((i7c) s3pVar.X0).c();
                c8o.l(lzn0VarC);
                gw70 gw70VarB = ((i7c) s3pVar.X0).b();
                c8o.l(gw70VarB);
                ycm ycmVar = (ycm) ((i7c) s3pVar.X0).n.get();
                c8o.l(ycmVar);
                myq0 myq0VarE = s3pVar.e();
                Flowable flowable = (Flowable) ((i7c) s3pVar.X0).E.get();
                c8o.l(flowable);
                i7c i7cVar = (i7c) s3pVar.X0;
                fln0 fln0Var = (fln0) i7cVar.a0.get();
                c8o.l(fln0Var);
                kzp0 kzp0Var = (kzp0) i7cVar.b0.get();
                c8o.l(kzp0Var);
                jln0 jln0Var = (jln0) i7cVar.Z.get();
                c8o.l(jln0Var);
                return new iox0(lzn0VarC, gw70VarB, ycmVar, myq0VarE, flowable, new l0x0(fln0Var, kzp0Var, jln0Var, (byte) 8), d0rVar, o3rVar);
            default:
                d4p d4pVar = (d4p) ((b2p) jly0Var).c;
                lzn0 lzn0VarI = d4pVar.a.i();
                c8o.l(lzn0VarI);
                gw70 gw70VarB2 = d4pVar.a.b();
                c8o.l(gw70VarB2);
                ycm ycmVarD = d4pVar.a.d();
                c8o.l(ycmVarD);
                myq0 myq0VarE2 = d4pVar.e();
                Flowable flowable2 = (Flowable) d4pVar.a.y.get();
                c8o.l(flowable2);
                return new iox0(lzn0VarI, gw70VarB2, ycmVarD, myq0VarE2, flowable2, d4pVar.h(), d0rVar, o3rVar);
        }
    }
}
