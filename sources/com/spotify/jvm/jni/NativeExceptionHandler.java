package com.spotify.jvm.jni;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/spotify/jvm/jni/NativeExceptionHandler;", "", "<init>", "()V", "Companion", "UncaughtExceptionException", "src_main_java_com_spotify_jvm_jni-jni"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class NativeExceptionHandler {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "JniNativeExceptionHandler";

    public static final Throwable handleException(Throwable th, String str) {
        return Companion.handleException(th, str);
    }
}
