package p;

import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b7n {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;

    public b7n(xm41 xm41Var, CallbackRouter callbackRouter, q8n q8nVar, q8n q8nVar2, cdn0 cdn0Var) {
        this.b = xm41Var;
        llm llmVarE = smo1.e(flo1.l(q8nVar, guo1.B()).y(new z8n("CoreSettingsForMusic")));
        this.c = new b7n(callbackRouter, q8nVar2);
        l4p1.u(llmVarE, new fu20(a(o6n.a), new u98(2, cdn0Var, cdn0.class, "updateForcedOffline", "updateForcedOffline(Z)V", 4, (byte) 6), (byte) 1));
    }

    public final mr20 a(x6n x6nVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return eth.t((xm41) obj, r6x.a, new kjk(this, x6nVar, (byte) 21));
            default:
                return rqt0.u(new qbk((ve01) this.c, (iu30) dko1.m((no61) obj, x6nVar).b, (byte) 18));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final Object b(x6n x6nVar, Object obj, lnm lnmVar) {
        e7n e7nVar;
        switch (this.a) {
            case 0:
                return ((b7n) this.c).b(x6nVar, obj, lnmVar);
            default:
                if (lnmVar instanceof e7n) {
                    e7nVar = (e7n) lnmVar;
                    int i = e7nVar.d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        e7nVar.d = i - Integer.MIN_VALUE;
                    } else {
                        e7nVar = new e7n(this, lnmVar);
                    }
                } else {
                    e7nVar = new e7n(this, lnmVar);
                }
                Object obj2 = e7nVar.b;
                int i2 = e7nVar.d;
                boolean z = false;
                try {
                    if (i2 == 0) {
                        hm5.M(obj2);
                        vu30 vu30Var = (vu30) dko1.m((no61) this.b, x6nVar).c;
                        e7nVar.a = x6nVar;
                        e7nVar.d = 1;
                        Object objInvoke = vu30Var.invoke(obj, e7nVar);
                        x6nVar = d9n.a;
                        if (objInvoke == x6nVar) {
                            return x6nVar;
                        }
                    } else {
                        if (i2 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        x6nVar = e7nVar.a;
                        hm5.M(obj2);
                    }
                    z = true;
                    break;
                } catch (CancellationException e) {
                    op71.x(e7nVar.getContext());
                    Logger.e(e, "Failed to set core setting %s", new Object[]{x6nVar});
                } catch (Exception e2) {
                    Logger.e(e2, "Failed to set core setting %s", new Object[]{x6nVar});
                }
                return Boolean.valueOf(z);
        }
    }

    public b7n(CallbackRouter callbackRouter, q8n q8nVar) {
        no61 no61Var = new no61(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 6)));
        this.b = no61Var;
        this.c = d5p1.r(rqt0.u(new tu41(no61Var.callStream("spotify.settings.esperanto.proto.Settings", "GetState", Empty.n()), (byte) 6)), us71.h(q8nVar), new alb1(0L, 0L), 1);
    }
}
