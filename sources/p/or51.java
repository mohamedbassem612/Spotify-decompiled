package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class or51 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dw91 b;
    public final /* synthetic */ c220 c;
    public final /* synthetic */ vu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or51(dw91 dw91Var, c220 c220Var, vu30 vu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = dw91Var;
        this.c = c220Var;
        this.d = vu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.d;
        c220 c220Var = this.c;
        dw91 dw91Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                String str2 = c220Var.a;
                dw91Var.put(str2, str);
                vu30Var.invoke(str2, str);
                break;
            default:
                int iIntValue = ((Number) obj).intValue();
                String str3 = c220Var.a;
                dw91Var.put(str3, String.valueOf(iIntValue));
                vu30Var.invoke(str3, String.valueOf(iIntValue));
                break;
        }
        return rih1Var;
    }
}
