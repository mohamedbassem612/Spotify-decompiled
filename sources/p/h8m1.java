package p;

import android.view.View;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.recaptcha.internal.zzhm;
import com.spotify.wrapped.v1.proto.StoryCard;
import com.spotify.yourupdates.badgingstate.models.BadgingState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h8m1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8m1(ptf1 ptf1Var, hzm1 hzm1Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 7;
        this.c = ptf1Var;
        this.d = hzm1Var;
        this.b = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new h8m1(this.b, (c8m1) this.c, (View) obj2, lnmVar);
            case 1:
                return new h8m1(this.b, (l8m1) obj2, (c8m1) this.c, lnmVar);
            case 2:
                return new h8m1(this.c, obj2, lnmVar, (byte) 2);
            case 3:
                return new h8m1(this.c, obj2, lnmVar, (byte) 3);
            case 4:
                return new h8m1(this.c, obj2, lnmVar, (byte) 4);
            case 5:
                return new h8m1(this.c, obj2, lnmVar, (byte) 5);
            case 6:
                h8m1 h8m1Var = new h8m1((lym1) obj2, lnmVar, (byte) 6);
                h8m1Var.c = obj;
                return h8m1Var;
            case 7:
                return new h8m1((ptf1) this.c, (hzm1) obj2, this.b, lnmVar);
            case 8:
                h8m1 h8m1Var2 = new h8m1((j0n1) obj2, lnmVar, (byte) 8);
                h8m1Var2.c = obj;
                return h8m1Var2;
            case 9:
                return new h8m1((oao1) obj2, lnmVar, (byte) 9);
            case 10:
                return new h8m1(this.c, obj2, lnmVar, (byte) 10);
            default:
                h8m1 h8m1Var3 = new h8m1((vfo1) obj2, lnmVar, (byte) 11);
                h8m1Var3.c = obj;
                return h8m1Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:26:0x0084 A[PHI: r15
      0x0084: PHI (r15v45 java.lang.Object) = (r15v0 java.lang.Object), (r15v54 java.lang.Object) binds: [B:21:0x0068, B:24:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:62:0x0104  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x010a  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x012c  */
    /* JADX WARN: Code duplicated, block: B:80:0x012f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0132  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    /* JADX WARN: Code duplicated, block: B:85:0x013e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    public final Object invokeSuspend(Object obj) throws Exception {
        String str;
        p811 p811Var;
        Exception exc;
        ayh ayhVar;
        Throwable th;
        Throwable th2;
        int errorCode;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                if (this.b) {
                    String strN = ((c8m1) this.c).c.n();
                    strN.getClass();
                    if (!ihc1.y0(strN)) {
                        ((View) this.d).announceForAccessibility(strN);
                    }
                }
                return rih1.a;
            case 1:
                c8m1 c8m1Var = (c8m1) this.c;
                l8m1 l8m1Var = (l8m1) this.d;
                py7 py7Var = l8m1Var.b;
                hm5.M(obj);
                if (this.b) {
                    StoryCard storyCard = c8m1Var.c;
                    vq71 vq71Var = c8m1Var.b;
                    String id = storyCard.getId();
                    boolean zJ = u890.j(py7Var.e, id);
                    py7Var.e = id;
                    if (!zJ && (str = vq71Var.a) != null && str.equals(py7Var.d)) {
                        l8m1Var.h.c(vq71Var.b, vq71Var.e, vq71Var.f, vq71Var.g);
                    }
                }
                return rih1.a;
            case 2:
                rih1 rih1Var = rih1.a;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ycm1 ycm1Var = ((cem1) this.c).e;
                    if (ycm1Var != null) {
                        m441 m441VarQ = rwq.q(new l5m1((tob1) this.d, (byte) 5));
                        vi viVar = new vi(ycm1Var, (byte) 22);
                        this.b = true;
                        if (m441VarQ.collect(viVar, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 3:
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    q4m1 q4m1Var = new q4m1((ArrayList) this.d, (cik1) this.c, null, (byte) 8);
                    this.b = true;
                    obj = smo1.s(q4m1Var, this);
                    if (obj == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                Map map = (Map) obj;
                ((xr01) ((cik1) this.c).d).getClass();
                b7x b7xVar = xr01.f;
                if (b7xVar == null) {
                    b7xVar = b7x.a;
                }
                LinkedHashMap linkedHashMapO = sqg0.O(b7xVar, map);
                ((xr01) ((cik1) this.c).d).getClass();
                xr01.f = linkedHashMapO;
                return linkedHashMapO;
            case 4:
                Enum r14 = d9n.a;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ghm1 ghm1Var = (ghm1) this.c;
                String str2 = ((ihm1) this.d).a;
                this.b = true;
                Enum enumB = ghm1Var.b(str2, this);
                return enumB == r14 ? r14 : enumB;
            case 5:
                d9n d9nVar3 = d9n.a;
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                upm1 upm1Var = (upm1) this.c;
                xyc0 xyc0Var = upm1Var.b;
                String str3 = upm1Var.d;
                List list = (List) this.d;
                this.b = true;
                Object objL = xyc0Var.l(str3, list, this, (tv80) null);
                return objL == d9nVar3 ? d9nVar3 : objL;
            case 6:
                vr20 vr20Var = (vr20) this.c;
                d9n d9nVar4 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    kh81 kh81VarB = lym1.b((lym1) this.d, (String) null, (String) null, false, true, 31);
                    this.c = null;
                    this.b = true;
                    if (vr20Var.emit(kh81VarB, this) == d9nVar4) {
                        return d9nVar4;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 7:
                hm5.M(obj);
                ptf1 ptf1Var = (ptf1) this.c;
                tsq tsqVar = (tsq) ptf1Var.c;
                i8h1 i8h1Var = (i8h1) tsqVar.get();
                ksk0 ksk0Var = (ksk0) ptf1Var.b;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("management_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = ksk0Var.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = ksk0Var.d;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                drq0 drq0Var = ((hzm1) this.d).b;
                if (drq0Var.f || drq0Var.g || this.b) {
                    i8h1 i8h1Var2 = (i8h1) tsqVar.get();
                    x6h1 x6h1VarC2 = ksk0Var.c.c();
                    x6h1VarC2.i.add(new a7h1("explore_benefits_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA2;
                    ((xjn) k7h1Var2).b = ksk0Var.b;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var2.e = ksk0Var.d;
                    i8h1Var2.f(k7h1Var2.a(), (Set) null);
                }
                return rih1.a;
            case 8:
                vr20 vr20Var2 = (vr20) this.c;
                d9n d9nVar5 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    BadgingState badgingState = (BadgingState) ((j0n1) this.d).b.h();
                    if (badgingState == null) {
                        badgingState = BadgingState.HIDE_BADGE;
                    }
                    this.c = null;
                    this.b = true;
                    if (vr20Var2.emit(badgingState, this) == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 9:
                ij81 ij81Var = ij81.d;
                oao1 oao1Var = (oao1) this.d;
                d9n d9nVar6 = d9n.a;
                if (this.b) {
                    p811Var = (p811) this.c;
                    try {
                        hm5.M(obj);
                        return rih1.a;
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        ayhVar = oao1Var.f;
                        if (ayhVar == null) {
                            ayhVar = null;
                        }
                        th = (Throwable) p811Var.a;
                        if (th == null) {
                            th = exc;
                        }
                        ayhVar.y0(th);
                        oao1Var.b = e2x0.a1;
                        tgo1 tgo1Var = tgo1.c;
                        th2 = (Throwable) p811Var.a;
                        if (th2 == null) {
                            th2 = exc;
                        }
                        if (th2 instanceof StandardIntegrityException) {
                            errorCode = ((StandardIntegrityException) th2).getErrorCode();
                            if (errorCode != -100) {
                                ij81Var = ij81.H1;
                            } else if (errorCode != -12) {
                                ij81Var = ij81.A1;
                            } else if (errorCode != -3) {
                                ij81Var = ij81.u1;
                            } else if (errorCode != -2) {
                                ij81Var = ij81.t1;
                            } else if (errorCode != -1) {
                                switch (errorCode) {
                                    case -19:
                                        ij81Var = ij81.G1;
                                        break;
                                    case -18:
                                        ij81Var = ij81.F1;
                                        break;
                                    case -17:
                                        ij81Var = ij81.E1;
                                        break;
                                    case -16:
                                        ij81Var = ij81.D1;
                                        break;
                                    case -15:
                                        ij81Var = ij81.C1;
                                        break;
                                    case -14:
                                        ij81Var = ij81.B1;
                                        break;
                                    default:
                                        switch (errorCode) {
                                            case -9:
                                                ij81Var = ij81.z1;
                                                break;
                                            case -8:
                                                ij81Var = ij81.y1;
                                                break;
                                            case -7:
                                                ij81Var = ij81.x1;
                                                break;
                                            case -6:
                                                ij81Var = ij81.w1;
                                                break;
                                            case -5:
                                                ij81Var = ij81.v1;
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                ij81Var = ij81.s1;
                            }
                        }
                        throw new zzhm(tgo1Var, ij81Var, exc.getMessage(), (Exception) null);
                    }
                }
                p811 p811VarU = cy30.u(obj);
                try {
                    b9o1 b9o1Var = new b9o1(oao1Var, p811VarU, (lnm) null);
                    this.c = p811VarU;
                    this.b = true;
                    if (rc2.M(60000L, b9o1Var, this) == d9nVar6) {
                        return d9nVar6;
                    }
                    return rih1.a;
                } catch (Exception e2) {
                    e = e2;
                    p811Var = p811VarU;
                    exc = e;
                    ayhVar = oao1Var.f;
                    if (ayhVar == null) {
                        ayhVar = null;
                    }
                    th = (Throwable) p811Var.a;
                    if (th == null) {
                        th = exc;
                    }
                    ayhVar.y0(th);
                    oao1Var.b = e2x0.a1;
                    tgo1 tgo1Var2 = tgo1.c;
                    th2 = (Throwable) p811Var.a;
                    if (th2 == null) {
                        th2 = exc;
                    }
                    if (th2 instanceof StandardIntegrityException) {
                        errorCode = ((StandardIntegrityException) th2).getErrorCode();
                        if (errorCode != -100) {
                            ij81Var = ij81.H1;
                        } else if (errorCode != -12) {
                            ij81Var = ij81.A1;
                        } else if (errorCode != -3) {
                            ij81Var = ij81.u1;
                        } else if (errorCode != -2) {
                            ij81Var = ij81.t1;
                        } else if (errorCode != -1) {
                            switch (errorCode) {
                                case -19:
                                    ij81Var = ij81.G1;
                                    break;
                                case -18:
                                    ij81Var = ij81.F1;
                                    break;
                                case -17:
                                    ij81Var = ij81.E1;
                                    break;
                                case -16:
                                    ij81Var = ij81.D1;
                                    break;
                                case -15:
                                    ij81Var = ij81.C1;
                                    break;
                                case -14:
                                    ij81Var = ij81.B1;
                                    break;
                                default:
                                    switch (errorCode) {
                                        case -9:
                                            ij81Var = ij81.z1;
                                            break;
                                        case -8:
                                            ij81Var = ij81.y1;
                                            break;
                                        case -7:
                                            ij81Var = ij81.x1;
                                            break;
                                        case -6:
                                            ij81Var = ij81.w1;
                                            break;
                                        case -5:
                                            ij81Var = ij81.v1;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            ij81Var = ij81.s1;
                        }
                    }
                    throw new zzhm(tgo1Var2, ij81Var, exc.getMessage(), (Exception) null);
                }
            case 10:
                cnn1 cnn1Var = d9n.a;
                boolean z7 = this.b;
                hm5.M(obj);
                if (z7) {
                    cnn1Var = (cnn1) obj;
                    if (cnn1Var.x().w()) {
                        throw new zzhm(tgo1.c, ij81.I1, (String) null, (Exception) null);
                    }
                } else {
                    ieo1 ieo1Var = (ieo1) this.c;
                    utw0 utw0Var = ieo1Var.n;
                    String str4 = (String) ieo1Var.d.b;
                    ann1 ann1Var = (ann1) this.d;
                    this.b = true;
                    obj = utw0Var.C(str4, ann1Var, this);
                    if (obj != cnn1Var) {
                        cnn1Var = (cnn1) obj;
                        if (cnn1Var.x().w()) {
                            throw new zzhm(tgo1.c, ij81.I1, (String) null, (Exception) null);
                        }
                    }
                }
                return cnn1Var;
            default:
                d9n d9nVar7 = d9n.a;
                try {
                    if (this.b) {
                        hm5.M(obj);
                    } else {
                        hm5.M(obj);
                        rvo1 rvo1Var = (rvo1) this.c;
                        h2x0 h2x0Var = h2x0.Z0;
                        vfo1 vfo1Var = (vfo1) this.d;
                        zgl1 zgl1Var = new zgl1(1, vfo1Var, vfo1.class, "isRetriable", "isRetriable(Ljava/lang/Exception;)Z", 0, (byte) 12);
                        ob01 ob01Var = new ob01(rvo1Var, vfo1Var, (lnm) null, (byte) 26);
                        this.b = true;
                        obj = h2x0Var.d(zgl1Var, 100L, 10000L, 2.0d, ob01Var, this);
                        if (obj == d9nVar7) {
                            return d9nVar7;
                        }
                    }
                    return (String) obj;
                } catch (Exception e3) {
                    if (e3 instanceof zzhm) {
                        throw e3;
                    }
                    throw new zzhm(tgo1.c, ij81.P1, e3.getMessage(), e3);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8m1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8m1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8m1(boolean z, c8m1 c8m1Var, View view, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.b = z;
        this.c = c8m1Var;
        this.d = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8m1(boolean z, l8m1 l8m1Var, c8m1 c8m1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.b = z;
        this.d = l8m1Var;
        this.c = c8m1Var;
    }
}
