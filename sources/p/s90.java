package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s90 implements mr20 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ mr20 c;
    public final /* synthetic */ Object d;

    public s90(hs6 hs6Var, boolean z, dn60 dn60Var) {
        this.c = hs6Var;
        this.b = z;
        this.d = dn60Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        boolean z = this.b;
        hs6 hs6Var = this.c;
        switch (b) {
            case 0:
                Object objCollect = ((xe01) hs6Var).a.collect(new r90(vr20Var, (String) obj, z, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = hs6Var.collect(new heb(vr20Var, z, (dn60) obj, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }

    public s90(xe01 xe01Var, String str, boolean z) {
        this.c = xe01Var;
        this.d = str;
        this.b = z;
    }
}
