package p;

import android.content.DialogInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vqt0 implements DialogInterface.OnCancelListener {
    public static final vqt0 b = new vqt0((byte) 0);
    public final /* synthetic */ byte a;

    public vqt0(mzr0 mzr0Var) {
        this.a = (byte) 2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 1:
                m2l.a.remove("gaia.content_not_supported");
                dialogInterface.dismiss();
                break;
        }
    }

    public /* synthetic */ vqt0(byte b2) {
        this.a = b2;
    }

    private final void a(DialogInterface dialogInterface) {
    }

    private final void b(DialogInterface dialogInterface) {
    }
}
