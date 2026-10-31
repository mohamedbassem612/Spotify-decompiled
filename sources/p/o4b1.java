package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o4b1 {
    public final boolean a;
    public final boolean b;

    public o4b1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4b1)) {
            return false;
        }
        o4b1 o4b1Var = (o4b1) obj;
        return this.a == o4b1Var.a && this.b == o4b1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
