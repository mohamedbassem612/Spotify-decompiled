package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iqd0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pee0 b;

    public /* synthetic */ iqd0(pee0 pee0Var, byte b) {
        this.a = b;
        this.b = pee0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        pee0 pee0Var = this.b;
        switch (b) {
            case 0:
                pee0Var.accept(new c0p0((ou80) null));
                break;
            case 1:
                pee0Var.accept(new yzo0((ou80) null));
                break;
            case 2:
                pee0Var.accept(new c0p0((ou80) null));
                break;
            case 3:
                pee0Var.accept(new yzo0((ou80) null));
                break;
            default:
                pee0Var.accept(new yzo0((ou80) null));
                break;
        }
    }
}
