package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zn60 {
    public final c9 a;
    public final yn60 b;

    public zn60(c9 c9Var, yn60 yn60Var, int i) {
        c9Var = (i & 1) != 0 ? fg91.b : c9Var;
        yn60Var = (i & 2) != 0 ? wn60.a : yn60Var;
        this.a = c9Var;
        this.b = yn60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn60)) {
            return false;
        }
        zn60 zn60Var = (zn60) obj;
        return this.a.equals(zn60Var.a) && this.b.equals(zn60Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
