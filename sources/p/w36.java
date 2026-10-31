package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w36 extends t980 {
    public final /* synthetic */ byte d = 1;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w36(d46 d46Var) {
        super(d46Var.c);
        this.e = d46Var;
    }

    @Override // p.t980
    public final Object a(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((y36) obj).i(i);
            default:
                return ((d46) obj).b[i];
        }
    }

    @Override // p.t980
    public final void b(int i) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                ((y36) obj).g(i);
                break;
            default:
                ((d46) obj).b(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w36(y36 y36Var) {
        super(((jv81) y36Var).c);
        this.e = y36Var;
    }
}
