package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pie0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pie0(et9 et9Var, byte b) {
        super(1);
        this.a = b;
        this.b = et9Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        et9 et9Var = this.b;
        switch (b) {
            case 0:
                ((tso) et9Var.g).a.e = new p350(0, (boe0) et9Var.h, boe0.class, "logClose", "logClose()V", 0, (byte) 15);
                return new k6r(et9Var, (byte) 20);
            case 1:
                return (h3h1) et9Var.j;
            default:
                ((Number) obj).intValue();
                return ((boe0) et9Var.h).b.b();
        }
    }
}
