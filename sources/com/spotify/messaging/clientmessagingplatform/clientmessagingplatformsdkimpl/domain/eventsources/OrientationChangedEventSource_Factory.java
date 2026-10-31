package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources;

import android.content.Context;
import p.jly0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class OrientationChangedEventSource_Factory implements jly0 {
    private final jly0 contextProvider;

    private OrientationChangedEventSource_Factory(jly0 jly0Var) {
        this.contextProvider = jly0Var;
    }

    public static OrientationChangedEventSource_Factory create(jly0 jly0Var) {
        return new OrientationChangedEventSource_Factory(jly0Var);
    }

    public static OrientationChangedEventSource newInstance(Context context) {
        return new OrientationChangedEventSource(context);
    }

    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public OrientationChangedEventSource m223get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
