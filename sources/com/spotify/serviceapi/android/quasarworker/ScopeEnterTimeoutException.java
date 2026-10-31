package com.spotify.serviceapi.android.quasarworker;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import p.gvg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/serviceapi/android/quasarworker/ScopeEnterTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_serviceapi_android_quasarworker-quasarworker"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class ScopeEnterTimeoutException extends Exception {
    public ScopeEnterTimeoutException(long j) {
        super(gvg.f(j, "Quasar scope did not enter within ", " sec"));
    }
}
