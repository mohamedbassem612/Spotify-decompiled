package p;

import android.app.Activity;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.bluejay.data.api.GenerationServiceException;
import com.spotify.messages.ByomSessionEnded;
import com.spotify.messages.ByomSessionStartFailed;
import com.spotify.metadata.proto.Metadata;
import com.spotify.player.esperanto.proto.EsCommandOptions;
import com.spotify.player.esperanto.proto.EsGetStateRequest;
import com.spotify.player.esperanto.proto.EsPauseresumeOrigin;
import com.spotify.player.esperanto.proto.EsResume;
import com.spotify.player.esperanto.proto.EsSignalRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.voiceassistants.playermodels.PlayIntent;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import io.reactivex.rxjava3.internal.operators.maybe.MaybePeek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ajq0 implements BiFunction, Function, a56 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public ajq0(me7 me7Var, String str, yf7 yf7Var, cir0 cir0Var) {
        this.a = me7Var;
        this.b = str;
        this.c = yf7Var;
        this.d = cir0Var;
        this.e = cir0Var.h().a(uj1.g, new wj1(this, (byte) 3));
    }

    public static ys11 q(ajq0 ajq0Var, lik1 lik1Var, d0r d0rVar, Function0 function0, au11 au11Var, yzc0 yzc0Var, kpg0 kpg0Var, qlb qlbVar, n5 n5Var, boolean z, int i) {
        ab8 ab8Var;
        o3r o3rVarO;
        qlb qlbVar2;
        yzc0 yzc0Var2 = (i & 16) != 0 ? null : yzc0Var;
        int i2 = (i & 64) != 0 ? 2 : 1;
        bhh1 bhh1Var = igu.b;
        kpg0 kpg0Var2 = (i & 256) != 0 ? null : kpg0Var;
        qlb qlbVar3 = (i & 512) != 0 ? null : qlbVar;
        boolean z2 = (i & 1024) == 0;
        n5 n5Var2 = (i & 2048) != 0 ? qa8.h : n5Var;
        boolean z3 = (i & 4096) != 0 ? false : z;
        p68 p68Var = (p68) ajq0Var.b;
        zs11 zs11Var = (zs11) ajq0Var.a;
        u1p u1pVar = (u1p) ajq0Var.c;
        switch (u1pVar.a) {
            case 0:
                a680 a680Var = (a680) u1pVar.b.c;
                f1n0 f1n0Var = (f1n0) ((ozp) a680Var.a).b.T2.get();
                c8o.l(f1n0Var);
                vgm vgmVar = (vgm) ((ozp) a680Var.a).b.b.E.get();
                c8o.l(vgmVar);
                ab8Var = new ab8(f1n0Var, vgmVar, function0, lik1Var);
                break;
            case 1:
                wdm wdmVar = (wdm) u1pVar.b.c;
                f1n0 f1n0Var2 = (f1n0) ((rc8) wdmVar.b).d.get();
                c8o.l(f1n0Var2);
                vgm vgmVar2 = (vgm) ((rc8) wdmVar.b).f.get();
                c8o.l(vgmVar2);
                ab8Var = new ab8(f1n0Var2, vgmVar2, function0, lik1Var);
                break;
            default:
                ip31 ip31Var = (ip31) u1pVar.b.c;
                f1n0 f1n0Var3 = (f1n0) ((lh31) ip31Var.b).f.get();
                c8o.l(f1n0Var3);
                vgm vgmVar3 = (vgm) ((lh31) ip31Var.b).h.get();
                c8o.l(vgmVar3);
                ab8Var = new ab8(f1n0Var3, vgmVar3, function0, lik1Var);
                break;
        }
        yt11 yt11Var = (yt11) n5Var2.invoke(ab8Var);
        if (yzc0Var2 != null) {
            o3rVarO = w3p1.o(new l4r(pwc0.d, 2, b4r.c, new j4r(b4r.g), b4r.e), b4r.i);
        } else {
            o3rVarO = null;
        }
        z3r z3rVar = z3r.e;
        y3r y3rVar = y3r.Y;
        j4r j4rVar = new j4r(z3rVar);
        y3r y3rVar2 = y3r.R0;
        b2v b2vVar = b2v.a;
        l4r l4rVar = new l4r(b2vVar, 2, y3rVar, j4rVar, y3rVar2);
        jd0 jd0Var = jd0.z;
        o3r o3rVarN = w3p1.n(l4rVar, new l4r(jd0Var, 2, y3r.U0, new j4r(z3r.h), y3r.X0), ido.P0);
        ya8 ya8Var = new ya8(kpg0Var2, (byte) 0);
        eb8 eb8Var = (eb8) ajq0Var.e;
        if (eb8Var.a.c) {
            qlbVar2 = new qlb(d0rVar, new xzq(eb8Var.b.a(d0rVar), db8.t), w3p1.n(new l4r(hvm.a, 2, db8.f, new j4r(new rr6(eb8Var, (byte) 22)), db8.g), new l4r(jd0.m, 2, db8.h, new j4r(db8.X), db8.i), new mu6(eb8Var, (byte) 13)));
        } else {
            qlbVar2 = null;
        }
        ya8 ya8Var2 = new ya8(qlbVar2, (byte) 1);
        ds11 ds11Var = new ds11(new xzq(new hho(bhh1Var, d0rVar), qa8.c));
        s1p s1pVar = (s1p) p68Var.d;
        fns fnsVar = igu.a;
        ds11 ds11Var2 = new ds11(new xzq(s1pVar.a(fnsVar, d0rVar), qa8.g));
        bv40 bv40Var = (bv40) ajq0Var.d;
        smc0 smc0VarN = k4p1.n();
        jd11 jd11Var = rc11.a;
        smc0VarN.add(new l4r(new xv00(jd11Var.b(jo70.class)), 2, qa8.a1, new j4r(qa8.i), qa8.b1));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(xkk1.class)), 2, qa8.c1, new j4r(qa8.t), qa8.d1));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(hll.class)), 2, qa8.e1, new j4r(qa8.X), db8.b));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(pnt.class)), 2, db8.c, new j4r(qa8.Y), db8.d));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(a7q0.class)), 2, db8.e, new j4r(qa8.Z), qa8.R0));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(w281.class)), 2, qa8.S0, new j4r(qa8.N0), qa8.T0));
        smc0VarN.add(new l4r(new xv00(jd11Var.b(l98.class)), 2, qa8.U0, new j4r(qa8.O0), qa8.V0));
        if (z2) {
            smc0VarN.add(new l4r(new xv00(jd11Var.b(zc8.class)), 2, qa8.W0, new j4r(qa8.P0), qa8.X0));
        }
        smc0VarN.add(new l4r(pwc0.b, 2, qa8.Y0, new j4r(qa8.Q0), qa8.Z0));
        o3r o3rVar = new o3r(k4p1.k(smc0VarN), new cb8(z2, bv40Var, (byte) 0), false);
        bt11 bt11Var = new bt11(true);
        zwp zwpVar = (zwp) p68Var.e;
        return zs11Var.a(d0rVar, new ls11(ds11Var, new ds11(new xzq(((t1p) p68Var.f).a(false, d0rVar, bhh1Var), qa8.d)), ds11Var2, new ds11(new xzq(((d2q) p68Var.g).a(fnsVar, d0rVar), new va8(lik1Var, function0, (byte) 0))), new za8(new qlb(d0rVar, (!p68Var.a || yzc0Var2 == null) ? new xzq(zwpVar.a(d0rVar, new tlt0((muz) p68Var.b, (ruz) p68Var.c)), qa8.f) : new xzq(zwpVar.a(d0rVar, new ult0(yzc0Var2)), qa8.e), w3p1.n(new l4r(b2vVar, 2, z3r.Z0, new j4r(z3r.d1), z3r.a1), new l4r(jd0Var, 2, z3r.b1, new j4r(z3r.e1), z3r.c1), ido.R0)), (byte) 0), new ya8(qlbVar3, (byte) 2), (qrk) null, ya8Var, ya8Var2, yt11Var, au11Var, 1, (o27) null, (gye1) null, kpc1.a, (sb2) null, (rru) null, z3, o3rVarO, o3rVarN, (o3r) null, (o3r) null, o3rVar, (o3r) null, (cv11) null, (y5z) null, (bnw0) null, bt11Var, i2, (o3r) null, -40980416, 487), (nu11) null);
    }

    public static void w(ajq0 ajq0Var, String str, tv80 tv80Var) {
        huj.b((lzn0) ajq0Var.d, (Activity) ajq0Var.a, (ryf) ajq0Var.b, oxf.b, str, tv80Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(String str, onm onmVar) {
        qag qagVar;
        if (onmVar instanceof qag) {
            qagVar = (qag) onmVar;
            int i = qagVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qagVar.d = i - Integer.MIN_VALUE;
            } else {
                qagVar = new qag(this, onmVar);
            }
        } else {
            qagVar = new qag(this, onmVar);
        }
        Object objM = qagVar.b;
        int i2 = qagVar.d;
        if (i2 == 0) {
            hm5.M(objM);
            if (!u890.j(o7h.t0(1, ihc1.Q0(str, new String[]{":"}, 0, 6)), "podcast-chapter")) {
                return new mag(str, str, (akb1) null);
            }
            jut jutVar = (jut) this.d;
            qagVar.a = str;
            qagVar.d = 1;
            objM = jutVar.m(str, qagVar);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = qagVar.a;
            hm5.M(objM);
        }
        bv21 bv21Var = (bv21) objM;
        if (bv21Var == null) {
            return null;
        }
        return new mag(bv21Var.a, str, new akb1(bv21Var.b, bv21Var.c));
    }

    public void B(String str, String str2, gs31 gs31Var) {
        r95 r95Var = (r95) this.e;
        os80 os80Var = new os80(str, (byte) 0);
        ro30 ro30Var = (ro30) this.a;
        r95Var.a(os80Var, new o860(ro30Var.b, (Object) new bp50(ro30Var, str2, new qff(gs31Var, (byte) 17), (byte) 21), (Object) str2, (Object) m4h.a1, (byte) 9));
    }

    public void C(blc0 blc0Var, String str, hs31 hs31Var) {
        r95 r95Var = (r95) this.e;
        nbh0 nbh0VarO = l6o1.o(new jbh0[]{new os80("android.intent.action.VIEW", (byte) 0), new ebu(new ebu(blc0Var, (byte) 7), (byte) 9)});
        ro30 ro30Var = (ro30) this.a;
        r95Var.a(nbh0VarO, new o860(ro30Var.b, (Object) new bp50(ro30Var, str, new okg(hs31Var, (byte) 6), (byte) 22), (Object) str, (Object) m4h.b1, (byte) 9));
    }

    public void D(jbh0 jbh0Var, String str, is31 is31Var) {
        r95 r95Var = (r95) this.e;
        ro30 ro30Var = (ro30) this.a;
        r95Var.a(jbh0Var, new o860(ro30Var.b, (Object) new bp50(ro30Var, str, new a7e(is31Var, this, (byte) 26), (byte) 21), (Object) str, (Object) m4h.d1, (byte) 9));
    }

    public void E(jbh0 jbh0Var, String str, jrn0 jrn0Var) {
        jc9 jc9Var = new jc9(jrn0Var, (byte) 21);
        r95 r95Var = (r95) this.e;
        mg30 mg30Var = (mg30) this.b;
        ro30 ro30Var = mg30Var.a;
        r95Var.a(jbh0Var, new o860(ro30Var.b, (Object) new cb60(ro30Var, str, new rr10(jc9Var, (byte) 14), new fc3(mg30Var, (byte) 8), (byte) 7), (Object) str, (Object) m830.c1, (byte) 9));
    }

    public void F(pu9 pu9Var) {
        ((ai10) this.d).a(pu9Var);
    }

    public void G(blc0 blc0Var, String str, is31 is31Var) {
        D(l6o1.o(new jbh0[]{new os80("android.intent.action.VIEW", (byte) 0), new ebu(new ebu(blc0Var, (byte) 7), (byte) 9)}), str, is31Var);
    }

    public void H(String str, String str2, jrn0 jrn0Var) {
        E(new os80(str, (byte) 0), str2, jrn0Var);
    }

    public void I(blc0 blc0Var, String str, Class cls, hg30 hg30Var) {
        K(blc0Var, str, new cfd(cls, hg30Var, (byte) 21));
    }

    public void J(jbh0 jbh0Var, String str, xi7 xi7Var) {
        r95 r95Var = (r95) this.e;
        nbh0 nbh0VarO = l6o1.o(new jbh0[]{new os80("android.intent.action.VIEW", (byte) 0), new ebu(jbh0Var, (byte) 9)});
        mg30 mg30Var = (mg30) this.b;
        ro30 ro30Var = mg30Var.a;
        r95Var.a(nbh0VarO, new o860(ro30Var.b, (Object) new cb60(ro30Var, str, new rr10(xi7Var, (byte) 14), new fc3(mg30Var, (byte) 8), (byte) 7), (Object) str, (Object) m830.c1, (byte) 9));
    }

    public void K(blc0 blc0Var, String str, jrn0 jrn0Var) {
        J(new ebu(blc0Var, (byte) 7), str, new jc9(jrn0Var, (byte) 21));
    }

    public void L(b3i1 b3i1Var, String str, jrn0 jrn0Var) {
        J(new ebu(b3i1Var, (byte) 8), str, new jc9(jrn0Var, (byte) 21));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object M(trj1 trj1Var, onm onmVar) {
        rag ragVar;
        jn7 jn7Var = (jn7) ((j3v) this.a).b;
        if (onmVar instanceof rag) {
            ragVar = (rag) onmVar;
            int i = ragVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ragVar.d = i - Integer.MIN_VALUE;
            } else {
                ragVar = new rag(this, onmVar);
            }
        } else {
            ragVar = new rag(this, onmVar);
        }
        Object obj = ragVar.b;
        int i2 = ragVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (trj1Var.e.contains("switch-to-video")) {
                ragVar.a = trj1Var;
                ragVar.d = 1;
                srz srzVarN = EsSignalRequest.SignalRequest.n();
                srzVarN.r("switch-to-video");
                Object objU0 = jn7Var.u0(srzVarN.build(), ragVar);
                if (objU0 != d9nVar) {
                    objU0 = rih1Var;
                }
                if (objU0 != d9nVar) {
                }
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        trj1Var = ragVar.a;
        hm5.M(obj);
        if (trj1Var.c) {
            ragVar.a = null;
            ragVar.d = 2;
            drz drzVarN = EsResume.ResumeRequest.n();
            tlz tlzVarN = EsCommandOptions.CommandOptions.n();
            tlzVarN.s(false);
            drzVarN.q(tlzVarN.build());
            spz spzVarN = EsPauseresumeOrigin.PauseResumeOrigin.n();
            spzVarN.n("chromeless-webview");
            drzVarN.r(spzVarN.build());
            Object objH0 = jn7Var.h0(drzVarN.build(), ragVar);
            if (objH0 != d9nVar) {
                objH0 = rih1Var;
            }
            if (objH0 == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    public void N(boolean z) {
        if (z && ((Boolean) ((pdp0) this.d).invoke()).booleanValue()) {
            ((z6a0) this.a).e(true);
            bjq0 bjq0Var = (bjq0) this.b;
            if (bjq0Var.b == null) {
                bjq0Var.b = hhp0.a.j(bjq0.c, new cnp0(bjq0Var, (byte) 23));
            }
            djq0 djq0Var = (djq0) this.c;
            if (djq0Var.c != null) {
                return;
            }
            z6a0 z6a0Var = djq0Var.a;
            z6a0Var.getClass();
            z6a0Var.d(new u6a0(z6a0Var, djq0Var, (byte) 0));
            djq0Var.c = new x390(z6a0Var, djq0Var, (byte) 8);
            return;
        }
        djq0 djq0Var2 = (djq0) this.c;
        x390 x390Var = djq0Var2.c;
        if (x390Var != null) {
            z6a0 z6a0Var2 = (z6a0) x390Var.b;
            z6a0Var2.d(new u6a0(z6a0Var2, (djq0) x390Var.c, (byte) 1));
        }
        djq0Var2.c = null;
        bjq0 bjq0Var2 = (bjq0) this.b;
        tga tgaVar = bjq0Var2.b;
        if (tgaVar != null) {
            tgaVar.unregister();
        }
        bjq0Var2.b = null;
        ((z6a0) this.a).e(false);
    }

    public void O() {
        this.c = 10000;
    }

    public void P() {
        this.d = 604800000L;
    }

    public void Q() {
        this.b = 200;
    }

    public void R() {
        this.e = 81920;
    }

    public void S() {
        this.a = 10485760L;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r13 == r9) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object T(java.lang.String r12, p.onm r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof p.wxg
            if (r0 == 0) goto L14
            r0 = r13
            p.wxg r0 = (p.wxg) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            p.wxg r0 = new p.wxg
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.d
            int r0 = r6.f
            r1 = 2
            r7 = 0
            r2 = 0
            r8 = 1
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L3e
            if (r0 == r8) goto L34
            if (r0 != r1) goto L2e
            p.hm5.M(r13)     // Catch: java.lang.IllegalStateException -> L90
            goto L83
        L2e:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r2
        L34:
            int r12 = r6.c
            p.i24 r0 = r6.b
            java.lang.String r3 = r6.a
            p.hm5.M(r13)     // Catch: java.lang.IllegalStateException -> L90
            goto L5e
        L3e:
            p.hm5.M(r13)
            p.i24 r0 = new p.i24
            r13 = 18
            r0.<init>(r11, r12, r2, r13)
            r6.a = r12     // Catch: java.lang.IllegalStateException -> L90
            r6.b = r0     // Catch: java.lang.IllegalStateException -> L90
            r13 = 2131960069(0x7f132105, float:1.9556796E38)
            r6.c = r13     // Catch: java.lang.IllegalStateException -> L90
            r6.f = r8     // Catch: java.lang.IllegalStateException -> L90
            java.lang.Object r3 = r0.invoke(r6)     // Catch: java.lang.IllegalStateException -> L90
            if (r3 != r9) goto L5a
            goto L82
        L5a:
            r10 = r3
            r3 = r12
            r12 = r13
            r13 = r10
        L5e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.IllegalStateException -> L90
            boolean r13 = r13.booleanValue()     // Catch: java.lang.IllegalStateException -> L90
            if (r13 != 0) goto L8f
            java.lang.Object r13 = r11.c     // Catch: java.lang.IllegalStateException -> L90
            p.tc31 r13 = (p.tc31) r13     // Catch: java.lang.IllegalStateException -> L90
            p.vxg r4 = new p.vxg     // Catch: java.lang.IllegalStateException -> L90
            r4.<init>(r11, r3, r8)     // Catch: java.lang.IllegalStateException -> L90
            r6.a = r2     // Catch: java.lang.IllegalStateException -> L90
            r6.b = r2     // Catch: java.lang.IllegalStateException -> L90
            r6.c = r12     // Catch: java.lang.IllegalStateException -> L90
            r6.f = r1     // Catch: java.lang.IllegalStateException -> L90
            p.n521 r5 = p.n521.R0     // Catch: java.lang.IllegalStateException -> L90
            r2 = r12
            r1 = r13
            r3 = r0
            java.lang.Object r13 = r1.b(r2, r3, r4, r5, r6)     // Catch: java.lang.IllegalStateException -> L90
            if (r13 != r9) goto L83
        L82:
            return r9
        L83:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.IllegalStateException -> L90
            if (r13 == 0) goto L8c
            boolean r11 = r13.booleanValue()     // Catch: java.lang.IllegalStateException -> L90
            goto L8d
        L8c:
            r11 = r7
        L8d:
            if (r11 == 0) goto L90
        L8f:
            r7 = r8
        L90:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ajq0.T(java.lang.String, p.onm):java.lang.Object");
    }

    public Object U(int i, dw8 dw8Var) {
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new nx5(this, i, null, (byte) 1), dw8Var);
        return objY == d9n.a ? objY : rih1.a;
    }

    public void V() {
        ViewGroup viewGroup = (ViewGroup) this.c;
        View.OnLayoutChangeListener onLayoutChangeListener = (eg7) this.e;
        viewGroup.removeOnLayoutChangeListener(onLayoutChangeListener);
        ((ViewGroup) this.b).removeOnLayoutChangeListener(onLayoutChangeListener);
    }

    public void W() {
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.a;
        ViewGroup viewGroup = (ViewGroup) this.b;
        ViewGroup viewGroup2 = (ViewGroup) this.c;
        if (viewGroup2.getHeight() == 0 || viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
            return;
        }
        int iMin = Math.min(viewGroup.getHeight(), Math.max(((Number) ((idd1) this.d).getValue()).intValue(), viewGroup2.getHeight() - ((viewGroup.getWidth() * 9) / 16)));
        if (iMin != (bottomSheetBehavior.e ? -1 : bottomSheetBehavior.d)) {
            bottomSheetBehavior.J(iMin);
        }
    }

    public void a(b0k b0kVar, int i) {
        rbt rbtVar = (rbt) this.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-791432429);
        int i2 = (b0kVar2.i(this) ? 4 : 2) | i;
        if (b0kVar2.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = d7e.r(1.0f, u291.v(nim0Var, 132.0f), false);
            boolean zI = b0kVar2.i(this);
            Object objT = b0kVar2.T();
            if (zI || objT == fkj0.X) {
                objT = new syf(this, (byte) 28);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarX = ern1.x(qim0VarR, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            cct cctVar = rbtVar.o;
            b0kVar2.i0(1598534355);
            cctVar.c(b0kVar2, 0);
            b0kVar2.r(false);
            qgo1.g(rbtVar.h, h2c.a.a(nim0Var, een.Y), b0kVar2);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qff(this, i, (byte) 22);
        }
    }

    public Object apply(Object obj) {
        t45 t45Var = (t45) this.e;
        String str = (String) this.d;
        m210 m210Var = (m210) this.c;
        PlayIntent playIntent = (PlayIntent) this.b;
        String str2 = ((ou80) obj).a;
        c77 c77Var = (c77) this.a;
        boolean z = c77Var.p;
        tp7 tp7Var = c77Var.k;
        if (z && nhc1.Y(playIntent.getUri().toString(), "spotify:nl", false)) {
            return new CompletableFromAction(new bm0(c77Var, str2, (byte) 9)).c(tp7Var.f(str, playIntent.getUri().toString(), t45Var, str2).switchMapCompletable(new alg1(str, playIntent, str2, tp7Var, m210Var, t45Var)));
        }
        return new CompletableFromAction(new bm0(c77Var, str2, (byte) 9)).c(tp7Var.f(str, playIntent.getUri().toString(), t45Var, str2).switchMapCompletable(new mxa1(tp7Var, playIntent, m210Var, str, str2, c77Var.m, t45Var)));
    }

    public void b(qcb1 qcb1Var, iu30 iu30Var, jha1 jha1Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        iu30 iu30Var3;
        Object objI;
        zv61 zv61VarP;
        boolean z;
        Object obj;
        hrr0 hrr0Var = (hrr0) this.d;
        rbt rbtVar = (rbt) this.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2140528);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(qcb1Var) : x340Var.i(qcb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(jha1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            iu30Var3 = iu30Var2;
            i2 |= x340Var.i(iu30Var3) ? 2048 : 1024;
        } else {
            iu30Var3 = iu30Var2;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(this) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            bw50 bw50VarL = d4o1.l(rbtVar, x340Var);
            px50 px50Var = bw50VarL.a;
            long j = bw50VarL.b;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objI = objT;
                objI = us71.i(0.0f, x340Var);
            }
            objI = objT;
            drr0 drr0Var = (drr0) objI;
            boolean zG = x340Var.g(px50Var) | x340Var.f(j) | x340Var.f(((Offset) hrr0Var.getValue()).a) | x340Var.d(drr0Var.s());
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                if (px50Var instanceof ox50) {
                    zv61VarP = d4o1.p(px50Var, j, 9205357640488583168L);
                } else {
                    if (!(px50Var instanceof px50)) {
                        eg.o();
                        return;
                    }
                    float fS = px50Var.a - ((drr0Var.s() - Float.intBitsToFloat((int) (((Offset) hrr0Var.getValue()).a & 4294967295L))) / 2.0f);
                    float f = (fS < 0.0f ? 0.0f : fS) / 2.0f;
                    zv61VarP = d4o1.p(px50Var, j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (((Offset) hrr0Var.getValue()).a >> 32)) + f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (((Offset) hrr0Var.getValue()).a & 4294967295L)) - f)) & 4294967295L));
                }
                objT2 = zv61VarP;
                x340Var.s0(objT2);
            }
            Brush brush = (Brush) objT2;
            gao gaoVarK = d4o1.k(px50Var, new u7h(j), brush, irn1.o0(600, 0, klv.c, 2), x340Var);
            qim0 qim0VarR = exd0.r(qim0Var, new w060(gaoVarK.a, brush, gaoVarK.b, (byte) 1));
            boolean zI = x340Var.i(this) | x340Var.i(drr0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                z = false;
                puh puhVar = new puh(this, drr0Var, false ? 1 : 0);
                x340Var.s0(puhVar);
                obj = puhVar;
            } else {
                z = false;
                obj = objT3;
            }
            qim0 qim0VarF = u291.f(ern1.x(qim0VarR, (iu30) obj), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, z);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            pbq pbqVar = rbtVar.i;
            x340Var.i0(402708027);
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qgo1.g(pbqVar, h2cVar.b(nim0Var), x340Var);
            x340Var.r(false);
            x340Var.i0(-400604392);
            x340Var.r(false);
            WeakHashMap weakHashMap = osl1.x;
            e6p1.b(48, 0, apo.r(1760312606, new m(this, qcb1Var, iu30Var, jha1Var, iu30Var3, (byte) 28), x340Var), x340Var, uyn1.B(nim0Var, 0.0f, poo1.x(lhc.g(x340Var).f, x340Var).d(), 0.0f, 0.0f, 13));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(this, qcb1Var, iu30Var, jha1Var, iu30Var2, qim0Var, i, (byte) 12);
        }
    }

    public o46 c() {
        return (aab) this.d;
    }

    public v46 d() {
        return (dab) this.e;
    }

    public fa6 e(v46 v46Var) {
        y86 y86Var;
        int iC;
        n86 n86Var = (n86) this.b;
        hm41 hm41Var = ((dab) v46Var).h;
        u46 u46Var = (u46) this.a;
        if (hm41Var != null) {
            xk41 xk41Var = hm41Var.b;
            int i = xk41Var.a;
            String str = u46Var.a;
            ewx0 ewx0Var = hm41Var.c;
            String str2 = ewx0Var.b;
            String str3 = ewx0Var.a;
            String str4 = u46Var.b;
            boolean zE = n86Var.e();
            zlk1 zlk1Var = hm41Var.f;
            xw51 xw51Var = zlk1Var != null ? new xw51(zlk1Var.a, zlk1Var.b) : null;
            String str5 = hm41Var.i;
            boolean z = i != 1;
            boolean z2 = hm41Var.g;
            Set setP1 = o7h.p1(hm41Var.h.a);
            boolean z3 = hm41Var.e;
            ivh1 kvh1Var = jvh1.a;
            if (z3 && (iC = l1d.C(i)) != 0) {
                if (iC == 1) {
                    kvh1Var = hvh1.a;
                } else if (iC == 2) {
                    n7r n7rVar = xk41Var.b;
                    kvh1Var = new kvh1(n7rVar != null ? n7rVar.a() : 1);
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    kvh1Var = ivh1.a;
                }
            }
            y86Var = new y86(str, str2, str3, true, str4, zE, false, kvh1Var, (nmu0) null, false, false, z, false, (ArrayList) null, (List) null, false, xw51Var, str5, false, z2, setP1, false, false, (z740) null, (z740) null, -1346438920, 1011);
        } else {
            String str6 = u46Var.g;
            String str7 = str6 == null ? "" : str6;
            String str8 = u46Var.f;
            y86Var = new y86((String) null, str7, str8 == null ? "" : str8, true, u46Var.b, n86Var.e(), false, (mvh1) null, (nmu0) null, false, false, false, false, (ArrayList) null, (List) null, false, (xw51) null, u46Var.h, false, false, (Set) null, false, false, (z740) null, (z740) null, -1073743624, 1023);
        }
        psk pskVar = u46Var.d;
        return new fa6(y86Var, pskVar, u46Var.c, pskVar == psk.b && u46Var.f != null, 2032);
    }

    public List f(Throwable th) {
        Resources resources = (Resources) this.c;
        if (!(th instanceof GenerationServiceException)) {
            String message = th.getMessage();
            if (message == null) {
                message = resources.getString(2131952858);
            }
            return Collections.singletonList(new l46(message));
        }
        String string = ((GenerationServiceException) th).a;
        if (string == null) {
            string = "";
        }
        if (ihc1.y0(string)) {
            string = null;
        }
        if (string == null) {
            string = resources.getString(2131952858);
        }
        return Collections.singletonList(new l46(string));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void g(qcb1 qcb1Var, iu30 iu30Var, jha1 jha1Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        boolean z;
        iu30 iu30Var3;
        jha1 jha1Var2 = jha1Var;
        ocb1 ocb1Var = qcb1Var.i;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-162601750);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(qcb1Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(jha1Var2) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192) | (x340Var.i(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            op71.g(x340Var, u291.h(nim0Var, 64.0f));
            boolean zI = x340Var.i(this) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new puh(this, iu30Var2, (byte) 1);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (ocb1Var instanceof ocb1) {
                x340Var.i0(-1876525769);
                jha1Var2 = jha1Var;
                ven0 ven0VarJ = f4p1.j(jha1Var2, 0, (iac0) null, x340Var, ((i2 >> 6) & 14) | 48, 14);
                boolean zI2 = x340Var.i(jha1Var2) | x340Var.i(this);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new bag(jha1Var2, this, (lnm) null, (byte) 14);
                    x340Var.s0(objT2);
                }
                qxd0.t(jha1Var2, x340Var, (vu30) objT2);
                boolean z3 = qcb1Var.e;
                String strO0 = cwl1.o0(x340Var, 2131962794);
                String str = ocb1Var.a;
                boolean zI3 = x340Var.i(ven0VarJ) | x340Var.i(this);
                Object objT3 = x340Var.T();
                if (zI3 || objT3 == m4cVar) {
                    objT3 = new puh(ven0VarJ, this);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarC = i541.C(nim0Var, (iu30) objT3);
                int i3 = i2 & 112;
                boolean z4 = i3 == 32;
                Object objT4 = x340Var.T();
                if (z4 || objT4 == m4cVar) {
                    iu30Var3 = iu30Var;
                    objT4 = new yth(iu30Var3, (byte) 4);
                    x340Var.s0(objT4);
                } else {
                    iu30Var3 = iu30Var;
                }
                Function0 function0 = (Function0) objT4;
                boolean z5 = i3 == 32;
                Object objT5 = x340Var.T();
                if (z5 || objT5 == m4cVar) {
                    objT5 = new yth(iu30Var3, (byte) 5);
                    x340Var.s0(objT5);
                }
                z = true;
                b3o1.l(z3, str, strO0, function0, (Function0) objT5, qim0VarC, x340Var, 0);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(nim0Var, 16.0f, x340Var, false);
            } else {
                jha1Var2 = jha1Var;
                z = true;
                if (!(ocb1Var instanceof ncb1)) {
                    throw p3d1.k(x340Var, 355106409, false);
                }
                x340Var.i0(355143785);
                x340Var.r(false);
                ((err0) this.c).t(0);
            }
            x340Var.r(z);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(this, qcb1Var, iu30Var, jha1Var2, iu30Var2, qim0Var, i, (byte) 17);
        }
    }

    public void h(String str, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-161837291);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            k5p1.d(qim0VarF, new d36(12.0f, true, new g21(een.P0, (byte) 29)), new d36(0.0f, false, new g21(fraVar, (byte) 28)), fraVar, 0, 0, apo.r(368769168, new ho7(str, z, iu30Var), x340Var), x340Var, 1572864, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(this, str, z, iu30Var, i);
        }
    }

    public t09 i() {
        String strConcat = ((Long) this.a) == null ? " maxStorageSizeInBytes" : "";
        if (((Integer) this.b) == null) {
            strConcat = strConcat.concat(" loadBatchSize");
        }
        if (((Integer) this.c) == null) {
            strConcat = strConcat.concat(" criticalSectionEnterTimeoutMs");
        }
        if (((Long) this.d) == null) {
            strConcat = strConcat.concat(" eventCleanUpAge");
        }
        if (((Integer) this.e) == null) {
            strConcat = strConcat.concat(" maxBlobByteSizePerRow");
        }
        if (strConcat.isEmpty()) {
            return new t09(((Long) this.a).longValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        eg.m("Missing required properties:".concat(strConcat));
        return null;
    }

    public b29 j() {
        String strConcat = ((j2t) this.a) == null ? " surface" : "";
        if (((List) this.b) == null) {
            strConcat = strConcat.concat(" sharedSurfaces");
        }
        if (((Integer) this.c) == null) {
            strConcat = strConcat.concat(" mirrorMode");
        }
        if (((Integer) this.d) == null) {
            strConcat = strConcat.concat(" surfaceGroupId");
        }
        if (((liv) this.e) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (strConcat.isEmpty()) {
            return new b29((j2t) this.a, (List) this.b, ((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (liv) this.e);
        }
        eg.m("Missing required properties:".concat(strConcat));
        return null;
    }

    public void k(zzy zzyVar, String str, String str2) {
        swa0 swa0Var = (swa0) this.d;
        f3b f3bVar = swa0Var.a;
        Resources resources = (Resources) this.b;
        kt91 kt91Var = (kt91) this.c;
        if (zzyVar.equals(uzy.b)) {
            kt91Var.k(new er91((fs91) null, resources.getString(2131957074, str), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            int i = swa0Var.d.i;
            Parcelable.Creator creator = twa0.CREATOR;
            rzn1.t();
            swa0Var.d = twa0.N0;
            f3bVar.b(i);
            return;
        }
        if (zzyVar.equals(vzy.b)) {
            kt91Var.k(new er91((fs91) null, resources.getString(2131957106, str), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            int i2 = swa0Var.d.i;
            Parcelable.Creator creator2 = twa0.CREATOR;
            rzn1.t();
            swa0Var.d = twa0.N0;
            f3bVar.b(i2 + 2);
            return;
        }
        if (zzyVar.equals(xzy.b)) {
            ((lzn0) this.a).e();
        } else if (!zzyVar.equals(yzy.b)) {
            eg.o();
        } else {
            kt91Var.k(new er91((fs91) null, resources.getString(2131957074, str), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            ((xk) this.e).b(str2, (tv80) null);
        }
    }

    public kt11 l(epb1 epb1Var, iu30 iu30Var, nu11 nu11Var) {
        os11 os11Var = new os11();
        ycc1 ycc1Var = (ycc1) this.c;
        oe3 oe3Var = new oe3(this, (byte) 0);
        abm abmVar = (abm) this.e;
        new ne3(ycc1Var, iu30Var, abmVar.a(), abmVar.a(), oe3Var).invoke(os11Var);
        ms11 ms11VarA = os11Var.a();
        zsc zscVar = (zsc) this.a;
        em0 em0Var = new em0(new lh2(3, (w6g1) ms11VarA.l.d, w6g1.class, "extractTraits", "extractTraits(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Ljava/lang/Object;", 0, (byte) 3), epb1Var, ms11VarA.i, (iu30) null, (iu30) null, (iu30) null, (iu30) null, (xu30) null, ms11VarA.t, (vu30) null, 1528);
        ppc1 ppc1Var = ms11VarA.n;
        return zsc.j(zscVar, em0Var, (mka) null, k4p1.G(ms11VarA.y), false, (vtw) null, (vtw) null, (vtw) null, (vtw) null, (vtw) null, (vtw) null, ms11VarA.g, (ue3) this.d, nu11Var, false, 0, false, ppc1Var, false, false, false, (egx0) null, ms11VarA.z, 2134740976);
    }

    public jhm m(lik1 lik1Var, List list) {
        oy1 oy1Var = (oy1) this.c;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ContextTrack.create((String) it.next()));
        }
        return oy1Var.b(lik1Var, arrayList);
    }

    public fg40 n(hg40 hg40Var) {
        zlk1 zlk1Var;
        String str = hg40Var.e;
        hm41 hm41Var = ((dab) this.e).h;
        String str2 = hg40Var.a;
        String str3 = hg40Var.b;
        String str4 = hg40Var.f;
        return new w9b(str2, str3, str4 != null ? Collections.singletonList(str4) : z6x.a, str == null ? "" : str, hg40Var.c, hm41Var != null ? hm41Var.a : null, hg40Var.g, hm41Var != null ? hm41Var.b : null, hm41Var != null ? hm41Var.e : true, hg40Var.i, hg40Var.j, !u890.j(hm41Var != null ? hm41Var.c.a : null, hg40Var.a), !u890.j((hm41Var == null || (zlk1Var = hm41Var.f) == null) ? null : zlk1Var.a, str), !u890.j(hm41Var != null ? hm41Var.i : null, hg40Var.j));
    }

    public jhm o(String str, String str2) {
        return ((i6c) this.d).a(str, str2);
    }

    public jhm p(ArrayList arrayList) {
        return ((ic9) this.e).d(arrayList);
    }

    public jhm r(ok51 ok51Var) {
        return ((dc31) this.b).d(ok51Var);
    }

    public jhm s(String str) {
        return f971.b((f971) this.a, str, str);
    }

    public void t(int i) {
        String str;
        t2j0 t2j0Var = (t2j0) this.a;
        switch (i) {
            case 1:
                str = "video_completed";
                break;
            case 2:
                str = "user_closed";
                break;
            case 3:
                str = "talk_content_started";
                break;
            case 4:
                str = "restricted_content_started";
                break;
            case 5:
                str = "video_failed";
                break;
            case 6:
                str = "player_unavailable";
                break;
            case 7:
                str = "replaced";
                break;
            case 8:
                str = "service_stopped";
                break;
            default:
                throw null;
        }
        br9 br9Var = (br9) this.c;
        if (br9Var == null) {
            return;
        }
        String str2 = (String) this.d;
        Long l = (Long) this.e;
        this.c = null;
        this.d = null;
        this.e = null;
        if (str2 == null || l == null) {
            if (i == 5 || i == 6 || i == 3) {
                yfc yfcVarN = ByomSessionStartFailed.n();
                yfcVarN.q(br9Var.a);
                yfcVarN.n(br9Var.b);
                yfcVarN.r(str);
                String str3 = br9Var.c;
                if (str3 != null) {
                    yfcVarN.s(str3);
                }
                t2j0Var.a(yfcVarN.build());
                return;
            }
            return;
        }
        xfc xfcVarN = ByomSessionEnded.n();
        xfcVarN.s(str2);
        String str4 = "failed";
        switch (i) {
            case 1:
                str4 = "completed";
                break;
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
                str4 = "interrupted";
                break;
            case 5:
            case 6:
                break;
            default:
                throw null;
        }
        xfcVarN.r(str4);
        xfcVarN.q(str);
        long jE = ((yqg) this.b).e() - l.longValue();
        if (jE < 0) {
            jE = 0;
        }
        xfcVarN.n(jE);
        t2j0Var.a(xfcVarN.build());
    }

    public MaybeFlatMapCompletable u(slc0 slc0Var, int i, String str) {
        String strEncode;
        String str2;
        ((lvc) ((x5j1) this.e).b).a(slc0Var, "alexa", "", str, 2, i);
        bn5 bn5Var = (bn5) this.a;
        bn5Var.getClass();
        String string = UUID.randomUUID().toString();
        if (((t450) bn5Var.b.b).b()) {
            strEncode = Uri.encode("https://open.spotify.com/alexa-auth");
            str2 = "https://alexa.amazon.com/spa/skill-account-linking-consent?fragment=skill-account-linking-consent&client_id=amzn1.application-oa2-client.9ef35a57bbb445a9b329037d6fc3643b&scope=alexa::skills:account_linking&skill_stage=live&response_type=code&redirect_uri=";
        } else {
            strEncode = Uri.encode("https://open.spotify.com/alexa-auth");
            str2 = "https://www.amazon.com/ap/oa?client_id=amzn1.application-oa2-client.9ef35a57bbb445a9b329037d6fc3643b&scope=alexa::skills:account_linking&response_type=code&redirect_uri=";
        }
        String strH = gvg.h(str2, strEncode, "&state=", string);
        Maybe maybeSingleElement = bn5Var.c.filter(new akp1(string, (byte) 1)).take(1L).singleElement();
        a21 a21Var = new a21(strH, bn5Var, (byte) 10);
        Consumer consumer = Functions.d;
        Action action = Functions.c;
        return new MaybeFlatMapCompletable(new MaybeFlatten(new MaybePeek(maybeSingleElement, a21Var, consumer, consumer, action, action, action), new ycc1(this, slc0Var, (byte) 28)), new gid(this, slc0Var, (byte) 29));
    }

    public Single v() {
        return Single.zip(((pnv0) this.a).d(upn1.m(), "NOTIFICATION_SETTINGS", nik1.H2.a, ((oto0) this.e).a.g()).map((tym0) this.b), ((c881) this.c).a.a().map(ybx0.Y).map((yla) this.d), new fna(this, (byte) 10));
    }

    public Object x(Function0 function0, onm onmVar) {
        Object objY = fn31.Y((q8n) this.e, new pid(this, function0, (lnm) null, (byte) 14), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(mag magVar, onm onmVar) {
        nag nagVar;
        if (onmVar instanceof nag) {
            nagVar = (nag) onmVar;
            int i = nagVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nagVar.c = i - Integer.MIN_VALUE;
            } else {
                nagVar = new nag(this, onmVar);
            }
        } else {
            nagVar = new nag(this, onmVar);
        }
        Object objO = nagVar.a;
        int i2 = nagVar.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objO);
            bag bagVar = new bag(this, magVar, (lnm) null, (byte) 2);
            nagVar.c = 1;
            objO = rc2.O(5000L, bagVar, nagVar);
            if (objO != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objO);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(objO);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objO);
        trj1 trj1Var = (trj1) objO;
        if (trj1Var == null) {
            oag oagVar = new oag(this, (byte) 0);
            nagVar.c = 2;
            if (x(oagVar, nagVar) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        Map map = trj1Var.d;
        h290 h290Var = trj1Var.e;
        String str = (String) map.get("media.type");
        if (u890.j(map.get("track_player"), "video") || u890.j(str, "video") || u890.j(str, "mixed") || h290Var.contains("switch-to-video") || h290Var.contains("switch-to-audio")) {
            oag oagVar2 = new oag(this, (byte) 1);
            nagVar.c = 3;
            if (x(oagVar2, nagVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096 A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, PHI: r1 r2
      0x00ac: PHI (r1v12 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:42:0x00a8, B:29:0x0068] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r2v9 p.mag) = (r2v7 p.mag), (r2v10 p.mag) binds: [B:42:0x00a8, B:29:0x0068] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6 A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3 A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, PHI: r1 r2
      0x00d3: PHI (r1v18 java.lang.Object) = (r1v17 java.lang.Object), (r1v1 java.lang.Object) binds: [B:48:0x00cf, B:26:0x0061] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r2v11 p.mag) = (r2v9 p.mag), (r2v13 p.mag) binds: [B:48:0x00cf, B:26:0x0061] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, TRY_ENTER, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1 A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3 A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, PHI: r1 r2
      0x00f3: PHI (r1v22 p.trj1) = (r1v19 p.trj1), (r1v24 p.trj1) binds: [B:54:0x00df, B:59:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f3: PHI (r2v14 p.mag) = (r2v11 p.mag), (r2v16 p.mag) binds: [B:54:0x00df, B:59:0x00f1] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101 A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, PHI: r1 r2
      0x012b: PHI (r1v26 java.lang.Object) = (r1v21 java.lang.Object), (r1v1 java.lang.Object) binds: [B:64:0x0128, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x012b: PHI (r2v20 p.mag) = (r2v11 p.mag), (r2v24 p.mag) binds: [B:64:0x0128, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x012f A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0137 A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x014a  */
    /* JADX WARN: Code duplicated, block: B:73:0x014b A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015e  */
    /* JADX WARN: Code duplicated, block: B:76:0x015f A[Catch: Exception -> 0x016e, CancellationException -> 0x0183, PHI: r2
      0x015f: PHI (r2v19 p.mag) = (r2v14 p.mag), (r2v18 p.mag), (r2v20 p.mag) binds: [B:61:0x00fd, B:20:0x0051, B:67:0x012d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0183, Exception -> 0x016e, blocks: (B:14:0x0044, B:17:0x004a, B:66:0x012b, B:68:0x012f, B:70:0x0137, B:73:0x014b, B:76:0x015f, B:20:0x0051, B:23:0x005a, B:60:0x00f3, B:26:0x0061, B:50:0x00d3, B:53:0x00dd, B:55:0x00e1, B:63:0x0101, B:29:0x0068, B:44:0x00ac, B:47:0x00b6, B:30:0x006c, B:36:0x007f, B:38:0x0084, B:41:0x0096, B:33:0x0073), top: B:85:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0181 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public Object z(String str, onm onmVar) {
        pag pagVar;
        mag magVar;
        oag oagVar;
        trj1 trj1Var;
        boolean zA;
        String str2;
        akb1 akb1Var;
        mag magVar2;
        trj1 trj1Var2;
        String str3;
        oag oagVar2;
        oag oagVar3;
        j3v j3vVar = (j3v) this.a;
        if (onmVar instanceof pag) {
            pagVar = (pag) onmVar;
            int i = pagVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pagVar.e = i - Integer.MIN_VALUE;
            } else {
                pagVar = new pag(this, onmVar);
            }
        } else {
            pagVar = new pag(this, onmVar);
        }
        pag pagVar2 = pagVar;
        Object objA = pagVar2.c;
        int i2 = pagVar2.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            switch (i2) {
                case 0:
                    hm5.M(objA);
                    pagVar2.e = 1;
                    objA = A(str, pagVar2);
                    if (objA != d9nVar) {
                        magVar = (mag) objA;
                        if (magVar == null) {
                            oagVar = new oag(this, (byte) 2);
                            pagVar2.a = null;
                            pagVar2.e = 2;
                            if (x(oagVar, pagVar2) == d9nVar) {
                            }
                            return rih1Var;
                        }
                        lag lagVar = (lag) this.b;
                        String str4 = magVar.a;
                        pagVar2.a = magVar;
                        pagVar2.e = 3;
                        objA = ((ywv0) lagVar.b).c(str4, pagVar2);
                        if (objA == d9nVar) {
                            if (u890.j(objA, ndj1.c)) {
                                evz evzVar = new evz(((jn7) j3vVar.b).E(EsGetStateRequest.GetStateRequest.n()), j3vVar, (byte) 0);
                                pagVar2.a = magVar;
                                pagVar2.e = 4;
                                objA = b5p1.i(evzVar, pagVar2);
                                if (objA != d9nVar) {
                                    trj1Var = (trj1) objA;
                                    zA = magVar.a(trj1Var);
                                    str2 = magVar.a;
                                    if (zA) {
                                        akb1Var = magVar.c;
                                        if (akb1Var != null) {
                                            pagVar2.a = magVar;
                                            pagVar2.b = trj1Var;
                                            pagVar2.e = 5;
                                            if (j3vVar.e(akb1Var, pagVar2) == d9nVar) {
                                                magVar2 = magVar;
                                                trj1Var2 = trj1Var;
                                                trj1Var = trj1Var2;
                                                magVar = magVar2;
                                                pagVar2.a = magVar;
                                                pagVar2.b = null;
                                                pagVar2.e = 6;
                                                if (M(trj1Var, pagVar2) != d9nVar) {
                                                    pagVar2.a = null;
                                                    pagVar2.b = null;
                                                    pagVar2.e = 10;
                                                    if (y(magVar, pagVar2) == d9nVar) {
                                                    }
                                                }
                                            }
                                        } else {
                                            pagVar2.a = magVar;
                                            pagVar2.b = null;
                                            pagVar2.e = 6;
                                            if (M(trj1Var, pagVar2) != d9nVar) {
                                                pagVar2.a = null;
                                                pagVar2.b = null;
                                                pagVar2.e = 10;
                                                if (y(magVar, pagVar2) == d9nVar) {
                                                }
                                            }
                                        }
                                    } else {
                                        Map mapS = tyo1.s(str2);
                                        boolean zJ = u890.j(o7h.t0(1, ihc1.Q0(str2, new String[]{":"}, 0, 6)), "track");
                                        akb1 akb1Var2 = magVar.c;
                                        pagVar2.a = magVar;
                                        pagVar2.b = null;
                                        pagVar2.e = 7;
                                        objA = j3vVar.b(str2, mapS, zJ, akb1Var2, pagVar2);
                                        if (objA == d9nVar) {
                                            str3 = (String) objA;
                                            if (str3 != null) {
                                                if (ihc1.h0(str3, "pick_and_shuffle_capped_video_context", false)) {
                                                    oagVar3 = new oag(this, (byte) 3);
                                                    pagVar2.a = null;
                                                    pagVar2.b = null;
                                                    pagVar2.e = 8;
                                                    if (x(oagVar3, pagVar2) == d9nVar) {
                                                    }
                                                } else {
                                                    oagVar2 = new oag(this, (byte) 4);
                                                    pagVar2.a = null;
                                                    pagVar2.b = null;
                                                    pagVar2.e = 9;
                                                    if (x(oagVar2, pagVar2) == d9nVar) {
                                                    }
                                                }
                                            }
                                            pagVar2.a = null;
                                            pagVar2.b = null;
                                            pagVar2.e = 10;
                                            if (y(magVar, pagVar2) == d9nVar) {
                                            }
                                        }
                                    }
                                }
                            }
                            return rih1Var;
                        }
                    }
                    return d9nVar;
                case 1:
                    hm5.M(objA);
                    magVar = (mag) objA;
                    if (magVar == null) {
                        oagVar = new oag(this, (byte) 2);
                        pagVar2.a = null;
                        pagVar2.e = 2;
                        if (x(oagVar, pagVar2) == d9nVar) {
                        }
                        return rih1Var;
                    }
                    lag lagVar2 = (lag) this.b;
                    String str5 = magVar.a;
                    pagVar2.a = magVar;
                    pagVar2.e = 3;
                    objA = ((ywv0) lagVar2.b).c(str5, pagVar2);
                    if (objA == d9nVar) {
                        if (u890.j(objA, ndj1.c)) {
                            evz evzVar2 = new evz(((jn7) j3vVar.b).E(EsGetStateRequest.GetStateRequest.n()), j3vVar, (byte) 0);
                            pagVar2.a = magVar;
                            pagVar2.e = 4;
                            objA = b5p1.i(evzVar2, pagVar2);
                            if (objA != d9nVar) {
                                trj1Var = (trj1) objA;
                                zA = magVar.a(trj1Var);
                                str2 = magVar.a;
                                if (zA) {
                                    akb1Var = magVar.c;
                                    if (akb1Var != null) {
                                        pagVar2.a = magVar;
                                        pagVar2.b = trj1Var;
                                        pagVar2.e = 5;
                                        if (j3vVar.e(akb1Var, pagVar2) == d9nVar) {
                                            magVar2 = magVar;
                                            trj1Var2 = trj1Var;
                                            trj1Var = trj1Var2;
                                            magVar = magVar2;
                                            pagVar2.a = magVar;
                                            pagVar2.b = null;
                                            pagVar2.e = 6;
                                            if (M(trj1Var, pagVar2) != d9nVar) {
                                                pagVar2.a = null;
                                                pagVar2.b = null;
                                                pagVar2.e = 10;
                                                if (y(magVar, pagVar2) == d9nVar) {
                                                }
                                            }
                                        }
                                    } else {
                                        pagVar2.a = magVar;
                                        pagVar2.b = null;
                                        pagVar2.e = 6;
                                        if (M(trj1Var, pagVar2) != d9nVar) {
                                            pagVar2.a = null;
                                            pagVar2.b = null;
                                            pagVar2.e = 10;
                                            if (y(magVar, pagVar2) == d9nVar) {
                                            }
                                        }
                                    }
                                } else {
                                    Map mapS2 = tyo1.s(str2);
                                    boolean zJ2 = u890.j(o7h.t0(1, ihc1.Q0(str2, new String[]{":"}, 0, 6)), "track");
                                    akb1 akb1Var3 = magVar.c;
                                    pagVar2.a = magVar;
                                    pagVar2.b = null;
                                    pagVar2.e = 7;
                                    objA = j3vVar.b(str2, mapS2, zJ2, akb1Var3, pagVar2);
                                    if (objA == d9nVar) {
                                        str3 = (String) objA;
                                        if (str3 != null) {
                                            if (ihc1.h0(str3, "pick_and_shuffle_capped_video_context", false)) {
                                                oagVar3 = new oag(this, (byte) 3);
                                                pagVar2.a = null;
                                                pagVar2.b = null;
                                                pagVar2.e = 8;
                                                if (x(oagVar3, pagVar2) == d9nVar) {
                                                }
                                            } else {
                                                oagVar2 = new oag(this, (byte) 4);
                                                pagVar2.a = null;
                                                pagVar2.b = null;
                                                pagVar2.e = 9;
                                                if (x(oagVar2, pagVar2) == d9nVar) {
                                                }
                                            }
                                        }
                                        pagVar2.a = null;
                                        pagVar2.b = null;
                                        pagVar2.e = 10;
                                        if (y(magVar, pagVar2) == d9nVar) {
                                        }
                                    }
                                }
                            }
                        }
                        return rih1Var;
                    }
                    return d9nVar;
                case 2:
                case 8:
                case 9:
                case 10:
                    hm5.M(objA);
                    return rih1Var;
                case 3:
                    magVar = pagVar2.a;
                    hm5.M(objA);
                    if (u890.j(objA, ndj1.c)) {
                        evz evzVar3 = new evz(((jn7) j3vVar.b).E(EsGetStateRequest.GetStateRequest.n()), j3vVar, (byte) 0);
                        pagVar2.a = magVar;
                        pagVar2.e = 4;
                        objA = b5p1.i(evzVar3, pagVar2);
                        if (objA != d9nVar) {
                            trj1Var = (trj1) objA;
                            zA = magVar.a(trj1Var);
                            str2 = magVar.a;
                            if (zA) {
                                akb1Var = magVar.c;
                                if (akb1Var != null) {
                                    pagVar2.a = magVar;
                                    pagVar2.b = trj1Var;
                                    pagVar2.e = 5;
                                    if (j3vVar.e(akb1Var, pagVar2) == d9nVar) {
                                        magVar2 = magVar;
                                        trj1Var2 = trj1Var;
                                        trj1Var = trj1Var2;
                                        magVar = magVar2;
                                        pagVar2.a = magVar;
                                        pagVar2.b = null;
                                        pagVar2.e = 6;
                                        if (M(trj1Var, pagVar2) != d9nVar) {
                                            pagVar2.a = null;
                                            pagVar2.b = null;
                                            pagVar2.e = 10;
                                            if (y(magVar, pagVar2) == d9nVar) {
                                            }
                                        }
                                    }
                                } else {
                                    pagVar2.a = magVar;
                                    pagVar2.b = null;
                                    pagVar2.e = 6;
                                    if (M(trj1Var, pagVar2) != d9nVar) {
                                        pagVar2.a = null;
                                        pagVar2.b = null;
                                        pagVar2.e = 10;
                                        if (y(magVar, pagVar2) == d9nVar) {
                                        }
                                    }
                                }
                            } else {
                                Map mapS3 = tyo1.s(str2);
                                boolean zJ3 = u890.j(o7h.t0(1, ihc1.Q0(str2, new String[]{":"}, 0, 6)), "track");
                                akb1 akb1Var4 = magVar.c;
                                pagVar2.a = magVar;
                                pagVar2.b = null;
                                pagVar2.e = 7;
                                objA = j3vVar.b(str2, mapS3, zJ3, akb1Var4, pagVar2);
                                if (objA == d9nVar) {
                                    str3 = (String) objA;
                                    if (str3 != null) {
                                        if (ihc1.h0(str3, "pick_and_shuffle_capped_video_context", false)) {
                                            oagVar3 = new oag(this, (byte) 3);
                                            pagVar2.a = null;
                                            pagVar2.b = null;
                                            pagVar2.e = 8;
                                            if (x(oagVar3, pagVar2) == d9nVar) {
                                            }
                                        } else {
                                            oagVar2 = new oag(this, (byte) 4);
                                            pagVar2.a = null;
                                            pagVar2.b = null;
                                            pagVar2.e = 9;
                                            if (x(oagVar2, pagVar2) == d9nVar) {
                                            }
                                        }
                                    }
                                    pagVar2.a = null;
                                    pagVar2.b = null;
                                    pagVar2.e = 10;
                                    if (y(magVar, pagVar2) == d9nVar) {
                                    }
                                }
                            }
                        }
                        return d9nVar;
                    }
                    return rih1Var;
                case 4:
                    magVar = pagVar2.a;
                    hm5.M(objA);
                    trj1Var = (trj1) objA;
                    zA = magVar.a(trj1Var);
                    str2 = magVar.a;
                    if (zA) {
                        akb1Var = magVar.c;
                        if (akb1Var != null) {
                            pagVar2.a = magVar;
                            pagVar2.b = trj1Var;
                            pagVar2.e = 5;
                            if (j3vVar.e(akb1Var, pagVar2) == d9nVar) {
                                magVar2 = magVar;
                                trj1Var2 = trj1Var;
                                trj1Var = trj1Var2;
                                magVar = magVar2;
                                pagVar2.a = magVar;
                                pagVar2.b = null;
                                pagVar2.e = 6;
                                if (M(trj1Var, pagVar2) != d9nVar) {
                                    pagVar2.a = null;
                                    pagVar2.b = null;
                                    pagVar2.e = 10;
                                    if (y(magVar, pagVar2) == d9nVar) {
                                        return rih1Var;
                                    }
                                }
                            }
                        } else {
                            pagVar2.a = magVar;
                            pagVar2.b = null;
                            pagVar2.e = 6;
                            if (M(trj1Var, pagVar2) != d9nVar) {
                                pagVar2.a = null;
                                pagVar2.b = null;
                                pagVar2.e = 10;
                                if (y(magVar, pagVar2) == d9nVar) {
                                    return rih1Var;
                                }
                            }
                        }
                    } else {
                        Map mapS4 = tyo1.s(str2);
                        boolean zJ4 = u890.j(o7h.t0(1, ihc1.Q0(str2, new String[]{":"}, 0, 6)), "track");
                        akb1 akb1Var5 = magVar.c;
                        pagVar2.a = magVar;
                        pagVar2.b = null;
                        pagVar2.e = 7;
                        objA = j3vVar.b(str2, mapS4, zJ4, akb1Var5, pagVar2);
                        if (objA == d9nVar) {
                            str3 = (String) objA;
                            if (str3 != null) {
                                if (ihc1.h0(str3, "pick_and_shuffle_capped_video_context", false)) {
                                    oagVar3 = new oag(this, (byte) 3);
                                    pagVar2.a = null;
                                    pagVar2.b = null;
                                    pagVar2.e = 8;
                                    if (x(oagVar3, pagVar2) == d9nVar) {
                                    }
                                    return rih1Var;
                                }
                                oagVar2 = new oag(this, (byte) 4);
                                pagVar2.a = null;
                                pagVar2.b = null;
                                pagVar2.e = 9;
                                if (x(oagVar2, pagVar2) == d9nVar) {
                                }
                                return rih1Var;
                            }
                            pagVar2.a = null;
                            pagVar2.b = null;
                            pagVar2.e = 10;
                            if (y(magVar, pagVar2) == d9nVar) {
                                return rih1Var;
                            }
                        }
                    }
                    return d9nVar;
                case 5:
                    trj1Var2 = pagVar2.b;
                    magVar2 = pagVar2.a;
                    hm5.M(objA);
                    trj1Var = trj1Var2;
                    magVar = magVar2;
                    pagVar2.a = magVar;
                    pagVar2.b = null;
                    pagVar2.e = 6;
                    if (M(trj1Var, pagVar2) != d9nVar) {
                        pagVar2.a = null;
                        pagVar2.b = null;
                        pagVar2.e = 10;
                        if (y(magVar, pagVar2) == d9nVar) {
                            return rih1Var;
                        }
                    }
                    return d9nVar;
                case 6:
                    magVar = pagVar2.a;
                    hm5.M(objA);
                    pagVar2.a = null;
                    pagVar2.b = null;
                    pagVar2.e = 10;
                    if (y(magVar, pagVar2) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                case 7:
                    magVar = pagVar2.a;
                    hm5.M(objA);
                    str3 = (String) objA;
                    if (str3 != null) {
                        if (ihc1.h0(str3, "pick_and_shuffle_capped_video_context", false)) {
                            oagVar3 = new oag(this, (byte) 3);
                            pagVar2.a = null;
                            pagVar2.b = null;
                            pagVar2.e = 8;
                            if (x(oagVar3, pagVar2) == d9nVar) {
                                return d9nVar;
                            }
                            return rih1Var;
                        }
                        oagVar2 = new oag(this, (byte) 4);
                        pagVar2.a = null;
                        pagVar2.b = null;
                        pagVar2.e = 9;
                        if (x(oagVar2, pagVar2) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    pagVar2.a = null;
                    pagVar2.b = null;
                    pagVar2.e = 10;
                    if (y(magVar, pagVar2) == d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                case 11:
                    Exception exc = pagVar2.a;
                    hm5.M(objA);
                    return rih1Var;
                default:
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            oag oagVar4 = new oag(this, (byte) 5);
            pagVar2.a = null;
            pagVar2.b = null;
            pagVar2.e = 11;
            if (x(oagVar4, pagVar2) == d9nVar) {
                return d9nVar;
            }
        }
    }

    public ajq0(yqg yqgVar, t2j0 t2j0Var) {
        this.a = t2j0Var;
        this.b = yqgVar;
    }

    public /* synthetic */ ajq0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public ajq0(ro30 ro30Var, mg30 mg30Var, bkl bklVar, ai10 ai10Var) {
        this.a = ro30Var;
        this.b = mg30Var;
        this.c = bklVar;
        this.d = ai10Var;
        this.e = new r95();
    }

    public Object apply(Object obj, Object obj2) {
        mmr0 mmr0Var = (mmr0) obj;
        int iIntValue = ((Number) mmr0Var.a).intValue();
        int iIntValue2 = ((Number) mmr0Var.b).intValue();
        String strC = ((s4b1) this.a).C((String) obj2);
        if (strC != null) {
            yr6 yr6Var = (yr6) this.b;
            Metadata.Artist artist = (Metadata.Artist) this.c;
            artist.getClass();
            return yr6Var.c(artist, (List) this.d, (String) this.e, strC, iIntValue, iIntValue2);
        }
        bhn0.q();
        return null;
    }
}
