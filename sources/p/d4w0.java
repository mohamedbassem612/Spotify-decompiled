package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d4w0 extends f4w0 {
    public final String a;

    public d4w0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d4w0) && u890.j(this.a, ((d4w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
