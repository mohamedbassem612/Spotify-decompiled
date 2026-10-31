package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0b1 {
    public final String a;

    public w0b1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0b1) && u890.j(this.a, ((w0b1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
