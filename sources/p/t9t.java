package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t9t implements n561 {
    public final CharSequence a;
    public final int b;
    public final vu30 c;

    public t9t(CharSequence charSequence, int i, vu30 vu30Var) {
        this.a = charSequence;
        this.b = i;
        this.c = vu30Var;
    }

    public final Iterator iterator() {
        return new s9t(this);
    }
}
