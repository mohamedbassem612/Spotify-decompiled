package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gix0 implements iix0 {
    public final boolean a;
    public final long b;
    public final long c;

    public gix0(long j, long j2, boolean z) {
        this.a = z;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gix0)) {
            return false;
        }
        gix0 gix0Var = (gix0) obj;
        return this.a == gix0Var.a && this.b == gix0Var.b && this.c == gix0Var.c;
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
        return Long.hashCode(this.c) + cy30.f(Boolean.hashCode(this.a) * 31, this.b, 31);
    }
}
