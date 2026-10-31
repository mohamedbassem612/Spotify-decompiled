package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a09 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final b09 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new b09(str, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        eg.m(l1d.p(sb, "Missing required properties:"));
        return null;
    }
}
