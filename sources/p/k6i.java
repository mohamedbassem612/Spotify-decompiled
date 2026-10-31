package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k6i implements xu30 {
    public static final k6i b = new k6i(0);
    public static final k6i c = new k6i(1);
    public static final k6i d = new k6i(2);
    public static final k6i e = new k6i(3);
    public static final k6i f = new k6i(4);
    public static final k6i g = new k6i(5);
    public static final k6i h = new k6i(6);
    public static final k6i i = new k6i(7);
    public static final k6i t = new k6i(8);
    public final /* synthetic */ byte a;

    public /* synthetic */ k6i(byte b2) {
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                bs91 bs91Var = (bs91) obj;
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var7.g(bs91Var) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    sok.k(bs91Var, (qim0) null, (xu30) null, x340Var8, iIntValue4 & 14, 6);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                wr91 wr91Var = (wr91) obj;
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= x340Var9.g(wr91Var) ? 4 : 2;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    brl.j(wr91Var, (qim0) null, (hw61) null, 0L, 0L, 0L, 0L, 0L, x340Var10, iIntValue5 & 14);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                DrawScope drawScope = (DrawScope) obj;
                long j = ((Offset) obj2).a;
                long j2 = ((u7h) obj3).a;
                lb91 lb91Var = lb91.a;
                DrawScope.b0(drawScope, j2, drawScope.X0(4.0f) / 2.0f, j, 0.0f, (DrawStyle) null, 120);
            case 5:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                return rih1Var;
            default:
                x340 x340Var11 = ((k891) obj).a;
                ((Number) obj3).intValue();
                int iHashCode = Integer.hashCode(tgp1.k((b0k) obj2));
                x340Var11.j0(509942095);
                hzj.A.getClass();
                nko1.H(nim0.a, x340Var11, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var11, y580.R0);
                x340Var11.r(false);
                return rih1Var;
        }
    }
}
