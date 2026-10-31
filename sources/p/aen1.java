package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class aen1 implements ufp1, zgn1 {
    public static final /* synthetic */ aen1 b = new aen1(0);
    public static final /* synthetic */ aen1 c = new aen1(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ aen1(byte b2) {
        this.a = b2;
    }

    public /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // p.ufp1
    public /* synthetic */ Object b(pno1 pno1Var) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return lhn1.b((ydn1) pno1Var);
            default:
                return ign1.a((odn1) pno1Var);
        }
    }
}
