package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class wxq {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DataSectionType.values().length];
        try {
            iArr[DataSectionType.ACCOUNT_DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataSectionType.EXTENDED_STREAMING_HISTORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataSectionType.TECHNICAL_LOG_INFORMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
