package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sqr implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ err b;

    public /* synthetic */ sqr(err errVar, byte b) {
        this.a = b;
        this.b = errVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        lyn lynVar = lyn.a;
        err errVar = this.b;
        switch (b) {
            case 0:
                errVar.Z.invoke(lynVar);
                break;
            default:
                errVar.Z.invoke(lynVar);
                break;
        }
    }
}
