package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xg41 implements wg41 {
    public final int a;

    public xg41(int i) {
        this.a = i;
    }

    @Override // p.wg41
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg41) && this.a == ((xg41) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
