package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zok implements apk {
    public final gpk a;

    public zok(gpk gpkVar) {
        this.a = gpkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zok) && this.a.equals(((zok) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
