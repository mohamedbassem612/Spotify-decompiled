package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vul implements cwl {
    public final dbo a;

    public vul(dbo dboVar) {
        this.a = dboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vul) && this.a.equals(((vul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
