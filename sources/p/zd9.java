package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zd9 {
    public final boolean a;
    public final boolean b;

    public zd9(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd9)) {
            return false;
        }
        zd9 zd9Var = (zd9) obj;
        return this.a == zd9Var.a && this.b == zd9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
