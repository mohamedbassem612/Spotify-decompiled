package p;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class t3b1 extends dac0 implements vkg, lir0, lt50 {
    public jgu b1;
    public tuk c1;
    public final tkg d1 = new tkg();
    public Bundle e1;

    @Override // p.vkg
    public void S(xnh1 xnh1Var) {
        this.d1.a(xnh1Var);
    }

    @Override // p.vkg
    public void U(n6r0 n6r0Var, qir0 qir0Var) {
        this.d1.U(n6r0Var, qir0Var);
    }

    public mir0 c() {
        return nhc.r();
    }

    @Override // p.lt50
    public final jgu f() {
        jgu jguVar = this.b1;
        if (jguVar != null) {
            return jguVar;
        }
        u890.C("androidInjector");
        throw null;
    }

    @Override // p.vkg
    public void h(n6r0 n6r0Var, qir0 qir0Var) {
        this.d1.h(n6r0Var, qir0Var);
    }

    @Override // p.vkg
    public zia j() {
        return this.d1.a;
    }

    public rg30 l0() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m0() {
        j1e1.q(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        m0();
        Bundle bundleN0 = n0(bundle);
        this.e1 = bundleN0;
        rg30 rg30VarL0 = l0();
        if (rg30VarL0 != null) {
            e0().B = rg30VarL0;
        }
        super.onCreate(bundleN0);
        if (bundleN0 != null) {
            bundleN0.setClassLoader(getClassLoader());
        }
        Intent intent = getIntent();
        if (intent != null) {
            intent.setExtrasClassLoader(getClassLoader());
        }
        setVolumeControlStream(3);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        tuk tukVar = this.c1;
        if (tukVar == null) {
            u890.C("spotifyDaggerActivityPluginPoint");
            throw null;
        }
        Iterator it = tukVar.a().iterator();
        while (it.hasNext()) {
            if (((u3b1) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super/*p.gj5*/.onKeyDown(i, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(Intent intent) {
        super/*p.g0i*/.onNewIntent(intent);
        intent.setExtrasClassLoader(getClassLoader());
    }

    @Override // p.vkg
    public void y(e6r0 e6r0Var) {
        this.d1.y(e6r0Var);
    }

    public Bundle n0(Bundle bundle) {
        return bundle;
    }
}
