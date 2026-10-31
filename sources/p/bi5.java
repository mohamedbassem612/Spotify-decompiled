package p;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bi5 extends SegmentFinder {
    public final /* synthetic */ qpj1 a;

    public bi5(qpj1 qpj1Var) {
        this.a = qpj1Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.d(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.a(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.e(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.c(i);
    }
}
