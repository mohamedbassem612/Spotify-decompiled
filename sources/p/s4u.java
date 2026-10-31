package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s4u extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Collection b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4u(Collection collection, byte b) {
        super(1);
        this.a = b;
        this.b = collection;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Collection collection = this.b;
        switch (b) {
            case 0:
                Iterator it = new ArrayList(collection).iterator();
                while (it.hasNext()) {
                    ((q4u) it.next()).a(obj);
                }
                return rih1.a;
            default:
                return Boolean.valueOf(collection.contains(obj));
        }
    }
}
