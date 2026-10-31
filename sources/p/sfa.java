package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sfa extends gar {
    public byte X;
    public long i;
    public int t;

    @Override // p.gar
    public final void g() {
        super.g();
        this.t = 0;
    }

    public final boolean k(gar garVar) {
        ByteBuffer byteBuffer;
        dm5.m(!garVar.f(1073741824));
        dm5.m(!garVar.f(268435456));
        dm5.m(!garVar.f(4));
        if (l()) {
            if (this.t >= this.X) {
                return false;
            }
            ByteBuffer byteBuffer2 = garVar.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.t;
        this.t = i + 1;
        if (i == 0) {
            this.f = garVar.f;
            if (garVar.f(1)) {
                ((oac) this).a = 1;
            }
        }
        ByteBuffer byteBuffer3 = garVar.d;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.i = garVar.f;
        return true;
    }

    public final boolean l() {
        return this.t > 0;
    }
}
