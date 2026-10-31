package p;

import com.spotify.browse.clientnative.mobius.BrowseState;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y7c implements Function {
    public static final y7c a = new y7c();

    public final Object apply(Object obj) {
        BrowseState.Content content = (BrowseState.Content) obj;
        return new mmr0(content.getModel().getDisplayableSections(), Integer.valueOf(content.getColumnCount()));
    }
}
