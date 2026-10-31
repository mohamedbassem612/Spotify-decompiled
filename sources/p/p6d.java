package p;

import android.net.Uri;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class p6d implements BiConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p6d(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Uri.Builder) this.b).appendQueryParameter((String) obj, (String) obj2);
                break;
            case 1:
                ((xj61) this.b).add(new bng0(obj, (r811) obj2));
                break;
            default:
                xkg0 xkg0Var = (xkg0) this.b;
                i3r i3rVar = ((r811) obj2).b;
                if (i3rVar == null) {
                    i3rVar = i3r.a;
                }
                xkg0Var.put(obj, i3rVar);
                break;
        }
    }
}
