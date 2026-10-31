package p;

import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.AudioEpisode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class d42 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ d42(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new e42(aey0Var.c("ads-device-info:fetch_connected_accessories_at_start", false), null);
            case 1:
                return new r34(aey0Var.c("android-abp:is_consumption_tracker_top_up_entry_point_enabled", false), aey0Var.c("android-abp:use_get_quota_v1_endpoint", false), (luk) null);
            case 2:
                return new v34(aey0Var.c("android-account-management-platform:prototype_entrypoint_enabled", false), (luk) null);
            case 3:
                return new w34(aey0Var.c("android-accountswitching-addaccountpage:is_add_account_page_enabled", false), aey0Var.c("android-accountswitching-addaccountpage:is_free_managed_accounts_enabled", false), (luk) null);
            case 4:
                return new x34(aey0Var.c("android-accountswitching:cached_has_users", false), aey0Var.c("android-accountswitching:direct_prefs_access", false), (luk) null);
            case 5:
                return new y34(aey0Var.b(0, 200, 50, "android-accountswitching-switcherstateimpl:max_accounts"), (luk) null);
            case 6:
                return new z34(aey0Var.c("android-accountswitching:enable_account_switching", true), (xz11) null);
            case 7:
                return new a44(aey0Var.b(0, Integer.MAX_VALUE, 86400, "android-ad-on-app-open:cached_ad_expiration_period_seconds"), aey0Var.c("android-ad-on-app-open:core_fetch_enabled", false), aey0Var.b(0, Integer.MAX_VALUE, 5000, "android-ad-on-app-open:core_fetch_read_timeout_ms"), aey0Var.c("android-ad-on-app-open:cta_card_enabled", true), aey0Var.c("android-ad-on-app-open:eligibility_service_enabled", false), aey0Var.c("android-ad-on-app-open:page_enabled", false), aey0Var.c("android-ad-on-app-open:page_injection_during_startup_enabled", false), aey0Var.c("android-ad-on-app-open:skip_button_enabled", true), aey0Var.b(0, Integer.MAX_VALUE, 3000, "android-ad-on-app-open:skippable_ad_delay_ms"), aey0Var.c("android-ad-on-app-open:testing_dismiss_ad_when_video_finishes", true), aey0Var.c("android-ad-on-app-open:testing_frequency_capping_enabled", true), aey0Var.b(0, Integer.MAX_VALUE, 5000, "android-ad-on-app-open:video_loading_timeout_ms"), (luk) null);
            case 8:
                return new g44(aey0Var.c("android-adsdisplay-ads:enable_out_of_focus_when_in_picture_in_picture_mode", false), (luk) null);
            case 9:
                return new i44(aey0Var.c("android-adsdisplay-elementimpl:close_ad_npv_enabled", false), aey0Var.c("android-adsdisplay-elementimpl:display_ad_viewability_tracker_enabled", false), aey0Var.c("android-adsdisplay-elementimpl:show_ad_break_time_remaining", true), aey0Var.c("android-adsdisplay-elementimpl:skippable_ad_element_enabled", false), aey0Var.c("android-adsdisplay-elementimpl:v2_enpv_display", false), aey0Var.a("android-adsdisplay-elementimpl:video_ad_card_click_behavior", h44.b), aey0Var.c("android-adsdisplay-elementimpl:visible_impression_enabled", false), (luk) null);
            case 10:
                return new j44(aey0Var.b(0, 9999999, AudioEpisode.SHOW_URI_FIELD_NUMBER, "android-adsdisplay-embeddedad:canvas_render_delay_ms"), aey0Var.b(0, 9999999, AudioEpisode.SHOW_URI_FIELD_NUMBER, "android-adsdisplay-embeddedad:render_delay_ms"), (luk) null, aey0Var.c("android-adsdisplay-embeddedad:canvas_skeleton_enabled", false), aey0Var.c("android-adsdisplay-embeddedad:embedded_ad_html_element_enabled", false), aey0Var.c("android-adsdisplay-embeddedad:foreground_enabled", false), aey0Var.c("android-adsdisplay-embeddedad:music_track_change_enabled", false), aey0Var.c("android-adsdisplay-embeddedad:prioritize_canvas", true), aey0Var.c("android-adsdisplay-embeddedad:tablet_supported", false));
            case 11:
                return new k44(aey0Var.c("android-adsdisplay-podcastsponsorship:enable_podcast_creator_sponsorship_npv", false), (luk) null);
            case 12:
                return new l44(aey0Var.b(0, AudioEpisode.SHOW_URI_FIELD_NUMBER, 300, "android-adsdisplay-productssponsorship:sponsored_playlist_v2_artwork_collapse_delay_ms"), (luk) null, aey0Var.c("android-adsdisplay-productssponsorship:enable_sponsored_playlist_horizontal_video", false));
            case 13:
                return new n44(aey0Var.c("android-adsdisplay-settings:in_app_ad_settings_enabled", false), null);
            case 14:
                return new o44(aey0Var.c("android-adsdisplay-sponsorshipimpl:clear_stream_slot_on_sponsored_context_mismatch", false), aey0Var.c("android-adsdisplay-sponsorshipimpl:clear_stream_slot_on_sponsorship_update", false), (luk) null);
            case 15:
                return new p44(aey0Var.c("android-adsinternal-playback:enable_contiguous_viewability_observer_for_in_stream_ads", false), aey0Var.c("android-adsinternal-playback:enable_continuous_viewability_observer_for_in_stream_ads", false), (luk) null);
            case 16:
                return new q44(aey0Var.c("android-age-verification-age-assurance-video-blocker-impl:enable_video_blocker", false), (luk) null);
            case 17:
                return new r44(aey0Var.c("android-aipartner-naturallanguageurihandler:enable_handler", false), aey0Var.c("android-aipartner-naturallanguageurihandler:enable_interceptor", false), (luk) null);
            case 18:
                return new s44(aey0Var.c("android-aipartner-prompt-suggestions-provider:enable_prompt_suggestions", true), (xz11) null);
            case 19:
                return new t44(aey0Var.c("android-aishared:usage_limits_bottom_sheet_enabled", false), null);
            case 20:
                return new u44(aey0Var.c("android-album-albumpage:header_progress_bar_enabled", false), aey0Var.c("android-album-albumpage:music_video_download_enabled", false), (luk) null);
            case 21:
                return new w44(aey0Var.c("android-allboarding-branch:is_branch_initialisation_enabled", false), null);
            case 22:
                return new z44(aey0Var.c("android-app-music-scopes-deferred:enable_background_verification_trigger", true), null);
            case 23:
                return new a54(aey0Var.c("android-app-music-toolbar:unified_toolbar_action_style_enabled", false), null);
            case 24:
                return new b54(aey0Var.c("android-app-state-accessories-bluetooth:use_accessory_state_manager", false), (luk) null);
            case 25:
                return new d54(aey0Var.c("android-artist-contextmenuimpl:artist_context_menu_page_api_enabled", false), (luk) null);
            case 26:
                return new e54(aey0Var.c("android-artist-creatorartist:enable_biography_page", false), (luk) null);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new f54(aey0Var.c("android-artist-releases:enable_artist_catalog_videos_for_mft_plus", false), aey0Var.c("android-artist-releases:show_locked_album_ui", false), aey0Var.c("android-artist-releases:use_new_releases_page", false), aey0Var.c("android-artist-releases:use_platform_release_row", false), (luk) null);
            case 28:
                return new i54(aey0Var.c("android-assisted-curation-curation-handler-playlist:fully_support_audiobooks", false), null);
            default:
                return new j54(aey0Var.c("android-audio-focus-audio-focus-impl:check_audio_track_in_abandon_audio_focus", false), (luk) null);
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
            case 17:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 18:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 19:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 20:
                if ((obj instanceof ydy0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 21:
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
            case 24:
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
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
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
        j54 j54Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (e42) j54Var, e42.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AdsDeviceInfoProperties;", 0);
            case 1:
                return new tv30(1, (r34) j54Var, r34.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/audiobook/AndroidAbpProperties;", 0);
            case 2:
                return new tv30(1, (v34) j54Var, v34.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/accountmanagementplatform/properties/AndroidAccountManagementPlatformProperties;", 0);
            case 3:
                return new tv30(1, (w34) j54Var, w34.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAccountswitchingAddaccountpageProperties;", 0);
            case 4:
                return new tv30(1, (x34) j54Var, x34.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/accountswitching/accountswitchingrollout/AndroidAccountswitchingProperties;", 0);
            case 5:
                return new tv30(1, (y34) j54Var, y34.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAccountswitchingSwitcherstateimplProperties;", 0);
            case 6:
                return new tv30(1, (z34) j54Var, z34.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/accountswitching/accountswitchingrollout/AndroidAccountswitchingUnauthProperties;", 0);
            case 7:
                return new tv30(1, (a44) j54Var, a44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAdOnAppOpenProperties;", 0);
            case 8:
                return new tv30(1, (g44) j54Var, g44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAdsdisplayAdsProperties;", 0);
            case 9:
                return new tv30(1, (i44) j54Var, i44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAdsdisplayElementimplProperties;", 0);
            case 10:
                return new tv30(1, (j44) j54Var, j44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAdsdisplayEmbeddedadProperties;", 0);
            case 11:
                return new tv30(1, (k44) j54Var, k44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/adsdisplay/podcastsponsorship/properties/AndroidAdsdisplayPodcastsponsorshipProperties;", 0);
            case 12:
                return new tv30(1, (l44) j54Var, l44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAdsdisplayProductssponsorshipProperties;", 0);
            case 13:
                return new tv30(1, (n44) j54Var, n44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAdsdisplaySettingsProperties;", 0);
            case 14:
                return new tv30(1, (o44) j54Var, o44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAdsdisplaySponsorshipimplProperties;", 0);
            case 15:
                return new tv30(1, (p44) j54Var, p44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAdsinternalPlaybackProperties;", 0);
            case 16:
                return new tv30(1, (q44) j54Var, q44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/ageverification/ageassurancevideoblockerimpl/AndroidAgeVerificationAgeAssuranceVideoBlockerImplProperties;", 0);
            case 17:
                return new tv30(1, (r44) j54Var, r44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAipartnerNaturallanguageurihandlerProperties;", 0);
            case 18:
                return new tv30(1, (s44) j54Var, s44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/aipartner/promptsuggestionsprovider/rc/AndroidAipartnerPromptSuggestionsProviderUnauthProperties;", 0);
            case 19:
                return new tv30(1, (t44) j54Var, t44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAisharedProperties;", 0);
            case 20:
                return new tv30(1, (u44) j54Var, u44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/album/albumpage/AndroidAlbumAlbumpageProperties;", 0);
            case 21:
                return new tv30(1, (w44) j54Var, w44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAllboardingBranchProperties;", 0);
            case 22:
                return new tv30(1, (z44) j54Var, z44.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/app/music/scopes/deferred/rc/AndroidAppMusicScopesDeferredProperties;", 0);
            case 23:
                return new tv30(1, (a54) j54Var, a54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/app/music/toolbarproperties/rc/AndroidAppMusicToolbarProperties;", 0);
            case 24:
                return new tv30(1, (b54) j54Var, b54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAppStateAccessoriesBluetoothProperties;", 0);
            case 25:
                return new tv30(1, (d54) j54Var, d54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/artist/contextmenuimpl/remoteconfig/AndroidArtistContextmenuimplProperties;", 0);
            case 26:
                return new tv30(1, (e54) j54Var, e54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/artist/creatorartist/remoteconfig/AndroidArtistCreatorartistProperties;", 0);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new tv30(1, (f54) j54Var, f54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidArtistReleasesProperties;", 0);
            case 28:
                return new tv30(1, (i54) j54Var, i54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidAssistedCurationCurationHandlerPlaylistProperties;", 0);
            default:
                return new tv30(1, j54Var, j54.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/audiofocusimpl/AndroidAudioFocusAudioFocusImplProperties;", 0);
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
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                break;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                break;
            case 28:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
