package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ixc1 implements jfc1 {
    public double a;
    public boolean b;

    public final mpj0 h() {
        if (!this.b) {
            return null;
        }
        double d = this.a;
        this.a = 0.0d;
        this.b = false;
        return new lpj0(d);
    }

    public final mpj0 peek() {
        if (this.b) {
            return new lpj0(this.a);
        }
        return null;
    }

    public final void record(double d) {
        this.b = true;
        this.a += d;
    }
}
