package p;

import com.spotify.libraryimportservice.tmm.UnmatchedItem;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wah0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UnmatchedItem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wah0(UnmatchedItem unmatchedItem, byte b) {
        super(3);
        this.a = b;
        this.b = unmatchedItem;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        UnmatchedItem unmatchedItem = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    r4o1.t(unmatchedItem.getImageUrl(), x340Var2, 0);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String subtitle = unmatchedItem.getSubtitle();
                    uwr uwrVar = cbx.a;
                    uwo1.e(subtitle, (qim0) null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var4, 1572864, 0, 1714);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                } else {
                    r4o1.t(unmatchedItem.getImageUrl(), x340Var6, 0);
                }
                break;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x340Var8.b0();
                } else {
                    String subtitle2 = unmatchedItem.getSubtitle();
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(subtitle2, (qim0) null, cbx.d(x340Var8).j, cbx.a(x340Var8).b.b, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var8, 1572864, 0, 1714);
                }
                break;
            default:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x340Var10.b0();
                } else {
                    String title = unmatchedItem.getTitle();
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(title, (qim0) null, cbx.d(x340Var10).g, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var10, 1572864, 0, 1722);
                }
                break;
        }
        return rih1Var;
    }
}
