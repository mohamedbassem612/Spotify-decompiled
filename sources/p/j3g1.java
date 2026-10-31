package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j3g1 {
    public final long a;
    public final long b;
    public final boolean c;

    public j3g1(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final j3g1 a(j3g1 j3g1Var) {
        return new j3g1(Offset.g(this.a, j3g1Var.a), Math.max(this.b, j3g1Var.b), this.c || j3g1Var.c);
    }
}
