package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class ehn1 implements ifp0 {
    public static final /* synthetic */ ehn1 b = new ehn1(0);
    public static final /* synthetic */ ehn1 c = new ehn1(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ ehn1(byte b2) {
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public final void a(Object obj, Object obj2) throws EncodingException {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                jfp0 jfp0Var = (jfp0) obj2;
                jfp0Var.a(xhn1.f, entry.getKey());
                jfp0Var.a(xhn1.g, entry.getValue());
                return;
            case 1:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                jfp0 jfp0Var2 = (jfp0) obj2;
                jfp0Var2.a(jxn1.f, entry2.getKey());
                jfp0Var2.a(jxn1.g, entry2.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
