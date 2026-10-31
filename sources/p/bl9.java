package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bl9 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wk9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl9(wk9 wk9Var, byte b) {
        super(3);
        this.a = b;
        this.b = wk9Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 2;
        rih1 rih1Var = rih1.a;
        wk9 wk9Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = wk9Var.c;
                if (str == null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1405492425);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1405674054);
                    Uri uri = Uri.parse(str);
                    cbx.a.getClass();
                    eso1.e(uri, isl.a, (qim0) null, (p3v) null, (zvx) null, uwr.d(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var3, 48, 0, 4060);
                    x340Var3.r(false);
                }
                break;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                long j = wk9Var.d / 1000;
                long j2 = j / 3600;
                long j3 = (j % 3600) / 60;
                long j4 = j % 60;
                String str2 = j2 > 0 ? String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3)) : String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
                uwr uwrVar = cbx.a;
                uwo1.e(str2, null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, null, null, 0, false, null, 0, null, b0kVar, 0, 0, 2034);
                break;
            case 2:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (!x340Var5.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var5.b0();
                } else {
                    zkt0 zkt0Var = wk9Var.f ? zkt0.a : zkt0.b;
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var5).g;
                    qim0 qim0VarR = u291.r(nim0.a, 16.0f);
                    cvx cvxVar = cbx.b(x340Var5).b;
                    wkt0.a(zkt0Var, uyn1.B(qim0VarR, 0.0f, 2.0f, 0.0f, 0.0f, 13), (ksl) null, 0L, false, x340Var5, 0, 28);
                }
                break;
            default:
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                uwr uwrVar3 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var6).g;
                boolean z = wk9Var.e;
                String str3 = wk9Var.b;
                if (!z) {
                    x340 x340Var7 = x340Var6;
                    x340Var7.i0(1535948613);
                    uwo1.e(wk9Var.b, null, lee1Var, cbx.a(x340Var7).b.a, null, null, 0, false, new cjc0(2), 0, null, x340Var7, 0, 0, 1778);
                    x340Var7.r(false);
                } else {
                    x340 x340Var8 = x340Var6;
                    x340Var8.i0(1534625223);
                    boolean zG = x340Var8.g(str3);
                    Object objT = x340Var8.T();
                    if (zG || objT == m4cVar) {
                        ye5 ye5Var = new ye5();
                        z6p1.r(ye5Var, "PlayIndicator", "�");
                        ye5Var.g(str3);
                        objT = ye5Var.p();
                        x340Var8.s0(objT);
                    }
                    af5 af5Var = (af5) objT;
                    zma1 zma1Var = lee1Var.a;
                    long j5 = zma1Var.b;
                    boolean zH = x340Var8.h(wk9Var.f) | x340Var8.f(j5);
                    Object objT2 = x340Var8.T();
                    if (zH || objT2 == m4cVar) {
                        long j6 = zma1Var.b;
                        fc11.o(j6);
                        objT2 = mqo1.t(new mmr0("PlayIndicator", new gh80(new d6t0(1, fc11.Y(TextUnit.c(j6) * 1.15f, j6 & 1095216660480L), zma1Var.b), new j2i(-140593780, new bl9(wk9Var, b2), true))));
                        x340Var8.s0(objT2);
                    }
                    uwo1.d(af5Var, cbx.a(x340Var8).c.c, null, lee1Var, null, null, 0, false, new cjc0(2), 0, null, (cqs0) objT2, x340Var8, 0, 0, 1780);
                    x340Var8.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
