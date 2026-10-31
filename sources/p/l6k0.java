package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l6k0 implements py50 {
    public final Context a;
    public final mnk0 b;
    public final gnf0 c;

    public l6k0(Context context, koc0 koc0Var, z6k0 z6k0Var, mnk0 mnk0Var) {
        this.a = context;
        this.b = mnk0Var;
        this.c = new gnf0(koc0Var, this, z6k0Var, (byte) 20);
    }

    @Override // p.py50
    public final iu30 k() {
        return this.c;
    }
}
