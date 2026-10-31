package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.graduation.v1.DownloadStatus;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class sm40 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DownloadStatus.values().length];
        try {
            iArr[DownloadStatus.REQUESTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DownloadStatus.READY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[DataSectionType.values().length];
        try {
            iArr2[DataSectionType.ACCOUNT_DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[DataSectionType.EXTENDED_STREAMING_HISTORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[DataSectionType.TECHNICAL_LOG_INFORMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
