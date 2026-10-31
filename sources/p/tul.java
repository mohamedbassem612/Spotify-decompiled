package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tul implements cwl {
    public final dbo a;

    public tul(dbo dboVar) {
        this.a = dboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tul) && this.a.equals(((tul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
