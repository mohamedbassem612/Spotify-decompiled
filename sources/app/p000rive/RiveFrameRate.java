package app.p000rive;

import kotlin.Metadata;
import p.c13;
import p.fdg1;
import p.hhg1;
import p.jch0;
import p.jfv;
import p.ngv;
import p.ytw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/rive/RiveFrameRate;", "", "Capped", "Unbounded", "Lapp/rive/RiveFrameRate$Capped;", "Lapp/rive/RiveFrameRate$Unbounded;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface RiveFrameRate {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R \u0010\u0018\u001a\u00020\u00178\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lapp/rive/RiveFrameRate$Capped;", "Lapp/rive/RiveFrameRate;", "", "framesPerSecond", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lapp/rive/RiveFrameRate$Capped;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getFramesPerSecond", "Lp/jfv;", "period", "J", "getPeriod-UwyO8pc$kotlin_release", "()J", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Capped implements RiveFrameRate {
        public static final int $stable = 0;
        private final float framesPerSecond;
        private final long period;

        public Capped(float f) {
            this.framesPerSecond = f;
            if (Float.isInfinite(f) || Float.isNaN(f) || f <= 0.0f) {
                hhg1.n("framesPerSecond must be finite and greater than zero.");
                throw null;
            }
            ytw0 ytw0Var = jfv.b;
            long jA0 = jch0.a0(1.0E9d / ((double) f));
            this.period = fdg1.l0(jA0 < 1 ? 1L : jA0, ngv.b);
        }

        public static /* synthetic */ Capped copy$default(Capped capped, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = capped.framesPerSecond;
            }
            return capped.copy(f);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getFramesPerSecond() {
            return this.framesPerSecond;
        }

        public final Capped copy(float framesPerSecond) {
            return new Capped(framesPerSecond);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Capped) && Float.compare(this.framesPerSecond, ((Capped) other).framesPerSecond) == 0;
        }

        public final float getFramesPerSecond() {
            return this.framesPerSecond;
        }

        /* JADX INFO: renamed from: getPeriod-UwyO8pc$kotlin_release, reason: not valid java name and from getter */
        public final long getPeriod() {
            return this.period;
        }

        public int hashCode() {
            return Float.hashCode(this.framesPerSecond);
        }

        public String toString() {
            return c13.h("Capped(framesPerSecond=", this.framesPerSecond, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lapp/rive/RiveFrameRate$Unbounded;", "Lapp/rive/RiveFrameRate;", "()V", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unbounded implements RiveFrameRate {
        public static final int $stable = 0;
        public static final Unbounded INSTANCE = new Unbounded();

        private Unbounded() {
        }
    }
}
