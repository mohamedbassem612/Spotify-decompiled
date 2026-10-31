package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v1s implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x1s b;
    public final /* synthetic */ si70 c;

    public /* synthetic */ v1s(x1s x1sVar, si70 si70Var, byte b) {
        this.a = b;
        this.b = x1sVar;
        this.c = si70Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        si70 si70Var = this.c;
        x1s x1sVar = this.b;
        switch (b) {
            case 0:
                x1sVar.e.a(new ymo0(si70Var.d, 5));
                x1sVar.a(si70Var, true);
                break;
            default:
                x1sVar.e.a(new zmo0(si70Var.d, 5));
                x1sVar.a(si70Var, true);
                break;
        }
    }
}
