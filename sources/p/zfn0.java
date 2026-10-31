package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zfn0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zfn0(et90 et90Var, byte b) {
        super(1);
        this.a = b;
        this.b = et90Var;
    }

    public final Object invoke(Object obj) {
        x010 huzVar;
        bpb1 huzVar2;
        byte b = this.a;
        et90 et90Var = this.b;
        switch (b) {
            case 0:
                ubw0 ubw0Var = (ubw0) et90Var.c;
                if (ubw0Var == null || (huzVar = ubw0Var.i()) == null) {
                    huzVar = new huz((Object) null, (byte) 10);
                }
                ubw0 ubw0Var2 = (ubw0) et90Var.e;
                if (ubw0Var2 == null || (huzVar2 = ubw0Var2.c()) == null) {
                    huzVar2 = new huz(Boolean.FALSE, (byte) 10);
                }
                return new x010(new ht20(huzVar, new pk50(2, (lnm) null, (byte) 12)), huzVar2, new agn0(3, null, (byte) 0), (byte) 1);
            default:
                ((qtr) obj).b(new k1(et90Var, (lnm) null, (byte) 22));
                return rih1.a;
        }
    }
}
