package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yxa extends onm {
    public Bitmap a;
    public Bitmap.CompressFormat b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zxa e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxa(zxa zxaVar, onm onmVar) {
        super(onmVar);
        this.e = zxaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, null, 0, this);
    }
}
