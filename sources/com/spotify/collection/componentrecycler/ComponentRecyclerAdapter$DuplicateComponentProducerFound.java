package com.spotify.collection.componentrecycler;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import p.tka0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/spotify/collection/componentrecycler/ComponentRecyclerAdapter$DuplicateComponentProducerFound", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "src_main_java_com_spotify_collection_componentrecycler-componentrecycler"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class ComponentRecyclerAdapter$DuplicateComponentProducerFound extends RuntimeException {
    public ComponentRecyclerAdapter$DuplicateComponentProducerFound(tka0 tka0Var) {
        super("Producer<AnyComponent> instance for " + tka0Var + " has already been supplied.");
    }
}
