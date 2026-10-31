package io.reactivex.rxjava3.exceptions;

import p.i3a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class UndeliverableException extends IllegalStateException {
    public UndeliverableException(Throwable th) {
        super(i3a.j("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ", th), th);
    }
}
