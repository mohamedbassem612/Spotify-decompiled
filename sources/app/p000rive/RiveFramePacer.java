package app.p000rive;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.fdg1;
import p.jfv;
import p.ngv;
import p.yoi1;
import p.ytw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lapp/rive/RiveFramePacer;", "", "Lapp/rive/RiveFrameRate;", "frameRate", "Lp/jfv;", "earlyWake", "<init>", "(Lapp/rive/RiveFrameRate;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "nowNs", "delayBeforeNextFrame-5sfh64U", "(J)J", "delayBeforeNextFrame", "frameTimeNs", "", "tryScheduleFrame", "(J)Z", "Lp/rih1;", "reset", "()V", "J", "period", "Lp/jfv;", "nextRenderTimeNs", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RiveFramePacer {
    public static final int $stable = 8;
    private final long earlyWake;
    private long nextRenderTimeNs;
    private final jfv period;

    private RiveFramePacer(RiveFrameRate riveFrameRate, long j) {
        this.earlyWake = j;
        RiveFrameRate.Capped capped = riveFrameRate instanceof RiveFrameRate.Capped ? (RiveFrameRate.Capped) riveFrameRate : null;
        this.period = capped != null ? new jfv(capped.getPeriod()) : null;
    }

    /* JADX INFO: renamed from: delayBeforeNextFrame-5sfh64U, reason: not valid java name */
    public final long m65delayBeforeNextFrame5sfh64U(long nowNs) {
        jfv jfvVar = this.period;
        if (jfvVar == null) {
            ytw0 ytw0Var = jfv.b;
            return 0L;
        }
        long j = this.nextRenderTimeNs;
        if (j == 0) {
            ytw0 ytw0Var2 = jfv.b;
            return 0L;
        }
        ytw0 ytw0Var3 = jfv.b;
        long jL0 = fdg1.l0(j - nowNs, ngv.b);
        jfv jfvVar2 = new jfv(this.earlyWake);
        ytw0 ytw0Var4 = jfv.b;
        return yoi1.m(yoi1.l(new jfv(jfv.p(jL0, yoi1.l(jfvVar2, new jfv(0L)).a)), new jfv(0L)), jfvVar).a;
    }

    public final void reset() {
        this.nextRenderTimeNs = 0L;
    }

    public final boolean tryScheduleFrame(long frameTimeNs) {
        jfv jfvVar = this.period;
        if (jfvVar != null) {
            long jI = jfv.i(jfvVar.a);
            long j = this.nextRenderTimeNs;
            if (j != 0 && frameTimeNs < j) {
                return false;
            }
            if (j == 0) {
                this.nextRenderTimeNs = frameTimeNs + jI;
                return true;
            }
            this.nextRenderTimeNs = ((((frameTimeNs - j) / jI) + 1) * jI) + j;
        }
        return true;
    }

    public /* synthetic */ RiveFramePacer(RiveFrameRate riveFrameRate, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(riveFrameRate, j);
    }

    public /* synthetic */ RiveFramePacer(RiveFrameRate riveFrameRate, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(riveFrameRate, (i & 2) != 0 ? RiveFrameRateKt.DEFAULT_EARLY_WAKE : j, null);
    }
}
