package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z6s implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goq b;

    public /* synthetic */ z6s(goq goqVar, byte b) {
        this.a = b;
        this.b = goqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        goq goqVar = this.b;
        switch (b) {
            case 0:
                ((y0o) goqVar.c).invoke(brg0.b);
                break;
            default:
                ((y0o) goqVar.c).invoke(brg0.a);
                break;
        }
    }
}
