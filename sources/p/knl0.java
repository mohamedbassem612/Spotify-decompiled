package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract /* synthetic */ class knl0 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "editable";
        }
        if (i == 2) {
            return "non_editable";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "blends";
            case 2:
                return "collaborative_playlists";
            case 3:
                return "content_sharing";
            case 4:
                return "family";
            case 5:
                return "following";
            case 6:
                return "group_sessions";
            case 7:
                return "messaging";
            case 8:
                return "unspecified";
            case 9:
                return "wrapped_party";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "add_to_playlist";
            case 2:
                return "already_reordered";
            case 3:
                return "content_not_available";
            case 4:
                return "disconnect_connect";
            case 5:
                return "duplicate_mix";
            case 6:
                return "edit_reorder";
            case 7:
                return "enable_reorder";
            case 8:
                return "free_upsell";
            case 9:
                return "keep_transitions";
            case 10:
                return "need_more_tracks";
            case 11:
                return "non_beatmatched_tracks";
            case 12:
                return "overwrite_transition";
            case 13:
                return "pending_changes";
            case 14:
                return "remove_custom_transition";
            case 15:
                return "reorder_override_warning";
            case 16:
                return "restore_playlist_history";
            case 17:
                return "save_and_continue";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "in_delay";
            case 2:
                return "in_echo";
            case 3:
                return "in_filter_cutoff";
            case 4:
                return "in_filter_resonance";
            case 5:
                return "in_high_eq";
            case 6:
                return "in_low_eq";
            case 7:
                return "in_mid_eq";
            case 8:
                return "in_reverb";
            case 9:
                return "in_volume";
            case 10:
                return "out_delay";
            case 11:
                return "out_echo";
            case 12:
                return "out_filter_cutoff";
            case 13:
                return "out_filter_resonance";
            case 14:
                return "out_high_eq";
            case 15:
                return "out_low_eq";
            case 16:
                return "out_mid_eq";
            case 17:
                return "out_reverb";
            case 18:
                return "out_volume";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "create";
        }
        if (i == 2) {
            return "move";
        }
        if (i == 3) {
            return "remove";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "adjusted_speed_disclosure";
        }
        if (i == 2) {
            return "adjusted_speed_disclosure_with_direct_opt_out";
        }
        if (i == 3) {
            return "adjusted_speed_disclosure_with_opt_out_guidance";
        }
        if (i == 4) {
            return "opt_in";
        }
        if (i == 5) {
            return "turn_off_speed_changes";
        }
        throw null;
    }
}
