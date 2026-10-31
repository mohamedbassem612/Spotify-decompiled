package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nvo0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pvo0 b;

    public /* synthetic */ nvo0(pvo0 pvo0Var, byte b) {
        this.a = b;
        this.b = pvo0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        pvo0 pvo0Var = this.b;
        switch (b) {
            case 0:
                pvo0Var.b.onNext(qc50.a);
                break;
            default:
                pvo0Var.b.onNext(ned1.a);
                break;
        }
    }
}
