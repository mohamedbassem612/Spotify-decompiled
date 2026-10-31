package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rpt0 {
    public final String a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rpt0(byte[] bArr) {
        this(a860.k(bArr, d860.d));
        int[] iArr = a860.a;
    }

    public final String a() {
        return this.a;
    }

    public final rpt0 b() {
        return new rpt0(this.a.substring(0, 32));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpt0) && u890.j(this.a, ((rpt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public rpt0(String str) {
        this.a = str;
    }
}
