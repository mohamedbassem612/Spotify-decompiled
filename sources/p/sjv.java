package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sjv extends ujv {
    public final String a;

    public sjv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sjv) && u890.j(this.a, ((sjv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
