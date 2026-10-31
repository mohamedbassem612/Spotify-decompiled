package p;

import com.spotify.download.esperanto.proto.EsDownload$RequestSegmentDataParams;
import com.spotify.download.esperanto.proto.EsDownload$SegmentFileStreamerId;
import com.spotify.download.esperanto.proto.EsDownload$SegmentRequestMetadata;
import io.reactivex.rxjava3.functions.Function;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m3t0 implements Function {
    public final String a;
    public final long b;
    public long c;
    public final Object d;
    public final Serializable e;

    public /* synthetic */ m3t0(Object obj, String str, Serializable serializable, long j, long j2) {
        this.d = obj;
        this.a = str;
        this.e = serializable;
        this.b = j;
        this.c = j2;
    }

    public Object apply(Object obj) {
        iq51 iq51Var = (iq51) this.d;
        ptu ptuVar = iq51Var.a;
        jnz jnzVarO = EsDownload$RequestSegmentDataParams.o();
        knz knzVarO = EsDownload$SegmentFileStreamerId.o();
        knzVarO.n(((Integer) obj).intValue());
        jnzVarO.s((EsDownload$SegmentFileStreamerId) knzVarO.build());
        jnzVarO.u(this.a);
        URL[] urlArr = (URL[]) this.e;
        ArrayList arrayList = new ArrayList(urlArr.length);
        for (URL url : urlArr) {
            arrayList.add(url.toString());
        }
        jnzVarO.n(arrayList);
        jnzVarO.t(this.b);
        jnzVarO.q(this.c);
        mnz mnzVarN = EsDownload$SegmentRequestMetadata.n();
        mnzVarN.q();
        mnzVarN.r();
        mnzVarN.n();
        jnzVarO.r((EsDownload$SegmentRequestMetadata) mnzVarN.build());
        return ptuVar.callStream("spotify.download.esperanto.proto.Download", "RequestSegmentData", (EsDownload$RequestSegmentDataParams) jnzVarO.build()).map(mpi1.Z0).map(new ks21(iq51Var, (byte) 10));
    }
}
