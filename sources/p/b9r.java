package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b9r implements js40 {
    public final c9r a;
    public final x8h b;

    public b9r(c9r c9rVar, x8h x8hVar) {
        this.a = c9rVar;
        this.b = x8hVar;
    }

    @Override // p.js40
    public final rs40 a(Context context, boolean z) {
        return new d9r(context, this.a, this.b);
    }
}
