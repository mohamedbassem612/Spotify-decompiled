package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class dac0 extends gj5 implements l8c0 {
    public final v8c0 a1 = new v8c0();

    public final boolean k(m8c0 m8c0Var) {
        return this.a1.k(m8c0Var);
    }

    @Override // p.dg30, p.g0i, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        v8c0 v8c0Var = this.a1;
        v8c0Var.getClass();
        v8c0Var.a(new n8c0(i, i2, intent));
    }

    @Override // p.dg30, p.g0i, p.f0i, android.app.Activity
    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            super.onCreate(bundle);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            this.c.b(new cac0(this), this);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    @Override // p.gj5, p.dg30, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.a1.a(u8c0.e);
    }

    @Override // p.dg30, android.app.Activity
    public void onPause() {
        super.onPause();
        this.a1.a(u8c0.d);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.a1.a(new t8c0(bundle, (byte) 2));
    }

    @Override // p.dg30, android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                super.onResume();
            } catch (IllegalArgumentException e) {
                try {
                    Field declaredField = Activity.class.getDeclaredField("mCalled");
                    declaredField.setAccessible(true);
                    declaredField.setBoolean(this, true);
                } catch (ReflectiveOperationException unused) {
                    throw e;
                }
            }
        } else {
            super.onResume();
        }
        this.a1.a(u8c0.c);
    }

    @Override // p.g0i, p.f0i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a1.a(new t8c0(bundle, (byte) 1));
    }

    @Override // p.gj5, p.dg30, android.app.Activity
    public void onStart() {
        super.onStart();
        this.a1.a(u8c0.a);
    }

    @Override // p.gj5, p.dg30, android.app.Activity
    public void onStop() {
        super.onStop();
        this.a1.a(u8c0.b);
    }

    public final boolean u(m8c0 m8c0Var) {
        return this.a1.u(m8c0Var);
    }
}
