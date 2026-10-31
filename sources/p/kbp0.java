package p;

import android.content.Context;
import android.content.res.Configuration;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.player.model.command.PlayCommand;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kbp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbp0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0357  */
    public final Object invoke() {
        tv80 tv80VarM;
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                return new qpm((qum) ((fdp0) obj4).invoke(), (jqm) ((fdp0) obj5).invoke(), (urm) ((fdp0) obj3).invoke(), (q8n) ((fdp0) obj2).invoke(), (q8n) ((fdp0) obj).invoke());
            case 1:
                Context context = (Context) ((xcp0) obj4).invoke();
                jqt jqtVar = (jqt) ((xcp0) obj5).invoke();
                t2j0 t2j0Var = (t2j0) ((xcp0) obj3).invoke();
                o241 o241Var = (o241) ((xcp0) obj2).invoke();
                Scheduler scheduler = (Scheduler) ((xcp0) obj).invoke();
                l6s l6sVar = new l6s();
                l6sVar.a = context;
                l6sVar.b = jqtVar;
                l6sVar.c = t2j0Var;
                return new km0(o241Var, (j7p) new d3p(l6sVar).b, scheduler);
            case 2:
                return new q(((sap0) obj4).b.b(), (bzm0) ((tap0) obj5).invoke(), (c3n0) ((tap0) obj3).invoke(), (di8) ((uap0) obj2).b.q, ((vap0) obj).b.p());
            case 3:
                return new hd00(((vap0) obj4).b.g(), (bzm0) ((cbp0) obj5).invoke(), ((vap0) obj3).b.p(), (r0z0) ((cbp0) obj2).invoke(), (y2g0) ((cbp0) obj).invoke());
            case 4:
                return new g9r((Context) ((ubp0) obj4).invoke(), (t961) ((ubp0) obj5).invoke(), (a84) ((ubp0) obj3).invoke(), ((obp0) obj2).b.Q1, (Observable) ((ubp0) obj).invoke());
            case 5:
                return new g9r((lfd0) ((ubp0) obj4).invoke(), (z5s) ((ubp0) obj5).invoke(), ((obp0) obj3).b.B3, (ov20) ((ubp0) obj2).invoke(), (q8n) ((ubp0) obj).invoke());
            case 6:
                return new bun0((lmy0) ((wbp0) obj4).invoke(), (g0l) ((wbp0) obj5).invoke(), (oc4) ((wbp0) obj3).invoke(), (dcs) ((wbp0) obj2).invoke(), (q8n) ((wbp0) obj).invoke());
            case 7:
                Context context2 = (Context) ((xbp0) obj4).invoke();
                Flowable flowable = (Flowable) ((xbp0) obj5).invoke();
                om40 om40Var = (om40) ((xbp0) obj3).invoke();
                q8n q8nVar = (q8n) ((xbp0) obj2).invoke();
                ((xbp0) obj).invoke();
                vbm[] vbmVarArr = q601.a;
                return new y9p0(new q9m0(context2, new kge(flowable), om40Var, q8nVar), context2);
            case 8:
                return new g9r((vpp0) ((xbp0) obj4).invoke(), ((obp0) obj5).b.f1, (Scheduler) ((xbp0) obj3).invoke(), ((ecp0) obj2).b.e1, (m94) ((xbp0) obj).invoke());
            case 9:
                return new km0(((ry9) obj4).b.r0, ((ry9) obj5).b.s0, (ax4) ((abp0) obj3).invoke(), (mr20) ((abp0) obj2).invoke(), (q8n) ((abp0) obj).invoke());
            case 10:
                return new mg5(new bhs((Context) ((zbp0) obj4).invoke(), (r241) ((zbp0) obj5).invoke(), (ut71) ((zbp0) obj3).invoke()), ((sap0) obj2).b.f(), (q8n) ((zbp0) obj).invoke());
            case 11:
                return new c6b1((Context) ((acp0) obj4).invoke(), (u0i0) ((acp0) obj5).invoke(), ((ybp0) obj3).b.c, (Scheduler) ((acp0) obj2).invoke(), (Flowable) ((acp0) obj).invoke());
            case 12:
                return new m0i1((q8n) ((bcp0) obj4).invoke(), (h0i1) ((bcp0) obj5).invoke(), (j0i1) ((bcp0) obj3).invoke(), (yqg) ((bcp0) obj2).invoke(), (zzh1) ((bcp0) obj).invoke());
            case 13:
                return new npl1((s85) ((ldp0) obj4).invoke(), (mr20) ((ldp0) obj5).invoke(), (mr20) ((ldp0) obj3).invoke(), (q8n) ((ldp0) obj2).invoke(), new qy30((t2j0) ((ldp0) obj).invoke()));
            case 14:
                ((Function0) obj4).invoke();
                Context context3 = (Context) obj5;
                mw40 mw40VarT = yoi1.T(context3, context3.getString(2131960714), context3.getString(2131960711));
                mw40VarT.h = new nn5((Function0) obj, (byte) 3);
                String string = context3.getString(2131960713);
                wzk wzkVar = new wzk((Function0) obj3, (byte) 5);
                mw40VarT.a = string;
                mw40VarT.c = wzkVar;
                String string2 = context3.getString(2131960712);
                wzk wzkVar2 = new wzk((Function0) obj2, (byte) 6);
                mw40VarT.b = string2;
                mw40VarT.d = wzkVar2;
                mw40VarT.e = true;
                mw40VarT.b().b();
                return rih1Var;
            case 15:
                ((e821) obj4).t((String) obj5, (String) obj3, (String) obj2, (tv80) obj);
                return rih1Var;
            case 16:
                e821 e821Var = (e821) obj4;
                String str = (String) obj5;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                Function0 function0 = (Function0) obj;
                xab1 xab1Var = (xab1) e821Var.e;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                e821Var.e = fn31.T(cto1.q((dg30) e821Var.b), (o8n) null, 0, new sew0((byte) 14, e821Var, str3, function0, str, str2, (lnm) null), 3);
                return rih1Var;
            case 17:
                jkr0 jkr0Var = (jkr0) obj4;
                if (!jkr0Var.k.b()) {
                    ((ven0) obj5).setValue(Boolean.FALSE);
                    nr21 nr21Var = (nr21) obj3;
                    if (nr21Var != null) {
                        int iO = jkr0Var.o();
                        if (nr21Var.c) {
                            tv80VarM = null;
                        } else {
                            if (iO == 3) {
                                nr21Var.c = true;
                            }
                            y6h1 y6h1Var = nr21Var.b(iO).b;
                            i8h1 i8h1Var = nr21Var.a;
                            if (iO == 0) {
                                x6h1 x6h1VarC = y6h1Var.c();
                                x6h1VarC.i.add(new a7h1("see_how_it_works_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC.j = false;
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                            } else if (iO != 3) {
                                x6h1 x6h1VarC2 = y6h1Var.c();
                                x6h1VarC2.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC2.j = false;
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                            } else {
                                x6h1 x6h1VarC3 = y6h1Var.c();
                                x6h1VarC3.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC3.j = false;
                                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                            }
                            tv80VarM = i8h1Var.m(w7h1Var, (xj61) null);
                        }
                    } else {
                        tv80VarM = null;
                    }
                    if (jkr0Var.o() == 3) {
                        ((iu30) obj2).invoke(tv80VarM);
                    } else {
                        fn31.T((c9n) obj, (o8n) null, 0, new hc60(jkr0Var, (lnm) null, (byte) 5), 3);
                    }
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                i8h1 i8h1Var2 = (i8h1) obj4;
                ven0 ven0Var = (ven0) obj2;
                n2m0 n2m0Var = (n2m0) obj5;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    n2m0Var.getClass();
                    x6h1 x6h1VarC4 = n2m0Var.a.c();
                    x6h1VarC4.i.add(new a7h1("see_less_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    n2m0Var.getClass();
                    x6h1 x6h1VarC5 = n2m0Var.a.c();
                    x6h1VarC5.i.add(new a7h1("see_all_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                }
                i8h1Var2.m(w7h1Var2, (xj61) null);
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    fn31.T((c9n) obj3, (o8n) null, 0, new lw10((j5c) obj, null, (byte) 1), 3);
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                jrl0 jrl0Var = (jrl0) obj5;
                eqh1 eqh1Var = (eqh1) obj4;
                if (eqh1Var instanceof cqh1) {
                    jrl0Var.getClass();
                    x6h1 x6h1VarC6 = jrl0Var.a.c();
                    x6h1VarC6.i.add(new a7h1("update_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("refresh_content", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(eqh1Var instanceof dqh1)) {
                        eg.o();
                        return null;
                    }
                    jrl0Var.getClass();
                    x6h1 x6h1VarC7 = jrl0Var.a.c();
                    x6h1VarC7.i.add(new a7h1("update_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:magpie?config=EDIT")), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
                }
                ((i8h1) ((xq81) obj3).b).m(w7h1Var3, (xj61) null);
                ((Function0) obj2).invoke();
                ((Function0) obj).invoke();
                return rih1Var;
            case 20:
                by10 by10Var = (by10) obj4;
                ((ven0) obj).setValue(by10Var);
                int iD0 = w9i1.d0(by10Var);
                Context context4 = (Context) obj3;
                Configuration configuration = new Configuration(context4.getResources().getConfiguration());
                configuration.setLocale(Locale.ENGLISH);
                ((w9i1) obj5).v1 = context4.createConfigurationContext(configuration).getResources().getString(iD0);
                ((iu30) obj2).invoke(by10Var);
                return rih1Var;
            case 21:
                ywv0 ywv0VarA = ((orj1) obj4).a.a((muz) obj5);
                PlayCommand playCommand = (PlayCommand) obj3;
                playCommand.getClass();
                return ywv0VarA.h(playCommand, (String) obj2, (ou80) obj);
            default:
                ven0 ven0Var2 = (ven0) obj5;
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    c08 c08Var = (c08) obj4;
                    a08 a08Var = c08Var instanceof a08 ? (a08) c08Var : null;
                    if (a08Var != null) {
                        String str4 = (String) obj3;
                        d08 d08Var = (d08) obj2;
                        hp80 hp80Var = (hp80) obj;
                        if (str4 != null && d08Var != null) {
                            i8h1 i8h1Var3 = d08Var.c;
                            opl0 opl0VarA = d08Var.a(str4, hp80Var);
                            int iY = yto1.y(a08Var.b);
                            String str5 = a08Var.a;
                            x6h1 x6h1VarC8 = opl0VarA.c.c();
                            x6h1VarC8.i.add(new a7h1("entity_card", (String) null, (Integer) null, str5, z3m0.j(iY)));
                            x6h1VarC8.j = true;
                            i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), opl0VarA.b, System.currentTimeMillis()), (xj61) null);
                        }
                    }
                }
                ven0Var2.setValue(Boolean.FALSE);
                return rih1Var;
        }
    }
}
