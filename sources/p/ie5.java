package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ie5 implements tob1 {
    public final tzg1 a;
    public final hrr0 b;
    public oe5 c;
    public long d;
    public long e;
    public boolean f;

    public ie5(tzg1 tzg1Var, Object obj, oe5 oe5Var, long j, long j2, boolean z) {
        this.a = tzg1Var;
        this.b = xto.t(obj);
        this.c = oe5Var != null ? rrn1.y(oe5Var) : prn1.n(tzg1Var, obj);
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object c() {
        return this.a.b.invoke(this.c);
    }

    @Override // p.tob1
    public final Object getValue() {
        return this.b.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.b.getValue() + ", velocity=" + c() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ")";
    }

    public /* synthetic */ ie5(tzg1 tzg1Var, Object obj, oe5 oe5Var, int i) {
        this(tzg1Var, obj, (i & 4) != 0 ? null : oe5Var, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
