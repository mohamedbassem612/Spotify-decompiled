package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a9j1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a9j1(byte b, String str, Function0 function0, boolean z) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = z;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                x340 x340Var = (b0k) obj2;
                Function0 function0 = this.d;
                boolean zG = x340Var.g(function0);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new sah1(function0, (byte) 26);
                    x340Var.s0(objT);
                }
                qim0 qim0VarN = anm1.N(czd1.b, bin.x(qim0VarF, this.c, null, null, null, (Function0) objT, 14));
                uwr uwrVar = cbx.a;
                uwo1.e(this.b, qim0VarN, cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, new cjc0(2), 0, null, x340Var, 0, 0, 1776);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = Uri.parse(this.b);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                ebp1.a(uri, bin.x(nim0.a, this.c, null, null, null, this.d, 14), null, new p3v(40.0f), b0kVar, 0, 4);
                break;
        }
        return rih1Var;
    }
}
