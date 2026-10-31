package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fu80 extends rc2 {
    public final String d;
    public final int e;
    public final int f;
    public final int g;

    public fu80(int i, int i2, int i3, String str) {
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu80)) {
            return false;
        }
        fu80 fu80Var = (fu80) obj;
        return u890.j(this.d, fu80Var.d) && this.e == fu80Var.e && this.f == fu80Var.f && this.g == fu80Var.g;
    }

    public final int hashCode() {
        return l1d.C(this.g) + ab80.k(this.f, kaa0.f(this.e, this.d.hashCode() * 31, 31), 31);
    }
}
