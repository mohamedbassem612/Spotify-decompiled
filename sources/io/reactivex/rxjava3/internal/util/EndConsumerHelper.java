package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class EndConsumerHelper {
    public static void a(Class cls) {
        String name = cls.getName();
        RxJavaPlugins.b(new ProtocolViolationException(cy30.p("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }
}
