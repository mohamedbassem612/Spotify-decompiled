package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lm1 extends jsk {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm1(rqw rqwVar, byte b) {
        super(rqwVar);
        this.b = b;
    }

    @Override // p.jsk
    public /* bridge */ /* synthetic */ boolean e(Object obj) {
        switch (this.b) {
            case 0:
                return false;
            default:
                return super.e(obj);
        }
    }

    @Override // p.jsk
    public boolean f(Object obj, Object obj2) {
        switch (this.b) {
            case 1:
                List list = ((xeb1) obj2).b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((qpc1) it.next()).c != null) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return super.f(obj, obj2);
        }
    }
}
