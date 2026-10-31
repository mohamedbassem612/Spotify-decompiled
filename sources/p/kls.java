package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kls implements lls {
    public final String a;

    public kls(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kls) && u890.j(this.a, ((kls) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
