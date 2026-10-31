package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.reachability.esperanto.proto.EsConnectionInfoReceiver$ConnectionInfo;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z8l extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a9l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8l(a9l a9lVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = a9lVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        a9l a9lVar = this.d;
        switch (b) {
            case 0:
                z8l z8lVar = new z8l(a9lVar, lnmVar, (byte) 0);
                z8lVar.c = obj;
                return z8lVar;
            default:
                z8l z8lVar2 = new z8l(a9lVar, lnmVar, (byte) 1);
                z8lVar2.c = obj;
                return z8lVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((EsConnectionInfoReceiver$ConnectionInfo) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        a9l a9lVar = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                EsConnectionInfoReceiver$ConnectionInfo esConnectionInfoReceiver$ConnectionInfo = (EsConnectionInfoReceiver$ConnectionInfo) this.c;
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        Single map = a9lVar.a.callSingle("spotify.connectivity.reachability.esperanto.proto.ConnectionInfoReceiver", "reportConnectionInfo", esConnectionInfoReceiver$ConnectionInfo).map(qz70.R0);
                        this.c = null;
                        this.b = true;
                        obj = fc11.j(map, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    obj.getClass();
                    return rih1Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    Logger.l(th, "Could not report connection info", new Object[0]);
                    return rih1Var;
                }
            default:
                vr20 vr20Var = (vr20) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Object objW = a9lVar.e.w();
                if (objW == null) {
                    objW = a9l.g;
                }
                this.c = null;
                this.b = true;
                return vr20Var.emit(objW, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
