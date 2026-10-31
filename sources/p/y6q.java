package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y6q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ y6q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yp71 a(pd71 pd71Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                r7q r7qVar2 = r7qVar;
                daq daqVar = r7qVar2.b;
                Context context = (Context) daqVar.x1.a;
                s7q s7qVar = (s7q) r7qVar2.d;
                return new yp71(context, (lzn0) s7qVar.U0.get(), (i8h1) daqVar.A5.get(), (jjz) s7qVar.g6.get(), (gw70) daqVar.d8.get(), xqu.a(s7qVar.nb), (joo) daqVar.n7.get(), pd71Var);
            default:
                thq thqVar = (thq) r7qVar;
                daq daqVar2 = thqVar.b;
                Context context2 = (Context) daqVar2.x1.a;
                teq teqVar = thqVar.c;
                return new yp71(context2, (lzn0) teqVar.i.get(), (i8h1) daqVar2.A5.get(), (jjz) teqVar.V1.get(), (gw70) daqVar2.d8.get(), xqu.a(teqVar.a.Ug), (joo) daqVar2.n7.get(), pd71Var);
        }
    }
}
