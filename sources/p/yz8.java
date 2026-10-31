package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yz8 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final zz8 a() {
        String str;
        if (this.f == 7 && (str = this.b) != null) {
            return new zz8(this.e, this.a, this.d, str, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" pc");
        }
        if (this.b == null) {
            sb.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.f & 4) == 0) {
            sb.append(" importance");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final void c(int i) {
        this.e = i;
        this.f = (byte) (this.f | 4);
    }

    public final void d(long j) {
        this.d = j;
        this.f = (byte) (this.f | 2);
    }

    public final void e(long j) {
        this.a = j;
        this.f = (byte) (this.f | 1);
    }

    public final void f(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null symbol");
        }
    }
}
