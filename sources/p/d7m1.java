package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d7m1 {
    public final m8a a;

    public d7m1(m8a m8aVar) {
        this.a = m8aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7m1) && this.a.equals(((d7m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
