package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j61 extends hab0 implements xu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ yae1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ lee1 e;
    public final /* synthetic */ iec f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j61(int i, String str, yae1 yae1Var, String str2, lee1 lee1Var, iec iecVar, boolean z) {
        super(3);
        this.a = i;
        this.b = str;
        this.c = yae1Var;
        this.d = str2;
        this.e = lee1Var;
        this.f = iecVar;
        this.g = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        boolean z = false;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            int i = hjl.i(i2cVar.b) - this.a;
            if (i < 0) {
                i = 0;
            }
            String str = this.b;
            if (str != null) {
                if (yae1.a(this.c, this.d, this.e, 0, false, 1, jjl.b(0, i, 0, 0, 13), (flb0) null, (xat) null, 972).d()) {
                    z = true;
                }
            }
            iec iecVarA = this.f;
            if (z) {
                iecVarA = iec.a(iecVarA, gec.a(iecVarA.a, str, null, 14), gec.a(iecVarA.b, str, null, 14), (eec) null, 28);
            }
            kln1.l(iecVarA, null, this.g, new cjc0(z ? 1 : 2), false, null, null, x340Var2, 0, 114);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
