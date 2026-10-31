package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kus implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kus(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                mus musVar = (mus) obj;
                iu30 iu30VarA = mus.a(musVar);
                if (iu30VarA != null) {
                    iu30VarA.invoke(musVar);
                }
                break;
            default:
                ((zb91) obj).d();
                break;
        }
    }
}
