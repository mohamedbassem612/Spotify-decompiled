package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zg41 implements wg41 {
    public final int a;

    public zg41(int i) {
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
        return (obj instanceof zg41) && this.a == ((zg41) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
