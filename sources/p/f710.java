package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity;
import com.spotify.listuxplatformconsumers.likedsongs.shared.filtertagsdata.FilterTagsDatabase_Impl;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.ObservableSource;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f710 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f710(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        jpg0 jpg0Var;
        String string;
        r4r r4rVar;
        switch (this.a) {
            case 0:
                return (pta1) ((g710) this.b).b.get();
            case 1:
                return ((Context) ((p410) this.b).b).getString(2131952598);
            case 2:
                return new nuk0(((ed10) this.b).h());
            case 3:
                daq daqVar = ((re10) this.b).c.a.b;
                return new mf0((pe) daqVar.p9.get(), (hgd0) daqVar.Xd.get());
            case 4:
                ((los) ((pt) this.b).h).a(ixb.c);
                return rih1.a;
            case 5:
                return Integer.valueOf(((pm10) this.b).c.size());
            case 6:
                o6x o6xVar = o6x.a;
                at10 at10Var = (at10) ((oas) this.b).b.get();
                sap sapVar = at10Var.b;
                s691 s691Var = at10Var.i;
                xfx xfxVar = at10Var.a;
                tfx tfxVar = xfxVar.a;
                ye51 ye51Var = new ye51(s691Var.a(voo1.s(xfxVar)), at10Var.j.a(voo1.r(xfxVar)));
                ye51 ye51Var2 = new ye51(at10Var.h.a(voo1.v(xfxVar), false), at10Var.k);
                jpg0 jpg0Var2 = new jpg0(at10Var.g.a(voo1.t(xfxVar, (xzf1) null)), zs10.b);
                yl1 yl1Var = at10Var.d;
                jpg0 jpg0Var3 = new jpg0(yl1Var.a(voo1.i(xfxVar)), zs10.c);
                jpg0 jpg0Var4 = new jpg0(yl1Var.a(voo1.i(xfxVar)), zs10.d);
                if (at10Var.r.a()) {
                    p621 p621Var = (p621) at10Var.f.get();
                    jpg0Var = new jpg0(new im0(p621Var.a, yoi1.h(pno1.j(p621Var.b), o6xVar), p621Var.c, new h98(tfxVar.a, (byte) 15), p621Var.d, p621Var.e, p621Var.f.a(p621Var.g.a, p621Var.a), p621Var.h, p621Var.i), zs10.e);
                } else {
                    s3a s3aVar = (s3a) at10Var.e.get();
                    jpg0Var = new jpg0(new bs0(s3aVar.a, yoi1.h(pno1.j(s3aVar.b), o6xVar), s3aVar.c, s3aVar.d, new yir(tfxVar.a, (byte) 0)), zs10.f);
                }
                uo5 uo5Var = new uo5(jpg0Var3, jpg0Var4, jpg0Var, (byte) 17);
                eyh0 eyh0Var = new eyh0(at10Var.m.a(voo1.o(xfxVar)), o671.a(at10Var.l, voo1.u(xfxVar)), 4);
                lkf1 lkf1Var = lkf1.b;
                mr20 mr20Var = at10Var.u;
                return sap.b(sapVar, ye51Var, ye51Var2, jpg0Var2, uo5Var, eyh0Var, p7h.M(new lzd[]{new lzd(lkf1Var, mr20Var), new lzd(lkf1.a, mr20Var), new lzd(lkf1.g, (Object) null)}), new xq60(Collections.singletonList(new wzq(at10Var.n.a(), zs10.g))), at10Var.c.a(), new bjx(new gi00(at10Var, (byte) 13), zs10.h, zs10.i, xc10.c1, xc10.d1, xc10.e1, (byte) 18), new a5p0(at10Var.f1p, at10Var.q, at10Var.o), (Function0) null, (Function0) null, 3072);
            case 7:
                fdc fdcVar = (fdc) this.b;
                m0u0 m0u0Var = (m0u0) fdcVar.d;
                Uri uri = Uri.parse(m0u0Var.a.a);
                String strD = zod.D(m0u0Var);
                boolean z = u890.j(m0u0Var.d(), "interactive-dj") || u890.j(m0u0Var.d(), "martini");
                fxu fxuVar = (iru) fdcVar.c;
                URL url = new URL(uri.toString());
                String str = m0u0Var.d;
                fxu fxuVar2 = fxuVar;
                j25 j25Var = fxuVar2.b;
                return new f520(fxuVar2.a, fxuVar2, url, strD, str, new g520(j25Var.b(), j25Var.a(), j25Var.c()), z, fxuVar2.c);
            case 8:
                return new bf20((FilterTagsDatabase_Impl) this.b);
            case 9:
                y7c0 y7c0VarA = ((xhp) ((x030) this.b).b).a();
                y7c0VarA.b();
                return RxEventSources.a(new ObservableSource[]{y7c0VarA.a(w030.a)});
            case 10:
                b14 b14Var = (b14) this.b;
                ((iu30) b14Var.b).invoke(new q430(true));
                b14Var.c();
                return rih1.a;
            case 11:
                a630 a630Var = (a630) this.b;
                s530 s530Var = a630Var.i;
                a630Var.Y0 = s530Var.a();
                a630Var.Z0 = s530Var.d();
                a630Var.X0 = nln.x(i330.a1, nln.v(new x530(a630Var, (byte) 0)));
                a630Var.t.start();
                a630Var.X.start();
                a630Var.Y.start();
                a630Var.Z.start();
                a630Var.N0.start();
                a630Var.O0.start();
                a630Var.P0.start();
                zll zllVar = a630Var.Q0;
                zllVar.getClass();
                zllVar.c = l1d.g(Mobius.d(xxb0.f, zllVar.a.a(zllVar.b.a))).g(new whx0(b7x.a));
                dnc0 dnc0VarB = hvp0.b(a630Var.d);
                dnc0VarB.b(new gj50(new x530(a630Var, (byte) 1), true), new x530(a630Var, (byte) 2));
                cnc0 cnc0VarA = dnc0VarB.a();
                a630Var.T0 = (snc0) cnc0VarA.a.invoke();
                a630Var.U0 = cnc0VarA.c;
                a630Var.V0 = cnc0VarA.b;
                t5p1.j(a630Var.k().c(), 3).f(a630Var.f, new z11(a630Var, (byte) 17));
                return rih1.a;
            case 12:
                Bundle extras = ((ForcedGraduationLockActivity) this.b).getIntent().getExtras();
                if (extras == null || (string = extras.getString("graduation_age")) == null) {
                    return null;
                }
                return nhc1.c0(string);
            case 13:
                return rqt0.u(((cdn0) ((w2z) this.b).b).b);
            case 14:
                krw0.i.f.d((fd30) this.b);
                return rih1.a;
            case 15:
                return (mb00) ((td30) this.b).a.b.w.getValue();
            case 16:
                zh30 zh30Var = (zh30) this.b;
                if (zh30Var.d.i(new y0u(0, zh30Var, zh30.class, "connectFragmentLifecycle", "connectFragmentLifecycle()V", 0, (byte) 27))) {
                    vr51 vr51Var = zh30Var.Q0;
                    if (vr51Var != null) {
                        vr51Var.c();
                    }
                    zh30Var.Q0 = null;
                }
                return rih1.a;
            case 17:
                return ((zf30) this.b).Q0().findViewById(2131430276);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                jm30 jm30Var = (jm30) ((oas) this.b).b.get();
                yl1 yl1Var2 = jm30Var.c;
                dxy dxyVar = jm30Var.g;
                xfx xfxVar2 = jm30Var.a;
                sap sapVar2 = jm30Var.b;
                pn4 pn4Var = jm30Var.w;
                ye51 ye51Var3 = new ye51(pn4Var.a() ? dxyVar.t(new im30(jm30Var, (byte) 2), new im30(jm30Var, (byte) 3), 3) : ((s691) jm30Var.h.get()).a(voo1.s(xfxVar2)), pn4Var.a() ? dxyVar.t(new im30(jm30Var, (byte) 4), new im30(jm30Var, (byte) 5), 3) : ((k691) jm30Var.i.get()).a(voo1.r(xfxVar2)));
                wpw wpwVarT = pn4Var.a() ? dxyVar.t(new im30(jm30Var, (byte) 6), new im30(jm30Var, (byte) 7), 1) : new jpg0(((mo51) jm30Var.e.get()).a(voo1.t(xfxVar2, (xzf1) null)), jl30.Q0);
                jpg0 jpg0Var5 = new jpg0(yl1Var2.a(voo1.i(xfxVar2)), jl30.R0);
                jpg0 jpg0Var6 = new jpg0(yl1Var2.a(voo1.i(xfxVar2)), jl30.S0);
                s3a s3aVar2 = jm30Var.d;
                uo5 uo5Var2 = new uo5(jpg0Var5, jpg0Var6, new jpg0(new bs0(s3aVar2.a, yoi1.h(pno1.j(s3aVar2.b), o6x.a), s3aVar2.c, s3aVar2.d, new yir(xfxVar2.a.a, (byte) 0)), jl30.e), (byte) 17);
                eyh0 eyh0Var2 = new eyh0(o671.a(jm30Var.n, voo1.u(xfxVar2)), (im0) null, 6);
                lzd lzdVar = new lzd(lkf1.c, (Object) null);
                lkf1 lkf1Var2 = lkf1.b;
                mr20 mr20Var2 = jm30Var.x;
                List listM = p7h.M(new lzd[]{lzdVar, new lzd(lkf1Var2, mr20Var2), new lzd(lkf1.a, mr20Var2), new lzd(lkf1.g, (Object) null)});
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new wzq(jm30Var.o.a(), jl30.f));
                smc0VarN.add(new jpg0(f6o1.A(duy.a(jm30Var.l, 3), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), jl30.g));
                smc0VarN.add(new wzq(fdg1.m0(vsy.a(jm30Var.m), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), jl30.h));
                return sap.b(sapVar2, ye51Var3, (ye51) null, wpwVarT, uo5Var2, eyh0Var2, listM, new xq60(k4p1.k(smc0VarN)), (yxb0) null, new bjx(new u830(jm30Var, (byte) 5), jl30.i, jl30.t, jl30.X, jl30.Y, jl30.Z, (byte) 18), new a5p0(jm30Var.q, jm30Var.r, jm30Var.f30p), new im30(jm30Var, (byte) 0), new im30(jm30Var, (byte) 1), 128);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((ym90) this.b).d.invoke(zea0.a);
                return rih1.a;
            case 20:
                return Float.valueOf(((nn30) this.b).z);
            case 21:
                ((is30) this.b).h.a();
                return rih1.a;
            case 22:
                return (ViewGroup) ((hw30) this.b).X.findViewById(2131428985);
            case 23:
                jy30 jy30Var = (jy30) this.b;
                return jy30Var.c.c(jy30Var.b);
            case 24:
                return ((ttm0) ((cz30) this.b).a.get()).c(false);
            case 25:
                ((a1r0) this.b).l();
                return rih1.a;
            case 26:
                at40 at40Var = (at40) this.b;
                synchronized (at40.d) {
                    r4rVar = at40.f;
                    if (r4rVar == null) {
                        Context context = at40Var.a;
                        mma0[] mma0VarArr = ys40.a;
                        r4rVar = (r4r) at40.e.a(context, ys40.a[0]);
                        at40.f = r4rVar;
                    }
                    break;
                }
                return r4rVar;
            case 27:
                return (MessageResponseToken) ((pu40) ((tm) this.b).d).invoke();
            case 28:
                mu40 mu40Var = (mu40) this.b;
                fn31.T(cto1.q(mu40Var.d), (o8n) null, 0, new lu40(mu40Var, (lnm) null, (byte) 1), 3);
                return rih1.a;
            default:
                return ((ttk0) this.b).e();
        }
    }
}
