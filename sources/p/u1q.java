package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u1q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ u1q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final h001 a(String str, lik1 lik1Var) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                i2q i2qVar = (i2q) jly0Var;
                daq daqVar = i2qVar.a;
                Context context = (Context) daqVar.x1.a;
                teq teqVar = i2qVar.b;
                lzn0 lzn0Var = (lzn0) teqVar.i.get();
                hyy0 hyy0VarD3 = teqVar.d3();
                kt91 kt91Var = (kt91) daqVar.f8.get();
                ziq ziqVar = teqVar.a;
                z201 z201Var = (z201) ziqVar.g8.get();
                btf1 btf1Var = (btf1) daqVar.Ep.get();
                wml wmlVarX = daqVar.x();
                ycm ycmVar = (ycm) i2qVar.c.Z0.get();
                return new h001(context, lzn0Var, hyy0VarD3, kt91Var, z201Var, btf1Var, wmlVarX, ycmVar, (lgq) ziqVar.Kf.get(), (mgq) ziqVar.Lf.get(), (h4q) teqVar.u1.get(), lik1Var, str);
            default:
                thq thqVar = (thq) jly0Var;
                daq daqVar2 = thqVar.b;
                Context context2 = (Context) daqVar2.x1.a;
                teq teqVar2 = thqVar.c;
                lzn0 lzn0Var2 = (lzn0) teqVar2.i.get();
                hyy0 hyy0VarD4 = teqVar2.d3();
                kt91 kt91Var2 = (kt91) daqVar2.f8.get();
                ziq ziqVar2 = teqVar2.a;
                z201 z201Var2 = (z201) ziqVar2.g8.get();
                btf1 btf1Var2 = (btf1) daqVar2.Ep.get();
                wml wmlVarX2 = daqVar2.x();
                ycm ycmVar2 = (ycm) teqVar2.b.P.get();
                return new h001(context2, lzn0Var2, hyy0VarD4, kt91Var2, z201Var2, btf1Var2, wmlVarX2, ycmVar2, (lgq) ziqVar2.Kf.get(), (mgq) ziqVar2.Lf.get(), (h4q) teqVar2.u1.get(), lik1Var, str);
        }
    }
}
