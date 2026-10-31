package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ipb0 extends k9 {
    public final fpb0 c;
    public final isb0 d;
    public final int e;
    public final /* synthetic */ isb0 f;
    public final /* synthetic */ upb0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipb0(fpb0 fpb0Var, isb0 isb0Var, int i, upb0 upb0Var, int i2, int i3, long j) {
        super((byte) 10);
        this.f = isb0Var;
        this.g = upb0Var;
        this.h = i2;
        this.i = i3;
        this.t = j;
        this.c = fpb0Var;
        this.d = isb0Var;
        this.e = i;
    }

    @Override // p.k9
    public final jsb0 M0(long j, int i, int i2, int i3) {
        return v1(i, i2, i3, this.e, j);
    }

    public final mpb0 v1(int i, int i2, int i3, int i4, long j) {
        int iJ;
        fpb0 fpb0Var = this.c;
        Object objD = fpb0Var.d(i);
        Object objW = fpb0Var.b.w(i);
        List listV0 = V0(this.d, i, j);
        if (hjl.g(j)) {
            iJ = hjl.k(j);
        } else {
            if (!hjl.f(j)) {
                tf80.a("does not have fixed height");
            }
            iJ = hjl.j(j);
        }
        flb0 layoutDirection = this.f.b.getLayoutDirection();
        bsb0 bsb0Var = this.g.m;
        return new mpb0(i, objD, iJ, i4, layoutDirection, this.h, this.i, listV0, this.t, objW, bsb0Var, j, i2, i3);
    }
}
