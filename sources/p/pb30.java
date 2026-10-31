package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pb30 {
    public final kq61 a;
    public final String b;

    public pb30(kq61 kq61Var, String str) {
        this.a = kq61Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb30)) {
            return false;
        }
        pb30 pb30Var = (pb30) obj;
        return this.a.equals(pb30Var.a) && this.b.equals(pb30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
