package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.culturalmoments.faneventredemption.FanEventRedemptionFailureException;
import com.spotify.fanevents.v1.VerifyRedemptionCodeRequest;
import com.spotify.fanevents.v1.VerifyRedemptionCodeResponse;
import java.io.Serializable;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oj10 {
    public final ek10 a;

    public oj10(ek10 ek10Var) {
        this.a = ek10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, String str2, onm onmVar) {
        nj10 nj10Var;
        kk10 m231Var;
        if (onmVar instanceof nj10) {
            nj10Var = (nj10) onmVar;
            int i = nj10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj10Var.c = i - Integer.MIN_VALUE;
            } else {
                nj10Var = new nj10(this, onmVar);
            }
        } else {
            nj10Var = new nj10(this, onmVar);
        }
        Object objA = nj10Var.a;
        int i2 = nj10Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                ek10 ek10Var = this.a;
                q3j1 q3j1VarN = VerifyRedemptionCodeRequest.n();
                q3j1VarN.q(str);
                q3j1VarN.n(str2);
                VerifyRedemptionCodeRequest verifyRedemptionCodeRequest = (VerifyRedemptionCodeRequest) q3j1VarN.build();
                nj10Var.c = 1;
                objA = ek10Var.a(verifyRedemptionCodeRequest, nj10Var);
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
            VerifyRedemptionCodeResponse verifyRedemptionCodeResponse = (VerifyRedemptionCodeResponse) objA;
            int iOrdinal = verifyRedemptionCodeResponse.n().ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal == 2) {
                    m231Var = kk10.a;
                } else if (iOrdinal == 3) {
                    m231Var = kk10.b;
                } else if (iOrdinal == 4) {
                    m231Var = kk10.c;
                } else if (iOrdinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                HttpException httpExceptionA = e331.a(m231Var);
                if (httpExceptionA == null) {
                    return m231Var;
                }
                boolean z = httpExceptionA instanceof khh1;
                gk10 gk10Var = gk10.d;
                if (!z && !(httpExceptionA instanceof InvalidProtocolBufferException)) {
                    boolean z2 = httpExceptionA instanceof HttpException;
                    gk10Var = gk10.e;
                    if (z2) {
                        int i3 = httpExceptionA.a;
                        if (400 <= i3 && i3 < 500) {
                            gk10Var = gk10.c;
                        } else if (500 <= i3 && i3 < 600) {
                            gk10Var = gk10.b;
                        }
                    } else if ((httpExceptionA instanceof UnknownHostException) || (httpExceptionA instanceof ConnectException)) {
                        gk10Var = gk10.a;
                    }
                }
                return new m231(new FanEventRedemptionFailureException(gk10Var, httpExceptionA));
            }
            throw new khh1("Unexpected redemption state: " + verifyRedemptionCodeResponse.n());
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
    }
}
