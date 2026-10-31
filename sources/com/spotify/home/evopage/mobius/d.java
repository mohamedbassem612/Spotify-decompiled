package com.spotify.home.evopage.mobius;

import io.reactivex.rxjava3.functions.Function;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d implements Function {
    public static final d a = new d();

    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) {
        return new Event.ExplicitFeedbackListChanged((Set) obj);
    }
}
