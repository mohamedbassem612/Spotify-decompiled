package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ti00 {
    public final m7u a;

    public ti00(m7u m7uVar) {
        this.a = m7uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ti00) && this.a.equals(((ti00) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
