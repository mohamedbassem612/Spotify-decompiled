package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ehc0 implements pzf0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ehc0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final zob1 a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                dhc0 dhc0Var = (dhc0) ((ynb0) obj2).get();
                dhc0Var.getClass();
                return gio1.b(new bzf0(dhc0Var, rih1.a, dhc0Var.e));
            case 1:
                ttn0 ttn0Var = (ttn0) obj;
                xpw xpwVar = (xpw) ((ynb0) obj2).get();
                int iC = l1d.C(ttn0Var.a);
                int i = 1;
                if (iC != 0) {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2;
                }
                return gio1.b(new bzf0(xpwVar, new wsn0(i, ttn0Var.b), gio1.b(Boolean.TRUE)));
            default:
                zyo0 zyo0Var = (zyo0) ((kly0) obj2).get();
                zyo0Var.getClass();
                return gio1.b(new bzf0(zyo0Var, new xyo0(((q6p0) obj).a.a), zyo0Var.c));
        }
    }
}
