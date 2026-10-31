package p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h6z0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t6z0 b;

    public /* synthetic */ h6z0(t6z0 t6z0Var, byte b) {
        this.a = b;
        this.b = t6z0Var;
    }

    public final Object apply(Object obj) {
        Single singleFlatMap;
        byte b = this.a;
        t6z0 t6z0Var = this.b;
        switch (b) {
            case 0:
                t4z0 t4z0Var = (t4z0) obj;
                List list = t4z0Var.d;
                int size = list.size();
                tuz tuzVar = t6z0Var.c;
                int i = t4z0Var.e;
                if (list.size() == 1 && i == 2) {
                    singleFlatMap = tuzVar.a((ContextTrack) o7h.q0(list));
                } else {
                    singleFlatMap = dcu0.b(tuzVar).flatMap(new mgc(i, list, tuzVar, (byte) 26));
                    singleFlatMap.getClass();
                }
                return singleFlatMap.map(new sks0(new ia9(size, (byte) 2), (byte) 26)).onErrorReturn(wdx0.c).toObservable();
            default:
                e5z0 e5z0Var = (e5z0) obj;
                return fbp1.n(t6z0Var.i, "queue", e5z0Var.d, q6z0.b).filter(f2x0.d).map(h2x0.d).onErrorReturn(new n0v0(e5z0Var, (byte) 13));
        }
    }
}
