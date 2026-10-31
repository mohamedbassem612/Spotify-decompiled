package p;

import android.content.SharedPreferences;
import android.os.Looper;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q5p1 {
    public static final pue0 i = new pue0("FeatureUsageAnalytics", null);
    public static final String j = "22.2.0";
    public static q5p1 k;
    public final emo1 a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final jim0 e = new jim0(Looper.getMainLooper(), (byte) 5);
    public final seg1 d = new seg1(this, (byte) 26);

    public q5p1(SharedPreferences sharedPreferences, emo1 emo1Var, String str) {
        this.b = sharedPreferences;
        this.a = emo1Var;
        this.c = str;
    }

    public static void a(y1p1 y1p1Var) {
        q5p1 q5p1Var;
        if (!emo1.k || (q5p1Var = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = q5p1Var.b;
        String string = Integer.toString(y1p1Var.a);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String strM = l1d.m("feature_usage_timestamp_reported_feature_", string);
        if (!sharedPreferences.contains(strM)) {
            strM = l1d.m("feature_usage_timestamp_detected_feature_", string);
        }
        editorEdit.putLong(strM, q9w.b()).apply();
        q5p1Var.f.add(y1p1Var);
        q5p1Var.e.post(q5p1Var.d);
    }

    public static y1p1 c(String str) {
        try {
            switch (Integer.parseInt(str)) {
                case 0:
                    return y1p1.DEVELOPER_FEATURE_FLAG_UNKNOWN;
                case 1:
                    return y1p1.CAF_CAST_BUTTON;
                case 2:
                    return y1p1.CAF_EXPANDED_CONTROLLER;
                case 3:
                    return y1p1.CAF_MINI_CONTROLLER;
                case 4:
                    return y1p1.CAF_CONTAINER_CONTROLLER;
                case 5:
                    return y1p1.CAST_CONTEXT;
                case 6:
                    return y1p1.IMAGE_CACHE;
                case 7:
                    return y1p1.IMAGE_PICKER;
                case 8:
                    return y1p1.AD_BREAK_PARSER;
                case 9:
                    return y1p1.UI_STYLE;
                case 10:
                    return y1p1.HARDWARE_VOLUME_BUTTON;
                case 11:
                    return y1p1.NON_CAST_DEVICE_PROVIDER;
                case 12:
                    return y1p1.PAUSE_CONTROLLER;
                case 13:
                    return y1p1.SEEK_CONTROLLER;
                case 14:
                    return y1p1.STREAM_VOLUME;
                case 15:
                    return y1p1.UI_MEDIA_CONTROLLER;
                case 16:
                    return y1p1.PLAYBACK_RATE_CONTROLLER;
                case 17:
                    return y1p1.PRECACHE;
                case 18:
                    return y1p1.INSTRUCTIONS_VIEW;
                case 19:
                    return y1p1.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
                case 20:
                    return y1p1.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
                case 21:
                    return y1p1.OPTION_DISABLE_DISCOVERY_AUTOSTART;
                case 22:
                    return y1p1.OPTION_DISABLE_ANALYTICS_LOGGING;
                case 23:
                    return y1p1.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
                case 24:
                    return y1p1.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
                case 25:
                    return y1p1.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
                case 26:
                    return y1p1.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
                case 27:
                    return y1p1.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
                case 28:
                    return y1p1.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
                case 29:
                    return y1p1.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
                case 30:
                    return y1p1.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
                case 31:
                    return y1p1.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
                case 32:
                    return y1p1.CAST_UNAVAILABLE_BUTTON_VISIBLE;
                case 33:
                    return y1p1.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
                case 34:
                    return y1p1.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
                case 35:
                    return y1p1.CAST_OUTPUT_SWITCHER_ENABLED;
                case 36:
                    return y1p1.CAST_TRANSFER_TO_LOCAL_ENABLED;
                case 37:
                    return y1p1.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
                case 38:
                    return y1p1.CAST_BUTTON_DELEGATE;
                case 39:
                    return y1p1.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
                case 40:
                    return y1p1.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
                case 41:
                    return y1p1.CAST_TRANSFER_TO_LOCAL_USED;
                case 42:
                    return y1p1.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 43:
                    return y1p1.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case 44:
                    return y1p1.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
                case 45:
                    return y1p1.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    return y1p1.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    return y1p1.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    return y1p1.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    return y1p1.CAF_NOTIFICATION_SERVICE;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    return y1p1.HARDWARE_VOLUME_BUTTON_PRESS;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    return y1p1.CAST_SDK_DEFAULT_DEVICE_DIALOG;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    return y1p1.CAST_SDK_CUSTOM_DEVICE_DIALOG;
                case 53:
                    return y1p1.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
                case 54:
                    return y1p1.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
                case 55:
                    return y1p1.CAF_MEDIA_NOTIFICATION_PROXY;
                case 56:
                    return y1p1.REMOTE_CONNECTION_MANAGER_ACQUIRED;
                case 57:
                    return y1p1.REMOTE_CONNECTION_CALLBACK_SET;
                default:
                    return null;
            }
        } catch (NumberFormatException unused) {
        }
    }

    public final void b(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }
}
