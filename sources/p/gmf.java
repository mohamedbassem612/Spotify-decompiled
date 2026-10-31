package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gmf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mmf b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gmf(mmf mmfVar, String str, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = mmfVar;
        this.c = str;
        this.d = ven0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                l811 l811Var = new l811();
                l811Var.a = true;
                ven0 ven0Var = this.d;
                mmf mmfVar = this.b;
                fmf fmfVar = new fmf(l811Var, mmfVar, this.c, ven0Var, (byte) 0);
                mmfVar.P0.getLifecycle().a(fmfVar);
                return new ht0(mmfVar, fmfVar, (byte) 11);
            default:
                mmf mmfVar2 = this.b;
                r630 r630Var = mmfVar2.d;
                String str = this.c;
                i430 i430VarC = r630Var.c(str);
                Boolean boolValueOf = Boolean.valueOf(i430VarC != null && i430VarC.c);
                ven0 ven0Var2 = this.d;
                ven0Var2.setValue(boolValueOf);
                hmf hmfVar = new hmf(mmfVar2, ven0Var2, (byte) 0);
                r630Var.b(str, hmfVar);
                return new sg(mmfVar2, str, hmfVar, (byte) 4);
        }
    }
}
