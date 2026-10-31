package p;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.show_esperanto.proto.GetShowResponse;
import com.spotify.signup.signup.v2.proto.CreateAccountRequest;
import com.spotify.signup.signup.v2.proto.CreateAccountResponse;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y281 implements Function, hs31, ya, f4b1, qiw, l6u0, BiFunction, Function3, sh {
    public final /* synthetic */ byte a;
    public final Object b;

    public y281(byte b) {
        this.a = b;
        switch (b) {
            case 12:
                this.b = new ypa((byte) 26, false);
                break;
            default:
                this.b = BehaviorSubject.g(new k5a1());
                break;
        }
    }

    public static fuu g(k3r k3rVar) {
        fuu fuuVar = fuu.b;
        fuu fuuVar2 = fuu.c;
        if (k3rVar instanceof j3r) {
            Object obj = ((j3r) k3rVar).a;
            w281 w281Var = obj instanceof w281 ? (w281) obj : null;
            return (w281Var == null || !(w281Var.c ^ true)) ? fuuVar : fuuVar2;
        }
        if (!(k3rVar instanceof h3r)) {
            if (!(k3rVar instanceof i3r)) {
                eg.o();
                return null;
            }
        }
    }

    public ypa a() {
        return (ypa) this.b;
    }

    public boolean accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 9:
                ksk kskVar = (ksk) obj;
                if (((oqa1) obj2).i != 1) {
                    nyu0 nyu0VarC = oxu0.a.c(kskVar.a);
                    if ((nyu0VarC instanceof nyu0 ? nyu0VarC : null) != null) {
                        return true;
                    }
                }
                return false;
            default:
                return ((fza1) obj2).b(((ksk) obj).a);
        }
    }

    public Object apply(Object obj) {
        String str;
        Set<Map.Entry> setEntrySet;
        ucg1 m231Var;
        ppe1 m231Var2;
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                return ((n481) obj2).b.t((GetShowResponse) obj);
            case 2:
                ac10 ac10Var = (ac10) obj2;
                Flowable flowable = Single.zip(pqs.a((pqs) ac10Var.d), ((xvo) ac10Var.b).a(true).firstOrError(), new nn61(ac10Var, (ContextTrack) obj, false, (byte) 13)).toFlowable();
                flowable.getClass();
                return flowable.t(Functions.a).N(Boolean.FALSE);
            case 5:
                ap81 ap81Var = (ap81) obj;
                ar81 ar81Var = (ar81) obj2;
                br81 br81Var = ar81Var.a;
                ijn ijnVarO = CreateAccountRequest.o();
                ijnVarO.n(ap81Var.c);
                ijnVarO.r(ap81Var.d);
                ijnVarO.q();
                ijnVarO.u(ap81Var.e);
                ijnVarO.s(ar81Var.f.b());
                jj01 jj01Var = ap81Var.f;
                if (jj01Var != null && (str = jj01Var.b) != null) {
                    ijnVarO.t(str);
                }
                return br81Var.d(ijnVarO.build()).onErrorResumeNext(new xq81(CreateAccountResponse.parser(), (byte) 0)).map(new n801(ar81Var, ap81Var)).onErrorReturn(e2x0.N0);
            case 6:
                PlayerState playerState = (PlayerState) obj;
                t380 t380VarDisallowTogglingShuffleReasons = playerState.restrictions().disallowTogglingShuffleReasons();
                qm91 qm91Var = (qm91) obj2;
                boolean z = qm91Var.b && t380VarDisallowTogglingShuffleReasons.contains("mft_disallow");
                return new km91(z, t380VarDisallowTogglingShuffleReasons.isEmpty() || z ? im91.a : ((xyl1) ((up41) qm91Var.f).b).a(playerState.contextMetadata()) ? new hm91() : gm91.a);
            case 14:
                t8r0 t8r0Var = (t8r0) obj2;
                return new MaybeIgnoreElementCompletable(new FlowableSingleMaybe(((t8u0) t8r0Var.b).a((x8c0) t8r0Var.a).a().a(new d9u0("listening-parties", true)).filter(e2x0.R0).f(f2x0.R0).m().R(3L, Functions.h))).w();
            case 18:
                oy01 oy01Var = (oy01) obj;
                t45 t45Var = oy01Var.b;
                if (t45Var != null && (setEntrySet = t45Var.h().entrySet()) != null) {
                    ctc1 ctc1Var = (ctc1) obj2;
                    for (Map.Entry entry : setEntrySet) {
                        Long l = (Long) ((di40) entry.getValue()).c;
                        Long l2 = ((di40) entry.getValue()).d;
                        if (l != null && l2 != null) {
                            ctc1Var.d.a(l.longValue(), l2.longValue(), ((di40) entry.getValue()).a, ctc1Var.i.a);
                        }
                    }
                }
                return oy01Var.a;
            case 20:
                lc20 lc20Var = ((ore1) obj2).a;
                return yoi1.i(((zwz0) lc20Var.c).c(), o6x.a).distinctUntilChanged().concatMap(new ur50(((kre1) obj).c, lc20Var, b2)).takeUntil(cj20.e);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                sy21 sy21Var = (sy21) obj;
                nfa0 nfa0Var = (nfa0) ((lvc1) obj2).d;
                if (!sy21Var.a.Q0) {
                    return Single.error(new HttpException(sy21Var));
                }
                uz21 uz21Var = (uz21) sy21Var.b;
                if (uz21Var == null) {
                    tz21 tz21Var = uz21.a;
                    return Single.error(new HttpException(sy21.a(500, dm5.D("", (r8i0) null))));
                }
                String strF = uz21Var.f();
                try {
                    m231Var = (ucg1) nfa0Var.a(strF, ucg1.Companion.serializer());
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                ucg1 ucg1Var = m231Var;
                if (ucg1Var != null) {
                    List<tcg1> list = ucg1Var.a;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (tcg1 tcg1Var : list) {
                        String str2 = tcg1Var.a;
                        qcg1 qcg1Var = tcg1Var.b;
                        arrayList.add(new jwz0(str2, new n5f0(lvc1.F(qcg1Var.a), lvc1.F(qcg1Var.b))));
                    }
                    return Single.just(new lwz0(arrayList, true));
                }
                try {
                    m231Var2 = (ppe1) nfa0Var.a(strF, ppe1.Companion.serializer());
                    break;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                ppe1 ppe1Var = m231Var2 instanceof m231 ? null : m231Var2;
                if (ppe1Var == null) {
                    return Single.error(new IllegalStateException("Invalid transcript payload"));
                }
                List<jpe1> list2 = ppe1Var.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (jpe1 jpe1Var : list2) {
                    arrayList2.add(new jwz0(jpe1Var.a, new n5f0(jpe1Var.b, jpe1Var.c)));
                }
                return Single.just(new lwz0(arrayList2, ppe1Var.d.g == ope1.c));
            case 26:
                return Observable.fromAction(new dkb1((g2x0) obj2, (hf7) obj, (byte) 9));
            case 27:
                ffe1 ffe1Var = (ffe1) obj2;
                List list3 = ((teh1) obj).a;
                ArrayList<sf51> arrayList3 = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r7h.W(((peh1) it.next()).a, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (sf51 sf51Var : arrayList3) {
                    String str3 = sf51Var.a;
                    List listSingletonList = Collections.singletonList(new u310(str3 == null ? "" : str3, (String) null, str3, "", (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, (Uri) null, 2, false, false, false, false, 0, 0, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, str3, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, -134219790, 15));
                    List list4 = sf51Var.b;
                    ArrayList arrayList5 = new ArrayList(q7h.U(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(dgo1.w((bi51) it2.next(), (bm00) ffe1Var.b, (aai0) ffe1Var.c, sf51Var.a));
                    }
                    r7h.W(o7h.N0(arrayList5, listSingletonList), arrayList4);
                }
                return new z310(arrayList4, (f410) null, (m510) null, (String) null);
            default:
                w7x w7xVar = (Set) ((cma1) obj).a;
                if (w7xVar == null) {
                    w7xVar = w7x.a;
                }
                return Boolean.valueOf(w7xVar.contains(((k560) obj2).a));
        }
    }

    public fuu b(String str) {
        Set set = s4b1.f;
        if (!uic.g(str, blc0.fh)) {
            return fuu.b;
        }
        k3r k3rVarC = f3r.c((dv00) ((idd1) this.b).getValue(), new jh5(new xv00(rc11.a.b(w281.class)), str));
        return k3rVarC instanceof j3r ? g(k3rVarC) : fuu.c;
    }

    public void c(Canvas canvas) {
        int iSave = canvas.save();
        g4b1 g4b1Var = (g4b1) this.b;
        Rect bounds = g4b1Var.getBounds();
        canvas.translate(bounds.centerX(), bounds.centerY());
        canvas.rotate(g4b1Var.f);
        canvas.translate(0.0f, -g4b1Var.l);
        float f = g4b1Var.j[0];
        float f2 = g4b1Var.k;
        float fWidth = f / f2 > ((float) bounds.width()) / ((float) bounds.height()) ? f / bounds.width() : f2 / bounds.height();
        int i = g4b1Var.p;
        if ((i == 3 || (i == 1 && y1a1.z(g4b1Var) == 1)) && g4b1Var.c.b) {
            canvas.scale(-fWidth, fWidth);
        } else {
            canvas.scale(fWidth, fWidth);
        }
        canvas.translate((-f) / 2.0f, (-f2) / 2.0f);
        canvas.drawText(g4b1Var.a(), 0, 1, 0.0f, 0.0f, g4b1Var.g);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(bs81 bs81Var, onm onmVar) {
        smc1 smc1Var;
        bx80 bx80VarB;
        vt81 vt81Var;
        if (onmVar instanceof smc1) {
            smc1Var = (smc1) onmVar;
            int i = smc1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                smc1Var.d = i - Integer.MIN_VALUE;
            } else {
                smc1Var = new smc1(this, onmVar);
            }
        } else {
            smc1Var = new smc1(this, onmVar);
        }
        Object objK = smc1Var.b;
        int i2 = smc1Var.d;
        if (i2 == 0) {
            hm5.M(objK);
            p3t p3tVar = (p3t) this.b;
            smc1Var.a = bs81Var;
            smc1Var.d = 1;
            objK = b5p1.k(p3tVar, smc1Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bs81Var = smc1Var.a;
            hm5.M(objK);
        }
        nw80 nw80Var = (nw80) objK;
        if (nw80Var != null && (bx80VarB = nw80Var.b()) != null) {
            String str = bs81Var.a;
            int iC = l1d.C(bs81Var.b);
            if (iC == 0) {
                vt81Var = vt81.a;
            } else if (iC == 1) {
                vt81Var = vt81.b;
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                vt81Var = vt81.c;
            }
            bx80VarB.b(str, vt81Var);
        }
        return ht81.a;
    }

    public k5a1 e() {
        Object objH = ((BehaviorSubject) this.b).h();
        objH.getClass();
        return (k5a1) objH;
    }

    public BehaviorSubject f() {
        return (BehaviorSubject) this.b;
    }

    public void i(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        wh81 wh81Var = ((gi81) ((wf2) this.b).b).c;
        if (wh81Var != null) {
            wh81Var.a.u(true);
        }
    }

    public int j() {
        return (int) Math.ceil(((g4b1) this.b).k);
    }

    public int l() {
        return (int) Math.ceil(((g4b1) this.b).j[0]);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        Object next;
        Object next2;
        Object next3;
        re70 re70Var = (re70) obj;
        f7h f7hVar = (f7h) obj2;
        Boolean bool = (Boolean) obj3;
        bool.getClass();
        fip0 fip0Var = (fip0) this.b;
        Iterator it = re70Var.k().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((y570) next).h().a(), "freetier:trackEntityTopContainer"));
        y570 y570Var = (y570) next;
        if (y570Var == null) {
            return re70Var;
        }
        Iterator it2 = re70Var.k().iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!u890.j(((y570) next2).h().a(), "glue2:trackCloud"));
        y570 y570Var2 = (y570) next2;
        List listK = re70Var.k();
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : listK) {
            y570 y570Var3 = (y570) obj4;
            if (!u890.j(y570Var3, y570Var) && !u890.j(y570Var3, y570Var2)) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList(new ArrayList(arrayList));
        ListIterator listIterator = arrayList2.listIterator();
        while (listIterator.hasNext()) {
            y570 y570Var4 = (y570) listIterator.next();
            if (u890.j(y570Var4.h().a(), ((u970) u970.d).a)) {
                wwo1 wwo1VarP = gd70.c.a.P("encore:sectionHeading2", s570.e.a);
                id70 id70Var = id70.c;
                listIterator.set(wwo1VarP.L(id70Var.a.d(y570Var4.n().a.a)).x());
                listIterator.add(y570Var4.toBuilder().M(id70Var.a.d((String) null).build()).x());
            }
        }
        Iterator it3 = y570Var.s().iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (!u890.j(((y570) next3).h().a(), "freetier:tertiaryButtonOutlined"));
        y570 y570Var5 = (y570) next3;
        if (y570Var2 != null) {
            arrayList2.add(0, y570Var2.toBuilder().L(y570Var2.n().a.d((String) fip0Var.d)).p("leftAligned", Boolean.TRUE).x());
        }
        Iterator it4 = arrayList2.iterator();
        int i = 0;
        while (true) {
            if (!it4.hasNext()) {
                i = -1;
                break;
            }
            if (u890.j(((y570) it4.next()).h().a(), "freetier:unlockTrackCard")) {
                break;
            }
            i++;
        }
        Integer numValueOf = i != -1 ? Integer.valueOf(i) : null;
        if (numValueOf != null) {
            arrayList2.add(0, (y570) arrayList2.remove(numValueOf.intValue()));
        }
        if (y570Var5 != null) {
            arrayList2.add(0, y570Var5.toBuilder().P("encore:addToPlaylistButton", y570Var5.h().b()).x());
        }
        return re70Var.toBuilder().o(arrayList2).j(y570Var.toBuilder().P("encore:trackHeader", y570Var.h().b()).p("isPlaying", bool).p("isCurated", Boolean.valueOf(f7hVar.c)).p("isBanned", Boolean.valueOf(f7hVar.b)).x()).f();
    }

    public boolean r(View view) {
        ((qvs) this.b).invoke(fzf1.i);
        return true;
    }

    public void v(Object obj) {
        k4m k4mVar;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 15:
                ((Consumer) obj2).accept((ebc1) obj);
                break;
            default:
                o5g1 o5g1Var = (o5g1) obj;
                j5g1 j5g1Var = (j5g1) obj2;
                j5g1Var.Z.setText(j5g1Var.b.a(o5g1Var.c, new fgv(3, 2)));
                ContentRestrictionBadgeView contentRestrictionBadgeView = j5g1Var.X;
                if (o5g1Var.g) {
                    k4mVar = k4m.a;
                } else {
                    k4mVar = o5g1Var.h ? k4m.b : k4m.d;
                }
                contentRestrictionBadgeView.f(k4mVar);
                break;
        }
    }

    public /* synthetic */ y281(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public y281(s8q s8qVar) {
        this.a = (byte) 0;
        this.b = new idd1(new qv61(s8qVar, (byte) 21));
    }

    public y281(EncoreButton encoreButton, EncoreButton encoreButton2) {
        this.a = (byte) 8;
        this.b = encoreButton2;
    }

    public Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        sp01 sp01Var = ((gmm0) this.b).b;
        ArrayList<ki40> arrayList = new ArrayList();
        for (Object obj3 : (List) obj2) {
            if (!((ki40) obj3).b.isEmpty()) {
                arrayList.add(obj3);
            }
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (ki40 ki40Var : arrayList) {
            linkedHashMap.put(f4i1.f(sp01Var.d.a, "/", ki40Var.a), new mi40(ki40Var, new ivd(ki40Var.b, false, (el51) null, w7x.a, (r87) sp01Var.e).n(list)));
        }
        return linkedHashMap;
    }

    public void apply(long j) {
        wec1 wec1Var = (wec1) this.b;
        if (wec1Var.P0 != null) {
            wec1Var.Q0 = j;
            wec1Var.T(j, wec1Var.Y.b());
        }
    }
}
