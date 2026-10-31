package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateRequest;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public abstract class pv {
    public static EsAuthenticateRequest.AuthenticateRequest a(of8 of8Var) {
        zkz zkzVarN = EsAuthenticateRequest.AuthenticateRequest.n();
        if (of8Var == null) {
            eg.o();
            return null;
        }
        nkz nkzVarN = EsAuthenticateCredentials.AuthenticateCredentials.n();
        vsz vszVarP = EsUnencryptedStoredCredentials.UnencryptedStoredCredentials.p();
        byte[] bArr = of8Var.b;
        hhc hhcVar = phc.b;
        vszVarP.n(phc.e(0, bArr, bArr.length));
        vszVarP.q(of8Var.a);
        nkzVarN.B(vszVarP);
        zkzVarN.n(nkzVarN.build());
        return zkzVarN.build();
    }
}
