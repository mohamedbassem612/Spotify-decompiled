package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class udg implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vdg b;

    public /* synthetic */ udg(vdg vdgVar, byte b) {
        this.a = b;
        this.b = vdgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        vdg vdgVar = this.b;
        switch (b) {
            case 0:
                syf syfVar = vdgVar.e;
                if (syfVar != null) {
                    syfVar.invoke(tdg.c);
                }
                break;
            default:
                syf syfVar2 = vdgVar.e;
                if (syfVar2 != null) {
                    syfVar2.invoke(tdg.b);
                }
                break;
        }
    }
}
