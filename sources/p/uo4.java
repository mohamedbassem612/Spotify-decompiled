package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class uo4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ uo4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new vo4(aey0Var.c("android-list-platform-albums-in-playlists:albums_in_playlists_enabled", false), null);
            case 1:
                return new wo4(aey0Var.c("android-list-platform-contextmenuimpl:use_page_api_context_menu", false), aey0Var.c("android-list-platform-contextmenuimpl:use_suspend_header_provider", false), aey0Var.c("android-list-platform-contextmenuimpl:use_suspend_item_provider", false), (luk) null);
            case 2:
                return new xo4(aey0Var.c("android-list-platform-endpoints-impl:cache_kodiak_source_values", true), null);
            case 3:
                return new yo4(aey0Var.c("android-list-platform-player-impl:deduplicate_state_updates_enabled", true), null);
            case 4:
                return new zo4(aey0Var.c("android-list-platform-viewport-impl:enable_small_list_direct_load", true), null);
            case 5:
                return new ap4(aey0Var.b(1, 5, 3, "android-list-ux-platform-chips-impl:default_minimum_visible_chips_required"), null);
            case 6:
                return new bp4(aey0Var.c("android-list-ux-platform-consumers-advanced-curation:advanced_curation_enabled", false), null);
            case 7:
                return new cp4(aey0Var.c("android-list-ux-platform-consumers-advanced-curation-rows-mediaoverlay:recently_added_blue_dot_enabled", false), null);
            case 8:
                return new dp4(aey0Var.c("android-list-ux-platform-consumers-album-shared:listening_party_card_enabled", false), aey0Var.c("android-list-ux-platform-consumers-album-shared:show_locked_album_ui", false), (luk) null);
            case 9:
                return new ep4(aey0Var.c("android-list-ux-platform-consumers-audiobook-listcomponents-playableaudiobooklens:enabled", false), null);
            case 10:
                return new fp4(aey0Var.c("android-list-ux-platform-consumers-audiobook-rows-audiobook:right_align_footer_actions", false), null);
            case 11:
                return new gp4(aey0Var.c("android-list-ux-platform-consumers-audiobook-rows-audiobook:use_play_state_from_list", false), null);
            case 12:
                return new hp4(aey0Var.c("android-list-ux-platform-consumers-audiobook-rows-releaserow:use_release_row", false), null);
            case 13:
                return new ip4(aey0Var.c("android-list-ux-platform-consumers-celebrity-blend-shared:row_slots_enabled", false), null);
            case 14:
                return new jp4(aey0Var.c("android-list-ux-platform-consumers-clips-shared:enable_filter_chips_chip_bar_action", false), null);
            case 15:
                return new kp4(aey0Var.c("android-list-ux-platform-consumers-editorial-shared:editor_attribution_enabled", false), (luk) null);
            case 16:
                return new mp4(aey0Var.c("android-list-ux-platform-consumers-episode-configurations-itemmetadataextension:with_play_trait", false), null);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new np4(aey0Var.c("android-list-ux-platform-consumers-episode-shared:enable_playlist_episode_swipe_actions", false), aey0Var.c("android-list-ux-platform-consumers-episode-shared:show_show_image_next_to_subtitle", false), aey0Var.c("android-list-ux-platform-consumers-episode-shared:use_standard_title_and_subtitle_for_music_episodes", false), null);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new op4(aey0Var.c("android-list-ux-platform-consumers-extender:search_entrypoint_enabled", false), aey0Var.c("android-list-ux-platform-consumers-extender:use_kodiak_for_recommendations", false), aey0Var.c("android-list-ux-platform-consumers-extender:use_mixed_list_endpoint", false), null);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new pp4(aey0Var.c("android-list-ux-platform-consumers-likedsongs-headermetadata:header_progress_bar_enabled", false), null);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new qp4(aey0Var.c("android-list-ux-platform-consumers-likedsongs-shared:duplicate_chip_liked_songs_enabled", false), aey0Var.c("android-list-ux-platform-consumers-likedsongs-shared:enable_graduation_chip", true), aey0Var.c("android-list-ux-platform-consumers-likedsongs-shared:use_select_chip_language_for_playlist_name", true), null);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new rp4(aey0Var.c("android-list-ux-platform-consumers-listenlater-shared:enable_filter_chips_chip_bar_action", false), aey0Var.c("android-list-ux-platform-consumers-listenlater-shared:generic_items_count_enabled", false), null);
            case 22:
                return new sp4(aey0Var.c("android-list-ux-platform-consumers-magpie:magpie_enabled", false), aey0Var.c("android-list-ux-platform-consumers-magpie:reasoning_enabled", false), (luk) null);
            case 23:
                return new tp4(aey0Var.c("android-list-ux-platform-consumers-mixing-contextmenuitems-automix:automix_track_order_context_menu_enabled", false), (luk) null);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new up4(aey0Var.c("android-list-ux-platform-consumers-offlinebackup-shared:enable_filter_chips_chip_bar_action", false), null);
            case 25:
                return new vp4(aey0Var.c("android-list-ux-platform-consumers-playlistcollaboration-listcomponents-reactionlens:allow_accept_of_list_component", false), aey0Var.c("android-list-ux-platform-consumers-playlistcollaboration-listcomponents-reactionlens:allow_reaction_lens", false), null);
            case 26:
                return new wp4(aey0Var.c("android-list-ux-platform-consumers-radio-shared:radio_header_metadata_enabled", false), null);
            case 27:
                return new xp4(aey0Var.c("android-list-ux-platform-consumers-sessioncontrol-sections-chips:chip_bar_action_enabled", false), aey0Var.c("android-list-ux-platform-consumers-sessioncontrol-sections-chips:chips_section_enabled", true), aey0Var.c("android-list-ux-platform-consumers-sessioncontrol-sections-chips:prompt_chip_enabled", false), null);
            case 28:
                return new yp4(aey0Var.c("android-list-ux-platform-consumers-sessioncontrol-shared:modify_prompt_enabled", false), aey0Var.c("android-list-ux-platform-consumers-sessioncontrol-shared:video_chip_bar_action_enabled", false), null);
            default:
                return new zp4(aey0Var.c("android-list-ux-platform-consumers-share-headeractions-share:hide_share_header_action_for_music_video_playlists", false), null);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 3:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 4:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 5:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 6:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 7:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 8:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 9:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 10:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 11:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 12:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 13:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 14:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 15:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 16:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 22:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 23:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 25:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 26:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 27:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 28:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        tp4 tp4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (vo4) tp4Var, vo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listplatform/albumsinplaylists/AndroidListPlatformAlbumsInPlaylistsProperties;", 0);
            case 1:
                return new tv30(1, (wo4) tp4Var, wo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listplatform/contextmenuimpl/AndroidListPlatformContextmenuimplProperties;", 0);
            case 2:
                return new tv30(1, (xo4) tp4Var, xo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listplatform/endpointsimpl/kodiak/AndroidListPlatformEndpointsImplProperties;", 0);
            case 3:
                return new tv30(1, (yo4) tp4Var, yo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listplatform/playerimpl/AndroidListPlatformPlayerImplProperties;", 0);
            case 4:
                return new tv30(1, (zo4) tp4Var, zo4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listplatform/viewportimpl/AndroidListPlatformViewportImplProperties;", 0);
            case 5:
                return new tv30(1, (ap4) tp4Var, ap4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatform/chipsimpl/AndroidListUxPlatformChipsImplProperties;", 0);
            case 6:
                return new tv30(1, (bp4) tp4Var, bp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidListUxPlatformConsumersAdvancedCurationProperties;", 0);
            case 7:
                return new tv30(1, (cp4) tp4Var, cp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/advancedcuration/rows/mediaoverlay/AndroidListUxPlatformConsumersAdvancedCurationRowsMediaoverlayProperties;", 0);
            case 8:
                return new tv30(1, (dp4) tp4Var, dp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidListUxPlatformConsumersAlbumSharedProperties;", 0);
            case 9:
                return new tv30(1, (ep4) tp4Var, ep4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/audiobook/listcomponents/playableaudiobooklens/AndroidListUxPlatformConsumersAudiobookListcomponentsPlayableaudiobooklensProperties;", 0);
            case 10:
                return new tv30(1, (fp4) tp4Var, fp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/audiobook/shared/AndroidListUxPlatformConsumersAudiobookRowsAudiobookProperties;", 0);
            case 11:
                return new tv30(1, (gp4) tp4Var, gp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/audiobook/rows/audiobookrow/AndroidListUxPlatformConsumersAudiobookRowsAudiobookProperties;", 0);
            case 12:
                return new tv30(1, (hp4) tp4Var, hp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/audiobook/rows/releaserow/AndroidListUxPlatformConsumersAudiobookRowsReleaserowProperties;", 0);
            case 13:
                return new tv30(1, (ip4) tp4Var, ip4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidListUxPlatformConsumersCelebrityBlendSharedProperties;", 0);
            case 14:
                return new tv30(1, (jp4) tp4Var, jp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/clips/shared/AndroidListUxPlatformConsumersClipsSharedProperties;", 0);
            case 15:
                return new tv30(1, (kp4) tp4Var, kp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/editorial/shared/AndroidListUxPlatformConsumersEditorialSharedProperties;", 0);
            case 16:
                return new tv30(1, (mp4) tp4Var, mp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/episode/configurations/itemmetadataextension/AndroidListUxPlatformConsumersEpisodeConfigurationsItemmetadataextensionProperties;", 0);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new tv30(1, (np4) tp4Var, np4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/episode/shared/AndroidListUxPlatformConsumersEpisodeSharedProperties;", 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new tv30(1, (op4) tp4Var, op4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/standard/sections/extender/AndroidListUxPlatformConsumersExtenderProperties;", 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new tv30(1, (pp4) tp4Var, pp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/likedsongs/headermetadata/AndroidListUxPlatformConsumersLikedsongsHeadermetadataProperties;", 0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new tv30(1, (qp4) tp4Var, qp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidListUxPlatformConsumersLikedsongsSharedProperties;", 0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new tv30(1, (rp4) tp4Var, rp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/listenlater/shared/AndroidListUxPlatformConsumersListenlaterSharedProperties;", 0);
            case 22:
                return new tv30(1, (sp4) tp4Var, sp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidListUxPlatformConsumersMagpieProperties;", 0);
            case 23:
                return new tv30(1, tp4Var, tp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/playlistmixing/configurationimpl/AndroidListUxPlatformConsumersMixingContextmenuitemsAutomixProperties;", 0);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new tv30(1, (up4) tp4Var, up4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidListUxPlatformConsumersOfflinebackupSharedProperties;", 0);
            case 25:
                return new tv30(1, (vp4) tp4Var, vp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/playlistcollaboration/listcomponents/reactionlens/AndroidListUxPlatformConsumersPlaylistcollaborationListcomponentsReactionlensProperties;", 0);
            case 26:
                return new tv30(1, (wp4) tp4Var, wp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/radio/shared/rc/AndroidListUxPlatformConsumersRadioSharedProperties;", 0);
            case 27:
                return new tv30(1, (xp4) tp4Var, xp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/sessioncontrol/sections/chips/AndroidListUxPlatformConsumersSessioncontrolSectionsChipsProperties;", 0);
            case 28:
                return new tv30(1, (yp4) tp4Var, yp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/sessioncontrol/shared/AndroidListUxPlatformConsumersSessioncontrolSharedProperties;", 0);
            default:
                return new tv30(1, (zp4) tp4Var, zp4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/share/headeractions/share/AndroidListUxPlatformConsumersShareHeaderactionsShareProperties;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                break;
            case 22:
                break;
            case 23:
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
