package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i6d0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ ucd c;
    public final /* synthetic */ Context d;

    public /* synthetic */ i6d0(mr20 mr20Var, ucd ucdVar, Context context, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = ucdVar;
        this.d = context;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Context context = this.d;
        ucd ucdVar = this.c;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mr20Var.collect(new h6d0(vr20Var, ucdVar, context, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = mr20Var.collect(new h6d0(vr20Var, ucdVar, context, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
