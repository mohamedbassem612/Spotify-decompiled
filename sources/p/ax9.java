package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ax9 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ int b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax9(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                ax9 ax9Var = new ax9(b2, (lnm) obj3, (byte) 0);
                ax9Var.c = (String) obj;
                ax9Var.b = iIntValue;
                return ax9Var.invokeSuspend(rih1Var);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                ax9 ax9Var2 = new ax9(b2, (lnm) obj3, (byte) 1);
                ax9Var2.b = iIntValue2;
                ax9Var2.c = (l160) obj2;
                return ax9Var2.invokeSuspend(rih1Var);
            case 2:
                int iIntValue3 = ((Number) obj2).intValue();
                ax9 ax9Var3 = new ax9(b2, (lnm) obj3, (byte) 2);
                ax9Var3.c = (ly50) obj;
                ax9Var3.b = iIntValue3;
                return ax9Var3.invokeSuspend(rih1Var);
            default:
                int iIntValue4 = ((Number) obj2).intValue();
                ax9 ax9Var4 = new ax9(b2, (lnm) obj3, b2);
                ax9Var4.c = (aw31) obj;
                ax9Var4.b = iIntValue4;
                return ax9Var4.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) this.c;
                int i = this.b;
                hm5.M(obj);
                str.getClass();
                return new xw9(str, i);
            case 1:
                int i2 = this.b;
                l160 l160Var = (l160) this.c;
                hm5.M(obj);
                return new e360(i2, l160Var);
            case 2:
                ly50 ly50Var = (ly50) this.c;
                int i3 = this.b;
                hm5.M(obj);
                return ly50.a(ly50Var, (iy50) null, true, false, 0, false, (px50) null, new by50(i3), 185);
            default:
                aw31 aw31Var = (aw31) this.c;
                int i4 = this.b;
                hm5.M(obj);
                uv31 uv31Var = (uv31) aw31Var;
                ArrayList arrayList = uv31Var.h;
                return new zbg1(i4, arrayList.isEmpty() ? uv31Var.e.length() : ((tv31) arrayList.get(hxo1.o(arrayList, i4, l801.b))).b);
        }
    }
}
