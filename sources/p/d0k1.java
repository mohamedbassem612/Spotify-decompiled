package p;

import com.spotify.home.evopage.mobius.Event;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d0k1 implements Function {
    public static final d0k1 a = new d0k1();

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        return Event.VideoSettingsChanged.INSTANCE;
    }
}
