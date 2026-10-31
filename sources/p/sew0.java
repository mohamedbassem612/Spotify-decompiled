package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.RiveAnimationInput;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sew0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sew0(mr20 mr20Var, List list, Map map, hdn0 hdn0Var, az20 az20Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 22;
        this.d = mr20Var;
        this.c = list;
        this.e = map;
        this.f = hdn0Var;
        this.g = az20Var;
    }

    private final Object e(Object obj) {
        m231 m231Var;
        String str = (String) this.e;
        boolean z = this.b;
        m231 m231Var2 = rih1.a;
        try {
            if (!z) {
                hm5.M(obj);
                k811 k811Var = (k811) this.d;
                lik1 lik1Var = (lik1) this.f;
                tv80 tv80Var = (tv80) this.g;
                oj3 oj3Var = (oj3) k811Var.c;
                List listSingletonList = Collections.singletonList(str);
                String str2 = lik1Var.a;
                ((agc0) k811Var.d).getClass();
                Completable completableB = oj3Var.d.b(listSingletonList, str2, "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", new gj3(27, tv80Var));
                this.c = null;
                this.b = true;
                Object objI = fc11.i(completableB, this);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Error uncurating trackUri=".concat(str), new Object[0]);
        }
        return m231Var2;
    }

    private final Object g(Object obj) {
        m231 m231Var;
        String str = (String) this.e;
        boolean z = this.b;
        m231 m231Var2 = rih1.a;
        try {
            if (!z) {
                hm5.M(obj);
                pn1 pn1Var = (pn1) this.d;
                lik1 lik1Var = (lik1) this.f;
                tv80 tv80Var = (tv80) this.g;
                oj3 oj3Var = pn1Var.b;
                Completable completableB = oj3Var.d.b(Collections.singletonList(str), lik1Var.a, "spotify:collection", new gj3(27, tv80Var));
                this.c = null;
                this.b = true;
                Object objI = fc11.i(completableB, this);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, l1d.m("Error uncurating itemUri=", str), new Object[0]);
        }
        return m231Var2;
    }

    private final Object h(Object obj) {
        e821 e821Var = (e821) this.c;
        kt91 kt91Var = (kt91) e821Var.a;
        boolean z = this.b;
        try {
            if (!z) {
                hm5.M(obj);
                q8n q8nVar = (q8n) e821Var.d;
                m311 m311Var = new m311(e821Var, (String) this.f, (String) this.g, (lnm) null, (byte) 9);
                this.b = true;
                Object objY = fn31.Y(q8nVar, m311Var, this);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            kt91Var.k(new er91((fs91) null, ((dg30) e821Var.b).getString(2131961160, (String) this.d), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            ((Function0) this.e).invoke();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961159});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131961159, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return rih1.a;
    }

    private final Object i(Object obj) {
        Uri uri;
        WebView webView;
        Uri uri2;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        try {
            if (!z) {
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.g;
                Set set = wl21.a;
                WebView webView2 = (WebView) ven0Var.getValue();
                if (webView2 == null) {
                    return rih1Var;
                }
                uri = Uri.parse(((yl21) this.e).c);
                try {
                    g341 g341Var = (g341) this.f;
                    uri.getClass();
                    Single singleC = g341Var.c(uri);
                    this.c = webView2;
                    this.d = uri;
                    this.b = true;
                    Object objJ = fc11.j(singleC, this);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                    obj = objJ;
                    webView = webView2;
                } catch (Exception unused) {
                    webView = webView2;
                    uri2 = uri;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uri = (Uri) this.d;
                webView = (WebView) this.c;
                try {
                    hm5.M(obj);
                } catch (Exception unused2) {
                    uri2 = uri;
                }
            }
            uri2 = (Uri) obj;
            webView.post(new aih0(webView, uri2, false, (byte) 19));
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        }
    }

    private final Object j(Object obj) {
        ArrayList arrayList;
        RiveAnimation riveAnimation = (RiveAnimation) this.e;
        c9n c9nVar = (c9n) this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            h290 h290VarQ = riveAnimation.q();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : h290VarQ) {
                if (((RiveAnimationInput) obj2).n().q() == 7) {
                    arrayList2.add(obj2);
                }
            }
            ni31 ni31Var = (ni31) this.f;
            RiveAnimation riveAnimation2 = (RiveAnimation) this.e;
            cxc cxcVar = (cxc) this.g;
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(fn31.q(c9nVar, (o8n) null, 0, new elu0((Object) ni31Var, it.next(), (Object) riveAnimation2, (Object) cxcVar, (lnm) null, (byte) 24), 3));
            }
            this.d = null;
            this.c = arrayList2;
            this.b = true;
            obj = o1p1.u(arrayList3, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
            arrayList = arrayList2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (ArrayList) this.c;
            hm5.M(obj);
        }
        Map mapT = sqg0.T(o7h.o0((Iterable) obj));
        if (mapT.size() < arrayList.size()) {
            int size = mapT.size();
            int size2 = arrayList.size();
            String url = riveAnimation.getUrl();
            StringBuilder sbQ = cy30.q(size, size2, "Loaded ", "/", " on_init_inputs images for rive: ");
            sbQ.append(url);
            Logger.k(sbQ.toString(), new Object[0]);
        }
        return mapT;
    }

    private final Object m(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            g931 g931Var = (g931) this.c;
            MediaCodec mediaCodec = (MediaCodec) this.d;
            MediaMuxer mediaMuxer = (MediaMuxer) this.e;
            muq0 muq0Var = (muq0) this.f;
            gpc gpcVar = new gpc((l811) this.g, (byte) 5);
            this.b = true;
            Object objM = g931Var.m(mediaCodec, mediaMuxer, muq0Var, gpcVar, this);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object o(Object obj) {
        MessagePresentationStatus messagePresentationStatus = (MessagePresentationStatus) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            l811 l811Var = (l811) this.d;
            if (!l811Var.a && (messagePresentationStatus instanceof MessagePresentationStatus.Presented)) {
                l811Var.a = true;
                q741 q741Var = (q741) this.e;
                q8n q8nVar = q741Var.i;
                o741 o741Var = new o741(q741Var, (slc0) this.f, (f841) this.g, (lnm) null, (byte) 1);
                this.c = null;
                this.b = true;
                Object objY = fn31.Y(q8nVar, o741Var, this);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object p(Object obj) {
        jei1 jei1Var = (jei1) this.c;
        boolean z = this.b;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        String str = (String) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        String str4 = (String) this.g;
        this.c = null;
        this.b = true;
        Object objA = jei1Var.a(str, str2, str3, str4, this);
        d9n d9nVar = d9n.a;
        return objA == d9nVar ? d9nVar : objA;
    }

    private final Object r(Object obj) {
        ven0 ven0Var = (ven0) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            m441 m441VarQ = rwq.q(new g8y0(ven0Var, (byte) 12));
            d9l d9lVar = new d9l((drr0) this.d, (yqg) this.e, (ven0) this.f, ven0Var, (ven0) this.g, (byte) 9);
            this.b = true;
            Object objCollect = m441VarQ.collect(d9lVar, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    private final Object s(Object obj) {
        hc51 hc51Var;
        xgn0 xgn0Var;
        zb51 zb51Var;
        String str;
        d9n d9nVar = d9n.a;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            hc51Var = (hc51) this.f;
            xgn0 xgn0Var2 = hc51Var.d;
            zb51 zb51Var2 = (zb51) this.g;
            this.c = xgn0Var2;
            this.d = hc51Var;
            this.e = zb51Var2;
            this.b = true;
            if (xgn0Var2.a(this) == d9nVar) {
                return d9nVar;
            }
            xgn0Var = xgn0Var2;
            zb51Var = zb51Var2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zb51Var = (zb51) this.e;
            hc51Var = (hc51) this.d;
            xgn0Var = (xgn0) this.c;
            hm5.M(obj);
        }
        try {
            t45 t45VarA = hc51Var.a.a(fd21.c(zb51Var.a));
            t45VarA.h = "android-feature-search";
            String strC = fd21.c(zb51Var.a);
            long j = zb51Var.c;
            t45.c(t45VarA, strC, j, zb51Var.d - j, 8);
            for (dc51 dc51Var : zb51Var.e) {
                String str2 = dc51Var.a;
                long j2 = dc51Var.b;
                t45.c(t45VarA, str2, j2, dc51Var.c - j2, 24);
            }
            t45VarA.a("outcome", jup0.h(zb51Var.f));
            int i = zb51Var.b;
            if (i == 1) {
                str = "legacy";
            } else {
                if (i != 2) {
                    throw null;
                }
                str = "compose_lcr";
            }
            t45VarA.a("page_variant", str);
            bc51 bc51Var = zb51Var.g;
            if (bc51Var != null) {
                t45VarA.a("metadata_outcome", bc51Var.a > 0 ? "row_failure" : bc51Var.b > 0 ? "field_failure" : "success");
                t45VarA.b("metadata_failed_rows", String.valueOf(bc51Var.a));
                t45VarA.b("metadata_failed_fields", String.valueOf(bc51Var.b));
            }
            hc51Var.a.b(t45VarA.e());
            xgn0Var.c((Object) null);
            return rih1.a;
        } catch (Throwable th) {
            xgn0Var.c((Object) null);
            throw th;
        }
    }

    private final Object t(Object obj) {
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            mr20 mr20Var = (mr20) this.d;
            ywm0 ywm0Var = new ywm0((List) this.c, (Map) this.e, (hdn0) this.f, (az20) this.g, (byte) 11);
            this.b = true;
            Object objCollect = mr20Var.collect(ywm0Var, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    private final Object u(Object obj) {
        rs61 rs61Var = (rs61) this.e;
        Intent intent = (Intent) this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            ((iu30) this.c).invoke(intent);
            ett ettVarF = rs61Var.f();
            if (ettVarF != null) {
                this.b = true;
                obj = ettVarF.invoke(intent, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            }
            th61 th61Var = (th61) this.g;
            p6r0 p6r0VarE = rs61Var.e();
            gu61 gu61Var = new gu61(th61Var.a);
            String strL = pro1.l(intent);
            String stringExtra = intent.getStringExtra("EXTRA_SOURCE");
            return new hrn0(qr61.class, new os61(p6r0VarE, gu61Var, strL, (stringExtra == null && stringExtra.hashCode() == -1853007448 && stringExtra.equals("SEARCH")) ? 1 : 0, (l1d) null), a6w0.a);
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        irn0 irn0Var = (irn0) obj;
        if (irn0Var != null) {
            return irn0Var;
        }
        th61 th61Var2 = (th61) this.g;
        p6r0 p6r0VarE2 = rs61Var.e();
        gu61 gu61Var2 = new gu61(th61Var2.a);
        String strL2 = pro1.l(intent);
        String stringExtra2 = intent.getStringExtra("EXTRA_SOURCE");
        return new hrn0(qr61.class, new os61(p6r0VarE2, gu61Var2, strL2, (stringExtra2 == null && stringExtra2.hashCode() == -1853007448 && stringExtra2.equals("SEARCH")) ? 1 : 0, (l1d) null), a6w0.a);
    }

    private final Object v(Object obj) {
        Throwable th;
        ven0 ven0Var;
        k8g1 m231Var;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            ven0 ven0Var2 = (ven0) this.g;
            wy61 wy61Var = (wy61) this.e;
            oy61 oy61Var = (oy61) this.f;
            try {
                q8n q8nVar = wy61Var.d;
                lm61 lm61Var = new lm61(wy61Var, oy61Var, (lnm) null, (byte) 3);
                this.d = null;
                this.c = ven0Var2;
                this.b = true;
                Object objY = fn31.Y(q8nVar, lm61Var, this);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
                obj = objY;
                ven0Var = ven0Var2;
            } catch (Throwable th2) {
                th = th2;
                ven0Var = ven0Var2;
                m231Var = new m231(th);
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ven0Var = (ven0) this.c;
            try {
                hm5.M(obj);
            } catch (Throwable th3) {
                th = th3;
                m231Var = new m231(th);
            }
        }
        m231Var = (k8g1) obj;
        k8g1 k8g1Var = m231Var instanceof m231 ? null : m231Var;
        ven0Var.setValue(Boolean.valueOf(k8g1Var != null && k8g1Var.t));
        return rih1.a;
    }

    private final Object w(Object obj) {
        iu30 iu30Var;
        aud audVar = (iud) this.c;
        boolean z = this.b;
        if (z) {
            if (z) {
                hm5.M(obj);
                return null;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        if (audVar instanceof aud) {
            return ((iu30) this.d).invoke(audVar.a);
        }
        if (audVar instanceof ztd) {
            wh71 wh71Var = (wh71) this.e;
            ztd ztdVar = (ztd) audVar;
            dlw0 dlw0Var = new dlw0(ztdVar.b, ztdVar.c);
            this.c = null;
            this.b = true;
            Object objA = wh71Var.a(dlw0Var, this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else if (audVar instanceof dud) {
            bd90 bd90Var = ((dud) audVar).a;
            if (bd90Var instanceof a9d1) {
                vu30 vu30Var = (vu30) this.f;
                if (vu30Var != null) {
                    a9d1 a9d1Var = (a9d1) bd90Var;
                    return vu30Var.invoke(new Integer(a9d1Var.a), a9d1Var.b);
                }
            } else if ((bd90Var instanceof bd90) && (iu30Var = (iu30) this.g) != null) {
                return iu30Var.invoke(Boolean.valueOf(bd90Var.a));
            }
        }
        return null;
    }

    private final Object x(Object obj) {
        Throwable th;
        ven0 ven0Var;
        k8g1 m231Var;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            ven0 ven0Var2 = (ven0) this.g;
            wy61 wy61Var = (wy61) this.e;
            a371 a371Var = (a371) this.f;
            try {
                q8n q8nVar = wy61Var.d;
                lm61 lm61Var = new lm61(wy61Var, a371Var, (lnm) null, (byte) 6);
                this.d = null;
                this.c = ven0Var2;
                this.b = true;
                Object objY = fn31.Y(q8nVar, lm61Var, this);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
                obj = objY;
                ven0Var = ven0Var2;
            } catch (Throwable th2) {
                th = th2;
                ven0Var = ven0Var2;
                m231Var = new m231(th);
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ven0Var = (ven0) this.c;
            try {
                hm5.M(obj);
            } catch (Throwable th3) {
                th = th3;
                m231Var = new m231(th);
            }
        }
        m231Var = (k8g1) obj;
        k8g1 k8g1Var = m231Var instanceof m231 ? null : m231Var;
        ven0Var.setValue(Boolean.valueOf(k8g1Var != null && k8g1Var.t));
        return rih1.a;
    }

    private final Object y(Object obj) {
        il71 il71Var = (il71) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            yn0 yn0Var = new yn0((aj71) this.d, (ri71) this.e, (fl71) this.f, (ti71) this.g, (lnm) null, (byte) 10);
            this.c = il71Var;
            this.b = true;
            obj = il71Var.a("fetching_on_platform_destinations", yn0Var, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        ui71 ui71Var = (wi71) obj;
        if (!(ui71Var instanceof ui71)) {
            il71Var.setAttribute("result", "failure");
            return ui71Var;
        }
        il71Var.setAttribute("result", "success");
        il71Var.setAttribute("destinations_count", String.valueOf(ui71Var.a.size()));
        return ui71Var;
    }

    private final Object z(Object obj) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.e;
        ssw0 ssw0Var = (ssw0) this.c;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            bma1 bma1Var = (bma1) this.d;
            qu71 qu71Var = new qu71(ssw0Var, bma1Var.a, (vu30) this.f, (ima1) this.g, bma1Var);
            sharedPreferences.registerOnSharedPreferenceChangeListener(qu71Var);
            fh61 fh61Var = new fh61(sharedPreferences, qu71Var, (byte) 18);
            this.c = null;
            this.b = true;
            Object objS = jch0.s(ssw0Var, fh61Var, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                return new sew0((byte) 0, (gfw0) this.c, (mr20) this.d, (mr20) this.e, (w7u0) obj3, (sbw0) obj2, lnmVar);
            case 1:
                return new sew0((List) this.e, (qix0) obj3, (iu30) obj2, lnmVar, (byte) 1);
            case 2:
                sew0 sew0Var = new sew0((mlw0) this.e, (List) obj3, (z310) obj2, lnmVar, (byte) 2);
                sew0Var.d = obj;
                return sew0Var;
            case 3:
                return new sew0((byte) 3, (ocy0) this.c, (List) this.d, (cm0) this.e, (iu30) obj3, (ven0) obj2, lnmVar);
            case 4:
                return new sew0((byte) 4, (qcy0) this.c, (String) this.d, (cm0) this.e, (iu30) obj3, (ven0) obj2, lnmVar);
            case 5:
                sew0 sew0Var2 = new sew0(this.d, lnmVar, this.e, obj3, obj2, (byte) 5);
                sew0Var2.c = obj;
                return sew0Var2;
            case 6:
                sew0 sew0Var3 = new sew0(this.d, lnmVar, this.e, obj3, obj2, (byte) 6);
                sew0Var3.c = obj;
                return sew0Var3;
            case 7:
                sew0 sew0Var4 = new sew0((guz0) obj3, (String) obj2, lnmVar, (byte) 7);
                sew0Var4.e = obj;
                return sew0Var4;
            case 8:
                sew0 sew0Var5 = new sew0((p311) this.e, (o311) obj3, (rjm0) obj2, lnmVar, (byte) 8);
                sew0Var5.d = obj;
                return sew0Var5;
            case 9:
                return new sew0((byte) 9, (m021) this.c, (String) this.d, (String) this.e, (String) obj3, (r6h1) obj2, lnmVar);
            case 10:
                return new sew0(this.d, this.e, obj3, obj2, lnmVar, (byte) 10);
            case 11:
                sew0 sew0Var6 = new sew0(this.d, this.e, obj3, obj2, lnmVar, (byte) 11);
                sew0Var6.c = obj;
                return sew0Var6;
            case 12:
                sew0 sew0Var7 = new sew0(this.d, this.e, obj3, obj2, lnmVar, (byte) 12);
                sew0Var7.c = obj;
                return sew0Var7;
            case 13:
                sew0 sew0Var8 = new sew0(this.d, this.e, obj3, obj2, lnmVar, (byte) 13);
                sew0Var8.c = obj;
                return sew0Var8;
            case 14:
                return new sew0((byte) 14, (e821) this.c, (String) this.d, (Function0) this.e, (String) obj3, (String) obj2, lnmVar);
            case 15:
                return new sew0((yl21) this.e, (g341) obj3, (ven0) obj2, lnmVar, (byte) 15);
            case 16:
                sew0 sew0Var9 = new sew0((RiveAnimation) this.e, (ni31) obj3, (cxc) obj2, lnmVar, (byte) 16);
                sew0Var9.d = obj;
                return sew0Var9;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new sew0((byte) 17, (g931) this.c, (MediaCodec) this.d, (MediaMuxer) this.e, (muq0) obj3, (l811) obj2, lnmVar);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                sew0 sew0Var10 = new sew0(this.d, this.e, obj3, obj2, lnmVar, (byte) 18);
                sew0Var10.c = obj;
                return sew0Var10;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                sew0 sew0Var11 = new sew0(this.d, this.e, obj3, obj2, lnmVar, (byte) 19);
                sew0Var11.c = obj;
                return sew0Var11;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new sew0((byte) 20, (ven0) this.c, (drr0) this.d, (yqg) this.e, (ven0) obj3, (ven0) obj2, lnmVar);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new sew0((hc51) obj3, (zb51) obj2, lnmVar, (byte) 21);
            case 22:
                return new sew0((mr20) this.d, (List) this.c, (Map) this.e, (hdn0) obj3, (az20) obj2, lnmVar);
            case 23:
                return new sew0((byte) 23, (iu30) this.c, (Intent) this.d, (rs61) this.e, (b72) obj3, (th61) obj2, lnmVar);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                sew0 sew0Var12 = new sew0((wy61) this.e, (oy61) obj3, (ven0) obj2, lnmVar, (byte) 24);
                sew0Var12.d = obj;
                return sew0Var12;
            case 25:
                sew0 sew0Var13 = new sew0(this.d, this.e, obj3, obj2, lnmVar, (byte) 25);
                sew0Var13.c = obj;
                return sew0Var13;
            case 26:
                sew0 sew0Var14 = new sew0((wy61) this.e, (a371) obj3, (ven0) obj2, lnmVar, (byte) 26);
                sew0Var14.d = obj;
                return sew0Var14;
            case 27:
                sew0 sew0Var15 = new sew0(this.d, this.e, obj3, obj2, lnmVar, (byte) 27);
                sew0Var15.c = obj;
                return sew0Var15;
            case 28:
                sew0 sew0Var16 = new sew0(this.d, this.e, obj3, obj2, lnmVar, (byte) 28);
                sew0Var16.c = obj;
                return sew0Var16;
            default:
                return new sew0((byte) 29, (pt) this.c, (ven0) this.d, (ven0) this.e, (ven0) obj3, (ven0) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((MessagePresentationStatus) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((jei1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((iud) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((il71) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03e3 A[Catch: all -> 0x0343, TryCatch #1 {all -> 0x0343, blocks: (B:132:0x033e, B:161:0x03cd, B:162:0x03d3, B:164:0x03d8, B:165:0x03d9, B:167:0x03e3, B:169:0x03f1, B:171:0x03f7, B:174:0x03fd, B:175:0x0400, B:176:0x0403, B:177:0x0406, B:201:0x0464, B:202:0x0465, B:163:0x03d4), top: B:437:0x0330, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x03f1 A[Catch: all -> 0x0343, TryCatch #1 {all -> 0x0343, blocks: (B:132:0x033e, B:161:0x03cd, B:162:0x03d3, B:164:0x03d8, B:165:0x03d9, B:167:0x03e3, B:169:0x03f1, B:171:0x03f7, B:174:0x03fd, B:175:0x0400, B:176:0x0403, B:177:0x0406, B:201:0x0464, B:202:0x0465, B:163:0x03d4), top: B:437:0x0330, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x03f7 A[Catch: all -> 0x0343, TryCatch #1 {all -> 0x0343, blocks: (B:132:0x033e, B:161:0x03cd, B:162:0x03d3, B:164:0x03d8, B:165:0x03d9, B:167:0x03e3, B:169:0x03f1, B:171:0x03f7, B:174:0x03fd, B:175:0x0400, B:176:0x0403, B:177:0x0406, B:201:0x0464, B:202:0x0465, B:163:0x03d4), top: B:437:0x0330, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:174:0x03fd A[Catch: all -> 0x0343, TryCatch #1 {all -> 0x0343, blocks: (B:132:0x033e, B:161:0x03cd, B:162:0x03d3, B:164:0x03d8, B:165:0x03d9, B:167:0x03e3, B:169:0x03f1, B:171:0x03f7, B:174:0x03fd, B:175:0x0400, B:176:0x0403, B:177:0x0406, B:201:0x0464, B:202:0x0465, B:163:0x03d4), top: B:437:0x0330, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0420  */
    /* JADX WARN: Code duplicated, block: B:435:0x03d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:476:0x0400 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:167:0x03e3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v46, types: [p.iv91] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, p.iv91] */
    /* JADX WARN: Type inference failed for: r2v66, types: [p.iv91] */
    /* JADX WARN: Type inference failed for: r2v85 */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.Object, p.faa0] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        LinkedHashMap linkedHashMap;
        Object objL;
        rzq rzqVar;
        String str;
        s2t s2tVarQ;
        s2t s2tVar;
        Object objD;
        bpb1 bpb1Var;
        mqs0 mqs0Var;
        mqs0 mqs0VarD;
        bpb1 bpb1Var2;
        mqs0 mqs0Var2;
        mqs0 mqs0VarC;
        p311 p311Var;
        List listI;
        int size;
        int i;
        m311 m311Var;
        int i2;
        h311 h311Var;
        ?? r3;
        ?? r2;
        bpb1 bpb1Var3;
        mqs0 mqs0Var3;
        mqs0 mqs0VarD2;
        ijz0 ijz0Var;
        ijz0 j2v0Var;
        py21 m231Var;
        Object objM;
        ?? Z = 25;
        switch (this.a) {
            case 0:
                gfw0 gfw0Var = (gfw0) this.c;
                rih1 rih1Var = rih1.a;
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    l811 l811VarY = l1d.y(obj);
                    l811VarY.a = gfw0Var.E;
                    mr20 mr20VarU = rqt0.u(h5p1.s((mr20) this.d, gfw0Var.p, (mr20) this.e, new rew0((w7u0) this.f, gfw0Var, null)));
                    c3u0 c3u0Var = new c3u0(l811VarY, (lnm) null, (byte) 14);
                    mjm0 mjm0Var = new mjm0(l811VarY, (lnm) null, (byte) 1);
                    mew0 mew0Var = new mew0(gfw0Var, (sbw0) this.g, (byte) 2);
                    this.b = true;
                    Object objCollect = mr20VarU.collect(new eu20(new wem((byte) 19, new l811(), mjm0Var, mew0Var), c3u0Var, (byte) 1), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                List list = (List) this.e;
                qix0 qix0Var = (qix0) this.f;
                gnq0 gnq0Var = qix0Var.a;
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Object obj3 = new Object();
                    List<String> list2 = list;
                    iu30 iu30Var = (iu30) this.g;
                    int iS = zno1.s(q7h.U(list2, 10));
                    if (iS < 16) {
                        iS = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                    for (String str2 : list2) {
                        jh5 jh5Var = new jh5(hjx0.a, str2);
                        Object objC = gnq0Var.c(jh5Var);
                        iix0 iix0Var = objC instanceof iix0 ? (iix0) objC : null;
                        if (iix0Var == null) {
                            iix0Var = (iix0) iu30Var.invoke(str2);
                        }
                        linkedHashMap2.put(jh5Var, iix0Var);
                    }
                    try {
                        for (Map.Entry entry : linkedHashMap2.entrySet()) {
                            jh5 jh5Var2 = (jh5) entry.getKey();
                            iix0 iix0Var2 = (iix0) entry.getValue();
                            gnq0Var.b.put(jh5Var2, obj3);
                            gnq0Var.a.put(jh5Var2, new enq0(new hix0(true, iix0Var2 != null ? iix0Var2.f() : 0L), obj3));
                            gnq0Var.b(jh5Var2);
                        }
                        jn7 jn7Var = qix0Var.b;
                        this.c = obj3;
                        this.d = linkedHashMap2;
                        this.b = true;
                        t831 t831VarO = ResumptionProgressEsperanto.MarkAsFinishedRequest.o();
                        t831VarO.n(list);
                        objL = jn7Var.L(t831VarO.build(), this);
                        if (objL == d9nVar2) {
                            return d9nVar2;
                        }
                        obj2 = obj3;
                        linkedHashMap = linkedHashMap2;
                    } catch (Throwable th) {
                        th = th;
                        obj2 = obj3;
                        linkedHashMap = linkedHashMap2;
                        qix0Var.a(obj2, linkedHashMap);
                        throw th;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = (LinkedHashMap) this.d;
                    obj2 = this.c;
                    try {
                        hm5.M(obj);
                        objL = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            qix0Var.a(obj2, linkedHashMap);
                            throw th;
                        } catch (Throwable th3) {
                            Iterator it = linkedHashMap.keySet().iterator();
                            while (it.hasNext()) {
                                gnq0Var.a((jh5) it.next(), obj2);
                            }
                            throw th3;
                        }
                    }
                }
                ResumptionProgressEsperanto.MarkAsFinishedResponse markAsFinishedResponse = (ResumptionProgressEsperanto.MarkAsFinishedResponse) objL;
                if (lcc.D(markAsFinishedResponse.o(), markAsFinishedResponse.n())) {
                    Iterator it2 = linkedHashMap.keySet().iterator();
                    while (it2.hasNext()) {
                        gnq0Var.a((jh5) it2.next(), obj2);
                    }
                    return rih1.a;
                }
                throw new IOException("MarkAsFinished did not take: " + lcc.B(markAsFinishedResponse));
            case 2:
                rih1 rih1Var2 = rih1.a;
                vr20 vr20Var = (vr20) this.d;
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                if (z3) {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rzqVar = (rzq) this.c;
                    try {
                        hm5.M(obj);
                        rzqVar.l();
                        return rih1Var2;
                    } catch (Throwable th4) {
                        th = th4;
                        rzqVar.l();
                        throw th;
                    }
                }
                hm5.M(obj);
                six0 six0Var = (six0) ((mlw0) this.e).b;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                rix0 rix0VarB = six0.b(six0Var, yon1.O1(), 4);
                j3r j3rVar = rzq.y;
                rzq rzqVarF = l2p1.f(rix0VarB);
                try {
                    z4t0 z4t0VarA = jlx0.a(rzqVarF, (List) this.f);
                    z310 z310Var = (z310) this.g;
                    this.d = null;
                    this.c = rzqVarF;
                    this.b = true;
                    u4p1.S(vr20Var);
                    Object objCollect2 = z4t0VarA.collect(new s4q0(vr20Var, z310Var, (byte) 25), this);
                    if (objCollect2 != d9nVar3) {
                        objCollect2 = rih1Var2;
                    }
                    if (objCollect2 != d9nVar3) {
                        objCollect2 = rih1Var2;
                    }
                    if (objCollect2 == d9nVar3) {
                        return d9nVar3;
                    }
                    rzqVar = rzqVarF;
                    rzqVar.l();
                    return rih1Var2;
                } catch (Throwable th5) {
                    th = th5;
                    rzqVar = rzqVarF;
                    rzqVar.l();
                    throw th;
                }
            case 3:
                rih1 rih1Var3 = rih1.a;
                d9n d9nVar4 = d9n.a;
                boolean z4 = this.b;
                try {
                    if (!z4) {
                        hm5.M(obj);
                        ocy0 ocy0Var = (ocy0) this.c;
                        if (ocy0Var != null) {
                            List list3 = (List) this.d;
                            List list4 = list3;
                            if (list4 != null && !list4.isEmpty()) {
                                cm0 cm0Var = (cm0) this.e;
                                iu30 iu30Var2 = (iu30) this.f;
                                ven0 ven0Var = (ven0) this.g;
                                ezc ezcVarG = yoi1.g(((uu00) cm0Var.i).b(new oi("prompted-world-section-artwork", false, new nec0(list3, (byte) 13))));
                                ywm0 ywm0Var = new ywm0(list3, ocy0Var, iu30Var2, ven0Var);
                                this.b = true;
                                if (ezcVarG.collect(ywm0Var, this) == d9nVar4) {
                                    return d9nVar4;
                                }
                            }
                        }
                        return rih1Var3;
                    }
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                }
                return rih1Var3;
            case 4:
                rih1 rih1Var4 = rih1.a;
                d9n d9nVar5 = d9n.a;
                boolean z5 = this.b;
                try {
                    if (!z5) {
                        hm5.M(obj);
                        qcy0 qcy0Var = (qcy0) this.c;
                        if (qcy0Var != null && (str = (String) this.d) != null && qcy0Var.g == null && qcy0Var.h == null) {
                            Set set = s4b1.f;
                            boolean z6 = uic.h(str, new blc0[]{blc0.u1, blc0.A1, blc0.M1}) || uic.g(str, blc0.m2);
                            cm0 cm0Var2 = (cm0) this.e;
                            iu30 iu30Var3 = (iu30) this.f;
                            ven0 ven0Var2 = (ven0) this.g;
                            ezc ezcVarG2 = yoi1.g(((uu00) cm0Var2.i).b(new oi("prompted-world-section", false, new zqu0(str, (byte) 27))));
                            bl1 bl1Var = new bl1(str, z6, qcy0Var, iu30Var3, ven0Var2);
                            this.b = true;
                            if (ezcVarG2.collect(bl1Var, this) == d9nVar5) {
                                return d9nVar5;
                            }
                        }
                        return rih1Var4;
                    }
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused2) {
                }
                return rih1Var4;
            case 5:
                d9n d9nVar6 = d9n.a;
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    if (!((is20) this.d).f) {
                        xu30 xu30Var = ((poy0) this.e).d.b;
                        Object obj4 = ((is20) this.f).d;
                        Object state = ((h141) this.g).getState();
                        this.c = null;
                        this.b = true;
                        if (xu30Var.invoke(obj4, state, this) == d9nVar6) {
                            return d9nVar6;
                        }
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 6:
                c9n c9nVar = (c9n) this.c;
                d9n d9nVar7 = d9n.a;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Iterable iterable = (Iterable) this.d;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                int i3 = 0;
                for (Object obj5 : iterable) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList.add(fn31.q(c9nVar, (o8n) null, 0, new tv1(i3, obj5, (lnm) null, (gw70) this.e, (bju) this.f, (SceneTemplate.Quiz) this.g), 3));
                    i3 = i4;
                }
                this.c = null;
                this.b = true;
                Object objU = o1p1.u(arrayList, this);
                return objU == d9nVar7 ? d9nVar7 : objU;
            case 7:
                guz0 guz0Var = (guz0) this.f;
                c9n c9nVar2 = (c9n) this.e;
                d9n d9nVar8 = d9n.a;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    s2t s2tVarQ2 = fn31.q(c9nVar2, (o8n) null, 0, new fuz0(guz0Var, (String) this.g, null, (byte) 2), 3);
                    s2tVarQ = fn31.q(c9nVar2, (o8n) null, 0, new c3u0(guz0Var, (lnm) null, (byte) 28), 3);
                    try {
                        ou51 ou51Var = new ou51(getContext());
                        ou51Var.g(s2tVarQ2.d0(), new zio0(2, (lnm) null, (byte) 25));
                        ou51Var.g(s2tVarQ.d0(), new zio0(2, (lnm) null, (byte) 26));
                        this.e = null;
                        this.c = s2tVarQ2;
                        this.d = s2tVarQ;
                        this.b = true;
                        objD = ou51.d(ou51Var, this);
                        if (objD == d9nVar8) {
                            return d9nVar8;
                        }
                        s2tVar = s2tVarQ2;
                    } catch (Throwable th6) {
                        th = th6;
                        s2tVar = s2tVarQ2;
                        s2tVar.d((CancellationException) null);
                        s2tVarQ.d((CancellationException) null);
                        throw th;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s2tVarQ = (s2t) this.d;
                    s2tVar = (s2t) this.c;
                    try {
                        hm5.M(obj);
                        objD = obj;
                    } catch (Throwable th7) {
                        th = th7;
                        s2tVar.d((CancellationException) null);
                        s2tVarQ.d((CancellationException) null);
                        throw th;
                    }
                }
                wtz0 wtz0Var = (wtz0) objD;
                s2tVar.d((CancellationException) null);
                s2tVarQ.d((CancellationException) null);
                return wtz0Var;
            case 8:
                d9n d9nVar9 = d9n.a;
                ?? iv91Var = this.b;
                try {
                    if (iv91Var == 0) {
                        hm5.M(obj);
                        Z = op71.z(((c9n) this.d).J());
                        p311 p311Var2 = (p311) this.e;
                        bpb1 bpb1Var4 = p311.A;
                        synchronized (p311Var2.d) {
                            Throwable th8 = p311Var2.f;
                            if (th8 != null) {
                                throw th8;
                            }
                            if (((l311) p311Var2.v.getValue()).compareTo(l311.b) <= 0) {
                                throw new IllegalStateException("Recomposer shut down");
                            }
                            if (p311Var2.e != null) {
                                throw new IllegalStateException("Recomposer already running");
                            }
                            p311Var2.e = Z;
                            if (p311Var2.D() != null) {
                                g0k.a("called outside of runRecomposeAndApplyChanges");
                            }
                        }
                        w9 w9Var = new w9((p311) this.e, (byte) 18);
                        pv91.b(pv91.a);
                        synchronized (pv91.c) {
                            pv91.h = o7h.O0(w9Var, pv91.h);
                        }
                        iv91Var = new iv91(w9Var, (byte) 0);
                        hwb hwbVar = ((p311) this.e).z;
                        do {
                            bpb1Var2 = p311.A;
                            mqs0Var2 = (mqs0) bpb1Var2.getValue();
                            mqs0VarC = mqs0Var2.c(hwbVar);
                            if (mqs0Var2 != mqs0VarC) {
                            }
                            p311Var = (p311) this.e;
                            synchronized (p311Var.d) {
                                listI = p311Var.I();
                            }
                            size = listI.size();
                            for (i = 0; i < size; i++) {
                                for (Object obj6 : ((h4k) listI.get(i)).f.c) {
                                    if (obj6 instanceof h311) {
                                        h311Var = (h311) obj6;
                                    } else {
                                        h311Var = null;
                                    }
                                    if (h311Var != null) {
                                        h311Var.b();
                                    }
                                }
                            }
                            m311Var = new m311((o311) this.f, (rjm0) this.g, (lnm) null, (byte) 0);
                            this.d = Z;
                            this.c = iv91Var;
                            this.b = true;
                            r2 = iv91Var;
                            r3 = Z;
                            if (smo1.s(m311Var, this) == d9nVar9) {
                                return d9nVar9;
                            }
                        } while (!bpb1Var2.k(mqs0Var2, mqs0VarC));
                        p311Var = (p311) this.e;
                        synchronized (p311Var.d) {
                            listI = p311Var.I();
                            size = listI.size();
                            while (i < size) {
                                while (i2 < r8) {
                                    if (obj6 instanceof h311) {
                                        h311Var = (h311) obj6;
                                    } else {
                                        h311Var = null;
                                    }
                                    if (h311Var != null) {
                                        h311Var.b();
                                    }
                                }
                            }
                            m311Var = new m311((o311) this.f, (rjm0) this.g, (lnm) null, (byte) 0);
                            this.d = Z;
                            this.c = iv91Var;
                            this.b = true;
                            r2 = iv91Var;
                            r3 = Z;
                            if (smo1.s(m311Var, this) == d9nVar9) {
                                return d9nVar9;
                            }
                        }
                    } else {
                        if (iv91Var != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iv91 iv91Var2 = (iv91) this.c;
                        faa0 faa0Var = (faa0) this.d;
                        hm5.M(obj);
                        r2 = iv91Var2;
                        r3 = faa0Var;
                    }
                    r2.a();
                    p311 p311Var3 = (p311) this.e;
                    synchronized (p311Var3.d) {
                        try {
                            if (p311Var3.e == r3) {
                                p311Var3.e = null;
                            }
                            if (p311Var3.D() != null) {
                                g0k.a("called outside of runRecomposeAndApplyChanges");
                            }
                        } catch (Throwable th9) {
                            throw th9;
                        }
                        break;
                    }
                    bpb1 bpb1Var5 = p311.A;
                    hwb hwbVar2 = ((p311) this.e).z;
                    do {
                        bpb1Var3 = p311.A;
                        mqs0Var3 = (mqs0) bpb1Var3.getValue();
                        mqs0VarD2 = mqs0Var3.d(hwbVar2);
                        if (mqs0Var3 != mqs0VarD2) {
                        }
                        return rih1.a;
                    } while (!bpb1Var3.k(mqs0Var3, mqs0VarD2));
                    return rih1.a;
                } catch (Throwable th10) {
                    iv91Var.a();
                    p311 p311Var4 = (p311) this.e;
                    synchronized (p311Var4.d) {
                        try {
                            if (p311Var4.e == Z) {
                                p311Var4.e = null;
                            }
                            if (p311Var4.D() != null) {
                                g0k.a("called outside of runRecomposeAndApplyChanges");
                                break;
                            }
                            bpb1 bpb1Var6 = p311.A;
                            hwb hwbVar3 = ((p311) this.e).z;
                            do {
                                bpb1Var = p311.A;
                                mqs0Var = (mqs0) bpb1Var.getValue();
                                mqs0VarD = mqs0Var.d(hwbVar3);
                                if (mqs0Var != mqs0VarD) {
                                }
                                throw th10;
                            } while (!bpb1Var.k(mqs0Var, mqs0VarD));
                            throw th10;
                        } catch (Throwable th11) {
                            throw th11;
                        }
                    }
                }
            case 9:
                d9n d9nVar10 = d9n.a;
                boolean z10 = this.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m021 m021Var = (m021) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.f;
                r6h1 r6h1Var = (r6h1) this.g;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                xae xaeVar = (xae) m021Var.b;
                i521 i521Var = new i521(m021Var, str3, r6h1Var, ohdVar, (byte) 0);
                z50 z50Var = z50.c;
                p521 p521Var = p521.b;
                efr efrVar = xaeVar.b;
                Activity activity = xaeVar.a;
                String string = activity.getString(2131961129);
                if (str4 == null) {
                    str4 = "";
                }
                String string2 = activity.getString(2131961127, str4);
                String string3 = activity.getString(2131961128);
                String string4 = activity.getString(2131961130);
                if (((zb4) xaeVar.c.b).a()) {
                    if (efrVar.c()) {
                        j2v0Var = new i2v0(xaeVar, oqo1.t((Activity) efrVar.b, new fhx(string, string2, new ygx(string3, new gbx(z50Var, new n421(i521Var, (byte) 0))), new ygx(string4, new gbx(z50Var, new n421(i521Var, (byte) 1))), new n421(i521Var, (byte) 2), (v3v0) null, 80)), (byte) 5);
                        ijz0Var = j2v0Var;
                    } else {
                        i521Var.invoke(p521Var);
                        ijz0Var = ijz0.d1;
                    }
                } else if (activity.isFinishing() || activity.isDestroyed()) {
                    i521Var.invoke(p521Var);
                    ijz0Var = ijz0.e1;
                } else {
                    mw40 mw40VarT = yoi1.T(activity, string, string2);
                    mw40VarT.e = true;
                    mw40VarT.f = new vae(i521Var, (byte) 9);
                    o421 o421Var = new o421(i521Var, (byte) 0);
                    mw40VarT.a = string3;
                    mw40VarT.c = o421Var;
                    o421 o421Var2 = new o421(i521Var, (byte) 1);
                    mw40VarT.b = string4;
                    mw40VarT.d = o421Var2;
                    pw40 pw40VarB = mw40VarT.b();
                    pw40VarB.b();
                    j2v0Var = new j2v0(xaeVar, pw40VarB, (byte) 5);
                    ijz0Var = j2v0Var;
                }
                ohdVar.n(new hii0(ijz0Var, (byte) 17));
                wqk0 wqk0Var = r6h1Var != null ? new wqk0(r6h1Var, (byte) 21) : null;
                if (wqk0Var != null) {
                    wqk0Var.e();
                }
                Object objR = ohdVar.r();
                return objR == d9nVar10 ? d9nVar10 : objR;
            case 10:
                d9n d9nVar11 = d9n.a;
                boolean z11 = this.b;
                if (z11) {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return obj;
                }
                hm5.M(obj);
                List list5 = (List) this.d;
                l2v0 l2v0Var = (l2v0) this.e;
                r6h1 r6h1Var2 = (r6h1) this.f;
                String str5 = (String) this.g;
                this.c = list5;
                this.b = true;
                ohd ohdVar2 = new ohd(1, aym.t(this));
                ohdVar2.t();
                String strY0 = o7h.y0(list5, ", ", (String) null, (String) null, i021.i, 30);
                int i5 = list5.size() > 1 ? 2131961126 : 2131961129;
                int i6 = list5.size() > 1 ? 2131961124 : 2131961127;
                int i7 = list5.size() > 1 ? 2131961125 : 2131961128;
                Context context = l2v0Var.b;
                ohdVar2.n(new k521(l2v0Var, r6h1Var2, l2v0Var.f(context.getString(i5), context.getString(i6, strY0), context.getString(i7), context.getString(2131961130), new l521(l2v0Var, str5, r6h1Var2, ohdVar2, (byte) 0), new m521(l2v0Var, r6h1Var2, ohdVar2, (byte) 0), new sdg(ohdVar2, (byte) 4)), (byte) 0));
                wqk0 wqk0Var2 = r6h1Var2 != null ? new wqk0(r6h1Var2, (byte) 21) : null;
                if (wqk0Var2 != null) {
                    wqk0Var2.e();
                }
                Object objR2 = ohdVar2.r();
                return objR2 == d9nVar11 ? d9nVar11 : objR2;
            case 11:
                return e(obj);
            case 12:
                d9n d9nVar12 = d9n.a;
                boolean z12 = this.b;
                try {
                    if (!z12) {
                        hm5.M(obj);
                        e821 e821Var = (e821) this.d;
                        String str6 = (String) this.e;
                        String str7 = (String) this.f;
                        tv80 tv80Var = (tv80) this.g;
                        xyc0 xyc0Var = (iyc0) e821Var.c;
                        List listSingletonList = Collections.singletonList(str7);
                        this.c = null;
                        this.b = true;
                        objM = xyc0Var.m(str6, listSingletonList, this, tv80Var);
                        if (objM == d9nVar12) {
                            return d9nVar12;
                        }
                    } else {
                        if (!z12) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objM = obj;
                    }
                    m231Var = (py21) objM;
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th12) {
                    m231Var = new m231(th12);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    n57.g("Error when removing item from playlist.", thA);
                    Logger.e(thA, "Error when removing item from playlist.", new Object[0]);
                }
                return rih1.a;
            case 13:
                return g(obj);
            case 14:
                return h(obj);
            case 15:
                return i(obj);
            case 16:
                return j(obj);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return m(obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return o(obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return p(obj);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return r(obj);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return s(obj);
            case 22:
                return t(obj);
            case 23:
                return u(obj);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return v(obj);
            case 25:
                return w(obj);
            case 26:
                return x(obj);
            case 27:
                return y(obj);
            case 28:
                return z(obj);
            default:
                pt ptVar = (pt) this.c;
                d9n d9nVar13 = d9n.a;
                boolean z13 = this.b;
                if (!z13) {
                    hm5.M(obj);
                    jge jgeVarE = hu20.e(yoi1.g((Observable) ptVar.g), new af01((lnm) null, ptVar, (byte) 21));
                    zw1 zw1Var = new zw1((ven0) this.d, (ven0) this.e, (ven0) this.f, (ven0) this.g, (byte) 1);
                    this.b = true;
                    if (jgeVarE.collect(zw1Var, this) == d9nVar13) {
                        return d9nVar13;
                    }
                } else {
                    if (!z13) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sew0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sew0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sew0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sew0(Object obj, lnm lnmVar, Object obj2, Object obj3, Object obj4, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sew0(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }
}
