package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p54 implements ydy0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SingleEmitter b;
    public final /* synthetic */ pdy0 c;

    public /* synthetic */ p54(SingleEmitter singleEmitter, pdy0 pdy0Var, byte b) {
        this.a = b;
        this.b = singleEmitter;
        this.c = pdy0Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        byte b = this.a;
        zs61 zs61Var = this.c;
        SingleEmitter singleEmitter = this.b;
        switch (b) {
            case 0:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-audiobook-playerlistener:should_refresh_capping_state_on_player_error", true)));
                return (q54) zs61Var;
            case 1:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-boombox-settings:crossfade_enabled", true)));
                return (g84) zs61Var;
            case 2:
                singleEmitter.onSuccess(Integer.valueOf(aey0Var.b(144000000, 300000000, 144000000, "android-cal-rollout-service:minimum_gearhead_version")));
                return (o84) zs61Var;
            case 3:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-connectivity:short_circuit_all_offline_states", false)));
                return (hb4) zs61Var;
            case 4:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-feature-kidsmode:debug_is_in_kids_mode", false)));
                return (hg4) zs61Var;
            case 5:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-gen-alpha:use_kids_view_get_children", false)));
                return (hk4) zs61Var;
            case 6:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-genalpha-limitedexperienceindicator:enabled", false)));
                return (jk4) zs61Var;
            case 7:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-media-session:restrict_playing_state_when_connect_car_is_active", false)));
                return (at4) zs61Var;
            case 8:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-player-settings-automix:automix_enabled", true)));
                return (ox4) zs61Var;
            case 9:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-shuffle-settings-algorithm:settings_item_visible", false)));
                return (t15) zs61Var;
            case 10:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-storage-settings-cachelimit:show_cache_limit_item", false)));
                return (b25) zs61Var;
            case 11:
                singleEmitter.onSuccess(aey0Var.a("apps-music-features-remoteconfiguration:button_color", y16.b));
                return (c26) zs61Var;
            default:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("settings-quickaccess:show_quick_access_settings_in_settings", false)));
                return zs61Var;
        }
    }
}
