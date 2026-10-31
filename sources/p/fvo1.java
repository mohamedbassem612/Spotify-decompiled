package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzq;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fvo1 implements ServiceConnection {
    public frl1 c;
    public final /* synthetic */ b8p1 f;
    public byte a = 0;
    public final Messenger b = new Messenger((Handler) new jim0(Looper.getMainLooper(), new h7o1(this, (byte) 0)));
    public final ArrayDeque d = new ArrayDeque();
    public final SparseArray e = new SparseArray();

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                if (strValueOf.length() != 0) {
                    "Disconnected: ".concat(strValueOf);
                }
            }
            byte b = this.a;
            if (b == 0) {
                throw new IllegalStateException();
            }
            if (b != 1 && b != 2) {
                if (b != 3) {
                    return;
                }
                this.a = (byte) 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = (byte) 4;
            dbl.a().b(b8p1.B(this.f), this);
            zzq zzqVar = new zzq(str, securityException);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((a1p1) it.next()).c(zzqVar);
            }
            this.d.clear();
            int i = 0;
            while (true) {
                int size = this.e.size();
                SparseArray sparseArray = this.e;
                if (i >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((a1p1) sparseArray.valueAt(i)).c(zzqVar);
                    i++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = (byte) 3;
            dbl.a().b(b8p1.B(this.f), this);
        }
    }

    public final synchronized boolean d(a1p1 a1p1Var) throws Throwable {
        fvo1 fvo1Var;
        Throwable th;
        try {
            try {
                byte b = this.a;
                if (b != 0) {
                    try {
                        if (b == 1) {
                            this.d.add(a1p1Var);
                            return true;
                        }
                        if (b != 2) {
                            return false;
                        }
                        this.d.add(a1p1Var);
                        b8p1.H(this.f).execute(new efo1(this, (byte) 0));
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        fvo1Var = this;
                    }
                } else {
                    this.d.add(a1p1Var);
                    zod.w(this.a == 0);
                    Log.isLoggable("MessengerIpcClient", 2);
                    this.a = (byte) 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        dbl dblVarA = dbl.a();
                        Context contextB = b8p1.B(this.f);
                        try {
                            try {
                                fvo1Var = this;
                                try {
                                    try {
                                        if (dblVarA.c(contextB, contextB.getClass().getName(), intent, fvo1Var, 1, null)) {
                                            b8p1.H(fvo1Var.f).schedule((Runnable) new efo1(fvo1Var, (byte) 1), 30L, TimeUnit.SECONDS);
                                        } else {
                                            fvo1Var.a("Unable to bind to service");
                                        }
                                    } catch (SecurityException e) {
                                        e = e;
                                        fvo1Var.b("Unable to bind to service", e);
                                    }
                                    return true;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fvo1Var = this;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fvo1Var = this;
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        fvo1Var = this;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                th = th;
            }
        } catch (Throwable th7) {
            th = th7;
            fvo1Var = this;
            th = th;
        }
        throw th;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        b8p1.H(this.f).execute(new sjj1(this, iBinder, (byte) 14));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        b8p1.H(this.f).execute(new g54(this, (byte) 23));
    }
}
