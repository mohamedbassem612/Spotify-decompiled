package p;

import com.spotify.podcastexperience.showpreferencesimpl.DefaultShowSortOrderPreferences$SortOrderJsonModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract /* synthetic */ class qps {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DefaultShowSortOrderPreferences$SortOrderJsonModel.values().length];
        try {
            iArr[DefaultShowSortOrderPreferences$SortOrderJsonModel.BY_DATE_ASC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DefaultShowSortOrderPreferences$SortOrderJsonModel.BY_DATE_DESC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DefaultShowSortOrderPreferences$SortOrderJsonModel.BY_CONSUMPTION_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
