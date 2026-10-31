package p;

import android.graphics.Typeface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ghd extends g2p1 {
    public final Typeface c;
    public final fhd d;
    public boolean e;

    public ghd(fhd fhdVar, Typeface typeface) {
        this.c = typeface;
        this.d = fhdVar;
    }

    public final void H(int i) {
        if (this.e) {
            return;
        }
        this.d.d(this.c);
    }

    public final void I(Typeface typeface, boolean z) {
        if (this.e) {
            return;
        }
        this.d.d(typeface);
    }
}
