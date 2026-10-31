package com.spotify.playbacknative;

import android.content.Context;
import android.os.Build;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.nhc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ*\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\"\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\tH\u0002J\b\u0010\u0014\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/spotify/playbacknative/FloatPcmSupportDeviceSet;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "isFloatPcmSupported", "", "manufacturer", "", "version", "", "isFloatPcmSupportedForOboe", "allowNonSamsung", "allowSamsungBelowAndroid12", "isSamsung", "isSamsungFloatPcmSupported", "allowBelowAndroid12", "isSamsungExperienceSystemFeatureAvailable", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class FloatPcmSupportDeviceSet {
    private final Context context;

    public FloatPcmSupportDeviceSet(Context context) {
        this.context = context;
    }

    public static /* synthetic */ boolean isFloatPcmSupportedForOboe$default(FloatPcmSupportDeviceSet floatPcmSupportDeviceSet, String str, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        return floatPcmSupportDeviceSet.isFloatPcmSupportedForOboe(str, i, z, z2);
    }

    private final boolean isSamsung(String manufacturer) {
        return nhc1.S(manufacturer, "Samsung", true);
    }

    private final boolean isSamsungExperienceSystemFeatureAvailable() {
        return this.context.getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile") || this.context.getPackageManager().hasSystemFeature("com.samsung.feature.SAMSUNG_EXPERIENCE");
    }

    private final boolean isSamsungFloatPcmSupported(String manufacturer, int version, boolean allowBelowAndroid12) {
        if (isSamsung(manufacturer)) {
            return (allowBelowAndroid12 || version >= 31) && isSamsungExperienceSystemFeatureAvailable();
        }
        return false;
    }

    public static /* synthetic */ boolean isSamsungFloatPcmSupported$default(FloatPcmSupportDeviceSet floatPcmSupportDeviceSet, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return floatPcmSupportDeviceSet.isSamsungFloatPcmSupported(str, i, z);
    }

    public final Context getContext() {
        return this.context;
    }

    public final boolean isFloatPcmSupported(String manufacturer, int version) {
        return isSamsungFloatPcmSupported$default(this, manufacturer, version, false, 4, null);
    }

    public final boolean isFloatPcmSupportedForOboe(String manufacturer, int version, boolean allowNonSamsung, boolean allowSamsungBelowAndroid12) {
        return isSamsung(manufacturer) ? isSamsungFloatPcmSupported(manufacturer, version, allowSamsungBelowAndroid12) : allowNonSamsung;
    }

    public final boolean isFloatPcmSupported() {
        return isFloatPcmSupported(Build.MANUFACTURER, Build.VERSION.SDK_INT);
    }

    public final boolean isFloatPcmSupportedForOboe(boolean allowNonSamsung, boolean allowSamsungBelowAndroid12) {
        return isFloatPcmSupportedForOboe(Build.MANUFACTURER, Build.VERSION.SDK_INT, allowNonSamsung, allowSamsungBelowAndroid12);
    }
}
