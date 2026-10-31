package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y4g1 {
    public final String a;

    public y4g1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4g1) && u890.j(this.a, ((y4g1) obj).a);
    }

    public final int hashCode() {
        return l1d.C(2) + (this.a.hashCode() * 31);
    }
}
