package p;

import com.spotify.base.java.logging.Logger;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kue0 implements jue0 {
    public ArrayDeque a = new ArrayDeque();
    public int b;

    @Override // p.jue0
    public final boolean a(Exception exc, String str, Object[] objArr) {
        String name = Thread.currentThread().getName();
        if (objArr.length != 0) {
            int length = objArr.length;
            Object[] objArr2 = new Object[length];
            for (int i = 0; i < length; i++) {
                Object objValueOf = objArr[i];
                if (objValueOf != null && !(objValueOf instanceof String) && !(objValueOf instanceof Integer) && !(objValueOf instanceof Long) && !(objValueOf instanceof Short) && !(objValueOf instanceof Byte) && !(objValueOf instanceof Double) && !(objValueOf instanceof Float) && !(objValueOf instanceof Boolean) && !(objValueOf instanceof Character) && !(objValueOf instanceof Enum) && !(objValueOf instanceof URI)) {
                    objValueOf = String.valueOf(objValueOf);
                }
                objArr2[i] = objValueOf;
            }
            objArr = objArr2;
        }
        lue0 lue0Var = new lue0(name, str, objArr, exc);
        synchronized (Logger.d) {
            try {
                if (Logger.e != this) {
                    return false;
                }
                if (this.a.size() == 256) {
                    this.a.removeFirst();
                    this.b++;
                }
                this.a.addLast(lue0Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.b > 0) {
            List list = Logger.a;
            Logger.c(Thread.currentThread().getName(), "%d earlier breadcrumbs were dropped before logging was configured", new Integer[]{Integer.valueOf(this.b)}, (Throwable) null);
            this.b = 0;
        }
        while (!this.a.isEmpty()) {
            ArrayDeque<lue0> arrayDeque = this.a;
            this.a = new ArrayDeque();
            for (lue0 lue0Var : arrayDeque) {
                List list2 = Logger.a;
                Logger.c(lue0Var.a, lue0Var.b, lue0Var.c, lue0Var.d);
            }
        }
    }
}
