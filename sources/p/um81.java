package p;

import android.net.Uri;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class um81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um81(int i, String str, c380 c380Var, j2i j2iVar) {
        super(2);
        this.a = (byte) 11;
        this.b = i;
        this.c = str;
        this.d = c380Var;
        this.e = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                g9p1.m(czo1.p(i | 1), (List) obj5, (j2i) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((gr91) obj5).a((pfj0) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((ua91) obj5).v((tw91) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                rqg0.m((String) obj5, (xtb0) obj3, (c380) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    vba1 vba1Var = (vba1) obj5;
                    String str = ((pda1) obj3).l;
                    String str2 = ((sda1) obj4).c;
                    vba1Var.e(new uba1(str, str2 != null ? str2 : null, i, cwl1.o0(b0kVar2, 2131962747)), b0kVar2, 0);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((fob) obj5).f((aeb1) obj3, (hux) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((jeb1) obj5).e((String) obj3, (ecx) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ((lz9) obj5).f((zgb1) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                xzn1.f((rib1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                y2o1.n((zsb1) obj5, this.b, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ago1.h((g7g0) obj5, (pbq) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 11:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                float f = (i * 61.5f) / 100.0f;
                List listP = tlc1Var.P("cards", new j2i(1689464308, new e0a((c380) obj3, (String) obj5, tlc1Var, (f - (tlc1Var.X0(16.0f) * 1.0f)) / 2.0f, (j2i) obj4), true));
                ArrayList arrayList = new ArrayList(q7h.U(listP, 10));
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afh0) it.next()).H(j));
                }
                int i2 = ((q5t0) o7h.q0(arrayList)).a;
                int i3 = (int) f;
                int i4 = i2 * 2;
                int i5 = i3 - i4;
                int i6 = i4 + i5;
                if (((String) obj5) != null) {
                    i6 += ((q5t0) l1d.i(1, arrayList)).b + i5;
                }
                return tlc1Var.S(i2, i6, b7x.a, new i37(arrayList, i2, i5, (byte) 2));
            case 12:
                ((Number) obj2).intValue();
                h1p1.g((al80) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                htd1.f((tsd1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                u1p1.b((m5a) obj5, (qim0) obj3, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                rje1.i((aa80) obj5, (yqg) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                rje1.k((uue1) obj5, (Function0) obj3, (yqg) obj4, nim0.a, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((k4f1) obj5).a((zfj0) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                odf1.g((qdf1) obj5, (nef1) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                qxd0.F((wkf1) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                nb51.m((q9g1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((naf1) obj5).e((i2c) obj3, (rk41) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ern1.g((gyg1) obj5, (qim0) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 23:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0Var = (qim0) obj3;
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = hzg1.b;
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarA = s161.a(qim0Var, (iu30) objT);
                    lcf1 lcf1Var = (lcf1) obj5;
                    rk41 rk41Var = (rk41) obj4;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    x340Var2.i0(1684135170);
                    ((wj31) lcf1Var.g).b(new jj31(rk41Var.a, this.b, u291.d(nim0.a, 1.0f), 1, (jfe) null, lcf1Var.b, (Map) null, false, false, (Function0) null, (iu30) null, 4048), x340Var2, 8);
                    x340Var2.r(false);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                dm5.f((qim0) obj3, (yf) obj5, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                ((ilh1) obj5).b((kvv) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                qmo1.d((azh1) obj5, (xyh1) obj3, (j2i) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                qmo1.l((p1i1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                zqo1.l((Uri) obj5, (String) obj3, (cr31) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                fyo1.h((zui1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um81(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um81(Object obj, Object obj2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.e = obj2;
        this.d = qim0Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um81(qim0 qim0Var, Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.d = qim0Var;
        this.c = obj;
        this.e = obj2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um81(vba1 vba1Var, pda1 pda1Var, int i, sda1 sda1Var) {
        super(2);
        this.a = (byte) 4;
        this.c = vba1Var;
        this.d = pda1Var;
        this.b = i;
        this.e = sda1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um81(zsb1 zsb1Var, int i, iu30 iu30Var, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 9;
        this.c = zsb1Var;
        this.b = i;
        this.e = iu30Var;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um81(uue1 uue1Var, Function0 function0, yqg yqgVar, int i) {
        super(2);
        this.a = (byte) 16;
        this.c = uue1Var;
        this.d = function0;
        this.e = yqgVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um81(azh1 azh1Var, xyh1 xyh1Var, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 26;
        this.c = azh1Var;
        this.d = xyh1Var;
        this.e = j2iVar;
        this.b = i;
    }
}
