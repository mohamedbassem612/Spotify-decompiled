package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class phg {
    public static final long a = z4p1.g(4288585374L);
    public static final long b = z4p1.e(452984831);
    public static final float c = 6.0f;

    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v61 */
    public static final void a(String str, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, String str2, iu30 iu30Var3, Object obj, String str3, long j, boolean z, String str4, b0k b0kVar, int i) {
        x340 x340Var;
        Object obj2;
        int iE;
        Object obj3;
        Object obj4;
        float fX0;
        lz20 lz20Var;
        tob1 tob1Var;
        float f;
        ven0 ven0Var;
        ven0 ven0Var2;
        tob1 tob1Var2;
        x340 x340Var2;
        long j2;
        long j3;
        ?? r5;
        int i2;
        m4c m4cVar;
        x340 x340Var3;
        float f2;
        lee1 lee1VarA;
        boolean z2;
        Object obj5;
        Object khgVar;
        ven0 ven0Var3;
        boolean z3;
        tob1 tob1Var3;
        x340 x340Var4;
        boolean z4;
        Object obj6;
        x340 x340Var5 = (x340) b0kVar;
        x340Var5.k0(-916708173);
        int i3 = i | (x340Var5.g(str) ? 4 : 2) | (x340Var5.i(iu30Var) ? 32 : 16) | (x340Var5.i(iu30Var2) ? 256 : 128) | (x340Var5.i(qim0Var) ? 2048 : 1024) | (x340Var5.g((Object) null) ? 16384 : 8192) | (x340Var5.g(str2) ? 131072 : 65536) | (x340Var5.i(iu30Var3) ? 1048576 : 524288) | (x340Var5.i(obj) ? 8388608 : 4194304) | (x340Var5.g(str3) ? 67108864 : 33554432) | (x340Var5.f(j) ? 536870912 : 268435456);
        int i4 = (x340Var5.h(z) ? (char) 4 : (char) 2) | (x340Var5.g(str4) ? ' ' : (char) 16);
        if (x340Var5.Y(i3 & 1, ((i3 & 306783379) == 306783378 && ((i4 == true ? 1 : 0) & 19) == 18) ? false : true)) {
            x340Var5.d0();
            if ((i & 1) != 0 && !x340Var5.E()) {
                x340Var5.b0();
            }
            x340Var5.s();
            o811 o811Var = new o811();
            o811Var.a = u7h.k;
            gfx.b(6, apo.r(-1267862296, new ki6(o811Var, (byte) 1), x340Var5), x340Var5, 54);
            uwr uwrVar = cbx.a;
            long j4 = cbx.a(x340Var5).c.b;
            Object objT = x340Var5.T();
            m4c m4cVar2 = fkj0.X;
            Object obj7 = objT;
            if (objT == m4cVar2) {
                axx0 axx0Var = new axx0();
                x340Var5.s0(axx0Var);
                obj7 = axx0Var;
            }
            axx0 axx0Var2 = (axx0) obj7;
            Object[] objArr = {str, obj};
            int i5 = i3 & 14;
            boolean z5 = i5 == 4;
            Object objT2 = x340Var5.T();
            if (z5 || objT2 == m4cVar2) {
                yt3 yt3Var = new yt3(str, (byte) 2);
                x340Var5.s0(yt3Var);
                obj2 = yt3Var;
            } else {
                obj2 = objT2;
            }
            ven0 ven0Var4 = (ven0) k5p1.s(objArr, (Function0) obj2, x340Var5, 0);
            boolean zG = (i5 == 4) | x340Var5.g(obj);
            Object objT3 = x340Var5.T();
            Object obj8 = objT3;
            if (zG || objT3 == m4cVar2) {
                mmr0 mmr0VarB = b(axx0.a(axx0Var2, (String) ven0Var4.getValue()));
                x340Var5.s0(mmr0VarB);
                obj8 = mmr0VarB;
            }
            mmr0 mmr0Var = (mmr0) obj8;
            String str5 = (String) mmr0Var.a;
            List list = (List) mmr0Var.b;
            boolean zG2 = x340Var5.g(str5) | x340Var5.g(obj);
            Object objT4 = x340Var5.T();
            if (zG2 || objT4 == m4cVar2) {
                if (str3 != null) {
                    String str6 = (String) b(axx0.a(axx0Var2, str3)).a;
                    int length = ihc1.f0(str6, str5).length();
                    int length2 = ihc1.g0(str6, str5).length();
                    int iMin = Math.min(str6.length(), str5.length()) - length;
                    if (length2 > iMin) {
                        length2 = iMin;
                    }
                    iE = e(str5.length() - length2, list);
                } else {
                    iE = 0;
                }
                hrr0 hrr0VarQ = v8r.q(new c8e1(e6p1.e(iE, iE), 4, str5));
                x340Var5.s0(hrr0VarQ);
                obj3 = hrr0VarQ;
            } else {
                ven0Var4 = ven0Var4;
                obj3 = objT4;
            }
            tob1 tob1Var4 = (ven0) obj3;
            boolean zG3 = x340Var5.g(list) | x340Var5.g(obj);
            Object objT5 = x340Var5.T();
            Object obj9 = objT5;
            if (zG3 || objT5 == m4cVar2) {
                hrr0 hrr0VarQ2 = v8r.q(list);
                x340Var5.s0(hrr0VarQ2);
                obj9 = hrr0VarQ2;
            }
            tob1 tob1Var5 = (ven0) obj9;
            Object objT6 = x340Var5.T();
            Object obj10 = objT6;
            if (objT6 == m4cVar2) {
                hrr0 hrr0VarQ3 = v8r.q((Object) null);
                x340Var5.s0(hrr0VarQ3);
                obj10 = hrr0VarQ3;
            }
            ven0 ven0Var5 = (ven0) obj10;
            Object objT7 = x340Var5.T();
            Object obj11 = objT7;
            if (objT7 == m4cVar2) {
                hrr0 hrr0VarQ4 = v8r.q((Object) null);
                x340Var5.s0(hrr0VarQ4);
                obj11 = hrr0VarQ4;
            }
            ven0 ven0Var6 = (ven0) obj11;
            wat watVar = (wat) x340Var5.k(t4k.h);
            lee1 lee1Var = cbx.d(x340Var5).g;
            yae1 yae1VarQ = d5p1.q(0, x340Var5, 1);
            boolean zG4 = x340Var5.g(lee1Var) | x340Var5.g(watVar);
            Object objT8 = x340Var5.T();
            if (zG4 || objT8 == m4cVar2) {
                Integer numValueOf = Integer.valueOf((int) (yae1.a(yae1VarQ, "A", lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c & 4294967295L));
                x340Var5.s0(numValueOf);
                obj4 = numValueOf;
            } else {
                obj4 = objT8;
            }
            int iIntValue = ((Number) obj4).intValue();
            wee1[] wee1VarArr = TextUnit.b;
            long j5 = 1095216660480L & j;
            if (j5 == 0) {
                fX0 = 0.0f;
            } else {
                float fQ0 = watVar.q0(j) - iIntValue;
                if (fQ0 < 0.0f) {
                    fQ0 = 0.0f;
                }
                fX0 = watVar.X0(2.0f) + fQ0;
            }
            float fX1 = watVar.X0(0.0f) - (fX0 / 2.0f);
            Object objT9 = x340Var5.T();
            Object objI = objT9;
            if (objT9 == m4cVar2) {
                objI = pzm.i(x340Var5);
            }
            lz20 lz20Var2 = (lz20) objI;
            k6a1 k6a1Var = (k6a1) x340Var5.k(t4k.q);
            crl1 crl1Var = (crl1) x340Var5.k(t4k.u);
            Object[] objArr2 = new Object[0];
            Object objT10 = x340Var5.T();
            Object obj12 = objT10;
            if (objT10 == m4cVar2) {
                nyf nyfVar = nyf.h;
                x340Var5.s0(nyfVar);
                obj12 = nyfVar;
            }
            ven0 ven0Var7 = (ven0) k5p1.s(objArr2, (Function0) obj12, x340Var5, 48);
            boolean zI = (((i4 == true ? 1 : 0) & 14) == 4) | x340Var5.i(ven0Var7) | x340Var5.i(crl1Var) | x340Var5.i(tob1Var4) | x340Var5.i(lz20Var2) | x340Var5.i(k6a1Var);
            Object objT11 = x340Var5.T();
            if (zI || objT11 == m4cVar2) {
                objT11 = new oeb(z, lz20Var2, k6a1Var, ven0Var7, crl1Var, tob1Var4, null);
                lz20Var = lz20Var2;
                tob1Var = tob1Var4;
                x340Var5.s0(objT11);
            } else {
                lz20Var = lz20Var2;
                tob1Var = tob1Var4;
            }
            qxd0.t(rih1.a, x340Var5, (vu30) objT11);
            ven0 ven0VarS = v8r.s(iu30Var3, x340Var5);
            Object[] objArr3 = {(y9e1) ven0Var5.getValue(), (List) tob1Var5.getValue(), (Offset) ven0Var6.getValue(), Float.valueOf(fX1)};
            boolean zI2 = x340Var5.i(ven0Var5) | x340Var5.i(ven0Var6) | x340Var5.i(watVar) | x340Var5.d(fX1) | x340Var5.i(ven0VarS) | x340Var5.i(tob1Var5);
            Object objT12 = x340Var5.T();
            if (zI2 || objT12 == m4cVar2) {
                f = fX1;
                objT12 = new jhg(watVar, f, ven0Var5, ven0Var6, ven0VarS, tob1Var5, null);
                ven0Var = ven0Var5;
                ven0Var2 = ven0Var6;
                tob1Var2 = tob1Var5;
                x340Var5.s0(objT12);
            } else {
                ven0Var = ven0Var5;
                ven0Var2 = ven0Var6;
                f = fX1;
                tob1Var2 = tob1Var5;
            }
            qxd0.u(objArr3, (vu30) objT12, x340Var5);
            int i6 = i3 & 458752;
            boolean zG5 = x340Var5.g((List) tob1Var2.getValue()) | x340Var5.f(o811Var.a) | (i6 == 131072) | x340Var5.f(j4);
            Object objT13 = x340Var5.T();
            if (zG5 || objT13 == m4cVar2) {
                x340Var2 = x340Var5;
                s120 s120Var = new s120(o811Var.a, j4, str2, (List) tob1Var2.getValue());
                j2 = j4;
                x340Var2.s0(s120Var);
                objT13 = s120Var;
            } else {
                x340Var2 = x340Var5;
                j2 = j4;
            }
            s120 s120Var2 = (s120) objT13;
            if (str2 != null) {
                x340Var2.i0(-488123233);
                x340Var2.r(false);
                j3 = j2;
            } else {
                x340Var2.i0(-488121993);
                long j6 = cbx.a(x340Var2).b.a;
                x340Var2.r(false);
                j3 = j6;
            }
            lee1 lee1VarA2 = lee1.a(cbx.d(x340Var2).g, j3, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
            if (j5 == 0) {
                lee1VarA = lee1VarA2;
                i2 = i6;
                x340Var3 = x340Var2;
                m4cVar = m4cVar2;
                f2 = f;
                r5 = 1;
            } else {
                r5 = 1;
                i2 = i6;
                m4cVar = m4cVar2;
                x340Var3 = x340Var2;
                f2 = f;
                lee1VarA = lee1.a(lee1VarA2, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, j, (u8e1) null, (wdt0) null, new shc0(0, 0, phc0.b), 0, 15597567);
            }
            qim0 qim0VarH = l6o1.H(qim0Var, l6o1.C(0, 0, (int) r5, x340Var3), false, 14);
            gfh0 gfh0VarC = t1c.c(een.d, (boolean) r5);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarH);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw 0;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            c8e1 c8e1Var = (c8e1) tob1Var.getValue();
            n6a1 n6a1Var = new n6a1(cbx.a(x340Var3).b.a);
            qim0 qim0VarP = vby0.p(u291.f(nim0.a, 1.0f), lz20Var);
            boolean zI3 = x340Var3.i(ven0Var2);
            Object objT14 = x340Var3.T();
            Object obj13 = objT14;
            if (zI3 || objT14 == m4cVar) {
                f4g f4gVar = new f4g(ven0Var2, (byte) 2);
                x340Var3.s0(f4gVar);
                obj13 = f4gVar;
            }
            qim0 qim0VarX = ern1.x(qim0VarP, (iu30) obj13);
            boolean zI4 = (((i4 == true ? 1 : 0) & 112) == 32) | x340Var3.i(tob1Var);
            Object objT15 = x340Var3.T();
            if (zI4 || objT15 == m4cVar) {
                z2 = true;
                n96 n96Var = new n96(str4, tob1Var, (byte) 1);
                x340Var3.s0(n96Var);
                obj5 = n96Var;
            } else {
                z2 = true;
                obj5 = objT15;
            }
            qim0 qim0VarB = s161.b(qim0VarX, false, (iu30) obj5);
            boolean zI5 = x340Var3.i(ven0Var) | x340Var3.d(f2) | x340Var3.i(tob1Var2);
            boolean z6 = i2 == 131072 ? z2 : false;
            long j7 = a;
            boolean zF = zI5 | z6 | x340Var3.f(j7);
            Object objT16 = x340Var3.T();
            if (zF || objT16 == m4cVar) {
                ven0Var3 = ven0Var;
                z3 = true;
                tob1Var3 = tob1Var2;
                x340Var4 = x340Var3;
                khgVar = new khg(f2, str2, j7, ven0Var3, tob1Var3);
                x340Var4.s0(khgVar);
            } else {
                tob1Var3 = tob1Var2;
                x340Var4 = x340Var3;
                khgVar = objT16;
                z3 = true;
                ven0Var3 = ven0Var;
            }
            qim0 qim0VarQ = exd0.q(qim0VarB, (iu30) khgVar);
            List list2 = (List) tob1Var3.getValue();
            boolean zI6 = x340Var4.i(ven0Var3) | x340Var4.i(tob1Var3) | ((i3 & 896) == 256 ? z3 : false);
            Object objT17 = x340Var4.T();
            if (zI6 || objT17 == m4cVar) {
                z4 = false;
                mhg mhgVar = new mhg((Object) iu30Var2, (Object) ven0Var3, (Object) tob1Var3, (byte) (false ? 1 : 0));
                x340Var4.s0(mhgVar);
                obj6 = mhgVar;
            } else {
                z4 = false;
                obj6 = objT17;
            }
            qim0 qim0VarB2 = f8d1.b(qim0VarQ, list2, (PointerInputEventHandler) obj6);
            ven0 ven0Var8 = ven0Var4;
            boolean zI7 = x340Var4.i(tob1Var) | x340Var4.i(tob1Var3) | x340Var4.i(ven0Var8);
            if ((i3 & 112) == 32) {
                z4 = z3;
            }
            boolean z7 = zI7 | z4;
            Object objT18 = x340Var4.T();
            if (z7 != 0 || objT18 == m4cVar) {
                db dbVar = new db(iu30Var, tob1Var, tob1Var3, ven0Var8, (byte) 29);
                x340Var4.s0(dbVar);
                objT18 = dbVar;
            }
            iu30 iu30Var4 = (iu30) objT18;
            boolean zI8 = x340Var4.i(ven0Var3);
            Object objT19 = x340Var4.T();
            Object obj14 = objT19;
            if (zI8 || objT19 == m4cVar) {
                f4g f4gVar2 = new f4g(ven0Var3, (byte) 3);
                x340Var4.s0(f4gVar2);
                obj14 = f4gVar2;
            }
            iu30 iu30Var5 = (iu30) obj14;
            lee1 lee1Var2 = lee1VarA;
            x340 x340Var6 = x340Var4;
            xea.d(c8e1Var, iu30Var4, qim0VarB2, false, lee1Var2, (kua0) null, (bua0) null, false, 0, 0, s120Var2, iu30Var5, n6a1Var, apo.r(669002230, new nhg(str4, lee1Var2, j2, tob1Var, (byte) 0), x340Var4), x340Var6, 0, 196608, 10200);
            x340Var = x340Var6;
            x340Var.r(z3);
        } else {
            x340Var = x340Var5;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ohg(str, iu30Var, iu30Var2, qim0Var, str2, iu30Var3, obj, str3, j, z, str4, i);
        }
    }

    public static final mmr0 b(smc0 smc0Var) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        rmc0 rmc0VarListIterator = smc0Var.listIterator(0);
        while (true) {
            rmc0 rmc0Var = rmc0VarListIterator;
            if (!rmc0Var.hasNext()) {
                return new mmr0(sb.toString(), arrayList);
            }
            yxx0 yxx0Var = (yxx0) rmc0Var.next();
            if (yxx0Var instanceof xxx0) {
                sb.append(((xxx0) yxx0Var).a);
            } else {
                if (!(yxx0Var instanceof wxx0)) {
                    eg.o();
                    return null;
                }
                int length = sb.length();
                sb.append("\u2005");
                xwx0 xwx0Var = ((wxx0) yxx0Var).a;
                sb.append(xwx0Var.r);
                sb.append("\u2005");
                arrayList.add(new i220(yoi1.Q(length, sb.length()), xwx0Var));
            }
        }
    }

    public static final String c(String str) {
        return nhc1.W(nhc1.W(nhc1.W(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
    }

    public static final List d(y9e1 y9e1Var, tr80 tr80Var, float f, float f2) {
        float fH;
        n511 n511VarG;
        boolean zIsEmpty = tr80Var.isEmpty();
        int i = ((rr80) tr80Var).a;
        if (!zIsEmpty) {
            x9e1 x9e1Var = y9e1Var.a;
            zrm0 zrm0Var = y9e1Var.b;
            int length = x9e1Var.a.b.length();
            if (i < length) {
                int iMin = Math.min(((rr80) tr80Var).b, length - 1);
                int iD = zrm0Var.d(i);
                int iD2 = zrm0Var.d(iMin);
                boolean z = true;
                tr80 tr80Var2 = new tr80(iD, iD2, 1);
                ArrayList arrayList = new ArrayList();
                lr80 it = tr80Var2.iterator();
                while (((sr80) it).c) {
                    int iNextInt = it.nextInt();
                    float fE = iNextInt == iD ? y9e1Var.e(i, z) : y9e1Var.g(iNextInt);
                    if (iNextInt == iD2) {
                        int i2 = iMin + 1;
                        if (i2 > length) {
                            i2 = length;
                        }
                        fH = y9e1Var.e(i2, z);
                    } else {
                        fH = y9e1Var.h(iNextInt);
                    }
                    if (fH <= fE) {
                        n511VarG = null;
                    } else {
                        float f3 = zrm0Var.f(iNextInt);
                        n511VarG = anm1.g((((long) Float.floatToRawIntBits(Math.min(fE, fH) - f)) << 32) | (((long) Float.floatToRawIntBits(f3 - f2)) & 4294967295L), (((long) Float.floatToRawIntBits((f * 2.0f) + Math.abs(fH - fE))) << 32) | (((long) Float.floatToRawIntBits((2.0f * f2) + (zrm0Var.b(iNextInt) - f3))) & 4294967295L));
                    }
                    ArrayList arrayList2 = arrayList;
                    if (n511VarG != null) {
                        arrayList2.add(n511VarG);
                    }
                    arrayList = arrayList2;
                    z = true;
                }
                return arrayList;
            }
        }
        return z6x.a;
    }

    public static final int e(int i, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            tr80 tr80Var = ((i220) next).a;
            if (i > ((rr80) tr80Var).a && i <= ((rr80) tr80Var).b) {
                break;
            }
        }
        i220 i220Var = (i220) next;
        if (i220Var == null) {
            return i;
        }
        tr80 tr80Var2 = i220Var.a;
        int i2 = ((rr80) tr80Var2).b + 1;
        int i3 = ((rr80) tr80Var2).a;
        return i - i3 <= i2 - i ? i3 : i2;
    }
}
