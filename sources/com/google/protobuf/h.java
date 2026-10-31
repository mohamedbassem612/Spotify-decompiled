package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p.a290;
import p.b290;
import p.bhn0;
import p.cy30;
import p.dlh1;
import p.e290;
import p.eg;
import p.er80;
import p.f4i1;
import p.gf40;
import p.h290;
import p.hhg1;
import p.i6b;
import p.if40;
import p.jf40;
import p.k220;
import p.kul1;
import p.l36;
import p.lwg;
import p.oiy0;
import p.phc;
import p.poz0;
import p.q8;
import p.qzr0;
import p.rwg;
import p.s190;
import p.s2j0;
import p.s8;
import p.siy0;
import p.sm41;
import p.t190;
import p.t4f0;
import p.uqu;
import p.uz00;
import p.xvz0;
import p.y190;
import p.yq20;
import p.zob;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class h extends s8 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, h> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected n unknownFields;

    public h() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = n.f;
    }

    public static s190 emptyBooleanList() {
        return zob.e;
    }

    public static t190 emptyDoubleList() {
        return uqu.e;
    }

    public static a290 emptyFloatList() {
        return yq20.e;
    }

    public static b290 emptyIntList() {
        return er80.e;
    }

    public static e290 emptyLongList() {
        return t4f0.e;
    }

    public static <E> h290 emptyProtobufList() {
        return siy0.e;
    }

    public static void f(h hVar) throws InvalidProtocolBufferException {
        if (hVar != null && !hVar.isInitialized()) {
            throw new InvalidProtocolBufferException(hVar.newUninitializedMessageException().getMessage());
        }
    }

    public static <T extends h> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                k220.p("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        try {
            T t2 = (T) ((h) dlh1.a.allocateInstance(cls)).getDefaultInstanceForType();
            if (t2 != null) {
                defaultInstanceMap.put((Class<?>) cls, t2);
                return t2;
            }
            bhn0.w();
            return null;
        } catch (InstantiationException e2) {
            bhn0.p(e2);
            return null;
        }
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            bhn0.o(cy30.p("Generated message class \"", cls.getName(), "\" missing method \"", str, "\"."), e);
            return null;
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
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

    public static final boolean k(h hVar, boolean z) {
        byte bByteValue = ((Byte) hVar.dynamicMethod(jf40.a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        oiy0 oiy0Var = oiy0.c;
        oiy0Var.getClass();
        boolean zB = oiy0Var.a(hVar.getClass()).b(hVar);
        if (z) {
            hVar.dynamicMethod(jf40.b, zB ? hVar : null, null);
        }
        return zB;
    }

    public static h l(h hVar, InputStream inputStream, uz00 uz00Var) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            lwg lwgVarG = lwg.g(new q8(inputStream, lwg.s(inputStream, i), (byte) 1));
            h partialFrom = parsePartialFrom(hVar, lwgVarG, uz00Var);
            lwgVarG.a(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e) {
            if (e.a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage(), e2);
        }
    }

    public static h m(h hVar, byte[] bArr, int i, uz00 uz00Var) throws InvalidProtocolBufferException {
        if (i == 0) {
            return hVar;
        }
        h hVarNewMutableInstance = hVar.newMutableInstance();
        try {
            oiy0 oiy0Var = oiy0.c;
            oiy0Var.getClass();
            sm41 sm41VarA = oiy0Var.a(hVarNewMutableInstance.getClass());
            sm41VarA.i(hVarNewMutableInstance, bArr, 0, i, new l36(uz00Var));
            sm41VarA.a(hVarNewMutableInstance);
            return hVarNewMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            if (e.a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static b290 mutableCopy(b290 b290Var) {
        return ((er80) b290Var).h(b290Var.size() * 2);
    }

    public static Object newMessageInfo(s2j0 s2j0Var, String str, Object[] objArr) {
        return new xvz0(s2j0Var, str, objArr);
    }

    public static <ContainingType extends s2j0, Type> if40 newRepeatedGeneratedExtension(ContainingType containingtype, s2j0 s2j0Var, y190 y190Var, int i, kul1 kul1Var, boolean z, Class cls) {
        return new if40(containingtype, siy0.e, s2j0Var, new gf40(y190Var, i, kul1Var, true, z));
    }

    public static <ContainingType extends s2j0, Type> if40 newSingularGeneratedExtension(ContainingType containingtype, Type type, s2j0 s2j0Var, y190 y190Var, int i, kul1 kul1Var, Class cls) {
        return new if40(containingtype, type, s2j0Var, new gf40(y190Var, i, kul1Var, false, false));
    }

    public static <T extends h> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) l(t, inputStream, uz00.a());
        f(t2);
        return t2;
    }

    public static <T extends h> T parseFrom(T t, ByteBuffer byteBuffer, uz00 uz00Var) throws InvalidProtocolBufferException {
        b bVarF;
        if (byteBuffer.hasArray()) {
            bVarF = lwg.f(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && d.E()) {
            bVarF = new d(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            bVarF = lwg.f(bArr, 0, iRemaining, true);
        }
        T t2 = (T) parseFrom(t, bVarF, uz00Var);
        f(t2);
        return t2;
    }

    public static <T extends h> T parsePartialFrom(T t, lwg lwgVar, uz00 uz00Var) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            oiy0 oiy0Var = oiy0.c;
            oiy0Var.getClass();
            sm41 sm41VarA = oiy0Var.a(t2.getClass());
            e eVar = lwgVar.c;
            if (eVar == null) {
                eVar = new e(lwgVar);
            }
            sm41VarA.j(t2, eVar, uz00Var);
            sm41VarA.a(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            if (e.a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends h> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(jf40.c, null, null);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        oiy0 oiy0Var = oiy0.c;
        oiy0Var.getClass();
        return oiy0Var.a(getClass()).e(this);
    }

    public final <MessageType2 extends h, BuilderType2 extends g> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(jf40.e, null, null);
    }

    public abstract Object dynamicMethod(jf40 jf40Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oiy0 oiy0Var = oiy0.c;
        oiy0Var.getClass();
        return oiy0Var.a(getClass()).g(this, (h) obj);
    }

    @Override // p.v2j0
    public final h getDefaultInstanceForType() {
        return (h) dynamicMethod(jf40.f, null, null);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final qzr0 getParserForType() {
        return (qzr0) dynamicMethod(jf40.g, null, null);
    }

    @Override // p.s8
    public int getSerializedSize(sm41 sm41Var) {
        int iF;
        int iF2;
        if (isMutable()) {
            if (sm41Var == null) {
                oiy0 oiy0Var = oiy0.c;
                oiy0Var.getClass();
                iF2 = oiy0Var.a(getClass()).f(this);
            } else {
                iF2 = sm41Var.f(this);
            }
            if (iF2 >= 0) {
                return iF2;
            }
            eg.m(f4i1.c(iF2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (sm41Var == null) {
            oiy0 oiy0Var2 = oiy0.c;
            oiy0Var2.getClass();
            iF = oiy0Var2.a(getClass()).f(this);
        } else {
            iF = sm41Var.f(this);
        }
        setMemoizedSerializedSize(iF);
        return iF;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // p.v2j0
    public final boolean isInitialized() {
        return k(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        oiy0 oiy0Var = oiy0.c;
        oiy0Var.getClass();
        oiy0Var.a(getClass()).a(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, phc phcVar) {
        n nVar = this.unknownFields;
        if (nVar == n.f) {
            nVar = new n();
            this.unknownFields = nVar;
        }
        nVar.a();
        if (i != 0) {
            nVar.f(poz0.E(i, 2), phcVar);
        } else {
            hhg1.n("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(n nVar) {
        this.unknownFields = n.e(this.unknownFields, nVar);
    }

    public void mergeVarintField(int i, int i2) {
        n nVar = this.unknownFields;
        if (nVar == n.f) {
            nVar = new n();
            this.unknownFields = nVar;
        }
        nVar.a();
        if (i != 0) {
            nVar.f(poz0.E(i, 0), Long.valueOf(i2));
        } else {
            hhg1.n("Zero is not a valid field number.");
        }
    }

    @Override // p.s2j0
    public final g newBuilderForType() {
        return (g) dynamicMethod(jf40.e, null, null);
    }

    public h newMutableInstance() {
        return (h) dynamicMethod(jf40.d, null, null);
    }

    public boolean parseUnknownField(int i, lwg lwgVar) {
        if (poz0.x(i) == 4) {
            return false;
        }
        n nVar = this.unknownFields;
        if (nVar == n.f) {
            nVar = new n();
            this.unknownFields = nVar;
        }
        return nVar.d(i, lwgVar);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            eg.m(f4i1.c(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    @Override // p.s2j0
    public final g toBuilder() {
        return ((g) dynamicMethod(jf40.e, null, null)).mergeFrom(this);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = i.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        i.c(this, sb, 0);
        return sb.toString();
    }

    @Override // p.s2j0
    public void writeTo(rwg rwgVar) {
        oiy0 oiy0Var = oiy0.c;
        oiy0Var.getClass();
        oiy0Var.a(getClass()).h(this, i6b.k(rwgVar));
    }

    public final <MessageType2 extends h, BuilderType2 extends g> BuilderType2 createBuilder(MessageType2 messagetype2) {
        return (BuilderType2) createBuilder().mergeFrom((h) messagetype2);
    }

    public static <T extends h> T parseDelimitedFrom(T t, InputStream inputStream, uz00 uz00Var) throws InvalidProtocolBufferException {
        T t2 = (T) l(t, inputStream, uz00Var);
        f(t2);
        return t2;
    }

    public static e290 mutableCopy(e290 e290Var) {
        return ((t4f0) e290Var).h(e290Var.size() * 2);
    }

    public static a290 mutableCopy(a290 a290Var) {
        return ((yq20) a290Var).h(a290Var.size() * 2);
    }

    public static t190 mutableCopy(t190 t190Var) {
        return ((uqu) t190Var).h(t190Var.size() * 2);
    }

    public static s190 mutableCopy(s190 s190Var) {
        return ((zob) s190Var).h(s190Var.size() * 2);
    }

    public static <E> h290 mutableCopy(h290 h290Var) {
        return h290Var.h(h290Var.size() * 2);
    }

    public static <T extends h> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, uz00.a());
    }

    public static <T extends h> T parseFrom(T t, phc phcVar) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, phcVar, uz00.a());
        f(t2);
        return t2;
    }

    public static <T extends h> T parseFrom(T t, phc phcVar, uz00 uz00Var) throws InvalidProtocolBufferException {
        lwg lwgVarP = phcVar.p();
        T t2 = (T) parsePartialFrom(t, lwgVarP, uz00Var);
        lwgVarP.a(0);
        f(t2);
        return t2;
    }

    public static <T extends h> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T t2 = (T) m(t, bArr, bArr.length, uz00.a());
        f(t2);
        return t2;
    }

    public static <T extends h> T parseFrom(T t, byte[] bArr, uz00 uz00Var) throws InvalidProtocolBufferException {
        T t2 = (T) m(t, bArr, bArr.length, uz00Var);
        f(t2);
        return t2;
    }

    @Override // p.s2j0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends h> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, lwg.g(inputStream), uz00.a());
        f(t2);
        return t2;
    }

    public static <T extends h> T parseFrom(T t, InputStream inputStream, uz00 uz00Var) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, lwg.g(inputStream), uz00Var);
        f(t2);
        return t2;
    }

    public static <T extends h> T parseFrom(T t, lwg lwgVar) {
        return (T) parseFrom(t, lwgVar, uz00.a());
    }

    public static <T extends h> T parseFrom(T t, lwg lwgVar, uz00 uz00Var) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, lwgVar, uz00Var);
        f(t2);
        return t2;
    }

    public static <T extends h> T parsePartialFrom(T t, lwg lwgVar) {
        return (T) parsePartialFrom(t, lwgVar, uz00.a());
    }
}
