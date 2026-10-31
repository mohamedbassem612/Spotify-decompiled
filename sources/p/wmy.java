package p;

import android.R;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.casita.v1.resolved.ResolvedHome;
import com.spotify.casita.v1.resolved.Section;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.extendedmetadata.proto.BatchedExtensionResponse;
import com.spotify.messages.PitResult;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.player.model.Context$Metadata;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.Suppressions$Providers;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wmy implements BiFunction, Function {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public wmy(Activity activity, hop hopVar, vnp vnpVar, wnp wnpVar, xnp xnpVar, ynp ynpVar, hc51 hc51Var, wao0 wao0Var) {
        w751 w751Var = new w751(new plm(activity, 2132018251), new mn41(hc51Var, (byte) 4));
        w751Var.setId(2131430809);
        this.a = w751Var;
        this.b = new y441(((kop) hopVar.a.c).i(), w751Var, wao0Var);
        this.c = new oy41(((kop) xnpVar.a.c).i(), w751Var);
        kop kopVar = (kop) vnpVar.a.c;
        esw eswVarI = kopVar.i();
        tl7 tl7VarB = cwl1.B(kopVar.c);
        c8o.m(tl7VarB);
        di4 di4VarD = kopVar.d();
        ww41 ww41Var = kopVar.a;
        hc51 hc51VarA0 = ww41Var.a0();
        c8o.l(hc51VarA0);
        c8o.l(ww41Var.I());
        this.e = new rw41(eswVarI, tl7VarB, di4VarD, hc51VarA0, w751Var, wao0Var);
        this.d = new oy41(((kop) wnpVar.a.c).i(), w751Var);
        kop kopVar2 = (kop) ynpVar.a.c;
        c8o.l(kopVar2.a.I());
        iac0 iac0VarM = rx31.m(kopVar2.c);
        znp znpVar = (znp) kopVar2.a1.get();
        hc51 hc51VarA1 = kopVar2.a.a0();
        c8o.l(hc51VarA1);
        this.f = new h551(w751Var, wao0Var, iac0VarM, znpVar, hc51VarA1, (y751) kopVar2.y.get(), new khc((byte) 14));
    }

    public static void R(w751 w751Var, View view) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!(i2 < w751Var.getChildCount())) {
                i = -1;
                break;
            }
            int i3 = i2 + 1;
            View childAt = w751Var.getChildAt(i2);
            if (childAt == null) {
                tw20.p();
                return;
            } else {
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                if (u890.j(view, childAt)) {
                    break;
                }
                i++;
                i2 = i3;
            }
        }
        if (i >= 0) {
            return;
        }
        w751Var.removeAllViews();
        w751Var.addView(view);
    }

    public static final /* synthetic */ bpb1 b(wmy wmyVar) {
        return (bpb1) wmyVar.f;
    }

    public static final /* synthetic */ koc0 c(wmy wmyVar) {
        return (koc0) wmyVar.b;
    }

    public static void o(w751 w751Var, xb51 xb51Var) {
        Iterator it = w751Var.c.iterator();
        while (it.hasNext()) {
            ((v751) it.next()).i = null;
        }
        w751Var.b = xb51Var;
        w751.b(w751Var);
    }

    public void A(boolean z) {
        ((Bundle) this.a).putBoolean("isSystemRoute", z);
    }

    public void B(int i) {
        ((Bundle) this.a).putInt("playbackStream", i);
    }

    public void C(int i) {
        ((Bundle) this.a).putInt("playbackType", i);
    }

    public void D(int i) {
        ((Bundle) this.a).putInt("presentationDisplayId", i);
    }

    public void E(String str) {
        this.f = str;
    }

    public void F(int i) {
        ((Bundle) this.a).putInt("volume", i);
    }

    public void G(int i) {
        ((Bundle) this.a).putInt("volumeHandling", i);
    }

    public void H(int i) {
        ((Bundle) this.a).putInt("volumeMax", i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(onm onmVar) {
        wfo0 wfo0Var;
        if (onmVar instanceof wfo0) {
            wfo0Var = (wfo0) onmVar;
            int i = wfo0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wfo0Var.c = i - Integer.MIN_VALUE;
            } else {
                wfo0Var = new wfo0(this, onmVar);
            }
        } else {
            wfo0Var = new wfo0(this, onmVar);
        }
        Object objK = wfo0Var.a;
        int i2 = wfo0Var.c;
        if (i2 == 0) {
            hm5.M(objK);
            mr20 mr20VarA = ((b7n) this.a).a(m6n.a);
            wfo0Var.c = 1;
            objK = b5p1.k(mr20VarA, wfo0Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        Integer num = (Integer) objK;
        if (num != null) {
            return Boolean.valueOf(num.intValue() != rfo0.h.a);
        }
        return Boolean.FALSE;
    }

    public void J(String str, String str2, String str3) {
        l();
        dg30 dg30Var = (dg30) this.b;
        View composeView = new ComposeView(dg30Var, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        this.e = composeView;
        composeView.setContent(new j2i(34705104, new i0j0(v8r.q(Boolean.TRUE), this, str2, str, str3, (byte) 1), true));
        ((ViewGroup) dg30Var.findViewById(R.id.content)).addView(composeView);
    }

    public PendingIntent K(int i, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_data", new xjb1(i, str2, str3, str, str4));
        return ((zo5) this.c).a(AppLifecycleServicePendingIntent.START_PLAYBACK, bundle);
    }

    public void L(nlt0 nlt0Var) {
        PitResult pitResultBuild;
        String str = (String) this.d;
        if (nlt0Var instanceof jlt0) {
            n3t0 n3t0VarN = PitResult.n();
            n3t0VarN.s(10);
            n3t0VarN.q(((jlt0) nlt0Var).a);
            n3t0VarN.r(str);
            pitResultBuild = (PitResult) n3t0VarN.build();
        } else if (nlt0Var instanceof llt0) {
            n3t0 n3t0VarN2 = PitResult.n();
            n3t0VarN2.s(20);
            n3t0VarN2.q(((llt0) nlt0Var).a);
            n3t0VarN2.r(str);
            pitResultBuild = (PitResult) n3t0VarN2.build();
        } else if (nlt0Var instanceof mlt0) {
            mlt0 mlt0Var = (mlt0) nlt0Var;
            n3t0 n3t0VarN3 = PitResult.n();
            n3t0VarN3.s(30);
            n3t0VarN3.q(mlt0Var.a);
            n3t0VarN3.r(str);
            n3t0VarN3.n(mlt0Var.b);
            pitResultBuild = (PitResult) n3t0VarN3.build();
        } else {
            if (!(nlt0Var instanceof klt0)) {
                eg.o();
                return;
            }
            n3t0 n3t0VarN4 = PitResult.n();
            n3t0VarN4.s(40);
            n3t0VarN4.r(str);
            n3t0VarN4.n(((klt0) nlt0Var).b);
            pitResultBuild = n3t0VarN4.build();
        }
        ((t2j0) this.a).a(pitResultBuild);
    }

    public void M(String str) {
        t45 t45Var = (t45) this.e;
        if (t45Var != null) {
            t45Var.a("outcome", str);
            t45Var.g("standard_pi_init");
            ((zle1) this.b).b(t45Var.e());
        }
        this.e = null;
    }

    public void N() {
        s45 s45Var = (zle1) this.b;
        boolean zB = ((el4) ((erd) this.c).a.get()).b();
        s45Var.getClass();
        t45 t45Var = null;
        t45 t45VarA = zB ? s45Var.a("standard_pi_init") : null;
        if (t45VarA != null) {
            t45VarA.h = "android-system-integrity";
            t45.m(t45VarA, "standard_pi_init", 4);
            t45Var = t45VarA;
        }
        this.e = t45Var;
    }

    public void O(String str) {
        t45 t45Var = (t45) this.f;
        if (t45Var != null) {
            t45Var.a("outcome", str);
            t45Var.g("standard_pi_request");
            ((zle1) this.b).b(t45Var.e());
        }
        this.f = null;
    }

    public void P() {
        s45 s45Var = (zle1) this.b;
        boolean zB = ((el4) ((erd) this.c).a.get()).b();
        s45Var.getClass();
        t45 t45Var = null;
        t45 t45VarA = zB ? s45Var.a("standard_pi_request") : null;
        if (t45VarA != null) {
            t45VarA.h = "android-system-integrity";
            t45.m(t45VarA, "standard_pi_request", 4);
            t45Var = t45VarA;
        }
        this.f = t45Var;
    }

    public void Q(lw41 lw41Var, xb51 xb51Var) {
        View view;
        View view2;
        View view3;
        rt01 rt01Var;
        h551 h551Var = (h551) this.f;
        oy41 oy41Var = (oy41) this.d;
        oy41 oy41Var2 = (oy41) this.c;
        y441 y441Var = (y441) this.b;
        rw41 rw41Var = (rw41) this.e;
        w751 w751Var = (w751) this.a;
        boolean z = lw41Var instanceof iw41;
        z6x z6xVar = z6x.a;
        if (z) {
            rw41Var.a(z6xVar, (xb51) null);
            xfz xfzVar = ((iw41) lw41Var).a;
            dtw dtwVar = (dtw) y441Var.d;
            if (dtwVar == null) {
                w751 w751Var2 = (w751) y441Var.b;
                tka0 tka0Var = dtw.C;
                Context context = w751Var2.getContext();
                esw eswVar = (esw) y441Var.a;
                wao0 wao0Var = (wao0) y441Var.c;
                iop iopVar = eswVar.a;
                switch (iopVar.a) {
                    case 0:
                        xfx xfxVarC0 = ((kop) iopVar.b.c).a.c0();
                        c8o.l(xfxVarC0);
                        rt01Var = new rt01(new t8x(xfxVarC0.f, (byte) 4), new urk0((byte) 4), wao0Var);
                        break;
                    default:
                        xfx xfxVarC1 = ((apq) iopVar.b.c).a.c0();
                        c8o.l(xfxVarC1);
                        rt01Var = new rt01(new t8x(xfxVarC1.f, (byte) 4), new urk0((byte) 4), wao0Var);
                        break;
                }
                y441Var.d = mhc.b(context, w751Var2, rt01Var, xfzVar, (ipb1) null, 112);
            } else {
                dtwVar.f(xfzVar);
            }
            dtw dtwVar2 = (dtw) y441Var.d;
            if (dtwVar2 == null || (view3 = dtwVar2.w) == null) {
                eg.m("View not initialized");
                return;
            } else {
                R(w751Var, view3);
                o(w751Var, xb51Var);
                return;
            }
        }
        if (lw41Var instanceof gw41) {
            o(w751Var, null);
            if (xb51Var == null) {
                rw41Var.a(((gw41) lw41Var).a, (xb51) null);
            } else {
                rw41Var.a(((gw41) lw41Var).a, xb51Var);
            }
            R(w751Var, rw41Var.d);
            return;
        }
        if (lw41Var instanceof hw41) {
            rw41Var.a(z6xVar, (xb51) null);
            f6x f6xVar = ((hw41) lw41Var).a;
            dtw dtwVar3 = oy41Var2.c;
            if (dtwVar3 == null) {
                w751 w751Var3 = oy41Var2.b;
                tka0 tka0Var2 = dtw.C;
                oy41Var2.c = mhc.b(w751Var3.getContext(), w751Var3, (j6x) oy41Var2.a.b.get(), f6xVar, (ipb1) null, 112);
            } else {
                dtwVar3.f(f6xVar);
            }
            dtw dtwVar4 = oy41Var2.c;
            if (dtwVar4 == null || (view2 = dtwVar4.w) == null) {
                eg.m("View not initialized");
                return;
            } else {
                R(w751Var, view2);
                o(w751Var, xb51Var);
                return;
            }
        }
        if (!lw41Var.equals(kw41.a)) {
            if (!(lw41Var instanceof jw41)) {
                eg.o();
                return;
            }
            o(w751Var, null);
            if (xb51Var == null) {
                h551Var.b(((jw41) lw41Var).a, (xb51) null);
            } else {
                h551Var.b(((jw41) lw41Var).a, xb51Var);
            }
            R(w751Var, h551Var.g);
            return;
        }
        o(w751Var, null);
        rw41Var.a(z6xVar, (xb51) null);
        dtw dtwVarB = oy41Var.c;
        if (dtwVarB == null) {
            w751 w751Var4 = oy41Var.b;
            tka0 tka0Var3 = dtw.C;
            dtwVarB = mhc.b(w751Var4.getContext(), w751Var4, (l9e0) oy41Var.a.J.get(), rih1.a, (ipb1) null, 112);
            oy41Var.c = dtwVarB;
        }
        if (dtwVarB == null || (view = dtwVarB.w) == null) {
            eg.m("View not initialized");
        } else {
            R(w751Var, view);
        }
    }

    public void S(tv80 tv80Var, boolean z) {
        ((xv61) this.b).a(rc11.a.b(yfo0.class), rih1.a).a(Boolean.valueOf(!z), Boolean.valueOf(z), tv80Var);
    }

    public void a(qim0 qim0Var, b0k b0kVar, int i) {
        wmy wmyVar;
        b0k b0kVar2;
        qim0 qim0Var2;
        Object lhxVar;
        ven0 ven0Var;
        cir0 cir0Var;
        tob1 tob1Var;
        Object kx70Var;
        ihg0 ihg0Var;
        cir0 cir0Var2;
        tob1 tob1Var2;
        wmy wmyVar2 = this;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2016644883);
        int i2 = i | 6 | (b0kVar3.i(wmyVar2) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            cir0 cir0Var3 = (cir0) b0kVar3.k(k2r0.a);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = (gx70) ((xep) wmyVar2.d).get();
                b0kVar3.s0(objT);
            }
            gx70 gx70Var = (gx70) objT;
            Object[] objArr = new Object[0];
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = lx70.b;
                b0kVar3.s0(objT2);
            }
            tob1 tob1Var3 = (ven0) k5p1.s(objArr, (Function0) objT2, b0kVar3, 48);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(((st60) wmyVar2.b).r());
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object[] objArr2 = new Object[0];
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = h050.e1;
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var3 = (ven0) k5p1.s(objArr2, (Function0) objT4, b0kVar3, 48);
            boolean zG = b0kVar3.g((Uri) tob1Var3.getValue());
            Object objT5 = b0kVar3.T();
            if (zG || objT5 == m4cVar) {
                objT5 = v8r.q((Object) null);
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var4 = (ven0) objT5;
            e1r0 e1r0Var = new e1r0((byte) 5, false);
            boolean zG2 = b0kVar3.g(ven0Var3) | b0kVar3.i(wmyVar2) | b0kVar3.g(cir0Var3);
            Object objT6 = b0kVar3.T();
            if (zG2 || objT6 == m4cVar) {
                lhxVar = new lhx(wmyVar2, cir0Var3, ven0Var2, ven0Var3, (byte) 19);
                b0kVar3.s0(lhxVar);
            } else {
                lhxVar = objT6;
            }
            ihg0 ihg0VarE = p1p1.E(e1r0Var, (iu30) lhxVar, b0kVar3);
            boolean zI = b0kVar3.i(gx70Var) | b0kVar3.g(cir0Var3);
            Object objT7 = b0kVar3.T();
            if (zI || objT7 == m4cVar) {
                objT7 = new hs20(gx70Var, cir0Var3, (byte) 27);
                b0kVar3.s0(objT7);
            }
            q3p1.b(0, 1, (Function0) objT7, b0kVar3, false);
            Uri uri = (Uri) ven0Var3.getValue();
            boolean zG3 = b0kVar3.g(ven0Var3) | b0kVar3.i(wmyVar2) | b0kVar3.g(cir0Var3) | b0kVar3.g(tob1Var3);
            Object objT8 = b0kVar3.T();
            if (zG3 || objT8 == m4cVar) {
                af0 af0Var = new af0(ven0Var3, wmyVar2, cir0Var3, tob1Var3, (lnm) null, (byte) 11);
                ven0Var = ven0Var3;
                wmyVar2 = wmyVar2;
                cir0Var = cir0Var3;
                tob1Var = tob1Var3;
                b0kVar3.s0(af0Var);
                objT8 = af0Var;
            } else {
                cir0Var = cir0Var3;
                tob1Var = tob1Var3;
                ven0Var = ven0Var3;
            }
            qxd0.t(uri, b0kVar3, (vu30) objT8);
            Uri uri2 = (Uri) tob1Var.getValue();
            boolean zG4 = b0kVar3.g(tob1Var) | b0kVar3.g(ven0Var4) | b0kVar3.i(wmyVar2);
            Object objT9 = b0kVar3.T();
            if (zG4 || objT9 == m4cVar) {
                lqv lqvVar = new lqv(wmyVar2, tob1Var, ven0Var4, (lnm) null, (byte) 26);
                b0kVar3.s0(lqvVar);
                objT9 = lqvVar;
            }
            qxd0.t(uri2, b0kVar3, (vu30) objT9);
            boolean zG5 = b0kVar3.g(tob1Var) | b0kVar3.g(ven0Var) | b0kVar3.i(wmyVar2) | b0kVar3.i(context) | b0kVar3.i(ihg0VarE) | b0kVar3.g(cir0Var);
            Object objT10 = b0kVar3.T();
            if (zG5 || objT10 == m4cVar) {
                tob1 tob1Var4 = tob1Var;
                cir0 cir0Var4 = cir0Var;
                ihg0Var = ihg0VarE;
                kx70Var = new kx70(wmyVar2, context, ihg0Var, cir0Var4, tob1Var4, ven0Var, ven0Var2, (byte) 0);
                cir0Var2 = cir0Var4;
                tob1Var2 = tob1Var4;
                b0kVar3.s0(kx70Var);
            } else {
                tob1Var2 = tob1Var;
                kx70Var = objT10;
                cir0Var2 = cir0Var;
                ihg0Var = ihg0VarE;
            }
            qxd0.S((Function0) kx70Var, b0kVar3);
            Object objT11 = b0kVar3.T();
            if (objT11 == m4cVar) {
                objT11 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT11);
            }
            ven0 ven0Var5 = (ven0) objT11;
            Object objT12 = b0kVar3.T();
            if (objT12 == m4cVar) {
                objT12 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT12);
            }
            c9n c9nVar = (c9n) objT12;
            boolean zI2 = b0kVar3.i(gx70Var) | b0kVar3.g(cir0Var2) | b0kVar3.g(ven0Var) | b0kVar3.i(ihg0Var) | b0kVar3.g(tob1Var2) | b0kVar3.i(c9nVar) | b0kVar3.i(wmyVar2);
            Object objT13 = b0kVar3.T();
            if (zI2 || objT13 == m4cVar) {
                wmyVar = this;
                vd6 vd6Var = new vd6(gx70Var, cir0Var2, ihg0Var, ven0Var, ven0Var2, ven0Var5, tob1Var2, c9nVar, wmyVar, (byte) 6);
                b0kVar3.s0(vd6Var);
                objT13 = vd6Var;
            } else {
                wmyVar = wmyVar2;
            }
            iu30 iu30Var = (iu30) objT13;
            t2b t2bVar = (t2b) wmyVar.c;
            qim0Var2 = nim0.a;
            qim0 qim0VarY = voo1.y(u291.d(qim0Var2, 1.0f), voo1.c);
            Bitmap bitmap = (Bitmap) ven0Var4.getValue();
            ix70 ix70Var = (ix70) wmyVar.e;
            tx70 tx70Var = new tx70(bitmap, ix70Var.a, ix70Var.b);
            b0kVar2 = b0kVar3;
            t2bVar.c(tx70Var, qim0VarY, iu30Var, b0kVar2, 0);
        } else {
            wmyVar = wmyVar2;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(wmyVar, qim0Var2, i, (byte) 16);
        }
    }

    public Object apply(Object obj, Object obj2) {
        String str = (String) this.b;
        LoggingParams loggingParams = (LoggingParams) this.e;
        PlayOrigin playOrigin = (PlayOrigin) this.d;
        g410 g410Var = (g410) obj;
        Map map = (Map) obj2;
        String str2 = g410Var.b;
        h410 h410Var = (h410) this.a;
        q410 q410Var = h410Var.d;
        if (str2 == null) {
            return q410Var.c(str, (PreparePlayOptions) this.c, playOrigin, loggingParams, (Map) this.f);
        }
        PreparePlayOptions preparePlayOptions = (PreparePlayOptions) this.c;
        if (preparePlayOptions == null) {
            preparePlayOptions = PreparePlayOptions.EMPTY;
        }
        preparePlayOptions.getClass();
        PreparePlayOptions.Builder builder = preparePlayOptions.toBuilder();
        builder.skipTo(SkipToTrack.fromUri(str));
        PreparePlayOptions preparePlayOptionsBuild = builder.build();
        if (g410Var.a) {
            return q410Var.c(str2, preparePlayOptionsBuild, playOrigin, loggingParams, (Map) this.f);
        }
        a510 a510Var = h410Var.c;
        Map map2 = (Map) this.f;
        LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0(Context$Metadata.KEY_SORTING_CRITERIA, "added_at ASC")});
        if (map2 != null) {
            linkedHashMapM.putAll(map2);
        }
        com.spotify.player.model.Context.Builder builder2 = com.spotify.player.model.Context.fromUri(str2).toBuilder();
        builder2.metadata(linkedHashMapM);
        com.spotify.player.model.Context contextBuild = builder2.build();
        PreparePlayOptions.Builder builder3 = preparePlayOptionsBuild.toBuilder();
        if (!y7y0.L(map)) {
            builder3.suppressions(Suppressions.create(Collections.singleton(Suppressions$Providers.MFT)));
        }
        PlayerOptionOverrides.Builder builder4 = PlayerOptionOverrides.builder();
        Boolean bool = Boolean.FALSE;
        builder3.playerOptionsOverride(builder4.shufflingContext(bool).repeatingContext(bool).repeatingTrack(bool).build());
        return ((muz) a510Var.b.getValue()).a(PlayCommand.builder(contextBuild, playOrigin).options(builder3.build()).loggingParams(loggingParams).build());
    }

    public void d(ArrayList arrayList) {
        if (arrayList == null) {
            hhg1.n("filters must not be null");
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (Object obj : arrayList) {
            if (obj instanceof IntentFilter) {
                IntentFilter intentFilter = (IntentFilter) obj;
                ArrayList arrayList2 = (ArrayList) this.c;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    public void e(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList = (ArrayList) this.b;
            if (TextUtils.isEmpty(str)) {
                hhg1.n("groupMemberId must not be empty");
                return;
            } else if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
    }

    public PendingIntent f(int i, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_data", new iy1(i, str2, str3, str, str4));
        return ((zo5) this.c).a(AppLifecycleServicePendingIntent.ADD_TO_QUEUE, bundle);
    }

    public PendingIntent g(int i, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_data", new ez1(i, str2, str3, str, str4));
        return ((zo5) this.c).a(AppLifecycleServicePendingIntent.ADD_TO_YOUR_EPISODE, bundle);
    }

    public gvh0 h() {
        Bundle bundle = (Bundle) this.a;
        bundle.putParcelableArrayList("controlFilters", new ArrayList<>((ArrayList) this.c));
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((ArrayList) this.b));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((HashSet) this.d));
        return new gvh0((String) this.f, bundle, (List) this.e);
    }

    public void i() {
        ((ArrayList) this.c).clear();
    }

    public void j() {
        ((ArrayList) this.b).clear();
    }

    public jhm k(String str, String str2, boolean z) {
        return new jhm("profile_restrict_user_listening_activity", z ? nrx.c : znx.c, (fhm) null, Integer.valueOf(z ? 2131961318 : 2131961317), (String) null, false, (tm81) null, new ihm(chm.c, z ? new ghm(xt21.X, xt21.Y) : new ghm(xt21.Z, xt21.N0), new gh1((byte) 24, this, str, str2, z)), 244);
    }

    public void l() {
        View view = (ComposeView) this.e;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        this.e = null;
    }

    public PendingIntent m(int i, String str, String str2, String str3, Bundle bundle) {
        String string;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("push_data", new keu(str, str2, i, str3));
        if (bundle != null && (string = bundle.getString("groupId")) != null) {
            for (StatusBarNotification statusBarNotification : ljo1.q(((vno0) this.d).b)) {
                if (u890.j(string, statusBarNotification.getNotification().getGroup())) {
                    ((rvy0) this.f).a(statusBarNotification.getId());
                }
            }
        }
        return ((zo5) this.c).a(AppLifecycleServicePendingIntent.DISMISS, bundle2);
    }

    public PendingIntent n(int i, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_data", new yvu(i, str2, str3, str, str4));
        return ((zo5) this.c).a(AppLifecycleServicePendingIntent.DOWNLOAD, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object p(String str, boolean z, ice0 ice0Var, boolean z2, String str2, String str3, onm onmVar) {
        cq10 cq10Var;
        String str4;
        boolean z3;
        if (onmVar instanceof cq10) {
            cq10Var = (cq10) onmVar;
            int i = cq10Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cq10Var.e = i - Integer.MIN_VALUE;
            } else {
                cq10Var = new cq10(this, onmVar);
            }
        } else {
            cq10Var = new cq10(this, onmVar);
        }
        cq10 cq10Var2 = cq10Var;
        Object objA = cq10Var2.c;
        int i2 = cq10Var2.e;
        if (i2 == 0) {
            hm5.M(objA);
            w62 w62Var = ice0Var == ice0.f ? (w62) this.b : (k2e) this.a;
            cq10Var2.a = str;
            cq10Var2.b = z;
            cq10Var2.e = 1;
            objA = c2e.a(w62Var, str, ice0Var, z2, z, (String) null, str2, str3, cq10Var2, 16);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            str4 = str;
            z3 = z;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = cq10Var2.b;
            str4 = cq10Var2.a;
            hm5.M(objA);
        }
        sy21 sy21Var = (sy21) objA;
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("ResolvedHome is null");
            return null;
        }
        ResolvedHome resolvedHome = (ResolvedHome) obj;
        BatchedExtensionResponse batchedExtensionResponseP = resolvedHome.p().p();
        ioj0 ioj0VarH = batchedExtensionResponseP.p() > 0 ? ((yjq) this.c).h(batchedExtensionResponseP) : null;
        yz21 yz21VarV = qro1.v(resolvedHome.r(), z3);
        uqs uqsVar = new uqs(yz21VarV, str4, z3, (kp00) this.e, ((w25) this.f).j0());
        h290<Section> h290VarP = resolvedHome.s().p();
        ArrayList arrayList = new ArrayList();
        for (Section section : h290VarP) {
            section.getClass();
            jn60 jn60VarO = uqsVar.o(section);
            if (jn60VarO != null) {
                arrayList.add(jn60VarO);
            }
        }
        x4e0 x4e0Var = o0c.D(sy21Var, (yqg) this.d) ? x4e0.b : x4e0.a;
        String strS = resolvedHome.r().s();
        String strV = resolvedHome.r().r().v();
        return new dq10(arrayList, x4e0Var, yz21VarV, strS, strV.length() > 0 ? strV : null, resolvedHome.r().p().v(), resolvedHome.t() ? o7h.p1(resolvedHome.q().getUrisList()) : null, ioj0VarH);
    }

    public PendingIntent q(String str, AppLifecycleServicePendingIntent appLifecycleServicePendingIntent, qvy0 qvy0Var) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.addCategory(fwy0.a(appLifecycleServicePendingIntent, lgo1.s(qvy0Var)));
        Context context = (Context) this.a;
        intent.setClassName(context, (String) this.b);
        intent.setExtrasClassLoader(context.getClassLoader());
        intent.setFlags(268435456);
        intent.putExtra("push_data", (Parcelable) qvy0Var);
        return ((ewy0) this.e).f(qvy0Var.t0(), 1, intent);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    public Observable r(String str) {
        t781 t781Var = (yeu0) this.c;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        LinkedHashSet linkedHashSet = s4b1.g;
        v5b1 v5b1Var = s4b1VarX.d;
        if (!o7h.i0(linkedHashSet, v5b1Var != null ? v5b1Var.getType() : null)) {
            int iOrdinal = s4b1VarX.c.ordinal();
            if (iOrdinal == 30) {
                t781Var = (xb3) this.a;
            } else if (iOrdinal == 44) {
                t781Var = (ns6) this.b;
            } else if (iOrdinal == 309) {
                t781Var = (y6z) this.f;
            } else if (iOrdinal != 646) {
                if (iOrdinal == 860) {
                    t781Var = (t781) this.d;
                } else if (iOrdinal == 844 || iOrdinal == 845) {
                    t781Var = (y6z) this.f;
                } else {
                    t781Var = (iOrdinal == 926 || iOrdinal == 927) ? (y6z) this.e : null;
                }
            }
        }
        return t781Var != null ? t781Var.f(str) : Observable.error(new Throwable("Unsupported LinkType of uri = ".concat(str)));
    }

    public void s(String str, String str2, tv80 tv80Var, boolean z) {
        u9c0 u9c0VarQ = cto1.q((dg30) this.c);
        String str3 = ihc1.y0(str2) ? str : str2;
        xab1 xab1Var = (xab1) this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.f = fn31.T(u9c0VarQ, (o8n) null, 0, new fhl(this, z, str3, u9c0VarQ, str, str2, tv80Var, (lnm) null, (byte) 3), 3);
    }

    public void t(o5b0 o5b0Var, Set set) {
        bpb1 bpb1Var = (bpb1) this.f;
        Map map = (Map) bpb1Var.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof wul1) {
                arrayList.add(obj);
            }
        }
        bpb1Var.m((Object) null, sqg0.P(map, new mmr0(o5b0Var, o7h.p1(arrayList))));
    }

    public PendingIntent u(int i, String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_data", new ca41(i, str2, str3, str, str4));
        return ((zo5) this.c).a(AppLifecycleServicePendingIntent.SAVE_ENTITY, bundle);
    }

    public void v(int i) {
        ((Bundle) this.a).putInt("connectionState", i);
    }

    public void w(String str) {
        ((Bundle) this.a).putString("status", str);
    }

    public void x(int i) {
        ((Bundle) this.a).putInt("deviceType", i);
    }

    public void y(boolean z) {
        ((Bundle) this.a).putBoolean("enabled", z);
    }

    public void z(Bundle bundle) {
        Bundle bundle2 = (Bundle) this.a;
        if (bundle == null) {
            bundle2.putBundle("extras", null);
        } else {
            bundle2.putBundle("extras", new Bundle(bundle));
        }
    }

    public wmy() {
        this.a = new frl1((byte) 13);
        this.d = b380.m();
        this.f = b380.m();
    }

    public wmy(th30 th30Var, t700 t700Var, lzn0 lzn0Var, xrk xrkVar) {
        this.a = th30Var;
        this.b = t700Var;
        this.c = lzn0Var;
        this.d = xrkVar;
        this.f = new AtomicBoolean(false);
    }

    public wmy(t2j0 t2j0Var, zle1 zle1Var, erd erdVar, String str) {
        this.a = t2j0Var;
        this.b = zle1Var;
        this.c = erdVar;
        this.d = str;
    }

    public Object apply(Object obj) {
        q410 q410Var = (q410) this.a;
        feh fehVar = (feh) obj;
        if (!(fehVar instanceof ceh)) {
            return Single.just(fehVar);
        }
        return new FlowableSingleSingle(new FlowableTake(q410Var.k.x(new gap1((String) this.b, (byte) 9)))).timeout(5L, TimeUnit.SECONDS).flatMap(new n410(q410Var, (String) this.c, (PlayOrigin) this.d, (LoggingParams) this.e, (Map) this.f)).onErrorReturnItem(fehVar);
    }

    public wmy(gj5 gj5Var, Flowable flowable, Scheduler scheduler, lzn0 lzn0Var, a1r0 a1r0Var) {
        this.a = gj5Var;
        this.b = flowable;
        this.c = scheduler;
        this.d = lzn0Var;
        this.e = a1r0Var;
        this.f = new vku();
    }

    public wmy(q8n q8nVar, roc0 roc0Var, o860 o860Var) {
        this.a = q8nVar;
        this.b = roc0Var;
        this.c = o860Var;
        this.d = (rzq) o860Var.d;
        this.f = gio1.b(b7x.a);
    }

    public wmy(jjz jjzVar, kt91 kt91Var, dg30 dg30Var, vcd0 vcd0Var, q8n q8nVar) {
        this.a = jjzVar;
        this.b = kt91Var;
        this.c = dg30Var;
        this.d = vcd0Var;
        this.e = q8nVar;
    }

    public wmy(i8h1 i8h1Var, dg30 dg30Var, r35 r35Var, o3x0 o3x0Var) {
        this.a = i8h1Var;
        this.b = dg30Var;
        this.c = r35Var;
        this.d = o3x0Var;
        this.f = new idd1(new z8i0(this, (byte) 15));
    }

    public wmy(luk lukVar, pta1 pta1Var, gg11 gg11Var, Activity activity, th30 th30Var, Scheduler scheduler, Scheduler scheduler2) {
        this.a = lukVar;
        this.b = pta1Var;
        this.c = gg11Var;
        this.d = activity;
        this.e = th30Var;
        this.f = new hp91(scheduler, scheduler2, (byte) 8);
    }

    public wmy(q8n q8nVar, pbr0 pbr0Var, lzn0 lzn0Var, tgf tgfVar, yqg yqgVar, cir0 cir0Var) {
        this.a = q8nVar;
        this.b = pbr0Var;
        this.c = lzn0Var;
        this.d = tgfVar;
        this.e = yqgVar;
        this.f = cir0Var.h().a(i7w0.f, new wj1(this, (byte) 29));
    }

    public wmy(gw70 gw70Var, st60 st60Var, t2b t2bVar, xep xepVar, ix70 ix70Var, q8n q8nVar) {
        b3s b3sVar = b3s.c;
        this.a = gw70Var;
        this.b = st60Var;
        this.c = t2bVar;
        this.d = xepVar;
        this.e = ix70Var;
        this.f = q8nVar;
    }

    public /* synthetic */ wmy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public wmy(EditText editText, ProgressBar progressBar, ConstraintLayout constraintLayout, EncoreButton encoreButton, EncoreButton encoreButton2, EncoreTextView encoreTextView, EncoreTextView encoreTextView2) {
        this.a = constraintLayout;
        this.b = editText;
        this.c = encoreTextView;
        this.d = encoreButton;
        this.e = progressBar;
        this.f = encoreButton2;
    }

    public wmy(ScrollView scrollView, Button button, FacePileView facePileView, TextView textView, ProgressBar progressBar, TextView textView2, TextView textView3) {
        this.a = button;
        this.b = facePileView;
        this.c = textView;
        this.d = progressBar;
        this.e = textView2;
        this.f = textView3;
    }

    public wmy(String str, String str2) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        Bundle bundle = new Bundle();
        this.a = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            } else {
                bhn0.i("name must not be null");
                throw null;
            }
        }
        bhn0.i("id must not be null");
        throw null;
    }

    public wmy(gvh0 gvh0Var) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        if (gvh0Var != null) {
            this.a = new Bundle(gvh0Var.a);
            this.b = gvh0Var.e();
            this.c = gvh0Var.b();
            this.d = gvh0Var.a();
            this.e = gvh0Var.c;
            this.f = gvh0Var.b;
            return;
        }
        hhg1.n("descriptor must not be null");
        throw null;
    }
}
