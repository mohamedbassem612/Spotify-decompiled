package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class jll implements Update {
    public final Next a(Object obj, Object obj2) {
        zkl zklVar = (zkl) obj2;
        if (zklVar instanceof ukl) {
            ukl uklVar = (ukl) zklVar;
            return Next.a(Collections.singleton(new pkl(uklVar.a, uklVar.b, uklVar.c, uklVar.d, uklVar.e)));
        }
        if (zklVar instanceof vkl) {
            vkl vklVar = (vkl) zklVar;
            return Next.a(Collections.singleton(new qkl(vklVar.a, vklVar.b, vklVar.c)));
        }
        if (zklVar instanceof ykl) {
            ykl yklVar = (ykl) zklVar;
            return Next.a(Collections.singleton(new rkl(yklVar.a, yklVar.b, yklVar.c, yklVar.d, yklVar.e)));
        }
        eg.o();
        return null;
    }
}
