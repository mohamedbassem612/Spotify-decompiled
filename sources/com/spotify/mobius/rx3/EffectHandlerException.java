package com.spotify.mobius.rx3;

import com.spotify.mobius.ConnectionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
class EffectHandlerException extends ConnectionException {
    public static EffectHandlerException a(Object obj, Throwable th) {
        EffectHandlerException effectHandlerException = new EffectHandlerException("Error in effect handler", th);
        StackTraceElement[] stackTrace = effectHandlerException.getStackTrace();
        stackTrace[0] = new StackTraceElement(obj.getClass().getName(), "apply", null, -1);
        effectHandlerException.setStackTrace(stackTrace);
        return effectHandlerException;
    }
}
