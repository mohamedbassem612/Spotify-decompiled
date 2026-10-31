package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ff20 {
    public final bf20 a;
    public final q8n b;
    public final lt20 c;

    public ff20(dpd1 dpd1Var, bf20 bf20Var, q8n q8nVar) {
        this.a = bf20Var;
        this.b = q8nVar;
        this.c = new lt20(hu20.a(new fu20(yoi1.g(dpd1Var.getTags().toObservable().timeout(5L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).map(new yla(this, (byte) 11))), new xr00(this, null, (byte) 8), (byte) 1), new n3s(this, (lnm) null, (byte) 15)), new ew0(this, (lnm) null, (byte) 22), (byte) 0);
    }

    public final Object a(String str, onm onmVar) {
        Object objY = fn31.Y(this.b, new cf20(this, str, null, (byte) 0), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    public final evz b() {
        return new evz(zno1.h(this.a.a, false, new String[]{"liked_songs_filter_tags_entity"}, new z5z(1, (byte) 12)), this, (byte) 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        ef20 ef20Var;
        if (onmVar instanceof ef20) {
            ef20Var = (ef20) onmVar;
            int i = ef20Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ef20Var.c = i - Integer.MIN_VALUE;
            } else {
                ef20Var = new ef20(this, onmVar);
            }
        } else {
            ef20Var = new ef20(this, onmVar);
        }
        Object objK = ef20Var.a;
        int i2 = ef20Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            mr20 mr20VarU = rqt0.u(b());
            ef20Var.c = 1;
            objK = b5p1.k(mr20VarU, ef20Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        List list = (List) objK;
        return Boolean.valueOf(list != null ? !list.isEmpty() : false);
    }
}
