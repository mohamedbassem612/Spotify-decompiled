package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yse0 {
    public final kly0 a;
    public final kly0 b;
    public String c;
    public String d;

    public yse0(g5t g5tVar, caq caqVar, q8n q8nVar) {
        this.a = g5tVar;
        this.b = caqVar;
        llm llmVarE = smo1.e(q8nVar);
        this.c = "";
        this.d = "";
        c921.y(llmVarE, (o8n) null, 0, new vse0(this, null, (byte) 0), 3);
        c921.y(llmVarE, (o8n) null, 0, new p6d0(this, (lnm) null, (byte) 14), 3);
    }

    public final String a(String str) {
        if (this.c.length() > 0) {
            str = nhc1.W(str, this.c, "<username redacted>");
        }
        return this.d.length() > 0 ? nhc1.W(str, this.d, "<email redacted>") : str;
    }
}
