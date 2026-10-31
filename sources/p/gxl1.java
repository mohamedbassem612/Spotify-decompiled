package p;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gxl1 {
    public final en31 a;
    public final oug b = new oug((byte) 1);

    public gxl1(en31 en31Var) {
        this.a = en31Var;
    }

    public final List a(String str) {
        return (List) qyo1.x(this.a, true, false, new fxl1(str, (byte) 1));
    }

    public final void b(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            qyo1.x(this.a, false, true, new vae1(this, new exl1((String) it.next(), str), (byte) 16));
        }
    }
}
