package p;

import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qia1 {
    public static final bma1 c = bma1.b.u("playable_cache_order_key");
    public final dma1 a;
    public final List b;

    public qia1(dma1 dma1Var) {
        this.a = dma1Var;
        Parcelable.Creator creator = ztc.CREATOR;
        this.b = p7h.M(new mia1[]{ztc.i, ztc.X, ztc.t, ztc.Y});
    }

    public final mia1 a() {
        Object next;
        Parcelable.Creator creator = ztc.CREATOR;
        String strE = this.a.e(c, "relevance");
        Iterator it = this.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((mia1) next).a, strE));
        mia1 mia1Var = (mia1) next;
        return mia1Var == null ? ztc.Y : mia1Var;
    }
}
