package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h231 extends i231 {
    public final int a;
    public final Throwable b;

    public h231(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // p.i231
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h231)) {
            return false;
        }
        h231 h231Var = (h231) obj;
        return this.a == h231Var.a && this.b.equals(h231Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
