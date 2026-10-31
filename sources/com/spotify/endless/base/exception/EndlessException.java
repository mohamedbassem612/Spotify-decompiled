package com.spotify.endless.base.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/spotify/endless/base/exception/EndlessException;", "Ljava/lang/Exception;", "<init>", "()V", "OfflineException", "JumpNotAllowedException", "LongPressNotAllowedException", "SignalNotAvailableException", "DeviceNotSupportedException", "Lcom/spotify/endless/base/exception/EndlessException$DeviceNotSupportedException;", "Lcom/spotify/endless/base/exception/EndlessException$JumpNotAllowedException;", "Lcom/spotify/endless/base/exception/EndlessException$LongPressNotAllowedException;", "Lcom/spotify/endless/base/exception/EndlessException$OfflineException;", "Lcom/spotify/endless/base/exception/EndlessException$SignalNotAvailableException;", "src_main_java_com_spotify_endless_base-base"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class EndlessException extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/endless/base/exception/EndlessException$DeviceNotSupportedException;", "Lcom/spotify/endless/base/exception/EndlessException;", "<init>", "()V", "src_main_java_com_spotify_endless_base-base"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DeviceNotSupportedException extends EndlessException {
        public DeviceNotSupportedException() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/endless/base/exception/EndlessException$JumpNotAllowedException;", "Lcom/spotify/endless/base/exception/EndlessException;", "<init>", "()V", "src_main_java_com_spotify_endless_base-base"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class JumpNotAllowedException extends EndlessException {
        public JumpNotAllowedException() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/endless/base/exception/EndlessException$LongPressNotAllowedException;", "Lcom/spotify/endless/base/exception/EndlessException;", "<init>", "()V", "src_main_java_com_spotify_endless_base-base"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LongPressNotAllowedException extends EndlessException {
        public LongPressNotAllowedException() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/endless/base/exception/EndlessException$OfflineException;", "Lcom/spotify/endless/base/exception/EndlessException;", "<init>", "()V", "src_main_java_com_spotify_endless_base-base"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OfflineException extends EndlessException {
        public OfflineException() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/endless/base/exception/EndlessException$SignalNotAvailableException;", "Lcom/spotify/endless/base/exception/EndlessException;", "<init>", "()V", "src_main_java_com_spotify_endless_base-base"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SignalNotAvailableException extends EndlessException {
        public SignalNotAvailableException() {
            super(0);
        }
    }

    public /* synthetic */ EndlessException(int i) {
        this();
    }

    private EndlessException() {
    }
}
