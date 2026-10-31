package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w3c0 extends y3c0 {
    public final String a;

    public w3c0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3c0) && u890.j(this.a, ((w3c0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
