package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p4w extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tyq b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4w(tyq tyqVar, List list, int i, byte b) {
        super(2);
        this.a = b;
        this.b = tyqVar;
        this.c = list;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        List list = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c(this.b, list.get(i), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    otw.c(this.b, list.get(i), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                }
                break;
        }
        return rih1Var;
    }
}
