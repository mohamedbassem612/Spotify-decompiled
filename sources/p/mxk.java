package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mxk extends x7e0 {
    public final pxk d;
    public final z2h e;
    public final bel f;
    public oxk g;
    public final llm h;
    public xab1 i;

    public mxk(pxk pxkVar, z2h z2hVar, bel belVar, q8n q8nVar) {
        this.d = pxkVar;
        this.e = z2hVar;
        this.f = belVar;
        this.h = smo1.e(q8nVar);
    }

    public final void e() {
        pxk pxkVar = this.d;
        if (ihc1.y0(pxkVar.a)) {
            h(new IllegalArgumentException("generationId must not be blank"));
            return;
        }
        if (ihc1.y0(pxkVar.d.a)) {
            h(new IllegalArgumentException("voice.voiceId must not be blank"));
            return;
        }
        j();
        this.i = fn31.T(this.h, (o8n) null, 0, new awe(this, null, (byte) 12), 3);
    }

    public final void f() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e8, code lost:
    
        if (r1 == r11) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(p.onm r41) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mxk.k(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(onm onmVar) {
        lxk lxkVar;
        if (onmVar instanceof lxk) {
            lxkVar = (lxk) onmVar;
            int i = lxkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lxkVar.c = i - Integer.MIN_VALUE;
            } else {
                lxkVar = new lxk(this, onmVar);
            }
        } else {
            lxkVar = new lxk(this, onmVar);
        }
        Object objA = lxkVar.a;
        int i2 = lxkVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                if (!this.d.i.isEmpty()) {
                    bel belVar = this.f;
                    lxkVar.c = 1;
                    objA = belVar.a(lxkVar);
                    Object obj = d9n.a;
                    if (objA == obj) {
                        return obj;
                    }
                }
                return fg91.b;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
            return mqo1.A((Iterable) objA);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }
}
