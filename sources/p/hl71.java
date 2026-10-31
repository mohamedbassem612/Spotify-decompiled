package p;

import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class hl71 implements Parcelable {
    public final c380 a() {
        if (this instanceof fl71) {
            return ((fl71) this).a;
        }
        hhg1.n("Failed requirement.");
        return null;
    }

    public final bb71 b() {
        Object next;
        bb71 bb71Var;
        if ((this instanceof el71) || equals(gl71.a)) {
            bb71Var = null;
        } else {
            if (!(this instanceof fl71)) {
                eg.o();
                return null;
            }
            Iterator it = ((fl71) this).a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((bb71) next).a());
            bb71Var = (bb71) next;
        }
        if (bb71Var != null) {
            return bb71Var;
        }
        hhg1.n("No selected share menu preview data present");
        return null;
    }
}
