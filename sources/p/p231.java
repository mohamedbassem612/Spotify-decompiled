package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p231 extends k331 {
    public final String a;

    public p231(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p231) && u890.j(this.a, ((p231) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
