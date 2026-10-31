package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hix0 implements iix0 {
    public final boolean a;
    public final long b;

    public hix0(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hix0)) {
            return false;
        }
        hix0 hix0Var = (hix0) obj;
        return this.a == hix0Var.a && this.b == hix0Var.b;
    }

    @Override // p.iix0
    public final long f() {
        return this.b;
    }

    @Override // p.iix0
    public final boolean g() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
