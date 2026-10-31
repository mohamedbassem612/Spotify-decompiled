package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u290 implements cnh0 {
    public final /* synthetic */ akp a;
    public final /* synthetic */ swm0 b;
    public final /* synthetic */ ckp c;
    public final /* synthetic */ bkp d;
    public final /* synthetic */ Context e;

    public u290(akp akpVar, swm0 swm0Var, ckp ckpVar, bkp bkpVar, Context context) {
        this.a = akpVar;
        this.b = swm0Var;
        this.c = ckpVar;
        this.d = bkpVar;
        this.e = context;
    }

    @Override // p.cnh0
    public final List a(l270 l270Var, qma qmaVar) {
        yt91 yt91Var = new yt91(new bih1(chp.c(this.a.a).a.d(), qmaVar.b, (byte) 27), this.b, qmaVar.z1, (byte) 18);
        return p7h.M(new anh0[]{this.c.a(yt91Var, l270Var, qmaVar), this.d.a(yt91Var, qmaVar), new nde0(this.e)});
    }
}
