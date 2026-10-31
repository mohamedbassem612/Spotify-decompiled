package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class snw extends tnw {
    public final String a;

    public snw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof snw) && u890.j(this.a, ((snw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
