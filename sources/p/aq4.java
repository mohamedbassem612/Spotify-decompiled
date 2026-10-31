package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class aq4 implements ydy0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;

    public /* synthetic */ aq4(pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        switch (this.a) {
            case 0:
                return new bq4(aey0Var.c("android-list-ux-platform-consumers-songdnacovers-shared:covers_playlist_plugins_enabled", false), null);
            case 1:
                return new cq4(aey0Var.c("android-list-ux-platform-consumers-sponsoredplaylist-shared:context_menu_as_header_trailing_action_enabled", false), null);
            case 2:
                return new dq4(aey0Var.c("android-list-ux-platform-consumers-standard-headermetadata:header_progress_bar_enabled", false), null);
            case 3:
                return new eq4(aey0Var.c("android-list-ux-platform-consumers-standard-headerplaybutton:enable_for_lists_with_audiobook_content", false), aey0Var.c("android-list-ux-platform-consumers-standard-headerplaybutton:enable_omni_play_button_element", false), null);
            case 4:
                return new fq4(aey0Var.c("android-list-ux-platform-consumers-standard-listcomponents-deletedbyowner:enabled", true), null);
            case 5:
                return new gq4(aey0Var.b(0, 100, 20, "android-list-ux-platform-consumers-standard-listcomponents-kodiakprefetch:kodiak_prefetch_buffer_size"), aey0Var.b(0, 2000, 0, "android-list-ux-platform-consumers-standard-listcomponents-kodiakprefetch:kodiak_prefetch_timeout_ms"), null);
            case 6:
                return new hq4(aey0Var.c("android-list-ux-platform-consumers-standard-listcomponents-privacysnackbar:enabled", true), null);
            case 7:
                return new iq4(aey0Var.c("android-list-ux-platform-consumers-standard-listcomponents-providedsortreconciliation:enabled", true), null);
            case 8:
                return new jq4(aey0Var.c("android-list-ux-platform-consumers-standard-shared:ai_persona_badge_enabled", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:bottom_actions_section_enabled", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:context_menu_as_trailing_action_enabled", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:dod_toolbar_liked_songs_enabled", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:dod_toolbar_non_ucp_enabled", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:dod_toolbar_sticky_chips", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:dod_toolbar_ucp_enabled", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:duplicate_chip_enabled", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:enable_omni_play_intent_handler", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:hide_video_badge_for_tracks", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:play_audiobooks_as_part_of_list", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:replace_settings_chip_with_header_action", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:sort_chip_active_state_enabled", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:use_identity_trait_item_metadata_extension", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:use_kodiak_and_traits_for_add_to_element", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:use_kodiak_and_traits_for_ban_element", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:use_kodiak_and_traits_for_context_menu", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:use_kodiak_and_traits_for_profile_element", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:use_kodiak_and_traits_for_standard_badges", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:use_kodiak_and_traits_for_standard_media", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:use_kodiak_and_traits_for_standard_subtitle", false), aey0Var.c("android-list-ux-platform-consumers-standard-shared:use_kodiak_and_traits_for_standard_title", false), null);
            case 9:
                return new kq4(aey0Var.c("android-list-ux-platform-consumers-stsimported-shared:show_subtitle", false), null);
            case 10:
                return new lq4(aey0Var.c("android-list-ux-platform-consumers-trending-near-you-shared:entity_page_enabled", false), null);
            case 11:
                return new mq4(aey0Var.c("android-list-ux-platform-consumers-wrapped-sharing-preloader:disable_incoming_lens", false), null);
            case 12:
                return new nq4(aey0Var.c("android-list-ux-platform-header-common-impl:hack_use_carefully_may_be_removed_at_any_time_determine_number_of_header_actions_based_on_resources", false), null);
            case 13:
                return new oq4(aey0Var.b(50, 1000, 100, "android-list-ux-platform-itemlistcomposerimpl:view_port_size"), null, aey0Var.c("android-list-ux-platform-itemlistcomposerimpl:use_show_condition_for_sections", false));
            case 14:
                return new pq4(aey0Var.c("android-liveroom-errordialogfragment:enable_livestream_error_dialog_page", false), null);
            case 15:
                return new qq4(aey0Var.c("android-liveroom-listening-party:chat_enabled", false), aey0Var.b(1, 500, 250, "android-liveroom-listening-party:chat_max_messages"), aey0Var.b(0, 10000, 100, "android-liveroom-listening-party:initial_message_buffer_millis"), aey0Var.c("android-liveroom-listening-party:is_chat_expand_button_enabled", true), aey0Var.c("android-liveroom-listening-party:is_fullscreen_chat_controls_enabled", false), aey0Var.b(0, 60000, 20000, "android-liveroom-listening-party:max_live_message_delay_millis"), aey0Var.c("android-liveroom-listening-party:music_playback_coordination_enabled", true), aey0Var.b(0, 10000, 100, "android-liveroom-listening-party:periodic_message_buffer_millis"), aey0Var.b(0, 300, 120, "android-liveroom-listening-party:seconds_to_rewind_live_messages"), (luk) null);
            case 16:
                return new sq4(aey0Var.b(0, 60000, 20000, "android-liveroom-livestreampagefragment:stream_to_main_lifecycle_message_delay_millis"), (luk) null, aey0Var.c("android-liveroom-livestreampagefragment:join_party_on_web_cta_enabled", false), aey0Var.c("android-liveroom-livestreampagefragment:livestream_pause_button_enabled", false), aey0Var.c("android-liveroom-livestreampagefragment:upcoming_listening_parties_enabled", false), aey0Var.c("android-liveroom-livestreampagefragment:voting_widget_enabled", false));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new tq4(aey0Var.c("android-liveroom-nowplayingbar-attachment:listening_party_preview_attachment_enabled", false), (luk) null);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new uq4(aey0Var.c("android-liveroom-preview-ended-events-service:preview_ended_upsell_enabled", false), (luk) null);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new vq4(aey0Var.b(0, 10000, 500, "android-livesharing-controller-impl:pause_playback_delay_millis"), (luk) null, aey0Var.c("android-livesharing-controller-impl:enable_banner_dismiss", false), aey0Var.c("android-livesharing-controller-impl:use_jam_api", false));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new wq4(aey0Var.c("android-livesharing-google-meet:enable_integration", false), (luk) null);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new ar4(aey0Var.c("android-login-settings-loginmethods-impl:login_method_page_enabled", false), (luk) null);
            case 22:
                return new br4(aey0Var.c("android-lyrics-credits:songdna_chip_enabled", false), aey0Var.c("android-lyrics-credits:songdna_credits_enabled", false), (luk) null);
            case 23:
                return new cr4(aey0Var.c("android-lyrics-fullscreenview:enable_lyrics_fullscreen_from_anywhere", false), aey0Var.c("android-lyrics-fullscreenview:enable_lyrics_multilanguage", false), aey0Var.c("android-lyrics-fullscreenview:user_generated_report_enabled", false), (luk) null);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new dr4(aey0Var.b(0, 30000, 1000, "android-lyrics-offline-impl:download_delay_ms"), (luk) null, aey0Var.c("android-lyrics-offline-impl:lyrics_offline_enabled", false), aey0Var.c("android-lyrics-offline-impl:suppress_download_error_retry", false));
            case 25:
                return new er4(aey0Var.c("android-lyrics-share-controller:enable_composer_share", false), aey0Var.c("android-lyrics-share-controller:enable_lyrics_multilanguage", false), (luk) null);
            case 26:
                return new gr4(aey0Var.c("android-lyrics-textelement:active_line_size_indicator_enabled", false), aey0Var.c("android-lyrics-textelement:center_single_line_enabled", false), aey0Var.c("android-lyrics-textelement:deferred_geometry_reads_enabled", false), aey0Var.c("android-lyrics-textelement:fixed_card_constraints_enabled", false), aey0Var.c("android-lyrics-textelement:instrumentation_container_support_enabled", false), aey0Var.a("android-lyrics-textelement:lyrics_type_style", fr4.b), aey0Var.c("android-lyrics-textelement:single_line_touch_through_enabled", false), aey0Var.c("android-lyrics-textelement:stable_highlight_colour_enabled", false), (luk) null);
            case 27:
                return new hr4(aey0Var.c("android-made-for-you-hub:enable_made_for_you_destination_page", false), aey0Var.c("android-made-for-you-hub:enable_made_for_you_hub_page", false), (luk) null);
            case 28:
                return new kr4(aey0Var.a("android-markasplayed:mark_as_played_endpoint_options", jr4.b), (luk) null);
            default:
                return new mr4(aey0Var.c("android-martini-flags:audio_recognition_enabled", false), aey0Var.a("android-martini-flags:card_peek_redesign_enabled", lr4.b), aey0Var.c("android-martini-flags:card_streaming_text_animation_enabled", false), aey0Var.c("android-martini-flags:chat_entry_beta_tag_hidden", false), aey0Var.c("android-martini-flags:chat_playlist_header_enabled", false), aey0Var.c("android-martini-flags:direct_prompt_tap_enabled", false), aey0Var.c("android-martini-flags:full_markdown_rendering_enabled", false), aey0Var.c("android-martini-flags:home_pill_glow_animation_enabled", false), aey0Var.c("android-martini-flags:idj_npv_martini_entry_point_enabled", false), aey0Var.c("android-martini-flags:image_search_enabled", false), aey0Var.c("android-martini-flags:minichat_agent_icon_animation_enabled", false), aey0Var.c("android-martini-flags:minichat_bottom_placement_enabled", false), aey0Var.c("android-martini-flags:minichat_enabled", false), aey0Var.c("android-martini-flags:minichat_thinking_glow_enabled", false), aey0Var.c("android-martini-flags:next_previous_buttons_enabled", false), aey0Var.c("android-martini-flags:no_prompt_suggestions_enabled", false), aey0Var.c("android-martini-flags:npv_agent_button_enabled", false), aey0Var.c("android-martini-flags:npv_floating_chat_enabled", false), aey0Var.c("android-martini-flags:prompt_cta_enabled", false), aey0Var.c("android-martini-flags:realtime_voice_enabled", false), aey0Var.c("android-martini-flags:stop_generation_enabled", false), aey0Var.c("android-martini-flags:story_share_enabled", false), aey0Var.c("android-martini-flags:tts_enabled", false), aey0Var.c("android-martini-flags:vertical_prompt_suggestions_enabled", false), aey0Var.c("android-martini-flags:voice_chat_character_settings_enabled", false), (luk) null);
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
        mr4 mr4Var = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (bq4) mr4Var, bq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/songdnacovers/shared/AndroidListUxPlatformConsumersSongdnacoversSharedProperties;", 0);
            case 1:
                return new tv30(1, (cq4) mr4Var, cq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidListUxPlatformConsumersSponsoredplaylistSharedProperties;", 0);
            case 2:
                return new tv30(1, (dq4) mr4Var, dq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/standard/headermetadata/AndroidListUxPlatformConsumersStandardHeadermetadataProperties;", 0);
            case 3:
                return new tv30(1, (eq4) mr4Var, eq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/standard/headerplaybutton/AndroidListUxPlatformConsumersStandardHeaderplaybuttonProperties;", 0);
            case 4:
                return new tv30(1, (fq4) mr4Var, fq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/standard/listcomponents/deletedbyowner/AndroidListUxPlatformConsumersStandardListcomponentsDeletedbyownerProperties;", 0);
            case 5:
                return new tv30(1, (gq4) mr4Var, gq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/standard/listcomponents/kodiakprefetch/AndroidListUxPlatformConsumersStandardListcomponentsKodiakprefetchProperties;", 0);
            case 6:
                return new tv30(1, (hq4) mr4Var, hq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/standard/listcomponents/privacysnackbar/AndroidListUxPlatformConsumersStandardListcomponentsPrivacysnackbarProperties;", 0);
            case 7:
                return new tv30(1, (iq4) mr4Var, iq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/standard/listcomponents/providedsortreconciliation/AndroidListUxPlatformConsumersStandardListcomponentsProvidedsortreconciliationProperties;", 0);
            case 8:
                return new tv30(1, (jq4) mr4Var, jq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/standard/shared/AndroidListUxPlatformConsumersStandardSharedProperties;", 0);
            case 9:
                return new tv30(1, (kq4) mr4Var, kq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/stsimported/shared/AndroidListUxPlatformConsumersStsimportedSharedProperties;", 0);
            case 10:
                return new tv30(1, (lq4) mr4Var, lq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/trendingnearyou/AndroidListUxPlatformConsumersTrendingNearYouSharedProperties;", 0);
            case 11:
                return new tv30(1, (mq4) mr4Var, mq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatformconsumers/wrapped/preloaders/sharing/rc/AndroidListUxPlatformConsumersWrappedSharingPreloaderProperties;", 0);
            case 12:
                return new tv30(1, (nq4) mr4Var, nq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatform/headercommonimpl/AndroidListUxPlatformHeaderCommonImplProperties;", 0);
            case 13:
                return new tv30(1, (oq4) mr4Var, oq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/listuxplatform/itemlistcomposerimpl/AndroidListUxPlatformItemlistcomposerimplProperties;", 0);
            case 14:
                return new tv30(1, (pq4) mr4Var, pq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/liveroom/errordialogfragment/AndroidLiveroomErrordialogfragmentProperties;", 0);
            case 15:
                return new tv30(1, (qq4) mr4Var, qq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/listeningparty/AndroidLiveroomListeningPartyProperties;", 0);
            case 16:
                return new tv30(1, (sq4) mr4Var, sq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/liveroom/livestreampagefragment/AndroidLiveroomLivestreampagefragmentProperties;", 0);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new tv30(1, (tq4) mr4Var, tq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLiveroomNowplayingbarAttachmentProperties;", 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new tv30(1, (uq4) mr4Var, uq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLiveroomPreviewEndedEventsServiceProperties;", 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new tv30(1, (vq4) mr4Var, vq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLivesharingControllerImplProperties;", 0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new tv30(1, (wq4) mr4Var, wq4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLivesharingGoogleMeetProperties;", 0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new tv30(1, (ar4) mr4Var, ar4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/login/settings/loginmethods/impl/rc/AndroidLoginSettingsLoginmethodsImplProperties;", 0);
            case 22:
                return new tv30(1, (br4) mr4Var, br4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/lyrics/creditsimpl/rc/AndroidLyricsCreditsProperties;", 0);
            case 23:
                return new tv30(1, (cr4) mr4Var, cr4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/lyrics/fullscreenview/AndroidLyricsFullscreenviewProperties;", 0);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new tv30(1, (dr4) mr4Var, dr4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidLyricsOfflineImplProperties;", 0);
            case 25:
                return new tv30(1, (er4) mr4Var, er4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/lyrics/sharecontroller/AndroidLyricsShareControllerProperties;", 0);
            case 26:
                return new tv30(1, (gr4) mr4Var, gr4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/lyrics/textelement/AndroidLyricsTextelementProperties;", 0);
            case 27:
                return new tv30(1, (hr4) mr4Var, hr4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/madeforyou/hub/rc/AndroidMadeForYouHubProperties;", 0);
            case 28:
                return new tv30(1, (kr4) mr4Var, kr4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMarkasplayedProperties;", 0);
            default:
                return new tv30(1, mr4Var, mr4.class, "parse", "parse(Lcom/spotify/remoteconfig/runtime/PropertyParser;)Lcom/spotify/remoteconfig/AndroidMartiniFlagsProperties;", 0);
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
