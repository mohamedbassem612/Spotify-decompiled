package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class buo0 extends puo0 {
    public final String a;
    public final hr90 b;

    public buo0(String str, hr90 hr90Var) {
        this.a = str;
        this.b = hr90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buo0)) {
            return false;
        }
        buo0 buo0Var = (buo0) obj;
        return u890.j(this.a, buo0Var.a) && this.b == buo0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
