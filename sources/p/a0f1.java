package p;

import android.net.Uri;
import com.google.protobuf.Empty;
import com.spotify.authentication.login5esperanto.EsAccessToken;
import com.spotify.authentication.login5esperanto.EsAccessTokenClient$ErrorResponse;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange$SessionTransferTokenRequest;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange$TokenExchangeResponse;
import com.spotify.authentication.tokenexchangeesperanto.EsTokenExchange$WebAuthTokenRequest;
import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a0f1 implements yze1 {
    public final y48 a;

    public a0f1(Transport transport) {
        this.a = new y48(transport);
    }

    public static b1f1 d(EsTokenExchange$TokenExchangeResponse esTokenExchange$TokenExchangeResponse) {
        int iO = esTokenExchange$TokenExchangeResponse.o();
        int i = iO == 0 ? -1 : zze1.a[l1d.C(iO)];
        if (i != -1) {
            if (i == 1) {
                EsAccessToken.AccessToken accessTokenP = esTokenExchange$TokenExchangeResponse.p();
                return new a1f1(new wze1(accessTokenP.q(), accessTokenP.r(), (accessTokenP.p().q() * 1000) + ((long) (accessTokenP.p().p() / 1000000))));
            }
            if (i == 2) {
                EsAccessTokenClient$ErrorResponse esAccessTokenClient$ErrorResponseN = esTokenExchange$TokenExchangeResponse.n();
                int iO2 = esAccessTokenClient$ErrorResponseN.o();
                int i2 = iO2 == 0 ? -1 : zze1.b[l1d.C(iO2)];
                if (i2 != -1) {
                    if (i2 == 1) {
                        switch (esAccessTokenClient$ErrorResponseN.q()) {
                            case INVALID_CREDENTIALS:
                                return new u0f1("Invalid credentials");
                            case HTTP_ERROR:
                                return new y0f1("HTTP error");
                            case OFFLINE:
                                return new w0f1("Offline");
                            case BAD_REQUEST:
                                return new s0f1("Bad request");
                            case UNSUPPORTED_LOGIN_PROTOCOL:
                                return new s0f1("Unsupported login protocol");
                            case TOO_MANY_ATTEMPTS:
                                return new x0f1("Too many attempts");
                            case NOT_ALLOWED:
                                return new t0f1("Not allowed");
                            case UNRECOGNIZED:
                                return new y0f1("Unrecognized error");
                            default:
                                eg.o();
                                return null;
                        }
                    }
                    if (i2 == 2) {
                        EsAccessTokenClient$ErrorResponse.GenericError genericErrorP = esAccessTokenClient$ErrorResponseN.p();
                        int iO3 = genericErrorP.o();
                        String strP = genericErrorP.p();
                        if (iO3 == 0) {
                            return new r0f1(strP);
                        }
                        if (iO3 == 1) {
                            return new u0f1(strP);
                        }
                        if (iO3 == 2) {
                            return new s0f1(strP);
                        }
                        if (iO3 == 3) {
                            return new t0f1(strP);
                        }
                        if (iO3 == 4) {
                            return new w0f1(strP);
                        }
                        if (iO3 == 5) {
                            return new x0f1(strP);
                        }
                        if (iO3 == 6) {
                            return new v0f1(strP);
                        }
                        return iO3 == 7 ? new y0f1(strP) : new y0f1(strP);
                    }
                    if (i2 != 3) {
                        eg.o();
                        return null;
                    }
                }
                return new y0f1("Unknown error from token exchange service");
            }
            if (i != 3) {
                eg.o();
                return null;
            }
        }
        return new y0f1("No response from token exchange service");
    }

    public final Single a(String str) {
        bsz bszVarN = EsTokenExchange$WebAuthTokenRequest.n();
        bszVarN.n(str);
        EsTokenExchange$WebAuthTokenRequest esTokenExchange$WebAuthTokenRequest = (EsTokenExchange$WebAuthTokenRequest) bszVarN.build();
        esTokenExchange$WebAuthTokenRequest.getClass();
        return this.a.callSingle("spotify.authentication.token_exchange.proto.TokenExchangeService", "getTokenForWebAuthTransfer", esTokenExchange$WebAuthTokenRequest).map(rdx0.R0).map(new xgc(this, (byte) 27)).onErrorReturn(wbx0.S0);
    }

    public final Single b(String str) {
        String strDecode = Uri.decode(str);
        asz aszVarN = EsTokenExchange$SessionTransferTokenRequest.n();
        aszVarN.n(strDecode);
        EsTokenExchange$SessionTransferTokenRequest esTokenExchange$SessionTransferTokenRequest = (EsTokenExchange$SessionTransferTokenRequest) aszVarN.build();
        esTokenExchange$SessionTransferTokenRequest.getClass();
        return this.a.callSingle("spotify.authentication.token_exchange.proto.TokenExchangeService", "getSessionTransferToken", esTokenExchange$SessionTransferTokenRequest).map(kcx0.S0).map(new nbc(this, (byte) 27)).onErrorReturn(u9x0.R0);
    }

    public final Single c() {
        return this.a.callSingle("spotify.authentication.token_exchange.proto.TokenExchangeService", "getTokenForBuiltInAuthorization", Empty.n()).map(pdx0.S0).map(new ubc(this, (byte) 27)).onErrorReturn(vbx0.S0);
    }
}
