package app.p000rive.runtime.kotlin.renderers;

import kotlin.Metadata;
import p.cy30;
import p.kaa0;
import p.rjx;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/RenderContextEvent;", "", "type", "Lapp/rive/runtime/kotlin/renderers/RenderContextEventType;", "eglErrorCode", "", "eglErrorName", "", "operation", "(Lapp/rive/runtime/kotlin/renderers/RenderContextEventType;ILjava/lang/String;Ljava/lang/String;)V", "getEglErrorCode", "()I", "getEglErrorName", "()Ljava/lang/String;", "getOperation", "getType", "()Lapp/rive/runtime/kotlin/renderers/RenderContextEventType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RenderContextEvent {
    public static final int $stable = 0;
    private final int eglErrorCode;
    private final String eglErrorName;
    private final String operation;
    private final RenderContextEventType type;

    public RenderContextEvent(RenderContextEventType renderContextEventType, int i, String str, String str2) {
        this.type = renderContextEventType;
        this.eglErrorCode = i;
        this.eglErrorName = str;
        this.operation = str2;
    }

    public static /* synthetic */ RenderContextEvent copy$default(RenderContextEvent renderContextEvent, RenderContextEventType renderContextEventType, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            renderContextEventType = renderContextEvent.type;
        }
        if ((i2 & 2) != 0) {
            i = renderContextEvent.eglErrorCode;
        }
        if ((i2 & 4) != 0) {
            str = renderContextEvent.eglErrorName;
        }
        if ((i2 & 8) != 0) {
            str2 = renderContextEvent.operation;
        }
        return renderContextEvent.copy(renderContextEventType, i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RenderContextEventType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEglErrorCode() {
        return this.eglErrorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEglErrorName() {
        return this.eglErrorName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    public final RenderContextEvent copy(RenderContextEventType type, int eglErrorCode, String eglErrorName, String operation) {
        return new RenderContextEvent(type, eglErrorCode, eglErrorName, operation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderContextEvent)) {
            return false;
        }
        RenderContextEvent renderContextEvent = (RenderContextEvent) other;
        return this.type == renderContextEvent.type && this.eglErrorCode == renderContextEvent.eglErrorCode && u890.j(this.eglErrorName, renderContextEvent.eglErrorName) && u890.j(this.operation, renderContextEvent.operation);
    }

    public final int getEglErrorCode() {
        return this.eglErrorCode;
    }

    public final String getEglErrorName() {
        return this.eglErrorName;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final RenderContextEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.operation.hashCode() + cy30.d(kaa0.f(this.eglErrorCode, this.type.hashCode() * 31, 31), 31, this.eglErrorName);
    }

    public String toString() {
        RenderContextEventType renderContextEventType = this.type;
        int i = this.eglErrorCode;
        String str = this.eglErrorName;
        String str2 = this.operation;
        StringBuilder sb = new StringBuilder("RenderContextEvent(type=");
        sb.append(renderContextEventType);
        sb.append(", eglErrorCode=");
        sb.append(i);
        sb.append(", eglErrorName=");
        return rjx.o(sb, str, ", operation=", str2, ")");
    }
}
