package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v72 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v72(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        w7h1 w7h1Var;
        int i3;
        int i4;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i5 = 2;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                xll0 xll0Var = (xll0) obj;
                y6h1 y6h1Var = xll0Var.a;
                fjl0 fjl0Var = xll0Var.b;
                if (!((pe) ((z72) obj5).g).e()) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, fjl0Var.b, System.currentTimeMillis());
                }
                String str = nik1.w6.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1Var, fjl0Var.b, System.currentTimeMillis());
            case 1:
                ahm0 ahm0Var = (ahm0) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                oc2 oc2Var = (oc2) obj5;
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (x340Var.g(ahm0Var) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    mod.b(oi7.a.a(oc2Var.a), apo.r(915122120, new q1(ahm0Var, iu30Var, oc2Var, (byte) 26), x340Var2), x340Var2, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                uzl0 uzl0Var = (uzl0) ((tm) obj5).d;
                uzl0Var.getClass();
                return new kzl0(uzl0Var);
            case 3:
                wm2 wm2Var = (wm2) obj;
                int iIntValue2 = ((Number) obj4).intValue();
                wm2Var.getClass();
                an2 an2Var = (an2) obj5;
                aq8.a(wm2Var, (iu30) obj2, an2Var.d, an2Var.e, (qim0) null, (b0k) obj3, iIntValue2 & 112);
                return rih1Var;
            case 4:
                return new vh((ViewGroup) obj3, (Context) obj2, (jb3) obj5);
            case 5:
                rt01 rt01Var = (rt01) obj5;
                return new dv70((kly0) rt01Var.c, (ViewGroup) obj3, new jm1(rt01Var, (byte) 24), (Context) obj2, true);
            case 6:
                rt01 rt01Var2 = (rt01) obj5;
                return new vh((Context) obj2, (ViewGroup) obj3, new ne(3, new pb3(rt01Var2, (byte) 1)), rt01Var2);
            case 7:
                return new u3((Context) obj2, (ViewGroup) obj3, (dx0) obj5);
            case 8:
                tqk0 tqk0Var = (tqk0) obj;
                if (((mg3) obj4).equals(mg3.a)) {
                    String str2 = (String) ((idd1) ((ug3) obj5).e).getValue();
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), tqk0Var.a, tqk0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 9:
                ((Number) obj3).intValue();
                return new jrk0(((ft3) obj5).a);
            case 10:
                ((Number) obj3).intValue();
                return new hrk0(new jrk0(((pt3) obj5).b));
            case 11:
                ((Number) obj3).intValue();
                return new krk0((bqk0) ((ldo) obj5).c);
            case 12:
                ((Number) obj3).intValue();
                return new lrk0(((pt3) obj5).b);
            case 13:
                hx3 hx3Var = (hx3) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                jw3 jw3Var = (jw3) obj5;
                if ((iIntValue3 & 6) == 0) {
                    i2 = iIntValue3 | (x340Var3.g(hx3Var) ? 4 : 2);
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i2 |= x340Var3.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    Object objT = x340Var4.T();
                    if (objT == fkj0.X) {
                        objT = new AtomicBoolean(false);
                        x340Var4.s0(objT);
                    }
                    AtomicBoolean atomicBoolean = (AtomicBoolean) objT;
                    lmt0.m(jw3Var.d, jw3Var.g, hx3Var.a, hx3Var.b, atomicBoolean, x340Var4, 0);
                    lmt0.a(hx3Var, jw3Var.b.c, jw3Var.f, iu30Var2, atomicBoolean, x340Var4, (i2 << 6) & 7168);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 14:
                return new mmr0(new dx0(new f06((Observable) obj, (byte) 1), new z04((Function0) obj3), (lik1) ((x6o0) ((cp5) obj5).b).b, new y04((vu30) obj4), ((Number) obj2).intValue()), t04.a);
            case 15:
                yy5 yy5Var = (dz5) obj4;
                yfr yfrVar = (yfr) ((pt) obj5).d;
                y6h1 y6h1Var2 = ((psk0) obj).a;
                String strConcat = "apple-tv-companion:".concat(((ez5) obj2).a);
                if (yy5Var instanceof az5) {
                    return null;
                }
                if (yy5Var.equals(zy5.a)) {
                    if (!((rz5) yfrVar.n.a.getValue()).b()) {
                        return null;
                    }
                    x6h1 x6h1VarC = y6h1Var2.c();
                    x6h1VarC.i.add(new a7h1("generate_new_code_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else if (yy5Var.equals(bz5.a)) {
                    if (!((rz5) yfrVar.n.a.getValue()).d()) {
                        return null;
                    }
                    x6h1 x6h1VarC2 = y6h1Var2.c();
                    x6h1VarC2.i.add(new a7h1("connect_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("connect_to_remote_device", 1, Collections.singletonMap("remote_device_id", strConcat)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else if (yy5Var.equals(cz5.a)) {
                    if (!((rz5) yfrVar.n.a.getValue()).e()) {
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var2.c();
                    x6h1VarC3.i.add(new a7h1("connect_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("connect_to_remote_device", 1, Collections.singletonMap("remote_device_id", strConcat)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(yy5Var instanceof yy5)) {
                        eg.o();
                        return null;
                    }
                    if (!(yy5Var.a instanceof gxb)) {
                        return null;
                    }
                    x6h1 x6h1VarC4 = y6h1Var2.c();
                    x6h1VarC4.i.add(new a7h1("system_dismiss", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 16:
                ((z46) obj5).f.a((fa6) obj, (iu30) obj2, (b0k) obj3, ((Number) obj4).intValue() & 126);
                return rih1Var;
            case 17:
                ((Number) obj).intValue();
                ((Boolean) obj2).getClass();
                ((Number) obj4).intValue();
                x340 x340Var5 = (b0k) obj3;
                x340Var5.i0(-1724127091);
                bbc bbcVar = (bbc) obj5;
                x340Var5.r(false);
                return bbcVar;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                bs0 bs0Var = (bs0) obj5;
                return new as0((Context) obj2, new ne(3, new er6(bs0Var, (byte) 2)), bs0Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new vh((Context) obj2, (f37) obj5);
            case 20:
                int iIntValue4 = ((Number) obj3).intValue();
                jsk0 jsk0Var = new jsk0(new gsk0(((f87) obj5).a, (byte) 1));
                yrd yrdVar = ((d87) obj).a;
                return new isk0(jsk0Var, yrdVar.i.a, Integer.valueOf(iIntValue4), yrdVar.i.b);
            case 21:
                ((Number) obj3).intValue();
                return new jsk0(new gsk0(((i87) obj5).b, (byte) 1));
            case 22:
                rb7 rb7Var = (rb7) obj;
                int iIntValue5 = ((Number) obj4).intValue();
                zwg zwgVar = (zwg) obj5;
                q87 q87Var = (q87) zwgVar.b;
                rb7Var.getClass();
                q87Var.d(rb7Var, (iu30) obj2, ((xb7) zwgVar.d).k().l(), null, (b0k) obj3, iIntValue5 & 112);
                return rih1Var;
            case 23:
                ((Number) obj3).intValue();
                int iOrdinal = ((ia7) obj).a.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i5 = 1;
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        i5 = 3;
                    }
                }
                return new hsk0((ksk0) ((br0) obj5).c, i5);
            case 24:
                jjm0 jjm0Var = (jjm0) obj;
                int iIntValue6 = ((Number) obj4).intValue();
                mc7 mc7Var = (mc7) obj5;
                m4c m4cVar = fkj0.X;
                x340 x340Var6 = (b0k) obj3;
                x340Var6.i0(-845322380);
                ven0 ven0VarS = v8r.s((kc7) obj2, x340Var6);
                boolean zI = x340Var6.i(ven0VarS);
                Object objT2 = x340Var6.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new w63(ven0VarS, (lnm) null, (byte) 1);
                    x340Var6.s0(objT2);
                }
                jjm0Var.a((zu30) objT2, x340Var6, (iIntValue6 << 3) & 112);
                boolean zG = x340Var6.g(((kc7) ven0VarS.getValue()).b.getUri()) | x340Var6.h(((kc7) ven0VarS.getValue()).d);
                Object objT3 = x340Var6.T();
                if (zG || objT3 == m4cVar) {
                    objT3 = mc7Var.j(((kc7) ven0VarS.getValue()).b.getUri(), ((kc7) ven0VarS.getValue()).d);
                    x340Var6.s0(objT3);
                }
                lc7 lc7VarL = mc7Var.l((kc7) ven0VarS.getValue(), ((Boolean) rwq.g((mr20) objT3, Boolean.FALSE, (o8n) null, x340Var6, 48, 2).getValue()).booleanValue());
                x340Var6.r(false);
                return lc7VarL;
            case 25:
                o88 o88Var = (o88) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                if ((iIntValue7 & 6) == 0) {
                    i3 = iIntValue7 | (x340Var7.g(o88Var) ? 4 : 2);
                } else {
                    i3 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i3 |= x340Var7.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i3 & 1, (i3 & 147) != 146)) {
                    irn1.u((qim0) null, w7i.a, (vu30) null, (erl1) null, apo.r(-792952814, new n891(o88Var, iu30Var3, (q88) obj5, (byte) 22), x340Var8), x340Var8, 24624, 13);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 26:
                jjm0 jjm0Var2 = (jjm0) obj;
                int iIntValue8 = ((Number) obj4).intValue();
                br0 br0Var = (br0) obj5;
                x340 x340Var9 = (b0k) obj3;
                boolean zI2 = x340Var9.i(br0Var);
                Object objT4 = x340Var9.T();
                if (zI2 || objT4 == fkj0.X) {
                    objT4 = new vd2(br0Var, (lnm) null, (byte) 3);
                    x340Var9.s0(objT4);
                }
                jjm0Var2.a((zu30) objT4, x340Var9, (iIntValue8 << 3) & 112);
                return rih1Var;
            case 27:
                aa9 aa9Var = (aa9) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var10 = (b0k) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                ca9 ca9Var = (ca9) obj5;
                if ((iIntValue9 & 6) == 0) {
                    i4 = iIntValue9 | ((iIntValue9 & 8) == 0 ? x340Var10.g(aa9Var) : x340Var10.i(aa9Var) ? 4 : 2);
                } else {
                    i4 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i4 |= x340Var10.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(i4 & 1, (i4 & 147) != 146)) {
                    cbr0 cbr0Var = ca9Var.f;
                    oh4 oh4Var = ca9Var.e.b;
                    cbr0Var.a(new yxe1(new ehc1(aa9Var.d)));
                    Object objT5 = x340Var11.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT5 == m4cVar2) {
                        objT5 = v8r.q(Boolean.FALSE);
                        x340Var11.s0(objT5);
                    }
                    ven0 ven0Var = (ven0) objT5;
                    boolean zI3 = x340Var11.i(ven0Var) | x340Var11.i(ca9Var);
                    Object objT6 = x340Var11.T();
                    if (zI3 || objT6 == m4cVar2) {
                        objT6 = new wc5(ca9Var, ven0Var, (lnm) null);
                        x340Var11.s0(objT6);
                    }
                    qxd0.t(rih1Var, x340Var11, (vu30) objT6);
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    int i6 = ca9Var.b.a;
                    int i7 = i4 << 3;
                    u0p1.a(zBooleanValue, aa9Var, iu30Var4, (qim0) null, oh4Var.D(), oh4Var.C(), i6, x340Var11, (i7 & 112) | 64 | (i7 & 896));
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 28:
                auk0 auk0Var = new auk0(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
                ((hn9) obj5).X = auk0Var.b();
                return auk0Var;
            default:
                int iIntValue10 = ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                ((yxb0) obj5).f = r6h1Var;
                return new buk0(Integer.valueOf(iIntValue10), ((kn9) obj).a, r6h1Var);
        }
    }
}
