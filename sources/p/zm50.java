package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zm50 implements an50 {
    public final int a;

    public zm50(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zm50) && this.a == ((zm50) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
