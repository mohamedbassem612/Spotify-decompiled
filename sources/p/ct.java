package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ct implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ pt c;
    public final /* synthetic */ ss d;
    public final /* synthetic */ ts e;

    public /* synthetic */ ct(mr20 mr20Var, pt ptVar, ss ssVar, ts tsVar, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = ptVar;
        this.d = ssVar;
        this.e = tsVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mr20 mr20Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object objCollect = mr20Var.collect(new bt(vr20Var, this.c, this.d, this.e, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = mr20Var.collect(new bt(vr20Var, this.c, this.d, this.e, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
