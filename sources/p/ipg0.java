package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ipg0 extends AbstractMap implements ConcurrentMap, Serializable {
    public static final gog0 t = new gog0();
    public final transient int a;
    public final transient int b;
    public final transient nog0[] c;
    public final int d;
    public final mfz e;
    public final transient mog0 f;
    public transient kog0 g;
    public transient v8 h;
    public transient kog0 i;

    public ipg0(zf50 zf50Var, mog0 mog0Var) {
        int i = zf50Var.d;
        this.d = Math.min(i == -1 ? 4 : i, 65536);
        this.e = (mfz) cwl1.y((mfz) zf50Var.g, ((rog0) cwl1.y((rog0) zf50Var.e, rog0.a)).a());
        this.f = mog0Var;
        int i2 = zf50Var.c;
        int iMin = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 < this.d) {
            i5++;
            i6 <<= 1;
        }
        this.b = 32 - i5;
        this.a = i6 - 1;
        this.c = new nog0[i6];
        int i7 = iMin / i6;
        while (i4 < (i6 * i7 < iMin ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            nog0[] nog0VarArr = this.c;
            if (i3 >= nog0VarArr.length) {
                return;
            }
            nog0VarArr[i3] = this.f.h(this, i4);
            i3++;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public final int a(Object obj) {
        int iB = this.e.b(obj);
        int i = iB + ((iB << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final nog0 b(int i) {
        return this.c[(i >>> this.b) & this.a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (nog0 nog0Var : this.c) {
            if (nog0Var.b != 0) {
                nog0Var.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = nog0Var.e;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    nog0Var.e();
                    nog0Var.f.set(0);
                    nog0Var.c++;
                    nog0Var.b = 0;
                    nog0Var.unlock();
                } catch (Throwable th) {
                    nog0Var.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        nog0 nog0VarB = b(iA);
        nog0VarB.getClass();
        try {
            if (nog0VarB.b == 0) {
                return false;
            }
            log0 log0VarD = nog0VarB.d(iA, obj);
            if (log0VarD != null && log0VarD.getValue() != null) {
                z = true;
            }
            return z;
        } finally {
            nog0VarB.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Object value;
        if (obj != null) {
            nog0[] nog0VarArr = this.c;
            long j = -1;
            int i = 0;
            while (i < 3) {
                int length = nog0VarArr.length;
                long j2 = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    nog0 nog0Var = nog0VarArr[i2];
                    int i3 = nog0Var.b;
                    AtomicReferenceArray atomicReferenceArray = nog0Var.e;
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        for (log0 log0VarC = (log0) atomicReferenceArray.get(i4); log0VarC != null; log0VarC = log0VarC.c()) {
                            if (log0VarC.getKey() == null || (value = log0VarC.getValue()) == null) {
                                nog0Var.m();
                                value = null;
                            }
                            if (value != null && this.f.b().a().c(obj, value)) {
                                return true;
                            }
                        }
                    }
                    j2 += (long) nog0Var.c;
                }
                if (j2 == j) {
                    return false;
                }
                i++;
                j = j2;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        kog0 kog0Var = this.i;
        if (kog0Var != null) {
            return kog0Var;
        }
        kog0 kog0Var2 = new kog0(this, (byte) 0);
        this.i = kog0Var2;
        return kog0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        nog0 nog0VarB = b(iA);
        nog0VarB.getClass();
        try {
            log0 log0VarD = nog0VarB.d(iA, obj);
            if (log0VarD == null) {
                return null;
            }
            Object value = log0VarD.getValue();
            if (value == null) {
                nog0VarB.m();
            }
            return value;
        } finally {
            nog0VarB.g();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        nog0[] nog0VarArr = this.c;
        long j = 0;
        for (int i = 0; i < nog0VarArr.length; i++) {
            if (nog0VarArr[i].b != 0) {
                return false;
            }
            j += (long) nog0VarArr[i].c;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < nog0VarArr.length; i2++) {
            if (nog0VarArr[i2].b != 0) {
                return false;
            }
            j -= (long) nog0VarArr[i2].c;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        kog0 kog0Var = this.g;
        if (kog0Var != null) {
            return kog0Var;
        }
        kog0 kog0Var2 = new kog0(this, (byte) 1);
        this.g = kog0Var2;
        return kog0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(iA, obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(iA, obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iA = a(obj);
        nog0 nog0VarB = b(iA);
        nog0VarB.lock();
        try {
            nog0VarB.j();
            AtomicReferenceArray atomicReferenceArray = nog0VarB.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            log0 log0Var = (log0) atomicReferenceArray.get(length);
            for (log0 log0VarC = log0Var; log0VarC != null; log0VarC = log0VarC.c()) {
                Object key = log0VarC.getKey();
                if (log0VarC.b() == iA && key != null && nog0VarB.a.e.c(obj, key)) {
                    if (nog0VarB.a.f.b().a().c(obj2, log0VarC.getValue())) {
                        z = true;
                    } else if (log0VarC.getValue() != null) {
                        return false;
                    }
                    nog0VarB.c++;
                    log0 log0VarI = nog0VarB.i(log0Var, log0VarC);
                    int i = nog0VarB.b - 1;
                    atomicReferenceArray.set(length, log0VarI);
                    nog0VarB.b = i;
                    return z;
                }
            }
            return false;
        } finally {
            nog0VarB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iA = a(obj);
        nog0 nog0VarB = b(iA);
        nog0VarB.lock();
        try {
            nog0VarB.j();
            AtomicReferenceArray atomicReferenceArray = nog0VarB.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            log0 log0Var = (log0) atomicReferenceArray.get(length);
            for (log0 log0VarC = log0Var; log0VarC != null; log0VarC = log0VarC.c()) {
                Object key = log0VarC.getKey();
                if (log0VarC.b() == iA && key != null && nog0VarB.a.e.c(obj, key)) {
                    Object value = log0VarC.getValue();
                    if (value != null) {
                        if (!nog0VarB.a.f.b().a().c(obj2, value)) {
                            return false;
                        }
                        nog0VarB.c++;
                        nog0VarB.l(log0VarC, obj3);
                        return true;
                    }
                    if (log0VarC.getValue() == null) {
                        nog0VarB.c++;
                        log0 log0VarI = nog0VarB.i(log0Var, log0VarC);
                        int i = nog0VarB.b - 1;
                        atomicReferenceArray.set(length, log0VarI);
                        nog0VarB.b = i;
                    }
                    return false;
                }
            }
            return false;
        } finally {
            nog0VarB.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (nog0 nog0Var : this.c) {
            j += (long) nog0Var.b;
        }
        return bmq0.Z(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        v8 v8Var = this.h;
        if (v8Var != null) {
            return v8Var;
        }
        v8 v8Var2 = new v8((Object) this, (byte) 3);
        this.h = v8Var2;
        return v8Var2;
    }

    public Object writeReplace() {
        mog0 mog0Var = this.f;
        return new oog0(mog0Var.f(), mog0Var.b(), this.e, this.d, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        nog0 nog0VarB = b(iA);
        nog0VarB.lock();
        try {
            nog0VarB.j();
            AtomicReferenceArray atomicReferenceArray = nog0VarB.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            log0 log0Var = (log0) atomicReferenceArray.get(length);
            for (log0 log0VarC = log0Var; log0VarC != null; log0VarC = log0VarC.c()) {
                Object key = log0VarC.getKey();
                if (log0VarC.b() == iA && key != null && nog0VarB.a.e.c(obj, key)) {
                    Object value = log0VarC.getValue();
                    if (value == null && log0VarC.getValue() != null) {
                        return null;
                    }
                    nog0VarB.c++;
                    log0 log0VarI = nog0VarB.i(log0Var, log0VarC);
                    int i = nog0VarB.b - 1;
                    atomicReferenceArray.set(length, log0VarI);
                    nog0VarB.b = i;
                    return value;
                }
            }
            return null;
        } finally {
            nog0VarB.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        nog0 nog0VarB = b(iA);
        nog0VarB.lock();
        try {
            nog0VarB.j();
            AtomicReferenceArray atomicReferenceArray = nog0VarB.e;
            int length = (atomicReferenceArray.length() - 1) & iA;
            log0 log0Var = (log0) atomicReferenceArray.get(length);
            for (log0 log0VarC = log0Var; log0VarC != null; log0VarC = log0VarC.c()) {
                Object key = log0VarC.getKey();
                if (log0VarC.b() == iA && key != null && nog0VarB.a.e.c(obj, key)) {
                    Object value = log0VarC.getValue();
                    if (value == null) {
                        if (log0VarC.getValue() == null) {
                            nog0VarB.c++;
                            log0 log0VarI = nog0VarB.i(log0Var, log0VarC);
                            int i = nog0VarB.b - 1;
                            atomicReferenceArray.set(length, log0VarI);
                            nog0VarB.b = i;
                        }
                        return null;
                    }
                    nog0VarB.c++;
                    nog0VarB.l(log0VarC, obj2);
                    return value;
                }
            }
            return null;
        } finally {
            nog0VarB.unlock();
        }
    }
}
