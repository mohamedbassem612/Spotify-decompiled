package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p.bhn0;
import p.clh1;
import p.ghc;
import p.k220;
import p.m36;
import p.miy0;
import p.ngc;
import p.ohc;
import p.rm41;
import p.tz00;
import p.u8;
import p.we40;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class e extends u8 {
    private static Map<Object, e> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected k unknownFields;

    public e() {
        this.memoizedHashCode = 0;
        this.unknownFields = k.f;
        this.memoizedSerializedSize = -1;
    }

    public static e g(Class cls) {
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
            e eVar2 = (e) ((e) clh1.b.allocateInstance(cls)).f(6);
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

    public static Object h(Method method, e eVar, Object... objArr) {
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

    public static e j(e eVar, ohc ohcVar, tz00 tz00Var) throws InvalidProtocolBufferException {
        ghc ghcVar = (ghc) ohcVar;
        byte[] bArr = ghcVar.d;
        int iK = ghcVar.k();
        int size = ghcVar.size();
        a aVar = new a(bArr, iK, size, true);
        try {
            aVar.g(size);
            e eVar2 = (e) eVar.f(4);
            try {
                miy0 miy0Var = miy0.c;
                miy0Var.getClass();
                rm41 rm41VarA = miy0Var.a(eVar2.getClass());
                b bVar = (b) ((ngc) aVar).b;
                if (bVar == null) {
                    bVar = new b(aVar);
                }
                rm41VarA.j(eVar2, bVar, tz00Var);
                rm41VarA.a(eVar2);
                if (aVar.h != 0) {
                    throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
                }
                if (eVar2.i()) {
                    return eVar2;
                }
                throw new UninitializedMessageException().a();
            } catch (IOException e) {
                if (e.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e.getCause());
                }
                throw new InvalidProtocolBufferException(e.getMessage());
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e2.getCause());
                }
                throw e2;
            }
        } catch (InvalidProtocolBufferException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static e k(e eVar, byte[] bArr, tz00 tz00Var) throws InvalidProtocolBufferException {
        int length = bArr.length;
        e eVar2 = (e) eVar.f(4);
        try {
            miy0 miy0Var = miy0.c;
            miy0Var.getClass();
            rm41 rm41VarA = miy0Var.a(eVar2.getClass());
            rm41VarA.i(eVar2, bArr, 0, length, new m36(tz00Var));
            rm41VarA.a(eVar2);
            if (eVar2.memoizedHashCode != 0) {
                throw new RuntimeException();
            }
            if (eVar2.i()) {
                return eVar2;
            }
            throw new UninitializedMessageException().a();
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public static void l(Class cls, e eVar) {
        defaultInstanceMap.put(cls, eVar);
    }

    @Override // p.u8
    public final int a() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        miy0 miy0Var = miy0.c;
        miy0Var.getClass();
        int iG = miy0Var.a(getClass()).g(this);
        this.memoizedSerializedSize = iG;
        return iG;
    }

    public final we40 e() {
        return (we40) f(5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((e) f(6)).getClass().isInstance(obj)) {
            return false;
        }
        miy0 miy0Var = miy0.c;
        miy0Var.getClass();
        return miy0Var.a(getClass()).e(this, (e) obj);
    }

    public abstract Object f(int i);

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        miy0 miy0Var = miy0.c;
        miy0Var.getClass();
        int iF = miy0Var.a(getClass()).f(this);
        this.memoizedHashCode = iF;
        return iF;
    }

    public final boolean i() {
        byte bByteValue = ((Byte) f(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        miy0 miy0Var = miy0.c;
        miy0Var.getClass();
        boolean zB = miy0Var.a(getClass()).b(this);
        f(2);
        return zB;
    }

    public final String toString() {
        return f.d(this, super.toString());
    }
}
