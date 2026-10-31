package p;

import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.libs.connect.events.proto.LogoutNonAuth;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n4f0 implements f961 {
    public final ai8 a;
    public final zh8 b;
    public final u3f0 c;
    public final di8 d;
    public final x54 e;
    public final nl51 f;
    public final llm g;
    public yg8 h;
    public final AtomicReference i = new AtomicReference(Boolean.FALSE);

    public n4f0(ai8 ai8Var, zh8 zh8Var, u3f0 u3f0Var, di8 di8Var, x54 x54Var, CallbackRouter callbackRouter, q8n q8nVar) {
        this.a = ai8Var;
        this.b = zh8Var;
        this.c = u3f0Var;
        this.d = di8Var;
        this.e = x54Var;
        this.f = new nl51(callbackRouter);
        this.g = smo1.e(ha71.A(guo1.B(), q8nVar).y(new z8n("LogoutService")));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(yg8 yg8Var, onm onmVar) {
        j4f0 j4f0Var;
        ml8 ml8Var;
        if (onmVar instanceof j4f0) {
            j4f0Var = (j4f0) onmVar;
            int i = j4f0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4f0Var.d = i - Integer.MIN_VALUE;
            } else {
                j4f0Var = new j4f0(this, onmVar);
            }
        } else {
            j4f0Var = new j4f0(this, onmVar);
        }
        Object objO = j4f0Var.b;
        int i2 = j4f0Var.d;
        ai8 ai8Var = this.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objO);
                    k4f0 k4f0Var = new k4f0(this, yg8Var, (lnm) null, (byte) 0);
                    j4f0Var.a = yg8Var;
                    j4f0Var.d = 1;
                    objO = rc2.O(1000L, k4f0Var, j4f0Var);
                    d9n d9nVar = d9n.a;
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yg8Var = j4f0Var.a;
                    hm5.M(objO);
                }
                ml8Var = new ml8(yg8Var);
            } catch (Exception e) {
                Logger.e(e, "Failed to remove stored credentials during logout", new Object[0]);
                ml8Var = new ml8(yg8Var);
            }
            ai8Var.b(ml8Var);
            return rih1.a;
        } catch (Throwable th) {
            ai8Var.b(new ml8(yg8Var));
            throw th;
        }
    }

    public final void b(Function0 function0) {
        yg8 yg8Var = this.h;
        if (yg8Var == null || !yg8Var.a()) {
            return;
        }
        function0.invoke();
    }

    public final void c(yg8 yg8Var, int i) {
        int iC;
        if (((Boolean) this.i.getAndSet(Boolean.TRUE)).booleanValue()) {
            return;
        }
        this.h = yg8Var;
        boolean z = yg8Var == yg8.d && this.e.a();
        b4f0 b4f0Var = new b4f0(yg8Var, i, z);
        u3f0 u3f0Var = this.c;
        t2j0 t2j0Var = u3f0Var.a;
        g4f0 g4f0VarO = LogoutNonAuth.o();
        g4f0VarO.t();
        String strName = (b4f0Var.b() != yg8.e || (iC = b4f0Var.c()) == 0) ? b4f0Var.b().name() : f4i1.f(pze0.p(iC), "-", b4f0Var.b().name());
        g4f0VarO.r(strName);
        g4f0VarO.q(u3f0Var.b.b);
        g4f0VarO.u();
        g4f0VarO.s();
        g4f0VarO.n(String.valueOf(b4f0Var.a()));
        t2j0Var.a(g4f0VarO.build());
        if (z) {
            c921.y(this.g, (o8n) null, 4, new l4f0(this, yg8Var, (lnm) null, (byte) 0), 1);
            return;
        }
        if (yg8Var != yg8.h && yg8Var != yg8.N0) {
            uh8 uh8Var = (uh8) this.b.b.getValue();
            uh8Var.a.e(Empty.n()).map(new r6x0(uh8Var, (byte) 29)).blockingGet();
        }
        this.a.b(new ml8(yg8Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        m4f0 m4f0Var;
        if (onmVar instanceof m4f0) {
            m4f0Var = (m4f0) onmVar;
            int i = m4f0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m4f0Var.c = i - Integer.MIN_VALUE;
            } else {
                m4f0Var = new m4f0(this, onmVar);
            }
        } else {
            m4f0Var = new m4f0(this, onmVar);
        }
        Object objO = m4f0Var.a;
        int i2 = m4f0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                p6d0 p6d0Var = new p6d0(this, (lnm) null, (byte) 18);
                m4f0Var.c = 1;
                objO = rc2.O(1000L, p6d0Var, m4f0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Session termination failed", new Object[0]);
        }
        return rih1.a;
    }

    public final void shutdown() {
        smo1.q(this.g);
    }

    public final Object getApi() {
        return this;
    }
}
