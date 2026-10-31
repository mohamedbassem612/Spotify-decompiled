package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yul implements cwl {
    public final o2z a;

    public yul(o2z o2zVar) {
        this.a = o2zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yul) && this.a.equals(((yul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
