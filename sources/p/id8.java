package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class id8 implements ey31 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final u0i c;

    public /* synthetic */ id8(Object obj, u0i u0iVar, byte b) {
        this.a = b;
        this.b = obj;
        this.c = u0iVar;
    }

    public final fy31 a(ViewGroup viewGroup) {
        byte b = this.a;
        yfx yfxVar = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new ld8(((pp) yfxVar).a(null), (ufs) obj);
            default:
                return new jh3((Context) obj, yfxVar.a((l0i) null));
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return yu31.class;
            default:
                return pv31.class;
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return 7;
            default:
                return 8;
        }
    }
}
