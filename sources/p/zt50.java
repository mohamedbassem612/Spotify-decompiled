package p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zt50 extends b8 {
    public transient byte g;

    public zt50() {
        super(muh.b(12));
        this.g = (byte) 2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.g = (byte) 2;
        int i = objectInputStream.readInt();
        p(muh.b(12));
        qmo1.u(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        qmo1.E(this, objectOutputStream);
    }

    @Override // p.b8, p.x8
    public final Collection h() {
        return (Set) super.h();
    }

    @Override // p.b8, p.x8
    public final Collection j(Object obj) {
        return (Set) super.j(obj);
    }

    @Override // p.b8
    public final Collection n() {
        return ouh.b(this.g);
    }

    @Override // p.b8
    public final Collection q(Object obj, Collection collection) {
        return new a8(this, obj, (Set) collection);
    }
}
