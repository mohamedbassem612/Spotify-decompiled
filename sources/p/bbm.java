package p;

import j$.net.URLEncoder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bbm {
    public final lzn0 a;

    public bbm(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    public static String a(int i) {
        String str;
        lik1 lik1Var = nik1.b2;
        int iC = l1d.C(i);
        if (iC == 0) {
            str = "content_windowing:early_access";
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            str = "content_windowing:early_access_after_release";
        }
        return lik1Var + "?displayReason=" + URLEncoder.encode(str, "UTF-8");
    }
}
