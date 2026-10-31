package p;

import com.spotify.scrollsita.v1.Section;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class opl0 implements w6h1 {
    public final /* synthetic */ byte a;
    public final r6h1 b;
    public final y6h1 c;

    public opl0(int i, r6h1 r6h1Var, byte b) {
        this.a = b;
        String str = "ad_partners";
        String str2 = "data_saver_mode";
        String str3 = "chats_played_receipts";
        switch (b) {
            case 9:
                this.b = r6h1Var;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-settings-element-standard-multiplechoice";
                x6h1VarI.f = "4.0.0";
                x6h1VarI.g = "22.0.0";
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        str2 = "download_quality";
                        break;
                    case 3:
                        str2 = "metered_audio_stream_quality";
                        break;
                    case 4:
                        str2 = "metered_video_quality";
                        break;
                    case 5:
                        str2 = "non_metered_audio_stream_quality";
                        break;
                    case 6:
                        str2 = "non_metered_video_quality";
                        break;
                    case 7:
                        str2 = "remote_audio_stream_quality";
                        break;
                    case 8:
                        str2 = "volume_level";
                        break;
                    default:
                        throw null;
                }
                x6h1VarI.b = str2;
                this.c = x6h1VarI.a();
                return;
            case 10:
                this.b = r6h1Var;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-settings-element-standard-navigation";
                x6h1VarI2.f = "26.0.0";
                x6h1VarI2.g = "22.0.0";
                switch (i) {
                    case 1:
                        str = "about_page";
                        break;
                    case 2:
                        str = "account_overview";
                        break;
                    case 3:
                        str = "account_page";
                        break;
                    case 4:
                        break;
                    case 5:
                        str = "address";
                        break;
                    case 6:
                        str = "advertisements_page";
                        break;
                    case 7:
                        str = "age_assurance";
                        break;
                    case 8:
                        str = "app_icon";
                        break;
                    case 9:
                        str = "app_language";
                        break;
                    case 10:
                        str = "apps_and_devices_page";
                        break;
                    case 11:
                        str = "apps_navigation_page";
                        break;
                    case 12:
                        str = "audio_quality_page";
                        break;
                    case 13:
                        str = "australia_online_safety_act";
                        break;
                    case 14:
                        str = "blocked_users_list";
                        break;
                    case 15:
                        str = "business_information";
                        break;
                    case 16:
                        str = "cancel_plan";
                        break;
                    case 17:
                        str = "car_page";
                        break;
                    case 18:
                        str = "car_thing";
                        break;
                    case 19:
                        str = "content_and_display_page";
                        break;
                    case 20:
                        str = "content_preferences_page";
                        break;
                    case 21:
                        str = "cookies";
                        break;
                    case 22:
                        str = "data_saver_page";
                        break;
                    case 23:
                        str = "data_saving_and_offline_page";
                        break;
                    case 24:
                        str = "debug_tools";
                        break;
                    case 25:
                        str = "default_save_locations_page";
                        break;
                    case 26:
                        str = "device_picker";
                        break;
                    case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                        str = "devices_page";
                        break;
                    case 28:
                        str = "employee_tools_page";
                        break;
                    case 29:
                        str = "equalizer";
                        break;
                    case 30:
                        str = "german_ownership_statement";
                        break;
                    case 31:
                        str = "initiate_graduation_page";
                        break;
                    case 32:
                        str = "languages_page";
                        break;
                    case 33:
                        str = "legal_contact_form";
                        break;
                    case 34:
                        str = "library_import";
                        break;
                    case Section.E_READER_FIELD_NUMBER /* 35 */:
                        str = "licenses";
                        break;
                    case 36:
                        str = "licensing_info";
                        break;
                    case 37:
                        str = "listening_activity_audience";
                        break;
                    case 38:
                        str = "local_files_page";
                        break;
                    case 39:
                        str = "login_methods";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.CLIENT_TIMESTAMP_FIELD_NUMBER /* 40 */:
                        str = "manage_apps";
                        break;
                    case 41:
                        str = "manage_playlists_privacy";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.IS_REPEATING_CONTEXT_FIELD_NUMBER /* 42 */:
                        str = "media_quality_page";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.IS_AUDIO_ON_FIELD_NUMBER /* 43 */:
                        str = "music_language";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.IS_VIDEO_ON_FIELD_NUMBER /* 44 */:
                        str = "notice_at_collection";
                        break;
                    case 45:
                        str = "notifications_page";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.PLAYBACK_STACK_V2_FIELD_NUMBER /* 46 */:
                        str = "parental_controls_change_pin";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.PLAYER_SESSION_ID_FIELD_NUMBER /* 47 */:
                        str = "parental_controls_content_requests";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER /* 48 */:
                        str = "parental_controls_create_account";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.CONFIG_PARAMS_FIELD_NUMBER /* 49 */:
                        str = "parental_controls_managed_accounts_request_settings";
                        break;
                    case 50:
                        str = "parental_controls_page";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.VIDEO_SURFACE_V2_FIELD_NUMBER /* 51 */:
                        str = "personal_data_download";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.ON_DEMAND_TYPE_FIELD_NUMBER /* 52 */:
                        str = "plan_manager_privacy_policy";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.ENTRYPOINT_URI_FIELD_NUMBER /* 53 */:
                        str = "platform_rules";
                        break;
                    case 54:
                        str = "playback_page";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.AGENTIC_PRODUCT_TYPE_FIELD_NUMBER /* 55 */:
                        str = "preferred_ad_categories";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.ORCHESTRATION_STACK_FIELD_NUMBER /* 56 */:
                        str = "premium_plans_upsell";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.LIST_URI_FIELD_NUMBER /* 57 */:
                        str = "privacy_and_social_page";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.ATTRIBUTION_FIELD_NUMBER /* 58 */:
                        str = "privacy_policy";
                        break;
                    case 59:
                        str = "profile_view_all_privacy_settings";
                        break;
                    case 60:
                        str = "report_bug";
                        break;
                    case 61:
                        str = "report_user_feedback";
                        break;
                    case 62:
                        str = "request_graduation_page";
                        break;
                    case 63:
                        str = "scta_info";
                        break;
                    case 64:
                        str = "sensitive_ad_categories";
                        break;
                    case 65:
                        str = "storage_location";
                        break;
                    case 66:
                        str = "storage_page";
                        break;
                    case 67:
                        str = "support";
                        break;
                    case 68:
                        str = "terms_and_conditions";
                        break;
                    case 69:
                        str = "update_email";
                        break;
                    case 70:
                        str = "video_quality_page";
                        break;
                    case 71:
                        str = "voice_assistants_page";
                        break;
                    case 72:
                        str = "your_library_settings_page";
                        break;
                    default:
                        throw null;
                }
                x6h1VarI2.b = str;
                this.c = x6h1VarI2.a();
                return;
            case 11:
                this.b = r6h1Var;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-settings-element-standard-switch";
                x6h1VarI3.f = "25.0.0";
                x6h1VarI3.g = "22.0.0";
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        str = "allow_audio_quality_downgrade";
                        break;
                    case 3:
                        str = "automix";
                        break;
                    case 4:
                        str = "autoplay";
                        break;
                    case 5:
                        str = "background_downloads";
                        break;
                    case 6:
                        str = "canvas";
                        break;
                    case 7:
                        str = "chats";
                        break;
                    case 8:
                        str = "chats_played_receipts";
                        break;
                    case 9:
                        str = "chats_saved_receipts";
                        break;
                    case 10:
                        str = "chats_seen_receipts";
                        break;
                    case 11:
                        str = "chats_show_suggestions";
                        break;
                    case 12:
                        str = "chats_show_up_in_suggestions";
                        break;
                    case 13:
                        str = "connect_in_background";
                        break;
                    case 14:
                        str = "create_button";
                        break;
                    case 15:
                        str = "data_saver_mode";
                        break;
                    case 16:
                        str = "device_broadcast_status";
                        break;
                    case 17:
                        str = "disable_personalized_recommendations";
                        break;
                    case 18:
                        str = "dj_voice_improvements";
                        break;
                    case 19:
                        str = "download_over_3g";
                        break;
                    case 20:
                        str = "dynamic_normalizer";
                        break;
                    case 21:
                        str = "explicit_content";
                        break;
                    case 22:
                        str = "feedback_sounds";
                        break;
                    case 23:
                        str = "gapless";
                        break;
                    case 24:
                        str = "hide_unplayable_songs";
                        break;
                    case 25:
                        str = "kids_family_exclude";
                        break;
                    case 26:
                        str = "larger_npb_video";
                        break;
                    case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                        str = "library_pin_section";
                        break;
                    case 28:
                        str = "list_privacy";
                        break;
                    case 29:
                        str = "local_files_library";
                        break;
                    case 30:
                        str = "mono_audio";
                        break;
                    case 31:
                        str = "music_videos";
                        break;
                    case 32:
                        str = "normalize_volume";
                        break;
                    case 33:
                        str = "offline_mode";
                        break;
                    case 34:
                        str = "offline_playback";
                        break;
                    case Section.E_READER_FIELD_NUMBER /* 35 */:
                        str = "on_the_fly_normalizer";
                        break;
                    case 36:
                        str = "other_videos";
                        break;
                    case 37:
                        str = "picture_in_picture";
                        break;
                    case 38:
                        str = "prevent_screen_lock_in_car";
                        break;
                    case 39:
                        str = "private_session";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.CLIENT_TIMESTAMP_FIELD_NUMBER /* 40 */:
                        str = "publish_list_to_profile";
                        break;
                    case 41:
                        str = "publish_listening_activity";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.IS_REPEATING_CONTEXT_FIELD_NUMBER /* 42 */:
                        str = "reduce_distractions";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.IS_AUDIO_ON_FIELD_NUMBER /* 43 */:
                        str = "shake_to_report_feedback";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.IS_VIDEO_ON_FIELD_NUMBER /* 44 */:
                        str = "show_followers_following";
                        break;
                    case 45:
                        str = "show_local_devices_only";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.PLAYBACK_STACK_V2_FIELD_NUMBER /* 46 */:
                        str = "show_playlists_section_on_profile";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.PLAYER_SESSION_ID_FIELD_NUMBER /* 47 */:
                        str = "show_recently_played_artists";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER /* 48 */:
                        str = "show_unplayable_songs";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.CONFIG_PARAMS_FIELD_NUMBER /* 49 */:
                        str = "silence_trimmer";
                        break;
                    case 50:
                        str = "smart_shuffle";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.VIDEO_SURFACE_V2_FIELD_NUMBER /* 51 */:
                        str = "video_podcasts_download_audio_only";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.ON_DEMAND_TYPE_FIELD_NUMBER /* 52 */:
                        str = "video_podcasts_stream_audio_only";
                        break;
                    case StreamStartRequestOuterClass$StreamStartRequest.ENTRYPOINT_URI_FIELD_NUMBER /* 53 */:
                        str = "view_listening_activity";
                        break;
                    case 54:
                        str = "voice_assistant_suggestions";
                        break;
                    default:
                        throw null;
                }
                x6h1VarI3.b = str;
                this.c = x6h1VarI3.a();
                return;
            default:
                this.b = r6h1Var;
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-settings-confirmation-dialog";
                x6h1VarI4.f = "8.0.0";
                x6h1VarI4.g = "22.0.0";
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        str3 = "chats_saved_receipts";
                        break;
                    case 3:
                        str3 = "chats_seen_receipts";
                        break;
                    case 4:
                        str3 = "chats_show_suggestions";
                        break;
                    case 5:
                        str3 = "chats_show_up_in_suggestions";
                        break;
                    case 6:
                        str3 = "download_quality_resync";
                        break;
                    case 7:
                        str3 = "equalizer_warning";
                        break;
                    case 8:
                        str3 = "listening_activity_disable_sharing_when_viewing_toggled_off";
                        break;
                    case 9:
                        str3 = "listening_activity_enable_viewing_when_sharing_toggled_on";
                        break;
                    case 10:
                        str3 = "managed_account_prompt_on_kids_exclude";
                        break;
                    case 11:
                        str3 = "normalize_volume_level_non_quiet";
                        break;
                    case 12:
                        str3 = "normalize_volume_turn_off";
                        break;
                    case 13:
                        str3 = "normalize_volume_turn_on_with_non_quiet_level";
                        break;
                    case 14:
                        str3 = "private_session_explainer";
                        break;
                    default:
                        throw null;
                }
                x6h1VarI4.b = str3;
                this.c = x6h1VarI4.a();
                return;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        r6h1 r6h1Var = this.b;
        y6h1 y6h1Var = this.c;
        switch (b) {
            case 0:
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var.b);
            case 2:
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var.b);
            case 3:
                r6h1 r6h1Var5 = r6h1.c;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var.b);
            case 4:
                r6h1 r6h1Var6 = r6h1.c;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(r6h1Var.a);
                arrayList5.add(y6h1Var);
                return new r6h1(arrayList5, r6h1Var.b);
            case 5:
                r6h1 r6h1Var7 = r6h1.c;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(r6h1Var.a);
                arrayList6.add(y6h1Var);
                return new r6h1(arrayList6, r6h1Var.b);
            case 6:
                r6h1 r6h1Var8 = r6h1.c;
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(r6h1Var.a);
                arrayList7.add(y6h1Var);
                return new r6h1(arrayList7, r6h1Var.b);
            case 7:
                r6h1 r6h1Var9 = r6h1.c;
                ArrayList arrayList8 = new ArrayList();
                arrayList8.addAll(r6h1Var.a);
                arrayList8.add(y6h1Var);
                return new r6h1(arrayList8, r6h1Var.b);
            case 8:
                r6h1 r6h1Var10 = r6h1.c;
                ArrayList arrayList9 = new ArrayList();
                arrayList9.addAll(r6h1Var.a);
                arrayList9.add(y6h1Var);
                return new r6h1(arrayList9, r6h1Var.b);
            case 9:
                r6h1 r6h1Var11 = r6h1.c;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(r6h1Var.a);
                arrayList10.add(y6h1Var);
                return new r6h1(arrayList10, r6h1Var.b);
            case 10:
                r6h1 r6h1Var12 = r6h1.c;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.addAll(r6h1Var.a);
                arrayList11.add(y6h1Var);
                return new r6h1(arrayList11, r6h1Var.b);
            case 11:
                r6h1 r6h1Var13 = r6h1.c;
                ArrayList arrayList12 = new ArrayList();
                arrayList12.addAll(r6h1Var.a);
                arrayList12.add(y6h1Var);
                return new r6h1(arrayList12, r6h1Var.b);
            case 12:
                r6h1 r6h1Var14 = r6h1.c;
                ArrayList arrayList13 = new ArrayList();
                arrayList13.addAll(r6h1Var.a);
                arrayList13.add(y6h1Var);
                return new r6h1(arrayList13, r6h1Var.b);
            case 13:
                r6h1 r6h1Var15 = r6h1.c;
                ArrayList arrayList14 = new ArrayList();
                arrayList14.addAll(r6h1Var.a);
                arrayList14.add(y6h1Var);
                return new r6h1(arrayList14, r6h1Var.b);
            case 14:
                r6h1 r6h1Var16 = r6h1.c;
                ArrayList arrayList15 = new ArrayList();
                arrayList15.addAll(r6h1Var.a);
                arrayList15.add(y6h1Var);
                return new r6h1(arrayList15, r6h1Var.b);
            case 15:
                r6h1 r6h1Var17 = r6h1.c;
                ArrayList arrayList16 = new ArrayList();
                arrayList16.addAll(r6h1Var.a);
                arrayList16.add(y6h1Var);
                return new r6h1(arrayList16, r6h1Var.b);
            case 16:
                r6h1 r6h1Var18 = r6h1.c;
                ArrayList arrayList17 = new ArrayList();
                arrayList17.addAll(r6h1Var.a);
                arrayList17.add(y6h1Var);
                return new r6h1(arrayList17, r6h1Var.b);
            case 17:
                r6h1 r6h1Var19 = r6h1.c;
                ArrayList arrayList18 = new ArrayList();
                arrayList18.addAll(r6h1Var.a);
                arrayList18.add(y6h1Var);
                return new r6h1(arrayList18, r6h1Var.b);
            case 18:
                r6h1 r6h1Var20 = r6h1.c;
                ArrayList arrayList19 = new ArrayList();
                arrayList19.addAll(r6h1Var.a);
                arrayList19.add(y6h1Var);
                return new r6h1(arrayList19, r6h1Var.b);
            case 19:
                r6h1 r6h1Var21 = r6h1.c;
                ArrayList arrayList20 = new ArrayList();
                arrayList20.addAll(r6h1Var.a);
                arrayList20.add(y6h1Var);
                return new r6h1(arrayList20, r6h1Var.b);
            case 20:
                r6h1 r6h1Var22 = r6h1.c;
                ArrayList arrayList21 = new ArrayList();
                arrayList21.addAll(r6h1Var.a);
                arrayList21.add(y6h1Var);
                return new r6h1(arrayList21, r6h1Var.b);
            case 21:
                r6h1 r6h1Var23 = r6h1.c;
                ArrayList arrayList22 = new ArrayList();
                arrayList22.addAll(r6h1Var.a);
                arrayList22.add(y6h1Var);
                return new r6h1(arrayList22, r6h1Var.b);
            case 22:
                r6h1 r6h1Var24 = r6h1.c;
                ArrayList arrayList23 = new ArrayList();
                arrayList23.addAll(r6h1Var.a);
                arrayList23.add(y6h1Var);
                return new r6h1(arrayList23, r6h1Var.b);
            case 23:
                r6h1 r6h1Var25 = r6h1.c;
                ArrayList arrayList24 = new ArrayList();
                arrayList24.addAll(r6h1Var.a);
                arrayList24.add(y6h1Var);
                return new r6h1(arrayList24, r6h1Var.b);
            case 24:
                r6h1 r6h1Var26 = r6h1.c;
                ArrayList arrayList25 = new ArrayList();
                arrayList25.addAll(r6h1Var.a);
                arrayList25.add(y6h1Var);
                return new r6h1(arrayList25, r6h1Var.b);
            case 25:
                r6h1 r6h1Var27 = r6h1.c;
                ArrayList arrayList26 = new ArrayList();
                arrayList26.addAll(r6h1Var.a);
                arrayList26.add(y6h1Var);
                return new r6h1(arrayList26, r6h1Var.b);
            case 26:
                r6h1 r6h1Var28 = r6h1.c;
                ArrayList arrayList27 = new ArrayList();
                arrayList27.addAll(r6h1Var.a);
                arrayList27.add(y6h1Var);
                return new r6h1(arrayList27, r6h1Var.b);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                r6h1 r6h1Var29 = r6h1.c;
                ArrayList arrayList28 = new ArrayList();
                arrayList28.addAll(r6h1Var.a);
                arrayList28.add(y6h1Var);
                return new r6h1(arrayList28, (u8h1) null);
            case 28:
                r6h1 r6h1Var30 = r6h1.c;
                ArrayList arrayList29 = new ArrayList();
                arrayList29.addAll(r6h1Var.a);
                arrayList29.add(y6h1Var);
                return new r6h1(arrayList29, (u8h1) null);
            default:
                r6h1 r6h1Var31 = r6h1.c;
                ArrayList arrayList30 = new ArrayList();
                arrayList30.addAll(r6h1Var.a);
                arrayList30.add(y6h1Var);
                return new r6h1(arrayList30, (u8h1) null);
        }
    }

    public w7h1 i(String str) {
        z7h1 z7h1Var = new z7h1("auto", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str)), this.c, this.b, System.currentTimeMillis());
    }

    public owl0 j() {
        return new owl0(this);
    }

    public opl0(byte b, Integer num, String str, r6h1 r6h1Var) {
        this.a = b;
        switch (b) {
            case 23:
                this.b = r6h1Var;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-smart-shuffle-track-row-recs";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.c = num;
                x6h1VarI.d = str;
                this.c = x6h1VarI.a();
                break;
            default:
                this.b = r6h1Var;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-preview";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.c = num;
                x6h1VarI2.d = str;
                this.c = x6h1VarI2.a();
                break;
        }
    }

    public opl0(Integer num, String str, r6h1 r6h1Var) {
        this.a = (byte) 3;
        this.b = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-reflection-section";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.c = num;
        this.c = x6h1VarI.a();
    }

    public opl0(r6h1 r6h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 7:
                this.b = r6h1Var;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-settings-element-standard-action";
                x6h1VarI.f = "4.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = "join_nearby";
                this.c = x6h1VarI.a();
                break;
            case 8:
                this.b = r6h1Var;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-settings-element-standard-footnote";
                x6h1VarI2.f = "2.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.b = "privacy_settings_web";
                this.c = x6h1VarI2.a();
                break;
            case 9:
            case 10:
            case 11:
            case 23:
            case 24:
            default:
                this.b = r6h1Var;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-session-control-chips-v2";
                x6h1VarI3.f = "2.1.0";
                x6h1VarI3.g = "22.0.0";
                this.c = x6h1VarI3.a();
                break;
            case 12:
                this.b = r6h1Var;
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-settings-item-deletecache";
                x6h1VarI4.f = "1.0.0";
                x6h1VarI4.g = "22.0.0";
                this.c = x6h1VarI4.a();
                break;
            case 13:
                this.b = r6h1Var;
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-settings-item-librarylayout";
                x6h1VarI5.f = "1.0.0";
                x6h1VarI5.g = "22.0.0";
                this.c = x6h1VarI5.a();
                break;
            case 14:
                this.b = r6h1Var;
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI6 = i3o1.i();
                x6h1VarI6.h = "music";
                x6h1VarI6.a = "mobile-settings-item-offlineplayback";
                x6h1VarI6.f = "1.0.0";
                x6h1VarI6.g = "22.0.0";
                this.c = x6h1VarI6.a();
                break;
            case 15:
                this.b = r6h1Var;
                y6h1 y6h1Var7 = y6h1.i;
                x6h1 x6h1VarI7 = i3o1.i();
                x6h1VarI7.h = "music";
                x6h1VarI7.a = "mobile-settings-item-pinslayout";
                x6h1VarI7.f = "1.0.0";
                x6h1VarI7.g = "22.0.0";
                this.c = x6h1VarI7.a();
                break;
            case 16:
                this.b = r6h1Var;
                y6h1 y6h1Var8 = y6h1.i;
                x6h1 x6h1VarI8 = i3o1.i();
                x6h1VarI8.h = "music";
                x6h1VarI8.a = "mobile-settings-item-removedownloads";
                x6h1VarI8.f = "1.0.0";
                x6h1VarI8.g = "22.0.0";
                this.c = x6h1VarI8.a();
                break;
            case 17:
                this.b = r6h1Var;
                y6h1 y6h1Var9 = y6h1.i;
                x6h1 x6h1VarI9 = i3o1.i();
                x6h1VarI9.h = "music";
                x6h1VarI9.a = "mobile-settings-shuffle";
                x6h1VarI9.f = "0.1.0";
                x6h1VarI9.g = "22.0.0";
                this.c = x6h1VarI9.a();
                break;
            case 18:
                this.b = r6h1Var;
                y6h1 y6h1Var10 = y6h1.i;
                x6h1 x6h1VarI10 = i3o1.i();
                x6h1VarI10.h = "music";
                x6h1VarI10.a = "mobile-share-sheet-on-platform-section";
                x6h1VarI10.f = "2.0.1";
                x6h1VarI10.g = "22.0.0";
                this.c = x6h1VarI10.a();
                break;
            case 19:
                this.b = r6h1Var;
                y6h1 y6h1Var11 = y6h1.i;
                x6h1 x6h1VarI11 = i3o1.i();
                x6h1VarI11.h = "music";
                x6h1VarI11.a = "mobile-share-sheet-tool-chapter-selector";
                x6h1VarI11.f = "4.0.1";
                x6h1VarI11.g = "22.0.0";
                this.c = x6h1VarI11.a();
                break;
            case 20:
                this.b = r6h1Var;
                y6h1 y6h1Var12 = y6h1.i;
                x6h1 x6h1VarI12 = i3o1.i();
                x6h1VarI12.h = "music";
                x6h1VarI12.a = "mobile-share-sheet-tool-collaborators-toggle";
                x6h1VarI12.f = "3.0.1";
                x6h1VarI12.g = "22.0.0";
                this.c = x6h1VarI12.a();
                break;
            case 21:
                this.b = r6h1Var;
                y6h1 y6h1Var13 = y6h1.i;
                x6h1 x6h1VarI13 = i3o1.i();
                x6h1VarI13.h = "music";
                x6h1VarI13.a = "mobile-share-sheet-tool-media-trimmer";
                x6h1VarI13.f = "3.0.1";
                x6h1VarI13.g = "22.0.0";
                this.c = x6h1VarI13.a();
                break;
            case 22:
                this.b = r6h1Var;
                y6h1 y6h1Var14 = y6h1.i;
                x6h1 x6h1VarI14 = i3o1.i();
                x6h1VarI14.h = "music";
                x6h1VarI14.a = "mobile-share-sheet-tool-swatch";
                x6h1VarI14.f = "4.0.1";
                x6h1VarI14.g = "22.0.0";
                this.c = x6h1VarI14.a();
                break;
            case 25:
                this.b = r6h1Var;
                y6h1 y6h1Var15 = y6h1.i;
                x6h1 x6h1VarI15 = i3o1.i();
                x6h1VarI15.h = "music";
                x6h1VarI15.a = "mobile-sponsoredplaylist-npb-attachment";
                x6h1VarI15.f = "0.1.0";
                x6h1VarI15.g = "22.0.0";
                this.c = x6h1VarI15.a();
                break;
            case 26:
                this.b = r6h1Var;
                y6h1 y6h1Var16 = y6h1.i;
                x6h1 x6h1VarI16 = i3o1.i();
                x6h1VarI16.h = "music";
                x6h1VarI16.a = "mobile-undo-redo-controls";
                x6h1VarI16.f = "1.0.0";
                x6h1VarI16.g = "22.0.0";
                this.c = x6h1VarI16.a();
                break;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                this.b = r6h1Var;
                y6h1 y6h1Var17 = y6h1.i;
                x6h1 x6h1VarI17 = i3o1.i();
                x6h1VarI17.h = "music";
                x6h1VarI17.a = "mobile-wrapped-artist-cards";
                x6h1VarI17.f = "1.1.0";
                x6h1VarI17.g = "22.0.0";
                this.c = x6h1VarI17.a();
                break;
            case 28:
                this.b = r6h1Var;
                y6h1 y6h1Var18 = y6h1.i;
                x6h1 x6h1VarI18 = i3o1.i();
                x6h1VarI18.h = "music";
                x6h1VarI18.a = "mobile-wrapped-audio-preview-chip";
                x6h1VarI18.f = "1.0.0";
                x6h1VarI18.g = "22.0.0";
                this.c = x6h1VarI18.a();
                break;
            case 29:
                this.b = r6h1Var;
                y6h1 y6h1Var19 = y6h1.i;
                x6h1 x6h1VarI19 = i3o1.i();
                x6h1VarI19.h = "music";
                x6h1VarI19.a = "mobile-wrapped-bottom-bar";
                x6h1VarI19.f = "1.0.0";
                x6h1VarI19.g = "22.0.0";
                this.c = x6h1VarI19.a();
                break;
        }
    }

    public opl0(Integer num, r6h1 r6h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = r6h1Var;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-quiz-round-loading";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.c = num;
                this.c = x6h1VarI.a();
                break;
            default:
                this.b = r6h1Var;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-popular-releases-section";
                x6h1VarI2.f = "2.1.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.c = num;
                this.c = x6h1VarI2.a();
                break;
        }
    }

    public opl0(byte b) {
        this.a = b;
        switch (b) {
            case 24:
                this.b = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-social-on-demand";
                x6h1VarI.f = "0.2.1";
                x6h1VarI.g = "22.0.0";
                this.c = x6h1VarI.a();
                break;
            default:
                this.b = r6h1.c;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-scannables";
                x6h1VarI2.f = "1.0.1";
                x6h1VarI2.g = "22.0.0";
                this.c = x6h1VarI2.a();
                break;
        }
    }
}
