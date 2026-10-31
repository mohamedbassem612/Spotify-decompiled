package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qjv extends ujv {
    public final String a;

    public qjv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjv) && u890.j(this.a, ((qjv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
