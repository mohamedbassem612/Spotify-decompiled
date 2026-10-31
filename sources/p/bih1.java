package p;

import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.esperanto.proto.CommonMessages;
import com.spotify.connect.esperanto.proto.VolumeMessages;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bih1 implements Function, gvt0, wej1, k1q0, n6j0, w3b1 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public bih1(Handler handler, qwj1 qwj1Var) {
        this.a = (byte) 11;
        if (qwj1Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = qwj1Var;
    }

    public void a(String str) {
        ((iu30) this.c).invoke(new juj1(((cej1) this.b).b(str), str));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                String str = (String) obj;
                HeadphoneFilterStateDatabase headphoneFilterStateDatabase = (HeadphoneFilterStateDatabase) ((hce1) this.c).b;
                k560 k560Var = (m560) this.b;
                if (k560Var instanceof k560) {
                    return m5n1.l(headphoneFilterStateDatabase.u().a, new os(k560Var.a, str, (byte) 7));
                }
                if (k560Var instanceof l560) {
                    return m5n1.l(headphoneFilterStateDatabase.v().a, new ec21(((l560) k560Var).a, str, (byte) 11));
                }
                eg.o();
                return null;
            case 5:
                String str2 = (String) obj;
                return (str2.length() != 0 && ((gdx0) this.b).a.q()) ? ((v5n) this.c).d(Collections.singletonList(str2)).map(e2x0.W0).onErrorReturnItem("") : Observable.just(str2);
            case 13:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Couldn't create request for prepare", new Object[0]);
                ((a77) ((tp7) this.b).h).d(th, (VoiceAssistantLoggingContext) this.c);
                return CompletableEmpty.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (SingleSource) ((vu30) this.b).invoke((PlayerState) obj, (f1l1) this.c);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                zsc zscVar = (zsc) this.b;
                String str3 = (String) this.c;
                vxg1 vxg1Var = new vxg1((Object) zscVar, (Object) str3, obj, (lnm) null, (byte) 26);
                o6x o6xVar = o6x.a;
                return j2h1.D(o6xVar, vxg1Var).e(yoi1.i(t5p1.i(w6d1.q(awl1.d(((ol61) zscVar.d).a).e(rqo1.s(str3)), ec61.Q0)), o6xVar).filter(a4x0.X0).firstOrError().flatMap(new vdn1(str3, (byte) 20)));
            case 20:
                return Single.just(new dlb1((f291) this.b, "https://accounts.spotify.com/login/ott/v2#token=".concat(((wze1) obj).a), (String) this.c));
            default:
                r9c r9cVar = (r9c) this.c;
                boolean z = ((th61) obj).b;
                uw0 uw0Var = ((v1v0) this.b).b;
                return z ? uw0Var.n(3).b(r9cVar) : uw0Var.n(6).b(r9cVar);
        }
    }

    public f9v b(v8v v8vVar, int i, b8c0 b8c0Var, String str) {
        e8c0 e8c0Var = (e8c0) this.c;
        String str2 = i == 2 ? e8c0Var.a : e8c0Var.b;
        ij81 ij81Var = new ij81(-1, (byte) 12);
        UUID uuid = whc.e;
        w1x0 w1x0Var = w1x0.d1;
        uuid.getClass();
        cwr cwrVar = new cwr(uuid, w1x0Var, new ua91(v8vVar, ((yyp0) ((l270) this.b)).c(), str2), new HashMap(), false, new int[0], true, ij81Var);
        if (b8c0Var != null) {
            cwrVar.l(b8c0Var.b(), 0);
        }
        return cwrVar;
    }

    public boolean c(m0u0 m0u0Var) {
        ContextTrack contextTrack = (ContextTrack) this.b;
        String str = (String) m0u0Var.a.d.get("track_uid");
        if (str != null) {
            return l4o1.k(contextTrack, str, c2p1.r(m0u0Var)) && ((yyd) ((w611) ((y5j1) this.c)).a.getTag(2131430298)).a;
        }
        hhg1.n("Required value was null.");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r6.a(r8, r0) == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(p.rbv r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.gri1
            if (r0 == 0) goto L13
            r0 = r8
            p.gri1 r0 = (p.gri1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.gri1 r0 = new p.gri1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L7a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            p.rbv r7 = r0.a
            p.hm5.M(r8)     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            goto L4b
        L37:
            p.hm5.M(r8)
            java.lang.Object r8 = r6.b     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            p.bl3 r8 = (p.bl3) r8     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            p.ak3 r1 = r7.a     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            r0.a = r7     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            r0.d = r4     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            java.lang.Object r8 = r8.i(r1, r0)     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            if (r8 != r5) goto L4b
            goto L79
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            boolean r8 = r8.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L52 java.lang.Exception -> L54
            goto L55
        L52:
            r6 = move-exception
            goto L7d
        L54:
            r8 = 0
        L55:
            if (r8 == 0) goto L62
            p.lcv r6 = new p.lcv
            p.bwo r7 = new p.bwo
            r7.<init>(r2)
            r6.<init>(r7)
            goto L7c
        L62:
            java.lang.Object r6 = r6.c
            p.bev r6 = (p.bev) r6
            p.mbv r8 = new p.mbv
            java.lang.String r1 = r7.b
            p.tv80 r7 = r7.c
            r8.<init>(r1, r7)
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r5) goto L7a
        L79:
            return r5
        L7a:
            p.mcv r6 = p.mcv.a
        L7c:
            return r6
        L7d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bih1.d(p.rbv, p.onm):java.lang.Object");
    }

    public ffe1 e(zxf zxfVar, gj5 gj5Var) {
        return new ffe1(byf.c((byf) this.b, gj5Var, new e4b1(gj5Var, (byte) 3), gj5Var, zxfVar, gj5Var), new dlg1(this, gj5Var, zxfVar), (byte) 29);
    }

    public View f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        igl1 igl1Var = (igl1) this.b;
        gw70 gw70Var = igl1Var.h;
        h98 h98Var = new h98(layoutInflater, viewGroup, gw70Var);
        jme jmeVar = (jme) this.c;
        h98Var.n(new hij1(igl1Var, jmeVar, (byte) 25));
        int i = jmeVar.a;
        viewGroup.setBackgroundColor(0);
        sp00 sp00Var = (sp00) h98Var.c;
        ((EncoreButton) sp00Var.d).setText(viewGroup.getContext().getString(i));
        gw70Var.f("https://wear.spotifycdn.com/wear_onboarding_watches.webp").j((mjv) h98Var.d);
        return (ConstraintLayout) sp00Var.b;
    }

    public Single g() {
        return rqt0.F((q8n) this.c, new b0f1((Object) this, (lnm) null, (byte) 20));
    }

    public void h(int i) {
        String str;
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((brl0) this.c).b.c();
        if (i == 1) {
            str = "daily";
        } else if (i == 2) {
            str = "never";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "weekly";
        }
        x6h1VarC.i.add(new a7h1("cadence_row", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void i(String str, String str2) {
        ((iu30) this.c).invoke(new kuj1(((cej1) this.b).b(str), str, str2));
    }

    public void j(String str, String str2, m4m m4mVar) {
        ((iu30) this.c).invoke(new huj1(((cej1) this.b).b(str), str, str2, m4mVar));
    }

    public void k() {
        if (u890.j(((q9l1) this.c).d.getValue(), n9l1.a)) {
            v7m0 v7m0Var = (v7m0) this.b;
            v7m0Var.a.accept(z9u.a);
        }
    }

    public CompletableObserveOn l(int i, String str, String str2) {
        be beVar = (be) this.b;
        vsk1 vsk1VarN = VolumeMessages.VolumeSetRequest.n();
        osh oshVarO = CommonMessages.LoggingParams.o();
        if (str != null) {
            oshVarO.n(str);
        }
        vsk1VarN.q(oshVarO.build());
        vsk1VarN.r(i);
        if (str2 != null) {
            vsk1VarN.n(str2);
        }
        return beVar.callSingle("spotify.connect.esperanto.proto.ConnectVolumeService", "VolumeSet", vsk1VarN.build()).map(fmv.S0).doOnSuccess(vrk1.b).doOnError(vrk1.c).ignoreElement().n((Scheduler) this.c);
    }

    public void m(z1k1 z1k1Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new qub1(this, z1k1Var, (byte) 8));
        }
    }

    public String n(String str, double d) {
        py9 py9VarM = ((qpj1) this.c).m(str);
        if (py9VarM == null) {
            return null;
        }
        x6h1 x6h1VarC = py9VarM.c.c();
        x6h1VarC.i.add(new a7h1("system_volume_down", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        int iS = jch0.S(d * 100.0d);
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(iS);
        if (strValueOf == null) {
            strValueOf = "";
        }
        return ((i8h1) this.b).m(new w7h1("", "", z7h1Var, new x7h1("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf)), y6h1VarA, py9VarM.b, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public String o(String str, double d) {
        py9 py9VarM = ((qpj1) this.c).m(str);
        if (py9VarM == null) {
            return null;
        }
        x6h1 x6h1VarC = py9VarM.c.c();
        x6h1VarC.i.add(new a7h1("system_volume_up", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        int iS = jch0.S(d * 100.0d);
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        String strValueOf = String.valueOf(iS);
        if (strValueOf == null) {
            strValueOf = "";
        }
        return ((i8h1) this.b).m(new w7h1("", "", z7h1Var, new x7h1("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf)), y6h1VarA, py9VarM.b, System.currentTimeMillis()), (xj61) null).a.a;
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        url1 prl1Var;
        switch (this.a) {
            case 12:
                ViewPager viewPager = (ViewPager) this.c;
                hsl1 hsl1VarI = b8k1.i(view, hsl1Var);
                if (hsl1VarI.a.s()) {
                    return hsl1VarI;
                }
                Rect rect = (Rect) this.b;
                rect.left = hsl1VarI.b();
                rect.top = hsl1VarI.d();
                rect.right = hsl1VarI.c();
                rect.bottom = hsl1VarI.a();
                int childCount = viewPager.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    hsl1 hsl1VarD = b8k1.d(viewPager.getChildAt(i), hsl1VarI);
                    rect.left = Math.min(hsl1VarD.b(), rect.left);
                    rect.top = Math.min(hsl1VarD.d(), rect.top);
                    rect.right = Math.min(hsl1VarD.c(), rect.right);
                    rect.bottom = Math.min(hsl1VarD.a(), rect.bottom);
                }
                int i2 = rect.left;
                int i3 = rect.top;
                int i4 = rect.right;
                int i5 = rect.bottom;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 36) {
                    prl1Var = new url1(hsl1VarI);
                } else if (i6 >= 35) {
                    prl1Var = new trl1(hsl1VarI);
                } else if (i6 >= 34) {
                    prl1Var = new srl1(hsl1VarI);
                } else if (i6 >= 31) {
                    prl1Var = new rrl1(hsl1VarI);
                } else if (i6 >= 30) {
                    prl1Var = new qrl1(hsl1VarI);
                } else {
                    prl1Var = i6 >= 29 ? new prl1(hsl1VarI) : new nrl1(hsl1VarI);
                }
                prl1Var.h(nk80.c(i2, i3, i4, i5));
                return prl1Var.b();
            default:
                return (hsl1) ((xu30) this.b).invoke(view, hsl1Var, (uc80) this.c);
        }
    }

    public /* synthetic */ bih1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public bih1(i8h1 i8h1Var) {
        this.a = (byte) 2;
        this.b = i8h1Var;
        this.c = new brl0((byte) 0);
    }

    public bih1(ConstraintLayout constraintLayout, View view, EncoreTextView encoreTextView, EncoreProgressIndicatorButton encoreProgressIndicatorButton) {
        this.a = (byte) 10;
        this.b = view;
        this.c = encoreProgressIndicatorButton;
    }

    public bih1(ArrayList arrayList, ArrayList arrayList2, WebViewStartUpResultBoundaryInterface webViewStartUpResultBoundaryInterface) {
        this.a = (byte) 25;
        this.b = arrayList2;
        this.c = webViewStartUpResultBoundaryInterface;
    }

    public bih1(ViewPager viewPager) {
        this.a = (byte) 12;
        this.c = viewPager;
        this.b = new Rect();
    }
}
