package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kjk extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kjk(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invoke(Object obj) {
        Object value;
        dx50 dx50Var;
        bpb1 bpb1Var;
        Object value2;
        bpb1 bpb1Var2;
        Object value3;
        byte b = this.a;
        byte b2 = 7;
        b7x b7xVar = b7x.a;
        byte b3 = 5;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                vik vikVar = (vik) obj;
                ljk ljkVar = (ljk) obj3;
                String str = ((nkk) ((wen0) ljkVar.g.getValue()).getValue()).a.a.a;
                cfd cfdVar = ljkVar.c;
                l1k l1kVar = new l1k(0, ljkVar.e, yqg.class, "currentTimeMillis", "currentTimeMillis()J", 0, (byte) 1);
                ptj ptjVar = new ptj(1, (Consumer) obj2, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 3);
                if (vikVar.equals(nik.a)) {
                    cfdVar.s(su80.d);
                    ptjVar.invoke(vkk.a);
                } else if (vikVar instanceof pik) {
                    String str2 = ((pik) vikVar).a;
                    ptjVar.invoke(new alk(((Number) l1kVar.invoke()).longValue(), str2, cfdVar.s(new dv80(str2))));
                } else if (vikVar instanceof tik) {
                    tik tikVar = (tik) vikVar;
                    String str3 = tikVar.a;
                    ptjVar.invoke(new qlk(str3, tikVar.b, cfdVar.s(new lv80(str3))));
                } else if (vikVar instanceof rik) {
                    rik rikVar = (rik) vikVar;
                    String str4 = rikVar.a;
                    cfdVar.s(new gv80(str4, rikVar.b));
                    ptjVar.invoke(new elk(str4));
                } else if (vikVar.equals(lik.a)) {
                    cfdVar.s(pu80.d);
                    ptjVar.invoke(new okk(((Number) l1kVar.invoke()).longValue()));
                } else if (vikVar instanceof sik) {
                    cfdVar.s(su80.e);
                    ptjVar.invoke(new glk(((sik) vikVar).a));
                } else if (vikVar instanceof uik) {
                    String str5 = ((uik) vikVar).a;
                    ptjVar.invoke(new ulk(str5, cfdVar.s(new nv80(str5))));
                } else if (vikVar instanceof qik) {
                    String str6 = ((qik) vikVar).a;
                    ptjVar.invoke(new dlk(str6, cfdVar.s(new fv80(str6))));
                } else if (vikVar instanceof oik) {
                    oik oikVar = (oik) vikVar;
                    p5k p5kVar = oikVar.a;
                    ptjVar.invoke(new zkk(p5kVar, cfdVar.s(new cv80(p5kVar, oikVar.b))));
                } else {
                    if (!(vikVar instanceof mik)) {
                        eg.o();
                        return null;
                    }
                    ArrayList<kik> arrayList = ((mik) vikVar).a;
                    kik kikVar = (kik) o7h.X0(arrayList);
                    tv80 tv80VarS = cfdVar.s(new ru80(str, kikVar != null ? kikVar.c : null));
                    if (arrayList.size() == 1) {
                        ptjVar.invoke(new tkk(((kik) o7h.q0(arrayList)).c, tv80VarS));
                    } else {
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        for (kik kikVar2 : arrayList) {
                            arrayList2.add(new nt6(kikVar2.a, kikVar2.b, kikVar2.c));
                        }
                        ptjVar.invoke(new skk(arrayList2, tv80VarS));
                    }
                }
                return rih1Var;
            case 1:
                fje1 fje1Var = (fje1) obj;
                tje1 tje1Var = (tje1) obj3;
                iu30 iu30Var = (iu30) obj2;
                if (fje1Var.equals(cje1.a)) {
                    vqe1 vqe1Var = tje1Var.b;
                    if (vqe1Var != null) {
                        iu30Var.invoke(new rlk(vqe1Var));
                    }
                } else if (fje1Var.equals(dje1.a)) {
                    vqe1 vqe1Var2 = tje1Var.c;
                    if (vqe1Var2 != null) {
                        iu30Var.invoke(new rlk(vqe1Var2));
                    }
                } else if (fje1Var instanceof eje1) {
                    vqe1 vqe1Var3 = (vqe1) o7h.t0(((eje1) fje1Var).a, tje1Var.d);
                    if (vqe1Var3 != null) {
                        iu30Var.invoke(new rlk(vqe1Var3));
                    }
                } else {
                    if (!(fje1Var instanceof bje1)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new flk(((bje1) fje1Var).a));
                }
                return rih1Var;
            case 2:
                apk apkVar = (apk) obj;
                if (apkVar instanceof xok) {
                    xid xidVar = (xid) ((spk) obj3).i;
                    uu80 uu80Var = uu80.a;
                    if (!uu80Var.equals(uu80Var)) {
                        xidVar.getClass();
                        eg.o();
                        return null;
                    }
                    i8h1 i8h1Var = (i8h1) ((kly0) xidVar.b).get();
                    ksk0 ksk0Var = (ksk0) xidVar.c;
                    x6h1 x6h1VarC = ksk0Var.c.c();
                    x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                }
                ((Consumer) obj2).accept(apkVar);
                return rih1Var;
            case 3:
                c380 c380Var = ((lrk) obj3).c;
                ((rtb0) obj).e(c380Var.size(), new kwd(c380Var, (byte) 27), new kwd(c380Var, (byte) 28), new j2i(2039820996, new ot(c380Var, (tgk) obj2, (byte) 6), true));
                return rih1Var;
            case 4:
                Context context = (Context) obj3;
                return new trk(context.getResources().getString(2131954207), context.getResources().getString(2131954206), l1d.m("#", Integer.toHexString(((urk) obj2).a)), (String) ((cxc0) obj).f.q.get("promo_row_asset"), new y6b1(v6b1.T1).toString());
            case 5:
                vtk vtkVar = (vtk) obj;
                vtk vtkVar2 = vtk.a;
                if (vtkVar.equals(vtkVar2)) {
                    ((Function0) obj3).invoke();
                }
                iuk iukVar = (iuk) obj2;
                if (!vtkVar.equals(vtkVar2)) {
                    iukVar.getClass();
                    eg.o();
                    return null;
                }
                iukVar.X = "user_retry";
                bpb1 bpb1Var3 = iukVar.d;
                do {
                    value = bpb1Var3.getValue();
                    ((wtk) value).getClass();
                } while (!bpb1Var3.k(value, new wtk(0, xtk.b)));
                if (!iukVar.i) {
                    xab1 xab1Var = iukVar.h;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    iukVar.h = fn31.T(ack1.a(iukVar), (o8n) null, 0, new huk(iukVar, (lnm) null), 3);
                }
                return rih1Var;
            case 6:
                blj0 blj0Var = (blj0) obj3;
                ax50 ax50Var = new ax50(blj0Var.a);
                String str7 = (String) obj2;
                jjk jjkVar = new jjk(blj0Var, str7, (byte) 6);
                vjj0 vjj0Var = blj0Var.c;
                jjk jjkVar2 = vjj0Var != null ? new jjk(vjj0Var, str7, b3) : null;
                vjj0 vjj0Var2 = blj0Var.d;
                jjk jjkVar3 = vjj0Var2 != null ? new jjk(vjj0Var2, str7, b3) : null;
                vjj0 vjj0Var3 = blj0Var.e;
                jjk jjkVar4 = vjj0Var3 != null ? new jjk(vjj0Var3, str7, b3) : null;
                vjj0 vjj0Var4 = blj0Var.f;
                yw50 yw50Var = new yw50(ax50Var, jjkVar, jjkVar2, jjkVar3, jjkVar4, vjj0Var4 != null ? new jjk(vjj0Var4, str7, b3) : null);
                klj0 klj0Var = blj0Var.g;
                if (klj0Var != null) {
                    ey50 ey50Var = new ey50(klj0Var.a, new jjk(klj0Var.b, str7, b3));
                    vjj0 vjj0Var5 = blj0Var.h;
                    dx50Var = new dx50(ey50Var, vjj0Var5 != null ? new jjk(vjj0Var5, str7, b3) : null);
                } else {
                    dx50Var = null;
                }
                vjj0 vjj0Var6 = blj0Var.i;
                return new fx50(yw50Var, dx50Var, vjj0Var6 != null ? new jjk(vjj0Var6, str7, b3) : null);
            case 7:
                nx9 nx9Var = (nx9) obj3;
                wuk wukVar = (wuk) obj2;
                klm klmVar = ((wn41) obj).a;
                io80 io80VarB = klmVar.b("AuthClientService", new nap0(new vap0(nx9Var, (byte) 7), (byte) 4));
                io80 io80VarB2 = klmVar.b("AuthStorageService", new nap0(new vap0(nx9Var, (byte) 8), (byte) 6));
                io80 io80VarB3 = klmVar.b("AuthTriggerService", new rap0(new xap0(io80VarB2, (byte) 28), new vap0(nx9Var, (byte) 9), (byte) 0));
                io80 io80VarB4 = klmVar.b("RemoteConfigUnauthResolverService", new kx70(new cbp0(0, wukVar.a, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28), new vap0(nx9Var, (byte) 10), new cbp0(0, wukVar.c, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29), new ibp0(0, wukVar.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0), new ibp0(0, wukVar.n, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), new vap0(nx9Var, (byte) 11), new ibp0(0, wukVar.d, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2), (byte) 12));
                return new xuk(io80VarB, io80VarB2, io80VarB3, klmVar.b("LoginFlowRemotePropertiesService", new nbp0(new xap0(io80VarB4, (byte) 29), (byte) 20)), klmVar.b("NpvWidgetUnauthenticatedRemoteConfigService", new nbp0(new hbp0(io80VarB4, (byte) 0), (byte) 28)), klmVar.b("SamsungUnauthPropertyResolverService", new mcp0(new hbp0(io80VarB4, (byte) 2), (byte) 10)), io80VarB4, klmVar.b("RemoteConfigUnauthConsumerService", new mcp0(new hbp0(io80VarB4, (byte) 1), (byte) 9)), klmVar.b("AccountSwitchingRolloutService", new ivn0(new xap0(io80VarB4, (byte) 27), (byte) 28)), klmVar.b("EventSenderService", new nbp0(new u6j0(wukVar, (byte) 12), (byte) 9)), klmVar.b("XiaomiUnauthPropertiesService", new pdp0(new hbp0(io80VarB4, (byte) 3), (byte) 0)), nx9Var);
            case 8:
                fxk fxkVar = (fxk) obj;
                lag lagVar = ((ayk) obj3).f;
                g5l0 g5l0Var = (g5l0) lagVar.c;
                y6h1 y6h1Var = g5l0Var.c;
                g5l0 g5l0Var2 = (g5l0) lagVar.d;
                y6h1 y6h1Var2 = g5l0Var2.c;
                y6h1 y6h1Var3 = ((h7l0) lagVar.b).b;
                if (fxkVar instanceof owk) {
                    i8h1 i8h1VarI = lagVar.i();
                    x6h1 x6h1VarC3 = y6h1Var3.c();
                    x6h1VarC3.i.add(new a7h1("edit_show_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    i8h1VarI.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof xwk) {
                    i8h1 i8h1VarI2 = lagVar.i();
                    x6h1 x6h1VarC4 = y6h1Var3.c();
                    x6h1VarC4.i.add(new a7h1("show_picker_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    i8h1VarI2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof vwk) {
                    i8h1 i8h1VarI3 = lagVar.i();
                    x6h1 x6h1VarC5 = y6h1Var3.c();
                    x6h1VarC5.i.add(new a7h1("schedule_picker_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA = x6h1VarC5.a();
                    String str8 = nik1.g6.a;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str8 == null) {
                        str8 = "";
                    }
                    i8h1VarI3.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof dxk) {
                    i8h1 i8h1VarI4 = lagVar.i();
                    x6h1 x6h1VarC6 = y6h1Var3.c();
                    x6h1VarC6.i.add(new a7h1("voice_picker_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC6.a();
                    String str9 = nik1.r6.a;
                    z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                    if (str9 == null) {
                        str9 = "";
                    }
                    i8h1VarI4.m(new w7h1("", "", z7h1Var2, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9)), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof zvk) {
                    i8h1 i8h1VarI5 = lagVar.i();
                    x6h1 x6h1VarC7 = y6h1Var3.c();
                    x6h1VarC7.i.add(new a7h1("connector_apps_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC7.a();
                    String str10 = nik1.s6.a;
                    z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                    if (str10 == null) {
                        str10 = "";
                    }
                    i8h1VarI5.m(new w7h1("", "", z7h1Var3, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str10)), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof axk) {
                    i8h1 i8h1VarI6 = lagVar.i();
                    x6h1 x6h1VarC8 = y6h1Var3.c();
                    x6h1VarC8.i.add(new a7h1("skip_forward_picker_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC8.a();
                    String str11 = nik1.u6.a;
                    z7h1 z7h1Var4 = new z7h1("hit", 1, b7xVar);
                    if (str11 == null) {
                        str11 = "";
                    }
                    i8h1VarI6.m(new w7h1("", "", z7h1Var4, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11)), y6h1VarA4, r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof wvk) {
                    i8h1 i8h1VarI7 = lagVar.i();
                    x6h1 x6h1VarC9 = y6h1Var3.c();
                    x6h1VarC9.i.add(new a7h1("generate_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    i8h1VarI7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_episode", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof ywk) {
                    lagVar.i().m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var, g5l0Var.b, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof hwk) {
                    i8h1 i8h1VarI8 = lagVar.i();
                    x6h1 x6h1VarC10 = y6h1Var.c();
                    x6h1VarC10.i.add(new a7h1("create_podcast_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    i8h1VarI8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC10.a(), g5l0Var.b, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof zwk) {
                    i8h1 i8h1VarI9 = lagVar.i();
                    zwk zwkVar = (zwk) fxkVar;
                    Integer numValueOf = Integer.valueOf(zwkVar.b);
                    String str12 = zwkVar.a.a;
                    x6h1 x6h1VarC11 = y6h1Var.c();
                    x6h1VarC11.i.add(new a7h1("show_uri_row", (String) null, numValueOf, str12, (String) null));
                    x6h1VarC11.j = false;
                    i8h1VarI9.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC11.a(), g5l0Var.b, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof iwk) {
                    i8h1 i8h1VarI10 = lagVar.i();
                    x6h1 x6h1VarC12 = y6h1Var2.c();
                    x6h1VarC12.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    i8h1VarI10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC12.a(), g5l0Var2.b, System.currentTimeMillis()), (xj61) null);
                    lagVar.i().m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var2, g5l0Var2.b, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof kwk) {
                    i8h1 i8h1VarI11 = lagVar.i();
                    x6h1 x6h1VarC13 = y6h1Var2.c();
                    x6h1VarC13.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    i8h1VarI11.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC13.a(), g5l0Var2.b, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof fwk) {
                    i8h1 i8h1VarI12 = lagVar.i();
                    x6h1 x6h1VarC14 = y6h1Var2.c();
                    x6h1VarC14.i.add(new a7h1("artwork_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC14.j = false;
                    i8h1VarI12.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_image_picker", 1, b7xVar), x6h1VarC14.a(), g5l0Var2.b, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof gwk) {
                    i8h1 i8h1VarI13 = lagVar.i();
                    x6h1 x6h1VarC15 = y6h1Var2.c();
                    x6h1VarC15.i.add(new a7h1("artwork_choose_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    i8h1VarI13.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("upload_file", 1, b7xVar), x6h1VarC15.a(), g5l0Var2.b, System.currentTimeMillis()), (xj61) null);
                } else if (fxkVar instanceof ewk) {
                    i8h1 i8h1VarI14 = lagVar.i();
                    x6h1 x6h1VarC16 = y6h1Var2.c();
                    x6h1VarC16.i.add(new a7h1("artwork_cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = false;
                    i8h1VarI14.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC16.a(), g5l0Var2.b, System.currentTimeMillis()), (xj61) null);
                }
                ((iu30) obj2).invoke(fxkVar);
                return rih1Var;
            case 9:
                int iIntValue = ((Number) obj).intValue();
                iu30 iu30Var2 = (iu30) obj2;
                f27 f27Var = (f27) o7h.t0(iIntValue, ((oxk) obj3).b());
                if (f27Var != null) {
                    iu30Var2.invoke(new tvk(f27Var, iIntValue));
                }
                iu30Var2.invoke(owk.a);
                return rih1Var;
            case 10:
                ((iv91) obj3).a();
                ((p311) obj2).B();
                return rih1Var;
            case 11:
                e261 e261Var = (e261) obj;
                d261 d261Var = fzd1.a;
                mma0[] mma0VarArr = pxl.a;
                mma0 mma0Var = mma0VarArr[0];
                d261Var.getClass();
                e261Var.b(d261Var, (String) obj3);
                d261 d261Var2 = fzd1.b;
                mma0 mma0Var2 = mma0VarArr[1];
                d261Var2.getClass();
                e261Var.b(d261Var2, (qpe1) obj2);
                return rih1Var;
            case 12:
                return (op80) ((vu30) obj3).invoke((op80) obj, (aul) obj2);
            case 13:
                ((tbr0) obj3).a(new y231(new tse(new rxs0((String) obj, ((l1m) obj2).d.b() / 1000))));
                return rih1Var;
            case 14:
                int iIntValue2 = ((Number) obj).intValue();
                ((s3m) obj3).c.a(wzl.a);
                if (iIntValue2 == 0) {
                    ((ozg) obj2).b.t(0.0f);
                }
                return rih1Var;
            case 15:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, (String) obj3);
                if (((zv31) obj2).d) {
                    b261.a(e261Var2);
                }
                return rih1Var;
            case 16:
                rfm rfmVar = (rfm) obj3;
                i8h1 i8h1VarR1 = rfmVar.r1();
                ynb0 ynb0Var = rfmVar.i2;
                if (ynb0Var == null) {
                    u890.C("eventFactory");
                    throw null;
                }
                i3l0 i3l0Var = (i3l0) ynb0Var.get();
                i3l0Var.getClass();
                x6h1 x6h1VarC17 = i3l0Var.a.c();
                x6h1VarC17.i.add(new a7h1("sheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = false;
                rfmVar.q1().e(new yrn0(i8h1VarR1.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a));
                ((t4n) obj2).dismiss();
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ihm ihmVar = (ihm) obj2;
                ((iu30) obj3).invoke(rc11.a.b(ihmVar.c.a.invoke(new i3l0(a1l0.X, (String) null)).getClass()));
                ihmVar.d.invoke((tv80) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((usj) obj3).invoke((vcm) obj2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                oql oqlVar = (oql) obj3;
                fn31.T(cto1.q((dg30) oqlVar.c), (o8n) null, 0, new cuk(oqlVar, (String) obj2, lnmVar, (byte) 19), 3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                jxm jxmVar = (jxm) obj3;
                c380 c380Var2 = jxmVar.b;
                ((rtb0) obj).e(c380Var2.size(), new f1m(c380Var2, (byte) 4), new f1m(c380Var2, (byte) 5), new j2i(2039820996, new rf1(b2, obj2, (Object) jxmVar, (List) c380Var2), true));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((b7n) ((b7n) obj3).c).a((x6n) obj2);
            case 22:
                ((tbn) obj3).a.a((String) obj2, (tv80) obj, (Bundle) null);
                return rih1Var;
            case 23:
                bpb1 bpb1Var4 = (wen0) obj3;
                String str13 = (String) obj2;
                Set setSingleton = str13 != null ? Collections.singleton(str13) : w7x.a;
                bpb1 bpb1Var5 = bpb1Var4;
                bpb1Var5.getClass();
                bpb1Var5.m((Object) null, setSingleton);
                return new tj4((byte) 10);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((lzn0) ((gal) obj3).b).a((String) obj2, (tv80) obj, (Bundle) null);
                return rih1Var;
            case 25:
                Uri uri = (Uri) obj;
                bpb1 bpb1Var6 = (wen0) obj3;
                if (uri != null) {
                    do {
                        bpb1Var2 = bpb1Var6;
                        value3 = bpb1Var2.getValue();
                        ((frn) value3).getClass();
                    } while (!bpb1Var2.k(value3, new frn(uri, false)));
                } else {
                    ((iu30) obj2).invoke(ewk.a);
                    do {
                        bpb1Var = bpb1Var6;
                        value2 = bpb1Var.getValue();
                    } while (!bpb1Var.k(value2, new frn(((frn) value2).a, false)));
                }
                return rih1Var;
            case 26:
                int iIntValue3 = ((Number) obj).intValue();
                avn avnVar = (avn) obj3;
                View viewFindViewById = avnVar.V0.findViewById(2131428382);
                Toolbar toolbar = (Toolbar) ((h72) obj2).X;
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                otn otnVar = avnVar.R0;
                layoutParams.height = iIntValue3 + ((((otnVar instanceof ltn) || (otnVar instanceof ntn)) && avnVar.c == null) ? toolbar.getMeasuredHeight() / 3 : toolbar.getMeasuredHeight());
                viewFindViewById.setLayoutParams(layoutParams);
                return rih1Var;
            case 27:
                rzq rzqVar = (rzq) obj;
                return new w6e0((w6e0) obj3, rzqVar, new uny(rzqVar, (t2j0) obj2));
            case 28:
                String str14 = (String) obj;
                w0o w0oVar = (w0o) obj3;
                if (!ihc1.y0(str14)) {
                    ((lzn0) w0oVar.b).a(str14, bcl1.f((bcl1) w0oVar.c, ((o0i) obj2).e, "creator_follow_row", (String) null, (String) null, new kak(str14, (byte) 27), 12), (Bundle) null);
                }
                return rih1Var;
            default:
                ((iu30) obj3).invoke(((t0o) obj2).a);
                return rih1Var;
        }
    }
}
