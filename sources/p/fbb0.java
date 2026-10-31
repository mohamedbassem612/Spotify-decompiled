package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fbb0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ezc b;
    public final /* synthetic */ haa0 c;

    public /* synthetic */ fbb0(ezc ezcVar, haa0 haa0Var, byte b) {
        this.a = b;
        this.b = ezcVar;
        this.c = haa0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        haa0 haa0Var = this.c;
        ezc ezcVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object objCollect = ezcVar.collect(new w0b0(vr20Var, haa0Var), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = ezcVar.collect(new om70(vr20Var, haa0Var, (byte) 15), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
