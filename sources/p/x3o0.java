package p;

import android.content.Context;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import j$.time.LocalDate;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x3o0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3o0(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        rjt0 vjt0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                o3o0 o3o0Var = (o3o0) obj5;
                int iOrdinal = ((t3o0) obj3).ordinal();
                if (iOrdinal == 0) {
                    return o3o0Var.c.d.distinctUntilChanged().first(Boolean.FALSE).ignoreElement().g(new w3o0(o3o0Var, (byte) 0));
                }
                if (iOrdinal == 1) {
                    return new CompletableFromAction(new w3o0(o3o0Var, (byte) 1));
                }
                eg.o();
                return null;
            case 1:
                s880 s880Var = (s880) ((rt01) obj5).c;
                Completable completableFlatMapCompletable = ((FlowableRefCount) s880Var.a).z().flatMapCompletable(new zud0(s880Var, (byte) 19));
                completableFlatMapCompletable.getClass();
                return completableFlatMapCompletable.o(Functions.h);
            case 2:
                rfo0 rfo0Var = (rfo0) obj5;
                fn31.T(smo1.e(flo1.l(op71.f(), rfo0Var.f)), (o8n) null, 0, new tv1(rfo0Var, ((Number) obj3).intValue(), (km61) obj, (Integer) obj2, (tv80) obj4, (lnm) null), 3);
                return Boolean.FALSE;
            case 3:
                eko1.k((pro0) obj, (iu30) obj2, ((iqo0) obj5).c, (qim0) null, (b0k) obj3, ((Number) obj4).intValue() & 126);
                return rih1Var;
            case 4:
                return new b14((Context) obj2, (ViewGroup) obj3, (bs0) obj5);
            case 5:
                why whyVar = (why) obj;
                return new etl0(new qtl0(Integer.valueOf(((Number) obj3).intValue()), ((n6r0) ((ruc0) obj5).b).path(), whyVar.a, (r6h1) obj4), 2, whyVar.c);
            case 6:
                t710 t710Var = (t710) obj;
                qtl0 qtl0Var = new qtl0(Integer.valueOf(((Number) obj3).intValue()), ((n6r0) ((hod0) obj5).b).path(), t710Var.a, (r6h1) obj4);
                String str = t710Var.f;
                if (str == null) {
                    str = "spotify:unknown";
                }
                return new dtl0(new etl0(qtl0Var, 3, str));
            case 7:
                return new ftl0(new qtl0(Integer.valueOf(((Number) obj3).intValue()), ((n6r0) ((d4e0) obj5).b).path(), ((t710) obj).a, (r6h1) obj4));
            case 8:
                ((Number) obj3).intValue();
                return new qpl0(new rpl0((yxk0) ((dx0) obj5).d), Integer.valueOf(((nnp0) obj).a));
            case 9:
                return new as0((Context) obj2, (ViewGroup) obj3, (iu30) obj4, (op20) obj5);
            case 10:
                ((Number) obj3).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new iuk0(yon1.n0().c, ((lik1) ((umf0) obj5).d).a);
            case 11:
                return (isw) new cnp0((rok0) obj5, (byte) 20).invoke((iu30) obj4);
            case 12:
                ((Number) obj3).intValue();
                return new vpl0(new tdl0((byte) 24), (String) ((ug3) obj5).c);
            case 13:
                ((Number) obj3).intValue();
                return (fyk0) ((ynb0) ((ahi0) obj5).S0).get();
            case 14:
                rhm0 rhm0Var = (rhm0) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                urr0 urr0Var = (urr0) obj5;
                m4c m4cVar = fkj0.X;
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (x340Var.g(rhm0Var) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    rhm0Var.getClass();
                    Calendar calendarD = urr0Var.a.d();
                    int i6 = rhm0Var.c;
                    Calendar calendar = (Calendar) calendarD.clone();
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    Calendar calendar2 = (Calendar) calendar.clone();
                    calendar2.add(1, -i6);
                    calendar2.add(5, 1);
                    r6r r6rVar = new r6r(LocalDate.of(calendar2.get(1), calendar2.get(2) + 1, calendar2.get(5)), calendar2.getTimeInMillis(), calendar.getTimeInMillis());
                    rrr0 rrr0Var = urr0Var.f;
                    boolean zI = x340Var2.i(rrr0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new t0r0(0, rrr0Var, rrr0.class, "logBirthdayInputOpened", "logBirthdayInputOpened()V", 0, (byte) 17);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (nla0) objT;
                    boolean zI2 = x340Var2.i(urr0Var);
                    Object objT2 = x340Var2.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new wvq0(urr0Var, (byte) 22);
                        x340Var2.s0(objT2);
                    }
                    iu30 iu30Var2 = (iu30) objT2;
                    int i7 = i & 112;
                    boolean z2 = i7 == 32;
                    Object objT3 = x340Var2.T();
                    if (z2 || objT3 == m4cVar) {
                        objT3 = new dgq0(iu30Var, (byte) 20);
                        x340Var2.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean z3 = i7 == 32;
                    Object objT4 = x340Var2.T();
                    if (z3 || objT4 == m4cVar) {
                        objT4 = new dgq0(iu30Var, (byte) 21);
                        x340Var2.s0(objT4);
                    }
                    Function0 function2 = (Function0) objT4;
                    boolean z4 = i7 == 32;
                    Object objT5 = x340Var2.T();
                    if (z4 || objT5 == m4cVar) {
                        objT5 = new wck0(iu30Var, (byte) 27);
                        x340Var2.s0(objT5);
                    }
                    oho1.o(rhm0Var, iu30Var2, r6rVar, function1, function2, (iu30) objT5, function0, (qim0) null, x340Var2, 512);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 15:
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                wtr0 wtr0Var = (wtr0) obj5;
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= x340Var3.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    eio1.j(wtr0Var.a.f(bl.b), wtr0Var.b.b, wtr0Var.c, iu30Var3, x340Var4, (iIntValue2 << 6) & 7168);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 16:
                uhm0 uhm0Var = (uhm0) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var5 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    i2 = (x340Var5.g(uhm0Var) ? 4 : 2) | iIntValue3;
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i2 |= x340Var5.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i2 & 1, (i2 & 147) != 146)) {
                    znb1 znb1Var = uhm0Var.a;
                    if (u890.j(znb1Var, ylb1.a)) {
                        x340Var6.i0(1233347059);
                        x340Var6.r(false);
                    } else if (u890.j(znb1Var, plb1.a)) {
                        x340Var6.i0(1233464022);
                        qp5 qp5Var = ((our0) obj5).b;
                        z = (i2 & 112) == 32;
                        Object objT6 = x340Var6.T();
                        if (z || objT6 == fkj0.X) {
                            objT6 = new dgq0(iu30Var4, (byte) 24);
                            x340Var6.s0(objT6);
                        }
                        d1o1.a(qp5Var, (Function0) objT6, x340Var6, 0);
                        x340Var6.r(false);
                    } else if (u890.j(znb1Var, smb1.a)) {
                        x340Var6.i0(1233608544);
                        fho1.e(iu30Var4, x340Var6, (i2 >> 3) & 14);
                        x340Var6.r(false);
                    } else if (znb1Var instanceof cnb1) {
                        x340Var6.i0(1233709635);
                        dio1.h(uhm0Var.a.a, iu30Var4, x340Var6, i2 & 112);
                        x340Var6.r(false);
                    } else if (u890.j(znb1Var, ulb1.a)) {
                        x340Var6.i0(-2038408856);
                        qxd0.m(iu30Var4, x340Var6, (i2 >> 3) & 14);
                        x340Var6.r(false);
                    } else {
                        if (!u890.j(znb1Var, vmb1.a)) {
                            throw p3d1.k(x340Var6, -2038425673, false);
                        }
                        x340Var6.i0(-2038406587);
                        vgo1.h(iu30Var4, x340Var6, (i2 >> 3) & 14);
                        x340Var6.r(false);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj3).intValue();
                return new l8l0(((md1) obj5).c);
            case 18:
                ((Number) obj3).intValue();
                return (sbl0) ((r8s) obj5).t;
            case 19:
                ((Number) obj3).intValue();
                return new kbl0((lbl0) obj5);
            case 20:
                ((Number) obj3).intValue();
                return new b6m0((l6m0) ((pt) obj5).t);
            case 21:
                ((Number) obj3).intValue();
                grk0 grk0Var = (grk0) ((Function0) ((smp0) obj5).c).invoke();
                grk0Var.getClass();
                return new crk0(grk0Var);
            case 22:
                ((Number) obj3).intValue();
                grk0 grk0Var2 = (grk0) ((Function0) ((kls0) obj5).b).invoke();
                grk0Var2.getClass();
                return new frk0(grk0Var2);
            case 23:
                b1t0 b1t0Var = (b1t0) obj;
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var7 = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                d1t0 d1t0Var = (d1t0) obj5;
                if ((iIntValue4 & 6) == 0) {
                    i3 = iIntValue4 | ((iIntValue4 & 8) == 0 ? x340Var7.g(b1t0Var) : x340Var7.i(b1t0Var) ? 4 : 2);
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i3 |= x340Var7.i(iu30Var5) ? 32 : 16;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i3 & 1, (i3 & 147) != 146)) {
                    b1t0Var.getClass();
                    mzs0.b(b1t0Var, iu30Var5, (ae30) d1t0Var.c.get(), d1t0Var.d, x340Var8, i3 & 112);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 24:
                k8t0 k8t0Var = (k8t0) obj;
                iu30 iu30Var6 = (iu30) obj2;
                x340 x340Var9 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i4 = iIntValue5 | (x340Var9.g(k8t0Var) ? 4 : 2);
                } else {
                    i4 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i4 |= x340Var9.i(iu30Var6) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i4 & 1, (i4 & 147) != 146)) {
                    k8t0Var.getClass();
                    yxo1.g(k8t0Var, iu30Var6, ((n8t0) obj5).d, (qim0) null, x340Var10, i4 & 112);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 25:
                lbt0 lbt0Var = (lbt0) obj;
                iu30 iu30Var7 = (iu30) obj2;
                x340 x340Var11 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i5 = iIntValue6 | (x340Var11.g(lbt0Var) ? 4 : 2);
                } else {
                    i5 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i5 |= x340Var11.i(iu30Var7) ? 32 : 16;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i5 & 1, (i5 & 147) != 146)) {
                    lbt0Var.getClass();
                    nbt0 nbt0Var = (nbt0) obj5;
                    gyo1.z(lbt0Var, iu30Var7, nbt0Var.f, nbt0Var.d, (qim0) null, x340Var12, i5 & 112);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj3).intValue();
                return new erk0(((wet0) obj5).a);
            case 27:
                jjm0 jjm0Var = (jjm0) obj;
                xjt0 xjt0Var = (xjt0) obj2;
                int iIntValue7 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var13 = (b0k) obj3;
                x340Var13.i0(1777468466);
                String str2 = xjt0Var.a;
                boolean zG = x340Var13.g(str2) | x340Var13.h(false);
                ckt0 ckt0Var = (ckt0) obj5;
                Object objT7 = x340Var13.T();
                if (zG || objT7 == m4cVar2) {
                    objT7 = d3p1.H(ckt0Var.g, ckt0Var.N0, xjt0Var);
                    x340Var13.s0(objT7);
                }
                ven0 ven0VarH = rwq.h((zob1) objT7, x340Var13, 0);
                ven0 ven0VarG = rwq.g(ckt0Var.t.d(str2), t440.a, (o8n) null, x340Var13, 0, 2);
                ven0 ven0VarG2 = rwq.g(ckt0Var.X.a(str2), utt0.a, (o8n) null, x340Var13, 0, 2);
                z = (((wtt0) ven0VarG2.getValue()) instanceof vtt0) && ((wtt0) ven0VarG2.getValue()).a == ttt0.a;
                s440 s440Var = (x440) ven0VarG.getValue();
                if (s440Var instanceof p440) {
                    vjt0Var = rjt0.a;
                } else if (z) {
                    vjt0Var = sjt0.a;
                } else if (s440Var instanceof s440) {
                    vjt0Var = new vjt0(s440Var.a);
                } else {
                    vjt0Var = ((s440Var instanceof r440) || (s440Var instanceof w440) || (s440Var instanceof q440)) ? tjt0.a : ujt0.a;
                }
                boolean zI3 = x340Var13.i(ckt0Var) | x340Var13.i(xjt0Var);
                Object objT8 = x340Var13.T();
                if (zI3 || objT8 == m4cVar2) {
                    objT8 = new cz40(ckt0Var, xjt0Var, (lnm) null, (byte) 3);
                    x340Var13.s0(objT8);
                }
                jjm0Var.a((zu30) objT8, x340Var13, (iIntValue7 << 3) & 112);
                String str3 = xjt0Var.e;
                yjt0 yjt0Var = new yjt0(str3, vjt0Var, null);
                x340Var13.r(false);
                return yjt0Var;
            case 28:
                kqt0 kqt0Var = (kqt0) obj;
                ((Number) obj3).intValue();
                return new svk0(new sqk0(new uvk0(((mqt0) obj5).f), kqt0Var.c), kqt0Var.b);
            default:
                return new i34((Context) obj2, (bxt0) obj5);
        }
    }
}
