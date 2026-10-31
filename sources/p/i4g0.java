package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i4g0 implements j4g0 {
    public final String a;

    public i4g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4g0) && u890.j(this.a, ((i4g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
