package p;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class f0i extends Activity implements iac0, dpa0 {
    public final tac0 a = new tac0(this, true);

    public int a() {
        return getRequestedOrientation();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (wqn1.p(decorView, keyEvent)) {
            return true;
        }
        return wqn1.q(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (wqn1.p(getWindow().getDecorView(), keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = bl21.b;
        zk21.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.a.i(w8c0.c);
        super.onSaveInstanceState(bundle);
    }

    public void r(int i) {
        setRequestedOrientation(i);
    }

    @Override // p.dpa0
    public final boolean w(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
