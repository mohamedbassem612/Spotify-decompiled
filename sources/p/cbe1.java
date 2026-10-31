package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cbe1 extends hab0 implements xu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kee1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ kee1 f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cbe1(String str, String str2, kee1 kee1Var, String str3, String str4, kee1 kee1Var2, int i) {
        super(3);
        this.a = str;
        this.b = str2;
        this.c = kee1Var;
        this.d = str3;
        this.e = str4;
        this.f = kee1Var2;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj2;
        String str = this.a;
        boolean zG = x340Var.g(str);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = new hqa1(str, (byte) 21);
            x340Var.s0(objT);
        }
        et40 et40Var = et40.a;
        o4p1.g(this.b, iko1.x(et40Var, (iu30) objT), this.c, 1, x340Var, 3072, 0);
        String str2 = this.d;
        boolean zG2 = x340Var.g(str2);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new hqa1(str2, (byte) 22);
            x340Var.s0(objT2);
        }
        o4p1.g(this.e, iko1.x(et40Var, (iu30) objT2), this.f, this.g, x340Var, 0, 0);
        return rih1.a;
    }
}
