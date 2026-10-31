package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nza {
    public final String a;

    public nza(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nza) && u890.j(this.a, ((nza) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
