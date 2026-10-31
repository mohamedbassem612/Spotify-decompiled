package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ruu implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ suu b;

    public /* synthetic */ ruu(suu suuVar, byte b) {
        this.a = b;
        this.b = suuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        suu suuVar = this.b;
        switch (b) {
            case 0:
                suuVar.f.b(suuVar.a.b().doOnSuccess(nm.R0).ignoreElement().n(suuVar.b).subscribe(new f72(new a6n(suuVar, (byte) 14), (byte) 15)));
                break;
            default:
                String strT = pro1.t("downloadOver3g");
                suuVar.d.h(strT);
                suuVar.e.a(new fx7(strT));
                break;
        }
    }
}
