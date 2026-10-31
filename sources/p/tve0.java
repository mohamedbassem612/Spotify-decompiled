package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tve0 implements vve0 {
    public final rb a;

    public tve0(rb rbVar) {
        this.a = rbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tve0) && u890.j(this.a, ((tve0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
