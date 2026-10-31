package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zgw implements fiw {
    public final String a;

    public zgw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zgw) && u890.j(this.a, ((zgw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String q() {
        return this.a;
    }
}
