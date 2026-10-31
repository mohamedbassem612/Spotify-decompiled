package app.p000rive.core;

import app.p000rive.RiveLog;
import app.p000rive.RiveResourceClosedException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.f4i1;
import p.fd21;
import p.gvg;
import p.hab0;
import p.iu30;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lapp/rive/core/RCPointer;", "Lapp/rive/core/RefCounted;", "", "cppPointer", "", "label", "Lkotlin/Function1;", "Lp/rih1;", "onDispose", "<init>", "(JLjava/lang/String;Lp/iu30;)V", "source", "acquire", "(Ljava/lang/String;)V", "", "tryAcquire$kotlin_release", "(Ljava/lang/String;)Z", "tryAcquire", "reason", "release", "(Ljava/lang/String;Ljava/lang/String;)V", "J", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lp/iu30;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "disposed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "getRefCount", "()I", "refCount", "isDisposed", "()Z", "getPointer", "()J", "pointer", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RCPointer implements RefCounted {
    private static final String TAG = "Rive/RCPointer";
    private final long cppPointer;
    private final String label;
    private final iu30 onDispose;
    public static final int $stable = 8;
    private AtomicInteger referenceCount = new AtomicInteger(1);
    private AtomicBoolean disposed = new AtomicBoolean(false);

    /* JADX INFO: renamed from: app.rive.core.RCPointer$release$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ String $reasonLog;
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2) {
            super(0);
            this.$source = str;
            this.$reasonLog = str2;
        }

        public final String invoke() {
            String label = RCPointer.this.getLabel();
            String str = this.$source;
            String str2 = this.$reasonLog;
            return fd21.h(gvg.n("Releasing ", label, " (source: ", str, str2), "; ref count before release: ", RCPointer.this.referenceCount.get(), ")");
        }
    }

    /* JADX INFO: renamed from: app.rive.core.RCPointer$release$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends hab0 implements Function0 {
        public AnonymousClass3() {
            super(0);
        }

        public final String invoke() {
            return l1d.m("Disposing ", RCPointer.this.getLabel());
        }
    }

    public RCPointer(long j, String str, iu30 iu30Var) {
        this.cppPointer = j;
        this.label = str;
        this.onDispose = iu30Var;
    }

    @Override // app.p000rive.core.RefCounted
    public void acquire(String source) {
        if (!tryAcquire$kotlin_release(source)) {
            throw new RiveResourceClosedException(f4i1.f("RCPointer ", this.label, " is closed"));
        }
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getPointer() {
        if (this.referenceCount.get() > 0) {
            return this.cppPointer;
        }
        throw new RiveResourceClosedException(f4i1.f("RCPointer ", this.label, " is closed"));
    }

    @Override // app.p000rive.core.RefCounted
    public int getRefCount() {
        return this.referenceCount.get();
    }

    @Override // app.p000rive.core.RefCounted
    public boolean isDisposed() {
        return this.disposed.get();
    }

    @Override // app.p000rive.core.RefCounted
    public void release(String source, String reason) {
        String strConcat = reason.length() == 0 ? "" : "; reason: ".concat(reason);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(source, strConcat);
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().v(TAG, anonymousClass1);
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            StringBuilder sbN = gvg.n("RCPointer ", this.label, " (source: ", source, strConcat);
            sbN.append(") released too many times.");
            throw new IllegalStateException(sbN.toString().toString());
        }
        if (iDecrementAndGet == 0) {
            riveLog.getLogger().d(TAG, new AnonymousClass3());
            this.onDispose.invoke(Long.valueOf(this.cppPointer));
            this.disposed.set(true);
        }
    }

    public final boolean tryAcquire$kotlin_release(String source) {
        int i;
        do {
            i = this.referenceCount.get();
            if (i <= 0) {
                return false;
            }
        } while (!this.referenceCount.compareAndSet(i, i + 1));
        RiveLog.INSTANCE.getLogger().v(TAG, new RCPointer$tryAcquire$1(this, source, i));
        return true;
    }
}
