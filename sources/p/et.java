package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class et extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ et(pt ptVar, byte b) {
        super(1);
        this.a = b;
        this.b = ptVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ts tsVar = (ts) obj;
                pt ptVar = this.b;
                kly0 kly0Var = (kly0) ptVar.d;
                ss ssVar = tsVar.a;
                if (ssVar instanceof rs) {
                    return new ct(rqt0.u(new mt(((ck) kly0Var.get()).g, (byte) 0)), ptVar, ssVar, tsVar, (byte) 0);
                }
                if (ssVar instanceof qs) {
                    return new ct(rqt0.u(new mt(((ck) kly0Var.get()).g, (byte) 0)), ptVar, ssVar, tsVar, (byte) 1);
                }
                eg.o();
                return null;
            default:
                rtb0.b((rtb0) obj, 2, ft.d, new j2i(1731301028, new kt(this.b, (byte) 1), true), 4);
                return rih1.a;
        }
    }
}
