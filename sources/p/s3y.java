package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s3y implements t3y {
    public final boolean a;
    public final boolean b;

    public s3y(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3y)) {
            return false;
        }
        s3y s3yVar = (s3y) obj;
        return this.a == s3yVar.a && this.b == s3yVar.b;
    }

    @Override // p.t3y
    public final boolean f() {
        return this.a;
    }

    @Override // p.t3y
    public final int g() {
        return 2131955941;
    }

    @Override // p.t3y
    public final boolean getEnabled() {
        return this.b;
    }

    @Override // p.t3y
    public final int h() {
        return 2;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
