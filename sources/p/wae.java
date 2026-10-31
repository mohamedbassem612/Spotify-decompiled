package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wae implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ db b;

    public /* synthetic */ wae(db dbVar, byte b) {
        this.a = b;
        this.b = dbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        db dbVar = this.b;
        switch (b) {
            case 0:
                dbVar.invoke(yae.a);
                break;
            default:
                dbVar.invoke(yae.b);
                break;
        }
    }
}
