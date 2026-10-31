package p;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class g0i extends f0i implements sck1, ot50, qe41, s1q0, vh0, ch0, j2q0, taq0, r5q0, q5q0, s5q0, psi0, et30 {
    public static final /* synthetic */ int T0 = 0;
    public final CopyOnWriteArrayList N0;
    public final CopyOnWriteArrayList O0;
    public boolean P0;
    public boolean Q0;
    public final idd1 R0;
    public final idd1 S0;
    public final CopyOnWriteArrayList X;
    public final CopyOnWriteArrayList Y;
    public final CopyOnWriteArrayList Z;
    public final dbm b;
    public final kqi0 c;
    public final nt21 d;
    public rck1 e;
    public final b0i f;
    public final idd1 g;
    public final AtomicInteger h;
    public final c0i i;
    public final CopyOnWriteArrayList t;

    public g0i() {
        byte b = 0;
        dbm dbmVar = new dbm((byte) 0);
        this.b = dbmVar;
        this.c = new kqi0(new n6(this, (byte) 2));
        nt21 nt21VarO = obg1.o(this);
        this.d = nt21VarO;
        this.f = new b0i(this);
        this.g = new idd1(new d4e(this, (byte) 4));
        this.h = new AtomicInteger();
        this.i = new c0i(this);
        this.t = new CopyOnWriteArrayList();
        this.X = new CopyOnWriteArrayList();
        this.Y = new CopyOnWriteArrayList();
        this.Z = new CopyOnWriteArrayList();
        this.N0 = new CopyOnWriteArrayList();
        this.O0 = new CopyOnWriteArrayList();
        tac0 tac0Var = this.a;
        if (tac0Var == null) {
            eg.m("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        tac0Var.a(new wzh(this, b));
        this.a.a(new wzh(this, (byte) 1));
        this.a.a(new ek2(this, (byte) 2));
        nt21VarO.m();
        a6o1.k(this);
        nt21VarO.j().c("android:support:activity-result", new xzh(this, b));
        dbmVar.a(new n2q0() { // from class: p.yzh
            @Override // p.n2q0
            public final void a() {
                g0i g0iVar = this.a;
                Bundle bundleA = g0iVar.d.j().a("android:support:activity-result");
                if (bundleA != null) {
                    g0iVar.i.e(bundleA);
                }
            }
        });
        this.R0 = new idd1(new d0i(this, (byte) 0));
        this.S0 = new idd1(new d0i(this, (byte) 2));
    }

    @Override // p.s5q0
    public final void C(dkl dklVar) {
        this.N0.add(dklVar);
    }

    @Override // p.psi0
    public final void G(qti0 qti0Var) {
        this.c.a(qti0Var);
    }

    @Override // p.s1q0
    public final r1q0 J() {
        return (r1q0) this.S0.getValue();
    }

    @Override // p.ot50
    public final eck1 N() {
        return (eck1) this.R0.getValue();
    }

    @Override // p.ot50
    public final wcn0 O() {
        wcn0 wcn0Var = new wcn0(0);
        if (getApplication() != null) {
            wcn0Var.a(dck1.d, getApplication());
        }
        wcn0Var.a(a6o1.a, this);
        wcn0Var.a(a6o1.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            wcn0Var.a(a6o1.c, extras);
        }
        return wcn0Var;
    }

    @Override // p.j2q0
    public final void T(dkl dklVar) {
        this.t.remove(dklVar);
    }

    @Override // p.q5q0
    public final void V(dkl dklVar) {
        this.Z.add(dklVar);
    }

    @Override // p.q5q0
    public final void W(dkl dklVar) {
        this.Z.remove(dklVar);
    }

    @Override // p.taq0
    public final void X(dkl dklVar) {
        this.X.remove(dklVar);
    }

    @Override // p.taq0
    public final void Y(dkl dklVar) {
        this.X.add(dklVar);
    }

    @Override // p.j2q0
    public final void Z(dkl dklVar) {
        this.t.add(dklVar);
    }

    @Override // p.ch0
    public final kh0 a0(bh0 bh0Var, o1p1 o1p1Var) {
        return this.i.g("activity_rq#" + this.h.getAndIncrement(), this, o1p1Var, bh0Var);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d0();
        this.f.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public final void d0() {
        x9p1.p(getWindow().getDecorView(), this);
        lap1.o(getWindow().getDecorView(), this);
        hm5.J(getWindow().getDecorView(), this);
        fap1.p(getWindow().getDecorView(), this);
        v9p1.O(getWindow().getDecorView(), this);
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        return this.a;
    }

    @Override // p.psi0
    public final void l(qti0 qti0Var) {
        this.c.D(qti0Var);
    }

    @Override // p.vh0
    public final sh0 m() {
        return this.i;
    }

    @Override // p.s5q0
    public final void n(dkl dklVar) {
        this.N0.remove(dklVar);
    }

    @Override // p.sck1
    public final rck1 o() {
        if (getApplication() == null) {
            eg.m("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        rck1 rck1Var = this.e;
        if (rck1Var == null) {
            a0i a0iVar = (a0i) getLastNonConfigurationInstance();
            if (a0iVar != null) {
                this.e = a0iVar.a;
            }
            rck1Var = this.e;
            if (rck1Var == null) {
                rck1Var = new rck1();
                this.e = rck1Var;
            }
        }
        rck1Var.getClass();
        return rck1Var;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.i.c(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        J().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            ((dkl) it.next()).accept(configuration);
        }
    }

    @Override // p.f0i, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.n(bundle);
        this.b.e(this);
        super.onCreate(bundle);
        int i = bl21.b;
        zk21.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.c.y(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.c.A(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.P0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.P0 = false;
            Iterator it = this.Z.iterator();
            while (it.hasNext()) {
                ((dkl) it.next()).accept(new ewm0(0, z));
            }
        } catch (Throwable th) {
            this.P0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.Y.iterator();
        while (it.hasNext()) {
            ((dkl) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.c.z(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.Q0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.Q0 = false;
            Iterator it = this.N0.iterator();
            while (it.hasNext()) {
                ((dkl) it.next()).accept(new xxs0(0, z));
            }
        } catch (Throwable th) {
            this.Q0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.c.B(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.i.c(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        a0i a0iVar;
        rck1 rck1Var = this.e;
        if (rck1Var == null && (a0iVar = (a0i) getLastNonConfigurationInstance()) != null) {
            rck1Var = a0iVar.a;
        }
        if (rck1Var == null) {
            return null;
        }
        a0i a0iVar2 = new a0i();
        a0iVar2.a = rck1Var;
        return a0iVar2;
    }

    @Override // p.f0i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        tac0 tac0Var = this.a;
        if (tac0Var != null) {
            tac0Var.i(w8c0.c);
        }
        super.onSaveInstanceState(bundle);
        this.d.o(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            ((dkl) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.O0.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // p.qe41
    public final oe41 p() {
        return this.d.j();
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (mif1.g()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ((dt30) this.g.getValue()).b();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        d0();
        this.f.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        d0();
        this.f.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d0();
        this.f.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.P0) {
            return;
        }
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((dkl) it.next()).accept(new ewm0(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.Q0) {
            return;
        }
        Iterator it = this.N0.iterator();
        while (it.hasNext()) {
            ((dkl) it.next()).accept(new xxs0(z));
        }
    }
}
