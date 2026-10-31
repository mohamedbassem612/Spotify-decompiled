package p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gwm0 extends j7 {
    public transient v0d1 g;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.g = (v0d1) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        p((Map) object2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.g);
        objectOutputStream.writeObject(this.e);
    }

    @Override // p.b8, p.x8
    public final Map e() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new s7(this, (NavigableMap) this.e);
        }
        return map instanceof SortedMap ? new v7(this, (SortedMap) this.e) : new q7(this, this.e, (byte) 0);
    }

    @Override // p.b8, p.x8
    public final Set g() {
        Map map = this.e;
        if (map instanceof NavigableMap) {
            return new t7(this, (NavigableMap) this.e);
        }
        return map instanceof SortedMap ? new w7(this, (SortedMap) this.e) : new r7(this, this.e);
    }

    @Override // p.b8
    public final Collection n() {
        return (List) this.g.get();
    }
}
