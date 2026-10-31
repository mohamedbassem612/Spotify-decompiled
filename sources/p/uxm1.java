package p;

import android.content.Context;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uxm1 implements Function, BiFunction {
    public final /* synthetic */ vxm1 a;
    public final /* synthetic */ r9c b;

    public /* synthetic */ uxm1(vxm1 vxm1Var, r9c r9cVar) {
        this.a = vxm1Var;
        this.b = r9cVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    public Object apply(Object obj, Object obj2) {
        String strE;
        String string;
        mmr0 mmr0Var = (mmr0) obj;
        Map map = (Map) obj2;
        YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) mmr0Var.a;
        ywm1 ywm1Var = (ywm1) mmr0Var.b;
        r9c r9cVar = this.b;
        String str = r9cVar.b;
        vxm1 vxm1Var = this.a;
        Context context = vxm1Var.g;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        if (p7h.M(new String[]{"com.spotify.your-playlists", "com.spotify.your-albums", "com.spotify.your-artists", "com.spotify.your-podcasts", "com.spotify.your-audiobooks", "com.spotify.downloaded"}).contains(str)) {
            strE = qxy0.E(ywm1Var, context);
        } else {
            v5b1 v5b1Var = s4b1VarX.d;
            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, bzu0.f)) {
                strE = qxy0.E(ywm1Var, context);
            } else {
                strE = null;
            }
        }
        ArrayList arrayListF = e821.f(vxm1Var.b, yourLibraryResponse, y7y0.L(map), r9cVar.i, rh11.c(map), vxm1.c(r9cVar) == null, 96);
        if (u890.j(str, "com.spotify.your-playlists")) {
            string = context.getString(2131954015);
        } else if (u890.j(str, "com.spotify.your-albums")) {
            string = context.getString(2131954012);
        } else if (u890.j(str, "com.spotify.your-artists")) {
            string = context.getString(2131954013);
        } else if (u890.j(str, "com.spotify.your-podcasts")) {
            string = context.getString(2131954017);
        } else if (u890.j(str, "com.spotify.your-audiobooks")) {
            string = context.getString(2131954014);
        } else {
            string = u890.j(str, "com.spotify.downloaded") ? context.getString(2131953991) : null;
        }
        return new z310(arrayListF, new f410(12, string, strE, (List) null), null, null);
    }

    public Object apply(Object obj) {
        return this.a.e.g((String) obj, this.b);
    }
}
