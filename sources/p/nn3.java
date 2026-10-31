package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nn3 extends qxd0 {
    public final String d;
    public final mfu e;

    public nn3(String str, mfu mfuVar) {
        this.d = str;
        this.e = mfuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn3)) {
            return false;
        }
        nn3 nn3Var = (nn3) obj;
        return u890.j(this.d, nn3Var.d) && this.e.equals(nn3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
