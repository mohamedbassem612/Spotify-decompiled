package androidx.car.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import app.p000rive.semantics.SemanticState;
import java.util.Objects;
import p.cy30;
import p.hhg1;
import p.qrd;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class AppInfo {
    public static final String MIN_API_LEVEL_METADATA_KEY = "androidx.car.app.minCarApiLevel";
    private final int mLatestCarAppApiLevel;
    private final String mLibraryVersion;
    private final int mMinCarAppApiLevel;

    private AppInfo() {
        this.mMinCarAppApiLevel = 0;
        this.mLibraryVersion = null;
        this.mLatestCarAppApiLevel = 0;
    }

    public static AppInfo create(Context context) {
        int iRetrieveMinCarAppApiLevel = retrieveMinCarAppApiLevel(context);
        if (iRetrieveMinCarAppApiLevel >= 1 && iRetrieveMinCarAppApiLevel <= zod.B()) {
            return new AppInfo(iRetrieveMinCarAppApiLevel, zod.B(), context.getResources().getString(2131953449));
        }
        StringBuilder sbR = cy30.r(iRetrieveMinCarAppApiLevel, "Min API level (androidx.car.app.minCarApiLevel=", ") is out of range (1-");
        sbR.append(zod.B());
        sbR.append(")");
        throw new IllegalArgumentException(sbR.toString());
    }

    public static int retrieveMinCarAppApiLevel(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), SemanticState.Focused).metaData;
            int i = bundle != null ? bundle.getInt(MIN_API_LEVEL_METADATA_KEY, 0) : 0;
            if (i != 0) {
                return i;
            }
            throw new IllegalArgumentException("Min API level not declared in manifest (androidx.car.app.minCarApiLevel)");
        } catch (PackageManager.NameNotFoundException unused) {
            hhg1.n("Unable to read min API level from manifest");
            return 0;
        }
    }

    public int getLatestCarAppApiLevel() {
        return this.mLatestCarAppApiLevel;
    }

    public String getLibraryDisplayVersion() {
        String str = this.mLibraryVersion;
        Objects.requireNonNull(str);
        return str;
    }

    public int getMinCarAppApiLevel() {
        return this.mMinCarAppApiLevel;
    }

    public String toString() {
        return "Library version: [" + getLibraryDisplayVersion() + "] Min Car Api Level: [" + getMinCarAppApiLevel() + "] Latest Car App Api Level: [" + getLatestCarAppApiLevel() + "]";
    }

    public AppInfo(int i, int i2, String str) {
        this.mMinCarAppApiLevel = i;
        this.mLibraryVersion = str;
        this.mLatestCarAppApiLevel = i2;
    }
}
