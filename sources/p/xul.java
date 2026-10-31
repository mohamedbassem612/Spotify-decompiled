package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xul implements dwl {
    public final zkb a;

    public xul(zkb zkbVar) {
        this.a = zkbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xul) && this.a.equals(((xul) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
