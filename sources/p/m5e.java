package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class m5e implements Init {
    public static final m5e a = new m5e();

    public final First e0(Object obj) {
        p5e p5eVar = (p5e) obj;
        return p5eVar.c ? First.c(p5eVar, Collections.singleton(t4e.c)) : First.b(p5eVar);
    }
}
