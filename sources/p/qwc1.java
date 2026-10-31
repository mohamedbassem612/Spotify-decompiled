package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qwc1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qwc1(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0186  */
    /* JADX WARN: Code duplicated, block: B:46:0x018d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0194  */
    /* JADX WARN: Code duplicated, block: B:52:0x0199  */
    /* JADX WARN: Code duplicated, block: B:54:0x019c  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x02d0  */
    public final Object invoke(Object obj) {
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        gzh1 gzh1Var;
        ole1 ole1Var;
        String str;
        String strConcat;
        w7h1 w7h1Var;
        byte b = this.a;
        int i = 4;
        b7x b7xVar = b7x.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((dv51) obj2).f.invoke(bool);
                return rih1Var;
            case 1:
                String str2 = ((qxc1) obj2).d;
                str2.getClass();
                b261.n((e261) obj, str2);
                return rih1Var;
            case 2:
                DrawScope.S0((DrawScope) obj, (zv61) obj2, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 15, 62);
                return rih1Var;
            case 3:
                return ((qzh) ((mfx0) obj2).b).getView();
            case 4:
                dbd1 dbd1Var = (hbd1) obj2;
                boolean zK = yto.k((String) obj, dbd1Var.b);
                if (!dbd1Var.c) {
                    z = zK;
                } else if (!zK) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                ViewGroup viewGroup = (ViewGroup) obj;
                dpc dpcVar = (dpc) obj2;
                ug3 ug3Var = dpcVar.a;
                vga1 vga1Var = dpcVar.b;
                tka0 tka0Var = dtw.C;
                Context context = viewGroup.getContext();
                qe41 qe41VarW = hm5.w(viewGroup);
                return mhc.b(context, viewGroup, ug3Var, vga1Var, qe41VarW != null ? z1a1.h(ug3Var, "TabHeadingElement_key", qe41VarW, vga1Var) : null, 96).w;
            case 6:
                return t5p1.j(((ito) ((ArrayList) ((qm91) obj2).f).get(((fgd1) obj).a)).c.c(), 3);
            case 7:
                lod1 lod1Var = (lod1) obj;
                hp91 hp91Var = (hp91) obj2;
                if (lod1Var instanceof kod1) {
                    kod1 kod1Var = (kod1) lod1Var;
                    hp91Var.j((czo1) hp91Var.c, new mnd1(kod1Var.a, kod1Var.b));
                } else {
                    if (!(lod1Var instanceof jod1)) {
                        eg.o();
                        return null;
                    }
                    int iC = l1d.C(((jod1) lod1Var).a);
                    if (iC == 0) {
                        i = 1;
                    } else if (iC == 1) {
                        i = 2;
                    } else if (iC == 2) {
                        i = 3;
                    } else if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    hp91Var.j((czo1) hp91Var.c, new lnd1(i));
                }
                return rih1Var;
            case 8:
                qnc0 qnc0Var = (qnc0) obj;
                ito itoVar = (ito) obj2;
                itoVar.j.invoke(qnc0Var);
                itoVar.c.a(qnc0Var);
                return rih1Var;
            case 9:
                n8b1 n8b1Var = (n8b1) obj2;
                return hm5.P(xay.e(2, n8b1Var), xay.f(2, n8b1Var));
            case 10:
                ysd1 ysd1Var = (ysd1) obj2;
                ((xas) obj).a(new k7b1(1, ysd1Var, ysd1.class, "saveResolvedState", "saveResolvedState(Lcom/spotify/campfire/chatpage/elements/tastematchcard/api/TasteMatchCardElement$State;)Landroid/os/Bundle;", 0, (byte) 11), new t491(ysd1Var, (byte) 27));
                return rih1Var;
            case 11:
                elb0 elb0Var = (elb0) obj;
                ((icr0) obj2).b.t(Float.intBitsToFloat((int) (elb0Var.p(0L) & 4294967295L)) + ((int) (elb0Var.b() & 4294967295L)));
                return rih1Var;
            case 12:
                h290 h290Var = ((lvd1) obj).c;
                svd1 svd1Var = (svd1) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(h290Var, 10));
                Iterator it = h290Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(new any(d3p1.H(svd1Var.a, svd1Var.b, (String) it.next()), (byte) 18));
                }
                return new z4t0((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 13);
            case 13:
                z710.d(((zvd1) obj2).c, (String) obj, false, 6);
                return rih1Var;
            case 14:
                String str3 = (String) obj;
                vnd1 vnd1Var = ((oyd1) obj2).f2;
                if (vnd1Var == null) {
                    u890.C("termsSheetLogger");
                    throw null;
                }
                i8h1 i8h1Var = (i8h1) vnd1Var.b;
                x6h1 x6h1VarC = ((hxk0) vnd1Var.c).a.c();
                x6h1VarC.i.add(new a7h1("text_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str3)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 15:
                return new ouc0((String) ((jd6) obj2).f);
            case 16:
                e261 e261Var = (e261) obj;
                k8e1 k8e1Var = (k8e1) obj2;
                if (k8e1Var.d.length() > 0) {
                    b261.x(e261Var, 0);
                    b261.n(e261Var, k8e1Var.e);
                }
                return rih1Var;
            case 17:
                rwq0.z((qtr) obj, new jie1((vzx) obj2, (byte) 0));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                tie1 tie1Var = (tie1) obj2;
                float fG = fd21.g(tie1Var.a, 0.35f, 0.5f, Float.intBitsToFloat((int) (lslVar.j() >> 32)));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L));
                float f = tie1Var.b;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(fd21.g(f, 0.35f, 0.5f, fIntBitsToFloat))) & 4294967295L);
                long j = u7h.f;
                u7h u7hVar = new u7h(u7h.b(j, 0.18f, 0.0f, 0.0f, 0.0f, 14));
                long j2 = u7h.j;
                DrawScope.S0(lslVar, v9c.o(p7h.M(new u7h[]{u7hVar, new u7h(j2)}), jFloatToRawIntBits, Size.e(lslVar.j()), 8), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 9, 62);
                DrawScope.S0(lslVar, v9c.m(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)))) << 32), p7h.M(new u7h[]{new u7h(j2), new u7h(u7h.b(j, 0.1f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j2)})), 0L, 0L, yoi1.o(Math.abs(f) + Math.abs(tie1Var.a), 0.05f, 0.4f), (DrawStyle) null, (ColorFilter) null, 9, 54);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((qtr) obj).b(new w3a((zke1) obj2, (lnm) null, (byte) 7));
                return rih1Var;
            case 20:
                ale1 ale1Var = (ale1) ((ble1) obj2).d.get();
                ((i8h1) ale1Var.a.get()).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), ale1Var.b.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 21:
                fle1 fle1Var = (fle1) ((gle1) obj2).c.get();
                ((i8h1) fle1Var.a.get()).m(fle1Var.b.h(), (xj61) null);
                return rih1Var;
            case 22:
                vbe1 vbe1Var = (vbe1) obj2;
                Resources resources = ((Context) vbe1Var.c).getResources();
                int iOrdinal = ((g05) vbe1Var.e).b().ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        mmr0Var2 = new mmr0(2131963194, 2131963190);
                    } else if (iOrdinal == 2) {
                        mmr0Var2 = new mmr0(2131963195, 2131963190);
                    } else if (iOrdinal == 3) {
                        mmr0Var = new mmr0(2131963192, 2131963191);
                    } else {
                        if (iOrdinal != 4) {
                            eg.o();
                            return null;
                        }
                        mmr0Var2 = new mmr0(2131963193, 2131963190);
                    }
                    int iIntValue = ((Number) mmr0Var2.a).intValue();
                    int iIntValue2 = ((Number) mmr0Var2.b).intValue();
                    String string = resources.getString(iIntValue);
                    String string2 = resources.getString(iIntValue2);
                    String string3 = resources.getString(2131963188);
                    if (((String) vbe1Var.g) != null) {
                        gzh1Var = new gzh1(null);
                    } else {
                        gzh1Var = fzh1.a;
                    }
                    return new nhb1(string, string2, string3, (String) null, true, gzh1Var, 64);
                }
                mmr0Var = new mmr0(2131963192, 2131963189);
                mmr0Var2 = mmr0Var;
                int iIntValue3 = ((Number) mmr0Var2.a).intValue();
                int iIntValue4 = ((Number) mmr0Var2.b).intValue();
                String string4 = resources.getString(iIntValue3);
                String string5 = resources.getString(iIntValue4);
                String string6 = resources.getString(2131963188);
                if (((String) vbe1Var.g) != null) {
                    gzh1Var = new gzh1(null);
                } else {
                    gzh1Var = fzh1.a;
                }
                return new nhb1(string4, string5, string6, (String) null, true, gzh1Var, 64);
            case 23:
                hxb hxbVar = (hxb) obj;
                if (hxbVar instanceof gxb) {
                    int iC2 = l1d.C(((gxb) hxbVar).a);
                    if (iC2 == 0) {
                        lle1 lle1Var = (lle1) ((mle1) obj2).c.get();
                        ole1Var = lle1Var.b;
                        str = ole1Var.a;
                        if (str != null) {
                            strConcat = "spotify:track:".concat(str);
                        } else {
                            strConcat = null;
                        }
                        if (strConcat == null) {
                            y6h1 y6h1Var = y6h1.i;
                            x6h1 x6h1VarI = i3o1.i();
                            x6h1VarI.h = "music";
                            x6h1VarI.a = "mobile-reinventfree-time-cap-upsell";
                            x6h1VarI.f = "3.0.0";
                            x6h1VarI.g = "22.0.0";
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarI.a(), r6h1.c, System.currentTimeMillis());
                        } else {
                            if (!ole1Var.b) {
                                strConcat = null;
                            }
                            if (strConcat != null) {
                                r6h1 r6h1Var = r6h1.c;
                                r6h1 r6h1Var2 = new r6h1(new ArrayList(), kul0.d);
                                y6h1 y6h1Var2 = y6h1.i;
                                x6h1 x6h1VarI2 = i3o1.i();
                                x6h1VarI2.h = "music";
                                x6h1VarI2.a = "mobile-reinventfree-time-cap-track-radio-upsell";
                                x6h1VarI2.f = "3.2.0";
                                x6h1VarI2.g = "22.0.0";
                                x6h1VarI2.d = strConcat;
                                y6h1 y6h1VarA = x6h1VarI2.a();
                                Collections.singletonList("reinventfree-time-cap-pivot-track-radio-upsell");
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1Var2, System.currentTimeMillis());
                            } else {
                                y6h1 y6h1Var3 = y6h1.i;
                                x6h1 x6h1VarI3 = i3o1.i();
                                x6h1VarI3.h = "music";
                                x6h1VarI3.a = "mobile-reinventfree-time-cap-upsell";
                                x6h1VarI3.f = "3.0.0";
                                x6h1VarI3.g = "22.0.0";
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarI3.a(), r6h1.c, System.currentTimeMillis());
                            }
                        }
                        ((i8h1) lle1Var.a.get()).m(w7h1Var, (xj61) null);
                    } else if (iC2 != 1) {
                        if (iC2 != 2) {
                            eg.o();
                            return null;
                        }
                        lle1 lle1Var2 = (lle1) ((mle1) obj2).c.get();
                        ole1Var = lle1Var2.b;
                        str = ole1Var.a;
                        if (str != null) {
                            strConcat = "spotify:track:".concat(str);
                        } else {
                            strConcat = null;
                        }
                        if (strConcat == null) {
                            y6h1 y6h1Var4 = y6h1.i;
                            x6h1 x6h1VarI4 = i3o1.i();
                            x6h1VarI4.h = "music";
                            x6h1VarI4.a = "mobile-reinventfree-time-cap-upsell";
                            x6h1VarI4.f = "3.0.0";
                            x6h1VarI4.g = "22.0.0";
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarI4.a(), r6h1.c, System.currentTimeMillis());
                        } else {
                            if (!ole1Var.b) {
                                strConcat = null;
                            }
                            if (strConcat != null) {
                                r6h1 r6h1Var3 = r6h1.c;
                                r6h1 r6h1Var4 = new r6h1(new ArrayList(), kul0.d);
                                y6h1 y6h1Var5 = y6h1.i;
                                x6h1 x6h1VarI5 = i3o1.i();
                                x6h1VarI5.h = "music";
                                x6h1VarI5.a = "mobile-reinventfree-time-cap-track-radio-upsell";
                                x6h1VarI5.f = "3.2.0";
                                x6h1VarI5.g = "22.0.0";
                                x6h1VarI5.d = strConcat;
                                y6h1 y6h1VarA2 = x6h1VarI5.a();
                                Collections.singletonList("reinventfree-time-cap-pivot-track-radio-upsell");
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA2, r6h1Var4, System.currentTimeMillis());
                            } else {
                                y6h1 y6h1Var6 = y6h1.i;
                                x6h1 x6h1VarI6 = i3o1.i();
                                x6h1VarI6.h = "music";
                                x6h1VarI6.a = "mobile-reinventfree-time-cap-upsell";
                                x6h1VarI6.f = "3.0.0";
                                x6h1VarI6.g = "22.0.0";
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarI6.a(), r6h1.c, System.currentTimeMillis());
                            }
                        }
                        ((i8h1) lle1Var2.a.get()).m(w7h1Var, (xj61) null);
                    }
                }
                return rih1Var;
            case 24:
                int iIntValue5 = ((Number) obj).intValue();
                xy31 xy31Var = ((yy31) obj2).c;
                int i2 = iIntValue5 / (xy31Var != null ? xy31Var.c : 1);
                int i3 = iIntValue5 % (xy31Var != null ? xy31Var.c : 1);
                return i3 == 0 ? String.valueOf(i2) : ab80.m(i2, i3, "_");
            case 25:
                eqc eqcVar = (eqc) obj;
                long j3 = u7h.f;
                return eqcVar.a(new cmd1((dui1) obj2, new mic0(0, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)))) & 4294967295L), p7h.M(new u7h[]{new u7h(u7h.b(j3, 0.3f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j3, 0.02f, 0.0f, 0.0f, 0.0f, 14))}), (List) null), (byte) 16));
            case 26:
                return Double.valueOf(c9c.m((mf30) obj2, (mf30) obj));
            case 27:
                bpb1 bpb1Var = ((e0f1) obj2).a;
                mog1 mog1Var = new mog1(((mlv0) obj).b().a().tokenExchangeTransport());
                bpb1Var.getClass();
                bpb1Var.m((Object) null, mog1Var);
                return rih1Var;
            case 28:
                paj0 paj0Var = (paj0) obj;
                switch (((n4f1) obj2).a.a) {
                    case 0:
                        return new ldo(paj0Var, new k4f1());
                    case 1:
                        return new ldo(paj0Var, new k4f1());
                    case 2:
                        return new ldo(paj0Var, new k4f1());
                    default:
                        return new ldo(paj0Var, new k4f1());
                }
            default:
                String str4 = ((l1o) ((pc8) obj2).c).a;
                ArrayList<ifr0> arrayList2 = ((jfr0) obj).a;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                for (ifr0 ifr0Var : arrayList2) {
                    arrayList3.add(new c9f1(ifr0Var.a, ifr0Var.b, ifr0Var.c));
                }
                return new d9f1(str4, arrayList3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qwc1(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj2;
    }
}
