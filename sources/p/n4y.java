package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n4y implements x4y {
    public final bpu a;

    public n4y(bpu bpuVar) {
        this.a = bpuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4y) && u890.j(this.a, ((n4y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
