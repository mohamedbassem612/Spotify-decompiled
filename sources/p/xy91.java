package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xy91 {
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final bfd a;
    public final j0j0 b;
    public final od90 c;
    public final eb d;
    public final egd e;
    public final g2z f;
    public final kp5 g;
    public final j0a1 h;

    static {
        ytw0 ytw0Var = jfv.b;
        i = fdg1.k0(3, ngv.e);
    }

    public xy91(bfd bfdVar, j0j0 j0j0Var, od90 od90Var, eb ebVar, egd egdVar, g2z g2zVar, kp5 kp5Var, j0a1 j0a1Var) {
        this.a = bfdVar;
        this.b = j0j0Var;
        this.c = od90Var;
        this.d = ebVar;
        this.e = egdVar;
        this.f = g2zVar;
        this.g = kp5Var;
        this.h = j0a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        sy91 sy91Var;
        mfd m231Var;
        if (onmVar instanceof sy91) {
            sy91Var = (sy91) onmVar;
            int i2 = sy91Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sy91Var.c = i2 - Integer.MIN_VALUE;
            } else {
                sy91Var = new sy91(this, onmVar);
            }
        } else {
            sy91Var = new sy91(this, onmVar);
        }
        Object objB = sy91Var.a;
        int i3 = sy91Var.c;
        try {
            if (i3 == 0) {
                hm5.M(objB);
                bfd bfdVar = this.a;
                sy91Var.c = 1;
                bfdVar.getClass();
                objB = bfd.b(bfdVar, str, sy91Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            m231Var = (mfd) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(qy91 qy91Var, onm onmVar) {
        ty91 ty91Var;
        jhm m231Var;
        if (onmVar instanceof ty91) {
            ty91Var = (ty91) onmVar;
            int i2 = ty91Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ty91Var.c = i2 - Integer.MIN_VALUE;
            } else {
                ty91Var = new ty91(this, onmVar);
            }
        } else {
            ty91Var = new ty91(this, onmVar);
        }
        Object objP = ty91Var.a;
        int i3 = ty91Var.c;
        try {
            if (i3 == 0) {
                hm5.M(objP);
                if (qy91Var.a) {
                    return null;
                }
                long j2 = i;
                uy91 uy91Var = new uy91(this, qy91Var, (lnm) null, (byte) 0);
                ty91Var.c = 1;
                objP = rc2.P(j2, uy91Var, ty91Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objP);
            }
            m231Var = (jhm) objP;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? null : m231Var;
    }
}
