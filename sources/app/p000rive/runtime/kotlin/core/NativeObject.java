package app.p000rive.runtime.kotlin.core;

import app.p000rive.runtime.kotlin.core.errors.RiveException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import p.f46;
import p.f4i1;
import p.hab0;
import p.iu30;
import p.n561;
import p.r7h;
import p.rlu;
import p.u890;
import p.z561;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\tR\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R$\u0010,\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0005¨\u0006."}, d2 = {"Lapp/rive/runtime/kotlin/core/NativeObject;", "Lapp/rive/runtime/kotlin/core/RefCount;", "", "initialPointer", "<init>", "(J)V", "", "Ljava/lang/StackTraceElement;", "buildCombinedStackTrace", "()Ljava/util/List;", "Lp/rih1;", "dispose", "()V", "pointer", "cppDelete", "", "acquire", "()I", "release", "Ljava/util/concurrent/atomic/AtomicLong;", "unsafeCppPointer", "Ljava/util/concurrent/atomic/AtomicLong;", "Lp/n561;", "disposeStackTrace", "Lp/n561;", "Ljava/util/concurrent/atomic/AtomicInteger;", "refs", "Ljava/util/concurrent/atomic/AtomicInteger;", "getRefs", "()Ljava/util/concurrent/atomic/AtomicInteger;", "setRefs", "(Ljava/util/concurrent/atomic/AtomicInteger;)V", "", "dependencies", "Ljava/util/List;", "getDependencies", "", "getHasCppObject", "()Z", "hasCppObject", "value", "getCppPointer", "()J", "setCppPointer", "cppPointer", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class NativeObject implements RefCount {
    public static final long NULL_POINTER = 0;
    private final List<RefCount> dependencies;
    private n561 disposeStackTrace;
    private AtomicInteger refs;
    private final AtomicLong unsafeCppPointer;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.NativeObject$buildCombinedStackTrace$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/StackTraceElement;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements iu30 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        public final Boolean invoke(StackTraceElement stackTraceElement) {
            return Boolean.valueOf(!u890.j(stackTraceElement.getClassName(), NativeObject.class.getName()));
        }
    }

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.NativeObject$dispose$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/StackTraceElement;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C01042 extends hab0 implements iu30 {
        public static final C01042 INSTANCE = new C01042();

        public C01042() {
            super(1);
        }

        public final Boolean invoke(StackTraceElement stackTraceElement) {
            return Boolean.valueOf(!u890.j(stackTraceElement.getClassName(), NativeObject.class.getName()));
        }
    }

    public NativeObject(long j) {
        this.unsafeCppPointer = new AtomicLong(j);
        this.refs = new AtomicInteger(j == 0 ? 0 : 1);
        this.dependencies = Collections.synchronizedList(new ArrayList());
    }

    private final List<StackTraceElement> buildCombinedStackTrace() {
        ArrayList arrayList = new ArrayList();
        n561 n561Var = this.disposeStackTrace;
        if (n561Var != null) {
            arrayList.add(new StackTraceElement("--- Stack Trace for NativeObject Dispose ---", "", null, -1));
            r7h.X(arrayList, n561Var);
            arrayList.add(new StackTraceElement("--- Current Stack Trace ---", "", null, -1));
        }
        r7h.X(arrayList, z561.S(new rlu(f46.I(Thread.currentThread().getStackTrace()), AnonymousClass2.INSTANCE, (byte) 1), 1));
        return arrayList;
    }

    private final synchronized void dispose() {
        try {
            if (this.refs.get() != 0) {
                throw new IllegalArgumentException("Cannot dispose an object with a non-zero reference count.");
            }
            this.disposeStackTrace = new rlu(f46.I(Thread.currentThread().getStackTrace()), C01042.INSTANCE, (byte) 1);
            List<RefCount> list = this.dependencies;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((RefCount) it.next()).release();
            }
            list.clear();
            cppDelete(this.unsafeCppPointer.get());
            this.unsafeCppPointer.set(0L);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public synchronized int acquire() {
        int iAcquire;
        iAcquire = RefCount.DefaultImpls.acquire(this);
        if (iAcquire <= 1) {
            throw new IllegalArgumentException("Cannot acquire a disposed object.");
        }
        return iAcquire;
    }

    public void cppDelete(long pointer) {
    }

    public final long getCppPointer() throws RiveException {
        long j = this.unsafeCppPointer.get();
        if (j != 0) {
            return j;
        }
        RiveException riveException = new RiveException(f4i1.f("Accessing disposed C++ object ", getClass().getSimpleName(), "."));
        riveException.setStackTrace((StackTraceElement[]) buildCombinedStackTrace().toArray(new StackTraceElement[0]));
        throw riveException;
    }

    public final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final boolean getHasCppObject() {
        return this.unsafeCppPointer.get() != 0;
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public int getRefCount() {
        return RefCount.DefaultImpls.getRefCount(this);
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public final AtomicInteger getRefs() {
        return this.refs;
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public synchronized int release() {
        int iRelease;
        iRelease = RefCount.DefaultImpls.release(this);
        if (iRelease < 0) {
            throw new IllegalArgumentException("Cannot release a disposed object.");
        }
        if (iRelease == 0 && getHasCppObject()) {
            dispose();
        }
        return iRelease;
    }

    public final void setCppPointer(long j) {
        this.unsafeCppPointer.set(j);
    }

    @Override // app.p000rive.runtime.kotlin.core.RefCount
    public final void setRefs(AtomicInteger atomicInteger) {
        this.refs = atomicInteger;
    }
}
