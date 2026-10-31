package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xaa1 {
    public final String a;

    public xaa1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xaa1) && u890.j(this.a, ((xaa1) obj).a);
    }

    public final int hashCode() {
        return l1d.C(1) + (this.a.hashCode() * 31);
    }
}
