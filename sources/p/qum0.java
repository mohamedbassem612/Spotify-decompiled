package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qum0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nl9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qum0(nl9 nl9Var, byte b) {
        super(1);
        this.a = b;
        this.b = nl9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        lnm lnmVar = null;
        nl9 nl9Var = this.b;
        switch (b) {
            case 0:
                r6k0 r6k0Var = new r6k0(((yo31) nl9Var.f).c(), (byte) 7);
                fum0 fum0Var = (fum0) nl9Var.b;
                String str = ((num0) obj).a;
                return new x010(r6k0Var, o4p1.r(new lt20(rqt0.u(new sii0(new k6e0(new xs4(yoi1.g(fum0Var.a.b(new oi("time_cap_multi_song_upsell_page", false, new fki0(str, (byte) 16)))), str, (byte) 10), (byte) 7), fum0Var, (byte) 5)), new i440(3, null, (byte) 14), (byte) 0), fum0Var.b), new dwf0(nl9Var, (lnm) null, (byte) 8), (byte) 1);
            case 1:
                return new oum0("", (String) nl9Var.h, (String) nl9Var.i, (String) nl9Var.t);
            default:
                ((qtr) obj).b(new f3((avl1) nl9Var, lnmVar, (byte) 18));
                return rih1.a;
        }
    }
}
