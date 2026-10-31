package p;

import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.EpisodeShowMetadata;
import com.spotify.cosmos.util.proto.Extension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import spotify.show_cosmos.proto.ShowEpisodeState;
import spotify.show_cosmos.proto.ShowRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class byr {
    public final lv00 a;

    public byr(lv00 lv00Var, yla ylaVar, jma jmaVar) {
        this.a = lv00Var;
    }

    public final i1z a(ShowRequest.Item item) {
        d1z d1zVar;
        g1z g1zVar;
        EpisodeMetadata episodeMetadataP = item.p();
        ShowEpisodeState.EpisodeCollectionState episodeCollectionStateO = item.o();
        ShowEpisodeState.EpisodeOfflineState episodeOfflineStateQ = item.q();
        EpisodePlayState episodePlayStateR = item.r();
        String link = episodeMetadataP.getLink();
        String strS = item.t() ? item.s() : null;
        String name = episodeMetadataP.getName();
        cen cenVarT = yla.t(episodeMetadataP.getCovers());
        cen cenVarT2 = yla.t(episodeMetadataP.getFreezeFrames());
        String description = episodeMetadataP.getDescription();
        String manifestId = episodeMetadataP.getManifestId();
        String previewManifestId = episodeMetadataP.getPreviewManifestId();
        String previewId = episodeMetadataP.getPreviewId();
        boolean isFollowingShow = episodeCollectionStateO.getIsFollowingShow();
        boolean isExplicit = episodeMetadataP.getIsExplicit();
        boolean is19PlusOnly = episodeMetadataP.getIs19PlusOnly();
        boolean isBookChapter = episodeMetadataP.getIsBookChapter();
        boolean isNew = episodeCollectionStateO.getIsNew();
        boolean isPlayable = episodePlayStateR.getIsPlayable();
        int iJ = jma.j(episodePlayStateR.getPlayabilityRestriction());
        boolean available = episodeMetadataP.getAvailable();
        int length = episodeMetadataP.getLength();
        int timeLeft = episodePlayStateR.getTimeLeft();
        boolean isPlayed = episodePlayStateR.getIsPlayed();
        boolean isInListenLater = episodeCollectionStateO.getIsInListenLater();
        boolean isMusicAndTalk = episodeMetadataP.getIsMusicAndTalk();
        long lastPlayedAt = episodePlayStateR.getLastPlayedAt();
        boolean backgroundable = episodeMetadataP.getBackgroundable();
        String str = strS;
        int publishDate = (int) episodeMetadataP.getPublishDate();
        EpisodeShowMetadata show = episodeMetadataP.getShow();
        g281 g281Var = new g281(show.getLink(), show.getName(), show.getPublisher(), null, 0L, null, null, yla.t(show.getCovers()), false, false, false, null, 0L, null, null, 0, null, null, null, false, false, null, null, 0, null, 536870374);
        episodeOfflineStateQ.getClass();
        xwp0 xwp0VarO = dm5.O(episodeOfflineStateQ.getSyncProgress(), episodeOfflineStateQ.getOfflineState());
        int i = ayr.a[episodeMetadataP.getMediaTypeEnum().ordinal()];
        if (i == 1) {
            d1zVar = d1z.a;
        } else if (i == 2) {
            d1zVar = d1z.b;
        } else {
            if (i != 3) {
                eg.o();
                return null;
            }
            d1zVar = d1z.c;
        }
        int i2 = ayr.b[episodeMetadataP.getEpisodeType().ordinal()];
        if (i2 == 1) {
            g1zVar = g1z.d;
        } else if (i2 == 2) {
            g1zVar = g1z.a;
        } else if (i2 == 3) {
            g1zVar = g1z.b;
        } else {
            if (i2 != 4) {
                eg.o();
                return null;
            }
            g1zVar = g1z.c;
        }
        g1z g1zVar2 = g1zVar;
        List extensionList = episodeMetadataP.getExtensionList();
        ArrayList arrayList = new ArrayList(q7h.U(extensionList, 10));
        Iterator it = extensionList.iterator();
        while (it.hasNext()) {
            Extension extension = (Extension) it.next();
            arrayList.add(new jz00(extension.getData().t(), extension.getExtensionKind().getNumber()));
            it = it;
            d1zVar = d1zVar;
        }
        return new i1z(link, str, name, cenVarT, cenVarT2, description, manifestId, previewManifestId, previewId, isFollowingShow, isExplicit, is19PlusOnly, isBookChapter, isNew, isPlayable, iJ, available, length, Integer.valueOf(timeLeft), isPlayed, isInListenLater, item.p().getIsCurated(), isMusicAndTalk, Long.valueOf(lastPlayedAt), backgroundable, publishDate, g281Var, xwp0VarO, d1zVar, g1zVar2, this.a.a(arrayList));
    }
}
