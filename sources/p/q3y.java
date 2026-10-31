package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q3y implements t3y {
    public final boolean a;
    public final boolean b;

    public q3y(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3y)) {
            return false;
        }
        q3y q3yVar = (q3y) obj;
        return this.a == q3yVar.a && this.b == q3yVar.b;
    }

    @Override // p.t3y
    public final boolean f() {
        return this.a;
    }

    @Override // p.t3y
    public final int g() {
        return 0;
    }

    @Override // p.t3y
    public final boolean getEnabled() {
        return this.b;
    }

    @Override // p.t3y
    public final int h() {
        return 1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
