package p;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pah0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pah0(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        bin0 bin0Var = (bin0) obj;
        int iIntValue = ((Number) obj4).intValue();
        bin0Var.getClass();
        x340 x340Var = (b0k) obj3;
        t3k1.b(bin0Var, (iu30) obj2, ((din0) this.b).d, cwl1.C(((cir0) x340Var.k(k2r0.a)).g()), x340Var, iIntValue & 112);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        Completable completableIgnoreElement;
        res resVar = (res) this.b;
        int iOrdinal = ((d1o0) obj3).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new CompletableFromAction(new g1o0(resVar, (byte) 1));
            }
            eg.o();
            return null;
        }
        n1o0 n1o0VarA = ((o1o0) resVar.d).a();
        if (n1o0VarA != null && (completableIgnoreElement = n1o0VarA.a().ignoreElement()) != null) {
            return completableIgnoreElement.o(Functions.h).g(new g1o0(resVar, (byte) 0));
        }
        final Function0 function0 = (Function0) resVar.f;
        final byte b = 3;
        return new CompletableFromAction(new Action() { // from class: p.kur
            public final /* synthetic */ void run() {
                byte b2 = b;
                Function0 function1 = function0;
                switch (b2) {
                    case 0:
                        function1.invoke();
                        break;
                    case 1:
                        function1.invoke();
                        break;
                    case 2:
                        function1.invoke();
                        break;
                    case 3:
                        function1.invoke();
                        break;
                    default:
                        function1.invoke();
                        break;
                }
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        b0k b0kVar;
        iu30 iu30Var;
        boolean z;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        int i3;
        int i4;
        int i5;
        long j;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z2 = true;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                mah0 mah0Var = (mah0) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                qah0 qah0Var = (qah0) obj5;
                bw20 bw20Var = qah0Var.e;
                if ((iIntValue & 6) == 0) {
                    i = iIntValue | (x340Var.g(mah0Var) ? 4 : 2);
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    boolean zG = x340Var2.g(bw20Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = bw20Var.c("audio-preview-url-template", "");
                        x340Var2.s0(objT);
                    }
                    y4o1.g(mah0Var, iu30Var2, qah0Var.d, (String) f4p1.j((mr20) objT, "", (iac0) null, x340Var2, 48, 14).getValue(), (qim0) null, x340Var2, i & 126);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                return new drk0(((odh0) obj5).a);
            case 2:
                ((Number) obj3).intValue();
                return new vvk0(new jpk0((bqk0) ((ng20) obj5).b), Integer.valueOf(((doh0) obj).b));
            case 3:
                ((Number) obj3).intValue();
                m4l0 m4l0Var = new m4l0(nik1.g3.a, (r6h1) obj4);
                ((pt) obj5).i = m4l0Var;
                return m4l0Var;
            case 4:
                w7i0 w7i0Var = (w7i0) obj;
                ((Number) obj3).intValue();
                hyl0 hyl0Var = ((f8i0) obj5).d;
                hyl0Var.getClass();
                x6h1 x6h1VarC = hyl0Var.b.c();
                x6h1VarC.i.add(new a7h1("share_cards_carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String strA = w7i0Var.a.a();
                Integer numValueOf = Integer.valueOf(w7i0Var.b);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("share_card", strA, numValueOf, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = hyl0Var.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1VarA2);
                return new myl0(new opl0(new r6h1(arrayList, r6h1Var2.b), (byte) 21));
            case 5:
                fli0 fli0Var = (fli0) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ili0 ili0Var = (ili0) obj5;
                lzn0 lzn0Var = ili0Var.e;
                if ((iIntValue2 & 6) == 0) {
                    i2 = iIntValue2 | (x340Var3.g(fli0Var) ? 4 : 2);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= x340Var3.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(i2 & 1, (i2 & 147) != 146)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                fli0Var.getClass();
                af10 af10Var = ili0Var.d;
                oh4 oh4Var = ili0Var.i.b;
                hwa0 hwa0Var = ili0Var.f;
                boolean zI = oh4Var.i();
                boolean zC = oh4Var.c();
                boolean zJ = oh4Var.J();
                zhh1 zhh1Var = ili0Var.k;
                Activity activity = ili0Var.l;
                boolean z3 = ili0Var.j;
                Object obj6 = fkj0.X;
                cx cxVar = fli0Var.e;
                x340Var4.i0(1237321577);
                if (cxVar instanceof cx) {
                    x340Var4.i0(1638365615);
                    cx cxVar2 = cxVar;
                    Object objT2 = x340Var4.T();
                    if (objT2 == obj6) {
                        objT2 = new es00(new n601(iu30Var3, (byte) 25));
                        x340Var4.s0(objT2);
                    }
                    es00 es00Var = (es00) objT2;
                    Object objT3 = x340Var4.T();
                    if (objT3 == obj6) {
                        objT3 = new ob9(af10Var);
                        x340Var4.s0(objT3);
                    }
                    ob9 ob9Var = (ob9) objT3;
                    Object objT4 = x340Var4.T();
                    if (objT4 == obj6) {
                        objT4 = new dh51();
                        x340Var4.s0(objT4);
                    }
                    dh51 dh51Var = (dh51) objT4;
                    Object objT5 = x340Var4.T();
                    if (objT5 == obj6) {
                        objT5 = new fkn0(lzn0Var);
                        x340Var4.s0(objT5);
                    }
                    fkn0 fkn0Var = (fkn0) objT5;
                    Object objT6 = x340Var4.T();
                    if (objT6 == obj6) {
                        objT6 = new hx();
                        x340Var4.s0(objT6);
                    }
                    hx hxVar = (hx) objT6;
                    Object objT7 = x340Var4.T();
                    if (objT7 == obj6) {
                        objT7 = new ff8(zhh1Var, activity);
                        x340Var4.s0(objT7);
                    }
                    ff8 ff8Var = (ff8) objT7;
                    Object objT8 = x340Var4.T();
                    if (objT8 == obj6) {
                        objT8 = new xkg1(hwa0Var);
                        x340Var4.s0(objT8);
                    }
                    xkg1 xkg1Var = (xkg1) objT8;
                    Object objT9 = x340Var4.T();
                    if (objT9 == obj6) {
                        objT9 = new r9g(lzn0Var);
                        x340Var4.s0(objT9);
                    }
                    r9g r9gVar = (r9g) objT9;
                    Object objT10 = x340Var4.T();
                    if (objT10 == obj6) {
                        objT10 = new fw3();
                        x340Var4.s0(objT10);
                    }
                    fw3 fw3Var = (fw3) objT10;
                    iu30 iu30VarM = t6p1.m(lzn0Var, fli0Var, 2, cxVar2.b, x340Var4, 384);
                    boolean zG2 = x340Var4.g(fli0Var) | x340Var4.g(cxVar2) | x340Var4.h(zJ) | x340Var4.h(zC) | x340Var4.h(zI) | x340Var4.g(iu30VarM);
                    Object objT11 = x340Var4.T();
                    if (zG2 || objT11 == obj6) {
                        objT11 = new j161(cxVar2, zJ, zC, zI, iu30VarM, fli0Var, ob9Var, dh51Var, es00Var, r9gVar, fkn0Var, hxVar, fw3Var, ff8Var, xkg1Var);
                        x340Var4.s0(objT11);
                    }
                    iu30Var = (iu30) objT11;
                    z = false;
                    x340Var4.r(false);
                    x340Var4.r(false);
                    b0kVar = x340Var4;
                } else {
                    rih1Var = rih1Var;
                    if (cxVar instanceof ax) {
                        x340Var4.i0(1638977958);
                        Object objT12 = x340Var4.T();
                        if (objT12 == obj6) {
                            objT12 = new ob9(af10Var);
                            x340Var4.s0(objT12);
                        }
                        ob9 ob9Var2 = (ob9) objT12;
                        Object objT13 = x340Var4.T();
                        if (objT13 == obj6) {
                            objT13 = new dh51();
                            x340Var4.s0(objT13);
                        }
                        dh51 dh51Var2 = (dh51) objT13;
                        Object objT14 = x340Var4.T();
                        if (objT14 == obj6) {
                            objT14 = new fkn0(lzn0Var);
                            x340Var4.s0(objT14);
                        }
                        fkn0 fkn0Var2 = (fkn0) objT14;
                        Object objT15 = x340Var4.T();
                        if (objT15 == obj6) {
                            objT15 = new hx();
                            x340Var4.s0(objT15);
                        }
                        hx hxVar2 = (hx) objT15;
                        iu30 iu30VarM2 = t6p1.m(lzn0Var, fli0Var, 3, false, x340Var4, 3456);
                        boolean zG3 = x340Var4.g(fli0Var) | x340Var4.g(iu30VarM2);
                        Object objT16 = x340Var4.T();
                        if (zG3 || objT16 == obj6) {
                            j96 j96Var = new j96(iu30VarM2, fli0Var, ob9Var2, dh51Var2, fkn0Var2, hxVar2, (byte) 17);
                            fli0Var = fli0Var;
                            x340Var4.s0(j96Var);
                            objT16 = j96Var;
                        }
                        iu30Var = (iu30) objT16;
                        z = false;
                        x340Var4.r(false);
                        x340Var4.r(false);
                        lzn0Var = lzn0Var;
                        b0kVar = x340Var4;
                    } else {
                        if (!(cxVar instanceof bx)) {
                            throw p3d1.k(x340Var4, -639887725, false);
                        }
                        x340Var4.i0(1639167368);
                        bx bxVar = (bx) cxVar;
                        Object objT17 = x340Var4.T();
                        if (objT17 == obj6) {
                            objT17 = new ba50(lzn0Var);
                            x340Var4.s0(objT17);
                        }
                        ba50 ba50Var = (ba50) objT17;
                        boolean zG4 = x340Var4.g(lzn0Var) | x340Var4.h(z3);
                        Object objT18 = x340Var4.T();
                        if (zG4 || objT18 == obj6) {
                            objT18 = new f2f0(lzn0Var, z3);
                            x340Var4.s0(objT18);
                        }
                        f2f0 f2f0Var = (f2f0) objT18;
                        Object objT19 = x340Var4.T();
                        if (objT19 == obj6) {
                            objT19 = new dh51();
                            x340Var4.s0(objT19);
                        }
                        dh51 dh51Var3 = (dh51) objT19;
                        Object objT20 = x340Var4.T();
                        if (objT20 == obj6) {
                            objT20 = new es00(new yjf0(iu30Var3, (byte) 11));
                            x340Var4.s0(objT20);
                        }
                        es00 es00Var2 = (es00) objT20;
                        Object objT21 = x340Var4.T();
                        if (objT21 == obj6) {
                            objT21 = new sij1(new yjf0(iu30Var3, (byte) 12));
                            x340Var4.s0(objT21);
                        }
                        sij1 sij1Var = (sij1) objT21;
                        Object objT22 = x340Var4.T();
                        if (objT22 == obj6) {
                            objT22 = new h7l(new yjf0(iu30Var3, (byte) 10));
                            x340Var4.s0(objT22);
                        }
                        h7l h7lVar = (h7l) objT22;
                        Object objT23 = x340Var4.T();
                        if (objT23 == obj6) {
                            objT23 = new ob9(af10Var);
                            x340Var4.s0(objT23);
                        }
                        ob9 ob9Var3 = (ob9) objT23;
                        Object objT24 = x340Var4.T();
                        if (objT24 == obj6) {
                            objT24 = new fkn0(lzn0Var);
                            x340Var4.s0(objT24);
                        }
                        fkn0 fkn0Var3 = (fkn0) objT24;
                        Object objT25 = x340Var4.T();
                        if (objT25 == obj6) {
                            objT25 = new mwa(lzn0Var, Locale.getDefault());
                            x340Var4.s0(objT25);
                        }
                        mwa mwaVar = (mwa) objT25;
                        Object objT26 = x340Var4.T();
                        if (objT26 == obj6) {
                            objT26 = new hx();
                            x340Var4.s0(objT26);
                        }
                        hx hxVar3 = (hx) objT26;
                        lzn0Var = lzn0Var;
                        b0kVar = x340Var4;
                        iu30 iu30VarM3 = t6p1.m(lzn0Var, fli0Var, 1, false, b0kVar, 3456);
                        Object objT27 = b0kVar.T();
                        if (objT27 == obj6) {
                            objT27 = new nyr0(lzn0Var);
                            b0kVar.s0(objT27);
                        }
                        nyr0 nyr0Var = (nyr0) objT27;
                        boolean zG5 = b0kVar.g(fli0Var) | b0kVar.i(bxVar) | b0kVar.g(f2f0Var) | b0kVar.g(iu30VarM3);
                        Object objT28 = b0kVar.T();
                        if (zG5 || objT28 == obj6) {
                            objT28 = new n9g0(bxVar, iu30VarM3, fli0Var, ba50Var, ob9Var3, f2f0Var, dh51Var3, h7lVar, es00Var2, nyr0Var, sij1Var, fkn0Var3, mwaVar, hxVar3);
                            b0kVar.s0(objT28);
                        }
                        iu30Var = (iu30) objT28;
                        z = false;
                        b0kVar.r(false);
                        b0kVar.r(false);
                    }
                }
                zso1.q(iu30Var, fli0Var.f == 1 ? true : z, fli0Var, lzn0Var, b0kVar, 0);
                return rih1Var;
            case 6:
                fpi0 fpi0Var = (fpi0) obj;
                int iIntValue3 = ((Number) obj4).intValue();
                fpi0Var.getClass();
                oto1.d(fpi0Var, ((hpi0) obj5).e, (iu30) obj2, (b0k) obj3, ((iIntValue3 << 3) & 896) | 3072);
                return rih1Var;
            case 7:
                rui0 rui0Var = (rui0) obj5;
                return new as0((Context) obj2, new ne(3, new qui0(rui0Var, (byte) 2)), rui0Var);
            case 8:
                ((Number) obj3).intValue();
                return new tnl0(f2p1.u(((maj0) obj5).a == 2 ? 15 : 4), (r6h1) obj4);
            case 9:
                int iIntValue4 = ((Number) obj4).intValue();
                x340 x340Var5 = (b0k) obj3;
                x340Var5.i0(-1162797999);
                rwj rwjVar = (rwj) obj5;
                xnj0 xnj0VarM = dzo1.m((w6e0) rwjVar.f, obj2, (tlj0) rwjVar.g, x340Var5, iIntValue4 & 112);
                x340Var5.r(false);
                return xnj0VarM;
            case 10:
                lmj0 lmj0Var = (lmj0) obj5;
                return new b14((Context) obj2, lmj0Var, lmj0Var.f.d());
            case 11:
                return new wc3((Context) obj2, (dx0) obj5, (byte) 0);
            case 12:
                return new p9c((Context) obj2, (ViewGroup) obj3, (bs0) obj5);
            case 13:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                ((exj0) obj5).Y = r6h1Var3;
                return new bml0(new fjl0(r6h1Var3, (byte) 5));
            case 14:
                tnl0 tnl0Var = (tnl0) obj;
                cbk0 cbk0Var = (cbk0) ((et90) obj5).d;
                v3u v3uVar = ((dyj0) obj2).a;
                int iOrdinal = ((cyj0) obj4).ordinal();
                r3u r3uVar = r3u.a;
                p3u p3uVar = p3u.a;
                k3u k3uVar = k3u.a;
                l3u l3uVar = l3u.a;
                b7x b7xVar = b7x.a;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        if (v3uVar.equals(l3uVar)) {
                            r6h1 r6h1VarB = tnl0Var.b();
                            int iU = f2p1.u(3);
                            y6h1 y6h1Var = y6h1.i;
                            x6h1 x6h1VarI = i3o1.i();
                            x6h1VarI.h = "music";
                            x6h1VarI.a = "mobile-playlist-mixing-dialog";
                            x6h1VarI.f = "7.0.0";
                            x6h1VarI.g = "22.0.0";
                            x6h1VarI.b = knl0.c(iU);
                            x6h1 x6h1VarC3 = x6h1VarI.a().c();
                            x6h1VarC3.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1VarB, System.currentTimeMillis());
                        } else if (v3uVar instanceof s3u) {
                            r6h1 r6h1VarB2 = tnl0Var.b();
                            int iU2 = f2p1.u(6);
                            y6h1 y6h1Var2 = y6h1.i;
                            x6h1 x6h1VarI2 = i3o1.i();
                            x6h1VarI2.h = "music";
                            x6h1VarI2.a = "mobile-playlist-mixing-dialog";
                            x6h1VarI2.f = "7.0.0";
                            x6h1VarI2.g = "22.0.0";
                            x6h1VarI2.b = knl0.c(iU2);
                            x6h1 x6h1VarC4 = x6h1VarI2.a().c();
                            x6h1VarC4.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1VarB2, System.currentTimeMillis());
                        } else if (!(v3uVar instanceof m3u) && !v3uVar.equals(k3uVar)) {
                            if (v3uVar.equals(p3uVar)) {
                                r6h1 r6h1VarB3 = tnl0Var.b();
                                int iU3 = f2p1.u(14);
                                y6h1 y6h1Var3 = y6h1.i;
                                x6h1 x6h1VarI3 = i3o1.i();
                                x6h1VarI3.h = "music";
                                x6h1VarI3.a = "mobile-playlist-mixing-dialog";
                                x6h1VarI3.f = "7.0.0";
                                x6h1VarI3.g = "22.0.0";
                                x6h1VarI3.b = knl0.c(iU3);
                                x6h1 x6h1VarC5 = x6h1VarI3.a().c();
                                x6h1VarC5.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC5.j = false;
                                w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC5.a(), r6h1VarB3, System.currentTimeMillis());
                            } else if (!v3uVar.equals(r3uVar)) {
                                eg.o();
                            }
                        }
                        return w7h1Var2;
                    }
                    if (iOrdinal != 2) {
                        eg.o();
                    }
                    return null;
                }
                if (v3uVar.equals(l3uVar)) {
                    r6h1 r6h1VarB4 = tnl0Var.b();
                    int iU4 = f2p1.u(3);
                    y6h1 y6h1Var4 = y6h1.i;
                    x6h1 x6h1VarI4 = i3o1.i();
                    x6h1VarI4.h = "music";
                    x6h1VarI4.a = "mobile-playlist-mixing-dialog";
                    x6h1VarI4.f = "7.0.0";
                    x6h1VarI4.g = "22.0.0";
                    x6h1VarI4.b = knl0.c(iU4);
                    x6h1 x6h1VarC6 = x6h1VarI4.a().c();
                    x6h1VarC6.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC6.a(), r6h1VarB4, System.currentTimeMillis());
                    return w7h1Var2;
                }
                if (v3uVar instanceof s3u) {
                    r6h1 r6h1VarB5 = tnl0Var.b();
                    int iU5 = f2p1.u(6);
                    y6h1 y6h1Var5 = y6h1.i;
                    x6h1 x6h1VarI5 = i3o1.i();
                    x6h1VarI5.h = "music";
                    x6h1VarI5.a = "mobile-playlist-mixing-dialog";
                    x6h1VarI5.f = "7.0.0";
                    x6h1VarI5.g = "22.0.0";
                    x6h1VarI5.b = knl0.c(iU5);
                    x6h1 x6h1VarC7 = x6h1VarI5.a().c();
                    x6h1VarC7.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC7.a(), r6h1VarB5, System.currentTimeMillis());
                } else if (v3uVar instanceof m3u) {
                    r6h1 r6h1VarB6 = tnl0Var.b();
                    int iU6 = f2p1.u(2);
                    y6h1 y6h1Var6 = y6h1.i;
                    x6h1 x6h1VarI6 = i3o1.i();
                    x6h1VarI6.h = "music";
                    x6h1VarI6.a = "mobile-playlist-mixing-dialog";
                    x6h1VarI6.f = "7.0.0";
                    x6h1VarI6.g = "22.0.0";
                    x6h1VarI6.b = knl0.c(iU6);
                    x6h1 x6h1VarC8 = x6h1VarI6.a().c();
                    x6h1VarC8.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC8.a();
                    String str = cbk0Var.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA3, r6h1VarB6, System.currentTimeMillis());
                } else if (v3uVar.equals(k3uVar)) {
                    r6h1 r6h1VarB7 = tnl0Var.b();
                    int iU7 = f2p1.u(16);
                    y6h1 y6h1Var7 = y6h1.i;
                    x6h1 x6h1VarI7 = i3o1.i();
                    x6h1VarI7.h = "music";
                    x6h1VarI7.a = "mobile-playlist-mixing-dialog";
                    x6h1VarI7.f = "7.0.0";
                    x6h1VarI7.g = "22.0.0";
                    x6h1VarI7.b = knl0.c(iU7);
                    x6h1 x6h1VarC9 = x6h1VarI7.a().c();
                    x6h1VarC9.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC9.a();
                    String str2 = cbk0Var.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA4, r6h1VarB7, System.currentTimeMillis());
                } else if (v3uVar.equals(p3uVar)) {
                    r6h1 r6h1VarB8 = tnl0Var.b();
                    int iU8 = f2p1.u(14);
                    y6h1 y6h1Var8 = y6h1.i;
                    x6h1 x6h1VarI8 = i3o1.i();
                    x6h1VarI8.h = "music";
                    x6h1VarI8.a = "mobile-playlist-mixing-dialog";
                    x6h1VarI8.f = "7.0.0";
                    x6h1VarI8.g = "22.0.0";
                    x6h1VarI8.b = knl0.c(iU8);
                    x6h1 x6h1VarC10 = x6h1VarI8.a().c();
                    x6h1VarC10.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1VarB8, System.currentTimeMillis());
                } else {
                    if (!v3uVar.equals(r3uVar)) {
                        eg.o();
                        return null;
                    }
                    r6h1 r6h1VarB9 = tnl0Var.b();
                    int iU9 = f2p1.u(17);
                    y6h1 y6h1Var9 = y6h1.i;
                    x6h1 x6h1VarI9 = i3o1.i();
                    x6h1VarI9.h = "music";
                    x6h1VarI9.a = "mobile-playlist-mixing-dialog";
                    x6h1VarI9.f = "7.0.0";
                    x6h1VarI9.g = "22.0.0";
                    x6h1VarI9.b = knl0.c(iU9);
                    x6h1 x6h1VarC11 = x6h1VarI9.a().c();
                    x6h1VarC11.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC11.a(), r6h1VarB9, System.currentTimeMillis());
                }
                return w7h1Var;
            case 15:
                kak0 kak0Var = (kak0) obj;
                x340 x340Var6 = (b0k) obj3;
                ((Number) obj4).intValue();
                qyj0 qyj0Var = (qyj0) obj5;
                qyj0Var.f = (iu30) obj2;
                qyj0Var.c.a.m((Object) null, Boolean.valueOf(l2p1.m(kak0Var)));
                odm0 odm0Var = kak0Var.e;
                odm0 odm0Var2 = odm0Var instanceof odm0 ? odm0Var : null;
                if (odm0Var2 != null) {
                    x340 x340Var7 = x340Var6;
                    x340Var7.i0(-46067558);
                    boolean zI2 = x340Var7.i(qyj0Var) | x340Var7.i(odm0Var2);
                    Object objT29 = x340Var7.T();
                    if (zI2 || objT29 == fkj0.X) {
                        objT29 = new hyg0(qyj0Var, odm0Var2, (lnm) null, (byte) 10);
                        x340Var7.s0(objT29);
                    }
                    qxd0.t(odm0Var2, x340Var7, (vu30) objT29);
                    x340Var7.r(false);
                } else {
                    x340 x340Var8 = x340Var6;
                    x340Var8.i0(-45645679);
                    x340Var8.r(false);
                }
                irn1.u((qim0) null, r1j.c, (vu30) null, (erl1) null, apo.r(-848929960, new x9g0(qyj0Var, kak0Var, (byte) 26), x340Var6), x340Var6, 24624, 13);
                return rih1Var;
            case 16:
                s5k0 s5k0Var = (s5k0) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var9 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i3 = iIntValue5 | ((iIntValue5 & 8) == 0 ? x340Var9.g(s5k0Var) : x340Var9.i(s5k0Var) ? 4 : 2);
                } else {
                    i3 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i3 |= x340Var9.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(i3 & 1, (i3 & 147) != 146)) {
                    ((r4k0) ((v5k0) obj5).d.get()).d(s5k0Var, iu30Var4, x340Var10, (i3 & 112) | (i3 & 14) | 384);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                c8k0 c8k0Var = (c8k0) obj;
                int iIntValue6 = ((Number) obj3).intValue();
                r6h1 r6h1Var4 = (r6h1) obj4;
                ((t8k0) obj5).N0 = r6h1Var4;
                if (c8k0Var instanceof c8k0) {
                    return new fnl0(Integer.valueOf(iIntValue6), c8k0Var.b.a, r6h1Var4);
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                zgk0 zgk0Var = (zgk0) obj;
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var11 = (b0k) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                if ((iIntValue7 & 6) == 0) {
                    i4 = iIntValue7 | ((iIntValue7 & 8) == 0 ? x340Var11.g(zgk0Var) : x340Var11.i(zgk0Var) ? 4 : 2);
                } else {
                    i4 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i4 |= x340Var11.i(iu30Var5) ? 32 : 16;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i4 & 1, (i4 & 147) != 146)) {
                    ((pek0) ((ghk0) obj5).c.get()).f(zgk0Var, iu30Var5, x340Var12, (i4 & 112) | (i4 & 14) | 384);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj3).intValue();
                return (xjl0) obj5;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj3).intValue();
                return ((res) obj5).r();
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((Number) obj3).intValue();
                l6m0 l6m0Var = (l6m0) ((ng20) obj5).d;
                int i6 = ((pkm0) obj).c;
                int iC = l1d.C(i6);
                if (iC == 0) {
                    i5 = 2;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i5 = 1;
                }
                int iC2 = l1d.C(i6);
                if (iC2 == 0) {
                    return new i6m0(l6m0Var);
                }
                if (iC2 == 1) {
                    return new h6m0(l6m0Var, i5);
                }
                eg.o();
                return null;
            case 22:
                oym0 oym0Var = (pym0) obj3;
                uym0 uym0Var = (uym0) obj5;
                if (oym0Var instanceof oym0) {
                    j = oym0Var.a;
                } else {
                    if (!(oym0Var instanceof nym0)) {
                        eg.o();
                        return null;
                    }
                    j = -((nym0) oym0Var).a;
                }
                return new FlowableSingleSingle(new FlowableTake(uym0Var.a)).map(new n4t(uym0Var, j)).flatMapCompletable(new tym0(uym0Var, (byte) 0));
            case 23:
                jjm0 jjm0Var = (jjm0) obj;
                f2n0 f2n0Var = (f2n0) obj2;
                int iIntValue8 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var13 = (b0k) obj3;
                x340Var13.i0(-1279873833);
                ldo ldoVar = (ldo) obj5;
                FlowableMap flowableMap = (FlowableMap) ldoVar.c;
                vbm[] vbmVarArr = q601.a;
                ven0 ven0VarG = rwq.g(new kge(flowableMap), 0L, (o8n) null, x340Var13, 48, 2);
                boolean zF = x340Var13.f(((Number) ven0VarG.getValue()).longValue());
                Object objT30 = x340Var13.T();
                if (zF || objT30 == m4cVar) {
                    objT30 = yv91.a(new dvg0(f2n0Var, ven0VarG, (byte) 29));
                    x340Var13.s0(objT30);
                }
                tob1 tob1Var = (tob1) objT30;
                if ((((iIntValue8 & 112) ^ 48) <= 32 || !x340Var13.g(f2n0Var)) && (iIntValue8 & 48) != 32) {
                    z2 = false;
                }
                boolean zI3 = x340Var13.i(ldoVar) | z2;
                Object objT31 = x340Var13.T();
                if (zI3 || objT31 == m4cVar) {
                    objT31 = new kw0(f2n0Var, ldoVar, (lnm) null, (byte) 10);
                    x340Var13.s0(objT31);
                }
                jjm0Var.a((zu30) objT31, x340Var13, (iIntValue8 << 3) & 112);
                g2n0 g2n0Var = new g2n0(((Boolean) tob1Var.getValue()).booleanValue(), f2n0Var);
                x340Var13.r(false);
                return g2n0Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj3).intValue();
                r6h1 r6h1Var5 = (r6h1) obj4;
                z8n0 z8n0Var = ((a9n0) obj).a;
                y8n0 y8n0Var = z8n0Var instanceof y8n0 ? (y8n0) z8n0Var : null;
                return new inl0(y8n0Var != null ? Integer.valueOf(y8n0Var.t) : null, y8n0Var != null ? y8n0Var.b : null, new mjl0(new fjl0(r6h1Var5, (byte) 13), ((lik1) ((ng20) obj5).b).a));
            case 25:
                return a(obj, obj2, obj3, obj4);
            case 26:
                ((Number) obj3).intValue();
                return (vbl0) ((et90) obj5).e;
            case 27:
                return d(obj, obj2, obj3, obj4);
            case 28:
                ((Number) obj3).intValue();
                return (h3o0) ((umf0) obj5).d;
            default:
                o3o0 o3o0Var = (o3o0) obj5;
                int iOrdinal2 = ((k3o0) obj3).ordinal();
                if (iOrdinal2 == 0) {
                    return o3o0Var.c.d.distinctUntilChanged().first(Boolean.FALSE).ignoreElement().g(new m3o0(o3o0Var, (byte) 0));
                }
                if (iOrdinal2 == 1) {
                    return new CompletableFromAction(new m3o0(o3o0Var, (byte) 1));
                }
                eg.o();
                return null;
        }
    }
}
