package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i2n0 implements rj71 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ i2n0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(k371 k371Var, st21 st21Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wa71 wa71Var = k371Var.a;
                return wa71Var == null ? Boolean.FALSE : ((hce1) obj).x(wa71Var, st21Var);
            default:
                List list = k371Var.d;
                Class cls = (Class) obj;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (cls.isInstance((m371) it.next())) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
