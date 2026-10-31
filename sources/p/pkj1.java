package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pkj1 {
    public static final pkj1 h = new pkj1(-1, -1, -1, 1.0f, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final int e;
    public final int f;
    public final int g;

    public pkj1(int i, int i2, int i3, float f, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkj1)) {
            return false;
        }
        pkj1 pkj1Var = (pkj1) obj;
        return this.a == pkj1Var.a && this.b == pkj1Var.b && this.c == pkj1Var.c && this.d == pkj1Var.d && this.e == pkj1Var.e && this.f == pkj1Var.f && this.g == pkj1Var.g;
    }

    public final int hashCode() {
        return ((((((((((Float.floatToIntBits(this.d) + ((((((((217 + this.a) * 31) + 1) * 31) + this.b) * 31) + this.c) * 31)) * 31) - 1) * 31) - 1) * 961) + this.e) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderSettings{bitrate=");
        sb.append(this.a);
        sb.append(", bitrateMode=1, profile=");
        sb.append(this.b);
        sb.append(", level=");
        sb.append(this.c);
        sb.append(", iFrameIntervalSeconds=");
        sb.append(this.d);
        sb.append(", operatingRate=-1, priority=-1, repeatPreviousFrameIntervalUs=-1, maxBFrames=");
        sb.append(this.e);
        sb.append(", numNonBidirectionalTemporalLayers=");
        sb.append(this.f);
        sb.append(", numBidirectionalTemporalLayers=");
        return l1d.o(sb, this.g, '}');
    }
}
