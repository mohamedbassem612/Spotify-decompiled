package p;

import com.spotify.common.uri.SpotifyUriParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ulu extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tka0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ulu(tka0 tka0Var, byte b) {
        super(1);
        this.a = b;
        this.b = tka0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        tka0 tka0Var = this.b;
        switch (b) {
            case 0:
                try {
                    v6b1 v6b1Var = new y6b1((String) obj, false).c;
                    if (v6b1Var == v6b1.c4 || v6b1Var == v6b1.N0 || v6b1Var == v6b1.O0) {
                        jd11 jd11Var = rc11.a;
                        if (tka0Var.equals(jd11Var.b(jo70.class)) || tka0Var.equals(jd11Var.b(xkk1.class))) {
                            z = true;
                        }
                    }
                } catch (SpotifyUriParserException unused) {
                }
                return Boolean.valueOf(z);
            case 1:
                if (i8p1.p((String) obj) != null) {
                    jd11 jd11Var2 = rc11.a;
                    if (tka0Var.equals(jd11Var2.b(jo70.class)) || tka0Var.equals(jd11Var2.b(hll.class)) || tka0Var.equals(jd11Var2.b(mtl.class)) || tka0Var.equals(jd11Var2.b(xkk1.class))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(tka0Var.m(((jh5) obj).a));
        }
    }
}
