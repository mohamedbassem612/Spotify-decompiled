package p;

import android.animation.Animator;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.legacyglue.carousel.CarouselLayoutManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jyh0 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public jyh0(c0u0 c0u0Var, m0u0 m0u0Var, long j) {
        this.a = (byte) 7;
        this.b = c0u0Var;
        this.c = m0u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        p.f661.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L58
            p.f661 r2 = (p.f661) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            p.f661 r0 = (p.f661) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L7d
        L22:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            p.f661 r4 = (p.f661) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.c     // Catch: java.lang.Throwable -> L20
            p.f661 r10 = (p.f661) r10     // Catch: java.lang.Throwable -> L20
            r10.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = p.f661.f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L88:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jyh0.a():void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.constraintlayout.widget.Barrier */
    @Override // java.lang.Runnable
    public final void run() throws Barrier {
        StackTraceElement stackTraceElement;
        View view;
        int i = 2;
        Barrier barrierFindViewById = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                p7s p7sVar = ((kyh0) this.b).l;
                if (p7sVar != null) {
                    p7sVar.f((eyh0) null);
                }
                ((kyh0) this.b).l = (p7s) this.c;
                p7s p7sVar2 = (p7s) this.c;
                eyh0 eyh0Var = ((kyh0) this.b).i;
                if (eyh0Var != null) {
                    p7sVar2.f(eyh0Var);
                    return;
                } else {
                    u890.C("mediaSessionCompat");
                    throw null;
                }
            case 1:
                eyh0 eyh0Var2 = ((kyh0) this.b).i;
                if (eyh0Var2 != null) {
                    ((yxh0) eyh0Var2.b).a.setPlaybackToRemote(((ev40) this.c).a());
                    return;
                } else {
                    u890.C("mediaSessionCompat");
                    throw null;
                }
            case 2:
                r4z0 r4z0Var = (r4z0) this.c;
                List list = r4z0Var.c;
                String str = "mediaSessionCompat";
                kyh0 kyh0Var = (kyh0) this.b;
                if (kyh0Var.m()) {
                    boolean zIsEmpty = list.isEmpty();
                    eyh0 eyh0Var3 = kyh0Var.i;
                    if (zIsEmpty) {
                        if (eyh0Var3 == null) {
                            u890.C("mediaSessionCompat");
                            throw null;
                        }
                        eyh0Var3.D(z6x.a);
                        eyh0 eyh0Var4 = kyh0Var.i;
                        if (eyh0Var4 != null) {
                            ((yxh0) eyh0Var4.b).a.setQueueTitle("");
                            return;
                        } else {
                            u890.C("mediaSessionCompat");
                            throw null;
                        }
                    }
                    if (eyh0Var3 == null) {
                        u890.C("mediaSessionCompat");
                        throw null;
                    }
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            Barrier barrier = barrierFindViewById;
                            p7h.T();
                            throw barrier;
                        }
                        j2i0 j2i0Var = (j2i0) next;
                        long j = ((long) i2) + r4z0Var.b;
                        Uri uri = j2i0Var.g;
                        boolean z2 = j2i0Var.s;
                        String str2 = j2i0Var.b;
                        String str3 = j2i0Var.c ? j2i0Var.d : j2i0Var.e;
                        Bundle bundle = new Bundle();
                        Iterator it2 = it;
                        bundle.putLong("android.media.IS_EXPLICIT", j2i0Var.j || z2 ? 1L : 0L);
                        bundle.putLong("com.spotify.music.extra.IS_19_PLUS", z2 ? 1L : 0L);
                        arrayList.add(new MediaSessionCompat.QueueItem((MediaSession.QueueItem) null, new MediaDescriptionCompat(j2i0Var.a, str2, str3, (CharSequence) null, (Bitmap) null, uri, bundle, (Uri) null), j));
                        barrierFindViewById = null;
                        str = str;
                        i2 = i3;
                        it = it2;
                    }
                    String str4 = str;
                    Barrier barrier2 = barrierFindViewById;
                    eyh0Var3.D(arrayList);
                    eyh0 eyh0Var5 = kyh0Var.i;
                    if (eyh0Var5 != null) {
                        ((yxh0) eyh0Var5.b).a.setQueueTitle(r4z0Var.a);
                        return;
                    } else {
                        u890.C(str4);
                        throw barrier2;
                    }
                }
                return;
            case 3:
                Intent intent = (Intent) this.c;
                try {
                    ((yym0) this.b).a.startActivity(intent, null);
                    return;
                } catch (ActivityNotFoundException e) {
                    StackTraceElement[] stackTrace = e.getStackTrace();
                    int length = stackTrace.length + 2;
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
                    int i4 = 0;
                    while (i4 < length) {
                        if (i4 != 0) {
                            stackTraceElement = i4 != 1 ? stackTrace[i4 - 2] : new StackTraceElement("[[ Failed to open uri ↑↑ ]] ", "", "", 0);
                        } else {
                            stackTraceElement = new StackTraceElement(intent.getDataString(), "", "", 0);
                        }
                        stackTraceElementArr[i4] = stackTraceElement;
                        i4++;
                    }
                    e.setStackTrace(stackTraceElementArr);
                    throw e;
                }
            case 4:
                dg30 dg30Var = (dg30) this.b;
                ((f0i) dg30Var).a.a(new it0((drp0) this.c, dg30Var, (byte) 7));
                return;
            case 5:
                ((ConcurrentHashMap) ((ffe1) ((p1f0) this.b).a).c).keySet().removeIf(new l61(((y6r0) this.c).a, (byte) 4));
                return;
            case 6:
                ((EditText) this.b).removeTextChangedListener(((jgg) this.c).b.e);
                return;
            case 7:
                ((c0u0) this.b).h((m0u0) this.c);
                return;
            case 8:
                ((n590) this.b).w((llb1) this.c);
                return;
            case 9:
                ((ohd) this.b).C((qbu0) this.c, rih1.a);
                return;
            case 10:
                ypv0 ypv0Var = (ypv0) this.b;
                String string = ((Uri) this.c).toString();
                int i5 = ypv0.Z1;
                ypv0Var.l1(string);
                return;
            case 11:
                obz0 obz0Var = (obz0) this.b;
                ArrayList arrayList2 = obz0Var.X;
                List list3 = (List) this.c;
                j4u j4uVarP = w0h1.p(new e7v0(arrayList2, list3, (byte) 1));
                obz0Var.X.clear();
                obz0Var.X.addAll(list3);
                j4uVarP.b(obz0Var);
                return;
            case 12:
                ((zf30) ((r001) this.b)).s1.a((h601) this.c);
                return;
            case 13:
                gn01 gn01Var = (gn01) this.b;
                ArrayList arrayListA = gn01Var.a();
                if (arrayListA.remove((String) this.c)) {
                    gn01Var.b(arrayListA);
                    return;
                }
                return;
            case 14:
                ((gx01) this.b).l.onNext(new yw01((String) this.c));
                return;
            case 15:
                ox11 ox11Var = (ox11) this.b;
                idd1 idd1Var = ox11Var.t;
                if (((dtw) idd1Var.getValue()).w.getParent() == null) {
                    k8p1.o(ox11Var.a.findViewById(2131428875), ((dtw) idd1Var.getValue()).w);
                }
                ((dtw) idd1Var.getValue()).f(new rd20(((sx11) this.c).a.b));
                return;
            case 16:
                ((tk21) this.b).b.onNext((sk21) this.c);
                return;
            case 17:
                lm21 lm21Var = (lm21) this.b;
                String string2 = ((Uri) this.c).toString();
                int i6 = lm21.Y1;
                lm21Var.l1(string2);
                return;
            case 18:
                ((ohd) this.c).C((hm00) this.b, rih1.a);
                return;
            case 19:
                SearchFragment searchFragment = (SearchFragment) this.c;
                searchFragment.Y0().a(5);
                searchFragment.Y0().c();
                return;
            case 20:
                try {
                    a();
                    return;
                } catch (Error e2) {
                    synchronized (((f661) this.c).b) {
                        ((f661) this.c).c = 1;
                        throw e2;
                    }
                }
            case 21:
                opa opaVar = (opa) this.b;
                opaVar.a(((qo71) this.c).h);
                smo1.q(opaVar.f);
                return;
            case 22:
                ((Animator) ((n381) this.c).b).start();
                return;
            case 23:
                ((r1a1) this.b).b.onNext((q1a1) this.c);
                return;
            case 24:
                r0i0 r0i0Var = (r0i0) this.b;
                w0i0 w0i0Var = r0i0Var.i;
                int i7 = r0i0Var.a;
                List list4 = r0i0Var.l;
                j2i0 j2i0Var2 = r0i0Var.k;
                r4z0 r4z0VarA = w0i0Var.a();
                x5b1 x5b1Var = (x5b1) this.c;
                x5b1Var.getClass();
                int iE1 = x5b1.E1(r0i0Var);
                if (r4z0VarA.c.size() < 2 && j2i0Var2 == null && iE1 != 1 && iE1 != 4) {
                    n57.s("Empty queue and no active track not compatible with player state " + iE1 + ". PlaybackState: " + r0i0Var);
                    return;
                }
                x5b1Var.m = list4;
                boolean z3 = !x5b1.B1(r4z0VarA, j2i0Var2).isEmpty();
                tv81 tv81Var = new tv81();
                x5b1Var.A1(tv81Var, r4z0VarA, j2i0Var2);
                if (iE1 == 1) {
                    tv81Var.e = x5b1.C1(r0i0Var);
                }
                tv81Var.d = iE1;
                if (i7 == 3) {
                    float f = r0i0Var.c;
                    if (j2i0Var2 != null && j2i0Var2.u) {
                        x5b1.z1(tv81Var, 1.0f);
                    } else if (f > 0.0f) {
                        x5b1.z1(tv81Var, f);
                    }
                }
                x5b1.x1(tv81Var, x5b1Var.o);
                tv81Var.g = r0i0Var.g == 2;
                int iOrdinal = r0i0Var.h.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal == 1) {
                    i = 1;
                } else if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                tv81Var.f = i;
                tv81Var.b = i7 == 3 || i7 == 4;
                tv81Var.c = true;
                tv81Var.a = x5b1.D1(list4, z3);
                tv81Var.A = 0;
                tv81Var.D = Long.valueOf(r0i0Var.b);
                x5b1Var.l = new uv81(tv81Var);
                x5b1Var.q1();
                return;
            case 25:
                dhd1 dhd1Var = (dhd1) this.c;
                int dimensionPixelSize = dhd1Var.e.getResources().getDimensionPixelSize(2131165617);
                ghd1 ghd1Var = dhd1Var.e;
                ViewGroup.LayoutParams layoutParams = ghd1Var.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    return;
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd(dimensionPixelSize);
                ghd1Var.setLayoutParams(layoutParams2);
                return;
            case 26:
                CarouselLayoutManager carouselLayoutManager = ((pkf1) this.b).p2;
                if (carouselLayoutManager == null) {
                    u890.C("layoutManager");
                    throw null;
                }
                hkf1 hkf1Var = (hkf1) this.c;
                if (!hkf1Var.b && !hkf1Var.f) {
                    z = false;
                }
                carouselLayoutManager.X0 = z;
                return;
            case 27:
                neg1 neg1Var = (neg1) this.c;
                View view2 = ((w611) neg1Var).a;
                WeakReference weakReference = neg1Var.d1;
                ViewGroup viewGroup = (ViewGroup) weakReference.get();
                Barrier barrierFindViewById2 = viewGroup != null ? viewGroup.findViewById(2131427919) : null;
                int top = barrierFindViewById2 != null ? barrierFindViewById2.getTop() : 0;
                FrameLayout frameLayout = neg1Var.e1;
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                if (layoutParams3 == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.topMargin = top;
                frameLayout.setLayoutParams(marginLayoutParams);
                dtw dtwVar = neg1Var.i1;
                if (dtwVar != null && (view = dtwVar.w) != null) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    if (layoutParams4 == null) {
                        bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams2.topMargin = top;
                        view.setLayoutParams(marginLayoutParams2);
                    }
                }
                View view3 = neg1Var.f1.w;
                ViewGroup.LayoutParams layoutParams5 = view3.getLayoutParams();
                if (layoutParams5 == null) {
                    bhn0.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    return;
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.topMargin = view2.getContext().getResources().getDimensionPixelSize(2131165900) + top;
                view3.setLayoutParams(layoutParams6);
                ViewGroup viewGroup2 = (ViewGroup) weakReference.get();
                barrierFindViewById = viewGroup2 != null ? viewGroup2.findViewById(2131427918) : null;
                if (barrierFindViewById != null) {
                    if (!barrierFindViewById.isLaidOut() || barrierFindViewById.isLayoutRequested()) {
                        barrierFindViewById.addOnLayoutChangeListener(new meg1(neg1Var, (byte) 0));
                    } else {
                        neg1.J(neg1Var, view2.getHeight() - barrierFindViewById.getTop());
                    }
                }
                if (barrierFindViewById != null) {
                    barrierFindViewById.addOnLayoutChangeListener(new meg1(neg1Var, (byte) 1));
                    return;
                }
                return;
            case 28:
                fyh1 fyh1Var = ((w9i1) this.b).h;
                List list5 = (List) this.c;
                fyh1Var.getClass();
                fyh1.d(list5);
                return;
            default:
                cej1 cej1Var = (cej1) this.b;
                cej1Var.X = false;
                int measuredWidth = ((RecyclerView) this.c).getMeasuredWidth();
                if (measuredWidth <= 0 || measuredWidth == cej1Var.Y) {
                    return;
                }
                cej1Var.Y = measuredWidth;
                kdn0 kdn0Var = cej1Var.f;
                kdn0Var.m(kdn0Var.e());
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 20:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((f661) this.c).c;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jyh0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public jyh0(jgg jggVar, EditText editText) {
        this.a = (byte) 6;
        this.c = jggVar;
        this.b = editText;
    }

    public jyh0(f661 f661Var) {
        this.a = (byte) 20;
        this.c = f661Var;
    }
}
