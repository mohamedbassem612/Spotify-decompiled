package p;

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ntd {
    public final TimeInterpolator a;
    public final TimeInterpolator b;

    public ntd() {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        OvershootInterpolator overshootInterpolator = new OvershootInterpolator(2.0f);
        this.a = accelerateInterpolator;
        this.b = overshootInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntd)) {
            return false;
        }
        ntd ntdVar = (ntd) obj;
        return this.a.equals(ntdVar.a) && this.b.equals(ntdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (Long.hashCode(1000L) * 31)) * 31);
    }
}
