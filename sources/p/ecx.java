package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ecx {
    public final float a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ecx(float f, float f2) {
        this(f / f2);
        if (f <= 0.0f || f2 <= 0.0f) {
            eg.m("Aspect ratio width and height must be bigger than zero.");
            throw null;
        }
    }

    public ecx(float f) {
        this.a = f;
        if (f > 0.0f) {
            return;
        }
        hhg1.n("Aspect ratio value must be bigger than zero.");
        throw null;
    }

    public ecx(int i, int i2) {
        this(i, i2);
    }
}
