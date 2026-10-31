package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dn7 implements ServiceConnection {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public dn7() {
        this.a = (byte) 0;
        this.b = new AtomicBoolean(false);
        this.c = new LinkedBlockingDeque();
    }

    public IBinder a() {
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            return (IBinder) ((LinkedBlockingDeque) this.c).take();
        }
        eg.m("Binder already consumed");
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        tj70 tj70Var;
        Boolean boolValueOf;
        z6n1 o6n1Var = null;
        switch (this.a) {
            case 0:
                if (iBinder != null) {
                    try {
                        ((LinkedBlockingDeque) this.c).put(iBinder);
                        return;
                    } catch (InterruptedException unused) {
                        wf10 wf10Var = wf10.a;
                        return;
                    }
                }
                return;
            case 1:
                g2z g2zVar = (g2z) this.c;
                ayh ayhVar = (ayh) this.b;
                int i = uj70.a;
                if (iBinder == null) {
                    tj70Var = null;
                } else {
                    tj70 tj70VarQueryLocalInterface = iBinder.queryLocalInterface(vj70.j);
                    if (tj70VarQueryLocalInterface == null || !(tj70VarQueryLocalInterface instanceof vj70)) {
                        tj70Var = new tj70();
                        tj70Var.a = iBinder;
                    } else {
                        tj70Var = (vj70) tj70VarQueryLocalInterface;
                    }
                }
                ayhVar.m0(tj70Var);
                g2zVar.c = iBinder;
                if (iBinder != null) {
                    iBinder.linkToDeath((llh0) g2zVar.d, 0);
                }
                bpb1 bpb1Var = (bpb1) g2zVar.e;
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                return;
            case 2:
                Context context = (Context) this.c;
                SingleEmitter singleEmitter = (SingleEmitter) ((ssk1) this.b).a;
                try {
                    boolValueOf = Boolean.valueOf(fk70.s(iBinder).B0());
                } catch (RemoteException unused2) {
                    boolValueOf = Boolean.FALSE;
                } finally {
                    singleEmitter.onSuccess(Boolean.FALSE);
                    context.unbindService(this);
                }
                singleEmitter.onSuccess(boolValueOf);
                return;
            default:
                if (componentName != null) {
                    m6n1 m6n1Var = (m6n1) this.b;
                    String str = (String) this.c;
                    LinkedHashMap linkedHashMap = m6n1Var.a;
                    String packageName = componentName.getPackageName();
                    int i2 = mqt.l;
                    if (iBinder != null) {
                        z6n1 z6n1VarQueryLocalInterface = iBinder.queryLocalInterface("com.ravelin.core.IDeviceIdInterface");
                        if (z6n1VarQueryLocalInterface == null || !(z6n1VarQueryLocalInterface instanceof z6n1)) {
                            o6n1Var = new o6n1();
                            ((o6n1) o6n1Var).a = iBinder;
                        } else {
                            o6n1Var = z6n1VarQueryLocalInterface;
                        }
                    }
                    l6n1 l6n1Var = new l6n1();
                    l6n1Var.a = this;
                    l6n1Var.b = o6n1Var;
                    l6n1Var.c = true;
                    linkedHashMap.put(packageName, l6n1Var);
                    String str2 = m6n1.b;
                    String name = Thread.currentThread().getName();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    StringBuilder sbN = gvg.n("***Debug service connection bound to ", str, " on ", name, " at ");
                    sbN.append(jCurrentTimeMillis);
                    String string = sbN.toString();
                    utw0 utw0Var = ike1.a;
                    utw0Var.y(str2);
                    utw0Var.o(string, new Object[0]);
                    return;
                }
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                bpb1 bpb1Var = (bpb1) ((g2z) obj).e;
                Boolean bool = Boolean.FALSE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                break;
            case 2:
                break;
            default:
                if (componentName != null) {
                    LinkedHashMap linkedHashMap = ((m6n1) this.b).a;
                    String str = (String) obj;
                    l6n1 l6n1Var = (l6n1) linkedHashMap.get(str);
                    if (l6n1Var != null) {
                        l6n1Var.b = null;
                        l6n1Var.c = false;
                    }
                    String str2 = m6n1.b;
                    String strConcat = "***Debug service connection unbinding for ".concat(str);
                    utw0 utw0Var = ike1.a;
                    utw0Var.y(str2);
                    utw0Var.o(strConcat, new Object[0]);
                }
                break;
        }
    }

    public /* synthetic */ dn7(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void b(ComponentName componentName) {
    }

    private final void c(ComponentName componentName) {
    }
}
