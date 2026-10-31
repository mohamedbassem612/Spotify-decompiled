package p;

import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class nx20 implements Parcelable {
    public static final Set b = dm61.z0(blc0.FMA_UPSELL_AUDIO_QUALITY, blc0.FMA_UPSELL_TRACK_SELECT, blc0.FMA_UPSELL_TRACK_SELECT_SEARCH, blc0.FMA_UPSELL_SKIP_NEXT, blc0.FMA_UPSELL_DOWNLOADS, blc0.FMA_UPSELL_SHUFFLE, blc0.FMA_UPSELL_MUSIC_VIDEO, blc0.FMA_UPSELL_QUEUE_REORDER);
    public static final Set c = dm61.z0(ex20.d, lx20.d, mx20.d, kx20.d, fx20.d, jx20.d, gx20.d, hx20.d);
    public final blc0 a;

    public nx20(blc0 blc0Var) {
        this.a = blc0Var;
    }

    public final String a() {
        if (equals(ex20.d)) {
            return "fma_upsell:audio_quality";
        }
        if (equals(lx20.d)) {
            return "fma_upsell:track_select";
        }
        if (equals(kx20.d)) {
            return "fma_upsell:skip_next";
        }
        if (equals(mx20.d)) {
            return "fma_upsell:track_select_search";
        }
        if (equals(fx20.d)) {
            return "fma_upsell:downloads";
        }
        if (equals(jx20.d)) {
            return "fma_upsell:shuffle";
        }
        if (equals(gx20.d)) {
            return "fma_upsell:music_video";
        }
        if (equals(hx20.d)) {
            return "fma_upsell:queue";
        }
        eg.o();
        return null;
    }

    public final int b() {
        if (equals(fx20.d)) {
            return 2;
        }
        if (equals(ex20.d)) {
            return 1;
        }
        if (equals(lx20.d)) {
            return 7;
        }
        if (equals(mx20.d)) {
            return 8;
        }
        if (equals(kx20.d)) {
            return 6;
        }
        if (equals(gx20.d)) {
            return 3;
        }
        if (equals(hx20.d)) {
            return 4;
        }
        if (equals(jx20.d)) {
            return 5;
        }
        eg.o();
        return 0;
    }

    public final String g() {
        w6b1 w6b1VarA = f7b1.a(this.a);
        String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
        if (str != null) {
            return str;
        }
        bhn0.g(this, "No uri found for ");
        return null;
    }
}
