package app.p000rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cy30;
import p.eg;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lapp/rive/runtime/kotlin/core/Fit;", "", "(Ljava/lang/String;I)V", "FILL", "CONTAIN", "COVER", "FIT_WIDTH", "FIT_HEIGHT", "NONE", "SCALE_DOWN", "LAYOUT", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum Fit {
    FILL,
    CONTAIN,
    COVER,
    FIT_WIDTH,
    FIT_HEIGHT,
    NONE,
    SCALE_DOWN,
    LAYOUT;

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/Fit$Companion;", "", "()V", "fromIndex", "Lapp/rive/runtime/kotlin/core/Fit;", "index", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Fit fromIndex(int index) {
            int size = Fit.getEntries().size();
            if (index >= 0 && index <= size) {
                return (Fit) Fit.getEntries().get(index);
            }
            eg.g(cy30.i(index, "Invalid Fit index value ", size, ". It must be between 0 and "));
            return null;
        }

        private Companion() {
        }
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }
}
