package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dl20 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pbq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl20(pbq pbqVar, byte b) {
        super(1);
        this.a = b;
        this.b = pbqVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        pbq pbqVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return ((xok0) pbqVar.e).b();
            case 1:
                i8h1 i8h1Var = (i8h1) pbqVar.b;
                xok0 xok0Var = (xok0) pbqVar.e;
                xok0Var.getClass();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), xok0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            default:
                return new hp0(((los) pbqVar.g).c(new dl20(pbqVar, b2)), (byte) 7);
        }
    }
}
