package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vj30 extends uj30 {
    public long f;
    public long g;

    @Override // p.uj30
    public final boolean equals(Object obj) {
        if (!(obj instanceof vj30) || !super.equals(obj)) {
            return false;
        }
        vj30 vj30Var = (vj30) obj;
        return this.f == vj30Var.f && this.g == vj30Var.g;
    }

    @Override // p.uj30
    public final int hashCode() {
        return Long.hashCode(this.g) + (Long.hashCode(this.f) * 31) + (super.hashCode() * 31);
    }

    @Override // p.uj30
    public final String toString() {
        return "FrameData(frameStartNanos=" + this.b + ", frameDurationUiNanos=" + this.c + ", frameDurationCpuNanos=" + this.e + ", frameDurationTotalNanos=" + this.f + ", frameOverrunNanos=" + this.g + ", isJank=" + this.d + ", states=" + this.a + ')';
    }
}
