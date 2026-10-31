package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d9u0 extends q9u0 {
    public final String a;
    public final boolean b;

    public d9u0(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d9u0)) {
            return false;
        }
        d9u0 d9u0Var = (d9u0) obj;
        return d9u0Var.b == this.b && d9u0Var.a.equals(this.a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pause{featureIdentifier=");
        sb.append(this.a);
        sb.append(", systemInitiated=");
        return f4i1.g(sb, this.b, '}');
    }
}
