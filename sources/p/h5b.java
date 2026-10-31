package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h5b extends n5b {
    public final String a;

    public h5b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5b) && u890.j(this.a, ((h5b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
