package p;

import android.R;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;
import androidx.core.widget.NestedScrollView;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tr41 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;

    public tr41(jj91 jj91Var, byte b) {
        this.a = b;
        switch (b) {
            case 17:
                this.b = new dy40(jj91Var, (byte) 23);
                break;
            case 18:
                this.b = new o881(jj91Var, (byte) 1);
                break;
            case 19:
            case 20:
            default:
                this.b = new o881(jj91Var, (byte) 0);
                break;
            case 21:
                this.b = new o881(jj91Var, (byte) 2);
                break;
        }
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                NestedScrollView nestedScrollView = (NestedScrollView) obj;
                mzr0 mzr0Var = (mzr0) this.b;
                if (nestedScrollView.isAttachedToWindow()) {
                    int iRound = Math.round((nestedScrollView.computeVerticalScrollOffset() * 100.0f) / (nestedScrollView.computeVerticalScrollRange() - nestedScrollView.computeVerticalScrollExtent()));
                    yxk0 yxk0Var = (yxk0) mzr0Var.d;
                    Integer numValueOf = Integer.valueOf(iRound);
                    x6h1 x6h1VarC = yxk0Var.c.c();
                    x6h1VarC.i.add(new a7h1("scrolling_view", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = yxk0Var.b;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = yxk0Var.d;
                    ((i8h1) ((idd1) mzr0Var.g).getValue()).f(k7h1Var.a(), (Set) null);
                }
                break;
            case 1:
                ((ny41) this.b).c.c(((fo3) obj).d);
                break;
            case 2:
                ((u551) this.b).U((q151) obj);
                break;
            case 3:
                jz51 jz51Var = ((a061) this.b).a;
                a1r0 a1r0Var = jz51Var.b;
                if (!a1r0Var.h(jz51Var.c)) {
                    jz51Var.a.e();
                } else {
                    a1r0Var.l();
                }
                break;
            case 4:
                jl8 jl8Var = (jl8) obj;
                ywv0 ywv0Var = (ywv0) this.b;
                if (!u890.j(((kdn0) ywv0Var.f).e(), jl8Var)) {
                    ((kdn0) ywv0Var.f).m(jl8Var);
                }
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((od61) this.b).a.a().e(new mmr0("com.spotify.music.extra.OFFLINE_MODE", bool));
                break;
            case 6:
                String str = (String) obj;
                xi61 xi61Var = (xi61) this.b;
                bpb1 bpb1Var = xi61Var.h;
                zai1 zai1Var = new zai1(str);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, zai1Var);
                if (xi61Var.c) {
                    rhn rhnVar = xi61Var.a;
                    h5z h5zVar = new h5z(xi61Var, (byte) 4);
                    rhn rhnVar2 = rhnVar;
                    dma1 dma1Var = rhnVar2.b;
                    qhn.a.getClass();
                    String strE = dma1Var.e(phn.b, (String) null);
                    String strE2 = dma1Var.e(phn.c, (String) null);
                    if (strE2 != null && u890.j(strE, str)) {
                        h5zVar.accept(strE2);
                    } else {
                        if (!rhnVar2.f.isDisposed()) {
                            rhnVar2.f.dispose();
                        }
                        rhnVar2.f = Single.defer(new yj1(rhnVar2, (byte) 4)).subscribeOn(rhnVar2.e).retryWhen(new ifl1(rhnVar2, (byte) 11)).observeOn(rhnVar2.d).subscribe(new qg7(str, rhnVar2, h5zVar, (byte) 5), fcc.O0);
                    }
                }
                break;
            case 7:
                u5v0 u5v0Var = (u5v0) this.b;
                an3 an3Var = u5v0Var.b;
                Activity activity = u5v0Var.a;
                activity.startActivityForResult(an3Var.a(activity, EntryPoint.LIBRARY_ADD_PODCASTS), 123, ActivityOptions.makeCustomAnimation(activity, R.anim.fade_in, R.anim.fade_out).toBundle());
                break;
            case 8:
                bxd0 bxd0Var = (bxd0) obj;
                xh71.b((xh71) this.b, new wa71(bxd0Var.a, null, null, null, null, null, null, 126), (Bundle) null, new vm71("livestream-control-section"), bxd0Var.b, (List) null, 18);
                break;
            case 9:
                vq71 vq71Var = ((t8u) obj).a;
                g9l1 g9l1Var = (g9l1) this.b;
                if (vq71Var != null) {
                    String str2 = vq71Var.a;
                    vq71 vq71Var2 = g9l1Var.j;
                    if (!u890.j(str2, vq71Var2 != null ? vq71Var2.a : null) || vq71Var.a == null) {
                        if (g9l1Var.l == null) {
                            g9l1Var.d.getLifecycle().a(g9l1Var.k);
                            g9l1Var.l = fn31.T(g9l1Var.g, (o8n) null, 0, new t6j1(g9l1Var, (lnm) null, (byte) 20), 3);
                        }
                        g9l1Var.b(vq71Var, g9l1Var.f(vq71Var));
                    }
                } else if (!(((mt71) g9l1Var.o.getValue()) instanceof lt71)) {
                    ((g9l1) this.b).a();
                }
                break;
            case 10:
                df7 df7Var = (df7) obj;
                ((yh2) this.b).b(df7Var.d, df7Var.e);
                break;
            case 11:
                ((gr6) this.b).a((String) null, ((g0w0) obj).d);
                break;
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                wnh1 wnh1Var = (wnh1) ((r961) this.b).b;
                if (!zBooleanValue) {
                    wnh1.H(wnh1Var);
                } else {
                    wnh1Var.F();
                }
                break;
            case 13:
                ((eh30) this.b).a(((jxd0) obj).a, (p350) null);
                break;
            case 14:
                nn61 nn61Var = (nn61) this.b;
                ((jjz) nn61Var.c).a(new xiz(fjz.b, new yiz(((Context) nn61Var.b).getString(2131964183)), ajz.c), da71.a1, da71.b1);
                break;
            case 15:
                s0n1 s0n1Var = (s0n1) obj;
                ((yhm) ((n801) this.b).b).a(new i2n1(s0n1Var.c, s0n1Var.e), s0n1Var.d);
                break;
            case 16:
                ((o881) this.b).accept((wj91) obj);
                break;
            case 17:
                ((dy40) this.b).accept((xj91) obj);
                break;
            case 18:
                ((o881) this.b).accept((yj91) obj);
                break;
            case 19:
                pyd1 pyd1Var = (pyd1) this.b;
                if (!pyd1Var.d.c()) {
                    pyd1Var.c.a().g1(pyd1Var.b, "terms-sheet-fragment");
                    break;
                } else {
                    Set set = s4b1.f;
                    String strZ = uic.x("spotify:internal:comments:terms").z();
                    if (strZ != null) {
                        a1r0.j(pyd1Var.a, strZ, (String) null, (Bundle) null, true, 6);
                        break;
                    }
                }
                break;
            case 20:
                k0w0 k0w0Var = (k0w0) obj;
                ((ssf1) this.b).b(new dmf1(k0w0Var.d, nik1.m3, "", new vsf1((String) null, (String) null, false, (String) null, false, false, true, false, false, true, (String) null, false, false, false, true, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -34241, 63), (Map) null), k0w0Var.f);
                break;
            case 21:
                ((o881) this.b).accept((zj91) obj);
                break;
            case 22:
                t0n1 t0n1Var = (t0n1) obj;
                ((yhm) ((q881) this.b).b).a(new s2n1(t0n1Var.d, t0n1Var.e), t0n1Var.c);
                break;
            case 23:
                ((g291) this.b).b.a(new l2l1(null, 1, Collections.singletonMap("source", "backend"), "resolvingSiteSucceeded"));
                break;
            case 24:
                ((ma91) this.b).a.v(((w181) obj).b);
                break;
            case 25:
                ((na91) this.b).c.v(((w181) obj).b);
                break;
            case 26:
                pn91 pn91Var = (pn91) obj;
                ((qn91) this.b).c.onNext(o7h.N0(pn91Var.c, p7h.N(pn91Var.b)));
                break;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                rq91 rq91VarZ0 = ((qq91) this.b).Z0();
                rq91VarZ0.U(new mhv0("phone_number_otp", "otp", ew80.b, (String) null));
                if (!rq91VarZ0.Y) {
                    rq91VarZ0.Y = true;
                    i8h1 i8h1Var = rq91VarZ0.c;
                    x6h1 x6h1VarC2 = rq91VarZ0.t.b.c();
                    x6h1VarC2.i.add(new a7h1("otp_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.j(new w7h1("", "", new z7h1("key_stroke", 1, b7x.a), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()));
                }
                break;
            case 28:
                i4a1 i4a1Var = (i4a1) obj;
                y281 y281Var = ((xx91) this.b).k;
                i4a1Var.getClass();
                boolean z = i4a1Var.a;
                boolean z2 = i4a1Var.d;
                boolean z3 = i4a1Var.e;
                boolean z4 = i4a1Var.g;
                boolean z5 = i4a1Var.h;
                boolean z6 = i4a1Var.i;
                String str3 = i4a1Var.k;
                ((BehaviorSubject) y281Var.b).onNext(new k5a1(z, z2, z3, z4, z5, z6, str3 == null ? "" : str3, i4a1Var.c, i4a1Var.l, i4a1Var.o, i4a1Var.F, i4a1Var.G, i4a1Var.m, i4a1Var.p, i4a1Var.r, i4a1Var.s, i4a1Var.t, i4a1Var.v, i4a1Var.w, i4a1Var.x, i4a1Var.y, i4a1Var.z, i4a1Var.A, i4a1Var.B, i4a1Var.C, i4a1Var.D, i4a1Var.E));
                break;
            default:
                u0a1 u0a1Var = (u0a1) this.b;
                String str4 = u0a1.j2;
                u0a1Var.i2 = obj;
                u0a1Var.p1().f(obj);
                break;
        }
    }

    public /* synthetic */ tr41(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
