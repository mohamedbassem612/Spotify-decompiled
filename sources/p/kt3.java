package p;

import androidx.compose.ui.graphics.Brush;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kt3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(int i, String str, String str2, dzo1 dzo1Var, Function0 function0, idn0 idn0Var, String str3, vnr0 vnr0Var) {
        super(2);
        this.a = (byte) 21;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = dzo1Var;
        this.h = function0;
        this.i = idn0Var;
        this.c = str3;
        this.b = vnr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.c;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                i1k0.a((hb51) obj9, (umf0) obj8, (pt3) obj7, (pt3) obj5, (ldo) obj4, (iu30) obj6, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                hm5.c((mhg1) obj9, (qim0) obj3, (iu30) obj6, (tl3) obj8, (iu30) obj7, (iu30) obj5, (zu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                fq7.a((mhg1) obj9, (iu30) obj6, (qim0) obj3, (bby) obj8, (ln00) obj7, (vu30) obj5, (xu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((cab) obj9).j((c380) obj8, (xtb0) obj7, (zob1) obj5, (plt) obj4, (h3h1) obj6, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                t4n1.a((vrc) obj9, (String) obj8, (iu30) obj6, (iu30) obj7, (Function0) obj5, (lz20) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                dgo1.b((hvp0) obj9, (c380) obj8, (tyq) obj7, (iu30) obj6, (vzq0) obj5, (qim0) obj3, (vu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                irn1.C((String) obj9, (iu30) obj6, (iu30) obj8, (Function0) obj7, (qim0) obj3, (Integer) obj5, (String) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                j0o1.h((mya0) obj9, (String) obj8, (shg1) obj7, (iu30) obj6, (vzq0) obj5, (es41) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                o0p1.f((String) obj9, (LocalDateTime) obj8, (ZoneId) obj7, (Locale) obj5, (String) obj4, (iu30) obj6, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                f5p1.d((x9e0) obj9, (String) obj8, (Function0) obj7, (Function0) obj5, (yqg) obj4, (zja1) obj6, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                kln1.a((h7g0) obj9, (d0r) obj8, (pbq) obj7, (n8l0) obj5, (vzq0) obj4, (iu30) obj6, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                ((pek0) obj9).c((dub1) obj8, (c380) obj7, (c380) obj5, (vzq0) obj4, this.d, (Function0) obj6, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                ((rzo0) obj9).k((gfq0) obj8, (th61) obj7, (ods) obj5, (r1q0) obj4, (hzn0) obj6, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                kno1.b((String) obj9, (String) obj8, (String) obj7, (String) obj5, (e7s0) obj4, (Function0) obj6, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                no80.e((t220) obj9, (hds0) obj8, (gpv0) obj7, (iu30) obj6, (mr20) obj5, (mr20) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                s1p1.n((cvt0) obj9, (hft0) obj8, (wh1) obj7, (d0r) obj5, (hjv0) obj4, (iu30) obj6, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                jmo1.b((fiz0) obj9, (iu30) obj6, (amq) obj8, (bmq) obj7, (xip) obj5, (zja1) obj4, (rgn0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                cso1.p((hc01) obj9, (fd01) obj8, this.d, (iu30) obj6, (iu30) obj7, (iu30) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                cso1.q((hc01) obj9, (fd01) obj8, this.d, (iu30) obj6, (iu30) obj7, (iu30) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                wwo1.g((eq01) obj9, (gw70) obj8, (iu30) obj6, (znb0) obj7, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                d0p1.j((String) obj9, (qim0) obj3, (String) obj8, (Brush) obj7, (String) obj5, (Function0) obj4, (j2i) obj6, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 21:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                String str = (String) obj9;
                float f = (i * 61.5f) / 100.0f;
                List listP = tlc1Var.P("card", new j2i(-1839491538, new a831((String) obj8, tlc1Var, f * 0.58f, f, (dzo1) obj7, (Function0) obj5, (idn0) obj4, str, (String) obj6, (vnr0) obj3), true));
                ArrayList arrayList = new ArrayList(q7h.U(listP, 10));
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afh0) it.next()).H(j));
                }
                int i2 = ((q5t0) arrayList.get(0)).a;
                int i3 = ((q5t0) arrayList.get(0)).b;
                return tlc1Var.S(i2, str != null ? tlc1Var.i0(16.0f) + ((q5t0) arrayList.get(1)).b + i3 : i3, b7x.a, new z731(arrayList, str, i3, (byte) 0));
            case 22:
                ((Number) obj2).intValue();
                t5p1.d((ArrayList) obj9, (iu30) obj6, (vnr) obj8, (qim0) obj3, (String) obj7, (String) obj5, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                hqq0.x((String) obj9, (cvf1) obj8, (String) obj7, (String) obj5, (abu0) obj4, (iac0) obj6, (yqg) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                o1p1.e((fdj1) obj9, (j2i) obj8, (iu30) obj6, (Function0) obj7, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                wpb1.m((g2m1) obj9, (b2m1) obj8, (zxl1) obj7, (los) obj5, (Function0) obj4, (iu30) obj6, this.d, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                dem1.o((c7m1) obj9, (j2i) obj8, (j2i) obj7, (j2i) obj5, (j2i) obj4, (Function0) obj6, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((l8m1) obj9).d((c8m1) obj8, (o0i) obj7, (iu30) obj6, (iu30) obj5, (iu30) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.c = obj6;
        this.b = obj7;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt3(Object obj, Object obj2, Object obj3, iu30 iu30Var, Object obj4, Object obj5, Object obj6, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.c = iu30Var;
        this.h = obj4;
        this.i = obj5;
        this.b = obj6;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt3(Object obj, Object obj2, iu30 iu30Var, Object obj3, Function0 function0, Object obj4, Object obj5, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.c = iu30Var;
        this.g = obj3;
        this.h = function0;
        this.i = obj4;
        this.b = obj5;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, qim0 qim0Var, Integer num, String str2, int i) {
        super(2);
        this.a = (byte) 6;
        this.e = str;
        this.c = iu30Var;
        this.f = iu30Var2;
        this.g = function0;
        this.b = qim0Var;
        this.h = num;
        this.i = str2;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(String str, qim0 qim0Var, String str2, Brush brush, String str3, Function0 function0, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 20;
        this.e = str;
        this.b = qim0Var;
        this.f = str2;
        this.g = brush;
        this.h = str3;
        this.i = function0;
        this.c = j2iVar;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(ArrayList arrayList, iu30 iu30Var, vnr vnrVar, qim0 qim0Var, String str, String str2, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 22;
        this.e = arrayList;
        this.c = iu30Var;
        this.f = vnrVar;
        this.b = qim0Var;
        this.g = str;
        this.h = str2;
        this.i = j2iVar;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(pek0 pek0Var, dub1 dub1Var, c380 c380Var, c380 c380Var2, vzq0 vzq0Var, int i, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 11;
        this.e = pek0Var;
        this.f = dub1Var;
        this.g = c380Var;
        this.h = c380Var2;
        this.i = vzq0Var;
        this.d = i;
        this.c = function0;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(hvp0 hvp0Var, c380 c380Var, tyq tyqVar, iu30 iu30Var, vzq0 vzq0Var, qim0 qim0Var, vu30 vu30Var, int i) {
        super(2);
        this.a = (byte) 5;
        this.e = hvp0Var;
        this.f = c380Var;
        this.g = tyqVar;
        this.c = iu30Var;
        this.h = vzq0Var;
        this.b = qim0Var;
        this.i = vu30Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(fiz0 fiz0Var, iu30 iu30Var, amq amqVar, bmq bmqVar, xip xipVar, zja1 zja1Var, rgn0 rgn0Var, int i) {
        super(2);
        this.a = (byte) 16;
        this.e = fiz0Var;
        this.c = iu30Var;
        this.f = amqVar;
        this.g = bmqVar;
        this.h = xipVar;
        this.i = zja1Var;
        this.b = rgn0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kt3(hc01 hc01Var, fd01 fd01Var, int i, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, Function0 function0, Object obj, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = hc01Var;
        this.f = fd01Var;
        this.d = i;
        this.c = iu30Var;
        this.g = iu30Var2;
        this.h = iu30Var3;
        this.i = function0;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(mhg1 mhg1Var, iu30 iu30Var, qim0 qim0Var, bby bbyVar, ln00 ln00Var, vu30 vu30Var, xu30 xu30Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.e = mhg1Var;
        this.c = iu30Var;
        this.b = qim0Var;
        this.f = bbyVar;
        this.g = ln00Var;
        this.h = vu30Var;
        this.i = xu30Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(mhg1 mhg1Var, qim0 qim0Var, iu30 iu30Var, tl3 tl3Var, iu30 iu30Var2, iu30 iu30Var3, zu30 zu30Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.e = mhg1Var;
        this.b = qim0Var;
        this.c = iu30Var;
        this.f = tl3Var;
        this.g = iu30Var2;
        this.h = iu30Var3;
        this.i = zu30Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt3(g2m1 g2m1Var, b2m1 b2m1Var, zxl1 zxl1Var, los losVar, Function0 function0, iu30 iu30Var, int i, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 25;
        this.e = g2m1Var;
        this.f = b2m1Var;
        this.g = zxl1Var;
        this.h = losVar;
        this.i = function0;
        this.c = iu30Var;
        this.d = i;
        this.b = qim0Var;
    }
}
