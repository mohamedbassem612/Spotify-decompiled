package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w0r implements nwf1 {
    public final idd1 a;
    public final o3r b = w3p1.o(new l4r(new xv00(rc11.a.b(lo7.class)), 1, ywq.t, new j4r(ywq.Y), ywq.X), ywq.Z);

    public w0r(dv00 dv00Var) {
        this.a = new idd1(new s0r(dv00Var, (byte) 0));
    }

    @Override // p.nwf1
    public final Single a(List list) {
        return b(list).map(mm10.a1).map(new z8c(list, (byte) 1)).onErrorReturn(new qy40(list, (byte) 1));
    }

    @Override // p.nwf1
    public final Single b(List list) {
        if (list.isEmpty()) {
            Single singleJust = Single.just(b7x.a);
            singleJust.getClass();
            return singleJust;
        }
        Single singleOnErrorReturn = rqt0.F(o6x.a, new clo(list, this, null, (byte) 6)).onErrorReturn(e4y.V0);
        singleOnErrorReturn.getClass();
        return singleOnErrorReturn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        v0r v0rVar;
        if (onmVar instanceof v0r) {
            v0rVar = (v0r) onmVar;
            int i = v0rVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v0rVar.c = i - Integer.MIN_VALUE;
            } else {
                v0rVar = new v0r(this, onmVar);
            }
        } else {
            v0rVar = new v0r(this, onmVar);
        }
        Object objO = v0rVar.a;
        int i2 = v0rVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                t0r t0rVar = new t0r(this, str, null, (byte) 1);
                v0rVar.c = 1;
                objO = rc2.O(5000L, t0rVar, v0rVar);
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
            return (String) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }
}
