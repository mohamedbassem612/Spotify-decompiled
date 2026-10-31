package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ovv0 implements svv0 {
    public final int a;

    public ovv0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovv0) && this.a == ((ovv0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
