package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zp81 extends sn81 {
    public final String a;
    public final Object b;

    public zp81(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp81)) {
            return false;
        }
        zp81 zp81Var = (zp81) obj;
        return u890.j(this.a, zp81Var.a) && u890.j(this.b, zp81Var.b);
    }

    public final int hashCode() {
        return e331.b(this.b) + (this.a.hashCode() * 31);
    }
}
