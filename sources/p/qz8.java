package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qz8 {
    public long a;
    public long b;
    public String c;
    public String d;
    public byte e;

    public final rz8 a() {
        String str;
        if (this.e == 3 && (str = this.c) != null) {
            return new rz8(this.a, this.b, str, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((this.e & 2) == 0) {
            sb.append(" size");
        }
        if (this.c == null) {
            sb.append(" name");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public final void b(long j) {
        this.a = j;
        this.e = (byte) (this.e | 1);
    }

    public final void c(String str) {
        if (str != null) {
            this.c = str;
        } else {
            bhn0.i("Null name");
        }
    }

    public final void d(long j) {
        this.b = j;
        this.e = (byte) (this.e | 2);
    }

    public final void e(String str) {
        this.d = str;
    }
}
