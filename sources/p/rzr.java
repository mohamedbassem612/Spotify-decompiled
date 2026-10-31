package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rzr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tzr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzr(tzr tzrVar, byte b) {
        super(1);
        this.a = b;
        this.b = tzrVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tzr tzrVar = this.b;
        switch (b) {
            case 0:
                v130 v130Var = (v130) obj;
                String str = v130Var.c instanceof t130 ? v130Var.b : null;
                return str != null ? d3p1.F(cwl1.C((q7r0) tzrVar.d.b), usm1.a, str) : w130.a;
            default:
                ((qtr) obj).b(new lu(tzrVar.e, null, (byte) 25));
                return rih1.a;
        }
    }
}
