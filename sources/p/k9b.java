package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k9b extends a96 {
    public final Map a;
    public final Set b = dm61.z0(kab.d, gss0.d);

    public k9b(Map map) {
        this.a = map;
    }

    public final Set e() {
        return this.b;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final b6w0 d() {
        return new b6w0(true);
    }

    public final String getDescription() {
        return "Shows user prompts for episodes (Bluejay)";
    }

    public final boolean isEnabled() {
        Map map = this.a;
        chr0 chr0Var = chr0.b;
        Object obj = map.get(chr0Var);
        if (obj != null) {
            return ((n86) obj).c();
        }
        jah.h("No ArtifactPageGating registered for ", chr0Var, ". Did you install the config module in MainActivityModule?");
        return false;
    }
}
