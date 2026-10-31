package androidx.glance.appwidget.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p.bhn0;
import p.blh1;
import p.eg;
import p.f4i1;
import p.k220;
import p.liy0;
import p.qm41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class e extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, e> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected k unknownFields;

    public e() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = k.f;
    }

    public static e c(Class cls) {
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
        e eVar2 = (e) ((e) blh1.a(cls)).b(6);
        if (eVar2 != null) {
            defaultInstanceMap.put(cls, eVar2);
            return eVar2;
        }
        bhn0.w();
        return null;
    }

    public static Object d(Method method, e eVar, Object... objArr) {
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

    public static final boolean e(e eVar, boolean z) {
        byte bByteValue = ((Byte) eVar.b(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = liy0.a().c(eVar).b(eVar);
        if (z) {
            eVar.b(2);
        }
        return zB;
    }

    public static void i(Class cls, e eVar) {
        eVar.g();
        defaultInstanceMap.put(cls, eVar);
    }

    @Override // androidx.glance.appwidget.protobuf.a
    public final int a(qm41 qm41Var) {
        if (f()) {
            int iG = qm41Var == null ? liy0.a().c(this).g(this) : qm41Var.g(this);
            if (iG >= 0) {
                return iG;
            }
            eg.m(f4i1.c(iG, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        int iG2 = qm41Var == null ? liy0.a().c(this).g(this) : qm41Var.g(this);
        j(iG2);
        return iG2;
    }

    public abstract Object b(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return liy0.a().c(this).i(this, (e) obj);
        }
        return false;
    }

    public final boolean f() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void g() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final e h() {
        return (e) b(4);
    }

    public final int hashCode() {
        if (f()) {
            return liy0.a().c(this).e(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iE = liy0.a().c(this).e(this);
        this.memoizedHashCode = iE;
        return iE;
    }

    public final void j(int i) {
        if (i < 0) {
            eg.m(f4i1.c(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        return f.d(this, super.toString());
    }
}
