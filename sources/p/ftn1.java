package p;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ftn1 {
    public byte a;
    public Object b;
    public Object c;

    public ftn1() {
        this.b = Collections.synchronizedMap(new y36(0));
        this.a = (byte) 0;
    }

    public c8n1 a() {
        return (c8n1) c8n1.class.cast(((Map) this.b).get("ConnectionlessLifecycleHelper"));
    }

    public void b(c8n1 c8n1Var) {
        Map map = (Map) this.b;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            StringBuilder sb = new StringBuilder("ConnectionlessLifecycleHelper".length() + 59);
            sb.append("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
            throw new IllegalArgumentException(sb.toString());
        }
        map.put("ConnectionlessLifecycleHelper", c8n1Var);
        if (this.a > 0) {
            new jim0(Looper.getMainLooper(), (byte) 6).post(new mqh1(this, c8n1Var, false, (byte) 13));
        }
    }

    public void c(Bundle bundle) {
        this.a = (byte) 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            ((c8n1) entry.getValue()).b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void d() {
        this.a = (byte) 2;
        for (c8n1 c8n1Var : ((Map) this.b).values()) {
            c8n1Var.b = true;
            c8n1Var.d();
        }
    }

    public void e() {
        this.a = (byte) 3;
        Iterator it = ((Map) this.b).values().iterator();
        while (it.hasNext()) {
            ((c8n1) it.next()).d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x000c A[SYNTHETIC] */
    public void f(int i, int i2, Intent intent) {
        for (c8n1 c8n1Var : ((Map) this.b).values()) {
            AtomicReference atomicReference = c8n1Var.c;
            pz40 pz40Var = c8n1Var.g;
            AtomicReference atomicReference2 = c8n1Var.c;
            n9n1 n9n1Var = (n9n1) atomicReference.get();
            if (i != 1) {
                if (i == 2) {
                    int iC = c8n1Var.e.c(c8n1Var.a(), mz40.a);
                    if (iC == 0) {
                        atomicReference2.set(null);
                        jim0 jim0Var = pz40Var.N0;
                        jim0Var.sendMessage(jim0Var.obtainMessage(3));
                    } else if (n9n1Var == null || (n9n1Var.b.b == 18 && iC == 18)) {
                    }
                }
                if (n9n1Var != null) {
                    lal lalVar = n9n1Var.b;
                    int i3 = n9n1Var.a;
                    atomicReference2.set(null);
                    pz40Var.h(lalVar, i3);
                }
            } else if (i2 == -1) {
                atomicReference2.set(null);
                jim0 jim0Var2 = pz40Var.N0;
                jim0Var2.sendMessage(jim0Var2.obtainMessage(3));
            } else if (i2 == 0) {
                if (n9n1Var != null) {
                    lal lalVar2 = new lal(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, (PendingIntent) null, n9n1Var.b.toString());
                    int i4 = n9n1Var.a;
                    atomicReference2.set(null);
                    pz40Var.h(lalVar2, i4);
                }
            } else if (n9n1Var != null) {
                lal lalVar3 = n9n1Var.b;
                int i5 = n9n1Var.a;
                atomicReference2.set(null);
                pz40Var.h(lalVar3, i5);
            }
        }
    }

    public void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            Bundle bundle2 = new Bundle();
            n9n1 n9n1Var = (n9n1) ((c8n1) entry.getValue()).c.get();
            if (n9n1Var != null) {
                lal lalVar = n9n1Var.b;
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", n9n1Var.a);
                bundle2.putInt("failed_status", lalVar.b);
                bundle2.putParcelable("failed_resolution", lalVar.c);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public void h() {
        this.a = (byte) 4;
        Iterator it = ((Map) this.b).values().iterator();
        while (it.hasNext()) {
            ((c8n1) it.next()).c();
        }
    }

    public void i() {
        this.a = (byte) 5;
        Iterator it = ((Map) this.b).values().iterator();
        while (it.hasNext()) {
            ((c8n1) it.next()).getClass();
        }
    }

    public void j() {
        Iterator it = ((Map) this.b).values().iterator();
        while (it.hasNext()) {
            ((c8n1) it.next()).getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ftn1(int i) {
        this.a = i;
    }
}
