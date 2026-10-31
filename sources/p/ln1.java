package p;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ln1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public ln1(vr20 vr20Var, boolean z, yqg yqgVar, wm70 wm70Var) {
        this.a = (byte) 5;
        this.d = vr20Var;
        this.c = z;
        this.b = yqgVar;
        this.e = wm70Var;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0226  */
    /* JADX WARN: Code duplicated, block: B:164:0x037f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0434  */
    /* JADX WARN: Code duplicated, block: B:237:0x0494  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x0175  */
    /* JADX WARN: Code duplicated, block: B:74:0x0178  */
    /* JADX WARN: Code duplicated, block: B:78:0x0181  */
    public final Object emit(Object obj, lnm lnmVar) {
        String string;
        View decorView;
        utm utmVar;
        z2o0 z2o0Var;
        vr20 vr20Var;
        lpv0 lpv0Var;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        hoj0 hoj0VarC;
        goj0 goj0VarA3;
        bql bqlVar;
        int i;
        nr21 nr21Var;
        lr41 lr41Var;
        uyj1 uyj1Var;
        int iS;
        LinkedHashMap linkedHashMap;
        i1r i1rVar;
        i1r i1rVar2;
        h2v h2vVar;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        int i2 = 0;
        int i3 = 0;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.b;
        boolean z3 = this.c;
        Object obj4 = this.d;
        hpe0 hpe0VarB = null;
        switch (b) {
            case 0:
                rmy rmyVar = (rmy) obj;
                mn1 mn1Var = (mn1) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                otu otuVar = mn1Var.d;
                if (z3) {
                    int i4 = rmyVar.d;
                    int iC = l1d.C(i4);
                    if (iC == 2 || iC == 3 || iC == 6) {
                        f80 f80Var = new f80(mn1Var, str2, str, rmyVar, (byte) 2);
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962634});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962634});
                        otuVar.p(new er91((fs91) null, "", 2131962634, (String) null, 2131962636, new zfs(f80Var, (byte) 8), (cvr) null, (xq91) null, false), i4, str);
                    } else {
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962634});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        otuVar.p(new er91((fs91) null, "", 2131962634, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false), i4, str);
                    }
                } else {
                    d520 d520Var = mn1Var.b;
                    int i5 = rmyVar.d;
                    vh3 vh3Var = (vh3) d520Var.h;
                    if (vh3Var == null || !vh3Var.isShowing()) {
                        Context context = ((cn3) d520Var.c).a;
                        String str3 = rmyVar.c;
                        String str4 = rmyVar.a;
                        int i6 = i5 == 2 ? 1 : 2;
                        int iC2 = l1d.C(i5);
                        String string2 = (iC2 == 1 || iC2 == 5) ? context.getString(2131954962, str4) : i5 == 4 ? context.getString(2131954964, str4, str3) : context.getString(2131954963, str4, str3);
                        String str5 = rmyVar.b;
                        fk3 fk3Var = rmyVar.e;
                        if (fk3Var instanceof ek3) {
                            string = context.getString(2131954966);
                        } else if (fk3Var instanceof ik3) {
                            string = context.getString(2131954967);
                        } else if (fk3Var instanceof fk3) {
                            string = fk3Var.a;
                        } else {
                            string = u890.j(fk3Var, gk3.a) ? context.getString(2131954968) : context.getString(2131954968);
                        }
                        gn1 gn1Var = new gn1(str5, string2, i6, string);
                        hh hhVar = new hh((Object) d520Var, (Object) rmyVar, (Object) str, (byte) 7);
                        g3 g3Var = new g3(d520Var, (byte) 21);
                        gw70 gw70Var = (gw70) d520Var.e;
                        qe41 qe41Var = (Activity) d520Var.f;
                        ComposeView composeView = new ComposeView(qe41Var, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        composeView.setViewCompositionStrategy(p5x0.W0);
                        composeView.setContent(new j2i(1323856128, new x2(gw70Var, gn1Var, hhVar, g3Var, (byte) 15), true));
                        vh3 vh3VarCreate = new uh3(qe41Var, 2132017155).setView(composeView).create();
                        Window window = vh3VarCreate.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            x9p1.p(decorView, qe41Var instanceof iac0 ? (iac0) qe41Var : null);
                            lap1.o(decorView, qe41Var instanceof sck1 ? (sck1) qe41Var : null);
                            hm5.J(decorView, qe41Var instanceof qe41 ? qe41Var : null);
                        }
                        vh3VarCreate.setOnCancelListener(new in1(d520Var, rmyVar, str));
                        vh3VarCreate.show();
                        eyh0 eyh0Var = (eyh0) d520Var.d;
                        eyh0Var.d = null;
                        ((i8h1) eyh0Var.b).f(eyh0Var.m(i5, str).e(), (Set) null);
                        d520Var.h = vh3VarCreate;
                    }
                }
                return rih1Var;
            case 1:
                if (lnmVar instanceof utm) {
                    utmVar = (utm) lnmVar;
                    int i7 = utmVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        utmVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        utmVar = new utm(this, lnmVar);
                    }
                } else {
                    utmVar = new utm(this, lnmVar);
                }
                Object obj5 = utmVar.a;
                int i8 = utmVar.b;
                if (i8 == 0) {
                    hm5.M(obj5);
                    vr20 vr20Var2 = (vr20) obj4;
                    i1r i1rVar3 = (k1r) obj;
                    gho0 gho0Var = i1rVar3 instanceof i1r ? (gho0) i1rVar3.a : new gho0((String) null, (String) null);
                    String strX0 = ihc1.X0((String) obj3, ":");
                    som somVar = (som) obj2;
                    String str6 = gho0Var.a;
                    if (str6 != null) {
                        strX0 = str6;
                    }
                    yho0 yho0Var = new yho0(somVar, new gho0(strX0, gho0Var.b), z3);
                    utmVar.b = 1;
                    if (vr20Var2.emit(yho0Var, utmVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i8 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj5);
                }
                return rih1Var;
            case 2:
                if (lnmVar instanceof z2o0) {
                    z2o0Var = (z2o0) lnmVar;
                    int i9 = z2o0Var.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        z2o0Var.b = i9 - Integer.MIN_VALUE;
                    } else {
                        z2o0Var = new z2o0(this, lnmVar);
                    }
                } else {
                    z2o0Var = new z2o0(this, lnmVar);
                }
                Object objD = z2o0Var.a;
                int i10 = z2o0Var.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        i2 = z2o0Var.d;
                        vr20Var = z2o0Var.c;
                        hm5.M(objD);
                    } else {
                        if (i10 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objD);
                    }
                    return rih1Var;
                }
                hm5.M(objD);
                vr20Var = (vr20) obj4;
                ((Number) obj).longValue();
                z2o0Var.c = vr20Var;
                z2o0Var.d = 0;
                z2o0Var.b = 1;
                xgn0 xgn0Var = d3o0.j;
                objD = ((d3o0) obj2).d((String) obj3, z2o0Var, z3);
                if (objD == d9nVar) {
                    return d9nVar;
                }
                z2o0Var.c = null;
                z2o0Var.d = i2;
                z2o0Var.b = 2;
                if (vr20Var.emit(objD, z2o0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 3:
                opv0 opv0Var = (opv0) obj2;
                String str7 = (String) obj3;
                if (lnmVar instanceof lpv0) {
                    lpv0Var = (lpv0) lnmVar;
                    int i11 = lpv0Var.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        lpv0Var.b = i11 - Integer.MIN_VALUE;
                    } else {
                        lpv0Var = new lpv0(this, lnmVar);
                    }
                } else {
                    lpv0Var = new lpv0(this, lnmVar);
                }
                Object obj6 = lpv0Var.a;
                int i12 = lpv0Var.b;
                if (i12 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var3 = (vr20) obj4;
                    ioj0 ioj0Var = (ioj0) obj;
                    lql lqlVar = (!opv0Var.d.a() || (hoj0VarC = ioj0Var.c(bql.class, str7)) == null || (goj0VarA3 = hoj0VarC.a()) == null || (bqlVar = (bql) goj0VarA3.a) == null) ? null : bqlVar.a;
                    if (z3) {
                        if (new y6b1(str7, false).c == v6b1.h) {
                            hoj0 hoj0VarC2 = ioj0Var.c(gh3.class, str7);
                            if (hoj0VarC2 != null && (goj0VarA2 = hoj0VarC2.a()) != null) {
                                hpe0VarB = (gh3) goj0VarA2.a;
                            }
                            if (hpe0VarB != null && ((gh3) hpe0VarB).h) {
                                z = true;
                            }
                            hpe0VarB = ok10.a(z, lqlVar);
                        } else if (new y6b1(str7, false).c == v6b1.t) {
                            hoj0 hoj0VarC3 = ioj0Var.c(z1g1.class, str7);
                            if (hoj0VarC3 != null && (goj0VarA = hoj0VarC3.a()) != null) {
                                hpe0VarB = (z1g1) goj0VarA.a;
                            }
                            if (hpe0VarB != null && poz0.D(hpe0VarB)) {
                                z2 = true;
                            }
                            hpe0VarB = ok10.b(z2, lqlVar);
                        }
                    }
                    lpv0Var.b = 1;
                    if (vr20Var3.emit(hpe0VarB, lpv0Var) == d9nVar) {
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
            case 4:
                mmr0 mmr0Var = (mmr0) obj;
                n811 n811Var = (n811) obj3;
                ven0 ven0Var = (ven0) obj4;
                boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
                int iIntValue = ((Number) mmr0Var.b).intValue();
                if (!zBooleanValue) {
                    if (((Boolean) ven0Var.getValue()).booleanValue() && (i = n811Var.a) != iIntValue && (nr21Var = (nr21) obj2) != null && !nr21Var.c && i != iIntValue) {
                        y6h1 y6h1Var = nr21Var.b(i).b;
                        i8h1 i8h1Var = nr21Var.a;
                        boolean z4 = iIntValue > i;
                        b7x b7xVar = b7x.a;
                        i8h1Var.m(z4 != z3 ? new w7h1("", "", new z7h1("swipe_left", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("swipe_right", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                    ven0Var.setValue(Boolean.FALSE);
                    n811Var.a = iIntValue;
                }
                return rih1Var;
            case 5:
                if (lnmVar instanceof lr41) {
                    lr41Var = (lr41) lnmVar;
                    int i13 = lr41Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        lr41Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        lr41Var = new lr41(this, lnmVar);
                    }
                } else {
                    lr41Var = new lr41(this, lnmVar);
                }
                Object obj7 = lr41Var.a;
                int i14 = lr41Var.b;
                if (i14 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var4 = (vr20) obj4;
                    PlayerState playerState = (PlayerState) obj;
                    ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                    if (z3) {
                        Long l = (Long) playerState.position(((yqg) obj3).b()).e(new Long(0L));
                        Long l2 = (Long) playerState.duration().e(new Long(0L));
                        l.getClass();
                        long jLongValue = l.longValue();
                        l2.getClass();
                        hpe0VarB = new qtf1(jLongValue, l2.longValue());
                    }
                    hpe0 hpe0Var = hpe0VarB;
                    contextTrack.getClass();
                    q400 q400Var = new q400(contextTrack, true, l4o1.X(contextTrack), o4p1.w(playerState), ((wm70) obj2).a(playerState), o4p1.t(playerState) && !nhc1.Y(playerState.contextUri(), "spotify:lex-experiments:todays-feed", false), hpe0Var, (String) playerState.playbackId().h());
                    lr41Var.b = 1;
                    if (vr20Var4.emit(q400Var, lr41Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof uyj1) {
                    uyj1Var = (uyj1) lnmVar;
                    int i15 = uyj1Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        uyj1Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        uyj1Var = new uyj1(this, lnmVar);
                    }
                } else {
                    uyj1Var = new uyj1(this, lnmVar);
                }
                Object obj8 = uyj1Var.a;
                int i16 = uyj1Var.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hm5.M(obj8);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj8);
                vr20 vr20Var5 = (vr20) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                o3r o3rVar = vyj1.a;
                List<i1r> list = (List) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (i1r i1rVar4 : list) {
                    i1r i1rVar5 = i1rVar4 instanceof i1r ? i1rVar4 : null;
                    arrayList2.add(i1rVar5 != null ? (k1r) i1rVar5.a : null);
                }
                boolean zIsEmpty = arrayList2.isEmpty();
                h2v h2vVar2 = f2v.a;
                if (zIsEmpty) {
                    ArrayList<mmr0> arrayListV1 = o7h.v1(arrayList, arrayList2);
                    iS = zno1.s(q7h.U(arrayListV1, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iS);
                    for (mmr0 mmr0Var2 : arrayListV1) {
                        String str8 = (String) mmr0Var2.a;
                        i1rVar = (k1r) mmr0Var2.b;
                        if (i1rVar instanceof i1r) {
                            i1rVar2 = i1rVar;
                        } else {
                            i1rVar2 = null;
                        }
                        if (i1rVar2 != null || (h2vVar = (h2v) i1rVar2.a) == null) {
                            h2vVar = h2vVar2;
                        }
                        linkedHashMap.put(str8, h2vVar);
                    }
                } else {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            k1r k1rVar = (k1r) it.next();
                            if (k1rVar == null || (k1rVar instanceof j1r)) {
                                linkedHashMap = null;
                            }
                        } else {
                            ArrayList<mmr0> arrayListV2 = o7h.v1(arrayList, arrayList2);
                            iS = zno1.s(q7h.U(arrayListV2, 10));
                            if (iS < 16) {
                                iS = 16;
                            }
                            linkedHashMap = new LinkedHashMap(iS);
                            while (r0.hasNext()) {
                                String str9 = (String) mmr0Var2.a;
                                i1rVar = (k1r) mmr0Var2.b;
                                if (i1rVar instanceof i1r) {
                                    i1rVar2 = i1rVar;
                                } else {
                                    i1rVar2 = null;
                                }
                                if (i1rVar2 != null) {
                                    h2vVar = h2vVar2;
                                } else {
                                    h2vVar = h2vVar2;
                                }
                                linkedHashMap.put(str9, h2vVar);
                            }
                        }
                    }
                }
                if (linkedHashMap != null) {
                    ArrayList<pvc0> arrayList3 = new ArrayList();
                    for (Object obj9 : (ArrayList) obj2) {
                        h2v h2vVar3 = (h2v) linkedHashMap.get(((pvc0) obj9).c);
                        if (h2vVar3 == null) {
                            h2vVar3 = h2vVar2;
                        }
                        if (h2vVar3.equals(h2vVar2) || h2vVar3.equals(d2v.a)) {
                            arrayList3.add(obj9);
                        } else if (!h2vVar3.equals(c2v.a) && !h2vVar3.equals(g2v.a) && !(h2vVar3 instanceof e2v)) {
                            eg.o();
                            return null;
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    for (pvc0 pvc0Var : arrayList3) {
                        arrayList4.add(new rzj1(pvc0Var.a, pvc0Var.c));
                    }
                    hpe0VarB = new qyj1(mqo1.A(arrayList4), z3);
                }
                if (hpe0VarB != null) {
                    uyj1Var.b = 1;
                    if (vr20Var5.emit(hpe0VarB, uyj1Var) == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            default:
                ((Number) obj).intValue();
                jkr0 jkr0Var = (jkr0) obj4;
                if (z3) {
                    Set setP1 = o7h.p1(new tr80(Math.max(0, ((err0) jkr0Var.d.c).s() - 1), Math.min(((c380) obj3).size() - 1, ((err0) jkr0Var.d.c).s() + 1), 1));
                    vjr0 vjr0Var = (vjr0) obj2;
                    for (Object obj10 : vjr0Var.i) {
                        int i17 = i3 + 1;
                        if (i3 < 0) {
                            p7h.T();
                            throw null;
                        }
                        xm90 xm90VarA = vjr0Var.a(i3, (z0i) obj10);
                        Integer num = vjr0Var.g;
                        if (num != null && i3 == num.intValue()) {
                            xm90VarA.a(n1i.d);
                            vjr0Var.b.a.l(xm90VarA.d);
                        } else {
                            Integer num2 = vjr0Var.h;
                            if (num2 != null && i3 == num2.intValue()) {
                                xm90VarA.a(n1i.c);
                            } else if (setP1.contains(Integer.valueOf(i3))) {
                                xm90VarA.a(n1i.b);
                            } else {
                                xm90VarA.a(n1i.a);
                            }
                        }
                        i3 = i17;
                    }
                }
                return rih1Var;
        }
    }

    public /* synthetic */ ln1(vr20 vr20Var, Object obj, String str, boolean z, byte b) {
        this.a = b;
        this.d = vr20Var;
        this.e = obj;
        this.b = str;
        this.c = z;
    }

    public /* synthetic */ ln1(Object obj, Serializable serializable, Object obj2, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = serializable;
        this.e = obj2;
        this.c = z;
    }

    public ln1(boolean z, jkr0 jkr0Var, c380 c380Var, vjr0 vjr0Var) {
        this.a = (byte) 7;
        this.c = z;
        this.d = jkr0Var;
        this.b = c380Var;
        this.e = vjr0Var;
    }
}
