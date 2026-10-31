package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x6c0 implements b3i1 {
    public final /* synthetic */ byte a;

    public static ium0 a(String str) {
        a3i1 a3i1Var = (a3i1) jum0.d.getValue();
        Set set = x6b1.e;
        x6b1 x6b1VarL = oqn1.l(str);
        v5b1 v5b1VarA = x6b1VarL == null ? null : a3i1Var.a(x6b1VarL);
        if (v5b1VarA instanceof ium0) {
            return (ium0) v5b1VarA;
        }
        return null;
    }

    public static iss0 b(String str) {
        a3i1 a3i1Var = (a3i1) ess0.d.getValue();
        Set set = x6b1.e;
        x6b1 x6b1VarL = oqn1.l(str);
        v5b1 v5b1VarA = x6b1VarL == null ? null : a3i1Var.a(x6b1VarL);
        if (v5b1VarA instanceof iss0) {
            return (iss0) v5b1VarA;
        }
        return null;
    }

    public final String getKey() {
        switch (this.a) {
            case 0:
                return "LibraryImportUris.LibraryImportMatchReview";
            case 1:
                return "LiveroomUris.LiveroomErrorDialog";
            case 2:
                return "LyricsUris.LyricsLanguagePicker";
            case 3:
                return "MultiSongTrackUris.MultiSongTrack";
            case 4:
                return "MusicVideoPrereleaseUris.MusicVideoPrerelease";
            case 5:
                return "MusicVideoPrereleaseUris.MusicVideoPrereleasePublic";
            case 6:
                return "PageMatchUris.PageMatchAddPageNumber";
            case 7:
                return "PageMatchUris.PageMatchBarcodeScan";
            case 8:
                return "ParentalControl.ManagedAccountDetailsProfileVisibilitySettingsTeen";
            case 9:
                return "ParentalControl.ParentalControlChildLogin";
            case 10:
                return "ParentalControl.ParentalControlRemoveParent";
            case 11:
                return "ParentalControl.ParentalControlRemoveTeen";
            case 12:
                return "PerformanceUris.BaselineProfile";
            case 13:
                return "PersonalPodcast.PersonalPodcastCreate";
            case 14:
                return "PersonalPodcast.PersonalPodcastLocationPicker";
            case 15:
                return "PersonalPodcast.PersonalPodcastPresetPreview";
            case 16:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingCustomPrompt";
            case 17:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingHost";
            case 18:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPersonalization";
            case 19:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPersonalizationLocationPicker";
            case 20:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPersonalizationQuestionnaire";
            case 21:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPresetPicker";
            case 22:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPresetPreview";
            case 23:
                return "PersonalPodcastOnboarding.PersonalPodcastOnboardingPresetSubmit";
            case 24:
                return "PlayUris.PlayNowplayingQueuePeek";
            case 25:
                return "PlaylistUris.AddToPlaylist";
            case 26:
                return "PlaylistUris.CoverArtSnake";
            case 27:
                return "PlaylistUris.FolderRename";
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return "PlaylistUris.ListCreationMenu";
            default:
                return "PlaylistUris.NewPlaylist";
        }
    }
}
