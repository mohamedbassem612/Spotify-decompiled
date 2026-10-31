package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class juv0 implements tuv0 {
    public final int a;

    public juv0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof juv0) && this.a == ((juv0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
