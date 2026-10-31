package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kxw0 implements mxw0 {
    public final String a;

    public kxw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxw0) && u890.j(this.a, ((kxw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
