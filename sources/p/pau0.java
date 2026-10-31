package p;

import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class pau0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WidgetState.PlayPauseState.values().length];
        try {
            iArr[WidgetState.PlayPauseState.PLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetState.PlayPauseState.PLAY_DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WidgetState.PlayPauseState.PAUSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WidgetState.PlayPauseState.PAUSE_DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
