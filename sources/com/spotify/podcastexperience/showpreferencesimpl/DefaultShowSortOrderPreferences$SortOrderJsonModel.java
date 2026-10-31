package com.spotify.podcastexperience.showpreferencesimpl;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.o661;
import p.ops;
import p.pps;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/spotify/podcastexperience/showpreferencesimpl/DefaultShowSortOrderPreferences$SortOrderJsonModel", "", "Lcom/spotify/podcastexperience/showpreferencesimpl/DefaultShowSortOrderPreferences$SortOrderJsonModel;", "<init>", "(Ljava/lang/String;I)V", "Companion", "p/ops", "BY_DATE_ASC", "BY_DATE_DESC", "BY_CONSUMPTION_ORDER", "src_main_java_com_spotify_podcastexperience_showpreferencesimpl-showpreferencesimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
@o661(with = pps.class)
public enum DefaultShowSortOrderPreferences$SortOrderJsonModel {
    BY_DATE_ASC,
    BY_DATE_DESC,
    BY_CONSUMPTION_ORDER;

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());
    public static final ops Companion = new ops();

    public static r0z getEntries() {
        return $ENTRIES;
    }
}
