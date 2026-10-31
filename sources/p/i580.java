package p;

import androidx.media3.muxer.MuxerException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i580 implements zgn0 {
    public final yjp1 a;
    public final long b = -9223372036854775807L;
    public final boolean c = true;

    public i580(yjp1 yjp1Var) {
        this.a = yjp1Var;
    }

    @Override // p.zgn0
    public final bg11 b(int i) {
        if (i == 2) {
            return spm0.g;
        }
        if (i == 1) {
            return spm0.h;
        }
        w280 w280Var = b380.b;
        return bg11.e;
    }

    @Override // p.zgn0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final j580 a(String str) throws MuxerException {
        try {
            return new j580(new spm0(new s420(new FileOutputStream(str)), this.c), this.a, this.b);
        } catch (FileNotFoundException e) {
            throw new MuxerException("Error creating file output stream", e);
        }
    }

    @Override // p.zgn0
    public final void c() {
    }
}
