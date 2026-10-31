package p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q36 extends j7 {
    public transient byte g;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.g = (byte) 3;
        int i = objectInputStream.readInt();
        p(muh.a());
        qmo1.u(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        qmo1.E(this, objectOutputStream);
    }

    @Override // p.b8
    public final Collection n() {
        return new ArrayList(this.g);
    }
}
