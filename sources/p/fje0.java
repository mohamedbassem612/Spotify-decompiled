package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fje0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aoe0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fje0(aoe0 aoe0Var, byte b) {
        super(3);
        this.a = b;
        this.b = aoe0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        aoe0 aoe0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = aoe0Var.b;
                uwr uwrVar = cbx.a;
                uwo1.e(str, null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, null, null, 2, false, new cjc0(1), 0, null, b0kVar, 0, 0, 1714);
                break;
            case 1:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = aoe0Var.a;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, null, cbx.d(b0kVar2).g, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1722);
                break;
            case 2:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = aoe0Var.b;
                uwr uwrVar3 = cbx.a;
                uwo1.e(str3, null, null, cbx.a(b0kVar3).b.b, null, null, 0, false, null, 0, null, b0kVar3, 0, 0, 2038);
                break;
            default:
                ((Number) obj3).intValue();
                uwo1.e(aoe0Var.a, null, null, 0L, null, null, 0, false, null, 0, null, (b0k) obj2, 0, 0, 2046);
                break;
        }
        return rih1Var;
    }
}
