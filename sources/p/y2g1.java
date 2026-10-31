package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y2g1 {
    public long a = -1;
    public boolean b;
    public Object c;

    public y2g1(yqg yqgVar) {
        this.c = yqgVar;
    }

    public void a(String str) {
        if (str != null) {
            this.c = str;
        } else {
            bhn0.i("Null queueId");
        }
    }

    public void b(long j) {
        this.a = j;
        this.b = true;
    }

    public qgn1 c() {
        String str;
        if (this.b && (str = (String) this.c) != null) {
            return new qgn1(str, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (((String) this.c) == null) {
            sb.append(" queueId");
        }
        if (!this.b) {
            sb.append(" queueVersion");
        }
        eg.m("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
