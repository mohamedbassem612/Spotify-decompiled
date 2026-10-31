package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k6g0 extends n6g0 {
    public final String a;

    public k6g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6g0) && u890.j(this.a, ((k6g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
