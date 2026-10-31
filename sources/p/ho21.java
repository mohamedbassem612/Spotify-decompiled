package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.graduation.v1.DownloadLevel;
import com.spotify.graduation.v1.GraduationRequest;
import com.spotify.graduation.v1.GraduationResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ho21 implements vu30 {
    public final oyq a;

    public ho21(oyq oyqVar) {
        this.a = oyqVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        DownloadLevel downloadLevel;
        lnm<? super sy21<GraduationResponse>> lnmVar = (lnm) obj2;
        GraduationRequest.Builder builderNewBuilder = GraduationRequest.newBuilder();
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i = go21.a[((DataSectionType) it.next()).ordinal()];
            if (i == 1) {
                downloadLevel = DownloadLevel.ACCOUNT_DATA;
            } else if (i == 2) {
                downloadLevel = DownloadLevel.EXTENDED_STREAMING_HISTORY;
            } else {
                if (i != 3) {
                    eg.o();
                    return null;
                }
                downloadLevel = DownloadLevel.TECHNICAL_LOG_INFORMATION;
            }
            arrayList.add(downloadLevel);
        }
        builderNewBuilder.addAllLevels(arrayList);
        return this.a.b((GraduationRequest) builderNewBuilder.build(), lnmVar);
    }
}
