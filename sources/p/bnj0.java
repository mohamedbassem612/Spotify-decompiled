package p;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreProgressIndicatorButton;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bnj0 implements Function, dab1, m381, ks40, Function6, n490 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public bnj0(p7k0 p7k0Var) {
        this.a = (byte) 4;
        this.c = p7k0Var;
        l4r l4rVar = new l4r(pwc0.b, 1, hxj0.b1, new j4r(new r7j0(p7k0Var, (byte) 20)), hxj0.c1);
        hvm hvmVar = hvm.d;
        this.b = w3p1.m(l4rVar, new l4r(hvmVar, 2, hxj0.X0, new j4r(hxj0.V0), hxj0.Y0), new l4r(hvmVar, 2, hxj0.Z0, new j4r(hxj0.W0), hxj0.a1), gce0.R0);
    }

    public static bnj0 l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625303, viewGroup, false);
        int i = 2131430163;
        if (((TextView) m5n1.t(constraintLayoutInflate, 2131430163)) != null) {
            i = 2131430165;
            if (m5n1.t(constraintLayoutInflate, 2131430165) != null) {
                i = 2131430180;
                if (((TextView) m5n1.t(constraintLayoutInflate, 2131430180)) != null) {
                    i = 2131430181;
                    EncoreProgressIndicatorButton encoreProgressIndicatorButtonT = m5n1.t(constraintLayoutInflate, 2131430181);
                    if (encoreProgressIndicatorButtonT != null) {
                        return new bnj0((Object) constraintLayoutInflate, (Object) encoreProgressIndicatorButtonT, (byte) 15);
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public static mqj0 s(bnj0 bnj0Var, npj0 npj0Var, nqj0 nqj0Var, long j, long j2, qqj0 qqj0Var) {
        bnj0Var.getClass();
        return u(npj0Var, nqj0Var, qqj0Var, null, null, j, j2);
    }

    public static mqj0 t(bnj0 bnj0Var, npj0 npj0Var, nqj0 nqj0Var, o8n o8nVar, lbc0 lbc0Var) {
        return u(npj0Var, nqj0Var, pqj0.a, o8nVar, lbc0Var, ((Number) ((mdp0) bnj0Var.b).invoke()).longValue(), ((Number) ((mdp0) bnj0Var.c).invoke()).longValue());
    }

    public static mqj0 u(npj0 npj0Var, nqj0 nqj0Var, rqj0 rqj0Var, o8n o8nVar, lbc0 lbc0Var, long j, long j2) {
        boolean z;
        ixc1 wg60Var;
        uqj0 uqj0Var = nqj0Var.c;
        String str = nqj0Var.a;
        if (uqj0Var instanceof sqj0) {
            z = rqj0Var instanceof pqj0;
        } else {
            if (!(uqj0Var instanceof tqj0)) {
                eg.o();
                return null;
            }
            z = rqj0Var instanceof qqj0;
        }
        if (!z) {
            l1d.z("Metric view instance scope does not match configured scope for '", str, "'.");
            return null;
        }
        xoj0 xoj0Var = nqj0Var.b;
        if (!(xoj0Var instanceof xoj0)) {
            eg.o();
            return null;
        }
        cqj0 cqj0Var = xoj0Var.b;
        boolean z2 = cqj0Var instanceof cqj0;
        if (z2) {
            opj0 opj0Var = npj0Var.b;
            if (opj0Var != opj0.d) {
                n57.e("Histogram aggregation requires a Gauge instrument, but '" + str + "' uses " + opj0Var + ". Use createGauge() to record values for histograms.");
                return null;
            }
            if (cqj0Var.a.isEmpty()) {
                l1d.z("Histogram boundaries must not be empty for metric key '", str, "'.");
                return null;
            }
        }
        if (u890.j(cqj0Var, eqj0.a)) {
            wg60Var = new ixc1();
        } else if (u890.j(cqj0Var, dqj0.a)) {
            wg60Var = new eb80((byte) 6);
        } else if (u890.j(cqj0Var, bqj0.a)) {
            wg60Var = new hur((byte) 22);
        } else {
            if (!z2) {
                eg.o();
                return null;
            }
            wg60Var = new wg60(o7h.Z0(cqj0Var.a));
        }
        return new mqj0(new oqj0(npj0Var, nqj0Var, rqj0Var), wg60Var, o8nVar, lbc0Var, j, j2);
    }

    public int a(char[] cArr, int i, int i2) {
        int i3;
        gbc gbcVar = (gbc) this.c;
        Character ch = (Character) this.b;
        if (ch != null) {
            cArr[i] = ch.charValue();
            this.b = null;
            i3 = 1;
        } else {
            i3 = 0;
        }
        while (i3 < i2 && !gbcVar.z0()) {
            int iL0 = gbcVar.L0();
            if (iL0 <= 65535) {
                cArr[i + i3] = (char) iL0;
                i3++;
            } else {
                char c = (char) ((iL0 >>> 10) + 55232);
                char c2 = (char) ((iL0 & 1023) + 56320);
                cArr[i + i3] = c;
                int i4 = i3 + 1;
                if (i4 < i2) {
                    cArr[i4 + i] = c2;
                    i3 += 2;
                } else {
                    this.b = Character.valueOf(c2);
                    i3 = i4;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }

    public Object apply(Object obj) {
        wkd wkdVar;
        lf81 lf81Var;
        ioc0 ioc0Var;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        switch (b) {
            case 0:
                uv00 uv00Var = (uv00) obj;
                String str = (String) this.b;
                tv00 tv00VarA = uv00Var.a(vn71.class, str);
                vn71 vn71Var = tv00VarA.b;
                aw21 aw21Var = uv00Var.a(aw21.class, str).b;
                xv91 xv91Var = uv00Var.a(xv91.class, str).b;
                hz00 hz00Var = (hz00) this.c;
                if ((hz00Var == hz00.d2 && vn71Var == null && tv00VarA.c.b == 3) || ((hz00Var == hz00.B2 && xv91Var == null) || (hz00Var == hz00.e2 && aw21Var == null))) {
                    return vmj0.a;
                }
                return new wmj0(aw21Var, vn71Var, xv91Var);
            case 7:
                ocn0 ocn0Var = (ocn0) obj;
                phi0 phi0Var = (phi0) this.b;
                if (!ocn0Var.a) {
                    return MaybeEmpty.a;
                }
                v8n0 v8n0Var = (v8n0) phi0Var.e;
                b75 b75Var = v8n0Var.d;
                boolean zC = b75Var.c();
                int iOrdinal = b75Var.g().ordinal();
                if (iOrdinal == 0) {
                    wkdVar = xkd.c;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    wkdVar = wkd.c;
                }
                Maybe maybeFirstElement = yoi1.i(v8n0Var.b(true, zC, wkdVar), o6xVar).firstElement();
                kqi0 kqi0Var = new kqi0(phi0Var, (ContextTrack) this.c, ocn0Var, (byte) 14);
                maybeFirstElement.getClass();
                return new MaybeFlatten(maybeFirstElement, kqi0Var);
            case 12:
                sm81 sm81Var = (sm81) obj;
                String str2 = ((m5o0) this.c).a;
                ContextTrack contextTrack = (ContextTrack) this.b;
                if (ln91.a(contextTrack) != 3 || !sm81Var.c) {
                    return new j5o0(Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_COLLECTION_CAN_BAN)), Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_COLLECTION_IS_BANNED)), contextTrack.uri(), str2, contextTrack.provider());
                }
                String strUri = contextTrack.uri();
                String strUid = contextTrack.uid();
                String strA0 = l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_CONTEXT_URI);
                if (strA0 != null) {
                    str2 = strA0;
                }
                return new k5o0(strUri, str2, strUid);
            case 20:
                PlayerState playerState = (PlayerState) obj;
                n0g0 n0g0Var = (n0g0) this.b;
                wao0 wao0Var = (wao0) this.c;
                ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
                return (contextTrack2 == null || l4o1.f0(contextTrack2) == null) ? gbu0.a : new hbu0(xyn1.w((ContextTrack) playerState.track().b(), true, (String) null, (String) null, new e4f0(wao0Var, (byte) 22)), new j5u0(!playerState.isPaused(), ((Number) playerState.duration().e(0L)).longValue(), ((Number) playerState.position(((Number) n0g0Var.invoke()).longValue()).e(0L)).longValue(), (float) ((Number) playerState.playbackSpeed().e(Double.valueOf(0.0d))).doubleValue()));
            case 21:
                mmr0 mmr0Var = (mmr0) obj;
                return (((Boolean) mmr0Var.b).booleanValue() && ((pqq0) this.b) == pqq0.a) ? new FlowableTake(yoi1.h(((lkd) this.c).c((ContextTrack) mmr0Var.a), o6xVar)) : Flowable.I(Boolean.FALSE);
            default:
                String str3 = (String) this.b;
                fip0 fip0Var = (fip0) this.c;
                mf81 mf81Var = (mf81) fip0Var.d;
                mf81Var.getClass();
                int i = ((hgc1) obj).a;
                int iC = l1d.C(i);
                if (iC == 0) {
                    lf81Var = (lf81) mf81Var.a.get();
                } else if (iC == 1) {
                    lf81Var = (lf81) mf81Var.b.get();
                } else if (iC == 2) {
                    lf81Var = (lf81) mf81Var.c.get();
                } else {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    lf81Var = (lf81) mf81Var.d.get();
                }
                lf81 lf81Var2 = lf81Var;
                soc0 soc0Var = (soc0) fip0Var.e;
                soc0Var.getClass();
                int iC2 = l1d.C(i);
                if (iC2 == 0) {
                    ioc0Var = (ioc0) soc0Var.a.get();
                } else if (iC2 == 1) {
                    ioc0Var = (ioc0) soc0Var.b.get();
                } else if (iC2 == 2) {
                    ioc0Var = (ioc0) soc0Var.c.get();
                } else {
                    if (iC2 != 3) {
                        eg.o();
                        return null;
                    }
                    ioc0Var = (ioc0) soc0Var.d.get();
                }
                return ((hn91) fip0Var.c).a(str3).flatMapObservable(new poj0(fip0Var, str3, lf81Var2, ioc0Var, (byte) 16));
        }
    }

    public o3r b() {
        return (o3r) this.b;
    }

    public Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return new f910((PlayerState) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (o841) obj5, ((waz0) ((p410) this.b).h).b((bbz0) obj6, ((wvp0) this.c).a));
    }

    public EGLSurface d(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        return ((hur) this.b).d(eGLDisplay, obj, i, z);
    }

    public ss40 e(int i, int i2, int i3) {
        return ((hur) this.b).e(i, i2, i3);
    }

    public EGLSurface f(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return fn31.E(eGLContext, eGLDisplay);
    }

    public EGLContext g(EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLContext eGLContext = (EGLContext) this.c;
        if (eGLContext != null) {
            return eGLContext;
        }
        EGLContext eGLContextG = ((hur) this.b).g(eGLDisplay, i, iArr);
        this.c = eGLContextG;
        return eGLContextG;
    }

    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        dab1[] dab1VarArr = (dab1[]) this.b;
        StackTraceElement[] stackTraceElementArrH = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            dab1 dab1Var = dab1VarArr[i];
            if (stackTraceElementArrH.length <= 1024) {
                break;
            }
            stackTraceElementArrH = dab1Var.h(stackTraceElementArr);
        }
        return stackTraceElementArrH.length > 1024 ? ((ekb) this.c).h(stackTraceElementArrH) : stackTraceElementArrH;
    }

    public void i(EGLDisplay eGLDisplay) {
        EGLContext eGLContext = (EGLContext) this.c;
        if (eGLContext != null) {
            fn31.G(eGLContext, eGLDisplay);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(String str, onm onmVar) {
        aio0 aio0Var;
        if (onmVar instanceof aio0) {
            aio0Var = (aio0) onmVar;
            int i = aio0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aio0Var.c = i - Integer.MIN_VALUE;
            } else {
                aio0Var = new aio0(this, onmVar);
            }
        } else {
            aio0Var = new aio0(this, onmVar);
        }
        Object objO = aio0Var.a;
        int i2 = aio0Var.c;
        boolean zBooleanValue = false;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                m3n0 m3n0Var = new m3n0((Object) this, (Object) str, lnmVar, (byte) 24);
                aio0Var.c = 1;
                objO = rc2.O(5000L, m3n0Var, aio0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            Boolean bool = (Boolean) objO;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public ConstraintLayout k() {
        return (ConstraintLayout) this.b;
    }

    public void m() {
        gfe gfeVar;
        int iC = l1d.C(1);
        if (iC == 0) {
            gfeVar = gfe.b;
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            gfeVar = gfe.c;
        }
        Disposable disposableSubscribe = ((qnv0) this.b).a(gfeVar, 8, "spotify:internal:onboarding").subscribe(ps4.T0, zzc0.N0);
        vku vkuVar = (vku) this.c;
        disposableSubscribe.getClass();
        vkuVar.a(disposableSubscribe);
    }

    public Observable n(boolean z) {
        dxz0 dxz0Var = (dxz0) this.c;
        return z ? Observable.combineLatest(((z141) this.b).a, dxz0Var.e(), new ncn0((byte) 16)) : dxz0Var.e();
    }

    public tv80 o(m87 m87Var) {
        w7h1 w7h1Var;
        fjl0 fjl0Var = (fjl0) this.c;
        r6h1 r6h1Var = fjl0Var.b;
        y6h1 y6h1Var = fjl0Var.c;
        boolean z = m87Var instanceof nmq0;
        b7x b7xVar = b7x.a;
        if (z) {
            nmq0 nmq0Var = (nmq0) m87Var;
            String str = nmq0Var.d;
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("opt_in_toggle", (String) null, (Integer) null, str, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            String str2 = nmq0Var.d;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("enable_release_notifications", 1, Collections.singletonMap("release_source_to_get_notifications_from", str2 != null ? str2 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
        } else if (m87Var instanceof umq0) {
            umq0 umq0Var = (umq0) m87Var;
            String str3 = umq0Var.d;
            x6h1 x6h1VarC2 = y6h1Var.c();
            x6h1VarC2.i.add(new a7h1("opt_in_toggle", (String) null, (Integer) null, str3, (String) null));
            x6h1VarC2.j = false;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            String str4 = umq0Var.d;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("disable_release_notifications", 1, Collections.singletonMap("release_source_to_not_get_notifications_from", str4 != null ? str4 : "")), y6h1VarA2, r6h1Var, System.currentTimeMillis());
        } else {
            if (!(m87Var instanceof srn0)) {
                eg.o();
                return null;
            }
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("podcast_navigate_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA3 = x6h1VarC3.a();
            String str5 = nik1.C0.a;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA3, r6h1Var, System.currentTimeMillis());
        }
        return ((i8h1) this.b).m(w7h1Var, (xj61) null);
    }

    public tv80 p() {
        i8h1 i8h1Var = (i8h1) ((kly0) this.b).get();
        opl0 opl0Var = (opl0) this.c;
        x6h1 x6h1VarC = opl0Var.c.c();
        x6h1VarC.i.add(new a7h1("redo_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1VarA, opl0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 q() {
        i8h1 i8h1Var = (i8h1) ((kly0) this.b).get();
        opl0 opl0Var = (opl0) this.c;
        x6h1 x6h1VarC = opl0Var.c.c();
        x6h1VarC.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("discard_changes", 1, b7xVar), y6h1VarA, opl0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        n7k0 n7k0Var = (n7k0) obj;
        return z6k0.a(n7k0Var.a.X) && ((p7k0) this.c).d.a(n7k0Var.b, n7k0Var.c).b();
    }

    public iun0 v(PlayerState playerState) {
        dzy.c.getClass();
        dzy dzyVarC = gtv0.c(playerState);
        fny fnyVar = (fny) ((Map) this.c).get(dzyVarC);
        return w(fnyVar != null ? fnyVar.a(playerState) : new hx21(dzyVarC.a, dzyVarC.b, poo1.z(playerState), null, 120));
    }

    public iun0 w(hx21 hx21Var) {
        zw21 zw21Var = hx21Var.a;
        Resources resources = (Resources) this.b;
        String str = (String) zw21Var.invoke(resources);
        String str2 = (String) hx21Var.b.invoke(resources);
        String str3 = hx21Var.c;
        zw21 zw21Var2 = hx21Var.d;
        String str4 = zw21Var2 != null ? (String) zw21Var2.invoke(resources) : null;
        boolean z = hx21Var.e;
        iun0 iun0VarW = null;
        String str5 = hx21Var.f;
        hx21 hx21Var2 = hx21Var.g;
        if (hx21Var2 != null) {
            iun0VarW = w(hx21Var2);
        }
        return new iun0(str, str2, str3, str4, z, str5, iun0VarW);
    }

    public void x(Intent intent) {
        Uri uri = ((w911) this.c).b;
        if (uri != null) {
            ((nbr) this.b).a(intent, uri);
        }
    }

    public j7k0 y(j7k0 j7k0Var) {
        d0k0 d0k0Var = j7k0Var.a;
        q6w0 q6w0Var = d0k0Var.b.a;
        azb azbVar = (azb) ((oyb) this.c).b.getValue();
        boolean z = false;
        if (!(azbVar instanceof zyb) ? !(!(azbVar instanceof syb) ? !(azbVar instanceof tyb) ? !(azbVar instanceof uyb) || (q6w0Var.N0 == null && q6w0Var.O0 == null) : q6w0Var.Y == null && q6w0Var.Z == null : q6w0Var.t == null && q6w0Var.X == null) : !(q6w0Var.h == null && q6w0Var.i == null)) {
            z = true;
        }
        return new j7k0(d0k0Var, j7k0Var.b, j7k0Var.c, !z);
    }

    public bnj0(s880 s880Var, ContextTrack contextTrack, m5o0 m5o0Var) {
        this.a = (byte) 12;
        this.b = contextTrack;
        this.c = m5o0Var;
    }

    public bnj0(fip0 fip0Var, String str) {
        this.a = (byte) 22;
        this.c = fip0Var;
        this.b = str;
    }

    public bnj0(qnv0 qnv0Var) {
        this.a = (byte) 17;
        this.b = qnv0Var;
        this.c = new vku();
    }

    public bnj0(nxo nxoVar, xjl0 xjl0Var) {
        this.a = (byte) 5;
        this.b = nxoVar;
        this.c = new opl0(xjl0Var.b(), (byte) 26);
    }

    public bnj0(FlowableMap flowableMap, FlowableMap flowableMap2) {
        this.a = (byte) 23;
        this.b = flowableMap2;
        vbm[] vbmVarArr = q601.a;
        this.c = new kge(flowableMap);
    }

    public bnj0(mdp0 mdp0Var, mdp0 mdp0Var2, vnd1 vnd1Var) {
        this.a = (byte) 1;
        this.b = mdp0Var;
        this.c = mdp0Var2;
    }

    public bnj0(dmh1 dmh1Var) {
        this.a = (byte) 14;
        j3r j3rVar = rzq.y;
        this.b = l2p1.f(dmh1Var);
        this.c = w3p1.o(new l4r(jd0.k, 1, qfo0.Y, new j4r(qfo0.N0), qfo0.Z), qfo0.O0);
    }

    public bnj0(dab1[] dab1VarArr) {
        this.a = (byte) 2;
        this.b = dab1VarArr;
        this.c = new ekb((byte) 16);
    }

    public bnj0(gbc gbcVar) {
        this.a = (byte) 26;
        this.c = gbcVar;
    }

    public /* synthetic */ bnj0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public bnj0(bg11 bg11Var, int[] iArr) {
        this.a = (byte) 8;
        this.b = b380.p(bg11Var);
        this.c = iArr;
    }

    public bnj0() {
        this.a = (byte) 6;
        this.b = new hur((byte) 4);
    }
}
