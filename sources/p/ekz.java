package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ekz implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dkz b;

    public /* synthetic */ ekz(dkz dkzVar, byte b) {
        this.a = b;
        this.b = dkzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
