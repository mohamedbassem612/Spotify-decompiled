package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jb81 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb81(s24 s24Var, byte b) {
        super(4);
        this.a = b;
        this.b = s24Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s24 s24Var = this.b;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                int i = (iIntValue & 6) == 0 ? (x340Var.g(str) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.g(str2) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                } else {
                    otw.c((utj0) ((idd1) s24Var.Z).getValue(), new ttj0(str, str2), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                }
                break;
            default:
                b0k b0kVar = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                bpo1.g((String) obj, (ie60) obj2, apo.r(-458479460, new ib81(s24Var, (byte) 0), b0kVar), apo.r(470680635, new ib81(s24Var, (byte) 1), b0kVar), apo.r(1407194015, new jb81(s24Var, objArr == true ? 1 : 0), b0kVar), apo.r(-1965966471, new ib81(s24Var, (byte) 2), b0kVar), b0kVar, (iIntValue2 & 14) | 224640 | (iIntValue2 & 112));
                break;
        }
        return rih1Var;
    }
}
