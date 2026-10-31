package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gan implements ian {
    public final long a;
    public final boolean b;
    public final boolean c;

    public gan(long j, boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        boolean z2 = (i & 4) != 0;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // p.ian
    public final long a() {
        return this.a;
    }

    @Override // p.ian
    public final boolean b() {
        return this.c;
    }

    @Override // p.ian
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gan)) {
            return false;
        }
        gan ganVar = (gan) obj;
        return this.a == ganVar.a && this.b == ganVar.b && this.c == ganVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
