package com.spotify.collection.componentrecycler;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/spotify/collection/componentrecycler/RangedComponentRecyclerAdapter$NoPreloadRangeConsumerFound", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "src_main_java_com_spotify_collection_componentrecycler-componentrecycler"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RangedComponentRecyclerAdapter$NoPreloadRangeConsumerFound extends RuntimeException {
    public static final RangedComponentRecyclerAdapter$NoPreloadRangeConsumerFound a = new RangedComponentRecyclerAdapter$NoPreloadRangeConsumerFound();

    private RangedComponentRecyclerAdapter$NoPreloadRangeConsumerFound() {
        super("No Consumer<IntRange> instance supplied.");
    }
}
