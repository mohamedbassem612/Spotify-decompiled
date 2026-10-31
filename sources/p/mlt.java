package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mlt extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ llt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mlt(llt lltVar, byte b) {
        super(1);
        this.a = b;
        this.b = lltVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        llt lltVar = this.b;
        switch (b) {
            case 0:
                int i = (int) (((yr80) obj).a & 4294967295L);
                bpb1 bpb1Var = lltVar.f.a;
                bpb1Var.m((Object) null, olt.a((olt) bpb1Var.getValue(), (String) null, false, false, Integer.valueOf(i), (Integer) null, 23));
                break;
            default:
                bpb1 bpb1Var2 = lltVar.f.a;
                bpb1Var2.m((Object) null, olt.a((olt) bpb1Var2.getValue(), (String) null, false, true, (Integer) null, (Integer) null, 27));
                break;
        }
        return rih1Var;
    }
}
