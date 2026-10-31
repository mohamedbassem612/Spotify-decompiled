package p;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jeg1 implements TypeEvaluator {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;

    public jeg1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        return Long.valueOf(this.a + ((long) (f * this.b)));
    }
}
