package p;

import com.spotify.contentdelivery.downloadimpl.ManifestException;
import com.spotify.download.esperanto.proto.EsDownload$MediaManifestResponse;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ahs implements av30, k3i1, Function, wjd1 {
    public final /* synthetic */ byte a;
    public final iu30 b;

    public /* synthetic */ ahs(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public iu30 a() {
        return this.b;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                return iu30Var.invoke(obj);
            case 2:
                EsDownload$MediaManifestResponse esDownload$MediaManifestResponse = (EsDownload$MediaManifestResponse) obj;
                if (esDownload$MediaManifestResponse.p() == dnz.MEDIA_MANIFEST_SUCCESS) {
                    if (iu30Var != null) {
                        iu30Var.invoke(Long.valueOf(esDownload$MediaManifestResponse.n()));
                    }
                    Single singleJust = Single.just(esDownload$MediaManifestResponse.o().t());
                    singleJust.getClass();
                    return singleJust;
                }
                Single singleError = Single.error(new ManifestException("errorCode: " + esDownload$MediaManifestResponse.p()));
                singleError.getClass();
                return singleError;
            case 5:
                return iu30Var.invoke(obj);
            default:
                return iu30Var.invoke(obj);
        }
    }

    public void b(String str) {
        this.b.invoke(new oet(str));
    }
}
