package p;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xzf implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ xzf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public void a(lva0 lva0Var) {
        swa0 swa0Var = (swa0) this.b;
        String strB = swa0Var.b();
        ic9 ic9Var = (ic9) this.c;
        i8h1 i8h1Var = (i8h1) ic9Var.b;
        x6h1 x6h1VarC = ((h7l0) ic9Var.c).b.c();
        x6h1VarC.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strB)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        swa0Var.d = twa0.a(swa0Var.d, (String) null, (String) null, lva0Var.b, (dxr0) null, (String) null, (String) null, false, false, 0, (String) null, (yxa0) null, (tpw0) null, 8187);
        Bundle bundle = new Bundle();
        bundle.putParcelable("default_control", swa0Var.d.d);
        bundle.putParcelable("pages", swa0Var.d(nik1.z3));
        bundle.putParcelable("key_flow_type", swa0Var.d.Y);
        swa0Var.a.c(swa0Var.b(), tv80VarM, bundle);
    }

    public final void accept(Object obj) {
        View view;
        View view2;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                qzf qzfVar = (qzf) obj;
                if (!((qzf) obj3).equals(qzfVar)) {
                    yzf yzfVar = (yzf) obj2;
                    qzfVar.getClass();
                    if (qzfVar.a) {
                        i8h1 i8h1VarG = yzfVar.g();
                        h4l0 h4l0Var = yzfVar.a;
                        x6h1 x6h1VarC = h4l0Var.b.c();
                        x6h1VarC.i.add(new a7h1("close_account_dialog", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA;
                        ((xjn) k7h1Var).b = r6h1.c;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        k7h1Var.e = h4l0Var.c;
                        i8h1VarG.f(k7h1Var.a(), (Set) null);
                    }
                    if (qzfVar.c) {
                        yzfVar.g().f(yzfVar.b.e(), (Set) null);
                    }
                }
                break;
            case 1:
                View view3 = (View) obj;
                wnr wnrVar = (wnr) obj2;
                if (view3 == null) {
                    x37 x37Var = wnrVar.c;
                    if (x37Var != null && (view2 = wnrVar.b) != null) {
                        view2.removeOnLayoutChangeListener(x37Var);
                    }
                    wnrVar.c = null;
                    wnrVar.b = null;
                } else {
                    x37 x37Var2 = wnrVar.c;
                    if (x37Var2 != null && (view = wnrVar.b) != null) {
                        view.removeOnLayoutChangeListener(x37Var2);
                    }
                    wnrVar.c = null;
                    wnrVar.b = view3;
                    wnrVar.a(view3);
                    x37 x37Var3 = new x37(wnrVar, view3, (byte) 7);
                    wnrVar.c = x37Var3;
                    view3.addOnLayoutChangeListener(x37Var3);
                }
                for (x4l x4lVar : (Set) obj3) {
                    if (view3 == null) {
                        x4lVar.b();
                    } else {
                        x4lVar.a(view3);
                    }
                }
                break;
            case 2:
                ((Consumer) obj3).accept(((iu30) ((x2y) obj2).d).invoke(obj));
                break;
            case 3:
                a((lva0) obj);
                break;
            case 4:
                zaf0 zaf0Var = (zaf0) obj;
                zaf0 zaf0Var2 = (zaf0) obj2;
                zaf0Var.getClass();
                fad0 fad0Var = ((yaf0) obj3).a;
                yok0 yok0Var = (yok0) fad0Var.c;
                i8h1 i8h1Var = (i8h1) fad0Var.b;
                if (zaf0Var.b) {
                    Iterator it = dm61.v0(o7h.p1(v7f0.a(zaf0Var)), zaf0Var2.b ? o7h.p1(v7f0.a(zaf0Var2)) : w7x.a).iterator();
                    while (it.hasNext()) {
                        switch (((awg1) it.next()).ordinal()) {
                            case 0:
                                x6h1 x6h1VarC2 = yok0Var.b.c();
                                x6h1VarC2.i.add(new a7h1("lossless_compatible_content", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC2.j = true;
                                y6h1 y6h1VarA2 = x6h1VarC2.a();
                                k7h1 k7h1Var2 = new k7h1();
                                ((xjn) k7h1Var2).a = y6h1VarA2;
                                ((xjn) k7h1Var2).b = r6h1.c;
                                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var2.a(), (Set) null);
                                break;
                            case 1:
                                x6h1 x6h1VarC3 = yok0Var.b.c();
                                x6h1VarC3.i.add(new a7h1("cached_but_very_high_settings", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC3.j = true;
                                y6h1 y6h1VarA3 = x6h1VarC3.a();
                                k7h1 k7h1Var3 = new k7h1();
                                ((xjn) k7h1Var3).a = y6h1VarA3;
                                ((xjn) k7h1Var3).b = r6h1.c;
                                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var3.a(), (Set) null);
                                break;
                            case 2:
                                x6h1 x6h1VarC4 = yok0Var.b.c();
                                x6h1VarC4.i.add(new a7h1("opt_out_of_downgrade", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC4.j = true;
                                y6h1 y6h1VarA4 = x6h1VarC4.a();
                                k7h1 k7h1Var4 = new k7h1();
                                ((xjn) k7h1Var4).a = y6h1VarA4;
                                ((xjn) k7h1Var4).b = r6h1.c;
                                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var4.a(), (Set) null);
                                break;
                            case 3:
                                x6h1 x6h1VarC5 = yok0Var.b.c();
                                x6h1VarC5.i.add(new a7h1("bluetooth_degrades_hifi", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC5.j = true;
                                y6h1 y6h1VarA5 = x6h1VarC5.a();
                                k7h1 k7h1Var5 = new k7h1();
                                ((xjn) k7h1Var5).a = y6h1VarA5;
                                ((xjn) k7h1Var5).b = r6h1.c;
                                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var5.a(), (Set) null);
                                break;
                            case 4:
                                x6h1 x6h1VarC6 = yok0Var.b.c();
                                x6h1VarC6.i.add(new a7h1("downgraded_by_backend", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC6.j = true;
                                y6h1 y6h1VarA6 = x6h1VarC6.a();
                                k7h1 k7h1Var6 = new k7h1();
                                ((xjn) k7h1Var6).a = y6h1VarA6;
                                ((xjn) k7h1Var6).b = r6h1.c;
                                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var6.a(), (Set) null);
                                break;
                            case 5:
                                x6h1 x6h1VarC7 = yok0Var.b.c();
                                x6h1VarC7.i.add(new a7h1("poor_bandwidth_interferes", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC7.j = true;
                                y6h1 y6h1VarA7 = x6h1VarC7.a();
                                k7h1 k7h1Var7 = new k7h1();
                                ((xjn) k7h1Var7).a = y6h1VarA7;
                                ((xjn) k7h1Var7).b = r6h1.c;
                                ((xjn) k7h1Var7).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var7.a(), (Set) null);
                                break;
                            case 6:
                                x6h1 x6h1VarC8 = yok0Var.b.c();
                                x6h1VarC8.i.add(new a7h1("need_to_redownload", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC8.j = true;
                                y6h1 y6h1VarA8 = x6h1VarC8.a();
                                k7h1 k7h1Var8 = new k7h1();
                                ((xjn) k7h1Var8).a = y6h1VarA8;
                                ((xjn) k7h1Var8).b = r6h1.c;
                                ((xjn) k7h1Var8).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var8.a(), (Set) null);
                                break;
                            case 7:
                                x6h1 x6h1VarC9 = yok0Var.b.c();
                                x6h1VarC9.i.add(new a7h1("data_saver_on", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC9.j = true;
                                y6h1 y6h1VarA9 = x6h1VarC9.a();
                                k7h1 k7h1Var9 = new k7h1();
                                ((xjn) k7h1Var9).a = y6h1VarA9;
                                ((xjn) k7h1Var9).b = r6h1.c;
                                ((xjn) k7h1Var9).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var9.a(), (Set) null);
                                break;
                            case 8:
                                x6h1 x6h1VarC10 = yok0Var.b.c();
                                x6h1VarC10.i.add(new a7h1("lossless_16_bit", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC10.j = true;
                                y6h1 y6h1VarA10 = x6h1VarC10.a();
                                k7h1 k7h1Var10 = new k7h1();
                                ((xjn) k7h1Var10).a = y6h1VarA10;
                                ((xjn) k7h1Var10).b = r6h1.c;
                                ((xjn) k7h1Var10).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var10.a(), (Set) null);
                                break;
                            case 9:
                                x6h1 x6h1VarC11 = yok0Var.b.c();
                                x6h1VarC11.i.add(new a7h1("lossless_only_downloads", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC11.j = true;
                                y6h1 y6h1VarA11 = x6h1VarC11.a();
                                k7h1 k7h1Var11 = new k7h1();
                                ((xjn) k7h1Var11).a = y6h1VarA11;
                                ((xjn) k7h1Var11).b = r6h1.c;
                                ((xjn) k7h1Var11).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var11.a(), (Set) null);
                                break;
                            case 10:
                                x6h1 x6h1VarC12 = yok0Var.b.c();
                                x6h1VarC12.i.add(new a7h1("lossless_try_wifi_or_download", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC12.j = true;
                                y6h1 y6h1VarA12 = x6h1VarC12.a();
                                k7h1 k7h1Var12 = new k7h1();
                                ((xjn) k7h1Var12).a = y6h1VarA12;
                                ((xjn) k7h1Var12).b = r6h1.c;
                                ((xjn) k7h1Var12).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var12.a(), (Set) null);
                                break;
                            case 11:
                                x6h1 x6h1VarC13 = yok0Var.b.c();
                                x6h1VarC13.i.add(new a7h1("lossless_try_cellular_or_download", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC13.j = true;
                                y6h1 y6h1VarA13 = x6h1VarC13.a();
                                k7h1 k7h1Var13 = new k7h1();
                                ((xjn) k7h1Var13).a = y6h1VarA13;
                                ((xjn) k7h1Var13).b = r6h1.c;
                                ((xjn) k7h1Var13).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var13.a(), (Set) null);
                                break;
                            case 12:
                                x6h1 x6h1VarC14 = yok0Var.b.c();
                                x6h1VarC14.i.add(new a7h1("lossless_only_on_other_device", (String) null, (Integer) null, (String) null, (String) null));
                                x6h1VarC14.j = true;
                                y6h1 y6h1VarA14 = x6h1VarC14.a();
                                k7h1 k7h1Var14 = new k7h1();
                                ((xjn) k7h1Var14).a = y6h1VarA14;
                                ((xjn) k7h1Var14).b = r6h1.c;
                                ((xjn) k7h1Var14).c = Long.valueOf(System.currentTimeMillis());
                                i8h1Var.f(k7h1Var14.a(), (Set) null);
                                break;
                            default:
                                eg.o();
                                break;
                        }
                    }
                }
                break;
            case 5:
                fn31.T((llm) obj3, (o8n) null, 0, new hyg0((ipb1) obj2, obj, (lnm) null), 3);
                break;
            case 6:
                new Handler(Looper.getMainLooper()).post(new uu1((gob1) obj, (kyo0) obj3, (Set) obj2, (byte) 21));
                break;
            default:
                yfc1 yfc1Var = (yfc1) obj;
                ufc1 ufc1Var = (ufc1) obj3;
                yfc1 yfc1Var2 = (yfc1) obj2;
                yfc1Var.getClass();
                y6h1 y6h1Var = ufc1Var.b.b;
                i8h1 i8h1Var2 = ufc1Var.a;
                if (!yfc1Var2.b() && yfc1Var.b()) {
                    x6h1 x6h1VarC15 = y6h1Var.c();
                    x6h1VarC15.i.add(new a7h1("onboarding_card", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = true;
                    y6h1 y6h1VarA15 = x6h1VarC15.a();
                    k7h1 k7h1Var15 = new k7h1();
                    ((xjn) k7h1Var15).a = y6h1VarA15;
                    ((xjn) k7h1Var15).b = r6h1.c;
                    ((xjn) k7h1Var15).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var2.f(k7h1Var15.a(), (Set) null);
                }
                if (yfc1Var2.c != 1 && yfc1Var.c == 1) {
                    x6h1 x6h1VarC16 = y6h1Var.c();
                    x6h1VarC16.i.add(new a7h1("streaming_quality_card", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC16.j = true;
                    y6h1 y6h1VarA16 = x6h1VarC16.a();
                    k7h1 k7h1Var16 = new k7h1();
                    ((xjn) k7h1Var16).a = y6h1VarA16;
                    ((xjn) k7h1Var16).b = r6h1.c;
                    ((xjn) k7h1Var16).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var2.f(k7h1Var16.a(), (Set) null);
                }
                break;
        }
    }
}
