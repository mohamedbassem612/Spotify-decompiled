package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p0x0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;

    public /* synthetic */ p0x0(byte b, Object obj, vr20 vr20Var) {
        this.a = b;
        this.b = vr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        d4y0 d4y0Var;
        if (lnmVar instanceof d4y0) {
            d4y0Var = (d4y0) lnmVar;
            int i = d4y0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4y0Var.b = i - Integer.MIN_VALUE;
            } else {
                d4y0Var = new d4y0(this, lnmVar);
            }
        } else {
            d4y0Var = new d4y0(this, lnmVar);
        }
        Object obj2 = d4y0Var.a;
        int i2 = d4y0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            cxc0 cxc0Var = (cxc0) obj;
            Boolean boolValueOf = Boolean.valueOf(cxc0Var.f.w.b && !cxc0Var.i);
            d4y0Var.b = 1;
            Object objEmit = this.b.emit(boolValueOf, d4y0Var);
            d9n d9nVar = d9n.a;
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0196  */
    /* JADX WARN: Code duplicated, block: B:123:0x01df  */
    /* JADX WARN: Code duplicated, block: B:140:0x021b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0257  */
    /* JADX WARN: Code duplicated, block: B:183:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:198:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:223:0x0371  */
    /* JADX WARN: Code duplicated, block: B:240:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:255:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:272:0x0426  */
    /* JADX WARN: Code duplicated, block: B:323:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:346:0x0542  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:380:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:395:0x060e  */
    /* JADX WARN: Code duplicated, block: B:447:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:464:0x0724  */
    /* JADX WARN: Code duplicated, block: B:483:0x075e  */
    /* JADX WARN: Code duplicated, block: B:501:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:516:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:531:0x0818  */
    /* JADX WARN: Code duplicated, block: B:546:0x0857  */
    /* JADX WARN: Code duplicated, block: B:563:0x088f  */
    /* JADX WARN: Code duplicated, block: B:580:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:597:0x0904  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:612:0x093c  */
    /* JADX WARN: Code duplicated, block: B:82:0x013a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        o0x0 o0x0Var;
        o571 o571Var;
        q0x0 q0x0Var;
        z0x0 z0x0Var;
        a3x0 a3x0Var;
        b3x0 b3x0Var;
        c3x0 c3x0Var;
        d3x0 d3x0Var;
        e3x0 e3x0Var;
        s3x0 s3x0Var;
        t3x0 t3x0Var;
        v3x0 v3x0Var;
        s6x0 s6x0Var;
        g3d0 j6x0Var;
        acx0 acx0Var;
        bcx0 bcx0Var;
        ccx0 ccx0Var;
        Object cax0Var;
        dcx0 dcx0Var;
        zdx0 zdx0Var;
        aex0 aex0Var;
        jex0 jex0Var;
        kix0 kix0Var;
        mix0 mix0Var;
        ikx0 ikx0Var;
        gnx0 gnx0Var;
        gox0 gox0Var;
        uox0 uox0Var;
        e2y0 e2y0Var;
        i2y0 i2y0Var;
        b4y0 b4y0Var;
        e4y0 e4y0Var;
        String string;
        byte b = this.a;
        String str = "";
        boolean z = false;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        g3d0 j6x0Var2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof o0x0) {
                    o0x0Var = (o0x0) lnmVar;
                    int i = o0x0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        o0x0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        o0x0Var = new o0x0(this, lnmVar);
                    }
                } else {
                    o0x0Var = new o0x0(this, lnmVar);
                }
                Object obj2 = o0x0Var.a;
                int i2 = o0x0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                h810 h810Var = (h810) obj;
                boolean z2 = h810Var.d;
                String str2 = h810Var.c;
                if (!z2 || (o571Var = h810Var.b) == null || kyo1.r(o571Var) || h810Var.a || str2 == null) {
                    return rih1Var;
                }
                Set set = s4b1.f;
                if (uic.g(str2, blc0.Rj)) {
                    return rih1Var;
                }
                try {
                    s4b1 s4b1VarX = uic.x(str2);
                    String strValueOf = String.valueOf(s4b1VarX.a);
                    if (s4b1VarX.c == blc0.Bj && (ihc1.h0(strValueOf, "party", false) || ihc1.h0(strValueOf, "party-dev", false))) {
                        return rih1Var;
                    }
                } catch (Exception unused) {
                }
                o0x0Var.b = 1;
                return vr20Var.emit(obj, o0x0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof q0x0) {
                    q0x0Var = (q0x0) lnmVar;
                    int i3 = q0x0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        q0x0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        q0x0Var = new q0x0(this, lnmVar);
                    }
                } else {
                    q0x0Var = new q0x0(this, lnmVar);
                }
                Object obj3 = q0x0Var.a;
                int i4 = q0x0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    q0x0Var.b = 1;
                    return vr20Var.emit(vww0.SHARE_SEND, q0x0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                if (lnmVar instanceof z0x0) {
                    z0x0Var = (z0x0) lnmVar;
                    int i5 = z0x0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        z0x0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        z0x0Var = new z0x0(this, lnmVar);
                    }
                } else {
                    z0x0Var = new z0x0(this, lnmVar);
                }
                Object obj4 = z0x0Var.a;
                int i6 = z0x0Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                z0x0Var.b = 1;
                return vr20Var.emit(obj, z0x0Var) == d9nVar ? d9nVar : rih1Var;
            case 3:
                if (lnmVar instanceof a3x0) {
                    a3x0Var = (a3x0) lnmVar;
                    int i7 = a3x0Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        a3x0Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        a3x0Var = new a3x0(this, lnmVar);
                    }
                } else {
                    a3x0Var = new a3x0(this, lnmVar);
                }
                Object obj5 = a3x0Var.a;
                int i8 = a3x0Var.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hm5.M(obj5);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj5);
                if (!(obj instanceof x231)) {
                    return rih1Var;
                }
                a3x0Var.b = 1;
                return vr20Var.emit(obj, a3x0Var) == d9nVar ? d9nVar : rih1Var;
            case 4:
                if (lnmVar instanceof b3x0) {
                    b3x0Var = (b3x0) lnmVar;
                    int i9 = b3x0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        b3x0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        b3x0Var = new b3x0(this, lnmVar);
                    }
                } else {
                    b3x0Var = new b3x0(this, lnmVar);
                }
                Object obj6 = b3x0Var.a;
                int i10 = b3x0Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hm5.M(obj6);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj6);
                if (!(obj instanceof x231)) {
                    return rih1Var;
                }
                b3x0Var.b = 1;
                return vr20Var.emit(obj, b3x0Var) == d9nVar ? d9nVar : rih1Var;
            case 5:
                if (lnmVar instanceof c3x0) {
                    c3x0Var = (c3x0) lnmVar;
                    int i11 = c3x0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c3x0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        c3x0Var = new c3x0(this, lnmVar);
                    }
                } else {
                    c3x0Var = new c3x0(this, lnmVar);
                }
                Object obj7 = c3x0Var.a;
                int i12 = c3x0Var.b;
                if (i12 == 0) {
                    hm5.M(obj7);
                    m2x0 m2x0Var = new m2x0(((Boolean) obj).booleanValue());
                    c3x0Var.b = 1;
                    return vr20Var.emit(m2x0Var, c3x0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i12 == 1) {
                    hm5.M(obj7);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (lnmVar instanceof d3x0) {
                    d3x0Var = (d3x0) lnmVar;
                    int i13 = d3x0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        d3x0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        d3x0Var = new d3x0(this, lnmVar);
                    }
                } else {
                    d3x0Var = new d3x0(this, lnmVar);
                }
                Object obj8 = d3x0Var.a;
                int i14 = d3x0Var.b;
                if (i14 == 0) {
                    hm5.M(obj8);
                    Boolean boolValueOf = Boolean.valueOf(((x231) obj).a);
                    d3x0Var.b = 1;
                    return vr20Var.emit(boolValueOf, d3x0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i14 == 1) {
                    hm5.M(obj8);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (lnmVar instanceof e3x0) {
                    e3x0Var = (e3x0) lnmVar;
                    int i15 = e3x0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        e3x0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        e3x0Var = new e3x0(this, lnmVar);
                    }
                } else {
                    e3x0Var = new e3x0(this, lnmVar);
                }
                Object obj9 = e3x0Var.a;
                int i16 = e3x0Var.b;
                if (i16 == 0) {
                    hm5.M(obj9);
                    Boolean boolValueOf2 = Boolean.valueOf(((x231) obj).a);
                    e3x0Var.b = 1;
                    return vr20Var.emit(boolValueOf2, e3x0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i16 == 1) {
                    hm5.M(obj9);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                if (lnmVar instanceof s3x0) {
                    s3x0Var = (s3x0) lnmVar;
                    int i17 = s3x0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        s3x0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        s3x0Var = new s3x0(this, lnmVar);
                    }
                } else {
                    s3x0Var = new s3x0(this, lnmVar);
                }
                Object obj10 = s3x0Var.a;
                int i18 = s3x0Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hm5.M(obj10);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj10);
                m6w m6wVar = (o6w) obj;
                Boolean boolValueOf3 = Boolean.valueOf(m6wVar instanceof m6w ? m6wVar.a : false);
                s3x0Var.b = 1;
                return vr20Var.emit(boolValueOf3, s3x0Var) == d9nVar ? d9nVar : rih1Var;
            case 9:
                if (lnmVar instanceof t3x0) {
                    t3x0Var = (t3x0) lnmVar;
                    int i19 = t3x0Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        t3x0Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        t3x0Var = new t3x0(this, lnmVar);
                    }
                } else {
                    t3x0Var = new t3x0(this, lnmVar);
                }
                Object obj11 = t3x0Var.a;
                int i20 = t3x0Var.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hm5.M(obj11);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj11);
                String str3 = (String) obj;
                str = str3 != null ? str3 : "";
                t3x0Var.b = 1;
                return vr20Var.emit(str, t3x0Var) == d9nVar ? d9nVar : rih1Var;
            case 10:
                if (lnmVar instanceof v3x0) {
                    v3x0Var = (v3x0) lnmVar;
                    int i21 = v3x0Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        v3x0Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        v3x0Var = new v3x0(this, lnmVar);
                    }
                } else {
                    v3x0Var = new v3x0(this, lnmVar);
                }
                Object obj12 = v3x0Var.a;
                int i22 = v3x0Var.b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        hm5.M(obj12);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj12);
                if (!(obj instanceof bdx0)) {
                    return rih1Var;
                }
                v3x0Var.b = 1;
                return vr20Var.emit(obj, v3x0Var) == d9nVar ? d9nVar : rih1Var;
            case 11:
                if (lnmVar instanceof s6x0) {
                    s6x0Var = (s6x0) lnmVar;
                    int i23 = s6x0Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        s6x0Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        s6x0Var = new s6x0(this, lnmVar);
                    }
                } else {
                    s6x0Var = new s6x0(this, lnmVar);
                }
                Object obj13 = s6x0Var.a;
                int i24 = s6x0Var.b;
                if (i24 == 0) {
                    hm5.M(obj13);
                    yz91 yz91Var = (yz91) obj;
                    if (yz91Var instanceof xz91) {
                        xz91 xz91Var = (xz91) yz91Var;
                        j6x0Var2 = new j6x0(xz91Var.a, 7, xz91Var.b);
                    } else {
                        if (yz91Var instanceof wz91) {
                            j6x0Var = new j6x0(((wz91) yz91Var).a, 3, null);
                        } else if (yz91Var instanceof rz91) {
                            rz91 rz91Var = (rz91) yz91Var;
                            j6x0Var2 = new j6x0(rz91Var.a, 8, rz91Var.b);
                        } else if (yz91Var instanceof qz91) {
                            j6x0Var = new j6x0(((qz91) yz91Var).a, 4, null);
                        } else if (yz91Var instanceof tz91) {
                            j6x0Var = new j6x0(((tz91) yz91Var).a, 3, null);
                        } else if (yz91Var instanceof pz91) {
                            j6x0Var = new j6x0(((pz91) yz91Var).a, 3, null);
                        } else if (yz91Var instanceof oz91) {
                            j6x0Var = new j6x0(((oz91) yz91Var).a, 8, null);
                        } else if (!(yz91Var instanceof nz91)) {
                            if (yz91Var instanceof sz91) {
                                j6x0Var = new j6x0(((sz91) yz91Var).a, 7, null);
                            } else if (yz91Var instanceof vz91) {
                                j6x0Var = new j6x0(((vz91) yz91Var).a, 3, null);
                            } else if (yz91Var instanceof uz91) {
                                j6x0Var = new j6x0(((uz91) yz91Var).a, 4, null);
                            } else {
                                eg.o();
                            }
                        }
                        j6x0Var2 = j6x0Var;
                    }
                    if (j6x0Var2 == null) {
                        return rih1Var;
                    }
                    s6x0Var.b = 1;
                    return vr20Var.emit(j6x0Var2, s6x0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i24 == 1) {
                    hm5.M(obj13);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (lnmVar instanceof acx0) {
                    acx0Var = (acx0) lnmVar;
                    int i25 = acx0Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        acx0Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        acx0Var = new acx0(this, lnmVar);
                    }
                } else {
                    acx0Var = new acx0(this, lnmVar);
                }
                Object obj14 = acx0Var.a;
                int i26 = acx0Var.b;
                if (i26 == 0) {
                    hm5.M(obj14);
                    x9x0 x9x0Var = new x9x0(((Boolean) obj).booleanValue());
                    acx0Var.b = 1;
                    return vr20Var.emit(x9x0Var, acx0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i26 == 1) {
                    hm5.M(obj14);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 13:
                if (lnmVar instanceof bcx0) {
                    bcx0Var = (bcx0) lnmVar;
                    int i27 = bcx0Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        bcx0Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        bcx0Var = new bcx0(this, lnmVar);
                    }
                } else {
                    bcx0Var = new bcx0(this, lnmVar);
                }
                Object obj15 = bcx0Var.a;
                int i28 = bcx0Var.b;
                if (i28 == 0) {
                    hm5.M(obj15);
                    m730 m730Var = (m730) obj;
                    if (m730Var instanceof j730) {
                        Set set2 = s4b1.f;
                        String strS = uic.x(((j730) m730Var).a).s();
                        if (strS != null) {
                            j6x0Var2 = new aax0(true, strS);
                        }
                    } else if (m730Var instanceof i730) {
                        Set set3 = s4b1.f;
                        String strS2 = uic.x(((i730) m730Var).a).s();
                        if (strS2 != null) {
                            j6x0Var2 = new aax0(false, strS2);
                        }
                    } else if (m730Var instanceof l730) {
                        j6x0Var2 = new xax0(true, ((l730) m730Var).a);
                    } else if (m730Var instanceof k730) {
                        j6x0Var2 = new xax0(false, ((k730) m730Var).a);
                    } else {
                        eg.o();
                    }
                    if (j6x0Var2 == null) {
                        return rih1Var;
                    }
                    bcx0Var.b = 1;
                    return vr20Var.emit(j6x0Var2, bcx0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i28 == 1) {
                    hm5.M(obj15);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 14:
                if (lnmVar instanceof ccx0) {
                    ccx0Var = (ccx0) lnmVar;
                    int i29 = ccx0Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        ccx0Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        ccx0Var = new ccx0(this, lnmVar);
                    }
                } else {
                    ccx0Var = new ccx0(this, lnmVar);
                }
                Object obj16 = ccx0Var.a;
                int i30 = ccx0Var.b;
                if (i30 == 0) {
                    hm5.M(obj16);
                    zn30 zn30Var = (zn30) obj;
                    if (zn30Var instanceof xn30) {
                        cax0Var = new cax0(((xn30) zn30Var).a);
                    } else if (u890.j(zn30Var, yn30.a)) {
                        cax0Var = jax0.a;
                    } else {
                        eg.o();
                    }
                    ccx0Var.b = 1;
                    return vr20Var.emit(cax0Var, ccx0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i30 == 1) {
                    hm5.M(obj16);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                if (lnmVar instanceof dcx0) {
                    dcx0Var = (dcx0) lnmVar;
                    int i31 = dcx0Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        dcx0Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        dcx0Var = new dcx0(this, lnmVar);
                    }
                } else {
                    dcx0Var = new dcx0(this, lnmVar);
                }
                Object obj17 = dcx0Var.a;
                int i32 = dcx0Var.b;
                if (i32 == 0) {
                    hm5.M(obj17);
                    yz91 yz91Var2 = (yz91) obj;
                    if (yz91Var2 instanceof nz91) {
                        j6x0Var2 = new bax0(((nz91) yz91Var2).a);
                    } else if (yz91Var2 instanceof pz91) {
                        j6x0Var2 = new cax0(((pz91) yz91Var2).a);
                    } else if (!(yz91Var2 instanceof oz91)) {
                        if (yz91Var2 instanceof tz91) {
                            j6x0Var2 = new cax0(((tz91) yz91Var2).a);
                        } else if (!(yz91Var2 instanceof sz91)) {
                            if (yz91Var2 instanceof xz91) {
                                j6x0Var2 = new iax0(((xz91) yz91Var2).a);
                            } else if (yz91Var2 instanceof wz91) {
                                j6x0Var2 = new hax0(((wz91) yz91Var2).a);
                            } else if (yz91Var2 instanceof rz91) {
                                j6x0Var2 = new eax0(((rz91) yz91Var2).a);
                            } else if (yz91Var2 instanceof qz91) {
                                j6x0Var2 = new dax0(((qz91) yz91Var2).a);
                            } else if (yz91Var2 instanceof vz91) {
                                j6x0Var2 = new gax0(((vz91) yz91Var2).a);
                            } else if (yz91Var2 instanceof uz91) {
                                j6x0Var2 = new fax0(((uz91) yz91Var2).a);
                            } else {
                                eg.o();
                            }
                        }
                    }
                    if (j6x0Var2 == null) {
                        return rih1Var;
                    }
                    dcx0Var.b = 1;
                    return vr20Var.emit(j6x0Var2, dcx0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i32 == 1) {
                    hm5.M(obj17);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                if (lnmVar instanceof zdx0) {
                    zdx0Var = (zdx0) lnmVar;
                    int i33 = zdx0Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        zdx0Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        zdx0Var = new zdx0(this, lnmVar);
                    }
                } else {
                    zdx0Var = new zdx0(this, lnmVar);
                }
                Object obj18 = zdx0Var.a;
                int i34 = zdx0Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        hm5.M(obj18);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj18);
                if (((uv00) obj).f) {
                    return rih1Var;
                }
                zdx0Var.b = 1;
                return vr20Var.emit(obj, zdx0Var) == d9nVar ? d9nVar : rih1Var;
            case 17:
                if (lnmVar instanceof aex0) {
                    aex0Var = (aex0) lnmVar;
                    int i35 = aex0Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        aex0Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        aex0Var = new aex0(this, lnmVar);
                    }
                } else {
                    aex0Var = new aex0(this, lnmVar);
                }
                Object obj19 = aex0Var.a;
                int i36 = aex0Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    List listB = ((uv00) obj).b(zei1.class);
                    aex0Var.b = 1;
                    return vr20Var.emit(listB, aex0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i36 == 1) {
                    hm5.M(obj19);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 18:
                if (lnmVar instanceof jex0) {
                    jex0Var = (jex0) lnmVar;
                    int i37 = jex0Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        jex0Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        jex0Var = new jex0(this, lnmVar);
                    }
                } else {
                    jex0Var = new jex0(this, lnmVar);
                }
                Object obj20 = jex0Var.a;
                int i38 = jex0Var.b;
                if (i38 != 0) {
                    if (i38 == 1) {
                        hm5.M(obj20);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj20);
                Object objG = u890.G((k1r) obj);
                if (objG == null) {
                    return rih1Var;
                }
                jex0Var.b = 1;
                return vr20Var.emit(objG, jex0Var) == d9nVar ? d9nVar : rih1Var;
            case 19:
                if (lnmVar instanceof kix0) {
                    kix0Var = (kix0) lnmVar;
                    int i39 = kix0Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        kix0Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        kix0Var = new kix0(this, lnmVar);
                    }
                } else {
                    kix0Var = new kix0(this, lnmVar);
                }
                Object obj21 = kix0Var.a;
                int i40 = kix0Var.b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        hm5.M(obj21);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj21);
                List list = ((m7e0) obj).b;
                ArrayList arrayList = new ArrayList();
                for (Object obj22 : list) {
                    if (obj22 instanceof j7e0) {
                        arrayList.add(obj22);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((j7e0) it.next()).b);
                }
                Set setP1 = o7h.p1(arrayList2);
                kix0Var.b = 1;
                return vr20Var.emit(setP1, kix0Var) == d9nVar ? d9nVar : rih1Var;
            case 20:
                if (lnmVar instanceof mix0) {
                    mix0Var = (mix0) lnmVar;
                    int i41 = mix0Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        mix0Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        mix0Var = new mix0(this, lnmVar);
                    }
                } else {
                    mix0Var = new mix0(this, lnmVar);
                }
                Object obj23 = mix0Var.a;
                int i42 = mix0Var.b;
                if (i42 == 0) {
                    hm5.M(obj23);
                    ygx0 ygx0Var = new ygx0((Set) obj);
                    mix0Var.b = 1;
                    return vr20Var.emit(ygx0Var, mix0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i42 == 1) {
                    hm5.M(obj23);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 21:
                if (lnmVar instanceof ikx0) {
                    ikx0Var = (ikx0) lnmVar;
                    int i43 = ikx0Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ikx0Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        ikx0Var = new ikx0(this, lnmVar);
                    }
                } else {
                    ikx0Var = new ikx0(this, lnmVar);
                }
                Object obj24 = ikx0Var.a;
                int i44 = ikx0Var.b;
                if (i44 == 0) {
                    hm5.M(obj24);
                    k1r k1rVar = (k1r) obj;
                    if (k1rVar instanceof h1r) {
                        j6x0Var2 = new e331(new m231(new IOException("Failed to load required metadata")));
                    } else if (k1rVar instanceof i1r) {
                        j6x0Var2 = new e331(rih1Var);
                    } else if (!u890.j(k1rVar, j1r.a)) {
                        eg.o();
                    }
                    if (j6x0Var2 == null) {
                        return rih1Var;
                    }
                    ikx0Var.b = 1;
                    return vr20Var.emit(j6x0Var2, ikx0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i44 == 1) {
                    hm5.M(obj24);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                if (lnmVar instanceof gnx0) {
                    gnx0Var = (gnx0) lnmVar;
                    int i45 = gnx0Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        gnx0Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        gnx0Var = new gnx0(this, lnmVar);
                    }
                } else {
                    gnx0Var = new gnx0(this, lnmVar);
                }
                Object obj25 = gnx0Var.a;
                int i46 = gnx0Var.b;
                if (i46 != 0) {
                    if (i46 == 1) {
                        hm5.M(obj25);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj25);
                Object objG2 = u890.G((k1r) obj);
                if (objG2 == null) {
                    return rih1Var;
                }
                gnx0Var.b = 1;
                return vr20Var.emit(objG2, gnx0Var) == d9nVar ? d9nVar : rih1Var;
            case 23:
                if (lnmVar instanceof gox0) {
                    gox0Var = (gox0) lnmVar;
                    int i47 = gox0Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        gox0Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        gox0Var = new gox0(this, lnmVar);
                    }
                } else {
                    gox0Var = new gox0(this, lnmVar);
                }
                Object obj26 = gox0Var.a;
                int i48 = gox0Var.b;
                if (i48 != 0) {
                    if (i48 == 1) {
                        hm5.M(obj26);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj26);
                Object objG3 = u890.G((k1r) obj);
                if (objG3 == null) {
                    return rih1Var;
                }
                gox0Var.b = 1;
                return vr20Var.emit(objG3, gox0Var) == d9nVar ? d9nVar : rih1Var;
            case 24:
                if (lnmVar instanceof uox0) {
                    uox0Var = (uox0) lnmVar;
                    int i49 = uox0Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        uox0Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        uox0Var = new uox0(this, lnmVar);
                    }
                } else {
                    uox0Var = new uox0(this, lnmVar);
                }
                Object obj27 = uox0Var.a;
                int i50 = uox0Var.b;
                if (i50 != 0) {
                    if (i50 == 1) {
                        hm5.M(obj27);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj27);
                m6w0 m6w0Var = (m6w0) obj;
                if (m6w0Var != null && u890.j(m6w0Var.b.a, n4j0.a)) {
                    z = true;
                }
                Boolean boolValueOf4 = Boolean.valueOf(z);
                uox0Var.b = 1;
                return vr20Var.emit(boolValueOf4, uox0Var) == d9nVar ? d9nVar : rih1Var;
            case 25:
                if (lnmVar instanceof e2y0) {
                    e2y0Var = (e2y0) lnmVar;
                    int i51 = e2y0Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        e2y0Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        e2y0Var = new e2y0(this, lnmVar);
                    }
                } else {
                    e2y0Var = new e2y0(this, lnmVar);
                }
                Object obj28 = e2y0Var.a;
                int i52 = e2y0Var.b;
                if (i52 != 0) {
                    if (i52 == 1) {
                        hm5.M(obj28);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj28);
                String str4 = (String) ((cxc0) obj).f.q.get("refresh_cadence");
                if (u890.j(str4, "DAILY")) {
                    j6x0Var2 = aio.a;
                } else if (u890.j(str4, "WEEKLY")) {
                    j6x0Var2 = bio.a;
                }
                a2y0 a2y0Var = new a2y0(j6x0Var2);
                e2y0Var.b = 1;
                return vr20Var.emit(a2y0Var, e2y0Var) == d9nVar ? d9nVar : rih1Var;
            case 26:
                if (lnmVar instanceof i2y0) {
                    i2y0Var = (i2y0) lnmVar;
                    int i53 = i2y0Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        i2y0Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        i2y0Var = new i2y0(this, lnmVar);
                    }
                } else {
                    i2y0Var = new i2y0(this, lnmVar);
                }
                Object obj29 = i2y0Var.a;
                int i54 = i2y0Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        hm5.M(obj29);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj29);
                cxc0 cxc0Var = (cxc0) obj;
                String str5 = (String) cxc0Var.f.q.get("generation_status");
                Set set4 = h4d0.a;
                h4d0 h4d0VarU = qyo1.u(str5 != null ? str5 : "");
                h4d0VarU.getClass();
                boolean zContains = h4d0.a.contains(h4d0VarU);
                if (cxc0Var.f.w.b && !zContains) {
                    z = true;
                }
                Boolean boolValueOf5 = Boolean.valueOf(z);
                i2y0Var.b = 1;
                return vr20Var.emit(boolValueOf5, i2y0Var) == d9nVar ? d9nVar : rih1Var;
            case 27:
                if (lnmVar instanceof b4y0) {
                    b4y0Var = (b4y0) lnmVar;
                    int i55 = b4y0Var.b;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        b4y0Var.b = i55 - Integer.MIN_VALUE;
                    } else {
                        b4y0Var = new b4y0(this, lnmVar);
                    }
                } else {
                    b4y0Var = new b4y0(this, lnmVar);
                }
                Object obj30 = b4y0Var.a;
                int i56 = b4y0Var.b;
                if (i56 != 0) {
                    if (i56 == 1) {
                        hm5.M(obj30);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj30);
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                j6x0Var2 = i1rVar2 != null ? (g3d0) i1rVar2.a : null;
                if (j6x0Var2 == null) {
                    return rih1Var;
                }
                b4y0Var.b = 1;
                return vr20Var.emit(j6x0Var2, b4y0Var) == d9nVar ? d9nVar : rih1Var;
            case 28:
                return b(obj, lnmVar);
            default:
                if (lnmVar instanceof e4y0) {
                    e4y0Var = (e4y0) lnmVar;
                    int i57 = e4y0Var.b;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        e4y0Var.b = i57 - Integer.MIN_VALUE;
                    } else {
                        e4y0Var = new e4y0(this, lnmVar);
                    }
                } else {
                    e4y0Var = new e4y0(this, lnmVar);
                }
                Object obj31 = e4y0Var.a;
                int i58 = e4y0Var.b;
                if (i58 != 0) {
                    if (i58 == 1) {
                        hm5.M(obj31);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj31);
                cxc0 cxc0Var2 = (cxc0) obj;
                if (cxc0Var2.a()) {
                    Map map = cxc0Var2.f.q;
                    Set set5 = h4d0.a;
                    String str6 = (String) map.get("generation_status");
                    if (str6 != null && (string = ihc1.e1(str6).toString()) != null) {
                        str = string;
                    }
                    if (qyo1.u(str).a()) {
                        z = true;
                    }
                }
                Boolean boolValueOf6 = Boolean.valueOf(z);
                e4y0Var.b = 1;
                return vr20Var.emit(boolValueOf6, e4y0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }

    public /* synthetic */ p0x0(vr20 vr20Var, byte b) {
        this.a = b;
        this.b = vr20Var;
    }
}
