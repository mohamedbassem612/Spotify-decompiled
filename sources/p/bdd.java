package p;

import com.spotify.campfire.datasource.impl.proto.Hierarchy;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface bdd {
    static /* synthetic */ goe a(bdd bddVar, Hierarchy hierarchy, List list, gxz0 gxz0Var, int i) {
        if ((i & 1) != 0) {
            list = z6x.a;
        }
        if ((i & 2) != 0) {
            gxz0Var = null;
        }
        return bddVar.b(hierarchy, list, gxz0Var);
    }

    goe b(Hierarchy hierarchy, List list, gxz0 gxz0Var);
}
