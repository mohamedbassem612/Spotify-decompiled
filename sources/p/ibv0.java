package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ibv0 {
    public final String a;
    public final int b;
    public final int c;

    public ibv0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibv0)) {
            return false;
        }
        ibv0 ibv0Var = (ibv0) obj;
        return this.a.equals(ibv0Var.a) && this.b == ibv0Var.b && this.c == ibv0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
