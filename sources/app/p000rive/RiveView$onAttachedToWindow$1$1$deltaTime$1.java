package app.p000rive;

import kotlin.Metadata;
import p.fdg1;
import p.hab0;
import p.iu30;
import p.jfv;
import p.ngv;
import p.o811;
import p.ytw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTimeNs", "Lp/jfv;", "invoke-5sfh64U", "(J)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class RiveView$onAttachedToWindow$1$1$deltaTime$1 extends hab0 implements iu30 {
    final /* synthetic */ o811 $lastFrameTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveView$onAttachedToWindow$1$1$deltaTime$1(o811 o811Var) {
        super(1);
        this.$lastFrameTime = o811Var;
    }

    public /* synthetic */ Object invoke(Object obj) {
        return new jfv(m97invoke5sfh64U(((Number) obj).longValue()));
    }

    /* JADX INFO: renamed from: invoke-5sfh64U, reason: not valid java name */
    public final long m97invoke5sfh64U(long j) {
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.b;
        long jL0 = fdg1.l0(j, ngvVar);
        long jK0 = jfv.f(this.$lastFrameTime.a, fdg1.k0(0, ngvVar)) ? fdg1.k0(0, ngvVar) : jfv.p(jL0, this.$lastFrameTime.a);
        this.$lastFrameTime.a = jL0;
        return jK0;
    }
}
