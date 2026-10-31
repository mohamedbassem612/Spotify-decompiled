package p;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.connectivity.trafficsetupimpl.NativeTrafficSetupImpl;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import com.spotify.settings.settingsimpl.NativeSettings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xfz0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public xfz0(w751 w751Var, rw41 rw41Var) {
        this.a = (byte) 8;
        this.b = rw41Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r4.toString();
        p.j2h1.q("SequentialExecutor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
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
            java.lang.Object r2 = r10.b     // Catch: java.lang.Throwable -> L4f
            p.g661 r2 = (p.g661) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.a     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L20
            p.g661 r0 = (p.g661) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L44
        L20:
            r10 = move-exception
            goto L5a
        L22:
            long r6 = r0.e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.e = r6     // Catch: java.lang.Throwable -> L20
            r0.d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.b     // Catch: java.lang.Throwable -> L20
            p.g661 r4 = (p.g661) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> L20
            p.g661 r10 = (p.g661) r10     // Catch: java.lang.Throwable -> L20
            r10.d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r10 = move-exception
            goto L5c
        L51:
            java.lang.String r2 = "SequentialExecutor"
            r4.toString()     // Catch: java.lang.Throwable -> L4f
            p.j2h1.q(r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L5a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L4f
        L5c:
            if (r1 == 0) goto L65
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L65:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xfz0.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout labelContainer;
        View viewFindViewById;
        lik1 lik1Var;
        a32 a32Var = null;
        switch (this.a) {
            case 0:
                agz0 agz0Var = (agz0) ((kl1) this.b).b;
                if (agz0Var == null || (labelContainer = agz0Var.getLabelContainer()) == null) {
                    return;
                }
                labelContainer.setVisibility(4);
                return;
            case 1:
                ((roz0) this.b).y();
                return;
            case 2:
                RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.b;
                recyclerViewFastScroller.t = false;
                recyclerViewFastScroller.b();
                return;
            case 3:
                ((ggx0) this.b).invoke();
                return;
            case 4:
                ((ox11) this.b).d.u0(0);
                return;
            case 5:
                ik21 ik21Var = (ik21) this.b;
                ik21Var.g.getLifecycle().a(new y1s(ik21Var, (byte) 3));
                return;
            case 6:
                ((ts31) this.b).e();
                return;
            case 7:
                mt41 mt41Var = (mt41) this.b;
                eyh0 eyh0Var = mt41Var.a;
                bn70 bn70VarA = ((war0) ((idd1) eyh0Var.c).getValue()).a();
                Integer num = (Integer) mt41Var.d.get((bn70VarA == null || (lik1Var = bn70VarA.b) == null) ? null : lik1Var.a);
                if (num != null && (viewFindViewById = ((CoordinatorLayout) eyh0Var.b).findViewById(num.intValue())) != null) {
                    a32Var = new a32(viewFindViewById);
                }
                mt41Var.f.c(mt41.h[1], mt41Var, a32Var);
                return;
            case 8:
                rw41 rw41Var = (rw41) this.b;
                rw41Var.f = true;
                if (rw41Var.d.V0) {
                    rw41Var.g = true;
                    return;
                }
                return;
            case 9:
                SearchFragment searchFragment = (SearchFragment) this.b;
                if (searchFragment.Y1) {
                    searchFragment.Y1 = false;
                    RecyclerView recyclerView = searchFragment.Q1;
                    if (recyclerView != null) {
                        recyclerView.u0(0);
                        return;
                    } else {
                        u890.C("searchRecyclerView");
                        throw null;
                    }
                }
                return;
            case 10:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((g661) this.b).a) {
                        ((g661) this.b).d = 1;
                        throw e;
                    }
                }
            case 11:
                ((x861) this.b).c.p("onPostExecuteInner");
                return;
            case 12:
                ph61 ph61Var = (ph61) this.b;
                ph61Var.a().prepareForShutdown();
                ph61Var.a().destroy();
                return;
            case 13:
                vl61 vl61Var = (vl61) this.b;
                vl61Var.c.d(vl61Var.f);
                return;
            case 14:
                NativeSettings nativeSettings = ((eu61) this.b).b;
                if (nativeSettings != null) {
                    nativeSettings.destroy();
                    return;
                } else {
                    u890.C("settings");
                    throw null;
                }
            case 15:
                tzx tzxVar = (tzx) this.b;
                dg30 dg30Var = (dg30) tzxVar.c;
                if (((f0i) dg30Var).a.i.a(w8c0.e)) {
                    ((dto0) tzxVar.d).c(dg30Var, hxy0.ALBUM_PRERELEASE_PRESAVE_BUTTON, new uwy0(dg30Var.getString(2131960373), dg30Var.getString(2131960372), dg30Var.getString(2131960371), dg30Var.getString(2131960370)), rz71.Z0);
                    return;
                }
                return;
            case 16:
                yon yonVar = (yon) this.b;
                jjz jjzVar = (jjz) yonVar.b;
                Context context = (Context) yonVar.c;
                jjzVar.a(new xiz(new ejz(context.getString(2131961201)), new yiz(context.getString(2131961200)), new ajz(context.getString(2131961199))), da71.c1, new qv61(yonVar, (byte) 25));
                return;
            case 17:
                ((v8v) ((ua91) this.b).b).c();
                return;
            case 18:
                x5b1 x5b1Var = (x5b1) this.b;
                x5b1Var.o = new imo(0, 0);
                x5b1Var.m = z6x.a;
                tv81 tv81Var = new tv81();
                tv81Var.a = x5b1.q;
                x5b1Var.l = new uv81(tv81Var);
                x5b1Var.q1();
                return;
            case 19:
                ((xye1) ((t6b1) this.b).e.b).a(2131953091, new Object[0]);
                return;
            case 20:
                ((StaggeredGridLayoutManager) this.b).U0();
                return;
            case 21:
                fib1 fib1Var = (fib1) this.b;
                if (!fib1Var.q0() || ((zf30) fib1Var).Y) {
                    return;
                }
                fib1Var.Y0();
                return;
            case 22:
                uyb1 uyb1Var = (uyb1) this.b;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(uyb1Var, "translationY", uyb1Var.getTranslationY(), 0.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimatorOfFloat.start();
                return;
            case 23:
                r0d1 r0d1Var = (r0d1) this.b;
                ((f0i) r0d1Var.e).a.a(r0d1Var);
                return;
            case 24:
                TextView textView = (TextView) this.b;
                int measuredHeight = ((textView.getMeasuredHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()) / textView.getLineHeight();
                textView.setMaxLines(measuredHeight <= 3 ? measuredHeight : 3);
                textView.setText(textView.getText());
                return;
            case 25:
                ((Toolbar) this.b).t();
                return;
            case 26:
                a2f1 a2f1Var = (a2f1) this.b;
                Window.Callback callback = a2f1Var.d;
                msi0 msi0VarO0 = a2f1Var.o0();
                msi0 msi0Var = msi0VarO0 instanceof msi0 ? msi0VarO0 : null;
                if (msi0Var != null) {
                    msi0Var.A();
                }
                try {
                    msi0VarO0.clear();
                    if (!callback.onCreatePanelMenu(0, msi0VarO0) || !callback.onPreparePanel(0, null, msi0VarO0)) {
                        msi0VarO0.clear();
                    }
                    if (msi0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (msi0Var != null) {
                        msi0Var.z();
                    }
                }
                break;
            case 27:
                mx40 mx40Var = (mx40) ((a1s) this.b).b;
                lx40 lx40Var = mx40Var.b;
                Context context2 = mx40Var.a.getView().getContext();
                Menu msi0Var2 = new msi0(context2);
                msi0Var2.A();
                try {
                    msi0Var2.clear();
                    if (!((pql1) lx40Var).a.onCreatePanelMenu(0, msi0Var2) || !lx40Var.onPreparePanel(0, (View) null, msi0Var2)) {
                        msi0Var2.clear();
                        break;
                    }
                    return;
                } finally {
                    msi0Var2.z();
                    mx40Var.a(context2, msi0Var2);
                }
            case 28:
                ((vm1) this.b).invoke();
                return;
            default:
                NativeTrafficSetupImpl nativeTrafficSetupImpl = ((e4g1) this.b).b;
                if (nativeTrafficSetupImpl != null) {
                    nativeTrafficSetupImpl.destroy();
                    return;
                } else {
                    u890.C("nativeTrafficSetup");
                    throw null;
                }
        }
    }

    public /* synthetic */ xfz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
