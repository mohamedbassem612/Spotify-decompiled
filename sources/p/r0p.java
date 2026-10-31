package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r0p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ r0p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ec7 a(String str, String str2, String str3) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x0p x0pVar = (x0p) ((fwo) jly0Var).c;
                iac0 iac0Var = x0pVar.c.d.c;
                c8o.m(iac0Var);
                return new ec7(iac0Var, (ttm0) x0pVar.l.get(), str, str2, str3);
            case 1:
                yxo yxoVar = (yxo) ((fwo) jly0Var).c;
                iac0 iac0Var2 = ((q7r0) yxoVar.e).d.c;
                c8o.m(iac0Var2);
                return new ec7(iac0Var2, (ttm0) yxoVar.P0.get(), str, str2, str3);
            default:
                voa voaVar = (voa) ((fwo) jly0Var).c;
                iac0 iac0Var3 = ((q7r0) voaVar.c).d.c;
                c8o.m(iac0Var3);
                return new ec7(iac0Var3, (ttm0) ((jly0) voaVar.o).get(), str, str2, str3);
        }
    }
}
