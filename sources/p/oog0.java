package p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oog0 extends ve30 implements Serializable {
    public final rog0 a;
    public final rog0 b;
    public final mfz c;
    public final int d;
    public transient ConcurrentMap e;

    public oog0(rog0 rog0Var, rog0 rog0Var2, mfz mfzVar, int i, ipg0 ipg0Var) {
        this.a = rog0Var;
        this.b = rog0Var2;
        this.c = mfzVar;
        this.d = i;
        this.e = ipg0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        zf50 zf50Var = new zf50();
        dm5.m(i >= 0);
        zf50Var.c = i;
        rog0 rog0Var = (rog0) zf50Var.e;
        dm5.A(rog0Var == null, "Key strength was already set to %s", rog0Var);
        rog0 rog0Var2 = this.a;
        rog0Var2.getClass();
        zf50Var.e = rog0Var2;
        pog0 pog0Var = rog0.a;
        if (rog0Var2 != pog0Var) {
            zf50Var.b = true;
        }
        rog0 rog0Var3 = (rog0) zf50Var.f;
        dm5.A(rog0Var3 == null, "Value strength was already set to %s", rog0Var3);
        rog0 rog0Var4 = this.b;
        rog0Var4.getClass();
        zf50Var.f = rog0Var4;
        if (rog0Var4 != pog0Var) {
            zf50Var.b = true;
        }
        mfz mfzVar = (mfz) zf50Var.g;
        dm5.A(mfzVar == null, "key equivalence was already set to %s", mfzVar);
        mfz mfzVar2 = this.c;
        mfzVar2.getClass();
        zf50Var.g = mfzVar2;
        zf50Var.b = true;
        int i2 = zf50Var.d;
        dm5.x("concurrency level was already set to %s", i2, i2 == -1);
        int i3 = this.d;
        dm5.m(i3 > 0);
        zf50Var.d = i3;
        this.e = zf50Var.d();
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                return;
            } else {
                this.e.put(object, objectInputStream.readObject());
            }
        }
    }

    private Object readResolve() {
        return this.e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.e.size());
        for (Map.Entry entry : this.e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }

    public final Object delegate() {
        return this.e;
    }

    /* JADX INFO: renamed from: delegate, reason: collision with other method in class */
    public final Map m270delegate() {
        return this.e;
    }
}
