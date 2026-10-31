package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class smm extends v9 {
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ smm(qe41 qe41Var, Object obj, byte b) {
        super(qe41Var);
        this.c = b;
        this.d = obj;
    }

    public final xbk1 e(fe41 fe41Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return new rmm(fe41Var, (dc31) obj);
            default:
                return new dwe0(fe41Var, (i5u) obj);
        }
    }
}
