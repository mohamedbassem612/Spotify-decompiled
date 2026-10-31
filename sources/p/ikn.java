package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ikn extends hab0 implements iu30 {
    public final /* synthetic */ nbh X;
    public final /* synthetic */ ven0 Y;
    public final /* synthetic */ c380 a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ wn50 e;
    public final /* synthetic */ v361 f;
    public final /* synthetic */ zkn g;
    public final /* synthetic */ gv51 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ cb0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikn(c380 c380Var, c380 c380Var2, boolean z, ven0 ven0Var, wn50 wn50Var, v361 v361Var, zkn zknVar, gv51 gv51Var, iu30 iu30Var, cb0 cb0Var, nbh nbhVar, ven0 ven0Var2) {
        super(1);
        this.a = c380Var;
        this.b = c380Var2;
        this.c = z;
        this.d = ven0Var;
        this.e = wn50Var;
        this.f = v361Var;
        this.g = zknVar;
        this.h = gv51Var;
        this.i = iu30Var;
        this.t = cb0Var;
        this.X = nbhVar;
        this.Y = ven0Var2;
    }

    public final Object invoke(Object obj) {
        rtb0 rtb0Var = (rtb0) obj;
        ven0 ven0Var = this.d;
        List list = (List) ven0Var.getValue();
        rtb0Var.e(list.size(), new f1m(list, (byte) 8), new f1m(list, (byte) 9), new j2i(2039820996, new ot(list, this.e, (byte) 8), true));
        v361 v361Var = this.f;
        zkn zknVar = this.g;
        rtb0.c(rtb0Var, (Object) null, new j2i(174474652, new e6j(v361Var, zknVar, (byte) 14), true), 3);
        c380 c380Var = this.a;
        int size = c380Var.size();
        f1m f1mVar = new f1m(c380Var, (byte) 10);
        f1m f1mVar2 = new f1m(c380Var, (byte) 11);
        gv51 gv51Var = this.h;
        iu30 iu30Var = this.i;
        rtb0Var.e(size, f1mVar, f1mVar2, new j2i(2039820996, new a87(c380Var, gv51Var, zknVar, iu30Var, ven0Var, (byte) 2), true));
        c380 c380Var2 = this.b;
        boolean zIsEmpty = c380Var2.isEmpty();
        boolean z = this.c;
        if (!zIsEmpty || z) {
            rtb0.c(rtb0Var, (Object) null, ugi.a, 3);
        }
        if (z) {
            rtb0.c(rtb0Var, (Object) null, new j2i(586257162, new gkn(this.t, (byte) 0), true), 3);
        }
        rtb0Var.e(c380Var2.size(), new f1m(c380Var2, (byte) 12), new f1m(c380Var2, (byte) 13), new j2i(2039820996, new hkn((List) c380Var2, this.a, this.X, ven0Var, gv51Var, zknVar, iu30Var, this.Y), true));
        return rih1.a;
    }
}
