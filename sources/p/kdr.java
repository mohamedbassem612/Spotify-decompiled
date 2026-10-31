package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kdr implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mdr b;
    public final /* synthetic */ iu30 c;

    public /* synthetic */ kdr(mdr mdrVar, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = mdrVar;
        this.c = iu30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wb wbVarA;
        int i;
        wb wbVarC;
        int i2;
        byte b = this.a;
        iu30 iu30Var = this.c;
        mdr mdrVar = this.b;
        switch (b) {
            case 0:
                dc dcVar = mdrVar.b;
                if (dcVar != null && (wbVarA = dcVar.a()) != null && (i = wbVarA.b) != 0) {
                    iu30Var.invoke(new zb(i));
                    break;
                }
                break;
            default:
                dc dcVar2 = mdrVar.b;
                if (dcVar2 != null && (wbVarC = dcVar2.c()) != null && (i2 = wbVarC.b) != 0) {
                    iu30Var.invoke(new zb(i2));
                    break;
                }
                break;
        }
    }
}
