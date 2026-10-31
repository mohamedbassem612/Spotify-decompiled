package p;

import com.spotify.player.model.Context;
import io.reactivex.rxjava3.functions.Function;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y410 implements Function {
    public final /* synthetic */ Map a;

    public y410(z410 z410Var, Map map) {
        this.a = map;
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        Context.Builder builderUrl = Context.builder(str).url("context://".concat(str));
        Map map = this.a;
        HashMap map2 = map != null ? new HashMap(map) : new HashMap(2);
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        if (!map2.containsKey("sorting.criteria") && (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || ((nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false)) || s4b1VarX.w()))) {
            map2.put("sorting.criteria", String.format("%s DESC", Arrays.copyOf(new Object[]{"added_at"}, 1)));
        }
        return builderUrl.metadata(map2).build();
    }
}
