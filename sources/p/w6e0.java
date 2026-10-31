package p;

import android.app.PendingIntent;
import android.content.Context;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.creativeworkplatform.creativeworkplatformimpl.page.releasegroup.MetadataNotFoundException;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class w6e0 implements n2r, p2r0, Function, qvq0, hx30 {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public w6e0(w6e0 w6e0Var, rzq rzqVar, uny unyVar) {
        this.a = (byte) 29;
        this.d = w6e0Var;
        this.b = rzqVar;
        this.e = unyVar;
        jd11 jd11Var = rc11.a;
        this.c = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 1, kmj0.X, new j4r(kmj0.d), kmj0.Y), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, kmj0.g, new j4r(kmj0.e), kmj0.h), new l4r(new xv00(jd11Var.b(zoy0.class)), 2, kmj0.i, new j4r(kmj0.f), kmj0.t), gce0.P0);
    }

    public static String m(int i, a9h a9hVar) {
        String str;
        aef0 aef0Var = (aef0) o7h.t0(i, a9hVar.a.a);
        if (aef0Var == null || (str = aef0Var.b) == null || str.length() <= 0 || ihc1.y0(str)) {
            return null;
        }
        return str;
    }

    public void a() {
        ((View) this.d).animate().alpha(1.0f).setDuration(100L).start();
        ((View) this.b).animate().alpha(1.0f).setDuration(100L).start();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ed  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v19 java.lang.Object, still in use, count: 2, list:
          (r3v19 java.lang.Object) from 0x00b3: PHI (r3 I:??) = (r3v10 java.lang.Object), (r3v19 java.lang.Object) binds: [B:23:0x00b2, B:41:0x00b3] A[DONT_GENERATE, DONT_INLINE]
          (r3v19 java.lang.Object) from 0x00a7: CHECK_CAST (java.lang.Number) (r3v19 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w6e0.apply(java.lang.Object):java.lang.Object");
    }

    public void b() {
        ((View) this.d).animate().alpha(0.0f).setDuration(100L).start();
        ((View) this.b).animate().alpha(0.0f).setDuration(100L).start();
    }

    public Object d(Map map, onm onmVar) {
        ohd ohdVar = new ohd(1, aym.t(onmVar));
        ohdVar.t();
        Observable observableR = syo1.r((njj0) this.d, map);
        observableR.doOnNext(new xkj0(this, (byte) 0)).subscribe();
        Collection<Set> collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            ohdVar.resumeWith(wkj0.a);
        } else {
            for (Set set : collectionValues) {
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (!(((aq21) it.next()) instanceof yp21)) {
                            ohdVar.n(new vlb(observableR.doOnNext(new xkj0(this, (byte) 1)).flatMap(new mre0(map, (byte) 11)).firstOrError().subscribe(new kar(ohdVar, (byte) 1), new kar(ohdVar, (byte) 2)), (byte) 2));
                        }
                    }
                }
            }
            ohdVar.resumeWith(wkj0.a);
        }
        return ohdVar.r();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Map map, onm onmVar) {
        ykj0 ykj0Var;
        if (onmVar instanceof ykj0) {
            ykj0Var = (ykj0) onmVar;
            int i = ykj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ykj0Var.d = i - Integer.MIN_VALUE;
            } else {
                ykj0Var = new ykj0(this, onmVar);
            }
        } else {
            ykj0Var = new ykj0(this, onmVar);
        }
        Object objL = ykj0Var.b;
        int i2 = ykj0Var.d;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableR = syo1.r((njj0) this.d, map);
            ykj0Var.a = map;
            ykj0Var.d = 1;
            objL = fc11.l(observableR, 3, (Object) null, ykj0Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = ykj0Var.a;
            hm5.M(objL);
        }
        cqs0 cqs0Var = ((ioj0) objL).a;
        ioj0 ioj0VarA = ((ioj0) this.b).a(cqs0Var, false);
        this.b = ioj0VarA;
        ((bpb1) this.e).m((Object) null, ioj0VarA);
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (obj instanceof zp21) {
                        arrayList.add(obj);
                    }
                }
                Map map2 = (Map) cqs0Var.get(entry.getKey());
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if ((map2 != null ? (hoj0) map2.get(((zp21) it.next()).a) : null) instanceof foj0) {
                            return new m231(new IOException());
                        }
                    }
                }
            }
        }
        return rih1.a;
    }

    public void f(int[] iArr) {
        int i = iArr[0];
        ImageView imageView = (ImageView) this.c;
        if (i >= imageView.getLeft()) {
            if (iArr[0] > imageView.getWidth() + imageView.getLeft() || iArr[1] < imageView.getTop()) {
                return;
            }
            if (iArr[1] <= imageView.getHeight() + imageView.getTop()) {
                ((iu30) this.e).invoke(xvg0.a);
            }
        }
    }

    public qba g(m0u0 m0u0Var, r590 r590Var, bpa bpaVar, int i, String str, boolean z) {
        m0u0 m0u0Var2;
        r590 r590Var2;
        fdc fdcVarP;
        f9v f9vVarM;
        f9v f9vVar;
        m0u0 m0u0Var3 = m0u0Var;
        anh0 anh0Var = (anh0) this.c;
        boolean z2 = true;
        if (anh0Var != null && anh0Var.c(m0u0Var3)) {
            return ((anh0) this.c).a(m0u0Var3, bpaVar, (gxu) null, r590Var, r590Var);
        }
        for (anh0 anh0Var2 : (List) this.e) {
            if (anh0Var2.c(m0u0Var3)) {
                return anh0Var2.a(m0u0Var3, bpaVar, (gxu) null, r590Var, r590Var);
            }
            m0u0Var3 = m0u0Var;
        }
        r590Var.L();
        yqu0 yqu0Var = (yqu0) this.b;
        cxc cxcVarC = ((l270) this.d).d(cwp0.d).c();
        if (((gz10) yqu0Var.b).a(str)) {
            iz10 iz10Var = (iz10) yqu0Var.c;
            m0u0Var2 = m0u0Var;
            r590Var2 = r590Var;
            fdcVarP = new fdc(iz10Var.a, m0u0Var2, r590Var2, new c4z(2, iz10Var, iz10.class, "getOrPut", "getOrPut(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/spotify/contentdelivery/download/FileStreamer;", 0, (byte) 3), z, (byte) 13);
        } else {
            m0u0Var2 = m0u0Var;
            r590Var2 = r590Var;
            fdcVarP = zgo1.p(cxcVarC, bpaVar, r590Var2);
        }
        fdc fdcVar = fdcVarP;
        pjq0 pjq0Var = new pjq0(new vyr(), (byte) 27);
        Object obj = new Object();
        ij81 ij81Var = new ij81(-1, (byte) 12);
        loh0 loh0Var = new loh0();
        ooh0 ooh0Var = new ooh0();
        List list = Collections.EMPTY_LIST;
        w280 w280Var = b380.b;
        bg11 bg11Var = bg11.e;
        qoh0 qoh0Var = new qoh0();
        toh0 toh0Var = toh0.d;
        Uri uri = Uri.parse(m0u0Var2.a.a);
        if (((Uri) ooh0Var.e) != null && ((UUID) ooh0Var.d) == null) {
            z2 = false;
        }
        dm5.y(z2);
        yoh0 yoh0Var = new yoh0("", new noh0(loh0Var), uri != null ? new soh0(uri, (String) null, ((UUID) ooh0Var.d) != null ? new poh0(ooh0Var) : null, (joh0) null, list, (String) null, bg11Var, -9223372036854775807L) : null, new roh0(qoh0Var), tqh0.M, toh0Var);
        yoh0Var.b.getClass();
        yoh0Var.b.getClass();
        poh0 poh0Var = yoh0Var.b.c;
        if (poh0Var == null) {
            f9vVar = f9v.a;
        } else {
            synchronized (obj) {
                try {
                    f9vVarM = poh0Var.equals((Object) null) ? null : k9r.m(poh0Var);
                    f9vVarM.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            f9vVar = f9vVarM;
        }
        s2i0 s2i0Var = new s2i0(new akx0(yoh0Var, fdcVar, pjq0Var, f9vVar, ij81Var, i, true, (ie30) null), this, m0u0Var2);
        s2i0Var.b(new Handler(Looper.getMainLooper()), new r2i0(r590Var2, m0u0Var2));
        return s2i0Var;
    }

    public ymd0 getState() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (kdn0) obj;
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 3:
                return new bjx((x7e0) obj2, (z7e0) this.b, q7r0Var, (u7r0) this.e, bundle, (iu30) obj);
            default:
                return new ur00((a8e0) obj2, (q6e0) this.b, q7r0Var, bundle, (u7r0) this.e, (iu30) obj);
        }
    }

    public void i() {
        ((iu30) this.e).invoke(bwg0.a);
    }

    public void j() {
        iu30 iu30Var = (iu30) this.e;
        if (iu30Var == null) {
            return;
        }
        agh0 agh0Var = (dgh0) this.b;
        if (agh0Var instanceof agh0) {
            if (agh0Var.a) {
                return;
            }
            this.b = new agh0(true);
            iu30Var.invoke(wtf1.a);
            return;
        }
        if (agh0Var instanceof zfh0) {
            if (((zfh0) agh0Var).a) {
                return;
            }
            this.b = new zfh0(true);
            iu30Var.invoke(wtf1.b);
            return;
        }
        if (u890.j(agh0Var, cgh0.a) || u890.j(agh0Var, bgh0.a)) {
            return;
        }
        eg.o();
    }

    public Function0 k() {
        return (Function0) this.d;
    }

    public kko l() {
        return (kko) this.b;
    }

    public xe01 n() {
        return (xe01) this.c;
    }

    public Function0 o() {
        return (n0g0) this.e;
    }

    public void onFailure(Throwable th) {
        ((h2i0) this.c).n.remove((ixh0) this.d);
        iqo1.r((eh70) this.e);
    }

    public void onSuccess(Object obj) throws Throwable {
        boolean z;
        Bundle bundleB;
        gxh0 gxh0VarA = (gxh0) obj;
        eh70 eh70Var = (eh70) this.e;
        fzh0 fzh0Var = (fzh0) this.b;
        h2i0 h2i0Var = (h2i0) this.c;
        CopyOnWriteArraySet copyOnWriteArraySet = h2i0Var.n;
        v1k v1kVar = h2i0Var.m;
        ixh0 ixh0Var = (ixh0) this.d;
        copyOnWriteArraySet.remove(ixh0Var);
        try {
            if (fzh0Var.p()) {
                iqo1.r(eh70Var);
                return;
            }
            a2i0 a2i0Var = ixh0Var.e;
            a2i0Var.getClass();
            IBinder iBinderAsBinder = a2i0Var.a.asBinder();
            boolean z2 = gxh0VarA.a;
            if (!z2 && !ixh0Var.d) {
                iqo1.r(eh70Var);
                return;
            }
            if (!z2) {
                gxh0VarA = gxh0.a(qa61.b, m8u0.b);
            }
            if (v1kVar.u(ixh0Var)) {
                oon1.H("Controller " + ixh0Var + " has sent connection request multiple times");
            }
            v1kVar.b(iBinderAsBinder, ixh0Var, gxh0VarA.b, gxh0VarA.c);
            xen0 xen0VarQ = v1kVar.q(ixh0Var);
            if (xen0VarQ == null) {
                oon1.H("Ignoring connection request from unknown controller info");
                iqo1.r(eh70Var);
                return;
            }
            fzh0Var.C();
            ffu0 ffu0Var = fzh0Var.t;
            jbu0 jbu0Var = fzh0Var.s;
            fzh0Var.C();
            m8u0 m8u0Var = gxh0VarA.c;
            jbu0 jbu0VarK1 = h2i0Var.k1(h2i0Var.l1(jbu0Var));
            if (v1kVar.u(ixh0Var)) {
                sqe1 sqe1Var = jbu0VarK1.j;
                o3g1 o3g1Var = jbu0VarK1.F;
                v1kVar.J();
                q8l q8lVar = (q8l) ((y36) v1kVar.c).get(ixh0Var);
                q8lVar.getClass();
                q8lVar.i = sqe1Var;
                q8lVar.j = o3g1Var;
            }
            MediaSession.Token tokenH = fzh0Var.h();
            fzh0Var.C();
            PendingIntent pendingIntent = fzh0Var.u;
            b380 b380Var = gxh0VarA.d;
            if (b380Var == null) {
                fzh0Var.C();
                b380Var = fzh0Var.C;
            }
            b380 b380Var2 = gxh0VarA.e;
            if (b380Var2 == null) {
                fzh0Var.C();
                b380Var2 = fzh0Var.D;
            }
            fzh0Var.C();
            b380 b380Var3 = fzh0Var.r;
            qa61 qa61Var = gxh0VarA.b;
            m8u0 m8u0VarN0 = ffu0Var.n0();
            Bundle bundle = new Bundle(fzh0Var.j.a.g);
            Bundle bundle2 = gxh0VarA.f;
            if (bundle2 == null) {
                fzh0Var.C();
                bundle2 = fzh0Var.E;
            }
            xal xalVar = new xal(1011000300, 10, h2i0Var, pendingIntent, b380Var, b380Var2, b380Var3, qa61Var, m8u0Var, m8u0VarN0, bundle, bundle2, jbu0VarK1, tokenH, (String) null);
            if (fzh0Var.p()) {
                iqo1.r(eh70Var);
                return;
            }
            try {
                int iD = xen0VarQ.d();
                if (eh70Var instanceof xlh0) {
                    bundleB = new Bundle();
                    bundleB.putBinder(xal.C, new oal(xalVar));
                } else {
                    bundleB = xalVar.b(ixh0Var.c);
                }
                eh70Var.u(iD, bundleB);
                z = true;
            } catch (RemoteException unused) {
                z = false;
            }
            if (z) {
                try {
                    fzh0Var.w(ixh0Var);
                } catch (Throwable th) {
                    th = th;
                    if (!z) {
                        iqo1.r(eh70Var);
                    }
                    throw th;
                }
            }
            if (z) {
                return;
            }
            iqo1.r(eh70Var);
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public klv0 p() {
        return (klv0) this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r7 == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(java.lang.String r8, p.kp00 r9, p.c7g1 r10, p.onm r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof p.znj0
            if (r0 == 0) goto L13
            r0 = r11
            p.znj0 r0 = (p.znj0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.znj0 r0 = new p.znj0
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2d
            p.hm5.M(r11)
            p.e331 r11 = (p.e331) r11
            java.lang.Object r7 = r11.a
            return r7
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L33:
            p.kp00 r9 = r0.a
            p.hm5.M(r11)
            p.e331 r11 = (p.e331) r11
            java.lang.Object r7 = r11.a
            goto L57
        L3d:
            p.hm5.M(r11)
            java.lang.Object r11 = r9.b
            p.r2p1 r11 = (p.r2p1) r11
            boolean r1 = r11 instanceof p.uzq
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L7b
            p.uzq r11 = (p.uzq) r11
            r0.a = r9
            r0.d = r3
            java.lang.Object r7 = r7.t(r8, r11, r0)
            if (r7 != r5) goto L57
            goto L8b
        L57:
            boolean r8 = r7 instanceof p.m231
            if (r8 != 0) goto L7a
            p.wto r7 = (p.wto) r7
            java.lang.Object r8 = r9.c
            p.iu30 r8 = (p.iu30) r8
            java.lang.Object r9 = r7.e
            java.lang.Object r8 = r8.invoke(r9)
            r4 = r8
            p.tto r4 = (p.tto) r4
            java.lang.String r1 = r7.a
            java.util.List r2 = r7.b
            p.vto r3 = r7.c
            java.lang.Object r5 = r7.e
            p.v6g1 r6 = r7.f
            p.wto r0 = new p.wto
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L7a:
            return r7
        L7b:
            boolean r9 = r11 instanceof p.tzq
            if (r9 == 0) goto L8d
            p.tzq r11 = (p.tzq) r11
            r0.a = r4
            r0.d = r2
            java.lang.Object r7 = r7.s(r8, r10, r11, r0)
            if (r7 != r5) goto L8c
        L8b:
            return r5
        L8c:
            return r7
        L8d:
            p.eg.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w6e0.q(java.lang.String, p.kp00, p.c7g1, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object r(String str, uzq uzqVar, onm onmVar) {
        aoj0 aoj0Var;
        String str2;
        Object obj;
        up70 up70VarA;
        if (onmVar instanceof aoj0) {
            aoj0Var = (aoj0) onmVar;
            int i = aoj0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aoj0Var.d = i - Integer.MIN_VALUE;
            } else {
                aoj0Var = new aoj0(this, onmVar);
            }
        } else {
            aoj0Var = new aoj0(this, onmVar);
        }
        Object obj2 = aoj0Var.b;
        int i2 = aoj0Var.d;
        String str3 = null;
        if (i2 == 0) {
            hm5.M(obj2);
            rzq rzqVar = (rzq) this.b;
            o3r o3rVar = (o3r) this.c;
            o3r o3rVar2 = uzqVar.c;
            aoj0Var.a = str;
            aoj0Var.d = 1;
            d9n d9nVarL = u2p1.l(rzqVar, o3rVar, o3rVar2, str, aoj0Var);
            d9n d9nVar = d9n.a;
            if (d9nVarL == d9nVar) {
                return d9nVar;
            }
            str2 = str;
            obj = d9nVarL;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = aoj0Var.a;
            hm5.M(obj2);
            obj = ((e331) obj2).a;
            str2 = str4;
        }
        Throwable thA = e331.a(obj);
        if (thA != null) {
            return new m231(thA);
        }
        mmr0 mmr0Var = (mmr0) obj;
        ynj0 ynj0Var = (ynj0) mmr0Var.a;
        Object obj3 = mmr0Var.b;
        jo70 jo70Var = ynj0Var.a;
        io70 io70Var = jo70Var.e;
        vto vtoVar = io70Var != null ? new vto(io70Var.b, io70Var.a) : null;
        List<ho70> list = jo70Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (ho70 ho70Var : list) {
            arrayList.add(new uto(ho70Var.b, ho70Var.a));
        }
        xkk1 xkk1Var = ynj0Var.b;
        if (xkk1Var != null && (up70VarA = xkk1Var.a.a(vp70.d)) != null) {
            str3 = up70VarA.a.a;
        }
        jo70 jo70Var2 = ynj0Var.a;
        return new wto(str2, arrayList, vtoVar, obj3, new v6g1(0L, str3, jo70Var2.a, jo70Var2.b));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:58:0x019a  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public Object s(String str, c7g1 c7g1Var, tzq tzqVar, onm onmVar) {
        boj0 boj0Var;
        Object obj;
        tzq tzqVar2;
        c7g1 c7g1Var2;
        ioj0 ioj0Var;
        ArrayList arrayList;
        tzq tzqVar3;
        c7g1 c7g1Var3;
        vto vtoVar;
        v6g1 v6g1Var;
        MetadataNotFoundException iOException;
        Collection collectionValues;
        List list;
        Object objInvoke;
        Object objD;
        Object obj2;
        v6g1 v6g1Var2;
        List list2;
        vto vtoVar2;
        String str2;
        String str3 = str;
        w6e0 w6e0Var = (w6e0) this.d;
        xe01 xe01Var = (xe01) w6e0Var.c;
        if (onmVar instanceof boj0) {
            boj0Var = (boj0) onmVar;
            int i = boj0Var.X;
            if ((i & Integer.MIN_VALUE) != 0) {
                boj0Var.X = i - Integer.MIN_VALUE;
            } else {
                boj0Var = new boj0(this, onmVar);
            }
        } else {
            boj0Var = new boj0(this, onmVar);
        }
        Object obj3 = boj0Var.i;
        int i2 = boj0Var.X;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj3);
            Set setM = c7g1Var.m();
            Set set = tzqVar.c;
            ArrayList arrayList2 = new ArrayList(q7h.U(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList2.add(new yp21((Class) it.next()));
            }
            Map mapSingletonMap = Collections.singletonMap(str3, dm61.y0(setM, arrayList2));
            boj0Var.a = str3;
            boj0Var.b = c7g1Var;
            boj0Var.c = tzqVar;
            boj0Var.X = 1;
            Object objD2 = w6e0Var.d(mapSingletonMap, boj0Var);
            if (objD2 != d9nVar) {
                obj = objD2;
                tzqVar2 = tzqVar;
                c7g1Var2 = c7g1Var;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            tzq tzqVar4 = boj0Var.c;
            c7g1Var2 = boj0Var.b;
            String str4 = boj0Var.a;
            hm5.M(obj3);
            obj = obj3;
            tzqVar2 = tzqVar4;
            str3 = str4;
        } else {
            if (i2 == 2) {
                vto vtoVar3 = boj0Var.g;
                v6g1 v6g1Var3 = boj0Var.f;
                List list3 = boj0Var.e;
                ioj0Var = boj0Var.d;
                tzqVar3 = boj0Var.c;
                c7g1Var3 = boj0Var.b;
                String str5 = boj0Var.a;
                hm5.M(obj3);
                list = list3;
                v6g1Var = v6g1Var3;
                vtoVar = vtoVar3;
                str3 = str5;
                if (obj3 == null) {
                    list = arrayList;
                    bhn0.d();
                    return null;
                }
                list = arrayList;
                objInvoke = tzqVar3.d.invoke(ioj0Var);
                boj0Var.a = str3;
                boj0Var.b = null;
                boj0Var.c = null;
                boj0Var.d = null;
                boj0Var.e = list;
                boj0Var.f = v6g1Var;
                boj0Var.g = vtoVar;
                boj0Var.h = objInvoke;
                boj0Var.X = 3;
                objD = c7g1Var3.d(str3, ioj0Var, boj0Var);
                if (objD != d9nVar) {
                    obj2 = objInvoke;
                    v6g1Var2 = v6g1Var;
                    obj3 = objD;
                    list2 = list;
                    vtoVar2 = vtoVar;
                    str2 = str3;
                }
                return d9nVar;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = boj0Var.h;
            vto vtoVar4 = boj0Var.g;
            v6g1 v6g1Var4 = boj0Var.f;
            List list4 = boj0Var.e;
            String str6 = boj0Var.a;
            hm5.M(obj3);
            obj2 = obj4;
            v6g1Var2 = v6g1Var4;
            list2 = list4;
            vtoVar2 = vtoVar4;
            str2 = str6;
        }
        return new wto(str2, list2, vtoVar2, (tto) obj3, obj2, v6g1Var2);
        int iOrdinal = ((wkj0) obj).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            Map map = (Map) ((ioj0) xe01Var.a.getValue()).a.get(str3);
            if (map == null || (collectionValues = map.values()) == null) {
                iOException = new IOException();
            } else {
                Collection<foj0> collection = collectionValues;
                if (collection.isEmpty()) {
                    iOException = new IOException();
                } else {
                    for (foj0 foj0Var : collection) {
                        if ((foj0Var instanceof foj0) && foj0Var.a == 2) {
                            iOException = new MetadataNotFoundException();
                        }
                    }
                    iOException = new IOException();
                }
            }
            return new m231(iOException);
        }
        ioj0Var = (ioj0) xe01Var.a.getValue();
        mmr0 mmr0VarN = c7g1Var2.n(str3, ioj0Var);
        Iterable<uto> iterable = (Iterable) mmr0VarN.b;
        arrayList = new ArrayList(q7h.U(iterable, 10));
        for (uto utoVar : iterable) {
            arrayList.add(new uto(utoVar.a, utoVar.b));
        }
        v6g1 v6g1Var5 = new v6g1(c7g1Var2.o(str3, ioj0Var), c7g1Var2.k(str3, ioj0Var), c7g1Var2.p(str3, ioj0Var), c7g1Var2.q(str3, ioj0Var));
        vto vtoVar5 = (vto) mmr0VarN.a;
        boj0Var.a = str3;
        boj0Var.b = c7g1Var2;
        boj0Var.c = tzqVar2;
        boj0Var.d = ioj0Var;
        boj0Var.e = arrayList;
        boj0Var.f = v6g1Var5;
        boj0Var.g = vtoVar5;
        boj0Var.X = 2;
        Object objE = c7g1Var2.e(str3, ioj0Var, boj0Var);
        if (objE != d9nVar) {
            tzqVar3 = tzqVar2;
            obj3 = objE;
            c7g1Var3 = c7g1Var2;
            vtoVar = vtoVar5;
            v6g1Var = v6g1Var5;
            if (obj3 == null) {
                list = arrayList;
                bhn0.d();
                return null;
            }
            list = arrayList;
            objInvoke = tzqVar3.d.invoke(ioj0Var);
            boj0Var.a = str3;
            boj0Var.b = null;
            boj0Var.c = null;
            boj0Var.d = null;
            boj0Var.e = list;
            boj0Var.f = v6g1Var;
            boj0Var.g = vtoVar;
            boj0Var.h = objInvoke;
            boj0Var.X = 3;
            objD = c7g1Var3.d(str3, ioj0Var, boj0Var);
            if (objD != d9nVar) {
                obj2 = objInvoke;
                v6g1Var2 = v6g1Var;
                obj3 = objD;
                list2 = list;
                vtoVar2 = vtoVar;
                str2 = str3;
                return new wto(str2, list2, vtoVar2, (tto) obj3, obj2, v6g1Var2);
            }
        }
        return d9nVar;
    }

    public Bundle serialize() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (Bundle) ((Function0) obj).invoke();
            case 1:
                return (Bundle) ((fe81) obj).b;
            default:
                return ((m6e0) obj).serialize();
        }
    }

    public void start() {
        switch (this.a) {
            case 0:
                k241 k241Var = (k241) this.b;
                k241Var.a();
                k241Var.b.g((z11) this.e);
                break;
            case 1:
                k241 k241Var2 = (k241) this.b;
                k241Var2.a();
                k241Var2.b.g((z11) this.e);
                break;
            default:
                k241 k241Var3 = (k241) this.b;
                k241Var3.a();
                k241Var3.b.g((z11) this.e);
                break;
        }
    }

    public void stop() {
        byte b = this.a;
        l3r l3rVar = l3r.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                k241 k241Var = (k241) this.b;
                k241Var.b.k((z11) this.e);
                ((kdn0) obj).m(l3rVar);
                k241Var.b();
                break;
            case 1:
                k241 k241Var2 = (k241) this.b;
                k241Var2.b.k((z11) this.e);
                ((kdn0) obj).m(l3rVar);
                k241Var2.b();
                break;
            default:
                k241 k241Var3 = (k241) this.b;
                k241Var3.b.k((z11) this.e);
                k241Var3.b();
                ((kdn0) obj).m(l3rVar);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object t(String str, uzq uzqVar, onm onmVar) {
        coj0 coj0Var;
        uny unyVar = (uny) this.e;
        if (onmVar instanceof coj0) {
            coj0Var = (coj0) onmVar;
            int i = coj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                coj0Var.c = i - Integer.MIN_VALUE;
            } else {
                coj0Var = new coj0(this, onmVar);
            }
        } else {
            coj0Var = new coj0(this, onmVar);
        }
        Object obj = coj0Var.a;
        int i2 = coj0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            if (i2 == 2) {
                hm5.M(obj);
                return ((e331) obj).a;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        Set set = s4b1.f;
        boolean zH = uic.h(str, new blc0[]{blc0.Pg, blc0.ld, blc0.Qg, blc0.Rg, blc0.Vg, blc0.z6});
        d9n d9nVar = d9n.a;
        if (zH) {
            coj0Var.c = 1;
            Object objY = unyVar.y(str, uzqVar, coj0Var);
            if (objY != d9nVar) {
                return objY;
            }
        } else {
            coj0Var.c = 2;
            Object objR = r(str, uzqVar, coj0Var);
            if (objR != d9nVar) {
                return objR;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[LOOP:0: B:30:0x0090->B:35:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8 A[EDGE_INSN: B:57:0x00a8->B:37:0x00a8 BREAK  A[LOOP:0: B:30:0x0090->B:35:0x00a4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object u(Set set, onm onmVar) {
        fhf0 fhf0Var;
        String str;
        s2g1 s2g1Var;
        a9h a9hVar;
        fef0 fef0Var;
        long j;
        LinkedHashMap linkedHashMap;
        List list;
        List list2;
        m7 m7VarB;
        Iterator it;
        int i;
        int i2;
        int iL;
        int i3;
        String strM;
        int i4;
        String strM2;
        if (onmVar instanceof fhf0) {
            fhf0Var = (fhf0) onmVar;
            int i5 = fhf0Var.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fhf0Var.d = i5 - Integer.MIN_VALUE;
            } else {
                fhf0Var = new fhf0(this, onmVar);
            }
        } else {
            fhf0Var = new fhf0(this, onmVar);
        }
        Object objN = fhf0Var.b;
        int i6 = fhf0Var.d;
        d9n d9nVar = d9n.a;
        if (i6 == 0) {
            hm5.M(objN);
            v1k v1kVar = (v1k) this.e;
            fhf0Var.d = 1;
            objN = v1kVar.n(set, fhf0Var);
            if (objN != d9nVar) {
            }
            return d9nVar;
        }
        if (i6 == 1) {
            hm5.M(objN);
        } else {
            if (i6 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s2g1Var = fhf0Var.a;
            hm5.M(objN);
        }
        a9hVar = (a9h) objN;
        fef0Var = a9hVar.a;
        j = s2g1Var.e;
        linkedHashMap = new LinkedHashMap();
        list = fef0Var.a;
        list2 = fef0Var.a;
        if (!list.isEmpty()) {
            it = list2.iterator();
            i = 0;
            i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((aef0) it.next()).a > j) {
                    break;
                }
                i2++;
            }
            iL = p7h.L(list2);
            if (i2 == -1) {
                i = iL;
            } else {
                i3 = i2 - 1;
                if (i3 >= 0) {
                    i = i3;
                }
            }
            strM = m(i, a9hVar);
            if (strM != null) {
                linkedHashMap.put(String.valueOf(i), strM);
                i4 = i + 1;
                strM2 = m(i4, a9hVar);
                if (strM2 != null && !strM.equals(strM2)) {
                    linkedHashMap.put(String.valueOf(i4), strM2);
                }
            }
        }
        m7VarB = mqo1.B(linkedHashMap);
        if (!m7VarB.isEmpty()) {
            ay61 ay61Var = new ay61(s2g1Var.a, s2g1Var.b, s2g1Var.c, s2g1Var.d, (cqs0) m7VarB, b5p1.h(a9hVar.b), fef0Var.f, fef0Var.e, fef0Var.b, (c380) null, (gy71) null, s2g1Var.g, 3072);
            long j2 = s2g1Var.e;
            j7s j7sVar = (j7s) this.c;
            j7sVar.c = ay61Var;
            j7sVar.d = ((Context) this.d).getString(2131963361);
            j7sVar.e = Long.valueOf(j2);
            return Collections.singletonList(j7sVar.b());
        }
        return z6x.a;
        s2g1 s2g1Var2 = (s2g1) objN;
        if (s2g1Var2.f && (str = s2g1Var2.g) != null) {
            Single singleD = ((lnf0) this.b).d(s2g1Var2.d, str, dhf0.SHARE_CARD, (String) null);
            fhf0Var.a = s2g1Var2;
            fhf0Var.d = 2;
            Object objJ = fc11.j(singleD, fhf0Var);
            if (objJ != d9nVar) {
                s2g1Var = s2g1Var2;
                objN = objJ;
                a9hVar = (a9h) objN;
                fef0Var = a9hVar.a;
                j = s2g1Var.e;
                linkedHashMap = new LinkedHashMap();
                list = fef0Var.a;
                list2 = fef0Var.a;
                if (!list.isEmpty()) {
                    it = list2.iterator();
                    i = 0;
                    i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (((aef0) it.next()).a > j) {
                            break;
                            break;
                        }
                        i2++;
                    }
                    iL = p7h.L(list2);
                    if (i2 == -1) {
                        i = iL;
                    } else {
                        i3 = i2 - 1;
                        if (i3 >= 0) {
                            i = i3;
                        }
                    }
                    strM = m(i, a9hVar);
                    if (strM != null) {
                        linkedHashMap.put(String.valueOf(i), strM);
                        i4 = i + 1;
                        strM2 = m(i4, a9hVar);
                        if (strM2 != null) {
                            linkedHashMap.put(String.valueOf(i4), strM2);
                        }
                    }
                }
                m7VarB = mqo1.B(linkedHashMap);
                if (!m7VarB.isEmpty()) {
                    ay61 ay61Var2 = new ay61(s2g1Var.a, s2g1Var.b, s2g1Var.c, s2g1Var.d, (cqs0) m7VarB, b5p1.h(a9hVar.b), fef0Var.f, fef0Var.e, fef0Var.b, (c380) null, (gy71) null, s2g1Var.g, 3072);
                    long j3 = s2g1Var.e;
                    j7s j7sVar2 = (j7s) this.c;
                    j7sVar2.c = ay61Var2;
                    j7sVar2.d = ((Context) this.d).getString(2131963361);
                    j7sVar2.e = Long.valueOf(j3);
                    return Collections.singletonList(j7sVar2.b());
                }
            }
            return d9nVar;
        }
        return z6x.a;
    }

    public /* synthetic */ w6e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj3;
        this.e = obj4;
        this.c = obj5;
    }

    public w6e0(Function0 function0, Function0 function1) {
        this.a = (byte) 0;
        this.d = function1;
        this.b = (k241) function0.invoke();
        this.e = new z11(this, (byte) 26);
        this.c = new kdn0(l3r.a);
    }

    public w6e0(q1n0 q1n0Var, x7e0 x7e0Var, Bundle bundle) {
        this.a = (byte) 2;
        m6e0 m6e0VarG = f4p1.g(x7e0Var);
        this.d = m6e0VarG;
        k241 k241VarA = q1n0Var.a(m6e0VarG);
        if (bundle != null) {
            m6e0VarG.a(bundle);
        }
        this.b = k241VarA;
        this.c = new kdn0(l3r.a);
        this.e = new z11(this, (byte) 28);
    }

    public w6e0(kko kkoVar, n0g0 n0g0Var, Function0 function0, klv0 klv0Var) {
        this.a = (byte) 22;
        this.b = kkoVar;
        this.e = n0g0Var;
        this.d = function0;
        this.c = klv0Var;
    }

    public w6e0(blp blpVar, ksk0 ksk0Var) {
        this.a = (byte) 7;
        this.d = blpVar;
        this.b = ksk0Var;
        this.e = new idd1(new o0f0(this, (byte) 0));
        this.c = new idd1(new o0f0(this, (byte) 1));
    }

    public w6e0(dlp dlpVar, ksk0 ksk0Var) {
        this.a = (byte) 6;
        this.d = dlpVar;
        this.b = ksk0Var;
        this.e = new idd1(new mze0(this, (byte) 1));
        this.c = new idd1(new mze0(this, (byte) 0));
    }

    public /* synthetic */ w6e0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    public w6e0(njj0 njj0Var) {
        this.a = (byte) 27;
        this.d = njj0Var;
        ioj0 ioj0Var = new ioj0();
        this.b = ioj0Var;
        bpb1 bpb1VarB = gio1.b(ioj0Var);
        this.e = bpb1VarB;
        this.c = d5p1.h(bpb1VarB);
    }

    public w6e0(MessageInputView messageInputView, EncoreButton encoreButton, EditText editText, EncoreButton encoreButton2, EncoreButton encoreButton3) {
        this.a = (byte) 26;
        this.d = encoreButton;
        this.b = editText;
        this.e = encoreButton2;
        this.c = encoreButton3;
    }

    public w6e0(fe81 fe81Var, fe81 fe81Var2) {
        this.a = (byte) 1;
        this.d = fe81Var2;
        this.b = (k241) ((r961) fe81Var.b).b;
        this.e = new z11(this, (byte) 27);
        this.c = new kdn0(l3r.a);
    }

    public w6e0(Context context, Uri uri) {
        this.a = (byte) 16;
        yo00 yo00VarA = new bo00(context).a();
        this.d = yo00VarA;
        this.b = cgh0.a;
        egh0 egh0Var = new egh0(this, (byte) 0);
        this.c = egh0Var;
        yo00VarA.m.a(egh0Var);
        yo00VarA.Q(yoh0.c(uri));
        yo00VarA.setRepeatMode(1);
        yo00VarA.M(false);
        yo00VarA.e();
    }

    public w6e0(h2i0 h2i0Var, ixh0 ixh0Var, fzh0 fzh0Var, eh70 eh70Var) {
        this.a = (byte) 19;
        this.c = h2i0Var;
        this.d = ixh0Var;
        this.b = fzh0Var;
        this.e = eh70Var;
    }
}
