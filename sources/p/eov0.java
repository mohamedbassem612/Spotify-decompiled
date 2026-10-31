package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eov0 {
    public final String a;
    public final int b;
    public final boolean c;

    public eov0(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eov0)) {
            return false;
        }
        eov0 eov0Var = (eov0) obj;
        return this.a.equals(eov0Var.a) && this.b == eov0Var.b && this.c == eov0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
