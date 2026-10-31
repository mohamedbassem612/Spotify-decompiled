package p;

import android.content.Context;
import android.graphics.Matrix;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface mch0 extends js40 {
    @Override // p.js40
    default rs40 a(Context context, boolean z) {
        return dos.j(context, b380.t(this), bg11.e, z);
    }

    Matrix b();

    default int c() {
        return 9729;
    }

    default l291 d(int i, int i2) {
        return new l291(i, i2);
    }
}
