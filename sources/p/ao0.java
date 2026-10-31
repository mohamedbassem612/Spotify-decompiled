package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ao0 implements yw0 {
    public final jjh1 a;
    public final jo0 b;
    public final llm c;

    public ao0(jjh1 jjh1Var, jo0 jo0Var, q8n q8nVar) {
        this.a = jjh1Var;
        this.b = jo0Var;
        this.c = l1d.x(q8nVar);
    }

    public static void a(ao0 ao0Var, co0 co0Var, String str, Long l, String str2, String str3, int i) {
        ao0Var.b(co0Var, str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str2, null, null, (i & 64) != 0 ? null : str3);
    }

    public static /* synthetic */ void c(ao0 ao0Var, co0 co0Var, String str, Long l, String str2, String str3, String str4, String str5, int i) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        ao0Var.b(co0Var, str, l, str2, str3, str4, str5);
    }

    public final void b(co0 co0Var, String str, Long l, String str2, String str3, String str4, String str5) {
        ji0 ji0Var = (ji0) this.a.a.get(str);
        llm llmVar = this.c;
        if (ji0Var == null) {
            c921.y(llmVar, (o8n) null, 0, new yn0(this, co0Var, str, l, str2, str3, str4, str5, (lnm) null), 3);
        } else if (!ji0.d1.contains(co0Var) || ji0Var.a1.remove(co0Var)) {
            c921.y(llmVar, (o8n) null, 0, new zn0(this, str, str2, l, ji0Var, co0Var, str5, (lnm) null), 3);
        }
    }

    @Override // p.yw0
    public final void stop() {
        op71.r(this.c.a);
    }

    @Override // p.yw0
    public final void start() {
    }
}
