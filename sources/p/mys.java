package p;

import android.opengl.EGLDisplay;
import androidx.media3.common.util.GlUtil;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mys implements qoj1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rys b;

    public /* synthetic */ mys(rys rysVar, byte b) {
        this.a = b;
        this.b = rysVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.qoj1
    public final void run() throws GlUtil.GlException {
        byte b = this.a;
        rys rysVar = this.b;
        switch (b) {
            case 0:
                rysVar.getClass();
                try {
                    k9r k9rVar = rysVar.d;
                    k9rVar.getClass();
                    try {
                        ns40 ns40Var = (ns40) k9rVar.d;
                        if (ns40Var != null) {
                            ns40Var.c();
                        }
                    } catch (GlUtil.GlException e) {
                        oon1.w("Error releasing GL Program", e);
                    }
                    rysVar.h.b();
                    fn31.H(rysVar.m, rysVar.n);
                } catch (GlUtil.GlException e2) {
                    oon1.w("Error releasing GL resources", e2);
                    return;
                }
                break;
            case 1:
                EGLDisplay eGLDisplayN = fn31.N();
                rysVar.m = eGLDisplayN;
                rysVar.n = fn31.E(rysVar.c.g(eGLDisplayN, 2, fn31.a), rysVar.m);
                break;
            default:
                rysVar.b();
                break;
        }
    }
}
