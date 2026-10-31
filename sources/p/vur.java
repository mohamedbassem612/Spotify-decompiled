package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class vur extends tv30 implements iu30 {
    public static final vur a = new vur(1, b2u.class, "isAllowedSignedGcsUrl", "isAllowedSignedGcsUrl(Lokhttp3/HttpUrl;)Z", 1);

    public final Object invoke(Object obj) {
        l370 l370Var = (l370) obj;
        String str = l370Var.d;
        boolean z = false;
        if (l370Var.f() && l370Var.b.length() == 0 && l370Var.c.length() == 0 && l370Var.h == null && l370Var.e == 443 && (u890.j(str, "storage.googleapis.com") || nhc1.R(str, ".storage.googleapis.com", false))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
