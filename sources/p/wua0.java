package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wua0 {
    public final Float a;
    public dlv b;

    public wua0(Float f, dlv dlvVar) {
        this.a = f;
        this.b = dlvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wua0)) {
            return false;
        }
        wua0 wua0Var = (wua0) obj;
        return wua0Var.a.equals(this.a) && u890.j(wua0Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + kaa0.f(0, this.a.hashCode() * 31, 31);
    }
}
