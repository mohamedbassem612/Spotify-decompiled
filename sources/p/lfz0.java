package p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lfz0 implements jfz0 {
    public final mfz0 a;
    public final gfz0 b;
    public final io4 c;

    public lfz0(mfz0 mfz0Var, gfz0 gfz0Var, io4 io4Var) {
        this.a = mfz0Var;
        this.b = gfz0Var;
        this.c = io4Var;
    }

    public static ArrayList b(tl51 tl51Var) {
        List list = tl51Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ql51) it.next()).a);
        }
        return arrayList;
    }

    public final Single a() {
        Single map;
        int iOrdinal = this.c.a().ordinal();
        if (iOrdinal != 0) {
            mfz0 mfz0Var = this.a;
            if (iOrdinal == 1) {
                map = mfz0Var.c().map(new v9c(this, (byte) 21));
            } else if (iOrdinal == 2) {
                map = mfz0Var.a().map(new ubc(this, (byte) 21));
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                map = mfz0Var.b().map(new nbc(this, (byte) 21));
            }
        } else {
            Single singleA = this.b.a();
            kfz0 kfz0Var = kfz0.b;
            map = singleA.map(new xgc((byte) 21));
        }
        map.getClass();
        return map;
    }
}
