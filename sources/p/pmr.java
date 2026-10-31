package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pmr implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zmr b;

    public /* synthetic */ pmr(zmr zmrVar, byte b) {
        this.a = b;
        this.b = zmrVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        zmr zmrVar = this.b;
        switch (b) {
            case 0:
                xik xikVar = zmrVar.c1;
                wik wikVar = xikVar != null ? xikVar.t : null;
                boolean z = (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) ? false : true;
                if (wikVar == null || !z) {
                    return;
                }
                zmrVar.v(wikVar);
                xik xikVar2 = zmrVar.c1;
                if (xikVar2 != null) {
                    zmrVar.w(xikVar2.b);
                    return;
                } else {
                    u890.C("model");
                    throw null;
                }
            default:
                view.removeOnLayoutChangeListener(this);
                zmrVar.t();
                return;
        }
    }
}
