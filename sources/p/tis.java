package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tis implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vis b;

    public /* synthetic */ tis(vis visVar, byte b) {
        this.a = b;
        this.b = visVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        vis visVar = this.b;
        switch (b) {
            case 0:
                visVar.f.invoke(q7x0.e);
                break;
            default:
                visVar.f.invoke(q7x0.d);
                break;
        }
    }
}
