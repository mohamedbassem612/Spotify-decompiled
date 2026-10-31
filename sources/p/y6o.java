package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y6o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z6o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6o(z6o z6oVar, byte b) {
        super(1);
        this.a = b;
        this.b = z6oVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        z6o z6oVar = this.b;
        switch (b) {
            case 0:
                gxb gxbVar = (hxb) obj;
                if ((gxbVar instanceof gxb ? gxbVar : null) != null) {
                    i8h1 i8h1Var = z6oVar.f;
                    h4l0 h4l0Var = z6oVar.h;
                    b7x b7xVar = b7x.a;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), h4l0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                return rih1.a;
            default:
                return new hp0(z6oVar.e.c(new y6o(z6oVar, (byte) 0)), (byte) 5);
        }
    }
}
