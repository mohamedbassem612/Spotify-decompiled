package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class btc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public btc(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btc)) {
            return false;
        }
        btc btcVar = (btc) obj;
        return u890.j(this.a, btcVar.a) && this.b.equals(btcVar.b) && this.c.equals(btcVar.c) && this.d.equals(btcVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }
}
