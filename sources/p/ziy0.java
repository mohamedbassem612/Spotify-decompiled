package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ziy0 implements nsi1 {
    public final /* synthetic */ byte a;
    public boolean b = false;
    public boolean c = false;
    public u120 d;
    public final jfp0 e;

    public /* synthetic */ ziy0(jfp0 jfp0Var, byte b) {
        this.a = b;
        this.e = jfp0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public final nsi1 f(String str) throws EncodingException {
        byte b = this.a;
        jfp0 jfp0Var = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((viy0) jfp0Var).i(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((xhn1) jfp0Var).g(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((jxn1) jfp0Var).g(this.d, str, this.c);
                return this;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.encoders.EncodingException */
    public final nsi1 g(boolean z) throws EncodingException {
        byte b = this.a;
        jfp0 jfp0Var = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((viy0) jfp0Var).g(this.d, z ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((xhn1) jfp0Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((jxn1) jfp0Var).h(this.d, z ? 1 : 0, this.c);
                return this;
        }
    }
}
