package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k980 {
    public static final k980 c = new k980("active_device_flipped_quickly_between_local_and_connect", true);
    public static final k980 d = new k980("audio_route_flipped_quickly_to_and_from_projected", true);
    public static final k980 e = new k980("car_bluetooth_present_but_playing_on_another_bt_device", false);
    public static final k980 f = new k980("car_detected_playing_elsewhere", false);
    public static final k980 g = new k980("jumpstart_interrupted_resumed_playback", true);
    public static final k980 h = new k980("jumpstart_playing_elsewhere", false);
    public static final k980 i = new k980("mobile_active_and_embedded_available", false);
    public static final k980 j = new k980("new_connect_device_available_shortly_after_jumpstart_or_cold_start", true);
    public static final k980 k = new k980("player_state_flipped_quickly_between_play_and_pause", true);
    public static final k980 l = new k980("projected_connected_and_playing_from_wrong_audio_route", false);
    public final String a;
    public final boolean b;

    public k980(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }
}
