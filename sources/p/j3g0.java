package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j3g0 extends a8d1 implements iu30 {
    public final /* synthetic */ wls0 X;
    public x4i1 a;
    public vpu0 b;
    public k3g0 c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ k3g0 f;
    public final /* synthetic */ x4i1 g;
    public final /* synthetic */ vpu0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3g0(k3g0 k3g0Var, x4i1 x4i1Var, vpu0 vpu0Var, boolean z, String str, wls0 wls0Var, lnm lnmVar) {
        super(1, lnmVar);
        this.f = k3g0Var;
        this.g = x4i1Var;
        this.h = vpu0Var;
        this.i = z;
        this.t = str;
        this.X = wls0Var;
    }

    public final lnm create(lnm lnmVar) {
        return new j3g0(this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Boolean m231Var;
        boolean z;
        vpu0 vpu0Var;
        k3g0 k3g0Var;
        x4i1 x4i1Var;
        boolean z2 = this.e;
        try {
            if (!z2) {
                hm5.M(obj);
                k3g0 k3g0Var2 = this.f;
                x4i1 x4i1Var2 = this.g;
                vpu0 vpu0Var2 = this.h;
                z = this.i;
                z290 z290Var = new z290(k3g0Var2, this.t, x4i1Var2, this.X, (lnm) null, (byte) 21);
                this.a = x4i1Var2;
                this.b = vpu0Var2;
                this.c = k3g0Var2;
                this.d = z;
                this.e = true;
                Object objM = rc2.M(3500L, z290Var, this);
                d9n d9nVar = d9n.a;
                if (objM == d9nVar) {
                    return d9nVar;
                }
                vpu0Var = vpu0Var2;
                k3g0Var = k3g0Var2;
                x4i1Var = x4i1Var2;
            } else {
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.d;
                k3g0Var = this.c;
                vpu0Var = this.b;
                x4i1Var = this.a;
                hm5.M(obj);
            }
            k3g0Var.l(vpu0Var.b.b, x4i1Var, z);
            m231Var = Boolean.TRUE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            try {
                throw thA;
            } catch (Throwable th2) {
                m231Var = new m231(th2);
            }
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }
}
