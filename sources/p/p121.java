package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p121 implements q121 {
    public final m0u a;

    public p121(m0u m0uVar) {
        this.a = m0uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p121) && u890.j(this.a, ((p121) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
