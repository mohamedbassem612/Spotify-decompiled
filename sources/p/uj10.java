package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uj10 implements vj10 {
    public final int a;

    public uj10(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uj10) && this.a == ((uj10) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
