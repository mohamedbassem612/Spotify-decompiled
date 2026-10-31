package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jdl extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kdl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jdl(kdl kdlVar, byte b) {
        super(3);
        this.a = b;
        this.b = kdlVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kdl kdlVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                c921.a(kdlVar.e, (b0k) obj2, 0);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = kdlVar.d;
                if (str != null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1874876486);
                    String strN0 = cwl1.n0(2131952810, new Object[]{str}, x340Var2);
                    int iW0 = ihc1.w0(strN0, str, 0, false, 6);
                    x340Var2.i0(-1445947708);
                    StringBuilder sb = new StringBuilder(16);
                    ArrayList arrayListM = xvj1.m();
                    new ArrayList();
                    sb.append(strN0);
                    if (iW0 >= 0) {
                        x340Var2.i0(695978407);
                        uwr uwrVar = cbx.a;
                        arrayListM.add(new xe5(iW0, str.length() + iW0, 8, new zma1(cbx.a(x340Var2).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), (String) null));
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(696157153);
                        x340Var2.r(false);
                    }
                    String string = sb.toString();
                    ArrayList arrayList = new ArrayList(arrayListM.size());
                    int size = arrayListM.size();
                    for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                    }
                    af5 af5Var = new af5(string, arrayList);
                    x340Var2.r(false);
                    uwr uwrVar2 = cbx.a;
                    uwo1.d(af5Var, cbx.a(x340Var2).b.b, (qim0) null, cbx.d(x340Var2).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 4084);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1874255711);
                    String str2 = kdlVar.c;
                    uwr uwrVar3 = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var3).j, cbx.a(x340Var3).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2034);
                    x340Var3.r(false);
                }
                return rih1Var;
            case 2:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                cdl cdlVar = kdlVar.f;
                boolean zEquals = cdlVar.equals(zcl.a);
                nim0 nim0Var = nim0.a;
                isl islVar = isl.a;
                if (zEquals) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(288437441);
                    hrx hrxVar = hrx.c;
                    uwr uwrVar4 = cbx.a;
                    long j = cbx.a(x340Var5).b.b;
                    zov0 zov0Var = cbx.b(x340Var5).g;
                    w0h1.a(hrxVar, islVar, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var5, hrx.d | 48, 48);
                    x340Var5.r(false);
                } else if (cdlVar.equals(adl.a)) {
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(288737056);
                    knx knxVar = knx.c;
                    uwr uwrVar5 = cbx.a;
                    long j2 = cbx.a(x340Var6).b.b;
                    zov0 zov0Var2 = cbx.b(x340Var6).g;
                    w0h1.a(knxVar, islVar, u291.r(nim0Var, 16.0f), j2, 0L, false, x340Var6, knx.d | 48, 48);
                    x340Var6.r(false);
                } else {
                    if (!(cdlVar instanceof bdl)) {
                        throw p3d1.k(x340Var4, -544887519, false);
                    }
                    x340 x340Var7 = x340Var4;
                    x340Var7.i0(-544865519);
                    anm1.c(((bdl) cdlVar).a, (iu30) null, (qim0) null, (max) null, (idn0) null, x340Var7, 48, 28);
                    x340Var7.r(false);
                }
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str3 = kdlVar.b;
                uwr uwrVar6 = cbx.a;
                uwo1.e(str3, (qim0) null, cbx.d(b0kVar).g, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2034);
                return rih1Var;
        }
    }
}
