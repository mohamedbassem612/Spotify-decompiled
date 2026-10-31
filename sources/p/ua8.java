package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ua8 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ uv11 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua8(uny unyVar, Function0 function0, uv11 uv11Var) {
        super(0);
        this.a = (byte) 1;
        this.b = function0;
        this.c = uv11Var;
    }

    public final Object invoke() {
        byte b = this.a;
        uv11 uv11Var = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                wa8 wa8Var = (wa8) function0.invoke();
                tv11 tv11Var = uv11Var.f;
                return ywo1.t(wa8.a(wa8Var, tv11Var != null ? tv11Var.a : null), uv11Var.d);
            case 1:
                wqy wqyVar = (wqy) function0.invoke();
                tv11 tv11Var2 = uv11Var.f;
                String str = tv11Var2 != null ? tv11Var2.a : null;
                String str2 = wqyVar.a;
                return new tgm(uv11Var.d, wqyVar.j != null, false, wqyVar.f, wqyVar.b, false, false, (yh10) null, false, false, 2, !wqyVar.e, false, false, false, false, (iu30) null, wqyVar.g, false, (g371) null, wqyVar.k, false, str, (iu30) null, (p860) null, (mgo0) null, false, false, -43001964, 1);
            default:
                z8z z8zVar = (z8z) function0.invoke();
                tv11 tv11Var3 = uv11Var.f;
                return zpn1.x(z8z.a(z8zVar, tv11Var3 != null ? tv11Var3.a : null), uv11Var.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua8(Function0 function0, uv11 uv11Var, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
        this.c = uv11Var;
    }
}
