package p;

import java.io.BufferedReader;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hjc0 implements n561 {
    public final BufferedReader a;

    public hjc0(BufferedReader bufferedReader) {
        this.a = bufferedReader;
    }

    @Override // p.n561
    public final Iterator iterator() {
        return new gjc0(this);
    }
}
