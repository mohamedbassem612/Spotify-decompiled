package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class r61 {
    public static final se11 a = new se11("[\\s\\u2002\\u2003\\u2009\\u200A\\u2028\\u2029]+");

    /* JADX WARN: Code duplicated, block: B:125:0x018b  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01cf A[LOOP:0: B:136:0x01c9->B:138:0x01cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0215  */
    /* JADX WARN: Code duplicated, block: B:143:0x0218  */
    /* JADX WARN: Code duplicated, block: B:145:0x021c  */
    /* JADX WARN: Code duplicated, block: B:146:0x021f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0297  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:172:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:184:0x0321  */
    /* JADX WARN: Code duplicated, block: B:185:0x0324  */
    /* JADX WARN: Code duplicated, block: B:188:0x032d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0332  */
    /* JADX WARN: Code duplicated, block: B:195:0x034e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0354  */
    /* JADX WARN: Code duplicated, block: B:200:0x035f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x0361  */
    /* JADX WARN: Code duplicated, block: B:204:0x0391  */
    /* JADX WARN: Code duplicated, block: B:205:0x0394  */
    /* JADX WARN: Code duplicated, block: B:208:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:210:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:216:0x03be  */
    /* JADX WARN: Code duplicated, block: B:217:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:220:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:221:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:224:0x03db  */
    /* JADX WARN: Code duplicated, block: B:226:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:232:0x03f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:233:0x03f2  */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x01ac, please report this as an issue */
    public static final void a(String str, qim0 qim0Var, lee1 lee1Var, long j, a0e1 a0e1Var, mhc0 mhc0Var, int i, boolean z, int i2, iu30 iu30Var, s61 s61Var, Integer num, b0k b0kVar, int i3, int i4) {
        int i5;
        int i6;
        x340 x340Var;
        int iIntValue;
        int i7;
        int i8;
        Object obj;
        List list;
        boolean zE;
        int i9;
        LinkedHashMap linkedHashMap;
        Iterator it;
        Object obj2;
        Map map;
        int i10;
        int i11;
        x340 x340Var2;
        int i12;
        lee1 lee1VarA;
        m61 m61Var;
        float fC;
        float fC2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Object objT;
        m4c m4cVar;
        ven0 ven0Var;
        su21 su21VarA;
        m61 m61VarA;
        boolean zI;
        Object obj3;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj4;
        cpr0 cpr0Var = lee1Var.b;
        zma1 zma1Var = lee1Var.a;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(231091666);
        if ((i3 & 6) == 0) {
            i5 = i3 | (x340Var3.g(str) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var3.i(qim0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= x340Var3.i(lee1Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= x340Var3.f(j) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= x340Var3.g(a0e1Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= x340Var3.g(mhc0Var) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= x340Var3.e(i) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= x340Var3.h(z) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= x340Var3.e(i2) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= x340Var3.i(iu30Var) ? 536870912 : 268435456;
        }
        int i26 = i5;
        if ((i4 & 6) == 0) {
            i6 = i4 | (x340Var3.g(s61Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= x340Var3.g(num) ? 32 : 16;
        }
        int i27 = i6;
        if (x340Var3.Y(i26 & 1, ((i26 & 306783379) == 306783378 && (i27 & 19) == 18) ? false : true)) {
            x340Var3.d0();
            if ((i3 & 1) != 0 && !x340Var3.E()) {
                x340Var3.b0();
            }
            x340Var3.s();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                FontWeight fontWeightV = zma1Var.c;
                if (fontWeightV == null) {
                    FontWeight fontWeight = FontWeight.b;
                    fontWeightV = w8p1.v();
                }
                iIntValue = fontWeightV.a;
            }
            yae1 yae1VarQ = d5p1.q(6, x340Var3, 0);
            ven0 ven0VarV = xto.v(iu30Var, x340Var3);
            int i28 = (i27 & 14) ^ 6;
            if (i28 <= 4 || !x340Var3.g(s61Var)) {
                i7 = 1;
                if ((i27 & 6) != 4) {
                    i8 = 0;
                }
                Object objT2 = x340Var3.T();
                obj = objT2;
                if (i8 == 0 || objT2 == m4cVar2) {
                    List listD = d(s61Var);
                    x340Var3.s0(listD);
                    obj = listD;
                }
                list = (List) obj;
                zE = x340Var3.e(iIntValue) | x340Var3.g(list);
                i9 = iIntValue;
                Object objT3 = x340Var3.T();
                if (!zE || objT3 == m4cVar2) {
                    List list2 = list;
                    int iS = zno1.s(q7h.U(list2, 10));
                    linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                    it = list2.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        Iterator it2 = it;
                        ga30 ga30VarI = u890.I(((Number) next).floatValue());
                        ga30 ga30VarH = u890.H(i9);
                        ga30[] ga30VarArr = new ga30[2];
                        ga30VarArr[0] = ga30VarI;
                        ga30VarArr[i7] = ga30VarH;
                        a930 a930VarA = o0c.a(14, (FontWeight) null, new ja30(ga30VarArr));
                        a930[] a930VarArr = new a930[i7];
                        a930VarArr[0] = a930VarA;
                        linkedHashMap.put(next, hm5.d(a930VarArr));
                        it = it2;
                    }
                    x340Var3.s0(linkedHashMap);
                    obj2 = linkedHashMap;
                } else {
                    obj2 = objT3;
                }
                map = (Map) obj2;
                if (a0e1Var != null) {
                    i10 = a0e1Var.a;
                } else {
                    i10 = cpr0Var.a;
                }
                if (mhc0Var != null) {
                    i11 = mhc0Var.a;
                } else {
                    i11 = cpr0Var.g;
                }
                x340Var2 = x340Var3;
                i12 = i7;
                lee1VarA = lee1.a(lee1Var, j, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, i10, 0, 0L, null, null, null, i11, 14647294);
                fC = TextUnit.c(zma1Var.b);
                fC2 = TextUnit.c(s61Var.c());
                if (fC > fC2) {
                    fC = fC2;
                }
                m61Var = new m61(fC, s61Var.b());
                i13 = i26 & 14;
                if (i13 == 4) {
                    i14 = i12;
                } else {
                    i14 = 0;
                }
                int i29 = (x340Var2.g(lee1Var) ? 1 : 0) | i14;
                if ((i26 & 57344) == 16384) {
                    i15 = i12;
                } else {
                    i15 = 0;
                }
                int i30 = (i26 & 3670016) ^ 1572864;
                int i31 = i29 | i15 | (((i30 > 1048576 || !x340Var2.e(i)) && (i26 & 1572864) != 1048576) ? 0 : i12);
                i16 = i26 & 29360128;
                if (i16 == 8388608) {
                    i17 = i12;
                } else {
                    i17 = 0;
                }
                int i32 = i31 | i17;
                i18 = i26 & 234881024;
                if (i18 == 67108864) {
                    i19 = i12;
                } else {
                    i19 = 0;
                }
                int i33 = i32 | i19 | (((i28 > 4 || !x340Var2.g(s61Var)) && (i27 & 6) != 4) ? 0 : i12) | (x340Var2.e(i9) ? 1 : 0) | (x340Var2.g(yae1VarQ) ? 1 : 0);
                if ((i26 & 458752) == 131072) {
                    i20 = i12;
                } else {
                    i20 = 0;
                }
                i21 = i33 | i20;
                objT = x340Var2.T();
                if (i21 == 0) {
                    m4cVar = m4cVar2;
                    if (objT == m4cVar) {
                    }
                    obj = objT;
                    ven0Var = (ven0) obj;
                    su21VarA = ((n61) ven0Var.getValue()).a();
                    if (su21VarA != null || (m61VarA = su21VarA.a()) == null) {
                        m61VarA = m61Var;
                    }
                    zI = x340Var2.i(ven0Var);
                    Object objT4 = x340Var2.T();
                    obj3 = objT4;
                    if (zI || objT4 == m4cVar) {
                        xj0 xj0Var = new xj0(ven0Var, (byte) 3);
                        x340Var2.s0(xj0Var);
                        obj3 = xj0Var;
                    }
                    qim0 qim0VarS = exd0.s(qim0Var, (iu30) obj3);
                    lee1 lee1VarC = c(lee1VarA, map, m61VarA);
                    int i34 = (x340Var2.i(ven0VarV) ? 1 : 0) | (x340Var2.i(ven0Var) ? 1 : 0) | (x340Var2.i(yae1VarQ) ? 1 : 0);
                    if (i13 == 4) {
                        i22 = i12;
                    } else {
                        i22 = 0;
                    }
                    int i35 = (((i30 > 1048576 || !x340Var2.e(i)) && (i26 & 1572864) != 1048576) ? 0 : i12) | (((i34 | i22) | (x340Var2.i(lee1VarA) ? 1 : 0)) == true ? 1 : 0) | (x340Var2.i(map) ? 1 : 0);
                    if (i16 == 8388608) {
                        i23 = i12;
                    } else {
                        i23 = 0;
                    }
                    int i36 = i35 | i23;
                    if (i18 == 67108864) {
                        i24 = i12;
                    } else {
                        i24 = 0;
                    }
                    int i37 = i36 | i24 | (x340Var2.g(m61VarA) ? 1 : 0) | (x340Var2.g(m61Var) ? 1 : 0);
                    if ((i28 > 4 || !x340Var2.g(s61Var)) && (i27 & 6) != 4) {
                    }
                    i25 = i37 | i12;
                    Object objT5 = x340Var2.T();
                    obj4 = objT5;
                    if (i25 == 0 || objT5 == m4cVar) {
                        o61 o61Var = new o61(ven0VarV, m61VarA, ven0Var, z, str, m61Var, s61Var, i2, yae1VarQ, i, lee1VarA, map);
                        x340Var2.s0(o61Var);
                        obj4 = o61Var;
                    }
                    int i38 = i26 >> 6;
                    jch0.c(str, qim0VarS, lee1VarC, (iu30) obj4, i, z, i2, 0, (x9h) null, (m0e1) null, x340Var2, i13 | (i38 & 57344) | (i38 & 458752) | (i38 & 3670016), 896);
                    x340Var = x340Var2;
                } else {
                    m4cVar = m4cVar2;
                }
                obj = objT;
                hrr0 hrr0VarT = xto.t(new n61());
                x340Var2.s0(hrr0VarT);
                Object obj5 = hrr0VarT;
                obj5 = objT;
                ven0Var = (ven0) obj5;
                su21VarA = ((n61) ven0Var.getValue()).a();
                if (su21VarA != null) {
                    m61VarA = m61Var;
                } else {
                    m61VarA = m61Var;
                }
                zI = x340Var2.i(ven0Var);
                Object objT6 = x340Var2.T();
                obj3 = objT6;
                if (zI) {
                    xj0 xj0Var2 = new xj0(ven0Var, (byte) 3);
                    x340Var2.s0(xj0Var2);
                    obj3 = xj0Var2;
                } else {
                    xj0 xj0Var3 = new xj0(ven0Var, (byte) 3);
                    x340Var2.s0(xj0Var3);
                    obj3 = xj0Var3;
                }
                qim0 qim0VarS2 = exd0.s(qim0Var, (iu30) obj3);
                lee1 lee1VarC2 = c(lee1VarA, map, m61VarA);
                int i39 = (x340Var2.i(ven0VarV) ? 1 : 0) | (x340Var2.i(ven0Var) ? 1 : 0) | (x340Var2.i(yae1VarQ) ? 1 : 0);
                if (i13 == 4) {
                    i22 = i12;
                } else {
                    i22 = 0;
                }
                int i310 = (((i30 > 1048576 || !x340Var2.e(i)) && (i26 & 1572864) != 1048576) ? 0 : i12) | (((i39 | i22) | (x340Var2.i(lee1VarA) ? 1 : 0)) == true ? 1 : 0) | (x340Var2.i(map) ? 1 : 0);
                if (i16 == 8388608) {
                    i23 = i12;
                } else {
                    i23 = 0;
                }
                int i311 = i310 | i23;
                if (i18 == 67108864) {
                    i24 = i12;
                } else {
                    i24 = 0;
                }
                int i312 = i311 | i24 | (x340Var2.g(m61VarA) ? 1 : 0) | (x340Var2.g(m61Var) ? 1 : 0);
                i12 = i28 > 4 ? 0 : 0;
                i25 = i312 | i12;
                Object objT7 = x340Var2.T();
                obj4 = objT7;
                if (i25 == 0) {
                    o61 o61Var2 = new o61(ven0VarV, m61VarA, ven0Var, z, str, m61Var, s61Var, i2, yae1VarQ, i, lee1VarA, map);
                    x340Var2.s0(o61Var2);
                    obj4 = o61Var2;
                } else {
                    o61 o61Var3 = new o61(ven0VarV, m61VarA, ven0Var, z, str, m61Var, s61Var, i2, yae1VarQ, i, lee1VarA, map);
                    x340Var2.s0(o61Var3);
                    obj4 = o61Var3;
                }
                int i313 = i26 >> 6;
                jch0.c(str, qim0VarS2, lee1VarC2, (iu30) obj4, i, z, i2, 0, (x9h) null, (m0e1) null, x340Var2, i13 | (i313 & 57344) | (i313 & 458752) | (i313 & 3670016), 896);
                x340Var = x340Var2;
            } else {
                i7 = 1;
            }
            i8 = i7;
            Object objT8 = x340Var3.T();
            obj = objT8;
            if (i8 == 0) {
                List listD2 = d(s61Var);
                x340Var3.s0(listD2);
                obj = listD2;
            } else {
                List listD3 = d(s61Var);
                x340Var3.s0(listD3);
                obj = listD3;
            }
            list = (List) obj;
            zE = x340Var3.e(iIntValue) | x340Var3.g(list);
            i9 = iIntValue;
            Object objT9 = x340Var3.T();
            if (zE) {
                List list3 = list;
                int iS2 = zno1.s(q7h.U(list3, 10));
                linkedHashMap = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                it = list3.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    Iterator it3 = it;
                    ga30 ga30VarI2 = u890.I(((Number) next2).floatValue());
                    ga30 ga30VarH2 = u890.H(i9);
                    ga30[] ga30VarArr2 = new ga30[2];
                    ga30VarArr2[0] = ga30VarI2;
                    ga30VarArr2[i7] = ga30VarH2;
                    a930 a930VarA2 = o0c.a(14, (FontWeight) null, new ja30(ga30VarArr2));
                    a930[] a930VarArr2 = new a930[i7];
                    a930VarArr2[0] = a930VarA2;
                    linkedHashMap.put(next2, hm5.d(a930VarArr2));
                    it = it3;
                }
                x340Var3.s0(linkedHashMap);
                obj2 = linkedHashMap;
            } else {
                List list4 = list;
                int iS3 = zno1.s(q7h.U(list4, 10));
                linkedHashMap = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                it = list4.iterator();
                while (it.hasNext()) {
                    Object next3 = it.next();
                    Iterator it4 = it;
                    ga30 ga30VarI3 = u890.I(((Number) next3).floatValue());
                    ga30 ga30VarH3 = u890.H(i9);
                    ga30[] ga30VarArr3 = new ga30[2];
                    ga30VarArr3[0] = ga30VarI3;
                    ga30VarArr3[i7] = ga30VarH3;
                    a930 a930VarA3 = o0c.a(14, (FontWeight) null, new ja30(ga30VarArr3));
                    a930[] a930VarArr3 = new a930[i7];
                    a930VarArr3[0] = a930VarA3;
                    linkedHashMap.put(next3, hm5.d(a930VarArr3));
                    it = it4;
                }
                x340Var3.s0(linkedHashMap);
                obj2 = linkedHashMap;
            }
            map = (Map) obj2;
            if (a0e1Var != null) {
                i10 = a0e1Var.a;
            } else {
                i10 = cpr0Var.a;
            }
            if (mhc0Var != null) {
                i11 = mhc0Var.a;
            } else {
                i11 = cpr0Var.g;
            }
            x340Var2 = x340Var3;
            i12 = i7;
            lee1VarA = lee1.a(lee1Var, j, 0L, null, null, null, null, null, 0L, null, 0L, null, null, null, i10, 0, 0L, null, null, null, i11, 14647294);
            fC = TextUnit.c(zma1Var.b);
            fC2 = TextUnit.c(s61Var.c());
            if (fC > fC2) {
                fC = fC2;
            }
            m61Var = new m61(fC, s61Var.b());
            i13 = i26 & 14;
            if (i13 == 4) {
                i14 = i12;
            } else {
                i14 = 0;
            }
            int i210 = (x340Var2.g(lee1Var) ? 1 : 0) | i14;
            if ((i26 & 57344) == 16384) {
                i15 = i12;
            } else {
                i15 = 0;
            }
            int i314 = (i26 & 3670016) ^ 1572864;
            int i315 = i210 | i15 | (((i314 > 1048576 || !x340Var2.e(i)) && (i26 & 1572864) != 1048576) ? 0 : i12);
            i16 = i26 & 29360128;
            if (i16 == 8388608) {
                i17 = i12;
            } else {
                i17 = 0;
            }
            int i316 = i315 | i17;
            i18 = i26 & 234881024;
            if (i18 == 67108864) {
                i19 = i12;
            } else {
                i19 = 0;
            }
            int i317 = i316 | i19 | (((i28 > 4 || !x340Var2.g(s61Var)) && (i27 & 6) != 4) ? 0 : i12) | (x340Var2.e(i9) ? 1 : 0) | (x340Var2.g(yae1VarQ) ? 1 : 0);
            if ((i26 & 458752) == 131072) {
                i20 = i12;
            } else {
                i20 = 0;
            }
            i21 = i317 | i20;
            objT = x340Var2.T();
            if (i21 == 0) {
                m4cVar = m4cVar2;
                if (objT == m4cVar) {
                }
                obj5 = objT;
                ven0Var = (ven0) obj5;
                su21VarA = ((n61) ven0Var.getValue()).a();
                if (su21VarA != null) {
                    m61VarA = m61Var;
                } else {
                    m61VarA = m61Var;
                }
                zI = x340Var2.i(ven0Var);
                Object objT10 = x340Var2.T();
                obj3 = objT10;
                if (zI) {
                    xj0 xj0Var4 = new xj0(ven0Var, (byte) 3);
                    x340Var2.s0(xj0Var4);
                    obj3 = xj0Var4;
                } else {
                    xj0 xj0Var5 = new xj0(ven0Var, (byte) 3);
                    x340Var2.s0(xj0Var5);
                    obj3 = xj0Var5;
                }
                qim0 qim0VarS3 = exd0.s(qim0Var, (iu30) obj3);
                lee1 lee1VarC3 = c(lee1VarA, map, m61VarA);
                int i318 = (x340Var2.i(ven0VarV) ? 1 : 0) | (x340Var2.i(ven0Var) ? 1 : 0) | (x340Var2.i(yae1VarQ) ? 1 : 0);
                if (i13 == 4) {
                    i22 = i12;
                } else {
                    i22 = 0;
                }
                int i319 = (((i314 > 1048576 || !x340Var2.e(i)) && (i26 & 1572864) != 1048576) ? 0 : i12) | (((i318 | i22) | (x340Var2.i(lee1VarA) ? 1 : 0)) == true ? 1 : 0) | (x340Var2.i(map) ? 1 : 0);
                if (i16 == 8388608) {
                    i23 = i12;
                } else {
                    i23 = 0;
                }
                int i3110 = i319 | i23;
                if (i18 == 67108864) {
                    i24 = i12;
                } else {
                    i24 = 0;
                }
                int i3111 = i3110 | i24 | (x340Var2.g(m61VarA) ? 1 : 0) | (x340Var2.g(m61Var) ? 1 : 0);
                if (i28 > 4) {
                }
                i25 = i3111 | i12;
                Object objT11 = x340Var2.T();
                obj4 = objT11;
                if (i25 == 0) {
                    o61 o61Var4 = new o61(ven0VarV, m61VarA, ven0Var, z, str, m61Var, s61Var, i2, yae1VarQ, i, lee1VarA, map);
                    x340Var2.s0(o61Var4);
                    obj4 = o61Var4;
                } else {
                    o61 o61Var5 = new o61(ven0VarV, m61VarA, ven0Var, z, str, m61Var, s61Var, i2, yae1VarQ, i, lee1VarA, map);
                    x340Var2.s0(o61Var5);
                    obj4 = o61Var5;
                }
                int i3112 = i26 >> 6;
                jch0.c(str, qim0VarS3, lee1VarC3, (iu30) obj4, i, z, i2, 0, (x9h) null, (m0e1) null, x340Var2, i13 | (i3112 & 57344) | (i3112 & 458752) | (i3112 & 3670016), 896);
                x340Var = x340Var2;
            } else {
                m4cVar = m4cVar2;
            }
            obj5 = objT;
            hrr0 hrr0VarT2 = xto.t(new n61());
            x340Var2.s0(hrr0VarT2);
            Object obj6 = hrr0VarT2;
            obj6 = objT;
            ven0Var = (ven0) obj6;
            su21VarA = ((n61) ven0Var.getValue()).a();
            if (su21VarA != null) {
                m61VarA = m61Var;
            } else {
                m61VarA = m61Var;
            }
            zI = x340Var2.i(ven0Var);
            Object objT12 = x340Var2.T();
            obj3 = objT12;
            if (zI) {
                xj0 xj0Var6 = new xj0(ven0Var, (byte) 3);
                x340Var2.s0(xj0Var6);
                obj3 = xj0Var6;
            } else {
                xj0 xj0Var7 = new xj0(ven0Var, (byte) 3);
                x340Var2.s0(xj0Var7);
                obj3 = xj0Var7;
            }
            qim0 qim0VarS4 = exd0.s(qim0Var, (iu30) obj3);
            lee1 lee1VarC4 = c(lee1VarA, map, m61VarA);
            int i3113 = (x340Var2.i(ven0VarV) ? 1 : 0) | (x340Var2.i(ven0Var) ? 1 : 0) | (x340Var2.i(yae1VarQ) ? 1 : 0);
            if (i13 == 4) {
                i22 = i12;
            } else {
                i22 = 0;
            }
            int i3114 = (((i314 > 1048576 || !x340Var2.e(i)) && (i26 & 1572864) != 1048576) ? 0 : i12) | (((i3113 | i22) | (x340Var2.i(lee1VarA) ? 1 : 0)) == true ? 1 : 0) | (x340Var2.i(map) ? 1 : 0);
            if (i16 == 8388608) {
                i23 = i12;
            } else {
                i23 = 0;
            }
            int i3115 = i3114 | i23;
            if (i18 == 67108864) {
                i24 = i12;
            } else {
                i24 = 0;
            }
            int i3116 = i3115 | i24 | (x340Var2.g(m61VarA) ? 1 : 0) | (x340Var2.g(m61Var) ? 1 : 0);
            if (i28 > 4) {
            }
            i25 = i3116 | i12;
            Object objT13 = x340Var2.T();
            obj4 = objT13;
            if (i25 == 0) {
                o61 o61Var6 = new o61(ven0VarV, m61VarA, ven0Var, z, str, m61Var, s61Var, i2, yae1VarQ, i, lee1VarA, map);
                x340Var2.s0(o61Var6);
                obj4 = o61Var6;
            } else {
                o61 o61Var7 = new o61(ven0VarV, m61VarA, ven0Var, z, str, m61Var, s61Var, i2, yae1VarQ, i, lee1VarA, map);
                x340Var2.s0(o61Var7);
                obj4 = o61Var7;
            }
            int i3117 = i26 >> 6;
            jch0.c(str, qim0VarS4, lee1VarC4, (iu30) obj4, i, z, i2, 0, (x9h) null, (m0e1) null, x340Var2, i13 | (i3117 & 57344) | (i3117 & 458752) | (i3117 & 3670016), 896);
            x340Var = x340Var2;
        } else {
            x340 x340Var4 = x340Var3;
            x340Var4.b0();
            x340Var = x340Var4;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p61(str, qim0Var, lee1Var, j, a0e1Var, mhc0Var, i, z, i2, iu30Var, s61Var, num, i3, i4);
        }
    }

    public static final boolean b(List list, lee1 lee1Var, Map map, yae1 yae1Var, long j, m61 m61Var) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        lee1 lee1VarC = c(lee1Var, map, m61Var);
        List list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return false;
        }
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            if (yae1.a(yae1Var, (String) it.next(), lee1VarC, 0, false, 1, j, null, null, 964).d()) {
                return true;
            }
        }
        return false;
    }

    public static final lee1 c(lee1 lee1Var, Map map, m61 m61Var) {
        return lee1.a(lee1Var, 0L, fc11.Y(m61Var.b(), 4294967296L), null, null, null, (FontFamily) sqg0.G(Float.valueOf(m61Var.a()), map), null, 0L, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 16777181);
    }

    public static final List d(s61 s61Var) {
        c380 c380VarA = s61Var.a();
        ArrayList arrayList = new ArrayList(q7h.U(c380VarA, 10));
        Iterator it = c380VarA.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((Number) it.next()).intValue()));
        }
        ArrayList arrayListO0 = o7h.O0(Float.valueOf(s61Var.b()), o7h.O0(Float.valueOf(s61Var.d()), arrayList));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListO0) {
            float fFloatValue = ((Number) obj).floatValue();
            float fD = s61Var.d();
            if (fFloatValue <= s61Var.b() && fD <= fFloatValue) {
                arrayList2.add(obj);
            }
        }
        return o7h.Z0(o7h.j0(arrayList2));
    }
}
