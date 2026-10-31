package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n8j extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ecu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8j(ecu0 ecu0Var, byte b) {
        super(3);
        this.a = b;
        this.b = ecu0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ecu0 ecu0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = ecu0Var.b;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                uwr uwrVar = cbx.a;
                uwo1.e(str2, null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, null, null, 0, false, null, 0, null, b0kVar, 0, 0, 2034);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(tro1.B(ecu0Var.a, b0kVar2, 0), null, null, 0L, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2046);
                break;
        }
        return rih1Var;
    }
}
