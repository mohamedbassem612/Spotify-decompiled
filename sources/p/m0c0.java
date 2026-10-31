package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m0c0 extends a8d1 implements vu30 {
    public ven0 a;
    public ven0 b;
    public boolean c;
    public final /* synthetic */ jxc1 d;
    public final /* synthetic */ wp70 e;
    public final /* synthetic */ gw70 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ven0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0c0(jxc1 jxc1Var, wp70 wp70Var, gw70 gw70Var, long j, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = jxc1Var;
        this.e = wp70Var;
        this.f = gw70Var;
        this.g = j;
        this.h = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new m0c0(this.d, this.e, this.f, this.g, this.h, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        Exception exc;
        ven0 ven0Var;
        ven0 ven0Var2;
        boolean z = this.c;
        jxc1 jxc1Var = null;
        try {
            if (!z) {
                hm5.M(obj);
                ven0 ven0Var3 = this.h;
                try {
                    jxc1 jxc1Var2 = this.d;
                    String str = this.e.a;
                    gw70 gw70Var = this.f;
                    long j = this.g;
                    this.a = ven0Var3;
                    this.b = ven0Var3;
                    this.c = true;
                    Object objS = smo1.s(new p0c0(j, jxc1Var2, gw70Var, str, null), this);
                    d9n d9nVar = d9n.a;
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                    ven0Var2 = ven0Var3;
                    obj = objS;
                    ven0Var = ven0Var2;
                } catch (Exception e) {
                    exc = e;
                    ven0Var = ven0Var3;
                    Logger.l(exc, "Failed to prepare legacy Summary card grain; keeping the original card", new Object[0]);
                    ven0Var2 = ven0Var;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ven0Var2 = this.b;
                ven0Var = this.a;
                try {
                    hm5.M(obj);
                } catch (Exception e2) {
                    exc = e2;
                    Logger.l(exc, "Failed to prepare legacy Summary card grain; keeping the original card", new Object[0]);
                    ven0Var2 = ven0Var;
                }
            }
            jxc1Var = (jxc1) obj;
            ven0Var2.setValue(jxc1Var);
            return rih1.a;
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
