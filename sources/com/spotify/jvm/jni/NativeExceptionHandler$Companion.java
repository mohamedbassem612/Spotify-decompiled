package com.spotify.jvm.jni;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u000b"}, d2 = {"Lcom/spotify/jvm/jni/NativeExceptionHandler$Companion;", "", "<init>", "()V", "TAG", "", "getTAG$annotations", "handleException", "", "throwable", "nativeStackTrace", "src_main_java_com_spotify_jvm_jni-jni"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NativeExceptionHandler$Companion {
    public /* synthetic */ NativeExceptionHandler$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static /* synthetic */ void getTAG$annotations() {
    }

    public final Throwable handleException(final Throwable throwable, final String nativeStackTrace) {
        try {
            RuntimeException runtimeException = new RuntimeException(nativeStackTrace, throwable) { // from class: com.spotify.jvm.jni.NativeExceptionHandler$UncaughtExceptionException
                {
                    super("Native stack trace:\n".concat(nativeStackTrace), throwable);
                }
            };
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), runtimeException);
            }
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    private NativeExceptionHandler$Companion() {
    }
}
