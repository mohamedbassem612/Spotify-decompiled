package p;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jwh0 {
    public final nvh0 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final lwh0 e;
    public final lwh0 f;
    public final lwh0 g;
    public final ArrayList h;
    public final WeakReference i;
    public boolean j = false;
    public boolean k = false;

    public jwh0(kv40 kv40Var, lwh0 lwh0Var, nvh0 nvh0Var, int i, int i2, boolean z, lwh0 lwh0Var2, Collection collection) {
        this.i = new WeakReference(kv40Var);
        this.f = lwh0Var;
        this.a = nvh0Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = kv40Var.d;
        this.g = lwh0Var2;
        this.h = collection == null ? null : new ArrayList(collection);
        kv40Var.a.postDelayed(new gv40(this, (byte) 19), 15000L);
    }

    public final void a() {
        if (this.j || this.k) {
            return;
        }
        this.k = true;
        nvh0 nvh0Var = this.a;
        if (nvh0Var != null) {
            nvh0Var.i(0);
            nvh0Var.e();
        }
    }

    public final void b() {
        owh0.b();
        if (this.j || this.k) {
            return;
        }
        WeakReference weakReference = this.i;
        kv40 kv40Var = (kv40) weakReference.get();
        if (kv40Var == null || kv40Var.f != this) {
            a();
            return;
        }
        this.j = true;
        kv40Var.f = null;
        kv40 kv40Var2 = (kv40) weakReference.get();
        lwh0 lwh0Var = this.e;
        int i = this.b;
        if (kv40Var2 != null) {
            HashMap map = kv40Var2.b;
            if (kv40Var2.d == lwh0Var) {
                Message messageObtainMessage = kv40Var2.a.obtainMessage(263, lwh0Var);
                messageObtainMessage.arg1 = i;
                messageObtainMessage.sendToTarget();
                nvh0 nvh0Var = kv40Var2.e;
                if (nvh0Var != null) {
                    nvh0Var.i(i);
                    kv40Var2.e.e();
                }
                if (!map.isEmpty()) {
                    for (nvh0 nvh0Var2 : map.values()) {
                        nvh0Var2.i(i);
                        nvh0Var2.e();
                    }
                    map.clear();
                }
                kv40Var2.e = null;
            }
        }
        kv40 kv40Var3 = (kv40) weakReference.get();
        if (kv40Var3 == null) {
            return;
        }
        lwh0 lwh0Var2 = this.f;
        kv40Var3.d = lwh0Var2;
        kv40Var3.e = this.a;
        f3a f3aVar = new f3a();
        f3aVar.a = i;
        f3aVar.b = this.c;
        f3a f3aVar2 = new f3a(f3aVar);
        cv40 cv40Var = kv40Var3.a;
        boolean z = this.d;
        lwh0 lwh0Var3 = this.g;
        if (lwh0Var3 == null) {
            cv40Var.getClass();
            Message messageObtainMessage2 = cv40Var.obtainMessage(262, new jv40(lwh0Var, lwh0Var2, f3aVar2, z));
            messageObtainMessage2.arg1 = f3aVar2.h();
            messageObtainMessage2.sendToTarget();
        } else {
            cv40Var.getClass();
            Message messageObtainMessage3 = cv40Var.obtainMessage(264, new jv40(lwh0Var3, lwh0Var2, f3aVar2, z));
            messageObtainMessage3.arg1 = f3aVar2.a;
            messageObtainMessage3.sendToTarget();
        }
        kv40Var3.b.clear();
        kv40Var3.j();
        kv40Var3.n();
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            lwh0 lwh0Var4 = kv40Var3.d;
            lwh0Var4.getClass();
            iwh0 iwh0Var = lwh0Var4 instanceof iwh0 ? (iwh0) lwh0Var4 : null;
            if (iwh0Var != null) {
                iwh0Var.q(arrayList);
            }
        }
    }
}
