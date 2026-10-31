package p;

import android.os.Trace;
import androidx.media3.exoplayer.video.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jkh0 implements w1k1 {
    public final /* synthetic */ yjh0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ b c;

    public jkh0(b bVar, yjh0 yjh0Var, int i, long j) {
        this.c = bVar;
        this.a = yjh0Var;
        this.b = i;
    }

    @Override // p.w1k1
    public final void a(long j) {
        this.c.d1(this.a, this.b, j);
    }

    @Override // p.w1k1
    public final void b() {
        Trace.beginSection("dropVideoBuffer");
        this.a.l(this.b);
        Trace.endSection();
        this.c.j1(0, 1);
    }
}
