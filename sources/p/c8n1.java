package p;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c8n1 implements DialogInterface.OnCancelListener {
    public final bac0 a;
    public volatile boolean b;
    public final AtomicReference c;
    public final jim0 d;
    public final lz40 e;
    public final d46 f;
    public final pz40 g;

    public c8n1(bac0 bac0Var, pz40 pz40Var) {
        lz40 lz40Var = lz40.e;
        this.a = bac0Var;
        this.c = new AtomicReference(null);
        this.d = new jim0(Looper.getMainLooper(), (byte) 2);
        this.e = lz40Var;
        this.f = new d46(0);
        this.g = pz40Var;
        bac0Var.a(this);
    }

    public final Activity a() {
        Activity activityH = this.a.H();
        zod.s(activityH);
        return activityH;
    }

    public final void b(Bundle bundle) {
        if (bundle != null) {
            this.c.set(bundle.getBoolean("resolving_error", false) ? new n9n1(new lal(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"), null), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void c() {
        this.b = false;
        pz40 pz40Var = this.g;
        pz40Var.getClass();
        synchronized (pz40.R0) {
            try {
                if (pz40Var.X == this) {
                    pz40Var.X = null;
                    pz40Var.Y.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f.isEmpty()) {
            return;
        }
        this.g.e(this);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        lal lalVar = new lal(13, null, null);
        AtomicReference atomicReference = this.c;
        n9n1 n9n1Var = (n9n1) atomicReference.get();
        int i = n9n1Var == null ? -1 : n9n1Var.a;
        atomicReference.set(null);
        this.g.h(lalVar, i);
    }
}
