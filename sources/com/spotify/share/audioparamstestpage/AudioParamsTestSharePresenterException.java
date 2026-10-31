package com.spotify.share.audioparamstestpage;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/share/audioparamstestpage/AudioParamsTestSharePresenterException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "ShareMenuDisabled", "Lcom/spotify/share/audioparamstestpage/AudioParamsTestSharePresenterException$ShareMenuDisabled;", "src_main_java_com_spotify_share_audioparamstestpage-audioparamstestpage"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public abstract class AudioParamsTestSharePresenterException extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/share/audioparamstestpage/AudioParamsTestSharePresenterException$ShareMenuDisabled;", "Lcom/spotify/share/audioparamstestpage/AudioParamsTestSharePresenterException;", "<init>", "()V", "src_main_java_com_spotify_share_audioparamstestpage-audioparamstestpage"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
    public static final /* data */ class ShareMenuDisabled extends AudioParamsTestSharePresenterException {
        public static final ShareMenuDisabled a = new ShareMenuDisabled();

        private ShareMenuDisabled() {
            super(0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareMenuDisabled);
        }

        public final int hashCode() {
            return 2080076549;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "ShareMenuDisabled";
        }
    }

    public /* synthetic */ AudioParamsTestSharePresenterException(int i) {
        this();
    }

    private AudioParamsTestSharePresenterException() {
    }
}
