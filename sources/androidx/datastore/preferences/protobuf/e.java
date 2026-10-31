package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p.bhn0;
import p.elh1;
import p.k220;
import p.piy0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class e extends a {
    private static Map<Object, e> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected k unknownFields;

    public e() {
        this.memoizedHashCode = 0;
        this.unknownFields = k.f;
        this.memoizedSerializedSize = -1;
    }

    public static e e(Class cls) {
        e eVar = defaultInstanceMap.get(cls);
        if (eVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                eVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                k220.p("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (eVar != null) {
            return eVar;
        }
        try {
            e eVar2 = (e) ((e) elh1.b.allocateInstance(cls)).d(6);
            if (eVar2 != null) {
                defaultInstanceMap.put(cls, eVar2);
                return eVar2;
            }
            bhn0.w();
            return null;
        } catch (InstantiationException e2) {
            bhn0.p(e2);
            return null;
        }
    }

    public static Object f(Method method, e eVar, Object... objArr) {
        try {
            return method.invoke(eVar, objArr);
        } catch (IllegalAccessException e) {
            bhn0.o("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            bhn0.o("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static void h(Class cls, e eVar) {
        defaultInstanceMap.put(cls, eVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        piy0 piy0Var = piy0.c;
        piy0Var.getClass();
        int iD = piy0Var.a(getClass()).d(this);
        this.memoizedSerializedSize = iD;
        return iD;
    }

    public abstract Object d(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((e) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        piy0 piy0Var = piy0.c;
        piy0Var.getClass();
        return piy0Var.a(getClass()).h(this, (e) obj);
    }

    public final boolean g() {
        byte bByteValue = ((Byte) d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        piy0 piy0Var = piy0.c;
        piy0Var.getClass();
        boolean zB = piy0Var.a(getClass()).b(this);
        d(2);
        return zB;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        piy0 piy0Var = piy0.c;
        piy0Var.getClass();
        int iG = piy0Var.a(getClass()).g(this);
        this.memoizedHashCode = iG;
        return iG;
    }

    public final String toString() {
        return f.d(this, super.toString());
    }
}
