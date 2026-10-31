package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.tome.pageactivity.PageActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p410 implements Function, k8x0, r6r0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;
    public final Object h;

    public p410(PageActivity pageActivity, PageActivity pageActivity2, PageActivity pageActivity3, w0r0 w0r0Var, yun0 yun0Var, jeh jehVar, o241 o241Var, Flowable flowable, vn41 vn41Var) {
        this.a = (byte) 27;
        this.b = w0r0Var;
        this.c = yun0Var;
        this.d = jehVar;
        vku vkuVar = new vku();
        this.e = vkuVar;
        this.f = new LinkedList();
        oe41 oe41VarJ = ((g0i) pageActivity).d.j();
        this.g = oe41VarJ;
        jvn0 jvn0Var = new jvn0(pageActivity2, pageActivity, pageActivity3, vn41Var);
        this.h = jvn0Var;
        oe41VarJ.c("nav_system_state", new uk(this, (byte) 12));
        ((f0i) pageActivity2).a.a(new y0r0(this));
        jvn0Var.e.add(new z0r0(this));
        vkuVar.a(Observable.combineLatest(((p241) o241Var).a, new ObservableFromPublisher(flowable), xi20.W0).subscribe(new ixp0(this, (byte) 6)));
    }

    public static final /* synthetic */ oe41 h(p410 p410Var) {
        return (oe41) p410Var.g;
    }

    public static final void k(p410 p410Var, Bundle bundle) {
        xg30 xg30VarA;
        Bundle bundle2 = bundle.getBundle("nav_manager_state");
        if (bundle2 != null) {
            w0r0 w0r0Var = (w0r0) p410Var.b;
            w0r0Var.a();
            yun0 yun0Var = w0r0Var.d;
            xxn0 xxn0VarD = w0r0Var.f.d(bundle2);
            xun0 xun0Var = xxn0VarD.a;
            yun0Var.b(xun0Var);
            yun0Var.o(xxn0VarD.b);
            yun0Var.i().addAll(xxn0VarD.c);
            yun0Var.l().addAll(xxn0VarD.d);
            if (((xun0Var == null || (xg30VarA = xun0Var.a()) == null) ? null : xg30VarA.d) instanceof b6w0) {
                zf30 zf30VarB = xun0Var.b();
                if (zf30VarB != null) {
                    w0r0Var.c.h(zf30VarB, xun0Var.a().c, new t0r0(0, w0r0Var, w0r0.class, "popFragment", "popFragment()V", 0, (byte) 1), new t0r0(0, w0r0Var, w0r0.class, "notifyCurrentFragmentChanged", "notifyCurrentFragmentChanged()V", 0, (byte) 2));
                }
            } else {
                w0r0Var.p();
            }
            w0r0Var.n();
        }
        jvn0 jvn0Var = (jvn0) p410Var.h;
        jvn0Var.getClass();
        jvn0Var.d = bundle.getParcelable("recent_session_state");
    }

    public void A(o2q0 o2q0Var) {
        ((yun0) this.c).d(o2q0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (p.fn31.Y(r6, r7, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object B(p.t4a0 r7, p.ou80 r8, p.aet0 r9, p.onm r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof p.v4a0
            if (r0 == 0) goto L13
            r0 = r10
            p.v4a0 r0 = (p.v4a0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.v4a0 r0 = new p.v4a0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L56
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.hm5.M(r10)
            goto L41
        L35:
            p.hm5.M(r10)
            r0.c = r3
            java.io.Serializable r10 = r6.C(r7, r8, r9, r0)
            if (r10 != r5) goto L41
            goto L55
        L41:
            p.iu30 r10 = (p.iu30) r10
            java.lang.Object r6 = r6.b
            p.q8n r6 = (p.q8n) r6
            p.w73 r7 = new p.w73
            r8 = 7
            r7.<init>(r10, r4, r8)
            r0.c = r2
            java.lang.Object r6 = p.fn31.Y(r6, r7, r0)
            if (r6 != r5) goto L56
        L55:
            return r5
        L56:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p410.B(p.t4a0, p.ou80, p.aet0, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        if (p.fc11.i(r14, r0) == r5) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable C(p.t4a0 r12, p.ou80 r13, p.aet0 r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p410.C(p.t4a0, p.ou80, p.aet0, p.onm):java.io.Serializable");
    }

    public void D() {
        switch (this.a) {
            case 18:
                xab1 xab1Var = (xab1) this.f;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.f = null;
                r091 r091Var = (r091) this.e;
                if (r091Var != null) {
                    r091Var.c();
                }
                r091 r091Var2 = (r091) this.e;
                if (r091Var2 != null) {
                    r091Var2.j();
                }
                r091 r091Var3 = (r091) this.e;
                if (r091Var3 != null) {
                    r091Var3.g();
                }
                this.e = null;
                bpb1 bpb1Var = (bpb1) this.g;
                tah0 tah0Var = new tah0((String) null, 15);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, tah0Var);
                break;
            default:
                fn31.T((u9c0) this.c, (o8n) null, 0, new wkk0(this, (lnm) null, (byte) 14), 3);
                break;
        }
    }

    public c4p1 a(t480 t480Var, long j, Set set) {
        long jE = ((yqg) this.d).e();
        dgs0 dgs0Var = (dgs0) w0h1.k((ConcurrentHashMap) this.f).remove(t480Var);
        r1r0 r1r0Var = (r1r0) w0h1.k((ConcurrentHashMap) this.g).remove(t480Var);
        Long lValueOf = dgs0Var != null ? Long.valueOf(jE - dgs0Var.a) : null;
        Object obj = this.c;
        if (lValueOf == null || lValueOf.longValue() < 300) {
            if (dgs0Var != null) {
                return new ih10(1);
            }
            if (r1r0Var == null) {
                return new ih10(2);
            }
            p480 p480Var = r1r0Var.b;
            ((q7h1) obj).a(p480Var, r1r0Var.c, r1r0Var.d, jE - r1r0Var.a, r1r0Var.e, r1r0Var.f, set, r1r0Var.g, r1r0Var.h);
            return new esc1(p480Var, Integer.valueOf(r1r0Var.c).intValue());
        }
        long jLongValue = lValueOf.longValue();
        a8r0 a8r0Var = dgs0Var.c;
        a8r0 a8r0Var2 = dgs0Var.c;
        y6r0 y6r0VarR = a4p1.r(a8r0Var.a);
        l7h1 l7h1Var = dgs0Var.b;
        q480 q480VarT = ((ffe1) this.b).t(y6r0VarR, a4p1.g(l7h1Var));
        p480 p480Var2 = new p480(q480VarT.a.toString());
        int i = q480VarT.b;
        if (i == 0) {
            ((q7h1) obj).b(p480Var2, dgs0Var.b, a8r0Var2, dgs0Var.d, dgs0Var.e);
        }
        q7h1 q7h1Var = (q7h1) obj;
        int i2 = q480VarT.b;
        long j2 = ((q6h1) l7h1Var).a;
        ArrayList arrayListS = a4p1.s(l7h1Var);
        ArrayList arrayListT = a4p1.t(l7h1Var);
        y6r0 y6r0Var = a8r0Var2.a;
        q7h1Var.a(p480Var2, i2, j2, jLongValue, arrayListS, arrayListT, set, y6r0Var != null ? y6r0Var.a : null, a8r0Var2.d);
        return new esc1(p480Var2, Integer.valueOf(i).intValue());
    }

    public Object apply(Object obj) {
        Map map = (Map) obj;
        q410 q410Var = (q410) this.b;
        q8n q8nVar = q410Var.j;
        Object obj2 = this.c;
        return rqt0.F(q8nVar, new o410(q410Var, (String) obj2, null, (byte) 1)).flatMap(new ip31(map, q410Var, (PreparePlayOptions) this.d, (Map) this.e, (LoggingParams) this.f, (String) obj2, (PlayOrigin) this.g, (PlayOptions) this.h, (byte) 24));
    }

    public String b() {
        return ((Activity) this.b).getResources().getString(2131960543);
    }

    public void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(724081415);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mod.b(oi7.a.a((gw70) this.b), apo.r(1995263559, new n160(this, rwq.g((any) this.g, new cxc0(), (o8n) null, x340Var, 0, 2), (byte) 1), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fc3(this, i);
        }
    }

    public t480 d(l7h1 l7h1Var, a8r0 a8r0Var, Set set, g6h1 g6h1Var) {
        t480 t480Var = new t480(UUID.randomUUID());
        ((ConcurrentHashMap) this.f).put(t480Var, new dgs0(((yqg) this.d).e(), l7h1Var, a8r0Var, set, g6h1Var));
        if (((AtomicBoolean) this.h).compareAndSet(false, true)) {
            fn31.T((llm) this.e, (o8n) null, 0, new bu(this, (lnm) null, (byte) 28), 3);
        }
        return t480Var;
    }

    public void e(y6r0 y6r0Var) {
        ffe1 ffe1Var = (ffe1) this.b;
        b7x b7xVar = (Map) ((p7h1) ffe1Var.b).a.remove(y6r0Var);
        if (b7xVar == null) {
            b7xVar = b7x.a;
        }
        ((ConcurrentHashMap) ffe1Var.c).putAll(b7xVar);
    }

    public void f(y6r0 y6r0Var) {
        ((ffe1) this.b).p(y6r0Var);
    }

    public void g(y6r0 y6r0Var) {
        fn31.T((llm) this.e, (o8n) null, 0, new e3p0(this, y6r0Var, (lnm) null, (byte) 15), 3);
    }

    public Observable i(j8x0 j8x0Var) {
        q8n q8nVar = (q8n) this.h;
        int iC = l1d.C(j8x0Var.g);
        if (iC == 0) {
            return rqt0.F(q8nVar, new po30(this, j8x0Var, (lnm) null, (byte) 0)).toObservable().compose(nm3.N0).compose(new fex0((tzr0) this.f, (byte) 1)).map(zj20.c).flatMap(new qo30(j8x0Var, this, (byte) 0));
        }
        if (iC == 1) {
            return s(j8x0Var);
        }
        if (iC == 2) {
            return t(j8x0Var);
        }
        if (iC == 3) {
            return rqt0.F(q8nVar, new xr00(this, (lnm) null, (byte) 15)).toObservable().map(new qo30(j8x0Var, this, (byte) 1));
        }
        eg.o();
        return null;
    }

    public String j() {
        return ((Activity) this.b).getResources().getString(2131960518);
    }

    public String l() {
        return ((Activity) this.b).getResources().getString(2131960517);
    }

    public void m(o2q0 o2q0Var) {
        ((yun0) this.c).g(o2q0Var);
    }

    public void n() {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator it = concurrentHashMap.entrySet().iterator();
        long jE = ((yqg) this.d).e();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            t480 t480Var = (t480) entry.getKey();
            dgs0 dgs0Var = (dgs0) entry.getValue();
            a8r0 a8r0Var = dgs0Var.c;
            boolean z = jE - dgs0Var.a >= 300;
            y6r0 y6r0Var = a8r0Var.a;
            l7h1 l7h1Var = dgs0Var.b;
            if (z) {
                q480 q480VarT = ((ffe1) this.b).t(a4p1.r(y6r0Var), a4p1.g(l7h1Var));
                p480 p480Var = new p480(q480VarT.a.toString());
                it.remove();
                Iterator it2 = it;
                long j = jE;
                ((ConcurrentHashMap) this.g).put(t480Var, new r1r0(dgs0Var.a, p480Var, q480VarT.b, ((q6h1) l7h1Var).a, a4p1.s(l7h1Var), a4p1.t(l7h1Var), y6r0Var != null ? y6r0Var.a : null, a8r0Var.d));
                if (q480VarT.b == 0) {
                    ((q7h1) this.c).b(p480Var, dgs0Var.b, a8r0Var, dgs0Var.d, dgs0Var.e);
                }
                it = it2;
                jE = j;
            }
        }
    }

    public jhm o(String str, boolean z, boolean z2, tm81 tm81Var) {
        return new jhm("list_toggle_automix", ptx.c, (fhm) null, Integer.valueOf(z ? 2131958609 : 2131958610), (String) null, false, tm81Var, new ihm(new ygm(2), new ghm(new r7j0(this, (byte) 14), new mj10((byte) 14, z)), new ne3((byte) 4, tm81Var, this, str, z, z2)), 116);
    }

    public js20 p(tyq tyqVar, xu30 xu30Var, iu30 iu30Var) {
        xvu xvuVar = (xvu) this.b;
        mr20 mr20Var = (mr20) this.c;
        f8b f8bVar = (f8b) this.d;
        iu30 iu30Var2 = (iu30) xvuVar.t;
        di4 di4Var = (di4) xvuVar.f;
        cn01 cn01Var = (cn01) this.e;
        ne neVar = (ne) this.f;
        d0r d0rVar = xvuVar.b;
        dgb dgbVar = (dgb) xvuVar.h;
        return x3p1.n(new z1(xvuVar, mr20Var, f8bVar, d0rVar, cn01Var, neVar, (t7y) this.g, (byte) 7), new jrf(xu30Var, (byte) 2), new xx00((tb51) this.h, di4Var, dgbVar, xu30Var), (o8n) null, new djx((Object) iu30Var, (Object) iu30Var2, (Object) neVar, (byte) 21), 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(Uri uri, l420 l420Var, onm onmVar) {
        rz70 rz70Var;
        if (onmVar instanceof rz70) {
            rz70Var = (rz70) onmVar;
            int i = rz70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rz70Var.d = i - Integer.MIN_VALUE;
            } else {
                rz70Var = new rz70(this, onmVar);
            }
        } else {
            rz70Var = new rz70(this, onmVar);
        }
        Object objY = rz70Var.b;
        int i2 = rz70Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objY);
            q8n q8nVar = (q8n) this.h;
            x060 x060Var = new x060(this, uri, (lnm) null, (byte) 15);
            rz70Var.a = l420Var;
            rz70Var.d = 1;
            objY = fn31.Y(q8nVar, x060Var, rz70Var);
            if (objY != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objY);
                return objY;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l420Var = rz70Var.a;
        hm5.M(objY);
        gya gyaVar = (gya) this.e;
        rz70Var.a = null;
        rz70Var.d = 2;
        Object objA = eya.a(gyaVar, (Bitmap) objY, l420Var, rz70Var);
        return objA == d9nVar ? d9nVar : objA;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object r(String str, tv80 tv80Var, onm onmVar) {
        iyj0 iyj0Var;
        tv80 tv80Var2;
        Object objA;
        tv80 tv80Var3;
        String str2;
        int i;
        f1n0 f1n0Var;
        Object obj;
        if (onmVar instanceof iyj0) {
            iyj0Var = (iyj0) onmVar;
            int i2 = iyj0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iyj0Var.g = i2 - Integer.MIN_VALUE;
            } else {
                iyj0Var = new iyj0(this, onmVar);
            }
        } else {
            iyj0Var = new iyj0(this, onmVar);
        }
        Object obj2 = iyj0Var.e;
        int i3 = iyj0Var.g;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(obj2);
            ack0 ack0Var = (ybk0) this.g;
            tv80Var2 = tv80Var;
            iyj0Var.a = tv80Var2;
            iyj0Var.g = 1;
            objA = ack0Var.a(str, (String) null, iyj0Var, (lhg1) null);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 == 1) {
            tv80Var2 = iyj0Var.a;
            hm5.M(obj2);
            objA = ((e331) obj2).a;
        } else {
            if (i3 == 2) {
                i = iyj0Var.d;
                str2 = iyj0Var.c;
                Object obj3 = iyj0Var.b;
                tv80Var3 = iyj0Var.a;
                hm5.M(obj2);
                objA = obj3;
                f1n0Var = (f1n0) this.c;
                iyj0Var.a = null;
                iyj0Var.b = objA;
                iyj0Var.c = null;
                iyj0Var.d = i;
                iyj0Var.g = 3;
                if (f1n0.f(f1n0Var, str2, tv80Var3, iyj0Var) != d9nVar) {
                    obj = objA;
                }
                return d9nVar;
            }
            if (i3 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = iyj0Var.b;
            hm5.M(obj2);
        }
        objA = obj;
        if (e331.a(objA) != null) {
            kt91 kt91Var = (kt91) this.d;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957349});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131957349, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return rih1.a;
        if (!(objA instanceof m231)) {
            String str3 = (String) objA;
            pp31 pp31Var = (op31) this.e;
            iyj0Var.a = tv80Var2;
            iyj0Var.b = objA;
            iyj0Var.c = str3;
            iyj0Var.d = 0;
            iyj0Var.g = 2;
            if (pp31Var.c(str3, iyj0Var) != d9nVar) {
                tv80Var3 = tv80Var2;
                str2 = str3;
                i = 0;
                f1n0Var = (f1n0) this.c;
                iyj0Var.a = null;
                iyj0Var.b = objA;
                iyj0Var.c = null;
                iyj0Var.d = i;
                iyj0Var.g = 3;
                if (f1n0.f(f1n0Var, str2, tv80Var3, iyj0Var) != d9nVar) {
                    obj = objA;
                    objA = obj;
                }
            }
            return d9nVar;
        }
        if (e331.a(objA) != null) {
            kt91 kt91Var2 = (kt91) this.d;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957349});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var2.k(new er91((fs91) null, "", 2131957349, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return rih1.a;
    }

    public void reset() {
        op71.q(((llm) this.e).a, (CancellationException) null);
        ((AtomicBoolean) this.h).set(false);
        ((ConcurrentHashMap) ((ffe1) this.b).c).clear();
    }

    public Observable s(j8x0 j8x0Var) {
        return rqt0.F((q8n) this.h, new po30(this, j8x0Var, (lnm) null, (byte) 1)).toObservable().compose(nm3.N0).compose(new fex0((tzr0) this.f, (byte) 1)).map(new kp00(j8x0Var, this, (byte) 23)).flatMap(new mjv(this, (byte) 19));
    }

    public Observable t(j8x0 j8x0Var) {
        return rqt0.F((q8n) this.h, new po30(this, j8x0Var, (lnm) null, (byte) 2)).toObservable().compose(nm3.N0).compose(new fex0((tzr0) this.f, (byte) 1)).map(new ro30(j8x0Var, this, (byte) 0)).flatMap(new hl00(this, (byte) 7));
    }

    public int type() {
        return 6;
    }

    public LinearLayout u() {
        return (LinearLayout) this.b;
    }

    public void v() {
        ((vku) this.e).c();
    }

    public void w(Intent intent) {
        jvn0 jvn0Var = (jvn0) this.h;
        if (!jvn0Var.b()) {
            ((LinkedList) this.f).add(intent);
            return;
        }
        ozp0 ozp0Var = new ozp0(this, intent, (byte) 14);
        th61 th61Var = jvn0Var.d;
        if (th61Var != null) {
            ozp0Var.invoke(th61Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(Intent intent, onm onmVar) {
        evf0 evf0Var;
        zvf0 zvf0Var;
        if (onmVar instanceof evf0) {
            evf0Var = (evf0) onmVar;
            int i = evf0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                evf0Var.e = i - Integer.MIN_VALUE;
            } else {
                evf0Var = new evf0(this, onmVar);
            }
        } else {
            evf0Var = new evf0(this, onmVar);
        }
        Object objI = evf0Var.c;
        int i2 = evf0Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            zx60 zx60Var = (zx60) this.f;
            evf0Var.a = intent;
            evf0Var.e = 1;
            objI = b5p1.i(zx60Var, evf0Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            intent = evf0Var.a;
            hm5.M(objI);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zvf0Var = evf0Var.b;
            hm5.M(objI);
        }
        zvf0Var.a.c(yg8.Z, 0);
        return rih1.a;
        zvf0 zvf0Var2 = (bwf0) objI;
        if (!(zvf0Var2 instanceof zvf0)) {
            if (u890.j(zvf0Var2, awf0.a)) {
                eg.m("Logout API unavailable");
                return null;
            }
            eg.o();
            return null;
        }
        q8n q8nVar = (q8n) this.h;
        e9c0 e9c0Var = new e9c0(this, intent, (lnm) null, (byte) 26);
        evf0Var.a = null;
        evf0Var.b = zvf0Var2;
        evf0Var.e = 2;
        if (fn31.Y(q8nVar, e9c0Var, evf0Var) != d9nVar) {
            zvf0Var = zvf0Var2;
            zvf0Var.a.c(yg8.Z, 0);
            return rih1.a;
        }
        return d9nVar;
    }

    public zob1 y() {
        return d5p1.t(hu20.e((bpb1) this.e, new i64(3, (lnm) null, (byte) 17)), (u9c0) this.c, ey71.a, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(h471 h471Var, Intent intent, x871 x871Var, onm onmVar) throws Exception {
        sz70 sz70Var;
        h471 h471Var2;
        p371 p371Var;
        Intent intent2;
        x871 x871Var2;
        h471 h471Var3;
        Uri uri;
        if (onmVar instanceof sz70) {
            sz70Var = (sz70) onmVar;
            int i = sz70Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sz70Var.g = i - Integer.MIN_VALUE;
            } else {
                sz70Var = new sz70(this, onmVar);
            }
        } else {
            sz70Var = new sz70(this, onmVar);
        }
        Object objQ = sz70Var.e;
        int i2 = sz70Var.g;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objQ);
            p371 p371Var2 = x871Var.a;
            if (!(p371Var2 instanceof pz70)) {
                eg.m("Check failed.");
                return null;
            }
            o771 o771Var = (o771) this.d;
            sz70Var.a = h471Var;
            sz70Var.b = intent;
            sz70Var.c = x871Var;
            sz70Var.d = p371Var2;
            sz70Var.g = 1;
            Object objA = n771.a(o771Var, ".png", sz70Var);
            if (objA != obj) {
                h471Var2 = h471Var;
                p371Var = p371Var2;
                objQ = objA;
            }
            return obj;
        }
        if (i2 == 1) {
            p371Var = sz70Var.d;
            x871Var = sz70Var.c;
            intent = sz70Var.b;
            h471Var2 = sz70Var.a;
            hm5.M(objQ);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p371Var = sz70Var.d;
            x871Var2 = sz70Var.c;
            intent2 = sz70Var.b;
            h471Var3 = sz70Var.a;
            hm5.M(objQ);
        }
        uri = (Uri) objQ;
        if (uri != null) {
            throw up30.p((Context) this.b, h471Var3.e());
        }
        dzo1.k(intent2, new mmr0[]{new mmr0("android.intent.extra.STREAM", uri), new mmr0("android.intent.extra.TEXT", l0p1.j(p371Var, x871Var2.b.a))});
        ((cn3) this.c).b(intent2, new Uri[]{uri});
        ((oiv) this.g).f(intent2);
        return intent2;
        Uri uri2 = ((pz70) p371Var).a;
        sz70Var.a = h471Var2;
        sz70Var.b = intent;
        sz70Var.c = x871Var;
        sz70Var.d = p371Var;
        sz70Var.g = 2;
        objQ = q(uri2, (l420) objQ, sz70Var);
        if (objQ != obj) {
            x871 x871Var3 = x871Var;
            intent2 = intent;
            x871Var2 = x871Var3;
            h471Var3 = h471Var2;
            uri = (Uri) objQ;
            if (uri != null) {
                throw up30.p((Context) this.b, h471Var3.e());
            }
            dzo1.k(intent2, new mmr0[]{new mmr0("android.intent.extra.STREAM", uri), new mmr0("android.intent.extra.TEXT", l0p1.j(p371Var, x871Var2.b.a))});
            ((cn3) this.c).b(intent2, new Uri[]{uri});
            ((oiv) this.g).f(intent2);
            return intent2;
        }
        return obj;
    }

    public p410(mwm1 mwm1Var, xrc0 xrc0Var, Scheduler scheduler, v5n v5nVar, String str, agc0 agc0Var, g35 g35Var) {
        this.a = (byte) 25;
        this.b = mwm1Var;
        this.d = xrc0Var;
        this.e = scheduler;
        this.f = v5nVar;
        this.c = str;
        this.g = agc0Var;
        this.h = g35Var;
    }

    public p410(ffe1 ffe1Var, q7h1 q7h1Var, yqg yqgVar) {
        this.a = (byte) 28;
        fns fnsVar = igu.a;
        this.b = ffe1Var;
        this.c = q7h1Var;
        this.d = yqgVar;
        this.e = smo1.e(flo1.l(guo1.B(), fnsVar));
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
    }

    public p410(Context context, ekb ekbVar, a680 a680Var, yc10 yc10Var, d0r d0rVar, aap aapVar) {
        this.a = (byte) 1;
        this.b = context;
        this.c = ekbVar;
        this.d = a680Var;
        this.e = yc10Var;
        this.f = d0rVar;
        this.g = aapVar;
        this.h = new idd1(new f710(this, (byte) 1));
    }

    public p410(dg30 dg30Var, f1n0 f1n0Var, kt91 kt91Var, op31 op31Var, q8n q8nVar, ybk0 ybk0Var) {
        this.a = (byte) 21;
        r6h1 r6h1Var = r6h1.c;
        this.b = dg30Var;
        this.c = f1n0Var;
        this.d = kt91Var;
        this.e = op31Var;
        this.f = q8nVar;
        this.g = ybk0Var;
        this.h = new fjl0(r6h1Var, (byte) 12);
    }

    public p410(Activity activity, kwg1 kwg1Var, String str, j0a1 j0a1Var, tzr0 tzr0Var, gdx0 gdx0Var, q8n q8nVar) {
        this.a = (byte) 6;
        this.b = activity;
        this.d = kwg1Var;
        this.c = str;
        this.e = j0a1Var;
        this.f = tzr0Var;
        this.g = gdx0Var;
        this.h = q8nVar;
    }

    public p410(RetrofitMaker retrofitMaker, xh71 xh71Var, kt91 kt91Var, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 22;
        this.b = retrofitMaker;
        this.c = xh71Var;
        this.d = kt91Var;
        this.e = q8nVar;
        this.f = q8nVar2;
        this.g = new idd1(new zem0(this, (byte) 18));
        this.h = us71.h(q8nVar2);
    }

    public p410(i8h1 i8h1Var, zor zorVar, g0l g0lVar, Scheduler scheduler, Scheduler scheduler2, dsk0 dsk0Var) {
        this.a = (byte) 12;
        this.b = i8h1Var;
        this.c = zorVar;
        this.d = g0lVar;
        this.e = scheduler;
        this.f = scheduler2;
        this.g = dsk0Var;
        this.h = new CompositeDisposable();
    }

    public p410(dg30 dg30Var, kt91 kt91Var, zwz0 zwz0Var, jjk0 jjk0Var, q8n q8nVar, x1i1 x1i1Var) {
        this.a = (byte) 20;
        r6h1 r6h1Var = r6h1.c;
        this.b = dg30Var;
        this.c = kt91Var;
        this.d = zwz0Var;
        this.e = jjk0Var;
        this.f = q8nVar;
        this.g = x1i1Var;
        this.h = new fjl0(r6h1Var, (byte) 12);
    }

    public p410(wu50 wu50Var, roc0 roc0Var, gw70 gw70Var, wmy wmyVar, r6h1 r6h1Var) {
        this.a = (byte) 8;
        this.b = gw70Var;
        this.c = wmyVar;
        this.d = r6h1Var;
        bpb1 bpb1VarB = gio1.b(0);
        this.e = bpb1VarB;
        this.f = (xpw) wu50Var.b.invoke(bpb1VarB);
        this.g = roc0Var.d();
        this.h = wu50Var.a;
    }

    public /* synthetic */ p410(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    public p410(Context context, ViewGroup viewGroup, gw70 gw70Var, wx70 wx70Var) {
        this.a = (byte) 11;
        this.b = context;
        this.c = gw70Var;
        this.d = wx70Var;
        View viewInflate = LayoutInflater.from(context).inflate(2131626041, viewGroup, false);
        this.e = viewInflate;
        this.f = viewInflate.findViewById(2131427892);
        this.g = viewInflate.findViewById(2131429624);
        this.h = (FrameLayout) viewInflate.findViewById(2131428809);
    }

    public p410(mwm1 mwm1Var, xrc0 xrc0Var, iyc0 iyc0Var, x25 x25Var) {
        this.a = (byte) 3;
        this.b = mwm1Var;
        this.c = xrc0Var;
        this.d = iyc0Var;
        this.e = x25Var;
        b7x b7xVar = b7x.a;
        w7x w7xVar = w7x.a;
        this.f = gio1.b(new p530((List) null, (String) null, b7xVar, false, w7xVar, (g3d0) null));
        this.g = new vku();
        this.h = gio1.b(new o530(w7xVar, (g3d0) null));
    }

    public p410(q7r0 q7r0Var, ynb0 ynb0Var, c9n c9nVar) {
        this.a = (byte) 18;
        this.b = ynb0Var;
        this.c = c9nVar;
        bpb1 bpb1VarB = gio1.b(new tah0((String) null, 15));
        this.g = bpb1VarB;
        this.h = d5p1.h(bpb1VarB);
        q7r0Var.d.c.getLifecycle().a(new ct6(this, (byte) 10));
    }

    public p410(LinearLayout linearLayout, FrameLayout frameLayout, ComposeView composeView, TextView textView, TextView textView2, ComposeView composeView2, ComposeView composeView3, FrameLayout frameLayout2) {
        this.a = (byte) 5;
        this.b = linearLayout;
        this.c = frameLayout;
        this.d = composeView;
        this.e = textView;
        this.f = textView2;
        this.g = composeView2;
        this.h = composeView3;
    }

    public p410(RoundedConstraintLayout roundedConstraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, ArtworkView artworkView, EncoreButton encoreButton, TextView textView5) {
        this.a = (byte) 15;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = artworkView;
        this.g = encoreButton;
        this.h = textView5;
    }

    public p410(FrameLayout frameLayout, EncoreButton encoreButton, EditText editText, ConstraintLayout constraintLayout, EncoreTextView encoreTextView, EncoreButton encoreButton2, TextView textView, ScrollView scrollView, EncoreTextView encoreTextView2, View view, ConstraintLayout constraintLayout2, View view2) {
        this.a = (byte) 4;
        this.b = frameLayout;
        this.c = editText;
        this.d = encoreTextView;
        this.e = encoreButton2;
        this.f = encoreTextView2;
        this.g = view;
        this.h = view2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p410(Function0 function0, kko kkoVar, ojv0 ojv0Var, Function0 function1, p731 p731Var, vu30 vu30Var, int i) {
        this((Object) function0, (Object) kkoVar, (Object) ojv0Var, (Object) function1, (Object) ((i & 16) != 0 ? null : p731Var), (Object) ((i & 32) != 0 ? null : vu30Var), (Object) null, (byte) 19);
        this.a = (byte) 19;
    }

    public p410(ttm0 ttm0Var, u9c0 u9c0Var, yjp1 yjp1Var) {
        this.a = (byte) 23;
        this.b = ttm0Var;
        this.c = u9c0Var;
        this.d = yjp1Var;
        this.e = gio1.b((Object) null);
        this.f = gio1.b((Object) null);
        this.g = ttm0Var.c(false);
        this.h = ygn0.a();
        fn31.T(u9c0Var, (o8n) null, 0, new iyb0(this, null, (byte) 17), 3);
    }
}
