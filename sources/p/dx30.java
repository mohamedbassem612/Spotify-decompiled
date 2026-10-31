package p;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dx30 implements jku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dx30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.jku
    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                synchronized (arrayList) {
                    try {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((jku) it.next()).dispose();
                        }
                        arrayList.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                ((View) obj).setOnClickListener(null);
                return;
        }
    }
}
