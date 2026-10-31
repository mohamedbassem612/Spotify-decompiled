package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nes implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nwr b;

    public /* synthetic */ nes(nwr nwrVar, byte b) {
        this.a = b;
        this.b = nwrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        iu30 iu30Var;
        iu30 iu30Var2;
        byte b = this.a;
        nwr nwrVar = this.b;
        switch (b) {
            case 0:
                bro1 bro1Var = (bro1) nwrVar.f;
                if (bro1Var != null && (iu30Var = nwrVar.b) != null) {
                    iu30Var.invoke(new xis0(bro1Var));
                    break;
                }
                break;
            default:
                bro1 bro1Var2 = (bro1) nwrVar.g;
                if (bro1Var2 != null && (iu30Var2 = nwrVar.b) != null) {
                    iu30Var2.invoke(new xis0(bro1Var2));
                    break;
                }
                break;
        }
    }
}
