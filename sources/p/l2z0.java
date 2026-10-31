package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l2z0 implements o2z0 {
    public final String a;

    public l2z0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2z0) && u890.j(this.a, ((l2z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
