package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w3m1 extends b4m1 {
    public final int a;

    public w3m1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3m1) && this.a == ((w3m1) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
