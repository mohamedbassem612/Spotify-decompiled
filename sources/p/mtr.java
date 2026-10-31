package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.decipher.agent.v1.Action;
import com.spotify.decipher.agent.v1.ActionRequest;
import com.spotify.decipher.agent.v1.NavigateAction;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mtr {
    public final xm41 a;
    public final yun0 b;
    public final hds c;
    public final oc4 d;
    public final jn7 e;
    public final llm f;
    public boolean g;
    public kb61 h;
    public faa0 i;
    public xab1 j;
    public faa0 k;
    public Integer l;
    public Boolean m;
    public String n;
    public final fmo o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ltr f77p;

    public mtr(xm41 xm41Var, yun0 yun0Var, hds hdsVar, oc4 oc4Var, CallbackRouter callbackRouter) {
        jn7 jn7VarG = w5p1.g(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 8)));
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        llm llmVarE = smo1.e(ha71.A(j0d1VarB, pyf0.a.f));
        this.a = xm41Var;
        this.b = yun0Var;
        this.c = hdsVar;
        this.d = oc4Var;
        this.e = jn7VarG;
        this.f = llmVarE;
        this.o = new fmo(this, (byte) 1);
        this.f77p = new ltr(this, (byte) 0);
    }

    public final void a() {
        if (this.g) {
            this.g = false;
            faa0 faa0Var = this.k;
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            this.k = null;
            faa0 faa0Var2 = this.i;
            if (faa0Var2 != null) {
                faa0Var2.d((CancellationException) null);
            }
            this.i = null;
            xab1 xab1Var = this.j;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            this.j = null;
            this.h = null;
            this.b.d(this.o);
            this.c.b.remove(this.f77p);
            this.l = null;
            this.m = null;
            this.n = null;
        }
    }

    public final void b(String str, String str2) {
        if (this.h == null) {
            return;
        }
        a70 a70VarP = ActionRequest.p();
        a70VarP.q(UUID.randomUUID().toString());
        a70VarP.r(str2);
        sy syVarN = Action.n();
        brn0 brn0VarN = NavigateAction.n();
        brn0VarN.n(str);
        syVarN.n(brn0VarN);
        a70VarP.n(syVarN);
        c921.y(this.f, (o8n) null, 0, new clo(this, (ActionRequest) a70VarP.build(), (lnm) null, (byte) 18), 3);
    }
}
