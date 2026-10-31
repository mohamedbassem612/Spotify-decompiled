package app.p000rive.core;

import app.p000rive.RiveLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.bhn0;
import p.cy30;
import p.f4i1;
import p.hab0;
import p.iu30;
import p.l1d;
import p.rih1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001'B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006HÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0012R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010$\u001a\u00020\u001b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010&\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\f¨\u0006("}, d2 = {"Lapp/rive/core/UniquePointer;", "Lapp/rive/core/CheckableAutoCloseable;", "", "cppPointer", "", "label", "Lkotlin/Function1;", "Lp/rih1;", "onDispose", "<init>", "(JLjava/lang/String;Lp/iu30;)V", "component1", "()J", "component3", "()Lp/iu30;", "close", "()V", "component2", "()Ljava/lang/String;", "copy", "(JLjava/lang/String;Lp/iu30;)Lapp/rive/core/UniquePointer;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "Ljava/lang/String;", "getLabel", "Lp/iu30;", "getClosed", "()Z", "closed", "getPointer", "pointer", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UniquePointer implements CheckableAutoCloseable {
    private static final String TAG = "Rive/UniquePointer";
    private final /* synthetic */ CloseOnce $$delegate_0;
    private final long cppPointer;
    private final String label;
    private final iu30 onDispose;
    public static final int $stable = 8;

    public UniquePointer(long j, String str, iu30 iu30Var) {
        this.cppPointer = j;
        this.label = str;
        this.onDispose = iu30Var;
        this.$$delegate_0 = new CloseOnce(str.concat(" (UniquePointer)"), new AnonymousClass1(iu30Var, j, str));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final long getCppPointer() {
        return this.cppPointer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final iu30 getOnDispose() {
        return this.onDispose;
    }

    public static /* synthetic */ UniquePointer copy$default(UniquePointer uniquePointer, long j, String str, iu30 iu30Var, int i, Object obj) {
        if ((i & 1) != 0) {
            j = uniquePointer.cppPointer;
        }
        if ((i & 2) != 0) {
            str = uniquePointer.label;
        }
        if ((i & 4) != 0) {
            iu30Var = uniquePointer.onDispose;
        }
        return uniquePointer.copy(j, str, iu30Var);
    }

    @Override // app.p000rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        this.$$delegate_0.close();
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final UniquePointer copy(long cppPointer, String label, iu30 onDispose) {
        return new UniquePointer(cppPointer, label, onDispose);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniquePointer)) {
            return false;
        }
        UniquePointer uniquePointer = (UniquePointer) other;
        return this.cppPointer == uniquePointer.cppPointer && u890.j(this.label, uniquePointer.label) && u890.j(this.onDispose, uniquePointer.onDispose);
    }

    @Override // app.p000rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return this.$$delegate_0.getClosed();
    }

    public final String getLabel() {
        return this.label;
    }

    public final long getPointer() {
        if (!getClosed()) {
            return this.cppPointer;
        }
        bhn0.f(f4i1.f("Attempting to access a disposed UniquePointer (", this.label, ")"));
        return 0L;
    }

    public int hashCode() {
        return this.onDispose.hashCode() + cy30.d(Long.hashCode(this.cppPointer) * 31, 31, this.label);
    }

    public String toString() {
        return "UniquePointer(cppPointer=" + this.cppPointer + ", label=" + this.label + ", onDispose=" + this.onDispose + ")";
    }

    /* JADX INFO: renamed from: app.rive.core.UniquePointer$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp/rih1;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends hab0 implements Function0 {
        final /* synthetic */ long $cppPointer;
        final /* synthetic */ String $label;
        final /* synthetic */ iu30 $onDispose;

        /* JADX INFO: renamed from: app.rive.core.UniquePointer$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C00271 extends hab0 implements Function0 {
            final /* synthetic */ String $label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00271(String str) {
                super(0);
                this.$label = str;
            }

            public final String invoke() {
                return l1d.m("Disposing ", this.$label);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(iu30 iu30Var, long j, String str) {
            super(0);
            this.$onDispose = iu30Var;
            this.$cppPointer = j;
            this.$label = str;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m448invoke() {
            RiveLog.INSTANCE.getLogger().d(UniquePointer.TAG, new C00271(this.$label));
            this.$onDispose.invoke(Long.valueOf(this.$cppPointer));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            m448invoke();
            return rih1.a;
        }
    }
}
