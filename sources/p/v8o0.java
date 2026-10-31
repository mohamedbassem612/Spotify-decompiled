package p;

import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v8o0 {
    public static v8o0 f;
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public v8o0(Context context) {
        Executor executorN = tx9.n();
        this.c = executorN;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.a = 0;
        executorN.execute(new zyh0((Object) this, (Object) context, (byte) 10));
    }

    public static synchronized v8o0 a(Context context) {
        v8o0 v8o0Var;
        v8o0Var = f;
        if (v8o0Var == null) {
            v8o0Var = new v8o0(context);
            f = v8o0Var;
        }
        return v8o0Var;
    }

    public int b() {
        int i;
        synchronized (this.e) {
            i = this.a;
        }
        return i;
    }

    public m9d1 c() {
        if (this.b) {
            return (m9d1) ((idd1) this.d).getValue();
        }
        return null;
    }

    public void d(int i) {
        CopyOnWriteArrayList<u8o0> copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        for (u8o0 u8o0Var : copyOnWriteArrayList) {
            if (u8o0Var.a.get() == null) {
                copyOnWriteArrayList.remove(u8o0Var);
            }
        }
        synchronized (this.e) {
            try {
                if (this.b && this.a == i) {
                    return;
                }
                this.b = true;
                this.a = i;
                for (u8o0 u8o0Var2 : (CopyOnWriteArrayList) this.d) {
                    u8o0Var2.b.execute(new gv40(u8o0Var2, (byte) 23));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public v8o0(Context context, int i) {
        this.c = context;
        this.a = i;
        this.d = new idd1(new u9d1(this, (byte) 3));
        this.e = orc1.h;
    }

    public v8o0(t5s t5sVar, List list, int i, tr80 tr80Var, boolean z) {
        this.c = t5sVar;
        this.d = list;
        this.a = i;
        this.e = tr80Var;
        this.b = z;
    }
}
