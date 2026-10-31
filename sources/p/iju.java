package p;

import com.spotify.adsinternal.adscore.model.Format;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iju implements dsw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ iju(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.dsw
    public final boolean accept(Object obj) {
        switch (this.a) {
            case 0:
                ji0 ji0Var = (ji0) o7h.s0((List) obj);
                return (ji0Var != null ? ji0Var.Z : null) == Format.BANNER;
            default:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return false;
                }
                List<ji0> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (ji0 ji0Var2 : list2) {
                        if ((!u890.j(ji0Var2.W0, "leavebehind") && !u890.j(ji0Var2.W0, "sponsored_playlist")) || ji0Var2.Z != Format.BANNER) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // p.dsw
    public final kpg0 element() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new kpg0(((o290) obj2).a((aiu) obj), wiu.d);
            default:
                return new kpg0(((m1q) obj2).a((uxb0) obj), zib0.d1);
        }
    }
}
