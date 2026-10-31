package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uz8 {
    public String a;
    public String b;
    public long c;
    public byte d;

    public final vz8 a() {
        String str;
        String str2;
        if (this.d == 1 && (str = this.a) != null && (str2 = this.b) != null) {
            return new vz8(str, str2, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.b == null) {
            sb.append(" code");
        }
        if ((this.d & 1) == 0) {
            sb.append(" address");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public final void b(long j) {
        this.c = j;
        this.d = (byte) (this.d | 1);
    }

    public final void c(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null code");
        }
    }

    public final void d(String str) {
        if (str != null) {
            this.a = str;
        } else {
            bhn0.i("Null name");
        }
    }
}
