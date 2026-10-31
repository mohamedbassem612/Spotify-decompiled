package p;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u6b implements s6b {
    public final /* synthetic */ byte a;

    public /* synthetic */ u6b(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x021d  */
    /* JADX WARN: Code duplicated, block: B:222:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:260:0x0454  */
    /* JADX WARN: Code duplicated, block: B:270:0x0477  */
    /* JADX WARN: Code duplicated, block: B:297:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:299:0x04ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:300:0x04ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:303:0x04f7  */
    /* JADX WARN: Switch 'out' block B:125:0x01f7 for B:111:0x01b5 already processed. Defaulting to fallback option. */
    @Override // p.s6b
    public final y6b a(cqu cquVar, lqr lqrVar) {
        char cCharAt;
        wy10 wy10Var;
        sf5 sf5Var;
        mmc0 mmc0Var;
        char cCharAt2;
        boolean z;
        mmc0 mmc0Var2;
        int i;
        char cCharAt3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 0;
        switch (this.a) {
            case 0:
                int i8 = cquVar.f;
                CharSequence charSequence = cquVar.a.a;
                if (cquVar.h >= 4 || i8 >= charSequence.length() || charSequence.charAt(i8) != '>') {
                    return null;
                }
                int i9 = cquVar.d + cquVar.h;
                int i10 = i9 + 1;
                CharSequence charSequence2 = cquVar.a.a;
                int i11 = i8 + 1;
                if (i11 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i11)) == '\t' || cCharAt == ' ')) {
                    i10 = i9 + 2;
                }
                y6b y6bVar = new y6b(new s5[]{new v6b()});
                y6bVar.b = i10;
                return y6bVar;
            case 1:
                int i12 = cquVar.h;
                if (i12 < 4) {
                    int i13 = cquVar.f;
                    CharSequence charSequence3 = cquVar.a.a;
                    int length = charSequence3.length();
                    int i14 = 0;
                    int i15 = 0;
                    for (int i16 = i13; i16 < length; i16++) {
                        char cCharAt4 = charSequence3.charAt(i16);
                        if (cCharAt4 == '`') {
                            i14++;
                        } else if (cCharAt4 != '~') {
                            if (i14 >= 3 || i15 != 0) {
                                if (i15 >= 3 || i14 != 0) {
                                    wy10Var = null;
                                } else {
                                    wy10Var = new wy10(i15, i12, '~');
                                }
                            } else if (zno1.n('`', charSequence3, i13 + i14) != -1) {
                                wy10Var = null;
                            } else {
                                wy10Var = new wy10(i14, i12, '`');
                            }
                            if (wy10Var != null) {
                                y6b y6bVar2 = new y6b(new s5[]{wy10Var});
                                y6bVar2.a = wy10Var.a.g.intValue() + i13;
                                return y6bVar2;
                            }
                        } else {
                            i15++;
                        }
                    }
                    if (i14 >= 3) {
                        if (i15 >= 3) {
                            wy10Var = null;
                        } else {
                            wy10Var = null;
                        }
                    } else if (i15 >= 3) {
                        wy10Var = null;
                    } else {
                        wy10Var = null;
                    }
                    if (wy10Var != null) {
                        y6b y6bVar3 = new y6b(new s5[]{wy10Var});
                        y6bVar3.a = wy10Var.a.g.intValue() + i13;
                        return y6bVar3;
                    }
                }
                return null;
            case 2:
                if (cquVar.h < 4) {
                    ala1 ala1Var = cquVar.a;
                    int i17 = cquVar.f;
                    CharSequence charSequence4 = ala1Var.a;
                    if (charSequence4.charAt(i17) == '#') {
                        ala1 ala1VarA = ala1Var.a(i17, charSequence4.length());
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(ala1VarA);
                        yr31 yr31Var = new yr31(arrayList);
                        int iG = yr31Var.g('#');
                        if (iG == 0 || iG > 6) {
                            sf5Var = null;
                        } else if (yr31Var.e()) {
                            char cK = yr31Var.k();
                            if (cK == ' ' || cK == '\t') {
                                yr31Var.o();
                                d9z0 d9z0VarL = yr31Var.l();
                                d9z0 d9z0VarL2 = d9z0VarL;
                                while (true) {
                                    boolean z2 = true;
                                    while (true) {
                                        if (yr31Var.e()) {
                                            char cK2 = yr31Var.k();
                                            if (cK2 == '\t' || cK2 == ' ') {
                                                yr31Var.h();
                                            } else {
                                                if (cK2 != '#') {
                                                    yr31Var.h();
                                                    d9z0VarL2 = yr31Var.l();
                                                } else if (z2) {
                                                    yr31Var.g('#');
                                                    int iO = yr31Var.o();
                                                    if (yr31Var.e()) {
                                                        d9z0VarL2 = yr31Var.l();
                                                    }
                                                    if (iO > 0) {
                                                    }
                                                } else {
                                                    yr31Var.h();
                                                    d9z0VarL2 = yr31Var.l();
                                                }
                                                z2 = false;
                                            }
                                        } else {
                                            ld50 ld50VarD = yr31Var.d(d9z0VarL, d9z0VarL2);
                                            sf5Var = ld50VarD.b().isEmpty() ? new sf5(iG, new ld50()) : new sf5(iG, ld50VarD);
                                        }
                                    }
                                }
                            } else {
                                sf5Var = null;
                            }
                        } else {
                            sf5Var = new sf5(iG, new ld50());
                        }
                        if (sf5Var != null) {
                            y6b y6bVar4 = new y6b(new s5[]{sf5Var});
                            y6bVar4.a = charSequence4.length();
                            return y6bVar4;
                        }
                    }
                    char cCharAt5 = charSequence4.charAt(i17);
                    if (cCharAt5 == '-') {
                        int length2 = charSequence4.length();
                        for (int i18 = i17 + 1; i18 < length2; i18++) {
                            if (charSequence4.charAt(i18) != '-') {
                                length2 = i18;
                                if (zno1.w(length2, charSequence4.length(), charSequence4) < charSequence4.length()) {
                                    i6 = 0;
                                }
                            }
                        }
                        if (zno1.w(length2, charSequence4.length(), charSequence4) < charSequence4.length()) {
                            i6 = 0;
                        }
                    } else if (cCharAt5 != '=') {
                        i6 = 0;
                    } else {
                        int length3 = charSequence4.length();
                        for (int i19 = i17 + 1; i19 < length3; i19++) {
                            if (charSequence4.charAt(i19) != '=') {
                                length3 = i19;
                                if (zno1.w(length3, charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                    i6 = 1;
                                } else {
                                    i6 = 0;
                                }
                            }
                        }
                        if (zno1.w(length3, charSequence4.length(), charSequence4) >= charSequence4.length()) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                    }
                    if (i6 > 0) {
                        ld50 ld50VarI = lqrVar.i();
                        ArrayList arrayList2 = ld50VarI.a;
                        if (!arrayList2.isEmpty()) {
                            y6b y6bVar5 = new y6b(new s5[]{new sf5(i6, ld50VarI)});
                            y6bVar5.a = charSequence4.length();
                            int size = arrayList2.size();
                            if (size >= 1) {
                                y6bVar5.c = size;
                                return y6bVar5;
                            }
                            hhg1.n("Lines must be >= 1");
                        }
                    }
                }
                return null;
            case 3:
                int i20 = cquVar.f;
                CharSequence charSequence5 = cquVar.a.a;
                if (cquVar.h < 4 && charSequence5.charAt(i20) == '<') {
                    for (int i21 = 1; i21 <= 7; i21++) {
                        if (i21 != 7 || (!(((s5) lqrVar.b).f() instanceof oor0) && !cquVar.g().d())) {
                            Pattern[] patternArr = x070.e[i21];
                            Pattern pattern = patternArr[0];
                            Pattern pattern2 = patternArr[1];
                            if (pattern.matcher(charSequence5.subSequence(i20, charSequence5.length())).find()) {
                                y6b y6bVar6 = new y6b(new s5[]{new x070(pattern2)});
                                y6bVar6.a = cquVar.c;
                                return y6bVar6;
                            }
                        }
                    }
                }
                return null;
            case 4:
                if (cquVar.h < 4 || cquVar.i || (cquVar.g().f() instanceof oor0)) {
                    return null;
                }
                y6b y6bVar7 = new y6b(new s5[]{new sf5()});
                y6bVar7.b = cquVar.d + 4;
                return y6bVar7;
            case 5:
                s5 s5Var = (s5) lqrVar.b;
                int i22 = cquVar.h;
                if (i22 < 4) {
                    int i23 = cquVar.f;
                    int i24 = cquVar.d + i22;
                    boolean zIsEmpty = lqrVar.i().a.isEmpty();
                    CharSequence charSequence6 = cquVar.a.a;
                    char cCharAt6 = charSequence6.charAt(i23);
                    if (cCharAt6 == '*' || cCharAt6 == '+' || cCharAt6 == '-') {
                        int i25 = i23 + 1;
                        if (i25 >= charSequence6.length() || (cCharAt2 = charSequence6.charAt(i25)) == '\t' || cCharAt2 == ' ') {
                            hcc hccVar = new hcc();
                            hccVar.g = String.valueOf(cCharAt6);
                            mmc0Var = new mmc0(hccVar, i25);
                        } else {
                            mmc0Var = null;
                        }
                    } else {
                        int length4 = charSequence6.length();
                        int i26 = i23;
                        int i27 = 0;
                        while (true) {
                            if (i26 < length4) {
                                char cCharAt7 = charSequence6.charAt(i26);
                                if (cCharAt7 != ')' && cCharAt7 != '.') {
                                    switch (cCharAt7) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                        case '8':
                                        case '9':
                                            i27++;
                                            if (i27 <= 9) {
                                                i26++;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                } else if (i27 >= 1 && ((i = i26 + 1) >= charSequence6.length() || (cCharAt3 = charSequence6.charAt(i)) == '\t' || cCharAt3 == ' ')) {
                                    String string = charSequence6.subSequence(i23, i26).toString();
                                    mqq0 mqq0Var = new mqq0();
                                    mqq0Var.h = Integer.valueOf(Integer.parseInt(string));
                                    mqq0Var.g = String.valueOf(cCharAt7);
                                    mmc0Var = new mmc0(mqq0Var, i);
                                }
                            }
                            mmc0Var = null;
                        }
                    }
                    if (mmc0Var == null) {
                        mmc0Var2 = null;
                    } else {
                        lmc0 lmc0Var = mmc0Var.a;
                        int i28 = mmc0Var.b;
                        int i29 = (i28 - i23) + i24;
                        int length5 = charSequence6.length();
                        int i30 = i29;
                        while (true) {
                            if (i28 >= length5) {
                                z = false;
                            } else {
                                char cCharAt8 = charSequence6.charAt(i28);
                                if (cCharAt8 == '\t') {
                                    i30 = (4 - (i30 % 4)) + i30;
                                } else if (cCharAt8 == ' ') {
                                    i30++;
                                } else {
                                    z = true;
                                }
                                i28++;
                            }
                        }
                        if (zIsEmpty || ((!(lmc0Var instanceof mqq0) || ((mqq0) lmc0Var).h.intValue() == 1) && z)) {
                            if (!z || i30 - i29 > 4) {
                                i30 = i29 + 1;
                            }
                            mmc0Var2 = new mmc0(lmc0Var, i30);
                        } else {
                            mmc0Var2 = null;
                        }
                    }
                    if (mmc0Var2 != null) {
                        lmc0 lmc0Var2 = mmc0Var2.a;
                        int i31 = mmc0Var2.b;
                        evc0 evc0Var = new evc0(i31 - cquVar.d);
                        if (s5Var instanceof nmc0) {
                            lmc0 lmc0Var3 = ((nmc0) s5Var).a;
                            if (((lmc0Var3 instanceof hcc) && (lmc0Var2 instanceof hcc)) ? Objects.equals(((hcc) lmc0Var3).g, ((hcc) lmc0Var2).g) : ((lmc0Var3 instanceof mqq0) && (lmc0Var2 instanceof mqq0)) ? Objects.equals(((mqq0) lmc0Var3).g, ((mqq0) lmc0Var2).g) : false) {
                                y6b y6bVar8 = new y6b(new s5[]{evc0Var});
                                y6bVar8.b = i31;
                                return y6bVar8;
                            }
                        }
                        y6b y6bVar9 = new y6b(new s5[]{new nmc0(lmc0Var2), evc0Var});
                        y6bVar9.b = i31;
                        return y6bVar9;
                    }
                }
                return null;
            case 6:
                ArrayList arrayList3 = lqrVar.i().a;
                if (arrayList3.size() >= 1) {
                    char c = '|';
                    if (zno1.n('|', ((ala1) l1d.i(1, arrayList3)).a, 0) != -1) {
                        ala1 ala1Var2 = cquVar.a;
                        CharSequence charSequence7 = ala1Var2.a(cquVar.c, ala1Var2.a.length()).a;
                        ArrayList arrayList4 = new ArrayList();
                        int i32 = 0;
                        boolean z3 = false;
                        int i33 = 0;
                        while (true) {
                            if (i32 < charSequence7.length()) {
                                char cCharAt9 = charSequence7.charAt(i32);
                                if (cCharAt9 == '\t' || cCharAt9 == ' ') {
                                    i2 = i7;
                                    i32++;
                                } else {
                                    i2 = i7;
                                    if (cCharAt9 == '-' || cCharAt9 == ':') {
                                        if (i33 != 0 || arrayList4.isEmpty()) {
                                            if (cCharAt9 == ':') {
                                                i32++;
                                                i3 = 1;
                                            } else {
                                                i3 = i2;
                                            }
                                            int i34 = i3;
                                            int i35 = i2;
                                            while (i32 < charSequence7.length() && charSequence7.charAt(i32) == '-') {
                                                i32++;
                                                i3++;
                                                i35 = 1;
                                            }
                                            if (i35 != 0) {
                                                if (i32 >= charSequence7.length() || charSequence7.charAt(i32) != ':') {
                                                    i4 = i2;
                                                } else {
                                                    i32++;
                                                    i3++;
                                                    i4 = 1;
                                                }
                                                if (i34 != 0 && i4 != 0) {
                                                    i5 = 2;
                                                } else if (i34 != 0) {
                                                    i5 = 1;
                                                } else {
                                                    i5 = i4 != 0 ? 3 : i2;
                                                }
                                                arrayList4.add(new ckd1(i5, i3));
                                                i33 = i2;
                                            }
                                        }
                                    } else if (cCharAt9 == c) {
                                        i32++;
                                        i33++;
                                        if (i33 <= 1) {
                                            z3 = true;
                                        }
                                    }
                                }
                                i7 = i2;
                                c = '|';
                            } else {
                                i2 = i7;
                                if (!z3) {
                                }
                            }
                            arrayList4 = null;
                        }
                        if (arrayList4 != null && !arrayList4.isEmpty()) {
                            ala1 ala1Var3 = (ala1) l1d.i(1, arrayList3);
                            if (arrayList4.size() >= dkd1.l(ala1Var3).size()) {
                                dkd1 dkd1Var = new dkd1(arrayList4, ala1Var3);
                                s5[] s5VarArr = new s5[1];
                                s5VarArr[i2] = dkd1Var;
                                y6b y6bVar10 = new y6b(s5VarArr);
                                y6bVar10.a = cquVar.c;
                                y6bVar10.c = 1;
                                return y6bVar10;
                            }
                        }
                    }
                }
                return null;
            default:
                if (cquVar.h < 4) {
                    CharSequence charSequence8 = cquVar.a.a;
                    int length6 = charSequence8.length();
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 0;
                    for (int i39 = cquVar.f; i39 < length6; i39++) {
                        char cCharAt10 = charSequence8.charAt(i39);
                        if (cCharAt10 != '\t' && cCharAt10 != ' ') {
                            if (cCharAt10 == '*') {
                                i38++;
                            } else if (cCharAt10 == '-') {
                                i36++;
                            } else if (cCharAt10 == '_') {
                                i37++;
                            }
                        }
                    }
                    if ((i36 >= 3 && i37 == 0 && i38 == 0) || ((i37 >= 3 && i36 == 0 && i38 == 0) || (i38 >= 3 && i36 == 0 && i37 == 0))) {
                        String.valueOf(charSequence8.subSequence(cquVar.c, charSequence8.length()));
                        y6b y6bVar11 = new y6b(new s5[]{new ypu((byte) 1)});
                        y6bVar11.a = charSequence8.length();
                        return y6bVar11;
                    }
                }
                return null;
        }
    }
}
