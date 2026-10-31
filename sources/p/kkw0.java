package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kkw0 {
    public final ttm0 a;
    public final c9n b;
    public final zau0 d;
    public final bpb1 c = gio1.b((Object) null);
    public final xgn0 e = ygn0.a();

    public kkw0(ttm0 ttm0Var, c9n c9nVar) {
        this.a = ttm0Var;
        this.b = c9nVar;
        this.d = ttm0Var.c(false);
        fn31.T(c9nVar, (o8n) null, 0, new c3u0(this, (lnm) null, (byte) 16), 3);
    }

    public final void a(String str, String str2, tv80 tv80Var, String str3, h08 h08Var, yjp1 yjp1Var) {
        r091 r091Var = (r091) this.c.getValue();
        if (r091Var != null) {
            ebp1.s(r091Var, new lsm0(str3 == null ? "" : str3, new ksm0(new gec1(str2), str, (String) null, "audio-preview-row-leading", str, (String) null, 484), false, false, h08Var != null ? new jsm0(Long.valueOf(h08Var.a), Long.valueOf(h08Var.b)) : null, 0L, (ism0) null, (String) null, false, 0, 2028), tv80Var, yjp1Var, 12);
            r091Var.k();
        }
    }
}
