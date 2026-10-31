package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jqp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ jqp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final y1f0 a(xnb1 xnb1Var) {
        byte b = this.a;
        blp blpVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                bza0 bza0Var = (bza0) ((a0f0) ((t7p) ((dlp) blpVar).c).b).d.get();
                c8o.l(bza0Var);
                return new y1f0(xnb1Var, bza0Var);
            default:
                bza0 bza0Var2 = (bza0) ((x0f0) ((g1i) blpVar.c).b).d.get();
                c8o.l(bza0Var2);
                return new y1f0(xnb1Var, bza0Var2);
        }
    }
}
