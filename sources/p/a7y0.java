package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a7y0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c7y0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7y0(c7y0 c7y0Var, byte b) {
        super(1);
        this.a = b;
        this.b = c7y0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        c7y0 c7y0Var = this.b;
        switch (b) {
            case 0:
                return new wzv0(c7y0Var.f.h.o(c7y0Var.c), (byte) 5);
            default:
                return new rxc0(c7y0Var.c);
        }
    }
}
