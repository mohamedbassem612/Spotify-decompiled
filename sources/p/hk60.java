package p;

import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hk60 extends yag {
    public byte[] j;
    public volatile boolean k;
    public byte[] l;

    @Override // p.f9e0
    public final void a() {
        try {
            this.i.t(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                byte[] bArrCopyOf = this.j;
                if (bArrCopyOf.length < i2 + TlsSocketProvider.READ_BUFFER_SIZE) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + TlsSocketProvider.READ_BUFFER_SIZE);
                    this.j = bArrCopyOf;
                }
                i = this.i.read(bArrCopyOf, i2, TlsSocketProvider.READ_BUFFER_SIZE);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                this.l = Arrays.copyOf(this.j, i2);
            }
        } finally {
            n3p1.k(this.i);
        }
    }

    @Override // p.f9e0
    public final void b() {
        this.k = true;
    }
}
