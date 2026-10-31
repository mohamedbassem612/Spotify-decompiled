package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lar0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mar0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lar0(mar0 mar0Var, byte b) {
        super(1);
        this.a = b;
        this.b = mar0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        mar0 mar0Var = this.b;
        switch (b) {
            case 0:
                mar0Var.b = null;
                return rih1.a;
            default:
                ehr0 ehr0Var = (ehr0) obj;
                return Boolean.valueOf(ehr0Var instanceof bos0 ? mar0Var.b(ehr0Var) : false);
        }
    }
}
