package com.google.common.util.concurrent;

import java.util.Objects;
import p.t380;
import p.xto;
import p.yto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        t380.u(yto.class.getName(), CycleDetectingLockFactory$PotentialDeadlockException.class.getName(), xto.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb.append(", ");
            sb.append(cause.getMessage());
        }
        return sb.toString();
    }
}
