package p;

import android.R;
import android.widget.LinearLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.equalizer.uiusecases.equalizerpicker.EqualizerView;
import com.spotify.home.evopage.mobius.Effect;
import com.spotify.home.evopage.mobius.State;
import com.spotify.home.evopage.mobius.a;
import com.spotify.home.evopage.mobius.e;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pdy extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdy(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:111:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:322:0x09b2  */
    /* JADX WARN: Code duplicated, block: B:323:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:350:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:352:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:354:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:356:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:357:0x0a14  */
    /* JADX WARN: Code duplicated, block: B:358:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:361:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:364:0x0a35 A[LOOP:2: B:362:0x0a2f->B:364:0x0a35, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:367:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:368:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:370:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:373:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:386:0x0aa3  */
    public final Object invoke() {
        int i;
        yly ylyVar;
        dcx dcxVar;
        zxy nhyVar;
        jny jnyVar;
        wxy wxyVar;
        ayy ayyVar;
        zxy z490Var;
        jky jkyVar;
        zxy zxyVar;
        zxy d590Var;
        wiy wiyVar;
        zxy zxyVar2;
        zxy bdyVar;
        int iC;
        svx svxVar;
        mjy mjyVar;
        zxy ecyVar;
        cjy cjyVar;
        ojy ojyVar;
        ArrayList arrayList;
        Iterator it;
        oiy oiyVar;
        zxy zxyVarK;
        lny lnyVar;
        ob51 ob51Var;
        s07 s07Var;
        pno1 pno1Var;
        zly zlyVar;
        vly wlyVar;
        int i2;
        zly zlyVar2;
        zly zlyVar3;
        pno1 pno1Var2;
        w7h1 w7h1Var;
        jdz jdzVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = null;
        jdzVar = null;
        jdz jdzVar2 = null;
        w7h1 w7h1Var2 = null;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(((qdy) obj3).f31p);
            case 1:
                wwy wwyVar = (ywy) obj3;
                for (Object obj4 : wwyVar.Y) {
                    if (!(((x8d1) obj4) instanceof v8d1)) {
                        obj = obj4;
                        x8d1 x8d1Var = (x8d1) obj;
                        return x8d1Var != null ? x8d1Var.a() : wwyVar.f;
                    }
                }
                x8d1 x8d1Var2 = (x8d1) obj;
                if (x8d1Var2 != null) {
                }
            case 2:
                cky ckyVar = (cky) obj3;
                bky bkyVar = ckyVar.h;
                int i3 = ckyVar.m;
                cjy cjyVar2 = ckyVar.n;
                wjy wjyVar = wjy.b;
                aky akyVar = ckyVar.b;
                if (akyVar != null) {
                    sjy sjyVar = akyVar.e;
                    yjy yjyVar = akyVar.d;
                    njy njyVar = akyVar.c;
                    ob51 ob51Var2 = akyVar.b;
                    pjy pjyVar = akyVar.a;
                    i = 2;
                    boolean z = pjyVar instanceof pjy;
                    pno1 pno1Var3 = xz6.d;
                    tjy tjyVar = tjy.c;
                    pno1 pno1Var4 = yz6.d;
                    if (z) {
                        String str = pjyVar.a;
                        if (ob51Var2 instanceof ujy) {
                            pno1Var2 = pno1Var4;
                        } else {
                            if (!ob51Var2.equals(tjyVar)) {
                                eg.o();
                                return null;
                            }
                            pno1Var2 = pno1Var3;
                        }
                        s07Var = new s07(new g07(str, pno1Var2), njyVar != null ? new rk70(njyVar.a, null) : null);
                    } else {
                        if (pjyVar != null) {
                            eg.o();
                            return null;
                        }
                        if (ob51Var2 instanceof ujy) {
                            pno1Var = pno1Var4;
                        } else {
                            if (!ob51Var2.equals(tjyVar)) {
                                eg.o();
                                return null;
                            }
                            pno1Var = pno1Var3;
                        }
                        s07Var = new s07(new g07((String) null, pno1Var), njyVar != null ? new rk70(njyVar.a, null) : null);
                    }
                    if (yjyVar != null) {
                        if (yjyVar instanceof vjy) {
                            vjy vjyVar = (vjy) yjyVar;
                            zlyVar3 = new zly(new yiw0(vjyVar.a, vjyVar.b));
                        } else if (yjyVar.equals(wjy.a)) {
                            zlyVar3 = new zly(ziw0.a);
                        } else {
                            if (yjyVar.equals(xjy.a)) {
                                obj2 = null;
                                zlyVar2 = new zly(new ajw0(null));
                            } else {
                                obj2 = null;
                                if (!yjyVar.equals(wjyVar)) {
                                    eg.o();
                                    return null;
                                }
                                zlyVar2 = new zly(ziw0.b);
                            }
                            zlyVar = zlyVar2;
                        }
                        zlyVar = zlyVar3;
                        obj2 = null;
                    } else {
                        obj2 = null;
                        zlyVar = null;
                    }
                    boolean z2 = (cjyVar2 instanceof bjy) && (yjyVar == null || !(yjyVar instanceof yjy) || yjyVar.equals(wjyVar));
                    if (u890.j(sjyVar, qjy.a)) {
                        wlyVar = vly.a;
                    } else {
                        if (!(sjyVar instanceof rjy)) {
                            eg.o();
                            return obj2;
                        }
                        int iC2 = l1d.C(2);
                        if (iC2 == 0) {
                            i2 = 1;
                        } else {
                            if (iC2 != 1) {
                                eg.o();
                                return obj2;
                            }
                            i2 = 2;
                        }
                        wlyVar = new wly(i2);
                    }
                    ylyVar = new yly(s07Var, zlyVar, z2, wlyVar);
                } else {
                    i = 2;
                    ylyVar = null;
                }
                int iK = (akyVar == null || (ob51Var = akyVar.b) == null) ? 0 : ob51Var.k();
                int i4 = iK == 0 ? -1 : rqh0.a[l1d.C(iK)];
                int i5 = 3;
                if (i4 == -1) {
                    dcxVar = sbx.b;
                } else if (i4 == 1) {
                    dcxVar = ccx.b;
                } else if (i4 != i) {
                    if (i4 != 3) {
                        eg.o();
                        return obj2;
                    }
                    dcxVar = sbx.b;
                } else {
                    dcxVar = zbx.b;
                }
                dcx dcxVar2 = dcxVar;
                fky fkyVar = ckyVar.c;
                if (fkyVar != null) {
                    CharSequence charSequence = fkyVar.a;
                    eky ekyVar = fkyVar.b;
                    if (ekyVar.equals(p9w.b1)) {
                        lnyVar = lny.a;
                    } else if (ekyVar.equals(q9w.c1)) {
                        lnyVar = lny.b;
                    } else {
                        if (!ekyVar.equals(s9w.b1)) {
                            eg.o();
                            return obj2;
                        }
                        lnyVar = lny.c;
                    }
                    nhyVar = null;
                    jnyVar = new jny(charSequence, lnyVar, (kny) null, (kny) null, cjyVar2 instanceof bjy);
                } else {
                    nhyVar = null;
                    jnyVar = null;
                }
                lky lkyVar = ckyVar.a;
                String str2 = lkyVar.a;
                int iC3 = l1d.C(ckyVar.i);
                if (iC3 == 0) {
                    wxyVar = wxy.a;
                } else if (iC3 == 1) {
                    wxyVar = wxy.b;
                } else if (iC3 == 2) {
                    wxyVar = wxy.c;
                } else {
                    if (iC3 != 3) {
                        eg.o();
                        return obj2;
                    }
                    wxyVar = wxy.d;
                }
                yxy yxyVar = new yxy(str2, wxyVar);
                if (lkyVar.b) {
                    ayyVar = ayy.a;
                } else {
                    int iC4 = l1d.C(i3);
                    if (iC4 != 0) {
                        ayy ayyVar2 = ayy.b;
                        if (iC4 != 1 && iC4 != 2) {
                            eg.o();
                            return obj2;
                        }
                        ayyVar = ayyVar2;
                    } else {
                        ayyVar = ayy.c;
                    }
                }
                vxy vxyVar = new vxy(yxyVar, ayyVar, nhyVar, cjyVar2 instanceof bjy);
                zxy a590Var = tyo1.r(ckyVar) ? new a590(tyo1.g(ckyVar, cjyVar2 instanceof bjy)) : nhyVar;
                if (a590Var != null) {
                    z490Var = a590Var;
                } else {
                    kky kkyVar = ckyVar.d;
                    zxy zxyVarF = !tyo1.m(bkyVar) ? w5p1.f(ckyVar) : nhyVar;
                    zxy zxyVar3 = kkyVar != null ? kkyVar.a : nhyVar;
                    if ((zxyVar3 == null || ihc1.y0(zxyVar3)) && zxyVarF == null) {
                        z490Var = nhyVar;
                    } else {
                        zxy zxyVar4 = kkyVar != null ? kkyVar.a : nhyVar;
                        zxy zxyVar5 = kkyVar != null ? kkyVar.b : nhyVar;
                        int iC5 = l1d.C(i3);
                        lxy lxyVar = lxy.b;
                        if (iC5 != 0 && iC5 != 1) {
                            if (iC5 != 2) {
                                eg.o();
                                return obj2;
                            }
                            lxyVar = lxy.a;
                        }
                        lxy lxyVar2 = lxyVar;
                        boolean z3 = cjyVar2 instanceof bjy;
                        kxy jxyVar = hxy.a;
                        if (kkyVar != null && (jkyVar = kkyVar.c) != null && !jkyVar.equals(gky.a)) {
                            if (jkyVar.equals(hky.a)) {
                                jxyVar = ixy.a;
                            } else {
                                if (!(jkyVar instanceof iky)) {
                                    eg.o();
                                    return obj2;
                                }
                                int iC6 = l1d.C(((iky) jkyVar).a);
                                if (iC6 == 0) {
                                    i5 = 1;
                                } else if (iC6 == 1) {
                                    i5 = 2;
                                } else if (iC6 != 2) {
                                    eg.o();
                                    return obj2;
                                }
                                jxyVar = new jxy(i5);
                            }
                        }
                        z490Var = new z490(new gxy(zxyVar4, zxyVar5, lxyVar2, zxyVarF, z3, jxyVar));
                    }
                }
                mky mkyVar = ckyVar.e;
                if (mkyVar instanceof mky) {
                    d590Var = new c590(mkyVar.b);
                } else {
                    if (!(mkyVar instanceof oky)) {
                        if (mkyVar instanceof nky) {
                            nky nkyVar = (nky) mkyVar;
                            oiy oiyVar2 = nkyVar.b;
                            int i6 = nkyVar.d;
                            d590Var = new d590(new ncy(i541.W(oiyVar2, i6), i541.W(nkyVar.c, i6)));
                        } else {
                            if (mkyVar != null) {
                                eg.o();
                                return obj2;
                            }
                            zxyVar = nhyVar;
                        }
                        ziy ziyVar = ckyVar.g;
                        wiyVar = ckyVar.f;
                        if (wiyVar != null) {
                            zxyVar2 = wiyVar.a;
                        } else {
                            zxyVar2 = nhyVar;
                        }
                        if ((zxyVar2 == null && !ihc1.y0(zxyVar2)) || ziyVar != null || (!tyo1.r(ckyVar) && tyo1.m(bkyVar))) {
                            bdyVar = new bdy(wiyVar != null ? wiyVar.a : nhyVar, ziyVar != null ? new ady(ziyVar.a) : nhyVar, (tyo1.r(ckyVar) || !tyo1.m(bkyVar)) ? nhyVar : tyo1.g(ckyVar, cjyVar2 instanceof bjy), cjyVar2 instanceof bjy);
                        }
                        iC = l1d.C(i3);
                        if (iC != 0) {
                            svxVar = svx.t;
                        } else if (iC != 1) {
                            svxVar = svx.X;
                        } else {
                            if (iC == 2) {
                                eg.o();
                                return obj2;
                            }
                            svxVar = svx.Y;
                        }
                        svx svxVar2 = svxVar;
                        mjyVar = ckyVar.k;
                        if (mjyVar != null) {
                            ArrayList arrayList2 = mjyVar.a;
                            arrayList = new ArrayList(q7h.U(arrayList2, 10));
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(g9p1.K((oiy) it.next(), false));
                            }
                            oiyVar = mjyVar.b;
                            if (oiyVar != null) {
                                zxyVarK = g9p1.K(oiyVar, true);
                            } else {
                                zxyVarK = nhyVar;
                            }
                            ecyVar = new ecy(arrayList, zxyVarK, mjyVar.c);
                        } else {
                            ecyVar = nhyVar;
                        }
                        cjyVar = ckyVar.n;
                        ojyVar = ckyVar.l;
                        if (ojyVar != null) {
                            nhyVar = new nhy(ojyVar.a, cjyVar instanceof bjy);
                        }
                        return new g590(ylyVar, dcxVar2, jnyVar, vxyVar, z490Var, zxyVar, bdyVar, ecyVar, svxVar2, cjyVar, nhyVar);
                    }
                    oky okyVar = (oky) mkyVar;
                    d590Var = new e590(i541.W(okyVar.b, okyVar.c));
                }
                zxyVar = d590Var;
                ziy ziyVar2 = ckyVar.g;
                wiyVar = ckyVar.f;
                if (wiyVar != null) {
                    zxyVar2 = wiyVar.a;
                } else {
                    zxyVar2 = nhyVar;
                }
                bdyVar = zxyVar2 == null ? nhyVar : nhyVar;
                iC = l1d.C(i3);
                if (iC != 0) {
                    svxVar = svx.t;
                } else if (iC != 1) {
                    svxVar = svx.X;
                } else {
                    if (iC == 2) {
                        eg.o();
                        return obj2;
                    }
                    svxVar = svx.Y;
                }
                svx svxVar3 = svxVar;
                mjyVar = ckyVar.k;
                if (mjyVar != null) {
                    ArrayList arrayList3 = mjyVar.a;
                    arrayList = new ArrayList(q7h.U(arrayList3, 10));
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(g9p1.K((oiy) it.next(), false));
                    }
                    oiyVar = mjyVar.b;
                    if (oiyVar != null) {
                        zxyVarK = g9p1.K(oiyVar, true);
                    } else {
                        zxyVarK = nhyVar;
                    }
                    ecyVar = new ecy(arrayList, zxyVarK, mjyVar.c);
                } else {
                    ecyVar = nhyVar;
                }
                cjyVar = ckyVar.n;
                ojyVar = ckyVar.l;
                if (ojyVar != null) {
                    nhyVar = new nhy(ojyVar.a, cjyVar instanceof bjy);
                }
                return new g590(ylyVar, dcxVar2, jnyVar, vxyVar, z490Var, zxyVar, bdyVar, ecyVar, svxVar3, cjyVar, nhyVar);
            case 3:
                qpy qpyVar = (qpy) obj3;
                py9 py9Var = qpyVar.b1;
                b7x b7xVar = b7x.a;
                if (py9Var != null) {
                    x6h1 x6h1VarC = py9Var.c.c();
                    x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), py9Var.b, System.currentTimeMillis());
                }
                wqn0 wqn0Var = qpyVar.Q0;
                if (u890.j(wqn0Var, uqn0.a)) {
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-carapplibrary-your-playlists";
                    x6h1VarI.f = "1.1.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1 x6h1VarR = kk0.r(x6h1VarI, "yourlibrary/playlists");
                    x6h1VarR.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR.j = false;
                    x6h1 x6h1VarC3 = x6h1VarR.a().c();
                    x6h1VarC3.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(wqn0Var, qqn0.a)) {
                    y6h1 y6h1Var2 = y6h1.i;
                    x6h1 x6h1VarI2 = i3o1.i();
                    x6h1VarI2.h = "music";
                    x6h1VarI2.a = "mobile-carapplibrary-your-artists";
                    x6h1VarI2.f = "2.0.0";
                    x6h1VarI2.g = "22.0.0";
                    x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "yourlibrary/artists");
                    x6h1VarR2.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR2.j = false;
                    x6h1 x6h1VarC4 = x6h1VarR2.a().c();
                    x6h1VarC4.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(wqn0Var, pqn0.a)) {
                    y6h1 y6h1Var3 = y6h1.i;
                    x6h1 x6h1VarI3 = i3o1.i();
                    x6h1VarI3.h = "music";
                    x6h1VarI3.a = "mobile-carapplibrary-your-albums";
                    x6h1VarI3.f = "1.1.0";
                    x6h1VarI3.g = "22.0.0";
                    x6h1 x6h1VarR3 = kk0.r(x6h1VarI3, "yourlibrary/albums");
                    x6h1VarR3.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR3.j = false;
                    x6h1 x6h1VarC5 = x6h1VarR3.a().c();
                    x6h1VarC5.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(wqn0Var, vqn0.a)) {
                    y6h1 y6h1Var4 = y6h1.i;
                    x6h1 x6h1VarI4 = i3o1.i();
                    x6h1VarI4.h = "music";
                    x6h1VarI4.a = "mobile-carapplibrary-your-shows";
                    x6h1VarI4.f = "1.1.0";
                    x6h1VarI4.g = "22.0.0";
                    x6h1 x6h1VarR4 = kk0.r(x6h1VarI4, "yourlibrary/shows");
                    x6h1VarR4.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR4.j = false;
                    x6h1 x6h1VarC6 = x6h1VarR4.a().c();
                    x6h1VarC6.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else if (u890.j(wqn0Var, rqn0.a)) {
                    y6h1 y6h1Var5 = y6h1.i;
                    x6h1 x6h1VarI5 = i3o1.i();
                    x6h1VarI5.h = "music";
                    x6h1VarI5.a = "mobile-carapplibrary-your-audiobooks";
                    x6h1VarI5.f = "1.1.0";
                    x6h1VarI5.g = "22.0.0";
                    x6h1 x6h1VarR5 = kk0.r(x6h1VarI5, "yourlibrary/audiobooks");
                    x6h1VarR5.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR5.j = false;
                    x6h1 x6h1VarC7 = x6h1VarR5.a().c();
                    x6h1VarC7.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!u890.j(wqn0Var, sqn0.a)) {
                        if (wqn0Var instanceof wpn0) {
                            y6h1 y6h1Var6 = y6h1.i;
                            x6h1 x6h1VarI6 = i3o1.i();
                            x6h1VarI6.h = "music";
                            x6h1VarI6.a = "mobile-carapplibrary-folder";
                            x6h1VarI6.f = "2.1.0";
                            x6h1VarI6.g = "22.0.0";
                            x6h1 x6h1VarR6 = kk0.r(x6h1VarI6, "playlist/folder");
                            x6h1VarR6.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarR6.j = false;
                            x6h1 x6h1VarC8 = x6h1VarR6.a().c();
                            x6h1VarC8.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC8.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                        } else {
                            v8i0.j("[CAL] No root spec back event for entity: ", rc11.a.b(wqn0Var.getClass()).r());
                        }
                        return w7h1Var2 == null ? new v7h1().a() : w7h1Var2;
                    }
                    y6h1 y6h1Var7 = y6h1.i;
                    x6h1 x6h1VarI7 = i3o1.i();
                    x6h1VarI7.h = "music";
                    x6h1VarI7.a = "mobile-carapplibrary-your-downloads";
                    x6h1VarI7.f = "1.1.0";
                    x6h1VarI7.g = "22.0.0";
                    x6h1 x6h1VarR7 = kk0.r(x6h1VarI7, "yourlibrary/downloads");
                    x6h1VarR7.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR7.j = false;
                    x6h1 x6h1VarC9 = x6h1VarR7.a().c();
                    x6h1VarC9.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                w7h1Var2 = w7h1Var;
                if (w7h1Var2 == null) {
                }
            case 4:
                ((ouy) obj3).e.e();
                return rih1Var;
            case 5:
                kl1 kl1Var = (kl1) obj3;
                Flowable flowable = (Flowable) kl1Var.c;
                flowable.getClass();
                return new FlowableRefCount(flowable.t(Functions.a).j(new xeu0(32L, (Scheduler) kl1Var.d, (yqg) kl1Var.e)).x(mpi1.b1).b0(flowable, vrg.b1).Q());
            case 6:
                uvy uvyVar = (uvy) obj3;
                return trc0.a((trc0) uvyVar.b.getValue(), uvyVar.e, (g3d0) null, (Set) null, (mqz0) null, 510);
            case 7:
                ((ce6) obj3).f.invoke();
                return rih1Var;
            case 8:
                return Float.valueOf(((p60) obj3).f);
            case 9:
                yvy yvyVar = (yvy) obj3;
                return ((i4q) yvyVar.f).a((lik1) yvyVar.d);
            case 10:
                return ((lly) ((idd1) ((wyr) obj3).e).getValue()).c;
            case 11:
                return ((zaz) obj3).a();
            case 12:
                return Boolean.valueOf(!((iix0) obj3).g());
            case 13:
                return ((jcz) ((res) obj3).h).b.a();
            case 14:
                mdz mdzVar = (mdz) obj3;
                List list = mdzVar.g;
                if ((list instanceof Collection) && list.isEmpty()) {
                    jdzVar = null;
                } else {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            jdzVar = null;
                        } else if (!ihc1.y0(((ldz) it2.next()).a)) {
                            jdzVar = jdz.b;
                        }
                    }
                }
                List list2 = mdzVar.f;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (!ihc1.y0(((gdz) it3.next()).a)) {
                            jdzVar2 = jdz.a;
                        }
                    }
                }
                return dm61.B0(new jdz[]{jdzVar, jdzVar2});
            case 15:
                return ((LinearLayout) ((yzu) ((bfz) obj3).b).c).getContext();
            case 16:
                gfz gfzVar = (gfz) obj3;
                luk lukVar = gfzVar.c;
                if (lukVar != null) {
                    return lukVar.e(new d26(gfzVar, (byte) 16));
                }
                return null;
            case 17:
                return Long.valueOf(((EqualizerView) obj3).getResources().getInteger(R.integer.config_shortAnimTime));
            case 18:
                ((vjz) obj3).b.a(new ip41(1, 2));
                return rih1Var;
            case 19:
                return flo1.l(((itz) obj3).c, guo1.B());
            case 20:
                hma1 hma1VarEdit = ((c3n0) ((km0) obj3).b).a.edit();
                hma1VarEdit.d(c3n0.b, (String) null);
                hma1VarEdit.g();
                return rih1Var;
            case 21:
                i7d i7dVar = (i7d) obj3;
                bfp bfpVar = (bfp) i7dVar.f;
                d0r d0rVarC = cwl1.C((q7r0) i7dVar.i);
                h72 h72Var = (h72) bfpVar.a.c;
                return new me00((k7p) ((jly0) h72Var.h).get(), (q7p) ((jly0) h72Var.i).get(), (cfp) ((jly0) h72Var.t).get(), (afp) ((jly0) h72Var.g).get(), h72Var.x(), h72Var.K(), d0rVarC);
            case 22:
                tj00 tj00Var = (tj00) obj3;
                Logger.b("EvoLoadableResource :: startLoop", new Object[0]);
                tj00Var.W0 = false;
                PublishSubject publishSubject = new PublishSubject();
                ice0 ice0VarV = tj00Var.Z.v(tj00Var.V0);
                String strA = a.a();
                State.Loading loading = new State.Loading(strA);
                Set setSingleton = Collections.singleton(new Effect.LoadHomeStructure(ice0VarV, (String) null, strA, 2, (DefaultConstructorMarker) null));
                tj00Var.V0 = false;
                e eVar = tj00Var.e;
                xj00 xj00Var = new xj00(eVar, (lnm) null);
                fns fnsVar = igu.a;
                qn qnVar = new qn(fnsVar, xj00Var, (byte) 5);
                uj00 uj00Var = new uj00(((Boolean) ((idd1) eVar.l.e).getValue()).booleanValue());
                CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
                tth1 tth1Var = eVar.h;
                CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                yj00 yj00Var = new yj00(tth1Var);
                jd11 jd11Var = rc11.a;
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(Effect.UpdateOnDemandSet.class), runSequentially.a(yj00Var));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(Effect.LoadHomeStructure.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new bk00(eVar)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(Effect.TryAddingBrandAdPreview.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dk00(eVar)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(Effect.OfflineFallbackResponse.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fk00(eVar)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(Effect.CheckForceReload.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hk00(eVar.j)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(Effect.LoadMoreHomeStructure.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jk00(eVar)));
                coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(Effect.RefreshPromptCta.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zj00(eVar)));
                MobiusLoop mobiusLoopA = Mobius.d(uj00Var, new com.spotify.mobius.coroutines.a(fnsVar, coroutinesSubtypeEffectHandlerBuilderI)).b(vj00.a).d(wj00.a).i(qnVar).f(new uq80(eVar.f, new AndroidLogger(), eVar.m)).a(loading, setSingleton);
                tj00Var.S0 = mobiusLoopA;
                tj00Var.T0 = mobiusLoopA.b(new sj00(tj00Var, publishSubject));
                return yoi1.g(publishSubject.distinctUntilChanged(een.g1).map(new j3v((Object) tj00Var, (byte) 13)));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return cwl1.F(((qa2) obj3).b);
            case 24:
                return new kl00((ll00) obj3);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new i6l0((r6h1) ((uny) obj3).c);
            case 26:
                ms00 ms00Var = (ms00) obj3;
                luk lukVar2 = ms00Var.d;
                if (lukVar2 != null) {
                    return lukVar2.e(new d26(ms00Var, (byte) 17));
                }
                return null;
            case 27:
                return ((t310) obj3).a.d();
            case 28:
                return ((q410) obj3).c.d();
            default:
                return ((a510) obj3).a.d();
        }
    }
}
