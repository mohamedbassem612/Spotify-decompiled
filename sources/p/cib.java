package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cib implements eib {
    public final int a;

    public cib(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cib) && this.a == ((cib) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
