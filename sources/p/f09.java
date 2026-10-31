package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f09 {
    public h09 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final g09 a() {
        h09 h09Var;
        String str;
        String str2;
        if (this.e == 1 && (h09Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new g09(h09Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }

    public final void b(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null parameterKey");
        }
    }

    public final void c(long j) {
        this.d = j;
        this.e = (byte) (this.e | 1);
    }
}
