package p;

import com.spotify.tap.spoton.SpotOnService;
import io.reactivex.rxjava3.functions.Supplier;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o900 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o900(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                q900 q900Var = (q900) obj;
                q900Var.c.set(true);
                ArrayList arrayList = q900Var.b;
                b380 b380VarP = b380.p(arrayList);
                arrayList.clear();
                return q900Var.d.startWithIterable(b380VarP).doOnDispose(new c72(q900Var, (byte) 1));
            case 1:
                return ((e241) ((yse0) obj).b.get()).a;
            case 2:
                return yoi1.i(((yaz0) obj).f.c(ql10.a), o6x.a).map(i5x0.d);
            default:
                return vqd1.c(((SpotOnService) obj).b());
        }
    }
}
