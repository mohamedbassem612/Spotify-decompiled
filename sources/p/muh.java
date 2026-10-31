package p;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class muh extends AbstractMap implements Serializable {
    public static final Object t = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient juh g;
    public transient juh h;
    public transient v8 i;

    public static muh a() {
        muh muhVar = new muh();
        muhVar.f(3);
        return muhVar;
    }

    public static muh b(int i) {
        muh muhVar = new muh();
        muhVar.f(i);
        return muhVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(f4i1.c(i, "Invalid size: "));
        }
        f(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapC = c();
        Iterator it = mapC != null ? mapC.entrySet().iterator() : new iuh(this, (byte) 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map c() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.e += 32;
        Map mapC = c();
        if (mapC != null) {
            this.e = bmq0.m(size(), 3);
            mapC.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f, (Object) null);
        Arrays.fill(l(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (zno1.k(obj, l()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (h()) {
            return -1;
        }
        int iB = j0o1.B(obj);
        int iD = d();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iT = x9p1.t(iB & iD, obj2);
        if (iT == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iB & i;
        do {
            int i3 = iT - 1;
            int i4 = j()[i3];
            if ((i4 & i) == i2 && zno1.k(obj, k()[i3])) {
                return i3;
            }
            iT = i4 & iD;
        } while (iT != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        juh juhVar = this.h;
        if (juhVar != null) {
            return juhVar;
        }
        juh juhVar2 = new juh(this, (byte) 0);
        this.h = juhVar2;
        return juhVar2;
    }

    public final void f(int i) {
        dm5.n(i >= 0, "Expected size must be >= 0");
        this.e = bmq0.m(i, 1);
    }

    public final void g(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrL = l();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrK[i] = null;
            objArrL[i] = null;
            iArrJ[i] = 0;
            return;
        }
        Object obj2 = objArrK[i3];
        objArrK[i] = obj2;
        objArrL[i] = objArrL[i3];
        objArrK[i3] = null;
        objArrL[i3] = null;
        iArrJ[i] = iArrJ[i3];
        iArrJ[i3] = 0;
        int iB = j0o1.B(obj2) & i2;
        int iT = x9p1.t(iB, obj);
        if (iT == size) {
            x9p1.u(iB, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iT - 1;
            int i5 = iArrJ[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrJ[i4] = x9p1.k(i5, i + 1, i2);
                return;
            }
            iT = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return l()[iE];
    }

    public final boolean h() {
        return this.a == null;
    }

    public final Object i(Object obj) {
        if (!h()) {
            int iD = d();
            Object obj2 = this.a;
            Objects.requireNonNull(obj2);
            int iO = x9p1.o(obj, null, iD, obj2, j(), k(), null);
            if (iO != -1) {
                Object obj3 = l()[iO];
                g(iO, iD);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        juh juhVar = this.g;
        if (juhVar != null) {
            return juhVar;
        }
        juh juhVar2 = new juh(this, (byte) 1);
        this.g = juhVar2;
        return juhVar2;
    }

    public final Object[] l() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i, int i2, int i3, int i4) {
        Object objG = x9p1.g(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            x9p1.u(i3 & i5, i4 + 1, objG);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iT = x9p1.t(i6, obj);
            while (iT != 0) {
                int i7 = iT - 1;
                int i8 = iArrJ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iT2 = x9p1.t(i10, objG);
                x9p1.u(i10, iT, objG);
                iArrJ[i7] = x9p1.k(i9, iT2, i5);
                iT = i8 & i;
            }
        }
        this.a = objG;
        this.e = x9p1.k(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f1 -> B:34:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:55:0x00f4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.muh.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objI = i(obj);
        if (objI == t) {
            return null;
        }
        return objI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        v8 v8Var = this.i;
        if (v8Var != null) {
            return v8Var;
        }
        v8 v8Var2 = new v8((Object) this, (byte) 2);
        this.i = v8Var2;
        return v8Var2;
    }
}
