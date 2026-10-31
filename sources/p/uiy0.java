package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class uiy0 implements ifp0 {
    public final /* synthetic */ byte a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public final void a(Object obj, Object obj2) throws EncodingException {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                jfp0 jfp0Var = (jfp0) obj2;
                jfp0Var.a(viy0.f, entry.getKey());
                jfp0Var.a(viy0.g, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
