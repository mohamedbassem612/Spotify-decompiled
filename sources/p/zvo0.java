package p;

import com.spotify.notifications.permissions.uiusecases.permissionscard.PermissionsCard$Events;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract /* synthetic */ class zvo0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PermissionsCard$Events.values().length];
        try {
            iArr[PermissionsCard$Events.ButtonTapped.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
