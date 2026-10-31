package p;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sj7 implements iw91 {
    public final /* synthetic */ byte a = 1;
    public int b;
    public long c;
    public int d;

    public sj7(int i, long j, int i2) {
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                int i = this.b;
                String str = zoi1.a;
                sb.append(new String(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i}, StandardCharsets.US_ASCII));
                sb.append(", size=");
                sb.append(this.c);
                sb.append(", minHeaderSize=");
                return gvg.j(sb, this.d, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ sj7() {
    }
}
