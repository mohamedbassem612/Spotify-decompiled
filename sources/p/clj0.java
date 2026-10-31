package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class clj0 implements elj0 {
    public final int a;

    public clj0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clj0) && this.a == ((clj0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
