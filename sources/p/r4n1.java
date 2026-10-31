package p;

import com.spotify.nowplaying.uiusecases.carousel.horizontalvideo.ZoomableView;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r4n1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4n1(Object obj, int i, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                g2t0 g2t0Var = ((ZoomableView) obj2).T0;
                if (g2t0Var != null) {
                    i8h1 i8h1Var = g2t0Var.a;
                    yok0 yok0Var = g2t0Var.b;
                    z7h1 z7h1Var = new z7h1("pinch", 1, b7x.a);
                    String strValueOf = String.valueOf(i);
                    if (strValueOf == null) {
                        strValueOf = "";
                    }
                    mmr0 mmr0Var = new mmr0("start_size_px", strValueOf);
                    String strValueOf2 = String.valueOf(iIntValue);
                    i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("ui_resize", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("end_size_px", strValueOf2 != null ? strValueOf2 : "")})), yok0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
            default:
                ji50 ji50Var = (ji50) obj;
                ng20 ng20Var = new ng20(new kpg0(new w460(false, (kl9) null, (yc11) null, 61), hzg1.c1));
                lbg1 lbg1Var = lbg1.U0;
                LinkedHashMap linkedHashMap = ji50Var.b;
                linkedHashMap.put(smh1.class, new b7t0(new cdk1(ng20Var), lbg1Var));
                linkedHashMap.put(tmh1.class, new r3r(new xzq(((rmh1) obj2).d.a(ji50Var.a), hzg1.d1), new zxd1((byte) 2, i, false), 4));
                break;
        }
        return rih1Var;
    }
}
