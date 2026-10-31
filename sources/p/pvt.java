package p;

import android.util.Pair;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pvt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pvt(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.d;
        byte b2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((qvt) obj2).b.d(b2, obj);
                break;
            case 1:
                b9v b9vVar = (b9v) obj2;
                ((c9v) obj).V(b9vVar.a, b9vVar.b, b2);
                break;
            case 2:
                Pair pair = (Pair) obj;
                ((d3i0) obj2).b.i.V(((Integer) pair.first).intValue(), (p2i0) pair.second, b2);
                break;
            default:
                ((mlw0) obj2).d(b2, obj);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ pvt(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
