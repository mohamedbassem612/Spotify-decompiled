package p;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n380 extends mjh1 {
    public int b;
    public Object c;
    public final /* synthetic */ Iterator d;

    public n380(mjh1 mjh1Var) {
        super((byte) 0);
        this.d = mjh1Var;
    }

    public final boolean hasNext() {
        return this.b > 0 || this.d.hasNext();
    }

    public final Object next() {
        int iA = this.b;
        if (iA <= 0) {
            ffp0 ffp0Var = (ffp0) this.d.next();
            this.c = ffp0Var.a;
            iA = ffp0Var.a();
            this.b = iA;
        }
        this.b = iA - 1;
        Object obj = this.c;
        Objects.requireNonNull(obj);
        return obj;
    }
}
