package p;

import android.app.Dialog;
import android.content.Context;
import android.icu.text.CompactDecimalFormat;
import android.os.Bundle;
import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xj81 implements Connection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xj81(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0133  */
    /* JADX WARN: Code duplicated, block: B:29:0x0163  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r6v12, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    public final void accept(Object obj) {
        dga1 dga1Var;
        l620 l620Var;
        String str;
        String str2;
        vrm1 vrm1Var;
        p1f0 p1f0Var;
        byte b = this.a;
        Object obj2 = this.b;
        int iIntValue = 0;
        iIntValue = 0;
        iIntValue = 0;
        switch (b) {
            case 0:
                ((bpb1) ((x2y) obj2).b).m((Object) null, (bhm0) obj);
                return;
            case 1:
                lga1 lga1Var = (lga1) obj;
                yga1 yga1Var = lga1Var.a;
                dga1 dga1Var2 = lga1Var.c;
                int i = lga1Var.b;
                fpc fpcVar = (fpc) ((ug3) obj2).c;
                eia1 eia1Var = yga1Var.a;
                if (eia1Var instanceof bia1) {
                    dga1Var = dga1Var2 != null ? dga1Var2 : yfa1.a;
                } else if (u890.j(eia1Var, aia1.b)) {
                    dga1Var = aga1.a;
                } else if (u890.j(eia1Var, aia1.c)) {
                    dga1Var = bga1.a;
                } else {
                    if (!u890.j(eia1Var, aia1.a)) {
                        eg.o();
                        return;
                    }
                    dga1Var = zfa1.a;
                }
                bb20 bb20Var = yga1Var.b;
                if (u890.j(bb20Var, bb20.a)) {
                    l620Var = l620.a;
                } else if (u890.j(bb20Var, bb20.b)) {
                    l620Var = l620.b;
                } else {
                    if (!u890.j(bb20Var, bb20.c)) {
                        eg.o();
                        return;
                    }
                    l620Var = l620.c;
                }
                fpcVar.invoke(new ib31(new ega1(dga1Var, l620Var, dga1Var2), i));
                return;
            case 2:
                ckf1 ckf1Var = (ckf1) obj;
                mtf1 mtf1Var = (mtf1) obj2;
                vku vkuVar = mtf1Var.t;
                w9u0 w9u0Var = mtf1Var.c;
                Flowable flowable = mtf1Var.b;
                Flowable flowable2 = mtf1Var.a;
                if (ckf1Var != ckf1.a) {
                    FlowableSingleSingle flowableSingleSingle = new FlowableSingleSingle(ydh.f(flowable2, flowable2));
                    flowable.getClass();
                    vkuVar.a(Completable.m(new CompletableSource[]{Single.zip(flowableSingleSingle, new FlowableSingleSingle(new FlowableTake(mtf1Var.a())), new ltf1(mtf1Var, (byte) 0)).flatMapCompletable(vbx0.T0), Single.zip(flowableSingleSingle.map(ybx0.T0), new FlowableSingleSingle(new FlowableTake(flowable)), new ep31(mtf1Var, (byte) 28)).flatMapCompletable(wbx0.T0).c(w9u0Var.a(new n9u0()).ignoreElement())}).subscribe());
                    return;
                }
                FlowableSingleSingle flowableSingleSingle2 = new FlowableSingleSingle(ydh.f(flowable2, flowable2));
                flowable.getClass();
                FlowableSingleSingle flowableSingleSingle3 = new FlowableSingleSingle(new FlowableTake(flowable));
                Single map = flowableSingleSingle2.map(jcx0.T0);
                vkuVar.a(Completable.m(new CompletableSource[]{Single.zip(flowableSingleSingle2, new FlowableSingleSingle(new FlowableTake(mtf1Var.a())), new ezb1(mtf1Var, (byte) 9)).flatMapCompletable(hcx0.T0), Single.zip(map, flowableSingleSingle3, new xq81(mtf1Var, (byte) 19)).flatMap(icx0.S0).flatMapCompletable(new zb91(new cmd1(flowableSingleSingle2, mtf1Var, (byte) 28), (byte) 16)).c(w9u0Var.a(new l9u0()).ignoreElement())}).subscribe());
                return;
            case 3:
                ywi1 ywi1Var = (ywi1) obj;
                gxi1 gxi1Var = (gxi1) obj2;
                gxi1Var.Z = ywi1Var;
                qzh qzhVar = gxi1Var.f;
                av50 av50Var = ywi1Var.a;
                String str3 = av50Var.c;
                String str4 = av50Var.a;
                String str5 = av50Var.d;
                String str6 = av50Var.e;
                String str7 = av50Var.b;
                String str8 = av50Var.g;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = str8;
                Long l = av50Var.f;
                if (l != null) {
                    long jLongValue = l.longValue();
                    Locale locale = new Locale(upn1.m());
                    if (jLongValue < 9999) {
                        str2 = new DecimalFormat("#,###").format(jLongValue);
                        str2.getClass();
                    } else {
                        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(locale, CompactDecimalFormat.CompactStyle.SHORT);
                        compactDecimalFormat.setMaximumFractionDigits(1);
                        str2 = compactDecimalFormat.format(jLongValue);
                    }
                    str = str2;
                } else {
                    str = null;
                }
                ArrayList arrayList = av50Var.h;
                h1a h1aVar = av50Var.i;
                qzhVar.f(new uxi1(str3, str4, str5, str6, str7, "spotify:playlist:37i9dQZF1DWWjGdmeTyeJ6", str9, "Listen to upcoming shows", str, arrayList, h1aVar != null ? new txi1(h1aVar.a, h1aVar.b, h1aVar.c) : null));
                List list = ywi1Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new hod1(((ted1) it.next()).a));
                }
                gxi1Var.Y = arrayList2;
                qzh qzhVar2 = gxi1Var.g;
                if (gxi1Var.N0) {
                    ywi1 ywi1Var2 = gxi1Var.Z;
                    if (ywi1Var2 != null) {
                        iIntValue = ywi1Var2.c.b;
                    }
                } else {
                    gxi1Var.N0 = true;
                    Bundle bundle = gxi1Var.b;
                    if (bundle != null) {
                        Integer numValueOf = bundle.containsKey("venue_page_selected_tab_index") ? Integer.valueOf(bundle.getInt("venue_page_selected_tab_index")) : null;
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        }
                    }
                }
                qzhVar2.f(new eod1(arrayList2, god1.d, Integer.valueOf(iIntValue)));
                bpb1 bpb1Var = (wen0) gxi1Var.i.getValue();
                kyi1 kyi1Var = ywi1Var.c;
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, kyi1Var);
                ((wen0) gxi1Var.t.getValue()).l(ywi1Var.d);
                return;
            case 4:
                ((bpb1) ((qn) obj2).b).m((Object) null, (d4m1) obj);
                return;
            default:
                frm1 frm1Var = (frm1) obj;
                urm1 urm1Var = (urm1) obj2;
                Context context = urm1Var.b.a;
                String string = context.getString(2131964002);
                pr61 pr61Var = frm1Var.c;
                kqm1 kqm1Var = new kqm1("1", string, pr61Var.a(context));
                String string2 = context.getString(2131964003);
                pr61 pr61Var2 = frm1Var.d;
                kqm1 kqm1Var2 = new kqm1("2", string2, pr61Var2.a(context));
                kqm1 kqm1Var3 = new kqm1("3", context.getString(2131963989), frm1Var.e.a(context));
                List<pr61> list2 = frm1Var.a;
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                for (pr61 pr61Var3 : list2) {
                    prm1 prm1Var = (prm1) ((Map) prm1.f.getValue()).get(pr61Var3);
                    if (prm1Var == null) {
                        prm1Var = prm1.i;
                    }
                    arrayList3.add(new iqm1(prm1Var.b, pr61Var3.a(context), pr61Var3.equals(pr61Var)));
                }
                List<pr61> list3 = frm1Var.b;
                ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                for (pr61 pr61Var4 : list3) {
                    qrm1 qrm1Var = (qrm1) ((Map) qrm1.f.getValue()).get(pr61Var4);
                    if (qrm1Var == null) {
                        qrm1Var = qrm1.i;
                    }
                    arrayList4.add(new iqm1(qrm1Var.b, pr61Var4.a(context), pr61Var4.equals(pr61Var2)));
                }
                vrm1 vrm1Var2 = new vrm1(kqm1Var, kqm1Var2, kqm1Var3, arrayList3, arrayList4);
                mxa1 mxa1Var = urm1Var.d;
                oh20 oh20Var = urm1Var.c;
                p1f0 p1f0Var2 = urm1Var.a;
                idd1 idd1Var = (idd1) p1f0Var2.g;
                idd1 idd1Var2 = (idd1) p1f0Var2.f;
                idd1 idd1Var3 = (idd1) p1f0Var2.e;
                qzh qzhVar3 = (qzh) idd1Var3.getValue();
                if (qzhVar3 != null) {
                    qzhVar3.f(kqm1Var);
                    grm1 grm1VarA = oh20Var.a(arrayList3, new lxh1(mxa1Var, (byte) 11), new trm1(urm1Var, iIntValue));
                    qzh qzhVar4 = (qzh) idd1Var3.getValue();
                    if (qzhVar4 != null) {
                        srm1 srm1Var = new srm1(urm1Var, p1f0Var2, vrm1Var2, grm1VarA, (byte) 0);
                        vrm1Var = vrm1Var2;
                        qzhVar4.n(srm1Var);
                    } else {
                        vrm1Var = vrm1Var2;
                    }
                } else {
                    vrm1Var = vrm1Var2;
                }
                qzh qzhVar5 = (qzh) idd1Var2.getValue();
                if (qzhVar5 != null) {
                    qzhVar5.f(kqm1Var2);
                    grm1 grm1VarA2 = oh20Var.a(arrayList4, new hql1(mxa1Var), new trm1(urm1Var, (byte) 1));
                    qzh qzhVar6 = (qzh) idd1Var2.getValue();
                    if (qzhVar6 != null) {
                        vrm1 vrm1Var3 = vrm1Var;
                        p1f0Var = p1f0Var2;
                        qzhVar6.n(new srm1(urm1Var, p1f0Var, vrm1Var3, grm1VarA2, (byte) 1));
                    } else {
                        p1f0Var = p1f0Var2;
                    }
                } else {
                    p1f0Var = p1f0Var2;
                }
                qzh qzhVar7 = (qzh) idd1Var.getValue();
                if (qzhVar7 != null) {
                    qzhVar7.f(kqm1Var3);
                    qzh qzhVar8 = (qzh) idd1Var.getValue();
                    if (qzhVar8 != null) {
                        qzhVar8.n(new f2m1(urm1Var, p1f0Var, (byte) 17));
                    }
                }
                krm1 krm1Var = (krm1) ((idd1) p1f0Var.h).getValue();
                Dialog dialog = ((t2u) krm1Var).Q1;
                if (dialog != null && dialog.isShowing() && urm1Var.g == 1) {
                    bk7 bk7Var = krm1Var.X1;
                    if (bk7Var == null) {
                        u890.C("recyclerAdapter");
                        throw null;
                    }
                    c21 c21Var = (c21) bk7Var.e;
                    ArrayList arrayList5 = (ArrayList) c21Var.f;
                    j4u j4uVarP = w0h1.p(new r0i(iIntValue, arrayList5, (LinkedHashMap) c21Var.b, arrayList3));
                    arrayList5.clear();
                    arrayList5.addAll(arrayList3);
                    j4uVarP.b(bk7Var);
                    return;
                }
                Dialog dialog2 = ((t2u) krm1Var).Q1;
                if (dialog2 != null && dialog2.isShowing() && urm1Var.g == 2) {
                    bk7 bk7Var2 = krm1Var.X1;
                    if (bk7Var2 == null) {
                        u890.C("recyclerAdapter");
                        throw null;
                    }
                    c21 c21Var2 = (c21) bk7Var2.e;
                    ArrayList arrayList6 = (ArrayList) c21Var2.f;
                    j4u j4uVarP2 = w0h1.p(new r0i(iIntValue, arrayList6, (LinkedHashMap) c21Var2.b, arrayList4));
                    arrayList6.clear();
                    arrayList6.addAll(arrayList4);
                    j4uVarP2.b(bk7Var2);
                    return;
                }
                return;
        }
    }

    public final void dispose() {
        switch (this.a) {
            case 2:
                mtf1 mtf1Var = (mtf1) this.b;
                mtf1Var.t.c();
                mtf1Var.X = bpf1.Y0;
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }
}
