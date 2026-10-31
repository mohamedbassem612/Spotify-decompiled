package p;

import android.widget.Magnifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yct0 extends xct0 {
    @Override // p.xct0, p.vct0
    public final void a(float f, long j, long j2) {
        if (!Float.isNaN(f)) {
            ((Magnifier) this.a).setZoom(f);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = (Magnifier) this.a;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
