package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.fandomcollectibles.protos.BaseStory;
import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import com.spotify.scrollsita.v1.Section;
import com.spotify.share.file.api.files.CreateFileException;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m551 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m551(ui8 ui8Var, nx9 nx9Var, vuk vukVar, mlv0 mlv0Var, wdm wdmVar, pd61 pd61Var, ex01 ex01Var, byte b) {
        super(0);
        this.a = b;
        switch (b) {
            case 3:
                this.b = ui8Var;
                this.c = nx9Var;
                this.d = pd61Var;
                super(0);
                break;
            default:
                this.b = nx9Var;
                this.c = wdmVar;
                this.d = pd61Var;
                break;
        }
    }

    public final Object invoke() throws CreateFileException {
        uha1 uha1VarA;
        int i;
        bpb1 bpb1Var;
        Object value;
        byte b = this.a;
        int i2 = 2;
        int i3 = 1;
        rih1 rih1Var = rih1.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                z951 z951Var = (q1o1) obj3;
                tv80 tv80Var = (tv80) obj2;
                long j = ((v051) obj).c;
                xj61 xj61Var = new xj61();
                String str = z951Var.e;
                String str2 = z951Var.o;
                xj61Var.add(new sx41(str, tv80Var, j, str2 == null ? str : str2, z951Var.r, z951Var.i));
                if (z951Var.r) {
                    xj61Var.add(new vc51(tv80Var));
                }
                xj61Var.add(sc51.b);
                return cwl1.j(xj61Var);
            case 1:
                jmb1 jmb1Var = (unb1) obj3;
                if (jmb1Var instanceof jmb1) {
                    ((bpb1) ((sv51) obj2).b.b).m((Object) null, jmb1Var.a.a);
                    ((iu30) obj).invoke(be00.a);
                }
                return rih1Var;
            case 2:
                wdm wdmVar = (wdm) obj2;
                pd61 pd61Var = (pd61) obj;
                ((nx9) obj3).c();
                jlq0 opwVar = new opw((ooe1) new mdp0(0, pd61Var.M, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8).invoke(), (byte) 3);
                kly0 kly0Var = pd61Var.a;
                mdp0 mdp0Var = new mdp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5);
                ycp0 ycp0Var = new ycp0(wdmVar, (byte) 17);
                kly0 kly0Var2 = pd61Var.n1;
                mdp0 mdp0Var2 = new mdp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6);
                mdp0 mdp0Var3 = new mdp0(0, pd61Var.r1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7);
                Context context = (Context) mdp0Var.invoke();
                CallbackRouter callbackRouter = (CallbackRouter) ycp0Var.invoke();
                q8n q8nVar = (q8n) mdp0Var2.invoke();
                mut0 mut0Var = (mut0) mdp0Var3.invoke();
                c8o.l(context);
                Context applicationContext = context.getApplicationContext();
                jn7 jn7Var = new jn7(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 25)));
                c8o.l(q8nVar);
                c8o.l(mut0Var);
                jlq0 nfe0Var = new nfe0(applicationContext, jn7Var, q8nVar, mut0Var);
                bp5 bp5Var = new bp5((Context) new mdp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2).invoke(), pd61Var.N0, (q8n) new mdp0(0, pd61Var.o1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3).invoke(), (luk) new mdp0(0, pd61Var.I0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4).invoke());
                mdp0 mdp0Var4 = new mdp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9);
                ycp0 ycp0Var2 = new ycp0(wdmVar, (byte) 18);
                mdp0 mdp0Var5 = new mdp0(0, pd61Var.f1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10);
                mdp0 mdp0Var6 = new mdp0(0, pd61Var.F1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11);
                mdp0 mdp0Var7 = new mdp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12);
                Context context2 = (Context) mdp0Var4.invoke();
                gn20 gn20Var = (gn20) ycp0Var2.invoke();
                Flowable flowable = (Flowable) mdp0Var5.invoke();
                xrc0 xrc0Var = (xrc0) mdp0Var6.invoke();
                q8n q8nVar2 = (q8n) mdp0Var7.invoke();
                trc0 trc0Var = azl1.a;
                vbm[] vbmVarArr = q601.a;
                return p7h.M(new jlq0[]{opwVar, nfe0Var, bp5Var, new zyl1(new dai1(context2, gn20Var, new kge(flowable)), xrc0Var, q8nVar2)});
            case 3:
                pd61 pd61Var2 = (pd61) obj;
                ((nx9) obj2).c();
                return p7h.M(new jlq0[]{new fjg((fpu) new mdp0(0, pd61Var2.y0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0).invoke(), (byte) 3), new fjg((ooe1) new mdp0(0, pd61Var2.M, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1).invoke(), (byte) 10), new wo5((xjl) new ldp0(0, pd61Var2.z1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29).invoke(), ((ui8) obj3).d(), (byte) 2)});
            case 4:
                ((ven0) obj).setValue((Object) null);
                y441 y441Var = (y441) obj3;
                if (u890.j((kn61) ((hrr0) y441Var.d).getValue(), (kn61) obj2)) {
                    ((hrr0) y441Var.d).setValue((Object) null);
                }
                return rih1Var;
            case 5:
                ViewGroup viewGroup = (ViewGroup) obj2;
                ConstraintLayout constraintLayoutInflate = ((LayoutInflater) obj3).inflate(2131626126, viewGroup, false);
                int i4 = 2131430573;
                FrameLayout frameLayout = (FrameLayout) m5n1.t(constraintLayoutInflate, 2131430573);
                if (frameLayout != null) {
                    i4 = 2131430614;
                    RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131430614);
                    if (recyclerViewT != null) {
                        wr61 wr61Var = new wr61(constraintLayoutInflate, frameLayout, recyclerViewT);
                        rwq0.s(recyclerViewT, new ict0((iu30) obj, (byte) 8));
                        viewGroup.getContext();
                        recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
                        return wr61Var;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i4)));
                return null;
            case 6:
                if (!((r171) obj3).t.i()) {
                    ((iu30) obj2).invoke(new t071(((j171) obj).j.a, sl01.a));
                }
                return rih1Var;
            case 7:
                o771 o771Var = (o771) obj3;
                if (!o771Var.b().b.exists() && !o771Var.b().mkdirs()) {
                    throw new CreateFileException(o771Var.b());
                }
                l420[] l420VarArrB = o771Var.b().b();
                if (l420VarArrB == null) {
                    l420VarArrB = new l420[0];
                }
                ArrayList arrayList = new ArrayList();
                for (l420 l420Var : l420VarArrB) {
                    if (l420Var.b.isFile()) {
                        ytw0 ytw0Var = jfv.b;
                        if (jfv.c(fdg1.l0(o771Var.c.b() - l420Var.b.lastModified(), ngv.d), o771.e) > 0) {
                            arrayList.add(l420Var);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l420) it.next()).delete();
                }
                return o771Var.a.p(o771Var.b(), ((String) obj2) + ((String) obj));
            case 8:
                xh71 xh71Var = (xh71) ((kls0) obj3).b;
                i871 i871Var = (i871) obj;
                g771 g771Var = i871Var.a;
                xh71.b(xh71Var, new wa71(g771Var.a, null, null, null, null, null, null, 126), wpb1.r(g771Var.b, i871Var.b, i871Var.c), um71.b, (tv80) obj2, (List) null, 16);
                return rih1Var;
            case 9:
                teq teqVar = ((phq) ((z3i0) obj3).e).a.c;
                return new u871((th30) teqVar.m1.get(), (zgq) teqVar.a.kg.get(), new uww0(xqu.a(teqVar.a.Cg), (byte) 9), (String) obj2, (String) obj);
            case 10:
                in71 in71Var = (in71) obj3;
                fn31.T(in71Var.e, (o8n) null, 0, new uk71((Object) in71Var, obj2, obj, (lnm) null, (byte) 2), 3);
                return rih1Var;
            case 11:
                in71 in71Var2 = (in71) obj3;
                fn31.T(in71Var2.e, (o8n) null, 0, new bn71(in71Var2, (Set) obj2, (String) obj, (lnm) null, (byte) 1), 3);
                return rih1Var;
            case 12:
                ssw0 ssw0Var = (ssw0) obj;
                ifw ifwVar = (ifw) obj3;
                if (ifwVar.b) {
                    dms0 dms0Var = (dms0) ((ke71) obj2).c;
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Activity activity = dms0Var.a;
                    intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                    activity.startActivity(intent);
                    ilo1.E(e000.a, ssw0Var);
                } else {
                    ilo1.E(new e300(ifwVar.a), ssw0Var);
                }
                return rih1Var;
            case 13:
                ev81 ev81Var = (ev81) obj2;
                if (!((l811) obj3).a) {
                    ev81Var.e.i((okl1) obj, 3, 0, (String) null);
                }
                ig01 ig01Var = ev81Var.f;
                if (ig01Var != null) {
                    ig01Var.b(1000, "WebSocket closed by client");
                    return rih1Var;
                }
                u890.C("webSocket");
                throw null;
            case 14:
                m511 m511Var = (m511) ((Function0) obj3).invoke();
                float f = hap1.w((View) obj2).b;
                Float f2 = ((pda1) obj).o;
                m511 m511VarA = m511.a(m511Var, f, 0.0f, 13);
                return (f2 == null || f2.floatValue() <= m511VarA.b || f2.floatValue() >= m511VarA.d) ? m511VarA : m511.a(m511VarA, 0.0f, f2.floatValue(), 7);
            case 15:
                bw91 bw91Var = (bw91) obj3;
                uha1 uha1Var = (uha1) obj2;
                ek60 ek60VarListIterator = bw91Var.listIterator();
                int i5 = 0;
                while (true) {
                    ek60 ek60Var = ek60VarListIterator;
                    if (!ek60Var.hasNext()) {
                        i5 = -1;
                    } else if (!u890.j(((uha1) ek60Var.next()).a, uha1Var.a)) {
                        i5++;
                    }
                }
                if (((uha1) bw91Var.get(i5)).c) {
                    qha1 qha1Var = uha1Var.d;
                    if (qha1Var != null && (i = qha1Var.a) != 0) {
                        int iC = l1d.C(i);
                        if (iC != 0) {
                            if (iC != 1) {
                                eg.o();
                                return null;
                            }
                            i2 = 1;
                        }
                        i3 = i2;
                    }
                    qha1 qha1Var2 = uha1Var.d;
                    uha1VarA = uha1.a(uha1Var, false, qha1Var2 != null ? new qha1(i3, qha1Var2.b) : null, 7);
                } else {
                    bw91Var.replaceAll(new v87(uha1Var, (byte) 4));
                    uha1VarA = uha1.a(uha1Var, true, null, 11);
                }
                bw91Var.set(i5, uha1VarA);
                ((vu30) obj).invoke(uha1VarA, Integer.valueOf(i5));
                return rih1Var;
            case 16:
                return ((ima1) obj3).o().getString(((bma1) obj2).a, (String) obj);
            case 17:
                return ((ima1) obj3).o().getStringSet(((bma1) obj2).a, (Set) obj);
            case 18:
                String string = ((SharedPreferences) obj3).getString((String) obj2, (String) obj);
                string.getClass();
                return string;
            case 19:
                Set<String> stringSet = ((SharedPreferences) obj3).getStringSet((String) obj2, (Set) obj);
                stringSet.getClass();
                return stringSet;
            case 20:
                yta1 yta1Var = (yta1) obj3;
                fn31.T(yta1Var.i, (o8n) null, 0, new uk71((Object) yta1Var, obj2, obj, (lnm) null, (byte) 25), 3);
                return rih1Var;
            case 21:
                yxa1 yxa1Var = (yxa1) obj3;
                gya1 gya1Var = yxa1Var.d;
                hp91 hp91Var = yxa1Var.f;
                gya1Var.c = ((byf) hp91Var.b).a((Context) obj2, (cir0) obj, (up41) hp91Var.c, cxf.b, false);
                return rih1Var;
            case 22:
                s24 s24Var = (s24) obj3;
                iu30 iu30Var = (iu30) obj;
                s24Var.getClass();
                String str3 = (String) ((o2u0) obj2).d.get("media.manifest_id");
                sp00 sp00Var = (sp00) s24Var.d;
                if (((Boolean) ((xe01) sp00Var.c).a.getValue()).booleanValue()) {
                    iu30Var.invoke(new wza1(str3));
                } else {
                    iu30Var.invoke(new xza1(str3));
                }
                bpb1 bpb1Var2 = (wen0) sp00Var.b;
                do {
                    bpb1Var = bpb1Var2;
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, Boolean.valueOf(!((Boolean) value).booleanValue())));
                return rih1Var;
            case 23:
                fn31.T((c9n) obj3, (o8n) null, 0, new dk01((vy71) obj2, (ven0) obj, null, (byte) 2), 3);
                return rih1Var;
            case 24:
                Logger.d("MBS: Search cancelled for '%s'", new Object[]{(String) obj3});
                ((q1m) obj2).b(3);
                ((yhh0) obj).d((ArrayList) null);
                return rih1Var;
            case 25:
                ((q1m) obj3).b(3);
                ((em61) obj2).u(s7c0.d(z6x.a, (iph0) obj));
                return rih1Var;
            case 26:
                StickyHeaderLinearLayoutManager.E1((StickyHeaderLinearLayoutManager) obj3, (n611) obj2, (s611) obj);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return ((ut71) obj3).b((Context) obj2, (String) obj);
            case 28:
                hp91 hp91Var2 = (hp91) obj3;
                BaseStory baseStory = (BaseStory) obj2;
                String strT = baseStory.t();
                int iU = baseStory.u();
                i8h1 i8h1Var = (i8h1) hp91Var2.b;
                txk0 txk0Var = (txk0) hp91Var2.c;
                x6h1 x6h1VarC = txk0Var.b.c();
                x6h1VarC.i.add(new a7h1("story_container", strT, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                Integer numValueOf = Integer.valueOf(iU);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("story_scene", (String) null, numValueOf, (String) obj, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = txk0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            default:
                ((ifd1) obj3).h((y570) obj2, (yfu) obj);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m551(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m551(jqd0 jqd0Var, q1o1 q1o1Var, tv80 tv80Var, v051 v051Var) {
        super(0);
        this.a = (byte) 0;
        this.b = q1o1Var;
        this.c = tv80Var;
        this.d = v051Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m551(kls0 kls0Var, i871 i871Var, tv80 tv80Var) {
        super(0);
        this.a = (byte) 8;
        this.b = kls0Var;
        this.d = i871Var;
        this.c = tv80Var;
    }
}
