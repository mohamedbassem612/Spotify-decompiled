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
import com.spotify.highlightsstats.data.proto.v2.StatsDetailsResponse;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t4o implements Function, lzy {
    public final /* synthetic */ byte a;
    public String b;

    public t4o(qo91 qo91Var, String str) {
        this.a = (byte) 10;
        this.b = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String b(String str, int i, x340 x340Var) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340Var.i0(1523963952);
            x340Var.r(false);
            return str;
        }
        if (iC == 1) {
            x340Var.i0(1523955828);
            String strN0 = cwl1.n0(2131960010, new Object[]{str}, x340Var);
            x340Var.r(false);
            return strN0;
        }
        if (iC != 2) {
            throw p3d1.k(x340Var, 1523953263, false);
        }
        x340Var.i0(1523960118);
        String strN1 = cwl1.n0(2131960006, new Object[]{str}, x340Var);
        x340Var.r(false);
        return strN1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String c(String str, int i, int i2, x340 x340Var, int i3) throws NoWhenBranchMatchedException {
        int i4;
        x340Var.i0(355427183);
        if (i == 1) {
            x340Var.i0(1436979983);
            String strB = b(str, i2, x340Var);
            x340Var.r(false);
            x340Var.r(false);
            return strB;
        }
        x340Var.i0(1437045331);
        x340Var.r(false);
        int i5 = i - 1;
        int iC = l1d.C(i2);
        if (iC == 0) {
            i4 = 2131820798;
        } else if (iC == 1) {
            i4 = 2131820799;
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            i4 = 2131820797;
        }
        String strU = cwl1.U(i4, i5, new Object[]{str, Integer.valueOf(i5)}, x340Var);
        x340Var.r(false);
        return strU;
    }

    public static af5 d(String str, String str2, Integer num, x340 x340Var, int i) {
        Integer num2 = (i & 4) != 0 ? null : num;
        ye5 ye5VarO = kk0.o(1685649689, x340Var);
        StringBuilder sb = ye5VarO.a;
        ye5VarO.g(str);
        int iW0 = ihc1.w0(str2, "%1$s", 0, false, 6);
        int length = iW0 == -1 ? sb.length() : iW0;
        uwr uwrVar = cbx.a;
        ye5VarO.d(new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), 0, length);
        Integer numValueOf = num2 != null ? Integer.valueOf(num2.intValue() + iW0) : null;
        if (iW0 == -1 || numValueOf == null || numValueOf.intValue() >= sb.length()) {
            x340Var.i0(85601037);
            x340Var.r(false);
        } else {
            x340Var.i0(85471116);
            ye5VarO.d(new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), numValueOf.intValue(), sb.length());
            x340Var.r(false);
        }
        af5 af5VarP = ye5VarO.p();
        x340Var.r(false);
        return af5VarP;
    }

    public mr20 a() {
        return new huz(this.b, (byte) 10);
    }

    public Object apply(Object obj) {
        u740 u740Var;
        List list;
        kn71 kn71Var;
        boolean z = false;
        switch (this.a) {
            case 1:
                f7h f7hVar = (f7h) ((Map) obj).get(this.b);
                if (f7hVar != null && f7hVar.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
            default:
                StatsDetailsResponse statsDetailsResponse = (StatsDetailsResponse) obj;
                String str = this.b;
                int iO = statsDetailsResponse.o();
                int i = iO == 0 ? -1 : shi1.a[l1d.C(iO)];
                f371 f371VarS = d371.a;
                if (i == 1) {
                    if (statsDetailsResponse.C() && statsDetailsResponse.w().q()) {
                        f371VarS = cyo1.s(statsDetailsResponse.w().o(), str);
                    }
                    kn71Var = kn71.d;
                } else if (i != 2) {
                    kn71Var = kn71.b;
                } else {
                    if (statsDetailsResponse.B() && statsDetailsResponse.v().q()) {
                        f371VarS = cyo1.s(statsDetailsResponse.v().o(), str);
                    }
                    kn71Var = kn71.e;
                }
                n2f1 n2f1Var = new n2f1(f371VarS, statsDetailsResponse.getDate(), statsDetailsResponse.n().getId(), kn71Var);
                try {
                    smc0 smc0VarN = k4p1.n();
                    if (statsDetailsResponse.o() == 4) {
                        smc0VarN.add(kcd0.a);
                    }
                    int iO2 = statsDetailsResponse.o();
                    d761 d761VarA = b761.a(statsDetailsResponse.p());
                    d761 d761VarA2 = statsDetailsResponse.A() ? b761.a(statsDetailsResponse.u()) : null;
                    int iC = l1d.C(iO2);
                    smc0VarN.addAll(p7h.M(new dtb1[]{new qxc1(d761VarA, d761VarA2, null, null, null, (iC == 3 || iC == 4) ? 2131963595 : null, 28), emu.a}));
                    smc0VarN.addAll(pro1.o(statsDetailsResponse));
                    return new vhi1(k4p1.k(smc0VarN), n2f1Var);
                } catch (Throwable th) {
                    return n3o1.t(th);
                }
            case 3:
                v740 v740Var = ((uv00) obj).a(v740.class, this.b).b;
                return (v740Var == null || (u740Var = (u740) o7h.s0(v740Var.a)) == null) ? MaybeEmpty.a : Maybe.e(u740Var);
            case 4:
                ez00 ez00Var = ((uv00) ((Timed) obj).a).a(va81.class, this.b).b;
                return ez00Var != null ? Observable.just(ez00Var) : Observable.empty();
            case 5:
                f7h f7hVar2 = (f7h) ((Map) obj).get(this.b);
                return Boolean.valueOf(f7hVar2 != null ? f7hVar2.a : true);
            case 6:
                String str2 = this.b;
                g281 g281Var = (g281) ((Map) obj).get(str2);
                return g281Var != null ? Maybe.e(g281.a(g281Var, str2)) : MaybeEmpty.a;
            case 7:
                f7h f7hVar3 = (f7h) ((Map) obj).get(this.b);
                return Boolean.valueOf(f7hVar3 != null ? f7hVar3.c : false);
            case 8:
                return this.b;
            case 9:
                f7h f7hVar4 = (f7h) ((Map) obj).get(this.b);
                if (f7hVar4 != null && f7hVar4.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                wsc0 wsc0Var = (wsc0) ((py21) obj).c();
                if (wsc0Var == null || (list = wsc0Var.e) == null) {
                    return z6x.a;
                }
                ArrayList<zuc0> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    zuc0 zuc0Var = (zuc0) obj2;
                    if (zuc0Var.e) {
                        Set set = s4b1.f;
                        if (uic.x(zuc0Var.c).c == blc0.ti) {
                            arrayList.add(obj2);
                        }
                    }
                }
                String str3 = this.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (zuc0 zuc0Var2 : arrayList) {
                    String str4 = zuc0Var2.c;
                    String str5 = zuc0Var2.a;
                    String str6 = zuc0Var2.i;
                    fjf1 fjf1Var = zuc0Var2.p;
                    String strY0 = fjf1Var instanceof fjf1 ? o7h.y0(fjf1Var.b, ", ", (String) null, (String) null, fe91.R0, 30) : "";
                    String str7 = (String) zuc0Var2.r.getValue();
                    arrayList2.add(new kjf1(str4, str5, str6, strY0, zuc0Var2.a(1), str3, str7 == null ? "" : str7));
                }
                return arrayList2;
        }
    }

    public /* synthetic */ t4o(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
