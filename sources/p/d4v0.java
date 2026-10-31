package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d4v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4v0(nui0 nui0Var, k3w0 k3w0Var, RecyclerView recyclerView, View view) {
        super(0);
        this.a = (byte) 4;
        this.b = nui0Var;
        this.c = k3w0Var;
        this.d = view;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x037e  */
    /* JADX WARN: Code duplicated, block: B:141:0x049f  */
    /* JADX WARN: Code duplicated, block: B:143:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:150:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:152:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:154:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:158:0x0503  */
    /* JADX WARN: Code duplicated, block: B:159:0x0505  */
    /* JADX WARN: Code duplicated, block: B:222:0x050b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x04f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x04e5 A[SYNTHETIC] */
    public final Object invoke() {
        Iterator it;
        boolean z;
        Boolean boolValueOf;
        int iIntValue;
        String str;
        oge1 oge1Var;
        boolean z2;
        int iV0;
        int i;
        int i2;
        int i3;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i4 = 6;
        int i5 = 0;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                return ((ut71) obj).b((Activity) obj2, ((tku0) obj3).b);
            case 1:
                return ((ut71) obj).b((Activity) obj2, ((o4v0) obj3).a);
            case 2:
                ui8 ui8Var = (ui8) obj;
                nx9 nx9VarA = ui8Var.a().a();
                pug pugVar = ((ulv0) obj2).a;
                return new llv0(new zm41((dn41) obj3, new ozu0(ui8Var, nx9VarA, pugVar, (byte) 3), fft0.e, new xgr0((byte) 13, 2, false), (Function0) null, new rcp0(ui8Var, nx9VarA, pugVar), 80));
            case 3:
                ((iu30) obj).invoke(new qyv0((syv0) obj2, 1));
                ((ss50) obj3).a(0);
                return rih1Var;
            case 4:
                gui0 gui0Var = ((nui0) obj).V0;
                p3w0 p3w0Var = ((k3w0) obj2).b;
                String str2 = gui0Var != null ? gui0Var.a : null;
                String str3 = str2 == null ? "" : str2;
                int iR = RecyclerView.R((View) obj3);
                String str4 = gui0Var != null ? gui0Var.c : null;
                if (str4 == null) {
                    str4 = "";
                }
                zok0 zok0Var = p3w0Var.b;
                x6h1 x6h1VarC = zok0Var.b.c();
                x6h1VarC.i.add(new a7h1("merch_carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                Integer numValueOf = Integer.valueOf(iR);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("merch_item", str3, numValueOf, str4, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = zok0Var.c;
                return k7h1Var.a();
            case 5:
                ((iu30) obj).invoke(((sr10) obj2).b);
                nln.j((ven0) obj3, false);
                return rih1Var;
            case 6:
                mrw0 mrw0Var = (mrw0) obj;
                nab1 nab1Var = mrw0Var.a;
                sw9 sw9Var = nab1Var.g;
                n36 n36Var = (n36) sw9Var.c;
                sw9 sw9Var2 = nab1Var.f;
                n36 n36Var2 = (n36) sw9Var2.c;
                List list = (List) nab1Var.b.invoke();
                if (list == null) {
                    n36Var2.clear();
                    sw9Var2.b = 0;
                    n36Var.clear();
                    sw9Var.b = 0;
                    nab1Var.i = false;
                    nab1Var.j = false;
                } else {
                    Boolean boolA = nab1Var.a(nab1Var.a);
                    if (boolA != null) {
                        sw9Var2.D(boolA.booleanValue());
                        nab1Var.i = true;
                    } else {
                        n36Var2.clear();
                        sw9Var2.b = 0;
                        nab1Var.i = false;
                    }
                    Integer num = nab1Var.h;
                    if (num == null) {
                        it = list.iterator();
                        z = true;
                        while (true) {
                            if (it.hasNext()) {
                                iIntValue = ((Number) it.next()).intValue();
                                str = (String) nab1Var.c.invoke(Integer.valueOf(iIntValue));
                                if (str != null) {
                                    iV0 = ihc1.v0(str, '(', i5, i4);
                                    int iA0 = ihc1.A0(str, ')', i5, i4);
                                    int i6 = iA0 + 2;
                                    if (iV0 != -1 || iA0 <= iV0 || i6 >= str.length()) {
                                        oge1Var = null;
                                    } else {
                                        oge1Var = new oge1(str.substring(iV0 + 1, iA0), str.charAt(i6));
                                    }
                                } else {
                                    oge1Var = null;
                                }
                                if (oge1Var == null) {
                                    z = false;
                                } else if (nab1Var.d.contains(oge1Var.a)) {
                                    nab1Var.h = Integer.valueOf(iIntValue);
                                    nab1Var.k = false;
                                    if (oge1Var.b == 'D') {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    boolValueOf = Boolean.valueOf(z2);
                                }
                                i4 = 6;
                                i5 = 0;
                            } else {
                                if (z && !nab1Var.k) {
                                    nab1Var.k = true;
                                    nab1Var.e.invoke(Integer.valueOf(list.size()));
                                }
                                boolValueOf = null;
                            }
                        }
                    } else {
                        boolValueOf = nab1Var.a(num.intValue());
                        if (boolValueOf == null) {
                            nab1Var.h = null;
                            it = list.iterator();
                            z = true;
                            while (true) {
                                if (it.hasNext()) {
                                    iIntValue = ((Number) it.next()).intValue();
                                    str = (String) nab1Var.c.invoke(Integer.valueOf(iIntValue));
                                    if (str != null) {
                                        iV0 = ihc1.v0(str, '(', i5, i4);
                                        int iA1 = ihc1.A0(str, ')', i5, i4);
                                        int i7 = iA1 + 2;
                                        if (iV0 != -1) {
                                            oge1Var = null;
                                        } else {
                                            oge1Var = null;
                                        }
                                    } else {
                                        oge1Var = null;
                                    }
                                    if (oge1Var == null) {
                                        z = false;
                                    } else if (nab1Var.d.contains(oge1Var.a)) {
                                        nab1Var.h = Integer.valueOf(iIntValue);
                                        nab1Var.k = false;
                                        if (oge1Var.b == 'D') {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        boolValueOf = Boolean.valueOf(z2);
                                    }
                                    i4 = 6;
                                    i5 = 0;
                                } else {
                                    if (z) {
                                        nab1Var.k = true;
                                        nab1Var.e.invoke(Integer.valueOf(list.size()));
                                    }
                                    boolValueOf = null;
                                }
                            }
                        }
                    }
                    if (boolValueOf != null) {
                        sw9Var.D(boolValueOf.booleanValue());
                        nab1Var.j = true;
                    } else {
                        n36Var.clear();
                        sw9Var.b = 0;
                        nab1Var.j = false;
                    }
                }
                mrw0Var.a();
                av7 av7Var = (av7) obj2;
                int i8 = av7Var.b;
                if (i8 > 0) {
                    av7Var.b = i8 - 1;
                } else {
                    int i9 = av7Var.a;
                    av7Var.b = (i9 < 1 ? 1 : i9) - 1;
                    if (((AtomicBoolean) av7Var.f).compareAndSet(false, true)) {
                        fn31.T((llm) av7Var.e, (o8n) null, 0, new n3s(av7Var, (lnm) null, (byte) 25), 3).L(new ux70(av7Var, (byte) 2));
                    }
                }
                rl1 rl1Var = (rl1) obj3;
                Integer num2 = (Integer) ((Function0) rl1Var.c).invoke();
                boolean z3 = num2 == null;
                if (!u890.j(num2, (Integer) rl1Var.e) || z3 != rl1Var.b) {
                    rl1Var.e = num2;
                    rl1Var.b = z3;
                    ((nrw0) rl1Var.d).invoke(num2);
                }
                return rih1Var;
            case 7:
                ObservableEmitter observableEmitter = (ObservableEmitter) obj;
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onNext(new w9x0((String) obj2, ((y8x0) obj3).d));
                    observableEmitter.onComplete();
                }
                return rih1Var;
            case 8:
                Context context = (Context) obj;
                sex0 sex0Var = (sex0) obj3;
                return new bz4(new File(context.getFilesDir(), "profiling"), new File(context.getFilesDir(), "profiling_report_metadata"), (nfa0) ((y0u) obj2).invoke(), new v3v0(1, sex0Var, sex0.class, "createReport", "createReport(Ljava/io/File;)Lcom/spotify/oopsplatform/diagnosticreports/DiagnosticReport;", 0, (byte) 9), sex0Var.c, sex0Var.b);
            case 9:
                return new kpg0(new ng20((wxp) ((jly0) ((wtp) ((alq) obj).a.c).b).get()), new j3y0((String) obj2, (rb3) obj3, (byte) 0));
            case 10:
                wat watVar = (wat) obj3;
                erl1 erl1Var = (erl1) obj2;
                lpb0 lpb0VarH = ((upb0) obj).h();
                int i10 = lpb0VarH.q;
                List list2 = lpb0VarH.n;
                int iP = (int) (lpb0VarH.p() & 4294967295L);
                if (list2.isEmpty()) {
                    i = 1;
                } else {
                    Iterator it2 = list2.iterator();
                    if (!it2.hasNext()) {
                        hhg1.k();
                        return null;
                    }
                    int i11 = ((mpb0) it2.next()).y;
                    while (it2.hasNext()) {
                        int i12 = ((mpb0) it2.next()).y;
                        if (i11 < i12) {
                            i11 = i12;
                        }
                    }
                    i = i11 + 1;
                }
                mpb0 mpb0Var = (mpb0) o7h.C0(list2);
                if (mpb0Var == null || (i3 = mpb0Var.a) <= 0) {
                    i2 = (int) (i10 / i);
                    if (i2 < 1) {
                        i2 = 1;
                    }
                } else {
                    i2 = (int) (i10 * ((mpb0Var.x + 1) / (i3 + 1)));
                    if (i2 < 1) {
                        i2 = 1;
                    }
                }
                return new gg50(i10, i2, i, list2.size() >= 2 ? 1 + (((mpb0) o7h.A0(list2)).x - ((mpb0) o7h.q0(list2)).x) : 1, (iP - erl1Var.c(watVar)) - erl1Var.d(watVar), iP);
            case 11:
                iu30 iu30Var = (iu30) obj;
                iu30Var.invoke(oiz0.a);
                if (((uiz0) obj2).b) {
                    ((ven0) obj3).setValue(Boolean.TRUE);
                } else {
                    iu30Var.invoke(piz0.a);
                }
                return rih1Var;
            case 12:
                a1r0 a1r0Var = (a1r0) obj;
                if (a1r0Var.h((dg30) obj2)) {
                    a1r0Var.g();
                } else {
                    ((lzn0) obj3).e();
                }
                return rih1Var;
            case 13:
                ven0 ven0Var = (ven0) obj3;
                cde1 cde1Var = (cde1) obj;
                if (cde1Var.b() || ((r8e1) ven0Var.getValue()) != null) {
                    cde1Var.a();
                    ven0Var.setValue((Object) null);
                } else {
                    ((Function0) obj2).invoke();
                }
                return rih1Var;
            case 14:
                Function0 function0 = (Function0) obj3;
                iu30 iu30Var2 = (iu30) obj2;
                wuj1 wuj1Var = ((xuj1) obj).a;
                if (wuj1Var instanceof ruj1) {
                    iu30Var2.invoke(ztj1.a);
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else if (wuj1Var instanceof quj1) {
                    iu30Var2.invoke(auj1.a);
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return rih1Var;
            case 15:
                ci01 ci01Var = (ci01) obj2;
                return ((a4f0) obj).e.d(ci01Var, ci01Var, (op80) obj3);
            case 16:
                xmu0 xmu0Var = ((no01) obj).b;
                String str5 = ((udx0) obj2).a;
                String strF = f4i1.f("spotify:user:", (String) obj3, ":artists");
                i8h1 i8h1Var = (i8h1) xmu0Var.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-profile-entity";
                x6h1VarI.f = "12.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str5;
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "profile");
                x6h1VarR.i.add(new a7h1("recently_played_artists", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                x6h1 x6h1VarC3 = x6h1VarR.a().c();
                x6h1VarC3.i.add(new a7h1("see_all_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                ((lzn0) xmu0Var.b).a(strF, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strF)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return rih1Var;
            case 17:
                ((vu30) obj).invoke((ArrayList) obj2, (String) ((ven0) obj3).getValue());
                return rih1Var;
            case 18:
                ((vu30) obj).invoke(o7h.l1((Set) ((ven0) obj3).getValue()), ((y7e1) obj2).d().d.toString());
                return rih1Var;
            case 19:
                x621 x621Var = (x621) obj;
                String str6 = (String) obj2;
                String str7 = (String) obj3;
                xab1 xab1Var = x621Var.f;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                x621Var.f = fn31.T(cto1.q(x621Var.b), (o8n) null, 0, new m311(str6, x621Var, str7, (lnm) null, (byte) 4), 3);
                return rih1Var;
            case 20:
                s880 s880Var = (s880) obj;
                fn31.T(cto1.q((dg30) s880Var.f), (o8n) null, 0, new m311((za21) obj3, s880Var, (String) obj2, (lnm) null, (byte) 12), 3);
                return rih1Var;
            case 21:
                ((iu30) obj).invoke(new qi21(((y7e1) obj2).d().d.toString(), (n5o0) obj3));
                return rih1Var;
            case 22:
                s531 s531Var = (s531) obj;
                i8h1 i8h1Var2 = s531Var.h;
                g5l0 g5l0Var = (g5l0) obj2;
                x6h1 x6h1VarC4 = g5l0Var.c.c();
                x6h1VarC4.i.add(new a7h1("playlist_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA3 = x6h1VarC4.a();
                String str8 = ((d631) obj3).s;
                s531Var.c.f(new dwn0(str8, "", false, false, 0, 0, false, null, null, new bwn0(i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str8)), y6h1VarA3, g5l0Var.b, System.currentTimeMillis()), (xj61) null))));
                return rih1Var;
            case 23:
                boolean zB = ((pe) obj).b(6);
                ven0 ven0Var2 = (ven0) obj3;
                mhm0 mhm0Var = (mhm0) obj2;
                if ((mhm0Var instanceof wfm0) && !zB) {
                    mhm0Var = ((wfm0) mhm0Var).b;
                }
                ven0Var2.setValue(mhm0Var);
                return rih1Var;
            case 24:
                ((iu30) obj).invoke(new nq31(((sq31) obj2).a.a, ((yqg) obj3).b()));
                return rih1Var;
            case 25:
                ((AtomicInteger) obj).incrementAndGet();
                faa0 faa0Var = (faa0) ((p811) obj2).a;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                ((ram0) obj3).dispose();
                return rih1Var;
            case 26:
                tob1 tob1Var = (tob1) obj3;
                tob1 tob1Var2 = (tob1) obj2;
                return new p3v(((Number) tob1Var2.getValue()).intValue() == 0 ? 0.0f : Math.max(((((Number) tob1Var.getValue()).intValue() * ((Number) tob1Var.getValue()).intValue()) / ((Number) tob1Var2.getValue()).intValue()) / ((wat) obj).h(), 52.0f));
            case 27:
                vi11 vi11Var = (vi11) obj;
                return (((di4) vi11Var.f).Y() > 10 ? (rd51) vi11Var.c : (rd51) vi11Var.b).a((Map) obj2, (Map) obj3);
            case 28:
                c4p1.q((y7e1) obj);
                ((iu30) obj2).invoke(c251.a);
                ((Function0) obj3).invoke();
                return rih1Var;
            default:
                ven0 ven0Var3 = (ven0) obj3;
                if (!((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    if (((uex0) ven0Var3.getValue()) != uex0.d) {
                        ven0Var3.setValue(uex0.b);
                    }
                    lz20.b((lz20) obj);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d4v0(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
