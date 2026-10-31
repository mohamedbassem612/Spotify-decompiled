package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b3a0 implements g3a0 {
    public final String a;
    public final ee9 b;
    public final int c;

    public b3a0(int i, String str, ee9 ee9Var) {
        this.a = str;
        this.b = ee9Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3a0)) {
            return false;
        }
        b3a0 b3a0Var = (b3a0) obj;
        return this.a.equals(b3a0Var.a) && this.b.equals(b3a0Var.b) && this.c == b3a0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
