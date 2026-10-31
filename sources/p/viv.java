package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class viv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ teb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ viv(teb tebVar, byte b) {
        super(1);
        this.a = b;
        this.b = tebVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        teb tebVar = this.b;
        switch (b) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String strG = tebVar.g();
                if (strG != null) {
                    bundle.putString("selectedTabId", strG);
                }
                return rih1.a;
            default:
                ito itoVar = (ito) obj;
                g23 g23Var = (g23) tebVar.h;
                return g23Var != null ? g23Var.l(itoVar) : itoVar.f;
        }
    }
}
