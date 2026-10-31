package p;

import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iah0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ mah0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iah0(mah0 mah0Var) {
        super(2);
        this.b = mah0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mah0 mah0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                o4o1.h(mah0Var, (b0k) obj, czo1.p(1));
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (mah0Var.f != 2) {
                    x340Var2.i0(1722042157);
                    uwo1.e(cwl1.o0(x340Var2, 2131957293), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1721825281);
                    uwr uwrVar = cbx.a;
                    xto1.e(anm1.N("match_review_saving", nim0.a), 2, cbx.a(x340Var2).b.a, 0L, x340Var2, 54, 8);
                    x340Var2.r(false);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iah0(mah0 mah0Var, int i) {
        super(2);
        this.b = mah0Var;
    }
}
