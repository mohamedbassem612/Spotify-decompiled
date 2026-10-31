package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rlb {
    public final String a;
    public final boolean b;

    public rlb(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rlb)) {
            return false;
        }
        rlb rlbVar = (rlb) obj;
        return u890.j(this.a, rlbVar.a) && this.b == rlbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
