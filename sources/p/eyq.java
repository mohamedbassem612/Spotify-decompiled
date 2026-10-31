package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eyq extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ pyq b;
    public final /* synthetic */ vzq0 c;
    public final /* synthetic */ xxq d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyq(pyq pyqVar, vzq0 vzq0Var, xxq xxqVar, iu30 iu30Var, int i) {
        super(2);
        this.b = pyqVar;
        this.c = vzq0Var;
        this.d = xxqVar;
        this.e = iu30Var;
        this.f = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                g2p1.f(czo1.p(i | 1), (b0k) obj, this.d, this.b, this.e, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                g2p1.i(czo1.p(i | 1), (b0k) obj, this.d, this.b, this.e, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyq(vzq0 vzq0Var, pyq pyqVar, xxq xxqVar, iu30 iu30Var, int i) {
        super(2);
        this.c = vzq0Var;
        this.b = pyqVar;
        this.d = xxqVar;
        this.e = iu30Var;
        this.f = i;
    }
}
