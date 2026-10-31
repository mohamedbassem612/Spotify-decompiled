package p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import com.spotify.graduation.v1.Download;
import com.spotify.graduation.v1.DownloadLevel;
import com.spotify.graduation.v1.DownloadStatus;
import com.spotify.graduation.v1.GetDownloadsRequest;
import com.spotify.graduation.v1.GetDownloadsResponse;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class um40 implements iu30 {
    public final oyq a;

    public um40(oyq oyqVar, ulc ulcVar) {
        this.a = oyqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(lnm lnmVar) {
        tm40 tm40Var;
        Object obj;
        if (lnmVar instanceof tm40) {
            tm40Var = (tm40) lnmVar;
            int i = tm40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm40Var.c = i - Integer.MIN_VALUE;
            } else {
                tm40Var = new tm40(this, lnmVar);
            }
        } else {
            tm40Var = new tm40(this, lnmVar);
        }
        Object objA = tm40Var.a;
        int i2 = tm40Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            GetDownloadsRequest.Builder builderNewBuilder = GetDownloadsRequest.newBuilder();
            builderNewBuilder.setUnused("-");
            GetDownloadsRequest getDownloadsRequest = (GetDownloadsRequest) builderNewBuilder.build();
            tm40Var.c = 1;
            objA = this.a.a(getDownloadsRequest, tm40Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        sy21 sy21Var = (sy21) objA;
        ry21 ry21Var = sy21Var.a;
        if (!ry21Var.Q0 || (obj = sy21Var.b) == null) {
            return new qm40(ry21Var.toString());
        }
        List<Download> downloadsList = ((GetDownloadsResponse) obj).getDownloadsList();
        downloadsList.getClass();
        h290 h290Var = (h290) downloadsList;
        return new pm40(p7h.M(new b2r[]{d(h290Var, DataSectionType.ACCOUNT_DATA), d(h290Var, DataSectionType.TECHNICAL_LOG_INFORMATION), d(h290Var, DataSectionType.EXTENDED_STREAMING_HISTORY)}));
    }

    public final b2r d(h290 h290Var, DataSectionType dataSectionType) {
        Object obj;
        c2r d2rVar;
        DownloadLevel downloadLevel;
        Iterator it = h290Var.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            DownloadLevel level = ((Download) next).getLevel();
            int i = sm40.b[dataSectionType.ordinal()];
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
            if (level == downloadLevel) {
                obj = next;
                break;
            }
        }
        Download download = (Download) obj;
        if (download != null) {
            DownloadStatus status = download.getStatus();
            int i2 = status == null ? -1 : sm40.a[status.ordinal()];
            if (i2 != 1) {
                d2rVar = i2 != 2 ? f2r.a : new c2r(ulc.l(download.getDate()), download.getDownloadUrl(), download.getSecurityCode());
            } else {
                d2rVar = new d2r(ulc.l(download.getDate()));
            }
        } else {
            d2rVar = f2r.a;
        }
        return new b2r(dataSectionType, d2rVar);
    }
}
