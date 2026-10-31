package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class si60 implements zi60 {
    public final int a;

    public si60(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si60) && this.a == ((si60) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
