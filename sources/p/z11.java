package p;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import com.spotify.encoremobile.buttons.TertiaryButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z11 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z11(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:352:0x07e1  */
    public final void b(Object obj) {
        Integer num;
        boolean z;
        Object value;
        goj0 goj0VarA;
        SparseArray<Parcelable> sparseParcelableArray;
        boolean z2;
        Bundle bundle;
        SparseArray<Parcelable> sparseParcelableArray2;
        Object value2;
        ArrayList arrayListA;
        List list;
        goj0 goj0VarA2;
        l3r l3rVar;
        l3r l3rVar2;
        switch (this.a) {
            case 0:
                q41 q41Var = (q41) obj;
                cn cnVar = ((b21) this.b).U1;
                if (cnVar != null) {
                    cnVar.accept(q41Var);
                    return;
                }
                return;
            case 1:
                fn3 fn3Var = (fn3) obj;
                ajq0 ajq0Var = ((AllboardingActivity) this.b).k1;
                if (ajq0Var == null) {
                    u890.C("stepNavigator");
                    throw null;
                }
                so41 so41Var = fn3Var.b.c;
                gon0 gon0Var = (gon0) ajq0Var.a;
                ((en3) ajq0Var.c).a = so41Var;
                if (so41Var instanceof to41) {
                    num = 2131428718;
                } else if (so41Var instanceof ro41) {
                    num = 2131428220;
                } else if (so41Var instanceof so41) {
                    ContextualAudioFragment contextualAudioFragment = ((th30) ajq0Var.b).A;
                    ContextualAudioFragment contextualAudioFragment2 = contextualAudioFragment instanceof ContextualAudioFragment ? contextualAudioFragment : null;
                    if (contextualAudioFragment2 != null) {
                        String str = so41Var.a;
                        if (str == null) {
                            str = "";
                        }
                        rmm rmmVarZ0 = contextualAudioFragment2.Z0();
                        fe41 fe41Var = rmmVarZ0.b;
                        fe41Var.b(str, "MIX_ID");
                        z6x z6xVar = (List) fe41Var.b.s("CONTENT");
                        if (z6xVar == null) {
                            z6xVar = z6x.a;
                        }
                        rmmVarZ0.V(z6xVar);
                    }
                    num = 2131428238;
                } else if (so41Var.equals(vo41.a)) {
                    num = 2131429818;
                } else if (so41Var.equals(wo41.a)) {
                    num = 2131430172;
                } else if (so41Var instanceof xo41) {
                    num = 2131431146;
                } else if (so41Var instanceof po41) {
                    num = 2131427916;
                } else {
                    if (!so41Var.equals(yo41.a)) {
                        eg.o();
                        return;
                    }
                    num = null;
                }
                if (num == null) {
                    ((ve3) ajq0Var.d).invoke(new jp41("No destination for screen: ".concat(so41Var.S())));
                    return;
                }
                vnn0 vnn0VarI = gon0Var.i();
                Integer numValueOf = vnn0VarI != null ? Integer.valueOf(vnn0VarI.h) : null;
                if (numValueOf != null && numValueOf.intValue() == 2131430996) {
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 2131430789) {
                    return;
                }
                vnn0 vnn0VarI2 = gon0Var.i();
                if (vnn0VarI2 == null || vnn0VarI2.h != num.intValue()) {
                    gon0Var.p(num.intValue(), (Bundle) null, (qon0) ajq0Var.e);
                    return;
                }
                return;
            case 2:
                xl7 xl7Var = (xl7) this.b;
                xl7Var.e = (Rect) obj;
                xl7Var.g.b = null;
                RecyclerView recyclerView = xl7Var.d;
                RecyclerView recyclerView2 = recyclerView instanceof RecyclerView ? recyclerView : null;
                if (recyclerView2 == null) {
                    return;
                }
                recyclerView2.post(new nx30(xl7Var, recyclerView2, (byte) 5));
                return;
            case 3:
                f6w0 f6w0Var = (f6w0) obj;
                ((ro9) this.b).o.setValue(Boolean.valueOf((f6w0Var != null ? f6w0Var.a : null) instanceof d6w0));
                return;
            case 4:
                veb vebVar = (xeb) obj;
                zdb zdbVar = (zdb) this.b;
                vebVar.getClass();
                if (vebVar instanceof veb) {
                    kg0 kg0Var = zdbVar.G1;
                    if (kg0Var != null) {
                        kg0.e(kg0Var, new tjt(vebVar.a), (ifl1) null);
                        return;
                    } else {
                        u890.C("zeroNavigator");
                        throw null;
                    }
                }
                if (vebVar instanceof ueb) {
                    kg0 kg0Var2 = zdbVar.G1;
                    if (kg0Var2 == null) {
                        u890.C("zeroNavigator");
                        throw null;
                    }
                    ueb uebVar = (ueb) vebVar;
                    kg0.e(kg0Var2, new yit(uebVar.a, uebVar.b, (n5o) null, uebVar.c), (ifl1) null);
                    return;
                }
                if (!(vebVar instanceof web)) {
                    eg.o();
                    return;
                }
                bbb bbbVar = zdbVar.L1;
                if (bbbVar == null) {
                    u890.C("blueprintActionsButtonProvider");
                    throw null;
                }
                web webVar = (web) vebVar;
                fjt fjtVar = webVar.a;
                String str2 = webVar.b;
                kg0 kg0Var3 = bbbVar.b;
                mwn0 mwn0Var = bbbVar.c;
                i8h1 i8h1Var = bbbVar.f;
                b7x b7xVar = b7x.a;
                int iOrdinal = fjtVar.ordinal();
                if (iOrdinal == 0) {
                    bbbVar.c(12);
                    w6b1 w6b1VarA = f7b1.a(blc0.oh);
                    String str3 = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-login-and-sign-up-screen";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    y6h1 y6h1VarA = x6h1VarI.a();
                    p7h.M(new String[]{"start/choosesignup", "start/chooselogin"});
                    x6h1 x6h1VarC = y6h1VarA.c();
                    x6h1VarC.i.add(new a7h1("login_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    nyn1.Q(mwn0Var, new lsn0((String) null, i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis())).a));
                    kg0Var3.d(new gjt(fjt.b, str2), true);
                    return;
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return;
                }
                bbbVar.c(11);
                w6b1 w6b1VarA2 = f7b1.a(blc0.ph);
                String str4 = w6b1VarA2 != null ? (String) o7h.s0(w6b1VarA2.c) : null;
                if (str4 == null) {
                    str4 = "";
                }
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-login-and-sign-up-screen";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                p7h.M(new String[]{"start/choosesignup", "start/chooselogin"});
                x6h1 x6h1VarC2 = y6h1VarA2.c();
                x6h1VarC2.i.add(new a7h1("sign_up_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                nyn1.Q(mwn0Var, new lsn0((String) null, i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis())).a));
                kg0Var3.d(new gjt(fjt.a, str2), true);
                return;
            case 5:
                lb31 lb31Var = (pb31) obj;
                l811 l811Var = (l811) this.b;
                if (lb31Var instanceof lb31) {
                    lb31 lb31Var2 = lb31Var;
                    if ((lb31Var2.f instanceof jm90) && lb31Var2.e) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                l811Var.a = z;
                return;
            case 6:
                List list2 = (List) obj;
                if (list2.isEmpty() || ((xvl1) o7h.A0(list2)).b != wvl1.c) {
                    return;
                }
                fta ftaVar = (fta) this.b;
                Context context = (Context) ftaVar.b;
                ((NotificationManager) context.getApplicationContext().getSystemService("notification")).cancel(2131430162);
                Intent intentA = ((xs80) ftaVar.c).a(context.getApplicationContext());
                intentA.addFlags(268468224);
                intentA.addCategory("android.intent.category.DEFAULT");
                context.getApplicationContext().startActivity(intentA);
                Process.killProcess(Process.myPid());
                return;
            case 7:
                ioj0 ioj0Var = (ioj0) obj;
                Set setB = ioj0Var.a.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = setB.iterator();
                while (it.hasNext()) {
                    hoj0 hoj0VarC = ioj0Var.c(zvh.class, (String) it.next());
                    zvh zvhVar = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (zvh) goj0VarA.a;
                    if (zvhVar != null) {
                        arrayList.add(zvhVar);
                    }
                }
                bpb1 bpb1Var = (bpb1) ((p2o0) this.b).f;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, uyd.a((uyd) value, (List) null, t110.a(arrayList), false, 13)));
                return;
            case 8:
                rnc0 rnc0Var = (rnc0) obj;
                p1d0 p1d0Var = (p1d0) this.b;
                rnc0Var.getClass();
                p1d0Var.b(rnc0Var);
                return;
            case 9:
                l3r l3rVar3 = (l3r) obj;
                l3r l3rVar4 = l3r.c;
                if (l3rVar3 == l3rVar4) {
                    ((uuj) this.b).f.m(l3rVar4);
                    return;
                }
                return;
            case 10:
                cp41 cp41Var = (np41) obj;
                ContextualAudioFragment contextualAudioFragment3 = (ContextualAudioFragment) this.b;
                if (!(cp41Var instanceof cp41)) {
                    if (!u890.j(cp41Var, ieu.a)) {
                        eg.o();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new ip41(0, 3));
                    sap1.m(contextualAudioFragment3, "ALLBOARDING_SCREEN_RESPONSE", bundle2);
                    return;
                }
                if (contextualAudioFragment3.O1) {
                    return;
                }
                cp41 cp41Var2 = cp41Var;
                wp20 wp20Var = contextualAudioFragment3.Q1;
                wp20Var.getClass();
                ContentStackView contentStackView = (ContentStackView) wp20Var.b;
                contentStackView.setVisibility(0);
                gw70 gw70Var = contextualAudioFragment3.I1;
                if (gw70Var == null) {
                    u890.C("imageLoader");
                    throw null;
                }
                Scheduler scheduler = contextualAudioFragment3.H1;
                if (scheduler == null) {
                    u890.C("scheduler");
                    throw null;
                }
                contentStackView.d(gw70Var, scheduler, cp41Var2.a);
                if (!cp41Var2.b) {
                    ((EncoreButton) wp20Var.d).setVisibility(4);
                    ((EncoreButton) wp20Var.e).setVisibility(4);
                    return;
                }
                wp20 wp20Var2 = contextualAudioFragment3.Q1;
                wp20Var2.getClass();
                y4o1.v((EncoreButton) wp20Var2.d, new imm(contextualAudioFragment3, (byte) 2));
                wp20 wp20Var3 = contextualAudioFragment3.Q1;
                wp20Var3.getClass();
                y4o1.v((EncoreButton) wp20Var3.e, new imm(contextualAudioFragment3, (byte) 3));
                contextualAudioFragment3.R1 = true;
                return;
            case 11:
                gmo gmoVar = (gmo) this.b;
                gmoVar.i.m(new sqm((View) obj, gmoVar, (byte) 14));
                return;
            case 12:
                ixb ixbVar = (ixb) obj;
                akr akrVar = (akr) this.b;
                if (akrVar.q) {
                    ixbVar.getClass();
                    akrVar.l(akrVar.m(ixbVar));
                    return;
                }
                return;
            case 13:
                m19 m19Var = (m19) obj;
                jnw jnwVar = (jnw) this.b;
                int i = m19Var.a;
                int i2 = i == 0 ? -1 : inw.a[l1d.C(i)];
                if (i2 == 1) {
                    kg0 kg0Var4 = jnwVar.Z1;
                    if (kg0Var4 == null) {
                        u890.C("navigator");
                        throw null;
                    }
                    String str5 = m19Var.c;
                    if (jnwVar.f2 == null) {
                        u890.C("viewModel");
                        throw null;
                    }
                    kg0Var4.d(new yit(new j3f0(str5, new Uri.Builder().authority(m19Var.d).scheme("https").path("/auth/oauth2/token").build().toString()), bk8.c, (n5o) null, 8), false);
                    jnwVar.dismiss();
                    return;
                }
                if (i2 == 2) {
                    jnwVar.i1().a(new nhv0("samsung_effortless_login_loading", (String) null));
                    Button button = jnwVar.a2;
                    if (button != null) {
                        button.setEnabled(false);
                        return;
                    } else {
                        u890.C("primaryButton");
                        throw null;
                    }
                }
                if (i2 != 3) {
                    eg.o();
                    return;
                }
                jnwVar.i1().a(new jhv0("samsung_effortless_login_loading", "samsung_effortless_login_failure", "none", m19Var.b));
                TextView textView = jnwVar.d2;
                if (textView == null) {
                    u890.C("dialogTitle");
                    throw null;
                }
                textView.setText(2131955416);
                TextView textView2 = jnwVar.e2;
                if (textView2 == null) {
                    u890.C("dialogDescription");
                    throw null;
                }
                textView2.setText(2131955415);
                TextView textView3 = jnwVar.c2;
                if (textView3 == null) {
                    u890.C("usernameView");
                    throw null;
                }
                textView3.setVisibility(8);
                TertiaryButtonView tertiaryButtonView = jnwVar.b2;
                if (tertiaryButtonView == null) {
                    u890.C("secondaryButton");
                    throw null;
                }
                tertiaryButtonView.setVisibility(4);
                jnwVar.j1(true);
                return;
            case 14:
                o5e0 o5e0Var = (o5e0) obj;
                tj00 tj00Var = (tj00) this.b;
                o5e0Var.getClass();
                kq60 kq60Var = kq60.i;
                tp60 tp60Var = tj00Var.g;
                if (o5e0Var.h()) {
                    tj00Var.i();
                    tp60Var.p(kq60Var);
                    return;
                } else if (o5e0Var.b()) {
                    tj00Var.j();
                    tp60Var.g(kq60Var);
                    return;
                } else {
                    tj00Var.g();
                    tp60Var.p(kq60Var);
                    tp60Var.m(2, tj00Var.d);
                    tj00Var.h.d();
                    return;
                }
            case 15:
                chm0 chm0Var = (chm0) obj;
                if (chm0Var != null) {
                    el00 el00Var = (el00) this.b;
                    el00Var.Z0 = new urk0(el00Var.f.a.path(), chm0Var.f, "");
                    xhk1.c(el00Var.a, j6p1.k(j6p1.k(new jp80(new yk00(el00Var, (byte) 1)), new r601(el00Var.S0.M())), new g6r0(q601.b(el00Var.t.i()))));
                    return;
                }
                return;
            case 16:
                dbr0 dbr0Var = (dbr0) obj;
                ii10 ii10Var = (ii10) this.b;
                if (ii10Var.Y) {
                    ii10Var.m(dbr0Var);
                    return;
                }
                return;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                o5e0 o5e0Var2 = (o5e0) obj;
                a630 a630Var = (a630) this.b;
                if (o5e0Var2.h()) {
                    a630Var.i();
                    return;
                } else if (o5e0Var2.b()) {
                    a630Var.j();
                    return;
                } else {
                    a630Var.g();
                    return;
                }
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                rnc0 rnc0Var2 = (rnc0) obj;
                n830 n830Var = (n830) this.b;
                p1d0 p1d0Var2 = (p1d0) n830Var.i;
                rnc0Var2.getClass();
                p1d0Var2.b(rnc0Var2);
                if (n830Var.b) {
                    n830Var.b = false;
                    Bundle bundle3 = (Bundle) n830Var.f;
                    if (bundle3 == null || (sparseParcelableArray = bundle3.getSparseParcelableArray("view_state")) == null) {
                        return;
                    }
                    ((RecyclerView) n830Var.h).restoreHierarchyState(sparseParcelableArray);
                    return;
                }
                return;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                q6b q6bVar = (q6b) obj;
                if (q6bVar == null || !q6bVar.a) {
                    ((j3m) this.b).invoke();
                    return;
                }
                return;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                bob1 bob1Var = (bob1) obj;
                hw30 hw30Var = (hw30) this.b;
                bob1Var.getClass();
                wkc1 wkc1Var = bob1Var.k;
                p6r0 p6r0VarI = eqr0.I(wkc1Var.b);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                boolean z3 = p6r0VarI == yon1.Z1();
                hw30Var.i = z3;
                hw30Var.g.b(hw30Var.h, hw30Var.t && z3);
                cgr0 cgr0Var = hw30Var.d;
                LinkedHashMap linkedHashMap = cgr0Var.U0;
                if (!u890.j(cgr0Var.V0, wkc1Var)) {
                    yt91 yt91Var = cgr0Var.b;
                    em0 em0Var = cgr0Var.S0;
                    if (em0Var == null) {
                        u890.C("pageSwapper");
                        throw null;
                    }
                    Bundle bundle4 = (Bundle) linkedHashMap.get(wkc1Var.a);
                    boolean z4 = cgr0Var.V0 != null;
                    ykc1 ykc1Var = (ykc1) ((Map) yt91Var.b).get(wkc1Var.c);
                    if (ykc1Var == null) {
                        ykc1Var = (ykc1) sqg0.G("EVO", (Map) yt91Var.b);
                    }
                    jqd0 jqd0VarC = ykc1Var.c(wkc1Var.b, new xkc1(((zw30) yt91Var.c).a));
                    Bundle bundleA = ykc1Var.a(bundle4, z4);
                    ebr0 ebr0Var = (ebr0) jqd0VarC.c;
                    Parcelable parcelable = (Parcelable) jqd0VarC.d;
                    boolean z5 = jqd0VarC.b;
                    ((wen0) em0Var.f).m((Object) null, Boolean.FALSE);
                    em0Var.L();
                    ((tp60) em0Var.d).j();
                    if (z5) {
                        wo60 wo60Var = (wo60) em0Var.e;
                        synchronized (wo60Var) {
                            try {
                                wo60Var.c(2, true);
                                hhp0 hhp0Var = hhp0.a;
                                kj41 kj41VarU = hhp0Var.u("page.home.load_legacy");
                                wo60Var.e = kj41VarU;
                                if (kj41VarU != null) {
                                    z2 = true;
                                    kj41VarU.setAttribute("part_of_cold_startup", String.valueOf(!(wo60Var.a.l != null)));
                                } else {
                                    z2 = true;
                                }
                                wo60Var.f = ihp0.l(hhp0Var, "page.home_load", (Object) null, 6);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    tp60 tp60Var2 = (tp60) em0Var.d;
                    kq60 kq60Var2 = kq60.f;
                    tp60Var2.g(kq60Var2);
                    bo41 bo41Var = new bo41((iac0) em0Var.c);
                    em0Var.X = bo41Var;
                    dcr0 dcr0Var = new dcr0((ecr0) ((byp) em0Var.h).h, ebr0Var, parcelable, df.Y, bundleA != null ? bundleA.getBundle("runtime") : null, bo41Var.b, (rck1) null, 192);
                    dcr0Var.f();
                    air0 air0Var = new air0(dcr0Var, (phi0) ((byp) em0Var.h).i, rqt0.u(new nwd((mr20) em0Var.g, (byte) 8)), (mr20) em0Var.g, ((ViewGroup) em0Var.b).getContext(), (ViewGroup) em0Var.b, bundleA != null ? bundleA.getBundle("ui_runtime") : null, (x8c0) null, 128);
                    ((ViewGroup) em0Var.b).removeAllViews();
                    ((ViewGroup) em0Var.b).addView(air0Var.c());
                    Bundle bundleE1 = em0Var.e1();
                    em0Var.i = dcr0Var;
                    em0Var.t = air0Var;
                    ((tp60) em0Var.d).p(kq60Var2);
                    ((tp60) em0Var.d).c();
                    ((tp60) yt91Var.d).i(new vp60(ykc1Var.b()));
                    ((tp60) yt91Var.d).i(new zp60(eqr0.I(wkc1Var.b).c));
                    ((tp60) yt91Var.d).i(new wp60(bundle4 != null ? z2 : false));
                    if (cgr0Var.V0 == null && (bundle = cgr0Var.W0) != null && (sparseParcelableArray2 = bundle.getSparseParcelableArray("view_state")) != null) {
                        ViewGroup viewGroup = cgr0Var.T0;
                        if (viewGroup == null) {
                            u890.C("subFeedContainer");
                            throw null;
                        }
                        viewGroup.restoreHierarchyState(sparseParcelableArray2);
                    }
                    wkc1 wkc1Var2 = cgr0Var.V0;
                    if (wkc1Var2 != null) {
                        linkedHashMap.put(wkc1Var2.a, bundleE1);
                    }
                    cgr0Var.V0 = wkc1Var;
                }
                f3f1 f3f1Var = bob1Var.a;
                vy50 vy50Var = new vy50(f3f1Var.b, f3f1Var.a);
                dtw dtwVar = hw30Var.N0;
                goa0 goa0Var = goa0.a;
                tka0 tka0Var = dtw.C;
                dtwVar.k(vy50Var, goa0Var, (vu30) null);
                return;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ioj0 ioj0Var2 = (ioj0) obj;
                Set setB2 = ioj0Var2.a.b();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = setB2.iterator();
                while (it2.hasNext()) {
                    hoj0 hoj0VarC2 = ioj0Var2.c(zvh.class, (String) it2.next());
                    zvh zvhVar2 = (hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null) ? null : (zvh) goj0VarA2.a;
                    if (zvhVar2 != null) {
                        arrayList2.add(zvhVar2);
                    }
                }
                bpb1 bpb1Var2 = (bpb1) ((lc20) this.b).c;
                do {
                    value2 = bpb1Var2.getValue();
                    wf50 wf50Var = (wf50) value2;
                    arrayListA = t110.a(arrayList2);
                    list = wf50Var.a;
                    wf50Var.getClass();
                } while (!bpb1Var2.k(value2, new wf50(list, arrayListA)));
                return;
            case 22:
                ((fua0) this.b).m((Integer) obj);
                return;
            case 23:
                ((fai0) ((rl1) this.b).e).m((ioj0) obj);
                return;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                xod0 xod0Var = (xod0) obj;
                wod0 wod0Var = (wod0) this.b;
                if (xod0Var instanceof uod0) {
                    cj00 cj00Var = (cj00) wod0Var.d.apply(xod0Var);
                    goq goqVar = wod0Var.b;
                    bpb1 bpb1Var3 = (wen0) ((idd1) goqVar.e).getValue();
                    bpb1Var3.getClass();
                    bpb1Var3.m((Object) null, cj00Var);
                    ui00 ui00Var = cj00Var.a;
                    goqVar.h = ui00Var != null ? ui00Var.a : null;
                    if (ui00Var != null) {
                        ((qzh) goqVar.c).f(ui00Var.a);
                    }
                    si00 si00Var = cj00Var.h;
                    if (si00Var != null) {
                        ((yyr) goqVar.d).f(si00Var.a);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                o5e0 o5e0Var3 = (o5e0) obj;
                v6e0 v6e0Var = (v6e0) this.b;
                boolean z6 = o5e0Var3 instanceof f5e0;
                if (!z6 && v6e0Var.i != null) {
                    s7e0 s7e0Var = v6e0Var.g;
                    if (s7e0Var != null) {
                        hm5.J(s7e0Var.a, (qe41) null);
                    }
                    t7e0 t7e0Var = v6e0Var.i;
                    if (t7e0Var != null) {
                        tac0 tac0Var = t7e0Var.b;
                        if (tac0Var.i.compareTo(w8c0.c) > 0) {
                            tac0Var.i(w8c0.a);
                        }
                    }
                    v6e0Var.i = null;
                }
                kdn0 kdn0Var = v6e0Var.h;
                if (o5e0Var3.equals(h5e0.a)) {
                    l3rVar = l3r.b;
                } else if (z6) {
                    l3rVar = l3r.c;
                } else {
                    l3rVar = (o5e0Var3.equals(j5e0.a) || (o5e0Var3 instanceof c5e0) || (o5e0Var3 instanceof i5e0) || (o5e0Var3 instanceof m5e0)) ? l3r.d : l3r.a;
                }
                kdn0Var.m(l3rVar);
                return;
            case 26:
                o5e0 o5e0Var4 = (o5e0) obj;
                kdn0 kdn0Var2 = (kdn0) ((w6e0) this.b).c;
                l3r l3rVar5 = l3r.a;
                if (!o5e0Var4.c()) {
                    if (o5e0Var4.b()) {
                        l3rVar5 = l3r.b;
                    } else if (o5e0Var4.h()) {
                        l3rVar5 = l3r.c;
                    } else if (o5e0Var4.a() || o5e0Var4.e() || o5e0Var4.g() || o5e0Var4.d()) {
                        l3rVar5 = l3r.d;
                    }
                }
                kdn0Var2.m(l3rVar5);
                return;
            case 27:
                o5e0 o5e0Var5 = (o5e0) obj;
                kdn0 kdn0Var3 = (kdn0) ((w6e0) this.b).c;
                l3r l3rVar6 = l3r.a;
                if (!o5e0Var5.c()) {
                    if (o5e0Var5.b()) {
                        l3rVar6 = l3r.b;
                    } else if (o5e0Var5.h()) {
                        l3rVar6 = l3r.c;
                    } else if (o5e0Var5.a() || o5e0Var5.e() || o5e0Var5.g() || o5e0Var5.d()) {
                        l3rVar6 = l3r.d;
                    }
                }
                kdn0Var3.m(l3rVar6);
                return;
            case 28:
                o5e0 o5e0Var6 = (o5e0) obj;
                kdn0 kdn0Var4 = (kdn0) ((w6e0) this.b).c;
                if (o5e0Var6.b()) {
                    l3rVar2 = l3r.b;
                } else if (o5e0Var6.h()) {
                    l3rVar2 = l3r.c;
                } else {
                    l3rVar2 = o5e0Var6.c() ? l3r.a : l3r.d;
                }
                kdn0Var4.m(l3rVar2);
                return;
            default:
                gl8 gl8Var = (jl8) obj;
                p1f0 p1f0Var = (p1f0) this.b;
                kdn0 kdn0Var5 = (kdn0) p1f0Var.e;
                Object objE = kdn0Var5.e();
                o1f0 o1f0Var = o1f0.a;
                boolean z7 = objE == o1f0Var;
                boolean z8 = gl8Var instanceof gl8;
                if (z8 && !z7) {
                    p1f0Var.z(gl8Var);
                    ((ap31) p1f0Var.b).i();
                    kdn0Var5.m(o1f0Var);
                } else if (z8 && z7) {
                    p1f0Var.z(gl8Var);
                }
                if (gl8Var instanceof hl8) {
                    yg8 yg8Var = ((hl8) gl8Var).a;
                    if (yg8Var != yg8.t) {
                        ((vxf0) p1f0Var.c).a(kdn0Var5.e() == o1f0Var, yg8Var);
                    }
                    kdn0Var5.m(o1f0.b);
                    return;
                }
                return;
        }
    }
}
