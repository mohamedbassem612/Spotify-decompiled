package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uno0 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public uno0(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(tno0 tno0Var) {
        boolean z;
        ArrayDeque arrayDeque = tno0Var.d;
        ComponentName componentName = tno0Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (tno0Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean zBindService = context.bindService(component, this, 33);
            tno0Var.b = zBindService;
            if (zBindService) {
                tno0Var.e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z = tno0Var.b;
        }
        if (!z || tno0Var.c == null) {
            c(tno0Var);
            return;
        }
        while (true) {
            rno0 rno0Var = (rno0) arrayDeque.peek();
            if (rno0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    rno0Var.toString();
                }
                rno0Var.a(tno0Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        c(tno0Var);
    }

    public final void b(rno0 rno0Var) {
        this.b.obtainMessage(0, rno0Var).sendToTarget();
    }

    public final void c(tno0 tno0Var) {
        ComponentName componentName = tno0Var.a;
        ArrayDeque arrayDeque = tno0Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = tno0Var.e;
        int i2 = i + 1;
        tno0Var.e = i2;
        if (i2 <= 6) {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
        } else {
            arrayDeque.size();
            Objects.toString(componentName);
            arrayDeque.clear();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        sh70 sh70Var = null;
        if (i == 0) {
            rno0 rno0Var = (rno0) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (vno0.c) {
                if (string != null) {
                    try {
                        if (!string.equals(vno0.d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            vno0.e = hashSet2;
                            vno0.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = vno0.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.c.put(componentName2, new tno0(componentName2));
                    }
                }
                Iterator it = this.c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        tno0 tno0Var = (tno0) entry.getValue();
                        if (tno0Var.b) {
                            this.a.unbindService(this);
                            tno0Var.b = false;
                        }
                        tno0Var.c = null;
                        it.remove();
                    }
                }
            }
            for (tno0 tno0Var2 : this.c.values()) {
                tno0Var2.d.add(rno0Var);
                a(tno0Var2);
            }
        } else if (i == 1) {
            sno0 sno0Var = (sno0) message.obj;
            ComponentName componentName3 = sno0Var.a;
            IBinder iBinder = sno0Var.b;
            tno0 tno0Var3 = (tno0) this.c.get(componentName3);
            if (tno0Var3 != null) {
                int i2 = rh70.a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(sh70.h);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof sh70)) {
                        qh70 qh70Var = new qh70();
                        qh70Var.a = iBinder;
                        sh70Var = qh70Var;
                    } else {
                        sh70Var = (sh70) iInterfaceQueryLocalInterface;
                    }
                }
                tno0Var3.c = sh70Var;
                tno0Var3.e = 0;
                a(tno0Var3);
                return true;
            }
        } else if (i == 2) {
            tno0 tno0Var4 = (tno0) this.c.get((ComponentName) message.obj);
            if (tno0Var4 != null) {
                if (tno0Var4.b) {
                    this.a.unbindService(this);
                    tno0Var4.b = false;
                }
                tno0Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            tno0 tno0Var5 = (tno0) this.c.get((ComponentName) message.obj);
            if (tno0Var5 != null) {
                a(tno0Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new sno0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
