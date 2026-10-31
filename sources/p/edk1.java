package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class edk1 extends hdk1 {
    public float[] g;
    public mhl h;

    @Override // p.hdk1
    public final void c(mhl mhlVar) {
        this.h = mhlVar;
    }

    @Override // p.hdk1
    public final void d(View view, float f) {
        float[] fArr = this.g;
        fArr[0] = a(f);
        gyo1.P(this.h, view, fArr);
    }
}
