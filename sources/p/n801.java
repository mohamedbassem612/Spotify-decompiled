package p;

import android.graphics.Region;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.libraryimportservice.tmm.SubmitMatchReviewRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.show_esperanto.proto.GetShowResponse;
import com.spotify.signup.signup.v2.proto.AccountDetails;
import com.spotify.signup.signup.v2.proto.CreateAccountResponse;
import com.spotify.transcript.list.TranscriptListView;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n801 implements qiw, Function, Predicate, ya {
    public final /* synthetic */ byte a;
    public final Object b;

    public n801() {
        this.a = (byte) 17;
        this.b = new Region();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX WARN: Code duplicated, block: B:70:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0161  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0176  */
    /* JADX WARN: Code duplicated, block: B:82:0x017d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0181  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x019e A[SYNTHETIC] */
    public Serializable a(ArrayList arrayList, onm onmVar) {
        kg31 kg31Var;
        ArrayList<tom> arrayList2;
        Map map;
        z6x z6xVarSingletonList;
        int iS;
        LinkedHashMap linkedHashMap;
        ppl pplVarA;
        ArrayList arrayList3;
        Object obj;
        mg31 mg31Var;
        upl mplVar;
        upl uplVarA;
        String strConcat;
        Object obj2;
        lg31 lg31Var;
        if (onmVar instanceof kg31) {
            kg31Var = (kg31) onmVar;
            int i = kg31Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kg31Var.d = i - Integer.MIN_VALUE;
            } else {
                kg31Var = new kg31(this, onmVar);
            }
        } else {
            kg31Var = new kg31(this, onmVar);
        }
        Object objA = kg31Var.b;
        int i2 = kg31Var.d;
        int i3 = 10;
        if (i2 == 0) {
            ArrayList arrayListJ = hrt.j(objA);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ppl pplVar = (apl) ((tom) it.next()).f;
                if (pplVar instanceof wol) {
                    String strConcat2 = ((wol) pplVar).a;
                    if (strConcat2.length() != 0) {
                        strConcat2 = "spotify:gif:gp-".concat(strConcat2);
                    }
                    z6xVarSingletonList = Collections.singletonList(strConcat2);
                } else if (pplVar instanceof ppl) {
                    List list = pplVar.b;
                    z6x arrayList4 = new ArrayList(q7h.U(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((opl) it2.next()).a);
                    }
                    z6xVarSingletonList = arrayList4;
                } else {
                    if (!(pplVar instanceof mpl)) {
                        eg.o();
                        return null;
                    }
                    z6xVarSingletonList = z6x.a;
                }
                r7h.W((Iterable) z6xVarSingletonList, arrayListJ);
            }
            List listJ0 = o7h.j0(arrayListJ);
            if (listJ0.isEmpty()) {
                map = b7x.a;
                arrayList2 = arrayList;
            } else {
                rg31 rg31Var = (rg31) ((b2p) this.b).get();
                kg31Var.a = arrayList;
                kg31Var.d = 1;
                objA = rg31Var.a(listJ0, kg31Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
                arrayList2 = arrayList;
            }
            iS = zno1.s(q7h.U(arrayList2, 10));
            if (iS < 16) {
                iS = 16;
            }
            linkedHashMap = new LinkedHashMap(iS);
            for (tom tomVar : arrayList2) {
                String str = tomVar.a;
                pplVarA = (apl) tomVar.f;
                if (pplVarA instanceof wol) {
                    wol wolVar = (wol) pplVarA;
                    strConcat = wolVar.a;
                    if (strConcat.length() != 0) {
                        strConcat = "spotify:gif:gp-".concat(strConcat);
                    }
                    obj2 = map.get(strConcat);
                    if (obj2 instanceof lg31) {
                        lg31Var = (lg31) obj2;
                    } else {
                        lg31Var = null;
                    }
                    pplVarA = wol.a(wolVar, lg31Var, 5);
                } else if (pplVarA instanceof ppl) {
                    ppl pplVar2 = pplVarA;
                    List<opl> list2 = pplVar2.b;
                    arrayList3 = new ArrayList(q7h.U(list2, i3));
                    for (opl oplVar : list2) {
                        obj = map.get(oplVar.a);
                        if (obj instanceof mg31) {
                            mg31Var = (mg31) obj;
                        } else {
                            mg31Var = null;
                        }
                        arrayList3.add(new opl(oplVar.a, oplVar.b, mg31Var));
                    }
                    pplVarA = ppl.a(pplVar2, arrayList3, 5);
                } else if (!(pplVarA instanceof mpl)) {
                    eg.o();
                    return null;
                }
                if (pplVarA instanceof wol) {
                    uplVarA = wol.a((wol) pplVarA, null, 3);
                } else {
                    if (pplVarA instanceof ppl) {
                        uplVarA = ppl.a(pplVarA, (ArrayList) null, 3);
                    } else {
                        if (pplVarA instanceof mpl) {
                            eg.o();
                            return null;
                        }
                        mplVar = new mpl(((mpl) pplVarA).a, true);
                    }
                    linkedHashMap.put(str, tom.a(tomVar, (w4i1) null, mplVar, (rom) null, (List) null, (List) null, (nom) null, false, 4063));
                    i3 = 10;
                }
                mplVar = uplVarA;
                linkedHashMap.put(str, tom.a(tomVar, (w4i1) null, mplVar, (rom) null, (List) null, (List) null, (nom) null, false, 4063));
                i3 = 10;
            }
            return linkedHashMap;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList2 = kg31Var.a;
        hm5.M(objA);
        map = (Map) objA;
        iS = zno1.s(q7h.U(arrayList2, 10));
        if (iS < 16) {
            iS = 16;
        }
        linkedHashMap = new LinkedHashMap(iS);
        while (r0.hasNext()) {
            String str2 = tomVar.a;
            pplVarA = (apl) tomVar.f;
            if (pplVarA instanceof wol) {
                wol wolVar2 = (wol) pplVarA;
                strConcat = wolVar2.a;
                if (strConcat.length() != 0) {
                    strConcat = "spotify:gif:gp-".concat(strConcat);
                }
                obj2 = map.get(strConcat);
                if (obj2 instanceof lg31) {
                    lg31Var = (lg31) obj2;
                } else {
                    lg31Var = null;
                }
                pplVarA = wol.a(wolVar2, lg31Var, 5);
            } else if (pplVarA instanceof ppl) {
                ppl pplVar3 = pplVarA;
                List<opl> list3 = pplVar3.b;
                arrayList3 = new ArrayList(q7h.U(list3, i3));
                while (r10.hasNext()) {
                    obj = map.get(oplVar.a);
                    if (obj instanceof mg31) {
                        mg31Var = (mg31) obj;
                    } else {
                        mg31Var = null;
                    }
                    arrayList3.add(new opl(oplVar.a, oplVar.b, mg31Var));
                }
                pplVarA = ppl.a(pplVar3, arrayList3, 5);
            } else if (!(pplVarA instanceof mpl)) {
                eg.o();
                return null;
            }
            if (pplVarA instanceof wol) {
                uplVarA = wol.a((wol) pplVarA, null, 3);
            } else {
                if (pplVarA instanceof ppl) {
                    uplVarA = ppl.a(pplVarA, (ArrayList) null, 3);
                } else {
                    if (pplVarA instanceof mpl) {
                        eg.o();
                        return null;
                    }
                    mplVar = new mpl(((mpl) pplVarA).a, true);
                }
                linkedHashMap.put(str2, tom.a(tomVar, (w4i1) null, mplVar, (rom) null, (List) null, (List) null, (nom) null, false, 4063));
                i3 = 10;
            }
            mplVar = uplVarA;
            linkedHashMap.put(str2, tom.a(tomVar, (w4i1) null, mplVar, (rom) null, (List) null, (List) null, (nom) null, false, 4063));
            i3 = 10;
        }
        return linkedHashMap;
    }

    public boolean accept(Object obj) {
        return ((xp4) this.b).a();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    public Object apply(Object obj) {
        boolean zContains;
        rx91 m231Var;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        boolean z = true;
        byte b2 = 0;
        rx91 rx91Var = null;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                cr6 cr6Var = (cr6) obj2;
                ytp0 ytp0Var = (ytp0) cr6Var.d;
                srt0 srt0Var = ((v111) obj).b;
                if (srt0Var instanceof mrt0) {
                    return ((ruz) ytp0Var.f).a(new d9u0(((PlayOrigin) ytp0Var.e).featureIdentifier(), false)).ignoreElement().w();
                }
                if (srt0Var instanceof krt0) {
                    return ((ruz) ytp0Var.f).a(new g9u0(((PlayOrigin) ytp0Var.e).featureIdentifier(), false)).ignoreElement().w();
                }
                if (srt0Var.equals(ert0.a)) {
                    return ((ReplaySubject) cr6Var.f).switchMap(new ij01(cr6Var, (byte) 1));
                }
                eg.o();
                return null;
            case 4:
                ti11 ti11Var = (ti11) obj2;
                return Flowable.h(ti11Var.a, ti11Var.t.d.toFlowable(BackpressureStrategy.d), kcx0.f);
            case 5:
                ux41 ux41Var = (ux41) obj;
                return j2h1.D(o6xVar, new nn01(((cz1) obj2).b, ux41Var.b, ux41Var.c, (lnm) null, (byte) 1)).d(Observable.just(p051.a));
            case 6:
                iug0 iug0Var = ((cxg0) obj).c;
                k4e0 k4e0Var = (k4e0) obj2;
                return new CompletableFromRunnable(new aih0(k4e0Var, iug0Var, false, (byte) 18)).s((Scheduler) k4e0Var.c).d(Observable.just(new ixg0(iug0Var))).subscribeOn((Scheduler) k4e0Var.d).onErrorReturn(ytw0.d);
            case 11:
                j331 j331Var = (j331) obj;
                if (j331Var instanceof v231) {
                    return (Single) ((kd8) obj2).invoke(j331Var);
                }
                if (j331Var instanceof c331) {
                    return Single.just(j331Var);
                }
                if (j331Var instanceof i231) {
                    return Single.just(j331Var);
                }
                eg.o();
                return null;
            case 14:
                gn01 gn01Var = ((ny41) obj2).b;
                String str = ((kn3) obj).d;
                gn01Var.getClass();
                return new CompletableFromRunnable(new jyh0(gn01Var, str, (byte) 13)).s(gn01Var.a);
            case 15:
                PlayerState playerState = (PlayerState) obj;
                for (kl81 kl81Var : (kl81[]) obj2) {
                    if (kl81Var instanceof al81) {
                        if (playerState.signals().contains("jump") || cr51.c(playerState) != null) {
                            zContains = true;
                        } else {
                            zContains = false;
                        }
                    } else if (!(kl81Var instanceof dl81)) {
                        if (!(kl81Var instanceof yk81)) {
                            eg.o();
                            return null;
                        }
                        zContains = playerState.signals().contains("interact");
                    } else if (playerState.signals().contains("prompt") || !o4p1.t(playerState)) {
                        zContains = true;
                    } else {
                        zContains = false;
                    }
                    if (!zContains) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                }
                return Boolean.valueOf(z);
            case 18:
                p23 p23Var = (p23) obj;
                j23 j23Var = ((uqn) obj2).b;
                String str2 = p23Var.a;
                String str3 = p23Var.c;
                w7x w7xVar = w7x.a;
                return j23Var.h(str2, str3, new svi0(w7xVar, w7xVar)).map(new dr41(p23Var, (byte) 6)).onErrorReturn(new bb01(p23Var, (byte) 21)).toObservable();
            case 21:
                return Single.create(new xaz0(obj2, (byte) 27));
            case 23:
                return ((n481) obj2).b.t((GetShowResponse) obj);
            case 25:
                return j2h1.D(o6xVar, new lm61((vnd1) obj2, (qi91) obj, rx91Var, (byte) 25)).w();
            case 26:
                CreateAccountResponse createAccountResponse = (CreateAccountResponse) obj;
                AccountDetails accountDetails = ((ap81) obj2).c;
                return new pp81(createAccountResponse, accountDetails.o() ? accountDetails.n() : null);
            case 28:
                ip91 ip91Var = (ip91) obj2;
                return ip91Var.g.firstOrError().map(new hp91((List) obj, ip91Var, b2));
            default:
                sy21 sy21Var = (sy21) obj;
                rmr rmrVar = (rmr) ((n381) obj2).c;
                ry21 ry21Var = sy21Var.a;
                boolean z2 = ry21Var.Q0;
                if (z2) {
                    Object obj3 = sy21Var.b;
                    obj3.getClass();
                    return new nx91(obj3);
                }
                if (z2) {
                    eg.o();
                    return null;
                }
                uz21 uz21Var = sy21Var.c;
                String strF = uz21Var != null ? uz21Var.f() : null;
                if (strF != null) {
                    try {
                        m231Var = (rx91) ((nfa0) rmrVar.b).a(strF, rx91.Companion.serializer());
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    rx91Var = m231Var instanceof m231 ? null : m231Var;
                    break;
                }
                return rx91Var == null ? new mx91(new rx91(ry21Var.d)) : new mx91(rx91Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(sew sewVar, onm onmVar) {
        g031 g031Var;
        if (onmVar instanceof g031) {
            g031Var = (g031) onmVar;
            int i = g031Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g031Var.d = i - Integer.MIN_VALUE;
            } else {
                g031Var = new g031(this, onmVar);
            }
        } else {
            g031Var = new g031(this, onmVar);
        }
        Object obj = g031Var.b;
        int i2 = g031Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                mdd0 mdd0Var = (vcd0) this.b;
                String str = sewVar.a;
                boolean z = sewVar.b;
                g031Var.a = sewVar;
                g031Var.d = 1;
                Object objJ = mdd0Var.j(str, g031Var, z);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sewVar = g031Var.a;
                hm5.M(obj);
            }
            return new vn7(sewVar.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new un7(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, onm onmVar) {
        fe11 fe11Var;
        if (onmVar instanceof fe11) {
            fe11Var = (fe11) onmVar;
            int i = fe11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fe11Var.c = i - Integer.MIN_VALUE;
            } else {
                fe11Var = new fe11(this, onmVar);
            }
        } else {
            fe11Var = new fe11(this, onmVar);
        }
        Object obj = fe11Var.a;
        int i2 = fe11Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                bfd bfdVar = (bfd) this.b;
                fe11Var.c = 1;
                Object objC = bfdVar.C(str, fe11Var);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return rih1.a;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(List list, Map map, onm onmVar) {
        aa41 aa41Var;
        rih1 m231Var;
        if (onmVar instanceof aa41) {
            aa41Var = (aa41) onmVar;
            int i = aa41Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aa41Var.c = i - Integer.MIN_VALUE;
            } else {
                aa41Var = new aa41(this, onmVar);
            }
        } else {
            aa41Var = new aa41(this, onmVar);
        }
        Object obj = aa41Var.a;
        int i2 = aa41Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                m9h0 m9h0Var = (m9h0) this.b;
                SubmitMatchReviewRequest submitMatchReviewRequestA = ba41.a(list, map);
                aa41Var.c = 1;
                Object objA = m9h0Var.a(submitMatchReviewRequestA, aa41Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = rih1.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            m231Var = new m231(e2);
        }
        return new x9h0(m231Var);
    }

    public void e(ur80 ur80Var) {
        ((Region) this.b).set(ur80Var.a, ur80Var.b, ur80Var.c, ur80Var.d);
    }

    public boolean test(Object obj) {
        ContextTrack contextTrack;
        PlayerState playerState = (PlayerState) obj;
        at21 at21Var = (at21) this.b;
        ffb0 ffb0Var = at21Var.c;
        dma1 dma1Var = ffb0Var.a;
        return at21Var.d.a && !ffb0Var.d && !dma1Var.h(gfb0.b, false) && dma1Var.l(gfb0.c, 0) < 3 && (contextTrack = (ContextTrack) playerState.track().h()) != null && s3o1.v(contextTrack, false);
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                i1d0 i1d0Var = (i1d0) obj;
                ((mbg1) obj2).a(i1d0Var.a, i1d0Var.b, i1d0Var.c, i1d0Var.d);
                break;
            case 7:
                yr10 yr10Var = (zr10) obj;
                sj21 sj21Var = (sj21) obj2;
                if (!(yr10Var instanceof xr10)) {
                    if (!(yr10Var instanceof yr10)) {
                        eg.o();
                    } else {
                        sj21Var.c.n(new er91((fs91) null, yr10Var.a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false), (ConstraintLayout) sj21Var.a.a);
                    }
                }
                break;
            default:
                vh vhVar = (vh) obj2;
                ((TranscriptListView) vhVar.b).post(new ukd(vhVar, ((Number) obj).intValue(), (byte) 4));
                break;
        }
    }

    public /* synthetic */ n801(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
    }

    public n801(ar81 ar81Var, ap81 ap81Var) {
        this.a = (byte) 26;
        this.b = ap81Var;
    }

    public /* synthetic */ n801(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
