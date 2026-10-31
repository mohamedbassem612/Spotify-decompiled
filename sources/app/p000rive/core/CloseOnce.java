package app.p000rive.core;

import app.p000rive.RiveLog;
import app.p000rive.RiveResourceClosedException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.f4i1;
import p.hab0;
import p.l1d;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lapp/rive/core/CloseOnce;", "Lapp/rive/core/CheckableAutoCloseable;", "", "label", "Lkotlin/Function0;", "Lp/rih1;", "onClose", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "close", "()V", "checkOpen", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "getClosed", "()Z", "closed", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CloseOnce implements CheckableAutoCloseable {
    public static final int $stable = 8;
    private final AtomicBoolean _closed = new AtomicBoolean(false);
    private final String label;
    private final Function0 onClose;

    /* JADX INFO: renamed from: app.rive.core.CloseOnce$close$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        public AnonymousClass1() {
            super(0);
        }

        public final String invoke() {
            return f4i1.f("Attempted to close already closed resource (", CloseOnce.this.label, "). While safe, this may represent a mistake in ownership. The resource should only be closed once.");
        }
    }

    /* JADX INFO: renamed from: app.rive.core.CloseOnce$close$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends hab0 implements Function0 {
        public AnonymousClass2() {
            super(0);
        }

        public final String invoke() {
            return l1d.m("Closing resource: ", CloseOnce.this.label);
        }
    }

    public CloseOnce(String str, Function0 function0) {
        this.label = str;
        this.onClose = function0;
    }

    public final void checkOpen() {
        if (getClosed()) {
            throw new RiveResourceClosedException(f4i1.e(this.label, " is closed"));
        }
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        if (this._closed.getAndSet(true)) {
            RiveLog.INSTANCE.getLogger().w("CloseOnce", new AnonymousClass1());
        } else {
            RiveLog.INSTANCE.getLogger().v("CloseOnce", new AnonymousClass2());
            this.onClose.invoke();
        }
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this._closed.get();
    }
}
