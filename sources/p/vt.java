package p;

import android.app.Activity;
import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.player.model.command.SignalCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import j$.time.Instant;
import j$.time.format.DateTimeParseException;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vt implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public vt(vr20 vr20Var, ya3 ya3Var, qxc0 qxc0Var) {
        this.a = (byte) 20;
        this.b = vr20Var;
        this.c = qxc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(Object obj, lnm lnmVar) {
        k04 k04Var;
        if (lnmVar instanceof k04) {
            k04Var = (k04) lnmVar;
            int i = k04Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k04Var.b = i - Integer.MIN_VALUE;
            } else {
                k04Var = new k04(this, lnmVar);
            }
        } else {
            k04Var = new k04(this, lnmVar);
        }
        Object obj2 = k04Var.a;
        int i2 = k04Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            vr20 vr20Var = (vr20) this.b;
            hix0 hix0Var = (iix0) ((whx0) obj).a.get(((e04) ((f04) this.c)).c);
            boolean z = false;
            if (hix0Var != null && (hix0Var instanceof hix0) && !hix0Var.a) {
                z = true;
            }
            c04 c04Var = new c04(Boolean.valueOf(z));
            k04Var.b = 1;
            Object objEmit = vr20Var.emit(c04Var, k04Var);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:105:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:130:0x0254  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:182:0x032e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0380  */
    /* JADX WARN: Code duplicated, block: B:231:0x0419  */
    /* JADX WARN: Code duplicated, block: B:259:0x04a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:261:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:273:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:294:0x0543  */
    /* JADX WARN: Code duplicated, block: B:318:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:346:0x0606  */
    /* JADX WARN: Code duplicated, block: B:364:0x0670  */
    /* JADX WARN: Code duplicated, block: B:386:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:403:0x0723  */
    /* JADX WARN: Code duplicated, block: B:420:0x0754  */
    /* JADX WARN: Code duplicated, block: B:443:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:469:0x0813  */
    /* JADX WARN: Code duplicated, block: B:489:0x0856  */
    /* JADX WARN: Code duplicated, block: B:48:0x010c  */
    /* JADX WARN: Code duplicated, block: B:507:0x089e  */
    /* JADX WARN: Code duplicated, block: B:523:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:544:0x0931  */
    /* JADX WARN: Code duplicated, block: B:623:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0157  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    public final Object emit(Object obj, lnm lnmVar) throws AbortFlowException {
        ut utVar;
        vr20 vr20Var;
        ng81 ng81Var;
        xpw xpwVar;
        int i;
        n90 n90Var;
        bd0 bd0Var;
        xm0 xm0Var;
        hz0 hz0Var;
        xz0 xz0Var;
        vr20 vr20Var2;
        vr20 vr20Var3;
        Object obj2;
        hd1 hd1Var;
        an1 an1Var;
        qp31 qp31VarA;
        lo1 lo1Var;
        vr20 vr20Var4;
        ct1 ct1Var;
        g42 g42Var;
        va2 va2Var;
        de2 de2Var;
        Object objA;
        uf2 uf2Var;
        vr20 vr20Var5;
        n83 n83Var;
        xa3 xa3Var;
        cb3 cb3Var;
        Boolean bool;
        hd3 hd3Var;
        vd3 vd3Var;
        yg3 yg3Var;
        gh3 gh3VarA;
        bj3 bj3Var;
        xk3 xk3Var;
        tx3 tx3Var;
        b64 b64Var;
        vr20 vr20Var6;
        pp90 pp90Var;
        String str;
        byte b = this.a;
        int i2 = 0;
        int i3 = 0;
        z = false;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        z = false;
        z = false;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        i = 0;
        int i6 = 0;
        z = false;
        boolean z5 = false;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        kh81 kh81VarValueOf = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xt xtVar = (xt) obj3;
                if (lnmVar instanceof ut) {
                    utVar = (ut) lnmVar;
                    int i7 = utVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        utVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        utVar = new ut(this, lnmVar);
                    }
                } else {
                    utVar = new ut(this, lnmVar);
                }
                Object objI = utVar.a;
                int i8 = utVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        i = utVar.d;
                        xpwVar = utVar.f;
                        vr20Var = utVar.c;
                        hm5.M(objI);
                    } else {
                        if (i8 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objI);
                    }
                    return rih1Var;
                }
                hm5.M(objI);
                vr20Var = (vr20) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                kly0 kly0Var = xtVar.f;
                if (zBooleanValue) {
                    kly0Var = null;
                }
                if (kly0Var != null) {
                    xpwVar = (xpw) kly0Var.get();
                    kw kwVar = xtVar.a;
                    utVar.c = vr20Var;
                    utVar.f = xpwVar;
                    utVar.d = 0;
                    utVar.b = 1;
                    objI = b5p1.i(kwVar.d.a(), utVar);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                    i = 0;
                } else {
                    ng81Var = null;
                }
                utVar.c = null;
                utVar.f = null;
                utVar.d = i2;
                utVar.b = 2;
                if (vr20Var.emit(ng81Var, utVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
                ng81Var = new ng81(new ls(((Boolean) objI).booleanValue(), false), xpwVar);
                i2 = i;
                utVar.c = null;
                utVar.f = null;
                utVar.d = i2;
                utVar.b = 2;
                if (vr20Var.emit(ng81Var, utVar) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 1:
                if (lnmVar instanceof n90) {
                    n90Var = (n90) lnmVar;
                    int i9 = n90Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        n90Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        n90Var = new n90(this, lnmVar);
                    }
                } else {
                    n90Var = new n90(this, lnmVar);
                }
                Object obj5 = n90Var.a;
                int i10 = n90Var.b;
                if (i10 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var7 = (vr20) obj4;
                    nnc1 nnc1Var = (onc1) obj;
                    ((t90) obj3).getClass();
                    if ((nnc1Var instanceof nnc1) && nnc1Var.a == 3) {
                        z5 = true;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z5);
                    n90Var.b = 1;
                    if (vr20Var7.emit(boolValueOf, n90Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i10 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            case 2:
                if (lnmVar instanceof bd0) {
                    bd0Var = (bd0) lnmVar;
                    int i11 = bd0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bd0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        bd0Var = new bd0(this, lnmVar);
                    }
                } else {
                    bd0Var = new bd0(this, lnmVar);
                }
                Object obj6 = bd0Var.a;
                int i12 = bd0Var.b;
                if (i12 == 0) {
                    hm5.M(obj6);
                    zc0 zc0Var = (zc0) obj3;
                    ad0 ad0Var = new ad0(zc0Var.a, (List) obj, zc0Var);
                    bd0Var.b = 1;
                    if (((vr20) obj4).emit(ad0Var, bd0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i12 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 3:
                if (lnmVar instanceof xm0) {
                    xm0Var = (xm0) lnmVar;
                    int i13 = xm0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        xm0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        xm0Var = new xm0(this, lnmVar);
                    }
                } else {
                    xm0Var = new xm0(this, lnmVar);
                }
                Object obj7 = xm0Var.a;
                int i14 = xm0Var.b;
                if (i14 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var8 = (vr20) obj4;
                    if (u890.j(((xx10) obj).a(), ((l62) obj3).t)) {
                        xm0Var.b = 1;
                        if (vr20Var8.emit(obj, xm0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof hz0) {
                    hz0Var = (hz0) lnmVar;
                    int i15 = hz0Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        hz0Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        hz0Var = new hz0(this, lnmVar);
                    }
                } else {
                    hz0Var = new hz0(this, lnmVar);
                }
                Object obj8 = hz0Var.a;
                int i16 = hz0Var.b;
                if (i16 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var9 = (vr20) obj4;
                    kh81VarValueOf = ((iz0) obj3).b ? null : (gvf1) obj;
                    if (kh81VarValueOf != null) {
                        hz0Var.b = 1;
                        if (vr20Var9.emit(kh81VarValueOf, hz0Var) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj8);
                }
                return rih1Var;
            case 5:
                if (lnmVar instanceof xz0) {
                    xz0Var = (xz0) lnmVar;
                    int i17 = xz0Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        xz0Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        xz0Var = new xz0(this, lnmVar);
                    }
                } else {
                    xz0Var = new xz0(this, lnmVar);
                }
                Object obj9 = xz0Var.a;
                int i18 = xz0Var.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        i6 = xz0Var.d;
                        vr20Var3 = xz0Var.c;
                        hm5.M(obj9);
                    } else {
                        if (i18 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj9);
                    }
                    return rih1Var;
                }
                hm5.M(obj9);
                vr20Var2 = (vr20) obj4;
                if (((Boolean) obj).booleanValue()) {
                    mgf1 mgf1Var = (mgf1) ((eyh0) obj3).c;
                    xz0Var.c = vr20Var2;
                    xz0Var.d = 0;
                    xz0Var.b = 1;
                    Object objB = mgf1Var.b(xz0Var);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                    vr20Var3 = vr20Var2;
                    obj9 = objB;
                } else {
                    obj2 = Boolean.FALSE;
                }
                xz0Var.c = null;
                xz0Var.d = i6;
                xz0Var.b = 2;
                if (vr20Var2.emit(obj2, xz0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
                vr20 vr20Var10 = vr20Var3;
                obj2 = obj9;
                vr20Var2 = vr20Var10;
                xz0Var.c = null;
                xz0Var.d = i6;
                xz0Var.b = 2;
                if (vr20Var2.emit(obj2, xz0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof hd1) {
                    hd1Var = (hd1) lnmVar;
                    int i19 = hd1Var.b;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        hd1Var.b = i19 - Integer.MIN_VALUE;
                    } else {
                        hd1Var = new hd1(this, lnmVar);
                    }
                } else {
                    hd1Var = new hd1(this, lnmVar);
                }
                Object obj10 = hd1Var.a;
                int i20 = hd1Var.b;
                if (i20 == 0) {
                    hm5.M(obj10);
                    vr20 vr20Var11 = (vr20) obj4;
                    cxc0 cxc0Var = (cxc0) obj;
                    if (cxc0Var.f.w.b && (((id1) obj3).c || !cxc0Var.i)) {
                        z4 = true;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(z4);
                    hd1Var.b = 1;
                    if (vr20Var11.emit(boolValueOf2, hd1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i20 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var;
            case 7:
                if (lnmVar instanceof an1) {
                    an1Var = (an1) lnmVar;
                    int i21 = an1Var.b;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        an1Var.b = i21 - Integer.MIN_VALUE;
                    } else {
                        an1Var = new an1(this, lnmVar);
                    }
                } else {
                    an1Var = new an1(this, lnmVar);
                }
                Object obj11 = an1Var.a;
                int i22 = an1Var.b;
                if (i22 == 0) {
                    hm5.M(obj11);
                    vr20 vr20Var12 = (vr20) obj4;
                    bn1 bn1Var = (bn1) obj3;
                    kby kbyVar = ((cxc0) obj).f;
                    boolean z6 = kbyVar.j;
                    tu00 tu00Var = kbyVar.x;
                    if (z6 || u890.j(kbyVar.q.get("owner_username"), (String) bn1Var.f)) {
                        qp31VarA = tu00Var.a(qp31.class);
                        if (qp31VarA != null && qp31VarA.a && !kbyVar.g) {
                            z3 = true;
                        }
                    } else {
                        qp31 qp31VarA2 = tu00Var.a(qp31.class);
                        if (qp31VarA2 == null || !qp31VarA2.a) {
                            Set set = s4b1.f;
                            if (uic.x(kbyVar.a).c != blc0.g1) {
                                qp31VarA = tu00Var.a(qp31.class);
                                if (qp31VarA != null) {
                                }
                            }
                        }
                        z3 = true;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z3);
                    an1Var.b = 1;
                    if (vr20Var12.emit(boolValueOf3, an1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i22 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 8:
                if (lnmVar instanceof lo1) {
                    lo1Var = (lo1) lnmVar;
                    int i23 = lo1Var.b;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        lo1Var.b = i23 - Integer.MIN_VALUE;
                    } else {
                        lo1Var = new lo1(this, lnmVar);
                    }
                } else {
                    lo1Var = new lo1(this, lnmVar);
                }
                Object obj12 = lo1Var.a;
                int i24 = lo1Var.b;
                if (i24 != 0) {
                    if (i24 == 1) {
                        i5 = lo1Var.d;
                        vr20Var4 = lo1Var.c;
                        hm5.M(obj12);
                    } else {
                        if (i24 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj12);
                    }
                    return rih1Var;
                }
                hm5.M(obj12);
                vr20 vr20Var13 = (vr20) obj4;
                lo1Var.c = vr20Var13;
                lo1Var.d = 0;
                lo1Var.b = 1;
                Object objL = ((so1) obj3).l((go1) obj, lo1Var);
                if (objL == d9nVar) {
                    return d9nVar;
                }
                vr20Var4 = vr20Var13;
                obj12 = objL;
                lo1Var.c = null;
                lo1Var.d = i5;
                lo1Var.b = 2;
                if (vr20Var4.emit(obj12, lo1Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 9:
                Set set2 = (Set) obj;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                Set setV0 = dm61.v0(set2, linkedHashSet);
                Set setV1 = dm61.v0(linkedHashSet, set2);
                ((vu30) ((ven0) obj3).getValue()).invoke(setV0, setV1);
                linkedHashSet.removeAll(setV1);
                linkedHashSet.addAll(setV0);
                return rih1Var;
            case 10:
                if (lnmVar instanceof ct1) {
                    ct1Var = (ct1) lnmVar;
                    int i25 = ct1Var.b;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        ct1Var.b = i25 - Integer.MIN_VALUE;
                    } else {
                        ct1Var = new ct1(this, lnmVar);
                    }
                } else {
                    ct1Var = new ct1(this, lnmVar);
                }
                Object obj13 = ct1Var.a;
                int i26 = ct1Var.b;
                if (i26 == 0) {
                    hm5.M(obj13);
                    ds1 ds1Var = new ds1((go1) obj, ((dt1) obj3).b.d);
                    ct1Var.b = 1;
                    if (((vr20) obj4).emit(ds1Var, ct1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i26 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj13);
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (lnmVar instanceof g42) {
                    g42Var = (g42) lnmVar;
                    int i27 = g42Var.b;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        g42Var.b = i27 - Integer.MIN_VALUE;
                    } else {
                        g42Var = new g42(this, lnmVar);
                    }
                } else {
                    g42Var = new g42(this, lnmVar);
                }
                Object obj14 = g42Var.a;
                int i28 = g42Var.b;
                if (i28 != 0) {
                    if (i28 == 1) {
                        hm5.M(obj14);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj14);
                vr20 vr20Var14 = (vr20) obj4;
                j7p0 j7p0Var = (j7p0) obj;
                ((i42) obj3).getClass();
                if ((j7p0Var instanceof g7p0) || (j7p0Var instanceof h7p0)) {
                    g42Var.b = 1;
                    if (vr20Var14.emit(obj, g42Var) == d9nVar) {
                        return d9nVar;
                    }
                } else if (!(j7p0Var instanceof i7p0) && !(j7p0Var instanceof f7p0)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case grn1.d /* 12 */:
                if (lnmVar instanceof va2) {
                    va2Var = (va2) lnmVar;
                    int i29 = va2Var.b;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        va2Var.b = i29 - Integer.MIN_VALUE;
                    } else {
                        va2Var = new va2(this, lnmVar);
                    }
                } else {
                    va2Var = new va2(this, lnmVar);
                }
                Object obj15 = va2Var.a;
                int i30 = va2Var.b;
                if (i30 == 0) {
                    hm5.M(obj15);
                    vr20 vr20Var15 = (vr20) obj4;
                    String str2 = (String) obj;
                    try {
                        Instant instantOfEpochMilli = Instant.ofEpochMilli(((wa2) obj3).b.b());
                        Instant instant = Instant.parse(str2);
                        if (instant.compareTo(instantOfEpochMilli) >= 0) {
                            kh81VarValueOf = Integer.valueOf((int) ChronoUnit.DAYS.between(instantOfEpochMilli, instant));
                            break;
                        }
                    } catch (DateTimeParseException e) {
                        n57.t("Could not parse timestamp: " + str2, e);
                    }
                    va2Var.b = 1;
                    if (vr20Var15.emit(kh81VarValueOf, va2Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i30 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj15);
                }
                return rih1Var;
            case 13:
                if (lnmVar instanceof de2) {
                    de2Var = (de2) lnmVar;
                    int i31 = de2Var.b;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        de2Var.b = i31 - Integer.MIN_VALUE;
                    } else {
                        de2Var = new de2(this, lnmVar);
                    }
                } else {
                    de2Var = new de2(this, lnmVar);
                }
                Object obj16 = de2Var.a;
                int i32 = de2Var.b;
                if (i32 == 0) {
                    hm5.M(obj16);
                    vr20 vr20Var16 = (vr20) obj4;
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    kly0 kly0Var2 = ((ee2) obj3).c;
                    if (!zBooleanValue2) {
                        kly0Var2 = null;
                    }
                    kh81VarValueOf = kly0Var2 != null ? new kh81(new ng81(rih1Var, (xpw) kly0Var2.get())) : null;
                    de2Var.b = 1;
                    if (vr20Var16.emit(kh81VarValueOf, de2Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i32 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj16);
                }
                return rih1Var;
            case 14:
                af2 af2Var = (af2) obj4;
                ma2 ma2Var = (ma2) obj3;
                int iOrdinal = ((oe2) obj).ordinal();
                if (iOrdinal == 0) {
                    if (ma2Var != null) {
                        na2 na2Var = ma2Var.b;
                        na2Var.k.a(new q6b(2, false));
                        fn31.T(ma2Var.c, (o8n) null, 0, new qm(na2Var, (lnm) null, (byte) 9), 3);
                    } else {
                        af2Var.f.a(new q6b(2, false));
                        objA = af2Var.d.a(lnmVar);
                        if (objA != d9nVar) {
                        }
                    }
                    objA = rih1Var;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            if (ma2Var != null) {
                                na2 na2Var2 = ma2Var.b;
                                na2Var2.k.a(new q6b(2, false));
                                fn31.T(ma2Var.c, (o8n) null, 0, new qm(na2Var2, (lnm) null, (byte) 9), 3);
                            } else {
                                af2Var.f.a(new q6b(2, false));
                                objA = af2Var.d.a(lnmVar);
                                if (objA != d9nVar) {
                                }
                            }
                        } else if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                eg.o();
                                return null;
                            }
                            if (ma2Var != null) {
                                na2 na2Var3 = ma2Var.b;
                                na2Var3.k.a(new q6b(2, false));
                                fn31.T(ma2Var.c, (o8n) null, 0, new qm(na2Var3, (lnm) null, (byte) 9), 3);
                            } else {
                                af2Var.f.a(new q6b(2, false));
                                objA = af2Var.d.a(lnmVar);
                                if (objA != d9nVar) {
                                }
                            }
                        }
                    }
                    objA = rih1Var;
                }
                return objA == d9nVar ? objA : rih1Var;
            case 15:
                if (lnmVar instanceof uf2) {
                    uf2Var = (uf2) lnmVar;
                    int i33 = uf2Var.b;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        uf2Var.b = i33 - Integer.MIN_VALUE;
                    } else {
                        uf2Var = new uf2(this, lnmVar);
                    }
                } else {
                    uf2Var = new uf2(this, lnmVar);
                }
                Object obj17 = uf2Var.a;
                int i34 = uf2Var.b;
                if (i34 != 0) {
                    if (i34 == 1) {
                        i4 = uf2Var.d;
                        vr20Var5 = uf2Var.c;
                        hm5.M(obj17);
                    } else {
                        if (i34 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj17);
                    }
                    return rih1Var;
                }
                hm5.M(obj17);
                vr20 vr20Var17 = (vr20) obj4;
                ((Boolean) obj).getClass();
                uf2Var.c = vr20Var17;
                uf2Var.d = 0;
                uf2Var.b = 1;
                Completable completableIgnoreElement = ((w9u0) ((idd1) ((vf2) obj3).f).getValue()).a(new k9u0(SignalCommand.create("switch-to-audio"))).ignoreElement();
                completableIgnoreElement.getClass();
                Object objI2 = fc11.i(completableIgnoreElement.o(Functions.h), uf2Var);
                if (objI2 != d9nVar) {
                    objI2 = rih1Var;
                }
                if (objI2 == d9nVar) {
                    return d9nVar;
                }
                vr20Var5 = vr20Var17;
                uf2Var.c = null;
                uf2Var.d = i4;
                uf2Var.b = 2;
                if (vr20Var5.emit(rih1Var, uf2Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 16:
                w18 w18Var = (w18) obj;
                lo2 lo2Var = (lo2) obj4;
                Object obj18 = ((p811) obj3).a;
                if (obj18 != null) {
                    Object objA2 = lo2Var.a((faa0) obj18, w18Var, lnmVar);
                    return objA2 == d9nVar ? objA2 : rih1Var;
                }
                u890.C("sessionJob");
                throw null;
            case 17:
                Float f = (Float) obj;
                m811 m811Var = (m811) obj3;
                if (f != null) {
                    m811Var.a = f.floatValue();
                }
                Object objEmit = ((vr20) obj4).emit(new Float(m811Var.a), lnmVar);
                return objEmit == d9nVar ? objEmit : rih1Var;
            case 18:
                int iIntValue = ((Number) obj).intValue();
                n811 n811Var = (n811) obj3;
                ((bpb1) ((u961) obj4).c).m((Object) null, new gr41(iIntValue, n811Var.a));
                n811Var.a = iIntValue;
                return rih1Var;
            case 19:
                if (lnmVar instanceof n83) {
                    n83Var = (n83) lnmVar;
                    int i35 = n83Var.b;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        n83Var.b = i35 - Integer.MIN_VALUE;
                    } else {
                        n83Var = new n83(this, lnmVar);
                    }
                } else {
                    n83Var = new n83(this, lnmVar);
                }
                Object obj19 = n83Var.a;
                int i36 = n83Var.b;
                if (i36 == 0) {
                    hm5.M(obj19);
                    Boolean boolValueOf4 = Boolean.valueOf(u890.j((hpe0) obj, (hpe0) obj3));
                    n83Var.b = 1;
                    if (((vr20) obj4).emit(boolValueOf4, n83Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i36 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj19);
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (lnmVar instanceof xa3) {
                    xa3Var = (xa3) lnmVar;
                    int i37 = xa3Var.b;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        xa3Var.b = i37 - Integer.MIN_VALUE;
                    } else {
                        xa3Var = new xa3(this, lnmVar);
                    }
                } else {
                    xa3Var = new xa3(this, lnmVar);
                }
                Object obj20 = xa3Var.a;
                int i38 = xa3Var.b;
                if (i38 == 0) {
                    hm5.M(obj20);
                    qxc0 qxc0Var = (qxc0) obj3;
                    igm igmVar = new igm(qxc0Var.a, new wfm(Uri.parse(qxc0Var.b.a(2))), (String) obj);
                    xa3Var.b = 1;
                    if (((vr20) obj4).emit(igmVar, xa3Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i38 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj20);
                }
                return rih1Var;
            case 21:
                if (lnmVar instanceof cb3) {
                    cb3Var = (cb3) lnmVar;
                    int i39 = cb3Var.b;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        cb3Var.b = i39 - Integer.MIN_VALUE;
                    } else {
                        cb3Var = new cb3(this, lnmVar);
                    }
                } else {
                    cb3Var = new cb3(this, lnmVar);
                }
                Object obj21 = cb3Var.a;
                int i40 = cb3Var.b;
                if (i40 == 0) {
                    hm5.M(obj21);
                    vr20 vr20Var18 = (vr20) obj4;
                    ljd0 ljd0Var = (ljd0) obj;
                    if (ljd0Var != null) {
                        ((fb3) obj3).c = ljd0Var;
                        bool = Boolean.TRUE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    cb3Var.b = 1;
                    if (vr20Var18.emit(bool, cb3Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i40 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj21);
                }
                return rih1Var;
            case 22:
                if (lnmVar instanceof hd3) {
                    hd3Var = (hd3) lnmVar;
                    int i41 = hd3Var.b;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        hd3Var.b = i41 - Integer.MIN_VALUE;
                    } else {
                        hd3Var = new hd3(this, lnmVar);
                    }
                } else {
                    hd3Var = new hd3(this, lnmVar);
                }
                Object obj22 = hd3Var.a;
                int i42 = hd3Var.b;
                if (i42 == 0) {
                    hm5.M(obj22);
                    id3 id3Var = (id3) obj3;
                    ed3 ed3VarF = id3Var.f(((gd3) obj).b, id3Var.h);
                    hd3Var.b = 1;
                    if (((vr20) obj4).emit(ed3VarF, hd3Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i42 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj22);
                }
                return rih1Var;
            case 23:
                if (lnmVar instanceof vd3) {
                    vd3Var = (vd3) lnmVar;
                    int i43 = vd3Var.b;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        vd3Var.b = i43 - Integer.MIN_VALUE;
                    } else {
                        vd3Var = new vd3(this, lnmVar);
                    }
                } else {
                    vd3Var = new vd3(this, lnmVar);
                }
                Object obj23 = vd3Var.a;
                int i44 = vd3Var.b;
                if (i44 == 0) {
                    hm5.M(obj23);
                    wv00 wv00Var = (uv00) obj;
                    mmr0 mmr0Var = new mmr0(wv00Var.a(myv0.class, ((yd3) obj3).a), Boolean.valueOf(wv00Var.f));
                    vd3Var.b = 1;
                    if (((vr20) obj4).emit(mmr0Var, vd3Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i44 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj23);
                }
                return rih1Var;
            case 24:
                zg3 zg3Var = (zg3) obj3;
                if (lnmVar instanceof yg3) {
                    yg3Var = (yg3) lnmVar;
                    int i45 = yg3Var.b;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        yg3Var.b = i45 - Integer.MIN_VALUE;
                    } else {
                        yg3Var = new yg3(this, lnmVar);
                    }
                } else {
                    yg3Var = new yg3(this, lnmVar);
                }
                Object obj24 = yg3Var.a;
                int i46 = yg3Var.b;
                if (i46 == 0) {
                    hm5.M(obj24);
                    vr20 vr20Var19 = (vr20) obj4;
                    wg3 wg3Var = (wg3) obj;
                    if (zro1.u((c8c0) zg3Var.d) && y7y0.A(wg3Var.b) && (gh3VarA = wg3Var.a.f.x.a(gh3.class)) != null && gh3VarA.h) {
                        z2 = true;
                    }
                    Boolean boolValueOf5 = Boolean.valueOf(z2);
                    yg3Var.b = 1;
                    if (vr20Var19.emit(boolValueOf5, yg3Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i46 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj24);
                }
                return rih1Var;
            case 25:
                if (lnmVar instanceof bj3) {
                    bj3Var = (bj3) lnmVar;
                    int i47 = bj3Var.b;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        bj3Var.b = i47 - Integer.MIN_VALUE;
                    } else {
                        bj3Var = new bj3(this, lnmVar);
                    }
                } else {
                    bj3Var = new bj3(this, lnmVar);
                }
                Object obj25 = bj3Var.a;
                int i48 = bj3Var.b;
                if (i48 == 0) {
                    hm5.M(obj25);
                    vr20 vr20Var20 = (vr20) obj4;
                    gax gaxVar = ((l2s0) obj) instanceof j2s0 ? new gax((Integer) null, ((Activity) ((u961) obj3).a).getString(2131961727)) : iax.a;
                    bj3Var.b = 1;
                    if (vr20Var20.emit(gaxVar, bj3Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i48 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj25);
                }
                return rih1Var;
            case 26:
                if (lnmVar instanceof xk3) {
                    xk3Var = (xk3) lnmVar;
                    int i49 = xk3Var.b;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        xk3Var.b = i49 - Integer.MIN_VALUE;
                    } else {
                        xk3Var = new xk3(this, lnmVar);
                    }
                } else {
                    xk3Var = new xk3(this, lnmVar);
                }
                Object obj26 = xk3Var.a;
                int i50 = xk3Var.b;
                if (i50 == 0) {
                    hm5.M(obj26);
                    ((bl3) obj3).getClass();
                    List listF = bl3.f((String) obj);
                    xk3Var.b = 1;
                    if (((vr20) obj4).emit(listF, xk3Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i50 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj26);
                }
                return rih1Var;
            case 27:
                if (lnmVar instanceof tx3) {
                    tx3Var = (tx3) lnmVar;
                    int i51 = tx3Var.b;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        tx3Var.b = i51 - Integer.MIN_VALUE;
                    } else {
                        tx3Var = new tx3(this, lnmVar);
                    }
                } else {
                    tx3Var = new tx3(this, lnmVar);
                }
                Object obj27 = tx3Var.a;
                int i52 = tx3Var.b;
                if (i52 == 0) {
                    hm5.M(obj27);
                    vr20 vr20Var21 = (vr20) obj4;
                    vl10 vl10Var = (vl10) obj;
                    if (((ux3) obj3).a() && (vl10Var instanceof ul10)) {
                        z = true;
                    }
                    Boolean boolValueOf6 = Boolean.valueOf(z);
                    tx3Var.b = 1;
                    if (vr20Var21.emit(boolValueOf6, tx3Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i52 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj27);
                }
                return rih1Var;
            case 28:
                return b(obj, lnmVar);
            default:
                if (lnmVar instanceof b64) {
                    b64Var = (b64) lnmVar;
                    int i53 = b64Var.b;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        b64Var.b = i53 - Integer.MIN_VALUE;
                    } else {
                        b64Var = new b64(this, lnmVar);
                    }
                } else {
                    b64Var = new b64(this, lnmVar);
                }
                Object objJ = b64Var.a;
                int i54 = b64Var.b;
                if (i54 != 0) {
                    if (i54 == 1) {
                        i3 = b64Var.d;
                        str = b64Var.g;
                        pp90Var = b64Var.f;
                        vr20Var6 = b64Var.c;
                        hm5.M(objJ);
                    } else {
                        if (i54 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objJ);
                    }
                    return rih1Var;
                }
                hm5.M(objJ);
                vr20Var6 = (vr20) obj4;
                r6a0 r6a0Var = (r6a0) obj;
                pp90Var = r6a0Var.a;
                zo90 zo90Var = r6a0Var.b;
                str = pp90Var.h.a;
                Single singleA = ((i5a1) ((g23) obj3).c).a(2, zo90Var.a);
                b64Var.c = vr20Var6;
                b64Var.f = pp90Var;
                b64Var.g = str;
                b64Var.d = 0;
                b64Var.b = 1;
                objJ = fc11.j(singleA, b64Var);
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                String str3 = ((yn71) objJ).a;
                String str4 = pp90Var.a;
                ArrayList arrayList = pp90Var.c;
                ArrayList<hp90> arrayList2 = new ArrayList();
                for (Object obj28 : arrayList) {
                    if (!((hp90) obj28).e) {
                        arrayList2.add(obj28);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                for (hp90 hp90Var : arrayList2) {
                    String str5 = hp90Var.b;
                    if (ihc1.y0(str5)) {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = hp90Var.c;
                    }
                    arrayList3.add(new q6a0(str5, hp90Var.d, hp90Var.a));
                }
                nq90 nq90Var = new nq90(str, str3, str4, arrayList3);
                b64Var.c = null;
                b64Var.f = null;
                b64Var.g = null;
                b64Var.d = i3;
                b64Var.b = 2;
                if (vr20Var6.emit(nq90Var, b64Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
        }
    }

    public /* synthetic */ vt(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
