package p;

import android.net.Uri;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xye implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public xye(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ogr ogrVar = this.a.F;
        List list = ((zwe) obj).a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (u890.j(Uri.parse((String) obj2).getScheme(), "file")) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        ((nff) ogrVar.b).invoke(arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String path = Uri.parse((String) it.next()).getPath();
            if (path != null) {
                new File(path).delete();
            }
        }
        return rih1.a;
    }
}
