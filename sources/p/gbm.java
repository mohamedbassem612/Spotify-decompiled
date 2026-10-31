package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gbm extends k9 implements yl01 {
    public final /* synthetic */ byte c;
    public final ajn0 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gbm(Object obj, a8b0 a8b0Var, ajn0 ajn0Var, byte b) {
        super(a8b0Var);
        this.c = b;
        this.e = obj;
        this.d = ajn0Var;
    }

    public final String toString() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return getType() + ": Ctx { " + ((beg) obj) + " }";
            default:
                return "Cxt { " + ((hyc) obj) + " }";
        }
    }

    public final ajn0 v1() {
        switch (this.c) {
            case 0:
                break;
        }
        return this.d;
    }
}
