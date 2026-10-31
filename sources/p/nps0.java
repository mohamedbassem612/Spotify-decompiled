package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nps0 implements Iterator, ola0 {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public nps0(ips0 ips0Var) {
        mug1[] mug1VarArr = new mug1[8];
        for (int i = 0; i < 8; i++) {
            mug1VarArr[i] = new rug1(this);
        }
        this.b = new kps0(ips0Var, mug1VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((fps0) ((jps0) obj)).c;
            case 1:
                return ((gps0) ((kps0) obj)).c;
            default:
                return ((d7) obj).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (Map.Entry) ((jps0) obj).next();
            case 1:
                return (Map.Entry) ((kps0) obj).next();
            default:
                return ((d7) obj).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                ((jps0) this.b).remove();
                return;
            case 1:
                ((kps0) this.b).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public nps0(hps0 hps0Var) {
        lug1[] lug1VarArr = new lug1[8];
        for (int i = 0; i < 8; i++) {
            lug1VarArr[i] = new qug1(this);
        }
        this.b = new jps0(hps0Var, lug1VarArr);
    }

    public nps0(Object[] objArr) {
        this.b = new d7(objArr, (byte) 1);
    }
}
