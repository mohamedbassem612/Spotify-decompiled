package p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w0d1 implements v0d1, Serializable {
    public transient Object a = new Object();
    public final v0d1 b;
    public volatile transient boolean c;
    public transient Object d;

    public w0d1(v0d1 v0d1Var) {
        this.b = v0d1Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = new Object();
    }

    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        return td6.l(new StringBuilder("Suppliers.memoize("), this.c ? td6.l(new StringBuilder("<supplier that returned "), this.d, ">") : this.b, ")");
    }
}
