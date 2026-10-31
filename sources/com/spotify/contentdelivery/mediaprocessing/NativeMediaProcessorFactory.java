package com.spotify.contentdelivery.mediaprocessing;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessorFactory;", "", "nThis", "", "getNThis", "()J", "createProcessor", "Lcom/spotify/contentdelivery/mediaprocessing/CreateProcessorResult;", "handleId", "", "mode", "Lcom/spotify/contentdelivery/mediaprocessing/ProcessingMode;", "src_main_java_com_spotify_contentdelivery_mediaprocessing-mediaprocessing"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface NativeMediaProcessorFactory {
    CreateProcessorResult createProcessor(int handleId, ProcessingMode mode);

    long getNThis();
}
