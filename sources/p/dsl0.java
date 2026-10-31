package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract /* synthetic */ class dsl0 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "capped_drag_handle";
        }
        if (i == 2) {
            return "capped_tap_to_play";
        }
        if (i == 3) {
            return "play_modes_button";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "off_platform";
        }
        if (i == 2) {
            return "on_platform";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "audio_quality";
            case 2:
                return "download";
            case 3:
                return "music_video";
            case 4:
                return "queue_reorder";
            case 5:
                return "shuffle";
            case 6:
                return "skip_next";
            case 7:
                return "track_select";
            case 8:
                return "track_select_search";
            default:
                throw null;
        }
    }

    public static int d(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }
}
