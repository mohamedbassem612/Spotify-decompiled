package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s3l extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ lee1 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3l(z3l z3lVar, qim0 qim0Var, boolean z, boolean z2, lee1 lee1Var, long j, long j2, String str, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z3lVar;
        this.c = qim0Var;
        this.d = z;
        this.e = z2;
        this.f = lee1Var;
        this.g = j;
        this.h = j2;
        this.i = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qxy0.d((z3l) obj5, (qim0) obj4, this.d, this.e, this.f, this.g, this.h, (String) obj3, (b0k) obj, czo1.p(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                qxy0.d((z3l) obj5, (qim0) obj4, this.d, this.e, this.f, this.g, this.h, (String) obj3, (b0k) obj, iP);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    cwl1.b(anm1.N("browse_category_card", nim0.a), (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(303774293, new iim1((iu30) obj5, (h7e) obj4, this.g, this.d, (yae1) obj3, this.f, this.e, this.h), x340Var2), x340Var2, 0, 48, 2030);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3l(iu30 iu30Var, h7e h7eVar, long j, boolean z, yae1 yae1Var, lee1 lee1Var, boolean z2, long j2) {
        super(2);
        this.a = (byte) 2;
        this.b = iu30Var;
        this.c = h7eVar;
        this.g = j;
        this.d = z;
        this.i = yae1Var;
        this.f = lee1Var;
        this.e = z2;
        this.h = j2;
    }
}
