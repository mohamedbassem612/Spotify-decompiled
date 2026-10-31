package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class up60 implements cq60 {
    public final int a;

    public up60(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up60) && this.a == ((up60) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
