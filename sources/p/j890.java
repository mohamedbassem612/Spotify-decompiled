package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j890 implements l890 {
    public final /* synthetic */ float a;

    public j890(float f) {
        this.a = f;
    }

    @Override // p.l890
    public final float q(float f, float f2, float f3) {
        return this.a;
    }

    public final String toString() {
        return String.format(Locale.US, "point(%.2f)", Float.valueOf(this.a));
    }
}
