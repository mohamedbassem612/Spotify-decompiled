package com.spotify.browse.clientnative.mobius;

import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a implements Function {
    public static final a a = new a();

    public final Object apply(Object obj) {
        return new BrowseEvent.ExplicitFeedbackListChanged((Set) obj);
    }
}
