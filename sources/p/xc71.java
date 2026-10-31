package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xc71 {
    public final c9c0 a;
    public final zc80 b;
    public final p5a0 c;

    public xc71(c9c0 c9c0Var, zc80 zc80Var, p5a0 p5a0Var) {
        this.a = c9c0Var;
        this.b = zc80Var;
        this.c = p5a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        vc71 vc71Var;
        zo90 zo90Var;
        if (onmVar instanceof vc71) {
            vc71Var = (vc71) onmVar;
            int i = vc71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vc71Var.c = i - Integer.MIN_VALUE;
            } else {
                vc71Var = new vc71(this, onmVar);
            }
        } else {
            vc71Var = new vc71(this, onmVar);
        }
        Object objB = vc71Var.a;
        int i2 = vc71Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            zo90Var = ((ap90) this.a.d.b().getValue()).b.c;
            if (zo90Var == null) {
                vc71Var.c = 1;
                objB = b(vc71Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            }
            if (zo90Var != null) {
                this.b.d(zo90Var);
            } else {
                n57.e("Attempted to share empty session URI");
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        zo90Var = (zo90) objB;
        if (zo90Var != null) {
            this.b.d(zo90Var);
        } else {
            n57.e("Attempted to share empty session URI");
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        wc71 wc71Var;
        e5a0 e5a0Var;
        tpt tptVar;
        g6c g6cVar;
        if (onmVar instanceof wc71) {
            wc71Var = (wc71) onmVar;
            int i = wc71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wc71Var.c = i - Integer.MIN_VALUE;
            } else {
                wc71Var = new wc71(this, onmVar);
            }
        } else {
            wc71Var = new wc71(this, onmVar);
        }
        Object objA = wc71Var.a;
        int i2 = wc71Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                p5a0 p5a0Var = this.c;
                wc71Var.c = 1;
                objA = p5a0Var.a(wc71Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            e5a0Var = (e5a0) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            e5a0Var = null;
        }
        String str = (e5a0Var == null || (tptVar = e5a0Var.a) == null || (g6cVar = tptVar.i) == null) ? null : g6cVar.a;
        if (str == null) {
            return null;
        }
        String strConcat = "spotify:socialsession:".concat(str);
        return new zo90(strConcat, strConcat);
    }
}
