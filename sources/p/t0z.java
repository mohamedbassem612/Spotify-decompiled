package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t0z extends g7 implements r0z, RandomAccess, Serializable {
    public final Enum[] a;

    public t0z(Enum[] enumArr) {
        this.a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new u0z(this.a);
    }

    @Override // p.k6
    public final int b() {
        return this.a.length;
    }

    @Override // p.k6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) f46.n0(r2.ordinal(), this.a)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        eg.g(cy30.i(i, "index: ", length, ", size: "));
        return null;
    }

    @Override // p.g7, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) f46.n0(iOrdinal, this.a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p.g7, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) f46.n0(iOrdinal, this.a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
