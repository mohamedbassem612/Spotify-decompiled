package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oh40 implements n561 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ oh40(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new nh40(this);
            case 1:
                ArrayList arrayListL0 = z561.l0((nf20) this.b);
                r7h.f0(arrayListL0, (k0d) this.c);
                return arrayListL0.iterator();
            default:
                return new nh40(this, (byte) 0);
        }
    }
}
