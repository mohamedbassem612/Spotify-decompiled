package p;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c3r0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ zl5 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public c3r0(vr20 vr20Var, zl5 zl5Var, int i, String str) {
        this.a = (byte) 5;
        this.b = vr20Var;
        this.c = zl5Var;
        this.e = i;
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:133:0x022b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0267  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:178:0x02df  */
    /* JADX WARN: Code duplicated, block: B:193:0x031b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0357  */
    /* JADX WARN: Code duplicated, block: B:223:0x0393  */
    /* JADX WARN: Code duplicated, block: B:238:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:253:0x040b  */
    /* JADX WARN: Code duplicated, block: B:270:0x0465  */
    /* JADX WARN: Code duplicated, block: B:300:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x013b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0177  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    public final Object emit(Object obj, lnm lnmVar) {
        b3r0 b3r0Var;
        g3r0 g3r0Var;
        List listK0;
        List list;
        goj0 goj0VarA;
        jo70 jo70Var;
        goj0 goj0VarA2;
        o3r0 o3r0Var;
        q3r0 q3r0Var;
        u3r0 u3r0Var;
        v3r0 v3r0Var;
        x3r0 x3r0Var;
        z3r0 z3r0Var;
        b4r0 b4r0Var;
        d4r0 d4r0Var;
        e4r0 e4r0Var;
        f4r0 f4r0Var;
        g4r0 g4r0Var;
        i4r0 i4r0Var;
        l4r0 l4r0Var;
        m4r0 m4r0Var;
        goj0 goj0VarA3;
        u4r0 u4r0Var;
        byte b = this.a;
        List listSingletonList = z6x.a;
        String str = this.d;
        int i = this.e;
        zl5 zl5Var = this.c;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        String str2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof b3r0) {
                    b3r0Var = (b3r0) lnmVar;
                    int i2 = b3r0Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        b3r0Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        b3r0Var = new b3r0(this, lnmVar);
                    }
                } else {
                    b3r0Var = new b3r0(this, lnmVar);
                }
                Object obj2 = b3r0Var.a;
                int i3 = b3r0Var.b;
                if (i3 == 0) {
                    hm5.M(obj2);
                    List listB = zl5Var.b(i, str, (ioj0) obj);
                    b3r0Var.b = 1;
                    return vr20Var.emit(listB, b3r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i3 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof g3r0) {
                    g3r0Var = (g3r0) lnmVar;
                    int i4 = g3r0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        g3r0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        g3r0Var = new g3r0(this, lnmVar);
                    }
                } else {
                    g3r0Var = new g3r0(this, lnmVar);
                }
                Object obj3 = g3r0Var.a;
                int i5 = g3r0Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                ioj0 ioj0Var = (ioj0) obj;
                zl5 zl5Var2 = this.c;
                xf4 xf4Var = (xf4) zl5Var2.i;
                String str3 = this.d;
                hoj0 hoj0VarC = ioj0Var.c(ljh1.class, str3);
                ljh1 ljh1Var = (hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null) ? null : (ljh1) goj0VarA2.a;
                if (xf4Var.u()) {
                    if (ljh1Var != null) {
                        listK0 = o7h.K0(o7h.N0(ljh1Var.a, ljh1Var.c), o7h.p1(ljh1Var.b));
                        list = listK0;
                    } else {
                        list = listSingletonList;
                    }
                } else if (ljh1Var != null) {
                    listK0 = o7h.K0(ljh1Var.a, ljh1Var.b);
                    list = listK0;
                } else {
                    list = listSingletonList;
                }
                if (xf4Var.r() && ljh1Var != null && !list.isEmpty()) {
                    hoj0 hoj0VarC2 = ioj0Var.c(jo70.class, str3);
                    if (hoj0VarC2 != null && (goj0VarA = hoj0VarC2.a()) != null && (jo70Var = (jo70) goj0VarA.a) != null) {
                        str2 = jo70Var.a;
                    }
                    listSingletonList = Collections.singletonList(zl5Var2.i(this.e, "unmapped-video-preview-artist-page", str3, ((Context) zl5Var2.b).getString(2131963478, str2), "spotify:list:artist-music-videos:unmapped-".concat(ihc1.V0(str3, ':', str3)), list, list.size() >= 10));
                }
                g3r0Var.b = 1;
                return vr20Var.emit(listSingletonList, g3r0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof o3r0) {
                    o3r0Var = (o3r0) lnmVar;
                    int i6 = o3r0Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        o3r0Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        o3r0Var = new o3r0(this, lnmVar);
                    }
                } else {
                    o3r0Var = new o3r0(this, lnmVar);
                }
                Object obj4 = o3r0Var.a;
                int i7 = o3r0Var.b;
                if (i7 == 0) {
                    hm5.M(obj4);
                    List listC = zl5Var.C(i, str, (ioj0) obj);
                    o3r0Var.b = 1;
                    return vr20Var.emit(listC, o3r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i7 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (lnmVar instanceof q3r0) {
                    q3r0Var = (q3r0) lnmVar;
                    int i8 = q3r0Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        q3r0Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        q3r0Var = new q3r0(this, lnmVar);
                    }
                } else {
                    q3r0Var = new q3r0(this, lnmVar);
                }
                Object obj5 = q3r0Var.a;
                int i9 = q3r0Var.b;
                if (i9 == 0) {
                    hm5.M(obj5);
                    List listC2 = zl5Var.c(i, str, (ioj0) obj);
                    q3r0Var.b = 1;
                    return vr20Var.emit(listC2, q3r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i9 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                if (lnmVar instanceof u3r0) {
                    u3r0Var = (u3r0) lnmVar;
                    int i10 = u3r0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        u3r0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        u3r0Var = new u3r0(this, lnmVar);
                    }
                } else {
                    u3r0Var = new u3r0(this, lnmVar);
                }
                Object obj6 = u3r0Var.a;
                int i11 = u3r0Var.b;
                if (i11 == 0) {
                    hm5.M(obj6);
                    List listM = zl5Var.M(i, str, (ioj0) obj);
                    u3r0Var.b = 1;
                    return vr20Var.emit(listM, u3r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i11 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                if (lnmVar instanceof v3r0) {
                    v3r0Var = (v3r0) lnmVar;
                    int i12 = v3r0Var.b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        v3r0Var.b = i12 - Integer.MIN_VALUE;
                    } else {
                        v3r0Var = new v3r0(this, lnmVar);
                    }
                } else {
                    v3r0Var = new v3r0(this, lnmVar);
                }
                Object obj7 = v3r0Var.a;
                int i13 = v3r0Var.b;
                if (i13 == 0) {
                    hm5.M(obj7);
                    List listL = zl5Var.l(i, str, (ioj0) obj);
                    v3r0Var.b = 1;
                    return vr20Var.emit(listL, v3r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i13 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof x3r0) {
                    x3r0Var = (x3r0) lnmVar;
                    int i14 = x3r0Var.b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        x3r0Var.b = i14 - Integer.MIN_VALUE;
                    } else {
                        x3r0Var = new x3r0(this, lnmVar);
                    }
                } else {
                    x3r0Var = new x3r0(this, lnmVar);
                }
                Object obj8 = x3r0Var.a;
                int i15 = x3r0Var.b;
                if (i15 == 0) {
                    hm5.M(obj8);
                    List listK = zl5Var.k(i, str, (ioj0) obj);
                    x3r0Var.b = 1;
                    return vr20Var.emit(listK, x3r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i15 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof z3r0) {
                    z3r0Var = (z3r0) lnmVar;
                    int i16 = z3r0Var.b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        z3r0Var.b = i16 - Integer.MIN_VALUE;
                    } else {
                        z3r0Var = new z3r0(this, lnmVar);
                    }
                } else {
                    z3r0Var = new z3r0(this, lnmVar);
                }
                Object obj9 = z3r0Var.a;
                int i17 = z3r0Var.b;
                if (i17 == 0) {
                    hm5.M(obj9);
                    List listJ = zl5Var.j(i, str, (ioj0) obj);
                    z3r0Var.b = 1;
                    return vr20Var.emit(listJ, z3r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i17 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof b4r0) {
                    b4r0Var = (b4r0) lnmVar;
                    int i18 = b4r0Var.b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        b4r0Var.b = i18 - Integer.MIN_VALUE;
                    } else {
                        b4r0Var = new b4r0(this, lnmVar);
                    }
                } else {
                    b4r0Var = new b4r0(this, lnmVar);
                }
                Object obj10 = b4r0Var.a;
                int i19 = b4r0Var.b;
                if (i19 == 0) {
                    hm5.M(obj10);
                    List listM2 = zl5Var.m(i, str, (ioj0) obj);
                    b4r0Var.b = 1;
                    return vr20Var.emit(listM2, b4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i19 == 1) {
                    hm5.M(obj10);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                if (lnmVar instanceof d4r0) {
                    d4r0Var = (d4r0) lnmVar;
                    int i20 = d4r0Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        d4r0Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        d4r0Var = new d4r0(this, lnmVar);
                    }
                } else {
                    d4r0Var = new d4r0(this, lnmVar);
                }
                Object obj11 = d4r0Var.a;
                int i21 = d4r0Var.b;
                if (i21 == 0) {
                    hm5.M(obj11);
                    List listO = zl5Var.O(i, str, (ioj0) obj);
                    d4r0Var.b = 1;
                    return vr20Var.emit(listO, d4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i21 == 1) {
                    hm5.M(obj11);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                if (lnmVar instanceof e4r0) {
                    e4r0Var = (e4r0) lnmVar;
                    int i22 = e4r0Var.b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        e4r0Var.b = i22 - Integer.MIN_VALUE;
                    } else {
                        e4r0Var = new e4r0(this, lnmVar);
                    }
                } else {
                    e4r0Var = new e4r0(this, lnmVar);
                }
                Object obj12 = e4r0Var.a;
                int i23 = e4r0Var.b;
                if (i23 == 0) {
                    hm5.M(obj12);
                    List listN = zl5Var.N(i, str, (ioj0) obj);
                    e4r0Var.b = 1;
                    return vr20Var.emit(listN, e4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i23 == 1) {
                    hm5.M(obj12);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 11:
                if (lnmVar instanceof f4r0) {
                    f4r0Var = (f4r0) lnmVar;
                    int i24 = f4r0Var.b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        f4r0Var.b = i24 - Integer.MIN_VALUE;
                    } else {
                        f4r0Var = new f4r0(this, lnmVar);
                    }
                } else {
                    f4r0Var = new f4r0(this, lnmVar);
                }
                Object obj13 = f4r0Var.a;
                int i25 = f4r0Var.b;
                if (i25 == 0) {
                    hm5.M(obj13);
                    List listT = zl5Var.t(i, str, (ioj0) obj);
                    f4r0Var.b = 1;
                    return vr20Var.emit(listT, f4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i25 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof g4r0) {
                    g4r0Var = (g4r0) lnmVar;
                    int i26 = g4r0Var.b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        g4r0Var.b = i26 - Integer.MIN_VALUE;
                    } else {
                        g4r0Var = new g4r0(this, lnmVar);
                    }
                } else {
                    g4r0Var = new g4r0(this, lnmVar);
                }
                Object obj14 = g4r0Var.a;
                int i27 = g4r0Var.b;
                if (i27 == 0) {
                    hm5.M(obj14);
                    List listU = zl5Var.u(i, str, (ioj0) obj);
                    g4r0Var.b = 1;
                    return vr20Var.emit(listU, g4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i27 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof i4r0) {
                    i4r0Var = (i4r0) lnmVar;
                    int i28 = i4r0Var.b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        i4r0Var.b = i28 - Integer.MIN_VALUE;
                    } else {
                        i4r0Var = new i4r0(this, lnmVar);
                    }
                } else {
                    i4r0Var = new i4r0(this, lnmVar);
                }
                Object obj15 = i4r0Var.a;
                int i29 = i4r0Var.b;
                if (i29 == 0) {
                    hm5.M(obj15);
                    List listL2 = zl5Var.L(i, str, (ioj0) obj);
                    i4r0Var.b = 1;
                    return vr20Var.emit(listL2, i4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i29 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof l4r0) {
                    l4r0Var = (l4r0) lnmVar;
                    int i30 = l4r0Var.b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        l4r0Var.b = i30 - Integer.MIN_VALUE;
                    } else {
                        l4r0Var = new l4r0(this, lnmVar);
                    }
                } else {
                    l4r0Var = new l4r0(this, lnmVar);
                }
                Object obj16 = l4r0Var.a;
                int i31 = l4r0Var.b;
                if (i31 == 0) {
                    hm5.M(obj16);
                    List listO2 = zl5Var.o(i, str, (ioj0) obj);
                    l4r0Var.b = 1;
                    return vr20Var.emit(listO2, l4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i31 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof m4r0) {
                    m4r0Var = (m4r0) lnmVar;
                    int i32 = m4r0Var.b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        m4r0Var.b = i32 - Integer.MIN_VALUE;
                    } else {
                        m4r0Var = new m4r0(this, lnmVar);
                    }
                } else {
                    m4r0Var = new m4r0(this, lnmVar);
                }
                Object obj17 = m4r0Var.a;
                int i33 = m4r0Var.b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        hm5.M(obj17);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj17);
                String str4 = this.d;
                hoj0 hoj0VarC3 = ((ioj0) obj).c(us6.class, str4);
                us6 us6Var = (hoj0VarC3 == null || (goj0VarA3 = hoj0VarC3.a()) == null) ? null : (us6) goj0VarA3.a;
                if (us6Var != null) {
                    h290 h290Var = us6Var.a;
                    if (!h290Var.isEmpty()) {
                        listSingletonList = Collections.singletonList(new ner0(str4, ((Context) zl5Var.b).getString(2131959064), h290Var.size() >= 10 ? zl5Var.x(str4) : null, h290Var, new tfr0(Integer.valueOf(i), (y6h1) null, 2)));
                    }
                }
                m4r0Var.b = 1;
                return vr20Var.emit(listSingletonList, m4r0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof u4r0) {
                    u4r0Var = (u4r0) lnmVar;
                    int i34 = u4r0Var.b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        u4r0Var.b = i34 - Integer.MIN_VALUE;
                    } else {
                        u4r0Var = new u4r0(this, lnmVar);
                    }
                } else {
                    u4r0Var = new u4r0(this, lnmVar);
                }
                Object obj18 = u4r0Var.a;
                int i35 = u4r0Var.b;
                if (i35 == 0) {
                    hm5.M(obj18);
                    List listG = zl5Var.g(str, (z2r0) obj, i);
                    u4r0Var.b = 1;
                    return vr20Var.emit(listG, u4r0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i35 == 1) {
                    hm5.M(obj18);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ c3r0(vr20 vr20Var, zl5 zl5Var, String str, int i, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = zl5Var;
        this.d = str;
        this.e = i;
    }
}
