package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nhy {
    public final String a;
    public final boolean b;

    public nhy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhy)) {
            return false;
        }
        nhy nhyVar = (nhy) obj;
        return u890.j(this.a, nhyVar.a) && this.b == nhyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
