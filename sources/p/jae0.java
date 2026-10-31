package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jae0 implements i7e0 {
    public final hwq a;

    public jae0(hwq hwqVar) {
        this.a = hwqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jae0) && this.a.equals(((jae0) obj).a);
    }

    @Override // p.i7e0
    public final hwq getData() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
