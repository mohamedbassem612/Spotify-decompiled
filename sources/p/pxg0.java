package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pxg0 extends qxg0 {
    public final String a;

    public pxg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxg0) && u890.j(this.a, ((pxg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
