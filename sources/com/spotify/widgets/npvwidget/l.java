package com.spotify.widgets.npvwidget;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WidgetInteraction.WrappedVariant.values().length];
        try {
            iArr[WidgetInteraction.WrappedVariant.STORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetInteraction.WrappedVariant.PLAYLIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
