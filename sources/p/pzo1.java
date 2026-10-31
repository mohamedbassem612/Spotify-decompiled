package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pzo1 implements ServiceConnection {
    public final HashMap a = new HashMap();
    public byte b = 2;
    public boolean c;
    public IBinder d;
    public final rxo1 e;
    public ComponentName f;
    public final /* synthetic */ b3p1 g;

    public pzo1(b3p1 b3p1Var, rxo1 rxo1Var) {
        this.g = b3p1Var;
        this.e = rxo1Var;
    }

    public final lal a(String str, Executor executor) {
        try {
            Intent intentA = dgn1.a(this.g.b, this.e);
            this.b = (byte) 3;
            StrictMode.VmPolicy vmPolicyI = wgo1.I();
            try {
                b3p1 b3p1Var = this.g;
                dbl dblVar = b3p1Var.d;
                Context context = b3p1Var.b;
                rxo1 rxo1Var = this.e;
                boolean zC = dblVar.c(context, str, intentA, this, 4225, executor);
                this.c = zC;
                if (zC) {
                    b3p1Var.c.sendMessageDelayed(b3p1Var.c.obtainMessage(1, rxo1Var), b3p1Var.f);
                    return lal.f;
                }
                this.b = (byte) 2;
                try {
                    b3p1Var.d.b(b3p1Var.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new lal(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicyI);
            }
        } catch (zzaf e) {
            return e.a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b3p1 b3p1Var = this.g;
        synchronized (b3p1Var.a) {
            try {
                b3p1Var.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = (byte) 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b3p1 b3p1Var = this.g;
        synchronized (b3p1Var.a) {
            try {
                b3p1Var.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = (byte) 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
