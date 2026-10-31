package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ww91 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ua91 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww91(ua91 ua91Var, byte b) {
        super(1);
        this.a = b;
        this.b = ua91Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ua91 ua91Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = (i8h1) ((kly0) ua91Var.b).get();
                zwk0 zwk0Var = (zwk0) ((idd1) ua91Var.e).getValue();
                zwk0Var.getClass();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), zwk0Var.b, zwk0Var.a, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            default:
                ((Number) obj).intValue();
                return ((zwk0) ((idd1) ua91Var.e).getValue()).b();
        }
    }
}
