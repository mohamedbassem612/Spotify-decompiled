package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b7s0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h7s0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7s0(h7s0 h7s0Var, byte b) {
        super(3);
        this.a = b;
        this.b = h7s0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h7s0 h7s0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = h7s0Var.b;
                uwr uwrVar = cbx.a;
                uwo1.e(str, null, cbx.d(b0kVar).h, cbx.a(b0kVar).b.a, null, null, 0, false, new zic0(1), 0, null, b0kVar, 0, 0, 1778);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = h7s0Var.c;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, new zic0(2), 0, null, b0kVar2, 0, 0, 1778);
                break;
        }
        return rih1Var;
    }
}
