package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fz8 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public cin g;
    public tin h;
    public sin i;
    public din j;
    public List k;
    public int l;
    public byte m;

    public final gz8 a() {
        String str;
        String str2;
        cin cinVar;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (cinVar = this.g) != null) {
            return new gz8(str, str2, this.c, this.d, this.e, this.f, cinVar, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }
}
