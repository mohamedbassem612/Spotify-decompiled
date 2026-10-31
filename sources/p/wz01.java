package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wz01 implements j011 {
    public final String a;
    public final String b;

    public wz01(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz01)) {
            return false;
        }
        wz01 wz01Var = (wz01) obj;
        return u890.j(this.a, wz01Var.a) && this.b.equals(wz01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
