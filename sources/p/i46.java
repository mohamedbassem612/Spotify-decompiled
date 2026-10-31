package p;

import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i46 implements n561 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ i46(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new d7((Object[]) obj, (byte) 1);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new o9v(this);
            case 3:
                return j2h1.A((vu30) obj);
            case 4:
                return (Iterator) obj;
            case 5:
                return new a661(obj);
            case 6:
                return o0c.T(new mf20((nf20) obj), 2, 1, false, false);
            case 7:
                return new ejc0((CharSequence) obj);
            default:
                return new d7((ViewGroup) obj, (byte) 8);
        }
    }
}
