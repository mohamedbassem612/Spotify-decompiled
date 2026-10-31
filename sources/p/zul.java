package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zul implements cwl {
    public final haz a;

    public zul(haz hazVar) {
        this.a = hazVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zul) && this.a.equals(((zul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
