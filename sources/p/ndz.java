package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ndz implements ey31 {
    public final /* synthetic */ byte a;
    public final qdy0 b;
    public final Object c;
    public final Object d;

    public /* synthetic */ ndz(qdy0 qdy0Var, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = qdy0Var;
        this.c = obj;
        this.d = obj2;
    }

    public final fy31 a(ViewGroup viewGroup) {
        byte b = this.a;
        qdy0 qdy0Var = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                boolean z = qdy0Var.b;
                return new odz(z, ((pp) obj).a(new s9z(1, z)), (ufs) obj2);
            default:
                return new b2g1(((igx) obj2).a(new xwf1((umf0) obj)), qdy0Var.a);
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return bv31.class;
            default:
                return wv31.class;
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return 5;
            default:
                return 2;
        }
    }
}
