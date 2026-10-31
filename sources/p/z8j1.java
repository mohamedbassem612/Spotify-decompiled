package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z8j1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uoa b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ o2u0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8j1(uoa uoaVar, boolean z, boolean z2, o2u0 o2u0Var, byte b) {
        super(0);
        this.a = b;
        this.b = uoaVar;
        this.c = z;
        this.d = z2;
        this.e = o2u0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o2u0 o2u0Var = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        uoa uoaVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uoaVar.p(z2 ? 3 : 1);
                if (!z) {
                    uoaVar.f();
                } else if (uoaVar.e() != null) {
                    uoaVar.l();
                } else {
                    uoaVar.g(o2u0Var);
                }
                break;
            default:
                uoaVar.p(z2 ? 3 : 1);
                if (!z) {
                    uoaVar.f();
                } else if (uoaVar.e() != null) {
                    uoaVar.l();
                } else {
                    uoaVar.g(o2u0Var);
                }
                break;
        }
        return rih1Var;
    }
}
