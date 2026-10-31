package p;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y3i0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3i0(maa maaVar, byte b) {
        super(5);
        this.a = b;
        this.b = maaVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        iow0 iow0VarA;
        int iOrdinal;
        xjj0 xjj0Var;
        String str;
        String str2;
        ujj0 ujj0Var = (ujj0) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        List list = ujj0Var.i;
        fra fraVar = een.N0;
        xjj0 xjj0Var2 = this.b;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var, nim0Var);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        boolean zG = x340Var3.g(ujj0Var);
        Object objT = x340Var3.T();
        if (zG || objT == fkj0.X) {
            boolean z = ujj0Var.c;
            objT = tjj0.a;
            if (z && (((iow0VarA = ujj0Var.f.a(iow0.class)) == null || !iow0VarA.a) && (iOrdinal = ujj0Var.e.ordinal()) != 0 && iOrdinal != 1)) {
                if (iOrdinal != 2) {
                    tjj0 tjj0Var = tjj0.b;
                    if (iOrdinal == 3) {
                        objT = tjj0Var;
                    } else if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            eg.o();
                            return null;
                        }
                        objT = tjj0Var;
                    }
                } else {
                    objT = tjj0.c;
                }
            }
            x340Var3.s0(objT);
        }
        tjj0 tjj0Var2 = (tjj0) objT;
        int iOrdinal2 = tjj0Var2.ordinal();
        if (iOrdinal2 == 0) {
            xjj0Var = xjj0Var2;
            x340Var3.i0(166396287);
            x340Var3.r(false);
        } else if (iOrdinal2 == 1) {
            xjj0Var = xjj0Var2;
            x340Var3.i0(975200086);
            xjj0Var.f(orx.c, "standard_header_metadata_icon_" + tjj0Var2, false, x340Var, orx.d, 4);
            x340Var3.r(false);
        } else {
            if (iOrdinal2 != 2) {
                throw p3d1.k(x340Var3, 975197819, false);
            }
            x340Var3.i0(975203143);
            xjj0Var = xjj0Var2;
            xjj0Var.f(pox.c, "standard_header_metadata_icon_" + tjj0Var2, true, x340Var, pox.d | 384, 0);
            x340Var3.r(false);
        }
        String strL = xfo1.l((Context) x340Var3.k(AndroidCompositionLocals_androidKt.b), ujj0Var.b, ujj0Var.a, xjj0Var.c);
        uwr uwrVar = cbx.a;
        xjj0 xjj0Var3 = xjj0Var;
        uwo1.e(strL, anm1.N("standard_header_metadata_text", nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        if (ujj0Var.g && ((ujj0Var.h && !list.isEmpty()) || ujj0Var.j || (((str = ujj0Var.k) != null && str.length() != 0) || ((str2 = ujj0Var.l) != null && str2.length() != 0)))) {
            x340Var3.i0(166982218);
            otw.c((yby0) xjj0Var3.h.getValue(), new wby0(ujj0Var.k, ujj0Var.l, list, ujj0Var.h, ujj0Var.j, strL.length() > 0), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var3.r(false);
        } else if (xjj0Var3.d.a()) {
            x340Var3.i0(167516813);
            otw.c((vl90) xjj0Var3.g.getValue(), new pl90(xjj0Var3.b), (qim0) null, (ipb1) null, x340Var, 8, 12);
            x340Var3.r(false);
        } else {
            x340Var3.i0(167659041);
            x340Var3.r(false);
        }
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vnj0 vnj0Var = (xnj0) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            iIntValue |= (iIntValue & 64) == 0 ? x340Var.g(vnj0Var) : x340Var.i(vnj0Var) ? 32 : 16;
        }
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
            x340Var2.b0();
        } else if (vnj0Var instanceof vnj0) {
            x340Var2.i0(-1378645039);
            otw.c((rn8) this.b.e, vnj0Var.a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-1378577769);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Number) obj5).intValue();
        this.b.e((ttj0) obj2, (iu30) obj3, (b0k) obj4, (iIntValue >> 3) & 126);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wvj0 wvj0Var = (wvj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        b0k b0kVar = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        azb azbVar = wvj0Var.a.a;
        yxo1.c(!azbVar.equals(xyb.a), iu30Var, anm1.N("mixing_bottom_sheet_type_" + azbVar, nim0.a), apo.r(682812305, new zvj0(wvj0Var, iu30Var, this.b, (byte) 1), b0kVar), b0kVar, ((iIntValue >> 3) & 112) | 3072);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        owj0 owj0Var = (owj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        exj0 exj0Var = this.b;
        int i = (iIntValue >> 3) & 126;
        exj0Var.g(owj0Var, iu30Var, x340Var, i);
        if (owj0Var.g) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-505991651);
            exj0Var.f(owj0Var, iu30Var, x340Var2, i);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-505912849);
            x340Var3.r(false);
        }
        if (owj0Var.h) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-505873045);
            exj0Var.e(iu30Var, x340Var4, (iIntValue >> 6) & 14);
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(-505807697);
            x340Var5.r(false);
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        j2i j2iVarR;
        dyj0 dyj0Var = (dyj0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        et90 et90Var = this.b;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(dyj0Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            bin.F(et90Var, dyj0Var, dyj0Var, (i8h1) ((kly0) et90Var.e).get(), x340Var2, (i & 112) | ((i << 3) & 896));
            if (ihc1.y0(et90.o(dyj0Var, x340Var2))) {
                x340Var2.i0(45670726);
                x340Var2.r(false);
                j2iVarR = null;
            } else {
                x340Var2.i0(45179346);
                j2iVarR = apo.r(-216312712, new fyj0(iu30Var, et90Var, dyj0Var, (byte) 0), x340Var2);
                x340Var2.r(false);
            }
            j2i j2iVar = j2iVarR;
            boolean z = (i & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new stj0(iu30Var, (byte) 4);
                x340Var2.s0(objT);
            }
            mqo1.e((Function0) objT, (i3u) null, (vu30) null, apo.r(975637015, new eyj0(et90Var, dyj0Var, (byte) 1), x340Var2), apo.r(-1608679434, new eyj0(et90Var, dyj0Var, (byte) 2), x340Var2), apo.r(101971413, new fyj0(iu30Var, et90Var, dyj0Var, (byte) 1), x340Var2), j2iVar, x340Var2, 224256, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        b0k b0kVar;
        d8k0 d8k0Var = (d8k0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        t8k0 t8k0Var = this.b;
        b0k b0kVar2 = (x340) ((b0k) obj4);
        Object objT = b0kVar2.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(j8k0.a);
            b0kVar2.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        int i = (iIntValue & 896) ^ 384;
        boolean zI = ((i > 256 && b0kVar2.g(iu30Var)) || (iIntValue & 384) == 256) | b0kVar2.i(t8k0Var) | ((((iIntValue & 112) ^ 48) > 32 && b0kVar2.i(d8k0Var)) || (iIntValue & 48) == 32) | b0kVar2.i(ven0Var);
        Object objT2 = b0kVar2.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new ntf0((Object) t8k0Var, (Object) d8k0Var, (Object) ven0Var, iu30Var, (byte) 12);
            b0kVar2.s0(objT2);
        }
        t8k0Var.g(d8k0Var, (iu30) objT2, b0kVar2, ((iIntValue >> 3) & 14) | 8);
        g8k0 g8k0Var = (g8k0) t8k0Var.Q0.getValue();
        if (g8k0Var instanceof f8k0) {
            b0kVar2.i0(270395825);
            boolean z2 = (i > 256 && b0kVar2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT3 = b0kVar2.T();
            if (z2 || objT3 == m4cVar) {
                daj0 daj0Var = new daj0(new r8k0(t8k0Var, (byte) 1), t8k0Var.t.a.b.A5);
                b0kVar2.s0(daj0Var);
                objT3 = daj0Var;
            }
            b0kVar = b0kVar2;
            z = false;
            otw.c((daj0) objT3, new aaj0(((f8k0) g8k0Var).a), (qim0) null, (ipb1) null, b0kVar, 0, 12);
            b0kVar.r(false);
        } else {
            z = false;
            b0kVar = b0kVar2;
            b0kVar.i0(270709111);
            b0kVar.r(false);
        }
        l8k0 l8k0Var = (l8k0) ven0Var.getValue();
        if (l8k0Var instanceof k8k0) {
            b0kVar.i0(270869474);
            asn asnVar = t8k0Var.X;
            String str = d8k0Var.b;
            cio cioVar = ((k8k0) l8k0Var).a;
            boolean zI2 = b0kVar.i(ven0Var) | (((i <= 256 || !b0kVar.g(iu30Var)) && (iIntValue & 384) != 256) ? z : true);
            Object objT4 = b0kVar.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new gp0(ven0Var, iu30Var, (byte) 22);
                b0kVar.s0(objT4);
            }
            iu30 iu30Var2 = (iu30) objT4;
            boolean zI3 = b0kVar.i(ven0Var) | (((i <= 256 || !b0kVar.g(iu30Var)) && (iIntValue & 384) != 256) ? z : true);
            Object objT5 = b0kVar.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new gp0(ven0Var, iu30Var, (byte) 23);
                b0kVar.s0(objT5);
            }
            iu30 iu30Var3 = (iu30) objT5;
            boolean zI4 = b0kVar.i(ven0Var);
            Object objT6 = b0kVar.T();
            if (zI4 || objT6 == m4cVar) {
                objT6 = new q2j0(ven0Var, (byte) 3);
                b0kVar.s0(objT6);
            }
            b0k b0kVar3 = b0kVar;
            asnVar.c(str, cioVar, iu30Var2, iu30Var3, (Function0) objT6, b0kVar3, 0);
            b0kVar3.r(z);
        } else {
            b0kVar.i0(271535447);
            b0kVar.r(z);
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        nak0 nak0Var = (nak0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new stj0(iu30Var, (byte) 17);
            x340Var2.s0(objT);
        }
        x74.f((Function0) objT, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(1456510557, new iwf0(nak0Var, iu30Var, this.b, (byte) 18), x340Var2), x340Var2, 0, 48, 2046);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        pbk0 pbk0Var = (pbk0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        m4c m4cVar = (m4c) this.b.d;
        qim0 qim0VarR = u291.r(nim0.a, 68.0f);
        boolean z = true;
        int i = pbk0Var.c ? 1 : 2;
        boolean z2 = pbk0Var.d;
        if (qbk0.a[l1d.C(1)] != 1) {
            eg.o();
            return null;
        }
        String string = context.getString(2131958836);
        string.getClass();
        boolean z3 = pbk0Var.e;
        boolean z4 = (((iIntValue & 112) ^ 48) > 32 && x340Var.i(pbk0Var)) || (iIntValue & 48) == 32;
        if ((((iIntValue & 896) ^ 384) <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        boolean z5 = z4 | z;
        Object objT = x340Var.T();
        if (z5 || objT == fkj0.X) {
            objT = new ft0(pbk0Var, iu30Var, (byte) 14);
            x340Var.s0(objT);
        }
        d3p1.l(i, z2, qim0VarR, 48.0f, (Function0) objT, string, z3, m4cVar, x340Var, 0, 0);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0187  */
    /* JADX WARN: Code duplicated, block: B:56:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c9 A[PHI: r31
      0x01c9: PHI (r31v3 p.iu30) = (r31v1 p.iu30), (r31v4 p.iu30) binds: [B:64:0x01c7, B:62:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x0219  */
    /* JADX WARN: Code duplicated, block: B:77:0x022b  */
    /* JADX WARN: Code duplicated, block: B:79:0x022f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0239  */
    /* JADX WARN: Code duplicated, block: B:84:0x028e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0294  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x02a3  */
    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List list;
        int i;
        boolean z;
        boolean zG;
        Object objT;
        iu30 iu30Var;
        boolean z2;
        Object objT2;
        iu30 iu30Var2;
        boolean z3;
        Object objT3;
        int i2;
        boolean zE;
        Object objT4;
        Map map;
        w8w0 w8w0Var;
        boolean z4;
        Object objT5;
        b8w0 b8w0Var;
        sck0 sck0Var = (sck0) obj2;
        iu30 iu30Var3 = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        el9 el9Var = this.b;
        m4c m4cVar = fkj0.X;
        uao0 uao0Var = sck0Var.c;
        xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
        rck0 rck0Var = sck0Var.a;
        m8w0 m8w0Var = rck0Var.a;
        x340 x340Var2 = x340Var;
        boolean zG2 = x340Var2.g(m8w0Var);
        Object objT6 = x340Var2.T();
        if (zG2 || objT6 == m4cVar) {
            objT6 = v8r.q(m8w0Var);
            x340Var2.s0(objT6);
        }
        ven0 ven0Var = (ven0) objT6;
        boolean z5 = rck0Var.c;
        boolean zH = x340Var2.h(z5);
        Object objT7 = x340Var2.T();
        if (zH || objT7 == m4cVar) {
            xsk xskVar = (xsk) el9Var.h;
            ArrayList arrayList = new ArrayList();
            arrayList.add(j8w0.a);
            if (z5) {
                arrayList.add(k8w0.a);
            }
            switch (xskVar.a.d().l) {
                case 1:
                    list = c2t.c;
                    break;
                case 2:
                    list = c2t.g;
                    break;
                case 3:
                    list = c2t.k;
                    break;
                case 4:
                    list = c2t.o;
                    break;
                case 5:
                case 6:
                case 8:
                    list = c2t.u;
                    break;
                case 7:
                default:
                    list = c2t.o;
                    break;
            }
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new l8w0((b8w0) it.next()));
            }
            arrayList.addAll(arrayList2);
            arrayList.add(new l8w0(b8w0.b));
            objT7 = mqo1.A(arrayList);
            x340Var2.s0(objT7);
        }
        c380 c380Var = (c380) objT7;
        crn1.g((m8w0) ven0Var.getValue(), mqo1.A(c380Var), xtb0VarA, x340Var2, 0);
        uwr uwrVar = cbx.a;
        long j = cbx.a(x340Var2).a.c;
        u5j1 u5j1Var = d4o1.a;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = dug.f(nim0Var, j, u5j1Var);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
        nko1.H(mbhVarA, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        v8r.g(x340Var2, 0);
        op71.g(x340Var2, u291.h(nim0Var, 12.0f));
        m8w0 m8w0Var2 = (m8w0) ven0Var.getValue();
        rxj0 rxj0Var = (rxj0) el9Var.i;
        int i3 = rxj0Var.l;
        boolean z6 = rxj0Var.f0;
        boolean z7 = rck0Var.r;
        List list3 = rck0Var.s;
        boolean z8 = rck0Var.t;
        boolean z9 = rck0Var.u;
        boolean zG3 = x340Var2.g(ven0Var);
        int i4 = iIntValue & 896;
        int i5 = i4 ^ 384;
        if (i5 <= 256 || !x340Var2.g(iu30Var3)) {
            i = i3;
            if ((iIntValue & 384) != 256) {
                z = false;
            }
            zG = zG3 | z | x340Var2.g(c380Var);
            objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new awj0(iu30Var3, c380Var, ven0Var);
                x340Var2.s0(objT);
            }
            iu30Var = (iu30) objT;
            z2 = (i5 <= 256 && x340Var2.g(iu30Var3)) || (iIntValue & 384) == 256;
            objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new wck0(iu30Var3, (byte) 0);
                x340Var2.s0(objT2);
            }
            iu30 iu30Var4 = (iu30) objT2;
            if (i5 > 256 || !x340Var2.g(iu30Var3)) {
                iu30Var2 = iu30Var;
                if ((iIntValue & 384) != 256) {
                    z3 = false;
                }
                objT3 = x340Var2.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new stj0(iu30Var3, (byte) 20);
                    x340Var2.s0(objT3);
                }
                i2 = i;
                nln.i(xtb0VarA, c380Var, m8w0Var2, iu30Var2, z6, z7, list3, z8, z9, iu30Var4, (Function0) objT3, x340Var2, 0);
                op71.g(x340Var2, u291.h(nim0Var, 8.0f));
                zE = x340Var2.e(i2) | x340Var2.e(uao0Var.ordinal());
                objT4 = x340Var2.T();
                if (zE || objT4 == m4cVar) {
                    Parcelable.Creator creator = fkc1.CREATOR;
                    objT4 = boo1.C(i2, uao0Var);
                    x340Var2.s0(objT4);
                }
                c380 c380Var2 = (c380) objT4;
                map = sck0Var.b;
                if (map != null) {
                    b8w0Var = rck0Var.b;
                    if (b8w0Var == null) {
                        b8w0Var = b8w0.Y;
                    }
                    w8w0Var = (w8w0) map.get(b8w0Var);
                } else {
                    w8w0Var = null;
                }
                foo1.k(c380Var2, new gkc1(w8w0Var, rck0Var.k, rck0Var.d, rck0Var.e, rck0Var.f, rck0Var.g, rck0Var.h, rck0Var.i, rck0Var.l, rck0Var.m, rck0Var.n, rck0Var.o, rck0Var.f69p), iu30Var3, rck0Var.j, apo.r(2030437750, new iwf0(sck0Var, el9Var, iu30Var3, (byte) 19), x340Var2), x340Var2, i4 | 24576);
                int i6 = rck0Var.q;
                z4 = (i5 <= 256 && x340Var2.g(iu30Var3)) || (iIntValue & 384) == 256;
                objT5 = x340Var2.T();
                if (z4 || objT5 == m4cVar) {
                    objT5 = new wck0(iu30Var3, (byte) 2);
                    x340Var2.s0(objT5);
                }
                i8p1.b(i6, 0, x340Var2, (iu30) objT5, (qim0) null);
                x340Var2.r(true);
                return rih1.a;
            }
            iu30Var2 = iu30Var;
            z3 = true;
            objT3 = x340Var2.T();
            if (z3) {
                objT3 = new stj0(iu30Var3, (byte) 20);
                x340Var2.s0(objT3);
            } else {
                objT3 = new stj0(iu30Var3, (byte) 20);
                x340Var2.s0(objT3);
            }
            i2 = i;
            nln.i(xtb0VarA, c380Var, m8w0Var2, iu30Var2, z6, z7, list3, z8, z9, iu30Var4, (Function0) objT3, x340Var2, 0);
            op71.g(x340Var2, u291.h(nim0Var, 8.0f));
            zE = x340Var2.e(i2) | x340Var2.e(uao0Var.ordinal());
            objT4 = x340Var2.T();
            if (zE) {
                Parcelable.Creator creator2 = fkc1.CREATOR;
                objT4 = boo1.C(i2, uao0Var);
                x340Var2.s0(objT4);
            } else {
                Parcelable.Creator creator3 = fkc1.CREATOR;
                objT4 = boo1.C(i2, uao0Var);
                x340Var2.s0(objT4);
            }
            c380 c380Var3 = (c380) objT4;
            map = sck0Var.b;
            if (map != null) {
                b8w0Var = rck0Var.b;
                if (b8w0Var == null) {
                    b8w0Var = b8w0.Y;
                }
                w8w0Var = (w8w0) map.get(b8w0Var);
            } else {
                w8w0Var = null;
            }
            foo1.k(c380Var3, new gkc1(w8w0Var, rck0Var.k, rck0Var.d, rck0Var.e, rck0Var.f, rck0Var.g, rck0Var.h, rck0Var.i, rck0Var.l, rck0Var.m, rck0Var.n, rck0Var.o, rck0Var.f69p), iu30Var3, rck0Var.j, apo.r(2030437750, new iwf0(sck0Var, el9Var, iu30Var3, (byte) 19), x340Var2), x340Var2, i4 | 24576);
            int i7 = rck0Var.q;
            if (i5 <= 256) {
            }
            objT5 = x340Var2.T();
            if (z4) {
                objT5 = new wck0(iu30Var3, (byte) 2);
                x340Var2.s0(objT5);
            } else {
                objT5 = new wck0(iu30Var3, (byte) 2);
                x340Var2.s0(objT5);
            }
            i8p1.b(i7, 0, x340Var2, (iu30) objT5, (qim0) null);
            x340Var2.r(true);
            return rih1.a;
        }
        i = i3;
        z = true;
        zG = zG3 | z | x340Var2.g(c380Var);
        objT = x340Var2.T();
        if (zG) {
            objT = new awj0(iu30Var3, c380Var, ven0Var);
            x340Var2.s0(objT);
        } else {
            objT = new awj0(iu30Var3, c380Var, ven0Var);
            x340Var2.s0(objT);
        }
        iu30Var = (iu30) objT;
        if (i5 <= 256) {
        }
        objT2 = x340Var2.T();
        if (z2) {
            objT2 = new wck0(iu30Var3, (byte) 0);
            x340Var2.s0(objT2);
        } else {
            objT2 = new wck0(iu30Var3, (byte) 0);
            x340Var2.s0(objT2);
        }
        iu30 iu30Var5 = (iu30) objT2;
        if (i5 > 256) {
            iu30Var2 = iu30Var;
            if ((iIntValue & 384) != 256) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            iu30Var2 = iu30Var;
            if ((iIntValue & 384) != 256) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        objT3 = x340Var2.T();
        if (z3) {
            objT3 = new stj0(iu30Var3, (byte) 20);
            x340Var2.s0(objT3);
        } else {
            objT3 = new stj0(iu30Var3, (byte) 20);
            x340Var2.s0(objT3);
        }
        i2 = i;
        nln.i(xtb0VarA, c380Var, m8w0Var2, iu30Var2, z6, z7, list3, z8, z9, iu30Var5, (Function0) objT3, x340Var2, 0);
        op71.g(x340Var2, u291.h(nim0Var, 8.0f));
        zE = x340Var2.e(i2) | x340Var2.e(uao0Var.ordinal());
        objT4 = x340Var2.T();
        if (zE) {
            Parcelable.Creator creator4 = fkc1.CREATOR;
            objT4 = boo1.C(i2, uao0Var);
            x340Var2.s0(objT4);
        } else {
            Parcelable.Creator creator5 = fkc1.CREATOR;
            objT4 = boo1.C(i2, uao0Var);
            x340Var2.s0(objT4);
        }
        c380 c380Var4 = (c380) objT4;
        map = sck0Var.b;
        if (map != null) {
            b8w0Var = rck0Var.b;
            if (b8w0Var == null) {
                b8w0Var = b8w0.Y;
            }
            w8w0Var = (w8w0) map.get(b8w0Var);
        } else {
            w8w0Var = null;
        }
        foo1.k(c380Var4, new gkc1(w8w0Var, rck0Var.k, rck0Var.d, rck0Var.e, rck0Var.f, rck0Var.g, rck0Var.h, rck0Var.i, rck0Var.l, rck0Var.m, rck0Var.n, rck0Var.o, rck0Var.f69p), iu30Var3, rck0Var.j, apo.r(2030437750, new iwf0(sck0Var, el9Var, iu30Var3, (byte) 19), x340Var2), x340Var2, i4 | 24576);
        int i8 = rck0Var.q;
        if (i5 <= 256) {
        }
        objT5 = x340Var2.T();
        if (z4) {
            objT5 = new wck0(iu30Var3, (byte) 2);
            x340Var2.s0(objT5);
        } else {
            objT5 = new wck0(iu30Var3, (byte) 2);
            x340Var2.s0(objT5);
        }
        i8p1.b(i8, 0, x340Var2, (iu30) objT5, (qim0) null);
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vdk0 vdk0Var = (vdk0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = qxd0.M(o6x.a, x340Var);
            x340Var.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(dek0.a);
            x340Var.s0(objT2);
        }
        ven0 ven0Var = (ven0) objT2;
        nyx.a(2, (wux) null, apo.r(1483491249, new rvg0(vdk0Var, ven0Var, iu30Var, (byte) 24), x340Var), x340Var, 3078, 6);
        jek0 jek0Var = this.b;
        iek0 iek0Var = (iek0) ven0Var.getValue();
        boolean zI = x340Var.i(ven0Var);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new abh0(ven0Var, (byte) 13);
            x340Var.s0(objT3);
        }
        jek0Var.e(vdk0Var, iek0Var, c9nVar, (iu30) objT3, iu30Var, x340Var, ((iIntValue >> 3) & 14) | 8 | ((iIntValue << 6) & 57344));
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new stj0(iu30Var, (byte) 26);
            x340Var2.s0(objT);
        }
        x74.f((Function0) objT, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-1521114997, new x9g0(this.b, iu30Var, (byte) 28), x340Var2), x340Var2, 0, 48, 2046);
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var;
        tob1 tob1Var;
        pfk0 pfk0Var = this.b;
        gfk0 gfk0Var = (gfk0) obj2;
        iu30 iu30Var2 = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = qxd0.M(o6x.a, x340Var);
            x340Var.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(ifk0.a);
            x340Var.s0(objT2);
        }
        tob1 tob1Var2 = (ven0) objT2;
        bek0 bek0Var = gfk0Var.b;
        qim0 qim0VarN = anm1.N("reorder_education", nim0.a);
        int i = iIntValue & 896;
        int i2 = i ^ 384;
        boolean z = (i2 > 256 && x340Var.g(iu30Var2)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var.T();
        if (z || objT3 == m4cVar) {
            objT3 = new nfk0(iu30Var2, (byte) 1);
            x340Var.s0(objT3);
        }
        Function0 function0 = (Function0) objT3;
        boolean zI = ((i2 > 256 && x340Var.g(iu30Var2)) || (iIntValue & 384) == 256) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.i(gfk0Var)) || (iIntValue & 48) == 32) | x340Var.i(tob1Var2) | x340Var.i(c9nVar) | x340Var.i(pfk0Var);
        Object objT4 = x340Var.T();
        if (zI || objT4 == m4cVar) {
            objT4 = new vt1(gfk0Var, iu30Var2, c9nVar, tob1Var2, pfk0Var);
            iu30Var = iu30Var2;
            tob1Var = tob1Var2;
            x340Var.s0(objT4);
        } else {
            iu30Var = iu30Var2;
            tob1Var = tob1Var2;
        }
        pfk0Var.e(bek0Var, function0, (Function0) objT4, qim0VarN, x340Var, 0);
        mfk0 mfk0Var = (mfk0) tob1Var.getValue();
        boolean zI2 = x340Var.i(tob1Var);
        Object objT5 = x340Var.T();
        if (zI2 || objT5 == m4cVar) {
            objT5 = new abh0(tob1Var, (byte) 14);
            x340Var.s0(objT5);
        }
        pfk0Var.f(mfk0Var, (iu30) objT5, iu30Var, x340Var, i);
        return rih1.a;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kkk0 kkk0Var = (kkk0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        el9 el9Var = this.b;
        boolean z = kkk0Var.a.a;
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == m4cVar) {
            objT = new nfk0(iu30Var, (byte) 2);
            x340Var2.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        boolean zI = x340Var2.i(el9Var);
        Object objT2 = x340Var2.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new nkk0(el9Var, (byte) 2);
            x340Var2.s0(objT2);
        }
        t3p1.n(z, function0, (iu30) objT2, apo.r(1971990519, new rvg0(kkk0Var, iu30Var, el9Var, (byte) 26), x340Var2), x340Var2, 3072);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:187:0x05a5  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String strN0;
        boolean z;
        lgi1 mgi1Var;
        boolean z2;
        boolean z3;
        h4q h4qVar;
        x340 x340Var;
        boolean z4;
        rih1 rih1Var;
        x340 x340Var2;
        String strK;
        List list;
        byte b = this.a;
        qim0 qim0VarB = nim0.a;
        rih1 rih1Var2 = rih1.a;
        boolean z5 = true;
        z6x z6xVarT0 = null;
        nm1 nm1Var = this.b;
        switch (b) {
            case 0:
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                boolean z6 = ((q6i0) obj2).a;
                if (((z3i0) nm1Var).b) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(1524944269);
                    z47.j(z6, x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(1525017305);
                    x340Var5.r(false);
                }
                if (z6) {
                    x340 x340Var6 = x340Var3;
                    x340Var6.i0(1525070160);
                    String strO0 = cwl1.o0(x340Var6, 2131958435);
                    boolean z7 = (((iIntValue & 896) ^ 384) > 256 && x340Var6.g(iu30Var)) || (iIntValue & 384) == 256;
                    Object objT = x340Var6.T();
                    if (z7 || objT == fkj0.X) {
                        objT = new msh0(iu30Var, (byte) 8);
                        x340Var6.s0(objT);
                    }
                    wro1.h(new gbx(new y50(strO0), (Function0) objT), ldx.c, anm1.N("media_trimmer_button", qim0VarB), (max) null, yla.s(x340Var6).a(), (vzq0) null, false, (idn0) null, (ga80) null, d0j.a, x340Var6, 0, 6, 984);
                    x340Var6.r(false);
                } else {
                    x340 x340Var7 = x340Var3;
                    x340Var7.i0(1525638297);
                    x340Var7.r(false);
                }
                return rih1Var2;
            case 1:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                iz0 iz0Var = (iz0) nm1Var;
                mod.b(oi7.a.a((gw70) iz0Var.e), apo.r(961840379, new rvg0((lfi0) obj2, (iu30) obj3, iz0Var, (byte) 15), b0kVar), b0kVar, 56);
                return rih1Var2;
            case 2:
                mey0 mey0Var = (mey0) obj;
                ((Number) obj2).intValue();
                kgi0 kgi0Var = (kgi0) obj3;
                int iIntValue2 = ((Number) obj5).intValue();
                x340 x340Var8 = (b0k) obj4;
                boolean zG = x340Var8.g(mey0Var.a);
                cm0 cm0Var = (cm0) nm1Var;
                Object objT2 = x340Var8.T();
                if (zG || objT2 == fkj0.X) {
                    objT2 = ((u3p) cm0Var.c).a((epb1) cm0Var.d, (Function0) cm0Var.e, (kko) cm0Var.f, (ohi0) cm0Var.g, new qgi0(kgi0Var, (byte) 5), (vu30) cm0Var.i, (p731) cm0Var.t);
                    x340Var8.s0(objT2);
                }
                otw.c((thi0) objT2, mey0Var, (qim0) null, (ipb1) null, x340Var8, (iIntValue2 << 3) & 112, 12);
                return rih1Var2;
            case 3:
                mey0 mey0Var2 = (mey0) obj;
                ((Number) obj2).intValue();
                kgi0 kgi0Var2 = (kgi0) obj3;
                int iIntValue3 = ((Number) obj5).intValue();
                x340 x340Var9 = (b0k) obj4;
                boolean zG2 = x340Var9.g(mey0Var2.a);
                r8s r8sVar = (r8s) nm1Var;
                Object objT3 = x340Var9.T();
                if (zG2 || objT3 == fkj0.X) {
                    objT3 = ((kgp) r8sVar.c).a((d0r) r8sVar.d, new phi0((kko) r8sVar.f, (ggx0) r8sVar.e, new qgi0(kgi0Var2, (byte) 7), (p731) r8sVar.X, (y6w0) r8sVar.t, (byte) 0), (ohi0) r8sVar.g, (qhi0) r8sVar.h);
                    x340Var9.s0(objT3);
                }
                otw.c((gii0) objT3, mey0Var2, (qim0) null, (ipb1) null, x340Var9, (iIntValue3 << 3) & 112, 12);
                return rih1Var2;
            case 4:
                oni0 oni0Var = (oni0) obj2;
                ((Number) obj5).intValue();
                et90 et90Var = (et90) nm1Var;
                x340 x340Var10 = (b0k) obj4;
                Object objT4 = x340Var10.T();
                m4c m4cVar = fkj0.X;
                if (objT4 == m4cVar) {
                    qni0 qni0Var = (qni0) ((g1i) ((zrp) et90Var.d).a.c).b;
                    g7h g7hVar = (g7h) qni0Var.a.get();
                    c8o.l(g7hVar);
                    ccc0 ccc0Var = (ccc0) qni0Var.b.get();
                    c8o.l(ccc0Var);
                    gu8 gu8Var = (gu8) qni0Var.c.get();
                    c8o.l(gu8Var);
                    eu8 eu8Var = (eu8) qni0Var.d.get();
                    c8o.l(eu8Var);
                    zwz0 zwz0Var = (zwz0) qni0Var.e.get();
                    c8o.l(zwz0Var);
                    p6r0 p6r0Var = rni0.a;
                    c8o.m(p6r0Var);
                    h730 h730Var = new h730(g7hVar, ccc0Var, gu8Var, eu8Var, zwz0Var, p6r0Var);
                    x340Var10.s0(h730Var);
                    objT4 = h730Var;
                }
                h730 h730Var2 = (h730) objT4;
                Object objT5 = x340Var10.T();
                if (objT5 == m4cVar) {
                    g1i g1iVar = (g1i) ((asp) et90Var.e).a.c;
                    tji0 tji0Var = (tji0) ((qni0) g1iVar.b).f.get();
                    c8o.l(tji0Var);
                    kt91 kt91Var = (kt91) ((qni0) g1iVar.b).g.get();
                    c8o.l(kt91Var);
                    objT5 = new e3a(tji0Var, kt91Var);
                    x340Var10.s0(objT5);
                }
                jto1.g((Function0) et90Var.c, apo.r(634217629, new q0g0(h730Var2, oni0Var, (byte) 27), x340Var10), apo.r(-1497447458, new q0g0((e3a) objT5, oni0Var, (byte) 28), x340Var10), (qim0) null, x340Var10, 432);
                return rih1Var2;
            case 5:
                upi0 upi0Var = (upi0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                jwm jwmVar = upi0Var.b;
                w4i1 w4i1Var = jwmVar.a;
                w4i1 w4i1Var2 = jwmVar.d;
                List listSingletonList = Collections.singletonList(w4i1Var);
                String str = jwmVar.a.a;
                jwm jwmVar2 = upi0Var.c;
                if (u890.j(str, jwmVar2.a.a)) {
                    x340 x340Var12 = x340Var11;
                    x340Var12.i0(1398486349);
                    strN0 = cwl1.n0(2131953654, new Object[]{w4i1Var.b}, x340Var12);
                    x340Var12.r(false);
                } else {
                    x340 x340Var13 = x340Var11;
                    x340Var13.i0(1398656539);
                    x340Var13.r(false);
                    strN0 = w4i1Var.b;
                }
                x340 x340Var14 = x340Var11;
                ye5 ye5VarO = kk0.o(-1894540502, x340Var14);
                gwm gwmVar = jwmVar.c;
                fwm fwmVar = fwm.a;
                boolean zJ = u890.j(gwmVar, fwmVar);
                zvm zvmVar = zvm.a;
                if (zJ) {
                    x340Var14.i0(-1954091350);
                    if (u890.j(jwmVar2.a.a, w4i1Var2 != null ? w4i1Var2.a : null)) {
                        x340Var14.i0(-1953962607);
                        ye5VarO.g(cwl1.o0(x340Var14, 2131953656));
                        z2 = false;
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-1953783427);
                        String str2 = w4i1Var2 != null ? w4i1Var2.b : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        ye5VarO.g(cwl1.n0(2131953655, new Object[]{str2}, x340Var14));
                        z2 = false;
                        x340Var14.r(false);
                    }
                    x340Var14.r(z2);
                } else if (u890.j(jwmVar.b, zvmVar)) {
                    x340Var14.i0(-1953457741);
                    ye5VarO.g(cwl1.o0(x340Var14, 2131953652));
                    x340Var14.r(false);
                } else {
                    x340Var14.i0(-1953356836);
                    x340Var14.r(false);
                }
                if (upi0Var.a) {
                    x340Var14.i0(-1953266285);
                    if (u890.j(jwmVar.b, zvmVar) || u890.j(jwmVar.c, fwmVar)) {
                        ye5VarO.g(" • ");
                    }
                    uwr uwrVar = cbx.a;
                    int iO = ye5VarO.o(new zma1(cbx.a(x340Var14).b.d, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5VarO.g(cwl1.o0(x340Var14, 2131953653));
                        ye5VarO.k(iO);
                        z = false;
                        x340Var14.r(false);
                    } catch (Throwable th) {
                        ye5VarO.k(iO);
                        throw th;
                    }
                } else {
                    z = false;
                    x340Var14.i0(-1952950116);
                    x340Var14.r(false);
                }
                af5 af5VarP = ye5VarO.p();
                x340Var14.r(z);
                if (af5VarP.b.length() <= 0) {
                    af5VarP = null;
                }
                ngx ngxVar = ngx.e;
                if (u890.j(jwmVar.a.a, jwmVar2.a.a)) {
                    x340Var14.i0(1400132387);
                    x340Var14.r(false);
                    mgi1Var = lgi1.a;
                } else {
                    x340Var14.i0(1400198789);
                    String strO1 = cwl1.o0(x340Var14, 2131953651);
                    gpx gpxVar = gpx.c;
                    boolean z8 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var14.g(iu30Var2)) || (iIntValue4 & 384) == 256;
                    Object objT6 = x340Var14.T();
                    if (z8 || objT6 == m4cVar2) {
                        objT6 = new edi0(iu30Var2, (byte) 12);
                        x340Var14.s0(objT6);
                    }
                    mgi1Var = new mgi1(new pgi1(strO1, gpxVar, (Function0) objT6));
                    x340Var14.r(false);
                }
                rgi1 rgi1Var = new rgi1(listSingletonList, strN0, af5VarP != null ? new hgi1(af5VarP) : null, mgi1Var, ngxVar);
                gw70 gw70Var = ((xpi0) nm1Var).b;
                boolean z9 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var14.g(iu30Var2)) || (iIntValue4 & 384) == 256;
                Object objT7 = x340Var14.T();
                if (z9 || objT7 == m4cVar2) {
                    objT7 = new edi0(iu30Var2, (byte) 13);
                    x340Var14.s0(objT7);
                }
                ero1.f(rgi1Var, (Function0) objT7, gw70Var, (qim0) null, x340Var14, 0, 8);
                return rih1Var2;
            case 6:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((lfo) nm1Var).c), apo.r(-1311892023, new loi0((fvi0) obj2, (iu30) obj3, (byte) 2), b0kVar2), b0kVar2, 56);
                return rih1Var2;
            case 7:
                ixi0 ixi0Var = (ixi0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                int i = (iIntValue5 & 48) == 0 ? iIntValue5 | ((iIntValue5 & 64) == 0 ? x340Var15.g(ixi0Var) : x340Var15.i(ixi0Var) ? 32 : 16) : iIntValue5;
                if ((iIntValue5 & 384) == 0) {
                    i |= x340Var15.i(iu30Var3) ? 256 : 128;
                }
                x340 x340Var16 = x340Var15;
                boolean zY = x340Var16.Y(i & 1, (i & 1169) != 1168);
                j06 j06Var = x340Var16.a;
                if (!zY) {
                    x340Var16.b0();
                    return rih1Var2;
                }
                qim0 qim0VarF = u291.f(qim0VarB, 1.0f);
                qj0 qj0Var = (qj0) nm1Var;
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var16, 0);
                int iHashCode = Long.hashCode(x340Var16.T);
                xos0 xos0VarM = x340Var16.m();
                qim0 qim0VarE = zr7.E(x340Var16, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                boolean z10 = x340Var16.S;
                n4k n4kVar = hmb0.t1;
                if (z10) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var16, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var16, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var16, lljVar3);
                nko1.F(x340Var16);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var16, lljVar4);
                az20 az20Var = (az20) x340Var16.k(t4k.i);
                ss50 ss50Var = (ss50) x340Var16.k(t4k.l);
                exi0 exi0Var = ixi0Var.i;
                boolean z11 = exi0Var instanceof exi0;
                tob1 tob1VarB = z95.b(z11 ? 0.5f : 1.0f, irn1.o0(150, 0, mlv.d, 2), "dimAlpha", (iu30) null, x340Var16, 3072, 20);
                boolean z12 = ixi0Var.g;
                era eraVar2 = z12 ? een.R0 : eraVar;
                int i2 = ixi0Var.h ? z12 ? 2 : 1 : 3;
                qim0 qim0VarK = d9y0.k(new tq60(eraVar2), ((Number) tob1VarB.getValue()).floatValue());
                int i3 = i & 896;
                boolean zI = x340Var16.i(ss50Var) | (i3 == 256) | x340Var16.i(az20Var);
                Object objT8 = x340Var16.T();
                if (zI || objT8 == m4cVar3) {
                    objT8 = new mhg(ss50Var, iu30Var3, az20Var, (byte) 6);
                    x340Var16.s0(objT8);
                }
                qxy0.c(i2, 3072, apo.r(-1417592499, new iwf0(ixi0Var, qj0Var, iu30Var3, (byte) 17), x340Var16), x340Var16, f8d1.b(qim0VarK, rih1Var2, (PointerInputEventHandler) objT8), z12);
                if (z11 && exi0Var.a) {
                    x340Var16.i0(836578433);
                    tq60 tq60Var = new tq60(eraVar2);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var16).b;
                    qim0 qim0VarB2 = uyn1.B(tq60Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM2 = x340Var16.m();
                    qim0 qim0VarE2 = zr7.E(x340Var16, qim0VarB2);
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(gfh0VarC, x340Var16, lljVar);
                    nko1.H(xos0VarM2, x340Var16, lljVar2);
                    x0d.q(iHashCode2, x340Var16, lljVar3, x340Var16);
                    nko1.H(qim0VarE2, x340Var16, lljVar4);
                    kgq kgqVar = (kgq) qj0Var.e;
                    String str3 = ixi0Var.a;
                    kgqVar.getClass();
                    fqm fqmVar = new fqm(str3);
                    String str4 = ixi0Var.b;
                    boolean z13 = i3 == 256;
                    Object objT9 = x340Var16.T();
                    if (z13 || objT9 == m4cVar3) {
                        objT9 = new edi0(iu30Var3, (byte) 15);
                        x340Var16.s0(objT9);
                    }
                    z3 = true;
                    otw.c(fqmVar, new eqm(str4, eraVar2, 1, (Function0) objT9), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                    x340Var16.r(true);
                    x340Var16.r(false);
                } else {
                    z3 = true;
                    x340Var16.i0(837147345);
                    x340Var16.r(false);
                }
                x340Var16.r(z3);
                return rih1Var2;
            case 8:
                zyi0 zyi0Var = (zyi0) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var17 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                bzi0 bzi0Var = (bzi0) nm1Var;
                int i4 = (iIntValue6 & 48) == 0 ? iIntValue6 | (x340Var17.g(zyi0Var) ? 32 : 16) : iIntValue6;
                if ((iIntValue6 & 384) == 0) {
                    i4 |= x340Var17.i(iu30Var4) ? 256 : 128;
                }
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    x340Var18.b0();
                } else if (zyi0Var.n.equals(qyi0.a)) {
                    x340Var18.i0(107994887);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(-947069656);
                    String str5 = bzi0Var.Y;
                    boolean z14 = bzi0Var.N0;
                    String str6 = bzi0Var.Z;
                    z201 z201Var = bzi0Var.c;
                    qj0 qj0Var2 = bzi0Var.e;
                    c101 c101Var = (c101) bzi0Var.P0.getValue();
                    sve sveVar = bzi0Var.f;
                    ngs0 ngs0Var = bzi0Var.g;
                    lgq lgqVar = bzi0Var.h;
                    h4q h4qVar2 = bzi0Var.t;
                    umf0 umf0Var = bzi0Var.X;
                    String str7 = bzi0Var.Z;
                    add addVar = bzi0Var.d;
                    boolean z15 = zyi0Var.v;
                    c9 c9VarF = fg91.b;
                    if (z15 && addVar.k() && addVar.m()) {
                        boolean zJ2 = u890.j(zyi0Var.d.a, str7);
                        if (bzi0Var.N0 || zJ2) {
                            List list2 = zyi0Var.q;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                Object next = it2.next();
                                h4q h4qVar3 = h4qVar2;
                                pj01 pj01Var = (pj01) next;
                                x340 x340Var19 = x340Var18;
                                boolean z16 = z14;
                                if (pj01Var.b == sl01.c && !u890.j(pj01Var.c.a, str7)) {
                                    arrayList.add(next);
                                }
                                it = it2;
                                z14 = z16;
                                h4qVar2 = h4qVar3;
                                x340Var18 = x340Var19;
                            }
                            h4qVar = h4qVar2;
                            x340Var = x340Var18;
                            z4 = z14;
                            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(((pj01) it3.next()).c);
                            }
                            c9VarF = mqo1.F(arrayList2);
                        } else {
                            h4qVar = h4qVar2;
                            x340Var = x340Var18;
                            z4 = z14;
                        }
                    } else {
                        h4qVar = h4qVar2;
                        x340Var = x340Var18;
                        z4 = z14;
                    }
                    c9 c9Var = c9VarF;
                    Parcelable.Creator creator = w4i1.CREATOR;
                    dxo1.j(zyi0Var, str5, str6, z4, z201Var, qj0Var2, c101Var, sveVar, ngs0Var, lgqVar, h4qVar, umf0Var, c9Var, iu30Var4, (qim0) null, zyi0Var.r, zyi0Var.s, zyi0Var.u, x340Var, ((i4 >> 3) & 14) | 16777216, (i4 << 3) & 7168);
                    x340Var.r(false);
                }
                return rih1Var2;
            case 9:
                aaj0 aaj0Var = (aaj0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                daj0 daj0Var = (daj0) nm1Var;
                bin.F(daj0Var, aaj0Var, aaj0Var, (i8h1) daj0Var.b.get(), x340Var20, (iIntValue7 & 112) | ((iIntValue7 << 3) & 896));
                if ((((iIntValue7 & 896) ^ 384) <= 256 || !x340Var20.g(iu30Var5)) && (iIntValue7 & 384) != 256) {
                    z5 = false;
                }
                x340 x340Var21 = x340Var20;
                Object objT10 = x340Var21.T();
                if (z5 || objT10 == fkj0.X) {
                    objT10 = new edi0(iu30Var5, (byte) 16);
                    x340Var21.s0(objT10);
                }
                mqo1.e((Function0) objT10, (i3u) null, (vu30) null, u0j.a, apo.r(-1857534203, new yih0(aaj0Var, (byte) 18), x340Var21), apo.r(-1209306746, new k2g0(iu30Var5, (byte) 7), x340Var21), (vu30) null, x340Var21, 224256, 70);
                return rih1Var2;
            case 10:
                rih1 rih1Var3 = (rih1) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                maj0 maj0Var = (maj0) nm1Var;
                int i5 = maj0Var.a;
                rih1 rih1Var4 = rih1.a;
                if (i5 == 1) {
                    x340 x340Var23 = x340Var22;
                    x340Var23.i0(-734552891);
                    bin.F(maj0Var, rih1Var4, rih1Var3, (i8h1) maj0Var.c.get(), x340Var23, ((iIntValue8 << 3) & 896) | 48);
                    rih1Var = rih1Var4;
                    x340Var2 = x340Var23;
                } else {
                    rih1Var = rih1Var4;
                    x340Var2 = x340Var22;
                    x340Var2.i0(-1296261816);
                }
                x340Var2.r(false);
                nyx.a(2, (wux) null, apo.r(1554082279, new laj0(iu30Var6, maj0Var, (byte) 2), x340Var22), x340Var22, 3078, 6);
                return rih1Var;
            case 11:
                taj0 taj0Var = (taj0) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                vaj0 vaj0Var = (vaj0) nm1Var;
                boolean z17 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var24.g(iu30Var7)) || (iIntValue9 & 384) == 256;
                x340 x340Var25 = x340Var24;
                Object objT11 = x340Var25.T();
                if (z17 || objT11 == fkj0.X) {
                    objT11 = new edi0(iu30Var7, (byte) 19);
                    x340Var25.s0(objT11);
                }
                mqo1.e((Function0) objT11, (i3u) null, (vu30) null, apo.r(-68070382, new uaj0(vaj0Var, taj0Var, (byte) 0), x340Var25), apo.r(1485016979, new uaj0(vaj0Var, taj0Var, (byte) 1), x340Var25), apo.r(-1256862956, new k2g0(iu30Var7, (byte) 8), x340Var25), apo.r(296224405, new k2g0(iu30Var7, (byte) 9), x340Var25), x340Var25, 1797120, 6);
                return rih1Var2;
            case 12:
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                mej0 mej0Var = (mej0) nm1Var;
                rih1 rih1Var5 = rih1.a;
                bin.F(mej0Var, rih1Var5, (rih1) obj2, (i8h1) mej0Var.b.get(), x340Var26, ((iIntValue10 << 3) & 896) | 48);
                if ((((iIntValue10 & 896) ^ 384) <= 256 || !x340Var26.g(iu30Var8)) && (iIntValue10 & 384) != 256) {
                    z5 = false;
                }
                x340 x340Var27 = x340Var26;
                Object objT12 = x340Var27.T();
                if (z5 || objT12 == fkj0.X) {
                    objT12 = new edi0(iu30Var8, (byte) 23);
                    x340Var27.s0(objT12);
                }
                mqo1.e((Function0) objT12, (i3u) null, (vu30) null, f1j.a, f1j.b, apo.r(-1395713126, new k2g0(iu30Var8, (byte) 10), x340Var27), (vu30) null, x340Var27, 224256, 70);
                return rih1Var5;
            case 13:
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var28 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                qej0 qej0Var = (qej0) nm1Var;
                rih1 rih1Var6 = rih1.a;
                bin.F(qej0Var, rih1Var6, (rih1) obj2, (i8h1) qej0Var.b.get(), x340Var28, ((iIntValue11 << 3) & 896) | 48);
                if ((((iIntValue11 & 896) ^ 384) <= 256 || !x340Var28.g(iu30Var9)) && (iIntValue11 & 384) != 256) {
                    z5 = false;
                }
                x340 x340Var29 = x340Var28;
                Object objT13 = x340Var29.T();
                if (z5 || objT13 == fkj0.X) {
                    objT13 = new edi0(iu30Var9, (byte) 25);
                    x340Var29.s0(objT13);
                }
                mqo1.e((Function0) objT13, (i3u) null, (vu30) null, g1j.a, g1j.b, apo.r(1197274386, new k2g0(iu30Var9, (byte) 11), x340Var29), (vu30) null, x340Var29, 224256, 70);
                return rih1Var6;
            case 14:
                sej0 sej0Var = (sej0) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var30 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                uej0 uej0Var = (uej0) nm1Var;
                bin.F(uej0Var, sej0Var, sej0Var, (i8h1) uej0Var.a.get(), x340Var30, (iIntValue12 & 112) | ((iIntValue12 << 3) & 896));
                int iC = l1d.C(sej0Var.a);
                if (iC == 0) {
                    x340 x340Var31 = x340Var30;
                    strK = x0d.k(x340Var31, 845560158, 2131958818, x340Var31, false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var30, 845551734, false);
                    }
                    x340 x340Var32 = x340Var30;
                    strK = x0d.k(x340Var32, 845554496, 2131958819, x340Var32, false);
                }
                if ((((iIntValue12 & 896) ^ 384) <= 256 || !x340Var30.g(iu30Var10)) && (iIntValue12 & 384) != 256) {
                    z5 = false;
                }
                x340 x340Var33 = x340Var30;
                Object objT14 = x340Var33.T();
                if (z5 || objT14 == fkj0.X) {
                    objT14 = new edi0(iu30Var10, (byte) 27);
                    x340Var33.s0(objT14);
                }
                mqo1.e((Function0) objT14, (i3u) null, (vu30) null, i1j.a, i1j.b, apo.r(1852926022, new k2g0(iu30Var10, (byte) 12), x340Var33), apo.r(-382118777, new qgd(iu30Var10, strK, (byte) 10), x340Var33), x340Var33, 1797120, 6);
                return rih1Var2;
            case 15:
                return a(obj, obj2, obj3, obj4, obj5);
            case 16:
                return d(obj, obj2, obj3, obj4, obj5);
            case 17:
                return e(obj, obj2, obj3, obj4, obj5);
            case 18:
                return f(obj, obj2, obj3, obj4, obj5);
            case 19:
                return g(obj, obj2, obj3, obj4, obj5);
            case 20:
                return h(obj, obj2, obj3, obj4, obj5);
            case 21:
                return i(obj, obj2, obj3, obj4, obj5);
            case 22:
                return j(obj, obj2, obj3, obj4, obj5);
            case 23:
                return k(obj, obj2, obj3, obj4, obj5);
            case 24:
                return m(obj, obj2, obj3, obj4, obj5);
            case 25:
                return n(obj, obj2, obj3, obj4, obj5);
            case 26:
                return o(obj, obj2, obj3, obj4, obj5);
            case 27:
                return p(obj, obj2, obj3, obj4, obj5);
            case 28:
                return q(obj, obj2, obj3, obj4, obj5);
            default:
                nlk0 nlk0Var = (nlk0) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                ((Number) obj5).intValue();
                x340 x340Var34 = (b0k) obj4;
                boolean z18 = x340Var34.k(t4k.n) == flb0.b;
                jo70 jo70Var = nlk0Var.b;
                if (jo70Var != null && (list = jo70Var.d) != null) {
                    List list3 = list;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(((ho70) it4.next()).a);
                    }
                    z6x arrayList4 = new ArrayList();
                    for (Object obj6 : arrayList3) {
                        if (((String) obj6).length() > 0) {
                            arrayList4.add(obj6);
                        }
                    }
                    z6xVarT0 = arrayList4;
                }
                if (z6xVarT0 == null) {
                    z6xVarT0 = z6x.a;
                }
                if (z18) {
                    z6xVarT0 = o7h.T0((Iterable) z6xVarT0);
                }
                String strY0 = o7h.y0((Iterable) z6xVarT0, ", ", (String) null, (String) null, (iu30) null, 62);
                if (nlk0Var.a.e == 0) {
                    x340Var34.i0(-1906979341);
                    Object objT15 = x340Var34.T();
                    if (objT15 == fkj0.X) {
                        objT15 = qkk0.V0;
                        x340Var34.s0(objT15);
                    }
                    qim0VarB = s161.b(qim0VarB, true, (iu30) objT15);
                    x340Var34.r(false);
                } else {
                    x340Var34.i0(-1906907111);
                    x340Var34.r(false);
                }
                jto1.b(qim0VarB, (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(1184387970, new rlk0(nlk0Var, (byte) 0), x340Var34), (xu30) null, apo.r(2104674691, new qdg0(strY0, (byte) 8), x340Var34), apo.r(-2067388668, new iwf0(nm1Var, nlk0Var, iu30Var11, (byte) 24), x340Var34), (xu30) null, (xu30) null, apo.r(-1698676857, new rlk0(nlk0Var, (byte) 1), x340Var34), x340Var34, 805306368, 197040, 26110);
                return rih1Var2;
        }
    }
}
