package com.spotify.widgets.npvwidget;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class n {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[WidgetInteraction.BackgroundSessionState.values().length];
        try {
            iArr[WidgetInteraction.BackgroundSessionState.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WidgetInteraction.BackgroundSessionState.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WidgetInteraction.BackgroundSessionState.UNAUTHENTICATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[WidgetInteraction.WrappedVariant.values().length];
        try {
            iArr2[WidgetInteraction.WrappedVariant.STORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[WidgetInteraction.WrappedVariant.PLAYLIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
