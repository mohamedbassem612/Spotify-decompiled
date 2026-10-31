package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lgj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hn61 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lgj(hn61 hn61Var, byte b) {
        super(2);
        this.a = b;
        this.b = hn61Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hn61 hn61Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Uri uri = Uri.parse(hn61Var.a);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var2).f;
                    eso1.e(uri, isl.a, i1p1.q(nim0.a, er31.b(8.0f)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 224304, 0, 4032);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwo1.e(hn61Var.b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    uwo1.e(hn61Var.e, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    uwo1.e(hn61Var.f, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                }
                break;
        }
        return rih1Var;
    }
}
