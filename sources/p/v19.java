package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v19 {
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public Long e;
    public Long f;
    public Long g;
    public byte h;

    public final w19 a() {
        if (this.h == 3 && this.a != null && this.b != null && this.e != null && this.f != null && this.g != null) {
            return new w19(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" previewId");
        }
        if (this.b == null) {
            sb.append(" previewKey");
        }
        if ((this.h & 1) == 0) {
            sb.append(" isLoading");
        }
        if ((this.h & 2) == 0) {
            sb.append(" isError");
        }
        if (this.e == null) {
            sb.append(" position");
        }
        if (this.f == null) {
            sb.append(" duration");
        }
        if (this.g == null) {
            sb.append(" timestamp");
        }
        eg.m("Missing required properties:".concat(String.valueOf(sb)));
        return null;
    }
}
