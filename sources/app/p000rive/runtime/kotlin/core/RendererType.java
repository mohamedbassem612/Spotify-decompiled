package app.p000rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lapp/rive/runtime/kotlin/core/RendererType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Rive", "Canvas", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum RendererType {
    Rive(0),
    Canvas(1);

    private final int value;
    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/RendererType$Companion;", "", "()V", "fromIndex", "Lapp/rive/runtime/kotlin/core/RendererType;", "index", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RendererType fromIndex(int index) {
            int size = RendererType.getEntries().size();
            if (index >= 0 && index <= size) {
                return (RendererType) RendererType.getEntries().get(index);
            }
            throw new IndexOutOfBoundsException("Invalid " + Companion.class + " index value " + index + ". It must be between 0 and " + size);
        }

        private Companion() {
        }
    }

    RendererType(int i) {
        this.value = i;
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
