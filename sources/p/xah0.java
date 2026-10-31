package p;

import com.spotify.libraryimportservice.tmm.ItemAlternative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xah0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ItemAlternative b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xah0(ItemAlternative itemAlternative, byte b) {
        super(3);
        this.a = b;
        this.b = itemAlternative;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ItemAlternative itemAlternative = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    String subtitle = itemAlternative.getSubtitle();
                    uwr uwrVar = cbx.a;
                    uwo1.e(subtitle, (qim0) null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var2, 1572864, 0, 1714);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String title = itemAlternative.getTitle();
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(title, (qim0) null, cbx.d(x340Var4).g, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var4, 1572864, 0, 1722);
                }
                break;
        }
        return rih1Var;
    }
}
