package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qgr {
    public long a;
    public final c18 b;
    public final nge c;
    public final /* synthetic */ rgr d;

    public qgr(rgr rgrVar, c18 c18Var, nge ngeVar, long j) {
        this.d = rgrVar;
        this.b = c18Var;
        this.a = j;
        this.c = ngeVar;
    }

    public final void a(ByteBuffer byteBuffer, long j) {
        dm5.m(j >= this.a);
        byteBuffer.position((((int) (j - this.a)) * this.b.d) + byteBuffer.position());
        this.a = j;
    }
}
