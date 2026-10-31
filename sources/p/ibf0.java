package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ibf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kbf0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibf0(kbf0 kbf0Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = kbf0Var;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = this.c;
        kbf0 kbf0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return Boolean.valueOf(kbf0Var.k(i, ((Number) obj).longValue()));
    }
}
