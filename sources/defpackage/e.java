package defpackage;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import p.b0k;
import p.bqn1;
import p.c380;
import p.czo1;
import p.hab0;
import p.hso1;
import p.i3p1;
import p.k2g1;
import p.m37;
import p.mue1;
import p.pap1;
import p.ppo1;
import p.qim0;
import p.rih1;
import p.vu30;
import p.x760;
import p.xto1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(c380 c380Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        c380 c380Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                f.a(c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 1:
                pap1.k(c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 2:
                m37.a(c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 3:
                ppo1.a(c380Var, qim0Var, b0kVar, czo1.p(9));
                break;
            case 4:
                hso1.i(c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 5:
                xto1.h(c380Var, qim0Var, b0kVar, czo1.p(49));
                break;
            case 6:
                bqn1.i(c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 7:
                i3p1.i(c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 8:
                mue1.m(c380Var, qim0Var, b0kVar, czo1.p(3505));
                break;
            case 9:
                x760.e(c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
            case 10:
                k2g1.d(c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                k2g1.d(c380Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
