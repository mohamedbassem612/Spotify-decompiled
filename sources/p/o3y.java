package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o3y implements t3y {
    public final boolean a;
    public final boolean b;

    public o3y(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3y)) {
            return false;
        }
        o3y o3yVar = (o3y) obj;
        return this.a == o3yVar.a && this.b == o3yVar.b;
    }

    @Override // p.t3y
    public final boolean f() {
        return this.a;
    }

    @Override // p.t3y
    public final int g() {
        return 2131955938;
    }

    @Override // p.t3y
    public final boolean getEnabled() {
        return this.b;
    }

    @Override // p.t3y
    public final int h() {
        return 5;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
