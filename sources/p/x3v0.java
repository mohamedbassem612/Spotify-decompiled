package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x3v0 {
    public final u3v0 a;
    public final ujs b;
    public final vo30 c;

    public x3v0(u3v0 u3v0Var, ujs ujsVar, vo30 vo30Var) {
        this.a = u3v0Var;
        this.b = ujsVar;
        this.c = vo30Var;
    }

    public static abr d(t3v0 t3v0Var) {
        Map map = t3v0Var.d;
        List list = t3v0Var.f;
        if (map.isEmpty()) {
            map = null;
        }
        if (list.isEmpty()) {
            list = null;
        }
        yar yarVar = (map == null && list == null) ? null : new yar(list, map);
        Map map2 = t3v0Var.b;
        Map map3 = t3v0Var.c;
        List list2 = t3v0Var.e;
        if (map2.isEmpty()) {
            map2 = null;
        }
        if (map3.isEmpty()) {
            map3 = null;
        }
        if (list2.isEmpty()) {
            list2 = null;
        }
        return new abr(yarVar, (map2 == null && map3 == null && list2 == null) ? null : new war(list2, map2, map3));
    }

    public final Single a(List list, t3v0 t3v0Var) {
        iu30 v3v0Var = new v3v0(this.c, (byte) 0);
        return this.b.a(this.a.b(gm50.u(t3v0Var), new s3v0(list, d(t3v0Var))).toObservable(), w3v0.a, v3v0Var).firstOrError();
    }

    public final Observable b(List list, t3v0 t3v0Var) {
        iu30 v3v0Var = new v3v0(this.c, (byte) 1);
        return this.b.a(this.a.a(gm50.u(t3v0Var), new s3v0(list, d(t3v0Var))), w3v0.a, v3v0Var);
    }

    public final Single c(List list, t3v0 t3v0Var) {
        iu30 v3v0Var = new v3v0(this.c, (byte) 2);
        return this.b.a(this.a.b(gm50.u(t3v0Var), new s3v0(list, d(t3v0Var))).toObservable(), w3v0.a, v3v0Var).firstOrError();
    }
}
