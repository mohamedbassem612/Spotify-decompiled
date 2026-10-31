package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qul implements cwl {
    public final efk a;

    public qul(efk efkVar) {
        this.a = efkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qul) && this.a.equals(((qul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
