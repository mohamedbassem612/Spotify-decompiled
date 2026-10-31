package app.p000rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.bpb1;
import p.d5p1;
import p.gio1;
import p.hab0;
import p.wen0;
import p.zob1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0003H\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0087 ¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001aH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00028\u0000H$¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00028\u0000H$¢\u0006\u0004\b!\u0010\"J\u000f\u0010%\u001a\u00020\u0015H\u0010¢\u0006\u0004\b#\u0010$R\"\u0010\u0006\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0017R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0011\u00104\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b2\u00103R$\u0010 \u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010\"R\u0014\u00109\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lapp/rive/runtime/kotlin/core/ViewModelProperty;", "T", "Lapp/rive/runtime/kotlin/core/NativeObject;", "", "unsafeCppPointer", "Ljava/util/concurrent/locks/ReentrantLock;", "fileLock", "<init>", "(JLjava/util/concurrent/locks/ReentrantLock;)V", "cppPointer", "", "cppFlushChanges", "(J)Z", "", "cppName", "(J)Ljava/lang/String;", "cppHasChanged", "", "release", "()I", "newFileLock", "Lp/rih1;", "updateFileLock$kotlin_release", "(Ljava/util/concurrent/locks/ReentrantLock;)V", "updateFileLock", "R", "Lkotlin/Function0;", "block", "withLock", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "nativeGetValue", "()Ljava/lang/Object;", "value", "nativeSetValue", "(Ljava/lang/Object;)V", "pollChanges$kotlin_release", "()V", "pollChanges", "Ljava/util/concurrent/locks/ReentrantLock;", "getFileLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "setFileLock", "Lp/wen0;", "_valueFlow", "Lp/wen0;", "Lp/zob1;", "valueFlow", "Lp/zob1;", "getValueFlow", "()Lp/zob1;", "getName", "()Ljava/lang/String;", "name", "getValue", "setValue", "isSubscribed$kotlin_release", "()Z", "isSubscribed", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ViewModelProperty<T> extends NativeObject {
    public static final int $stable = 8;
    private final wen0 _valueFlow;
    private volatile ReentrantLock fileLock;
    private final zob1 valueFlow;

    /* JADX INFO: renamed from: app.rive.runtime.kotlin.core.ViewModelProperty$release$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "T", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ ViewModelProperty<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewModelProperty<T> viewModelProperty) {
            super(0);
            this.this$0 = viewModelProperty;
        }

        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Integer m528invoke() {
            return Integer.valueOf(ViewModelProperty.super.release());
        }
    }

    public ViewModelProperty(long j, ReentrantLock reentrantLock) {
        super(j);
        this.fileLock = reentrantLock;
        bpb1 bpb1VarB = gio1.b(withLock(new ViewModelProperty$_valueFlow$1(this)));
        this._valueFlow = bpb1VarB;
        this.valueFlow = d5p1.h(bpb1VarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native boolean cppFlushChanges(long cppPointer);

    public final native boolean cppHasChanged(long cppPointer);

    public final native String cppName(long cppPointer);

    public final ReentrantLock getFileLock() {
        return this.fileLock;
    }

    public final String getName() {
        return cppName(getCppPointer());
    }

    public final T getValue() {
        return (T) this._valueFlow.getValue();
    }

    public final zob1 getValueFlow() {
        return this.valueFlow;
    }

    public final boolean isSubscribed$kotlin_release() {
        return ((Number) this._valueFlow.j().getValue()).intValue() > 0;
    }

    public abstract T nativeGetValue();

    public abstract void nativeSetValue(T value);

    public void pollChanges$kotlin_release() {
        withLock(new ViewModelProperty$pollChanges$1(this));
    }

    @Override // app.p000rive.runtime.kotlin.core.NativeObject, app.p000rive.runtime.kotlin.core.RefCount
    public int release() {
        return ((Number) withLock(new AnonymousClass1(this))).intValue();
    }

    public final void setFileLock(ReentrantLock reentrantLock) {
        this.fileLock = reentrantLock;
    }

    public final void setValue(T t) {
        withLock(new ViewModelProperty$value$1(this, t));
        this._valueFlow.l(t);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateFileLock$kotlin_release(java.util.concurrent.locks.ReentrantLock r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.locks.ReentrantLock r0 = r5.fileLock
            if (r0 != r6) goto L6
            goto L69
        L6:
            r1 = 1
            r2 = 0
            if (r0 != r6) goto L1a
            monitor-enter(r0)
            java.util.concurrent.locks.ReentrantLock r3 = r5.fileLock     // Catch: java.lang.Throwable -> L13
            if (r3 != r0) goto L15
            r5.setFileLock(r6)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r5 = move-exception
            goto L18
        L15:
            r1 = r2
        L16:
            monitor-exit(r0)
            goto L67
        L18:
            monitor-exit(r0)
            throw r5
        L1a:
            int r3 = java.lang.System.identityHashCode(r0)
            int r4 = java.lang.System.identityHashCode(r6)
            if (r3 >= r4) goto L3a
            monitor-enter(r0)
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.locks.ReentrantLock r3 = r5.fileLock     // Catch: java.lang.Throwable -> L2e
            if (r3 != r0) goto L30
            r5.setFileLock(r6)     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r5 = move-exception
            goto L36
        L30:
            r1 = r2
        L31:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)
            goto L67
        L34:
            r5 = move-exception
            goto L38
        L36:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            throw r5     // Catch: java.lang.Throwable -> L34
        L38:
            monitor-exit(r0)
            throw r5
        L3a:
            if (r3 <= r4) goto L52
            monitor-enter(r6)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.locks.ReentrantLock r3 = r5.fileLock     // Catch: java.lang.Throwable -> L46
            if (r3 != r0) goto L48
            r5.setFileLock(r6)     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r5 = move-exception
            goto L4e
        L48:
            r1 = r2
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r6)
            goto L67
        L4c:
            r5 = move-exception
            goto L50
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4c
            throw r5     // Catch: java.lang.Throwable -> L4c
        L50:
            monitor-exit(r6)
            throw r5
        L52:
            java.lang.Object r3 = app.p000rive.runtime.kotlin.core.ViewModelInstanceKt.access$getFileLockUpdateTieLock$p()
            monitor-enter(r3)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L6a
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L6c
            java.util.concurrent.locks.ReentrantLock r4 = r5.fileLock     // Catch: java.lang.Throwable -> L61
            if (r4 != r0) goto L63
            r5.setFileLock(r6)     // Catch: java.lang.Throwable -> L61
            goto L64
        L61:
            r5 = move-exception
            goto L6e
        L63:
            r1 = r2
        L64:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r3)
        L67:
            if (r1 == 0) goto L0
        L69:
            return
        L6a:
            r5 = move-exception
            goto L72
        L6c:
            r5 = move-exception
            goto L70
        L6e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6c
            throw r5     // Catch: java.lang.Throwable -> L6c
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r5     // Catch: java.lang.Throwable -> L6a
        L72:
            monitor-exit(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.p000rive.runtime.kotlin.core.ViewModelProperty.updateFileLock$kotlin_release(java.util.concurrent.locks.ReentrantLock):void");
    }

    public final <R> R withLock(Function0 block) {
        while (true) {
            ReentrantLock fileLock = getFileLock();
            synchronized (fileLock) {
                if (getFileLock() == fileLock) {
                    return (R) block.invoke();
                }
            }
        }
    }
}
