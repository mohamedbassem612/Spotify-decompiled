package p;

import android.opengl.GLES30;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nys implements qoj1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nys(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.qoj1
    public final void run() throws GlUtil.GlException {
        switch (this.a) {
            case 0:
                rys rysVar = (rys) this.c;
                long j = this.b;
                synchronized (rysVar) {
                    while (rysVar.h.d() < rysVar.h.c && rysVar.i.b() <= j) {
                        try {
                            dfe1 dfe1Var = rysVar.h;
                            ArrayDeque arrayDeque = dfe1Var.b;
                            dm5.y(!arrayDeque.isEmpty());
                            dfe1Var.a.add((ss40) arrayDeque.remove());
                            rysVar.i.c();
                            long jC = rysVar.j.c();
                            if (jC != -1) {
                                GLES30.glDeleteSync(jC);
                            }
                            fn31.t();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    rysVar.b();
                }
                return;
            case 1:
                azs azsVar = (azs) this.c;
                long j2 = this.b;
                cg20 cg20Var = azsVar.k;
                ks40 ks40Var = azsVar.c;
                ConcurrentLinkedQueue concurrentLinkedQueue = cg20Var.k;
                cg20Var.h.h();
                if (cg20Var.o != null) {
                    return;
                }
                dm5.y(!cg20Var.f24p);
                if (concurrentLinkedQueue.isEmpty()) {
                    return;
                }
                ype1 ype1Var = (ype1) concurrentLinkedQueue.remove();
                cg20Var.i(ks40Var, ype1Var.a, ype1Var.b, j2);
                if (concurrentLinkedQueue.isEmpty() && cg20Var.t) {
                    mxr mxrVar = cg20Var.w;
                    mxrVar.getClass();
                    mxrVar.z();
                    cg20Var.t = false;
                    return;
                }
                return;
            default:
                cg20 cg20Var2 = (cg20) this.c;
                long j3 = this.b;
                v4f0 v4f0Var = cg20Var2.m;
                dfe1 dfe1Var2 = cg20Var2.l;
                dm5.y(cg20Var2.o != null);
                while (dfe1Var2.d() < dfe1Var2.c && v4f0Var.b() <= j3) {
                    ArrayDeque arrayDeque2 = dfe1Var2.b;
                    dm5.y(!arrayDeque2.isEmpty());
                    dfe1Var2.a.add((ss40) arrayDeque2.remove());
                    v4f0Var.c();
                    long jC2 = cg20Var2.n.c();
                    if (jC2 != -1) {
                        GLES30.glDeleteSync(jC2);
                    }
                    fn31.t();
                    cg20Var2.u.k();
                }
                return;
        }
    }
}
