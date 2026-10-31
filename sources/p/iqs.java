package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iqs implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ hur c;

    public /* synthetic */ iqs(hur hurVar, iu30 iu30Var, byte b) {
        this.a = b;
        this.c = hurVar;
        this.b = iu30Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        x891 x891Var = x891.a;
        hur hurVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                ((l6s) hurVar.c).p();
                iu30Var.invoke(x891Var);
                break;
            case 1:
                iu30Var.invoke(new w891(((l6s) hurVar.c).o()));
                break;
            case 2:
                iu30Var.invoke(new w891(((l6s) hurVar.c).o()));
                break;
            case 3:
                ((l6s) hurVar.c).p();
                iu30Var.invoke(x891Var);
                break;
            case 4:
                ((l6s) hurVar.c).p();
                iu30Var.invoke(x891Var);
                break;
            default:
                iu30Var.invoke(new w891(((l6s) hurVar.c).o()));
                break;
        }
    }

    public /* synthetic */ iqs(iu30 iu30Var, hur hurVar, byte b) {
        this.a = b;
        this.b = iu30Var;
        this.c = hurVar;
    }
}
