package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class xvh0 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final int b;
    public final String c;
    public hvh0 d;
    public long e;
    public final SparseArray f = new SparseArray();
    public final c8d0 g = new c8d0(this, 19);
    public final /* synthetic */ mv2 h;

    public xvh0(mv2 mv2Var, Messenger messenger, int i, String str) {
        this.h = mv2Var;
        this.a = messenger;
        this.b = i;
        this.c = str;
    }

    public Bundle a(jqd0 jqd0Var) {
        if (jqd0Var == null) {
            return null;
        }
        return zvh0.a(this.h.j(jqd0Var, this.c), this.b);
    }

    public boolean b(String str, String str2, ovh0 ovh0Var, int i) {
        SparseArray sparseArray = this.f;
        if (sparseArray.indexOfKey(i) >= 0) {
            return false;
        }
        zvh0 zvh0Var = (zvh0) this.h.c;
        nvh0 nvh0VarC = str2 == null ? zvh0Var.d.c(str) : zvh0Var.d.d(str, str2);
        if (nvh0VarC == null) {
            return false;
        }
        sparseArray.put(i, nvh0VarC);
        return true;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ((zvh0) this.h.c).b.obtainMessage(1, this.a).sendToTarget();
    }

    public void c() {
        SparseArray sparseArray = this.f;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((nvh0) sparseArray.valueAt(i)).e();
        }
        sparseArray.clear();
        this.a.getBinder().unlinkToDeath(this, 0);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Objects.equals(this.d, null)) {
            return;
        }
        this.d = null;
        this.e = jElapsedRealtime;
        this.h.A();
    }

    public final nvh0 d(int i) {
        return (nvh0) this.f.get(i);
    }

    public boolean e(int i) {
        SparseArray sparseArray = this.f;
        nvh0 nvh0Var = (nvh0) sparseArray.get(i);
        if (nvh0Var == null) {
            return false;
        }
        sparseArray.remove(i);
        nvh0Var.e();
        return true;
    }

    public final String toString() {
        int i = zvh0.f;
        return "Client connection " + this.a.getBinder().toString();
    }
}
