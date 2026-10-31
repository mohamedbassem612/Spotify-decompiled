package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.UserDecorationPolicy;
import com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yeu0 implements Function, vmy, mod1, pt71, ObservableOnSubscribe {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public yeu0(xrc0 xrc0Var) {
        this.a = (byte) 5;
        this.b = xrc0Var;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.R();
        sku0VarP.Z();
        i8i1 i8i1VarO = UserDecorationPolicy.o();
        i8i1VarO.s();
        sku0VarP.X(i8i1VarO.build());
        hru0VarS.x(sku0VarP);
        this.c = hru0VarS.build();
    }

    public static fhu0 k(yeu0 yeu0Var, lby lbyVar, tfu0 tfu0Var, d8r0 d8r0Var, String str, int i) {
        boolean zB = ((fza1) yeu0Var.c).b(lbyVar.a);
        return new fhu0(lbyVar.a, lbyVar.b, tb51.i((tb51) yeu0Var.b, lbyVar, false, zB, 2), lbyVar.c, str, d8r0Var, i, tfu0Var.c, (Integer) null, (String) null, zB, lbyVar.g);
    }

    public static hwu0 l(yeu0 yeu0Var, long j, long j2, int i) {
        cqz0 cqz0Var = dqz0.a;
        long j3 = (i & 8) != 0 ? 0L : 5L;
        boolean z = (i & 16) == 0;
        e9 e9Var = dqz0.b;
        long jK = e9Var.k(j3, j + 1);
        long jK2 = e9Var.k(0L, Math.min(jK, j2) + 1);
        if (z && e9Var.l().nextBoolean()) {
            jK2 = -jK2;
        }
        return new hwu0(jK, jK2);
    }

    @Override // p.pt71
    public ut71 a() {
        return (fma1) this.b;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return Flowable.h((Flowable) obj3, (Flowable) obj2, kc20.a1);
            case 1:
                Logger.e((Throwable) obj, "Fallback to change list with default changesListEndpoint", new Object[0]);
                ufu0 ufu0Var = (ufu0) obj2;
                return efe.b(((agu0) obj3).b, ufu0Var.b, agu0.a(ufu0Var), (wf90) null, 4, (Object) null).doOnError(xfs0.X).ignoreElement();
            case 12:
                th61 th61Var = (th61) obj;
                tzr0 tzr0Var = (tzr0) obj3;
                boolean z = th61Var.b;
                if (z) {
                    return Observable.create(new jxp0(tzr0Var, (byte) 13)).startWith(Observable.just(Boolean.FALSE)).switchMap(new xmu0(tzr0Var, (ln41) obj2, (byte) 7)).distinctUntilChanged().publish(new vyq0((Object) tzr0Var, (byte) 10));
                }
                return (z || th61Var.c) ? Observable.never() : Observable.just(b7x.a);
            case 14:
                tig0 tig0Var = (tig0) obj;
                tv80 tv80Var = (tv80) obj2;
                ywv0 ywv0Var = (ywv0) obj3;
                return tig0Var instanceof rig0 ? new CompletableFromAction(new wf0(ywv0Var, tig0Var, tv80Var, (byte) 9)).s((Scheduler) ywv0Var.i) : pqs.a((pqs) ywv0Var.g).flatMapCompletable(new yqu0(ywv0Var, tv80Var, (byte) 8)).h(xfs0.R0).o(Functions.h);
            case 16:
                Map map = (Map) obj;
                aru0 aru0Var = (aru0) obj3;
                return ((u0w0) aru0Var.c).a((String) obj2).flatMap(new vhd(y7y0.A(map), aru0Var, (y7y0.G(map) || y7y0.L(map) || y7y0.C(map)) ? false : true));
            case 21:
                eww0 eww0Var = (eww0) obj;
                String str = eww0Var.f;
                String str2 = eww0Var.b;
                String str3 = eww0Var.a;
                www0 www0Var = (www0) obj3;
                Context context = www0Var.a;
                vww0 vww0Var = (vww0) obj2;
                String string = UUID.randomUUID().toString();
                b0x0 b0x0Var = www0Var.g;
                b0x0Var.getClass();
                SingleSubject singleSubject = new SingleSubject();
                b0x0Var.a.put(string, singleSubject);
                Single singleDoFinally = singleSubject.doFinally(new tt60(b0x0Var, string, (byte) 16));
                if (www0Var.h.a.o()) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(nik1.g7.a));
                    intent.setFlags(268435456);
                    intent.putExtra("profile_completion_username", str3);
                    intent.putExtra("profile_completion_display_name", str2);
                    intent.putExtra("profile_completion_profile_pic", str);
                    intent.putExtra("profile_completion_is_wrapped", vww0Var == vww0.d);
                    intent.putExtra("profile_completion_feature_identifier", vww0Var.a);
                    intent.putExtra("profile_completion_session_id", string);
                    context.startActivity(intent);
                } else {
                    int i = ProfileCompletionSheetHostActivity.k1;
                    String str4 = vww0Var.a;
                    Intent intent2 = new Intent(context, (Class<?>) ProfileCompletionSheetHostActivity.class);
                    intent2.setFlags(268435456);
                    intent2.putExtra("feature_identifier_extra", str4);
                    intent2.putExtra("session_id_extra", string);
                    intent2.putExtra("profile_extra", (Parcelable) new tzw0(str3, str2, str, str4.equals("wrapped")));
                    context.startActivity(intent2);
                }
                return singleDoFinally;
            case 22:
                n1x0 n1x0Var = (n1x0) obj;
                return ((cfi1) obj3).e(n1x0Var.g, n1x0Var.h ? Boolean.TRUE : null).observeOn((Scheduler) obj2).map(yj20.c1).doOnError(xfs0.b1).onErrorReturn(zj20.b1).toObservable();
            case 23:
                return ((o241) obj3).b("ugc-abuse-report-url").observeOn((Scheduler) obj2).map(f2x0.b);
            case 27:
                return ((sdx0) obj3).a((List) obj, false, (udx0) obj2);
            case 28:
                return ((tzr0) obj3).h((v9x0) obj2, (eww0) ((spq0) obj).b());
            default:
                cbv cbvVar = (cbv) ((et90) obj3).e;
                cbvVar.getClass();
                cbvVar.a = ((ContextTrack) obj2).uri();
                return Flowable.I(Boolean.FALSE);
        }
    }

    public View b(ViewGroup viewGroup, jto jtoVar, iu30 iu30Var, iu30 iu30Var2, boolean z, Function0 function0, qwc1 qwc1Var) {
        View viewB = ((teb) this.b).b(viewGroup, jtoVar, iu30Var, iu30Var2, z, function0, qwc1Var);
        iac0 iac0Var = (iac0) this.c;
        if (iac0Var.getLifecycle().b() != w8c0.a) {
            new vev0(viewB, iac0Var);
        }
        return viewB;
    }

    public void d(String str, uiw0 uiw0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var;
        h2c h2cVar;
        boolean z;
        drr0 drr0Var;
        qim0 qim0Var;
        String strN0;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        tl3 tl3Var = een.h;
        gra graVar = een.d;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1756107422);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str) ? 32 : 16) | (x340Var2.g(uiw0Var) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | (x340Var2.i(this) ? 16384 : 8192);
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = uiw0Var instanceof siw0;
            boolean z3 = uiw0Var instanceof riw0;
            boolean z4 = z2 || (uiw0Var instanceof qiw0);
            tob1 tob1VarB = z95.b(!z3 ? 1.0f : 0.0f, irn1.o0(300, 0, (dlv) null, 6), "overlayAlpha", (iu30) null, x340Var2, 3120, 20);
            x340Var = x340Var2;
            float fFloatValue = ((Number) tob1VarB.getValue()).floatValue();
            qim0 qim0Var2 = nim0.a;
            h2c h2cVar2 = h2c.a;
            n4k n4kVar = hmb0.t1;
            if (fFloatValue > 0.0f) {
                x340Var.i0(800973468);
                float f = z4 ? 0.5f : 0.3f;
                if (z4) {
                    strN0 = x0d.k(x340Var, -1948072, 2131955234, x340Var, false);
                } else {
                    x340Var.i0(-1944790);
                    strN0 = cwl1.n0(2131955235, new Object[]{str}, x340Var);
                    x340Var.r(false);
                }
                x340Var.i0(302940535);
                qim0 qim0VarK = d9y0.k(h2cVar2.b(qim0Var2), ((Number) tob1VarB.getValue()).floatValue());
                if (z3) {
                    h2cVar2 = h2cVar2;
                } else {
                    boolean zG = x340Var.g(strN0);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        objT = new zqu0(strN0, (byte) 16);
                        x340Var.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(qim0Var2, false, (iu30) objT);
                    pm31 pm31Var = new pm31(0);
                    boolean zH = ((i2 & 7168) == 2048) | x340Var.h(z4);
                    Object objT2 = x340Var.T();
                    if (zH || objT2 == m4cVar) {
                        objT2 = new z20(iu30Var, z4, (byte) 24);
                        x340Var.s0(objT2);
                    }
                    qim0VarK = qim0VarK.then(bin.x(qim0VarB, false, (String) null, pm31Var, (idn0) null, (Function0) objT2, 11));
                }
                x340Var.r(false);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarK, u7h.b(cbx.a(x340Var).a.c, f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                spx spxVar = z4 ? spx.c : xpx.c;
                zov0 zov0Var = cbx.b(x340Var).g;
                tl3Var = tl3Var;
                h2cVar = h2cVar2;
                w0h1.a(spxVar, isl.a, h2cVar.a(u291.r(qim0Var2, 12.0f), tl3Var), 0L, 0L, false, x340Var, 56, 56);
                x340Var = x340Var;
                x340Var.r(true);
                z = false;
                x340Var.r(false);
            } else {
                h2cVar = h2cVar2;
                z = false;
                x340Var.i0(801930624);
                x340Var.r(false);
            }
            if (z2) {
                x340Var.i0(801995600);
                boolean z5 = z;
                siw0 siw0Var = (siw0) uiw0Var;
                int i3 = ((i2 >> 6) & 14) | ((i2 >> 9) & 112);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = us71.i(0.0f, x340Var);
                }
                drr0 drr0Var2 = (drr0) objT3;
                boolean zI = (((((i3 & 14) ^ 6) <= 4 || !x340Var.g(siw0Var)) && (i3 & 6) != 4) ? z5 : true) | x340Var.i(this);
                Object objT4 = x340Var.T();
                if (zI || objT4 == m4cVar) {
                    drr0Var = drr0Var2;
                    qim0Var = qim0Var2;
                    glu0 glu0Var = new glu0(siw0Var, this, drr0Var, (lnm) null, (byte) 11);
                    x340Var.s0(glu0Var);
                    objT4 = glu0Var;
                } else {
                    drr0Var = drr0Var2;
                    qim0Var = qim0Var2;
                }
                qxd0.t(siw0Var, x340Var, (vu30) objT4);
                float fS = drr0Var.s();
                qim0 qim0VarB2 = h2cVar.b(qim0Var);
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = p7w0.Z;
                    x340Var.s0(objT5);
                }
                qim0 qim0VarA = s161.a(qim0VarB2, (iu30) objT5);
                gfh0 gfh0VarC2 = t1c.c(graVar, z5);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                long j = u7h.j;
                qim0 qim0VarA2 = h2cVar.a(qim0Var, tl3Var);
                uwr uwrVar2 = cbx.a;
                x340 x340Var3 = x340Var;
                xto1.f(fS, 4, 24960, 0, cbx.a(x340Var).b.a, j, x340Var3, qim0VarA2);
                x340Var = x340Var3;
                x340Var.r(true);
                x340Var.r(z5);
            } else {
                x340Var.i0(802533760);
                x340Var.r(z);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(this, str, uiw0Var, iu30Var, i, (byte) 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r13.a(r14, r7) == r11) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(p.bhj1 r14, p.onm r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p.yxv0
            if (r0 == 0) goto L14
            r0 = r15
            p.yxv0 r0 = (p.yxv0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            p.yxv0 r0 = new p.yxv0
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r7.b
            int r0 = r7.d
            r9 = 3
            r1 = 2
            r2 = 1
            r10 = 0
            p.d9n r11 = p.d9n.a
            if (r0 == 0) goto L41
            if (r0 == r2) goto L3b
            if (r0 == r1) goto L37
            if (r0 != r9) goto L31
            p.hm5.M(r15)
            goto Lb7
        L31:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r10
        L37:
            p.hm5.M(r15)
            goto L9c
        L3b:
            p.wkt r14 = r7.a
            p.hm5.M(r15)
            goto L7b
        L41:
            p.hm5.M(r15)
            p.wkt r15 = r14.b
            android.net.Uri r0 = r14.d
            java.lang.Object r3 = r13.c
            p.gqg r3 = (p.gqg) r3
            p.o571 r4 = r15.a()
            p.c380 r5 = r15.g()
            java.util.List r5 = p.o7h.l1(r5)
            p.vmt r3 = p.gqg.b(r3, r4, r5)
            p.u771 r4 = r14.a
            p.t771 r4 = r4.a
            p.wa71 r4 = r4.a
            p.ant r14 = r14.c
            if (r0 == 0) goto L6c
            p.bnt r5 = new p.bnt
            r5.<init>(r0)
            goto L6d
        L6c:
            r5 = r10
        L6d:
            r7.a = r15
            r7.d = r2
            java.lang.Object r14 = r3.b(r4, r14, r5, r10)
            if (r14 != r11) goto L78
            goto Lb6
        L78:
            r12 = r15
            r15 = r14
            r14 = r12
        L7b:
            p.p371 r15 = (p.p371) r15
            p.sg0 r3 = new p.sg0
            r0 = 18
            r3.<init>(r2, r10, r0)
            p.sg0 r4 = new p.sg0
            r0 = 20
            r4.<init>(r2, r10, r0)
            r7.a = r10
            r7.d = r1
            r5 = 0
            r6 = 0
            r8 = 56
            r1 = r14
            r2 = r15
            java.lang.Object r15 = p.fq7.K(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r15 != r11) goto L9c
            goto Lb6
        L9c:
            p.umt r15 = (p.umt) r15
            java.lang.Object r13 = r13.b
            p.wh71 r13 = (p.wh71) r13
            p.clw0 r14 = new p.clw0
            p.zmt r0 = new p.zmt
            r0.<init>(r15)
            r14.<init>(r0)
            r7.a = r10
            r7.d = r9
            java.lang.Object r13 = r13.a(r14, r7)
            if (r13 != r11) goto Lb7
        Lb6:
            return r11
        Lb7:
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yeu0.e(p.bhj1, p.onm):java.lang.Object");
    }

    public Observable f(String str) {
        return rqt0.F(o6x.a, new f3t0(this, str, null, (byte) 24)).map(o810.a1).toObservable();
    }

    public Object g(Object obj) {
        return ((k0v0) this.b).b.a(this.c, obj);
    }

    @Override // p.pt71
    public Context getContext() {
        return (Context) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, onm onmVar) {
        iwu0 iwu0Var;
        String str2;
        if (onmVar instanceof iwu0) {
            iwu0Var = (iwu0) onmVar;
            int i = iwu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwu0Var.d = i - Integer.MIN_VALUE;
            } else {
                iwu0Var = new iwu0(this, onmVar);
            }
        } else {
            iwu0Var = new iwu0(this, onmVar);
        }
        Object objJ = iwu0Var.b;
        int i2 = iwu0Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            String str3 = "spotify:playlist:" + str;
            ezc ezcVarG = yoi1.g(((uu00) this.b).b(new oi("playlist-curator-stats", false, new zqu0(str3, (byte) 5))));
            zio0 zio0Var = new zio0(2, (lnm) null, (byte) 13);
            iwu0Var.a = str3;
            iwu0Var.d = 1;
            objJ = b5p1.j(ezcVarG, zio0Var, iwu0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            str2 = str3;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = iwu0Var.a;
            hm5.M(objJ);
        }
        tv00 tv00VarA = ((uv00) objJ).a(gwu0.class, str2);
        int iC = l1d.C(tv00VarA.c.b);
        if (iC == 0 || iC == 2) {
            eg.m("Playlist stats were not resolved");
            return null;
        }
        gwu0 gwu0Var = tv00VarA.b;
        return gwu0Var == null ? new gwu0(z6x.a) : gwu0Var;
    }

    public void i(int i) {
        String str;
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((brl0) this.c).b.c();
        if (i == 1) {
            str = "private";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "public";
        }
        x6h1VarC.i.add(new a7h1("privacy_row", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public u2v0 j(lby lbyVar, o2v0 o2v0Var, d8r0 d8r0Var, String str, int i, int i2, boolean z, boolean z2) {
        int i3;
        rle1 rle1VarF;
        kfv kfvVar = o2v0Var.c;
        tb51 tb51Var = (tb51) this.b;
        String strJ0 = bmq0.j0(tb51Var.a.getResources().getString(2131961529), o2v0Var.b);
        boolean z3 = o2v0Var.h;
        boolean z4 = z3 && kfvVar.a > 0;
        String str2 = lbyVar.a;
        boolean z5 = z4;
        String str3 = lbyVar.b;
        String str4 = lbyVar.c;
        if (o2v0Var.e) {
            i3 = 1;
        } else {
            i3 = o2v0Var.d ? 2 : 3;
        }
        String str5 = o2v0Var.b;
        boolean z6 = o2v0Var.f && z2;
        String str6 = o2v0Var.i;
        String strA = ((o5r) this.c).a(o2v0Var.g.a);
        String str7 = "";
        String str8 = (z5 || (rle1VarF = tb51Var.f(kfvVar.a)) == null) ? "" : rle1VarF.a;
        if (z5) {
            long j = kfvVar.a;
            int i4 = (int) (j / 3600);
            int i5 = ((int) (j / 60)) - (i4 * 60);
            long j2 = j % 60;
            str7 = i4 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Long.valueOf(j2)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Long.valueOf(j2)}, 2));
        }
        return new u2v0(str2, str3, strJ0, str5, str4, i3, str, d8r0Var, i2, i, z, z6, z3, str6, strA, str8, str7, o2v0Var.a, o2v0Var.t);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(tg40 tg40Var, onm onmVar) {
        omu0 omu0Var;
        Map mapSingletonMap;
        if (onmVar instanceof omu0) {
            omu0Var = (omu0) onmVar;
            int i = omu0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                omu0Var.d = i - Integer.MIN_VALUE;
            } else {
                omu0Var = new omu0(this, onmVar);
            }
        } else {
            omu0Var = new omu0(this, onmVar);
        }
        Object objA = omu0Var.b;
        int i2 = omu0Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            if (tg40Var.b.contains("UPDATE_GENERATION_MODE")) {
                iyc0 iyc0Var = (iyc0) this.b;
                String str = tg40Var.a;
                nmu0 nmu0Var = tg40Var.c;
                nfa0 nfa0Var = (nfa0) this.c;
                int iOrdinal = nmu0Var.ordinal();
                if (iOrdinal == 0) {
                    mapSingletonMap = Collections.singletonMap("generation_mode", "MODE_ITERATIVE_UPDATE");
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    mapSingletonMap = Collections.singletonMap("generation_mode", "MODE_FULL_GENERATION");
                }
                Object obj = mapSingletonMap.get("generation_mode");
                obj.getClass();
                ayc0 ayc0Var = new ayc0("UPDATE_GENERATION_MODE", (phc) null, phc.i(nfa0Var.b(wg40.Companion.serializer(), new wg40((String) obj))), false, (String) null, 26);
                omu0Var.a = tg40Var;
                omu0Var.d = 1;
                objA = iyc0.a(iyc0Var, str, ayc0Var, omu0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
            return xg40.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tg40Var = omu0Var.a;
        hm5.M(objA);
        oy21 oy21Var = (py21) objA;
        n5u0 n5u0Var = new n5u0(tg40Var, (byte) 9);
        oy21Var.getClass();
        if (!(oy21Var instanceof ly21)) {
            if (oy21Var instanceof oy21) {
                return n5u0Var.invoke(oy21Var.a);
            }
            eg.o();
            return null;
        }
        return xg40.a;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 24:
                m1x0 m1x0Var = (m1x0) obj2;
                t4x0 t4x0Var = (t4x0) obj;
                z6x0 z6x0Var = t4x0Var.d;
                tv80 tv80Var = t4x0Var.e;
                n1r n1rVar = new n1r(observableEmitter, (byte) 2);
                n1r n1rVar2 = new n1r(observableEmitter, (byte) 3);
                mr20 mr20VarU = rqt0.u(new m441(new xd1(m1x0Var.c(z6x0Var, (jhm) null, n1rVar, n1rVar2), m1x0Var, z6x0Var, n1rVar, n1rVar2, (lnm) null, (byte) 20)));
                mfm mfmVar = m1x0Var.t;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.d(mfmVar, mr20VarU, yon1.d1(), (bjm) null, tv80Var, 20);
                break;
            default:
                e5x0 e5x0Var = (e5x0) obj;
                ((kp5) obj2).z(Integer.valueOf(e5x0Var.h), e5x0Var.d, e5x0Var.e, e5x0Var.g, e5x0Var.f, new n1r(observableEmitter, (byte) 4), new n1r(observableEmitter, (byte) 5));
                break;
        }
    }

    public yeu0(i8h1 i8h1Var) {
        this.a = (byte) 20;
        this.b = i8h1Var;
        this.c = new brl0((byte) 3);
    }

    public yeu0(z6k0 z6k0Var, koc0 koc0Var, mnk0 mnk0Var) {
        this.a = (byte) 3;
        this.b = koc0Var;
        this.c = mnk0Var;
    }

    public yeu0(uu00 uu00Var, l35 l35Var) {
        this.a = (byte) 6;
        cqz0 cqz0Var = dqz0.a;
        this.b = uu00Var;
        this.c = l35Var;
    }

    public /* synthetic */ yeu0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public yeu0(Flowable flowable, v5n v5nVar) {
        this.a = (byte) 26;
        this.c = v5nVar;
        this.b = flowable;
    }
}
