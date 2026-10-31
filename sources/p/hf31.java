package p;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.player.model.ContextTrack;
import com.spotify.scrollsita.v1.EpisodeDescription;
import com.spotify.scrollsita.v1.Heading;
import com.spotify.scrollsita.v1.a;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hf31 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hf31(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return d3p1.H(((jf31) this.b).c, ((aa3) this.c).b, (ef31) obj);
            case 1:
                kpg0 kpg0Var = new kpg0(new ng20(new w460(false, (kl9) null, (yc11) null, 61)), p761.V0);
                rs11 rs11Var = rs11.e1;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                linkedHashMap.put(o761.class, new b7t0(new cdk1(kpg0Var), rs11Var));
                kh31 kh31Var = (kh31) this.b;
                linkedHashMap.put(n761.class, new r3r(new xzq(ajq0.q(kh31Var.g, kh31Var.e.b, (d0r) this.c, n521.T0, new f4x0((byte) 29), (yzc0) null, (kpg0) null, (qlb) null, (n5) null, false, 8080), oe31.U0), rs11.d1, 4));
                return rih1.a;
            case 2:
                Throwable th = (Throwable) obj;
                ejw0 ejw0Var = (ejw0) this.b;
                if (ejw0Var != null && ejw0Var.d(2)) {
                    ((iu30) this.c).invoke(new rtj1(th));
                }
                return rih1.a;
            case 3:
                return d3p1.H((d0r) this.b, ((wm31) this.c).a, (tm31) obj);
            case 4:
                return new w9d0((y0i) this.b, (z0i) this.c, (byte) 14);
            case 5:
                jh5 jh5Var = (jh5) obj;
                Set set = (Set) this.b;
                if (set == null || !set.contains(jh5Var)) {
                    return (k3r) ((ts31) this.c).i.get(jh5Var);
                }
                return null;
            case 6:
                jh5 jh5Var2 = (jh5) obj;
                LinkedHashMap linkedHashMap2 = ((ts31) this.b).g;
                Object linkedHashSet = linkedHashMap2.get(jh5Var2);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    linkedHashMap2.put(jh5Var2, linkedHashSet);
                }
                ((Set) linkedHashSet).add((jh5) this.c);
                return rih1.a;
            case 7:
                jh5 jh5Var3 = (jh5) obj;
                if (((ts31) this.b).q.contains(jh5Var3)) {
                    ((LinkedHashSet) this.c).add(jh5Var3);
                }
                return rih1.a;
            case 8:
                jh5 jh5Var4 = (jh5) obj;
                return Boolean.valueOf(u890.j(jh5Var4.a, (wlu) this.b) && ((Boolean) ((ulu) this.c).invoke(jh5Var4.b)).booleanValue());
            case 9:
                ((Boolean) obj).getClass();
                ((iu30) this.b).invoke(((hu31) this.c).c ? st31.a : xt31.a);
                return rih1.a;
            case 10:
                ((l811) this.b).a = true;
                ((iu30) this.c).invoke((s201) obj);
                return rih1.a;
            case 11:
                return new et90((wh71) this.b, (oud) obj, (dc31) this.c);
            case 12:
                p5t0.u((p5t0) obj, (q5t0) this.b, 0, 0, new zw11((hg41) this.c, (byte) 28), 4);
                return rih1.a;
            case 13:
                oh41 oh41Var = (oh41) this.b;
                rh41 rh41Var = oh41Var.b;
                String str = (String) this.c;
                rh41Var.getClass();
                try {
                    String strName = nne.a.name();
                    strName.getClass();
                    String strConcat = "https://scannables.scdn.co/uri/800/".concat(URLEncoder.encode(str, strName));
                    mh41 mh41VarA = oh41Var.c.a();
                    th30 th30VarE0 = oh41Var.a.e0();
                    mh41VarA.X1 = strConcat;
                    mh41VarA.Y1 = str;
                    mh41VarA.g1(th30VarE0, "ScannableImageDialogFragment");
                    return rih1.a;
                } catch (UnsupportedEncodingException e) {
                    eg.f(e);
                    return null;
                }
            case 14:
                DrawScope drawScope = (DrawScope) obj;
                tw4 tw4VarA = ww4.a();
                tob1 tob1Var = (tob1) this.b;
                ven0 ven0Var = (ven0) this.c;
                tw4VarA.p(1);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
                if (Float.isNaN(0.0f) || Float.isNaN(0.0f) || Float.isNaN(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat2)) {
                    ww4.b("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = tw4VarA.b;
                if (rectF == null) {
                    rectF = new RectF();
                    tw4VarA.b = rectF;
                }
                rectF.set(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
                Path path = tw4VarA.a;
                RectF rectF2 = tw4VarA.b;
                rectF2.getClass();
                path.addRect(rectF2, ww4.c(1));
                u8s0 u8s0Var = (u8s0) tob1Var.getValue();
                if (u8s0Var != null) {
                    tw4VarA.d(u8s0Var, ((Offset) ven0Var.getValue()).a);
                }
                DrawScope.w0(drawScope, tw4VarA, u7h.b(u7h.b, 0.6f, 0.0f, 0.0f, 0.0f, 14), (DrawStyle) null, 60);
                return rih1.a;
            case 15:
                kd31 kd31Var = (kd31) obj;
                tob1 tob1Var2 = (tob1) this.c;
                kd31Var.b(((Number) tob1Var2.getValue()).floatValue() > ((Number) ((hsi1) this.b).b).floatValue() ? 1.0f : 0.0f);
                kd31Var.q(((Number) tob1Var2.getValue()).floatValue());
                kd31Var.r(((Number) tob1Var2.getValue()).floatValue());
                return rih1.a;
            case 16:
                cas casVar = (a7m0) obj;
                casVar.a = jh31.Y;
                kls0 kls0Var = (kls0) this.c;
                casVar.d = new ll41(kls0Var, (byte) 0);
                casVar.e = new ll41(kls0Var, (byte) 1);
                wl41 wl41Var = (wl41) this.b;
                FlowEventSources.Companion companion = FlowEventSources.a;
                q8n q8nVar = wl41Var.b;
                mr20[] mr20VarArr = {new hxk(k4p1.B(wl41Var.a.a), (byte) 5)};
                companion.getClass();
                casVar.b = new b(q8nVar, mr20VarArr);
                return rih1.a;
            case 17:
                return (mr20) ((vu30) this.b).invoke(obj, ((ym41) this.c).a);
            case 18:
                ((p811) this.b).a = new j8b(((l3n1) obj).b());
                ((CountDownLatch) this.c).countDown();
                return rih1.a;
            case 19:
                ((SerialDisposable) this.b).a((Disposable) ((xy50) this.c).invoke(obj));
                return rih1.a;
            case 20:
                List<mmr0> list = (List) obj;
                g931 g931Var = (g931) this.b;
                synchronized (g931Var) {
                    try {
                        for (mmr0 mmr0Var : list) {
                            jh5 jh5Var5 = (jh5) mmr0Var.a;
                            if (!(((k3r) mmr0Var.b) instanceof i3r)) {
                                ((LinkedHashSet) g931Var.c).add(jh5Var5);
                            }
                        }
                        if (dm61.v0((Set) g931Var.b, (LinkedHashSet) g931Var.c).isEmpty()) {
                            xab1 xab1Var = (xab1) g931Var.d;
                            if (xab1Var != null) {
                                xab1Var.d((CancellationException) null);
                            }
                            g931Var.d = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                ((iu30) this.c).invoke(list);
                return rih1.a;
            case 21:
                h3z h3zVarP = EpisodeDescription.p();
                h3zVarP.n(((ContextTrack) this.b).uri());
                a aVarQ = Heading.q();
                aVarQ.n((String) this.c);
                h3zVarP.q((Heading) aVarQ.build());
                ((bf51) obj).v(h3zVarP);
                return rih1.a;
            case 22:
                ((iu30) this.b).invoke(((c8e1) this.c).a.b);
                return rih1.a;
            case 23:
                return Boolean.valueOf(((y751) this.b).b((hc51) this.c, ((xb51) obj).a));
            case 24:
                tv80 tv80Var = (tv80) obj;
                dc31 dc31Var = (dc31) this.c;
                ok51 ok51Var = (ok51) this.b;
                if (ok51Var instanceof mk51) {
                    mk51 mk51Var = (mk51) ok51Var;
                    pcf.a((lzn0) dc31Var.c, pcf.d(2, mk51Var.a, mk51Var.b), tv80Var, (Bundle) null);
                } else {
                    if (!(ok51Var instanceof nk51)) {
                        eg.o();
                        return null;
                    }
                    qkr qkrVar = (qkr) dc31Var.b;
                    nk51 nk51Var = (nk51) ok51Var;
                    fn31.T(qkrVar.a, (o8n) null, 0, new zlo(qkrVar, nk51Var.a, nk51Var.b, (lnm) null, (byte) 5), 3);
                }
                return rih1.a;
            case 25:
                return Flowable.h((FlowableMap) this.b, (Flowable) this.c, y6x0.i);
            case 26:
                ((vu30) this.b).invoke(((c220) this.c).a, (hl51) obj);
                return rih1.a;
            case 27:
                cas casVar2 = (a7m0) obj;
                casVar2.a = qr51.d;
                casVar2.b = (EventSource) this.b;
                casVar2.d = new l451((qhm) this.c, (byte) 7);
                return rih1.a;
            case 28:
                ((Boolean) obj).getClass();
                ((iu30) this.b).invoke(((lt51) this.c).b ? ht51.a : it51.a);
                return rih1.a;
            default:
                String str2 = (String) obj;
                p811 p811Var = (p811) this.b;
                if (!str2.equals(p811Var.a)) {
                    p811Var.a = str2;
                    ((l811) this.c).a = false;
                }
                return rih1.a;
        }
    }
}
