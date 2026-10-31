package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$AuthenticateCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$EmailAddress;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$FacebookAccessToken;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$GoogleSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$LegacyV3Password;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$NativePassword;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$NaverSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$OneTimeToken;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$ParentChildCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$Password;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$PhoneNumber;
import com.spotify.authentication.login5esperanto.EsAuthenticateCredentials$SamsungSignInCredentials;
import com.spotify.authentication.login5esperanto.EsAuthenticateRequest$AuthenticateRequest;
import com.spotify.authentication.login5esperanto.EsAuthenticateResult$AuthenticateFailure;
import com.spotify.authentication.login5esperanto.EsAuthenticateResult$AuthenticateResult;
import com.spotify.authentication.login5esperanto.EsAuthenticateResult$AuthenticateSuccess;
import com.spotify.authentication.login5esperanto.EsAuthnPlatformRequired;
import com.spotify.authentication.login5esperanto.EsCodeRequired$CodeRequired;
import com.spotify.authentication.login5esperanto.EsInteractionRequired$InteractionRequired;
import com.spotify.authentication.login5esperanto.EsRecaptchaInfo$RecaptchaInfo;
import com.spotify.authentication.login5esperanto.EsSignupRequired$SignupRequired;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fg8 implements wf8 {
    public final wve0 a;

    public fg8(wve0 wve0Var) {
        this.a = wve0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static String a(th8 th8Var) throws NoWhenBranchMatchedException {
        if (th8Var instanceof sh8) {
            return "Success";
        }
        if (th8Var instanceof rh8) {
            return "SignupRequired";
        }
        if (!(th8Var instanceof qh8)) {
            if (!(th8Var instanceof jh8)) {
                eg.o();
                return null;
            }
            zxo1 zxo1Var = ((jh8) th8Var).a;
            if (zxo1Var instanceof uf8) {
                return "SMSCodeChallenge";
            }
            if (zxo1Var instanceof sf8) {
                return "EmailCodeChallenge";
            }
            if (zxo1Var instanceof tf8) {
                return "InteractionRequiredChallenge";
            }
            if (zxo1Var instanceof rf8) {
                return "AuthnPlatformRequiredChallenge";
            }
            eg.o();
            return null;
        }
        qh8 qh8Var = (qh8) th8Var;
        if (qh8Var.equals(kh8.a)) {
            return "InvalidCredentials";
        }
        if (qh8Var.equals(lh8.a)) {
            return "InvalidPhoneNumber";
        }
        if (qh8Var.equals(nh8.a)) {
            return "RegionMismatch";
        }
        if (qh8Var.equals(oh8.a)) {
            return "TooManyAttempts";
        }
        if (qh8Var instanceof mh8) {
            ug8 ug8Var = ((mh8) th8Var).a;
            return "Network, code: " + ug8Var.a + ", message: " + ug8Var.b;
        }
        if (!(qh8Var instanceof ph8)) {
            eg.o();
            return null;
        }
        ph8 ph8Var = (ph8) th8Var;
        return "UnexpectedError, code: " + ph8Var.a().a + ", message: " + ph8Var.a().b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Single b(gh8 gh8Var) throws NoWhenBranchMatchedException {
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials;
        EsRecaptchaInfo$RecaptchaInfo esRecaptchaInfo$RecaptchaInfo;
        hh8 hh8Var = gh8Var.b;
        zkz zkzVarN = EsAuthenticateRequest$AuthenticateRequest.n();
        mg8 mg8Var = gh8Var.a;
        if (mg8Var.equals(hg8.c)) {
            nkz nkzVarN = EsAuthenticateCredentials$AuthenticateCredentials.n();
            nkzVarN.n(EsAuthenticateCredentials.AuthnPlatformCredential.n());
            esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN.build();
        } else if (mg8Var instanceof qg8) {
            wkz wkzVarO = EsAuthenticateCredentials$Password.o();
            wkzVarO.n(((qg8) mg8Var).c);
            nkz nkzVarN2 = EsAuthenticateCredentials$AuthenticateCredentials.n();
            nkzVarN2.y((EsAuthenticateCredentials$Password) wkzVarO.build());
            esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN2.build();
        } else {
            if (mg8Var instanceof rg8) {
                rg8 rg8Var = (rg8) mg8Var;
                xkz xkzVarO = EsAuthenticateCredentials$PhoneNumber.o();
                xkzVarO.r(rg8Var.c);
                String str = rg8Var.d;
                if (str == null) {
                    str = "";
                }
                xkzVarO.q(str);
                String str2 = rg8Var.e;
                xkzVarO.n(str2 != null ? str2 : "");
                EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber = (EsAuthenticateCredentials$PhoneNumber) xkzVarO.build();
                nkz nkzVarN3 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN3.z(esAuthenticateCredentials$PhoneNumber);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN3.build();
            } else if (mg8Var instanceof og8) {
                ukz ukzVarO = EsAuthenticateCredentials$OneTimeToken.o();
                ukzVarO.n(((og8) mg8Var).c);
                EsAuthenticateCredentials$OneTimeToken esAuthenticateCredentials$OneTimeToken = (EsAuthenticateCredentials$OneTimeToken) ukzVarO.build();
                nkz nkzVarN4 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN4.w(esAuthenticateCredentials$OneTimeToken);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN4.build();
            } else if (mg8Var instanceof kg8) {
                qkz qkzVarO = EsAuthenticateCredentials$GoogleSignInCredentials.o();
                n450 n450Var = ((kg8) mg8Var).c;
                if (n450Var instanceof n450) {
                    n450 n450Var2 = n450Var;
                    qkzVarO.n(n450Var2.a());
                    String strB = n450Var2.b();
                    qkzVarO.r(strB != null ? strB : "");
                } else {
                    if (!(n450Var instanceof o450)) {
                        eg.o();
                        return null;
                    }
                    qkzVarO.q(((o450) n450Var).a());
                }
                nkz nkzVarN5 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN5.s((EsAuthenticateCredentials$GoogleSignInCredentials) qkzVarO.build());
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN5.build();
            } else if (mg8Var instanceof pg8) {
                pg8 pg8Var = (pg8) mg8Var;
                vkz vkzVarO = EsAuthenticateCredentials$ParentChildCredentials.o();
                vkzVarO.n(pg8Var.c);
                vsz vszVarP = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.p();
                of8 of8Var = pg8Var.d;
                vszVarP.q(of8Var.a);
                byte[] bArr = of8Var.b;
                hhc hhcVar = phc.b;
                vszVarP.n(phc.e(0, bArr, bArr.length));
                vkzVarO.q((EsUnencryptedStoredCredentials$UnencryptedStoredCredentials) vszVarP.build());
                EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials = (EsAuthenticateCredentials$ParentChildCredentials) vkzVarO.build();
                nkz nkzVarN6 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN6.x(esAuthenticateCredentials$ParentChildCredentials);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN6.build();
            } else if (mg8Var instanceof sg8) {
                sg8 sg8Var = (sg8) mg8Var;
                ykz ykzVarO = EsAuthenticateCredentials$SamsungSignInCredentials.o();
                ykzVarO.n(sg8Var.c);
                ykzVarO.q();
                ykzVarO.r(sg8Var.d);
                EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials = (EsAuthenticateCredentials$SamsungSignInCredentials) ykzVarO.build();
                nkz nkzVarN7 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN7.A(esAuthenticateCredentials$SamsungSignInCredentials);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN7.build();
            } else if (mg8Var instanceof ng8) {
                ng8 ng8Var = (ng8) mg8Var;
                tkz tkzVarO = EsAuthenticateCredentials$NaverSignInCredentials.o();
                tkzVarO.n(ng8Var.c);
                String str3 = ng8Var.d;
                tkzVarO.q(str3 != null ? str3 : "");
                EsAuthenticateCredentials$NaverSignInCredentials esAuthenticateCredentials$NaverSignInCredentials = (EsAuthenticateCredentials$NaverSignInCredentials) tkzVarO.build();
                nkz nkzVarN8 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN8.v(esAuthenticateCredentials$NaverSignInCredentials);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN8.build();
            } else if (mg8Var instanceof jg8) {
                jg8 jg8Var = (jg8) mg8Var;
                pkz pkzVarO = EsAuthenticateCredentials$FacebookAccessToken.o();
                pkzVarO.n(jg8Var.d);
                pkzVarO.q(jg8Var.c);
                EsAuthenticateCredentials$FacebookAccessToken esAuthenticateCredentials$FacebookAccessToken = (EsAuthenticateCredentials$FacebookAccessToken) pkzVarO.build();
                nkz nkzVarN9 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN9.r(esAuthenticateCredentials$FacebookAccessToken);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN9.build();
            } else if (mg8Var instanceof lg8) {
                lg8 lg8Var = (lg8) mg8Var;
                rkz rkzVarN = EsAuthenticateCredentials$LegacyV3Password.n();
                rkzVarN.q(lg8Var.d);
                rkzVarN.n(lg8Var.c);
                EsAuthenticateCredentials$LegacyV3Password esAuthenticateCredentials$LegacyV3Password = (EsAuthenticateCredentials$LegacyV3Password) rkzVarN.build();
                nkz nkzVarN10 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN10.t(esAuthenticateCredentials$LegacyV3Password);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN10.build();
            } else if (mg8Var instanceof mg8) {
                mg8 mg8Var2 = mg8Var;
                skz skzVarO = EsAuthenticateCredentials$NativePassword.o();
                skzVarO.n(mg8Var2.u());
                skzVarO.q(mg8Var2.v());
                EsAuthenticateCredentials$NativePassword esAuthenticateCredentials$NativePassword = (EsAuthenticateCredentials$NativePassword) skzVarO.build();
                nkz nkzVarN11 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN11.u(esAuthenticateCredentials$NativePassword);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN11.build();
            } else {
                if (!(mg8Var instanceof ig8)) {
                    eg.o();
                    return null;
                }
                okz okzVarO = EsAuthenticateCredentials$EmailAddress.o();
                okzVarO.n(((ig8) mg8Var).u());
                EsAuthenticateCredentials$EmailAddress esAuthenticateCredentials$EmailAddress = (EsAuthenticateCredentials$EmailAddress) okzVarO.build();
                nkz nkzVarN12 = EsAuthenticateCredentials$AuthenticateCredentials.n();
                nkzVarN12.q(esAuthenticateCredentials$EmailAddress);
                esAuthenticateCredentials$AuthenticateCredentials = (EsAuthenticateCredentials$AuthenticateCredentials) nkzVarN12.build();
            }
        }
        zkzVarN.n(esAuthenticateCredentials$AuthenticateCredentials);
        zkzVarN.r();
        zkzVarN.t(hh8Var.a);
        yi01 yi01Var = gh8Var.c;
        if (yi01Var != null) {
            tqz tqzVarO = EsRecaptchaInfo$RecaptchaInfo.o();
            tqzVarO.n(yi01Var.a());
            String strB2 = yi01Var.b();
            if (strB2 != null) {
                tqzVarO.q(strB2);
            }
            esRecaptchaInfo$RecaptchaInfo = (EsRecaptchaInfo$RecaptchaInfo) tqzVarO.build();
        } else {
            esRecaptchaInfo$RecaptchaInfo = null;
        }
        if (esRecaptchaInfo$RecaptchaInfo != null) {
            zkzVarN.s(esRecaptchaInfo$RecaptchaInfo);
        }
        zkzVarN.q(gh8Var.d);
        EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest = (EsAuthenticateRequest$AuthenticateRequest) zkzVarN.build();
        AtomicReference atomicReference = new AtomicReference(null);
        esAuthenticateRequest$AuthenticateRequest.getClass();
        ConnectableObservable connectableObservablePublish = this.a.a(esAuthenticateRequest$AuthenticateRequest).publish();
        Single singleSingleOrError = connectableObservablePublish.doOnNext(new eg8(atomicReference, (byte) 0)).doOnError(new eg8(atomicReference, (byte) 1)).doOnSubscribe(new a21(atomicReference, connectableObservablePublish, (byte) 13)).take(1L).singleOrError();
        return singleSingleOrError.map(new ix7(this, singleSingleOrError, atomicReference, (byte) 3));
    }

    public final th8 c(EsAuthenticateResult$AuthenticateResult esAuthenticateResult$AuthenticateResult, Single single, Function0 function0) {
        int i;
        sf8 uf8Var;
        int iS = esAuthenticateResult$AuthenticateResult.s();
        int i2 = 2;
        switch (iS == 0 ? -1 : xf8.g[l1d.C(iS)]) {
            case 1:
                EsAuthenticateResult$AuthenticateSuccess esAuthenticateResult$AuthenticateSuccessU = esAuthenticateResult$AuthenticateResult.u();
                EsAuthBlob$AuthBlob esAuthBlob$AuthBlobP = esAuthenticateResult$AuthenticateSuccessU.p();
                return new sh8(new di8(esAuthenticateResult$AuthenticateSuccessU.getUsername(), esAuthenticateResult$AuthenticateSuccessU.r() ? new wd(esAuthenticateResult$AuthenticateSuccessU.o().r(), esAuthenticateResult$AuthenticateSuccessU.o().q(), new Date(esAuthenticateResult$AuthenticateSuccessU.o().p().q() * 1000)) : null, new of8(esAuthBlob$AuthBlobP.o().getUsername(), esAuthBlob$AuthBlobP.o().o().t())));
            case 2:
                EsAuthenticateResult$AuthenticateFailure esAuthenticateResult$AuthenticateFailureQ = esAuthenticateResult$AuthenticateResult.q();
                Integer numValueOf = Integer.valueOf(NativeMediaProcessor.PROCESS_SAMPLE_RESULT_NULL_SKIP_BYTE_COUNTS);
                int iR = esAuthenticateResult$AuthenticateFailureQ.r();
                int i3 = iR != 0 ? xf8.a[l1d.C(iR)] : -1;
                if (i3 != 1) {
                    return i3 != 2 ? new ph8(new ug8(400, "Esperanto failure: Failure reason NOT_SET")) : new ph8(new ug8(Integer.valueOf(esAuthenticateResult$AuthenticateFailureQ.s().n()), esAuthenticateResult$AuthenticateFailureQ.s().getMessage()));
                }
                switch (esAuthenticateResult$AuthenticateFailureQ.p().ordinal()) {
                    case 1:
                        return new mh8(new ug8(400, "Aborted"));
                    case 2:
                        return new ph8(new ug8(400, "Unsupported Response"));
                    case 3:
                        return new ph8(new ug8(400, "Non Successful Response"));
                    case 4:
                        return new mh8(new ug8(400, "HTTP Transport Error"));
                    case 5:
                        return new ph8(new ug8(400, "Unsupported Authentication Method"));
                    case 6:
                        return new ph8(new ug8(400, "Invalid Arguments"));
                    case 7:
                        return new mh8(new ug8(numValueOf, "Unknown Backend Error"));
                    case 8:
                        return kh8.a;
                    case 9:
                        return new mh8(new ug8(400, "Bad Request"));
                    case 10:
                        return new ph8(new ug8(400, "Unsupported Login Protocol"));
                    case 11:
                        return new mh8(new ug8(400, "Request Timeout"));
                    case 12:
                        return new ph8(new ug8(400, "Unknown Identifier"));
                    case 13:
                        return oh8.a;
                    case 14:
                        return lh8.a;
                    case 15:
                        return new mh8(new ug8(numValueOf, "Try Again Later"));
                    case 16:
                        return new ph8(new ug8(400, "Hash mismatch"));
                    case 17:
                        return new ph8(new ug8(403, "Not Allowed"));
                    default:
                        return new ph8(new ug8(Integer.valueOf(esAuthenticateResult$AuthenticateFailureQ.q()), "Unexpected failure from Login5"));
                }
            case 3:
                EsSignupRequired$SignupRequired esSignupRequired$SignupRequiredT = esAuthenticateResult$AuthenticateResult.t();
                String name = esSignupRequired$SignupRequiredT.getName();
                String strQ = esSignupRequired$SignupRequiredT.q();
                boolean zU = esSignupRequired$SignupRequiredT.u();
                String strO = esSignupRequired$SignupRequiredT.o();
                int iOrdinal = esSignupRequired$SignupRequiredT.s().ordinal();
                if (iOrdinal == 1) {
                    i = i2;
                } else if (iOrdinal == 2) {
                    i = 3;
                } else if (iOrdinal != 3) {
                    i = 1;
                } else {
                    i2 = 4;
                    i = i2;
                }
                return new rh8(new sq81(name, strQ, zU, strO, i, esSignupRequired$SignupRequiredT.w(), esSignupRequired$SignupRequiredT.v(), esSignupRequired$SignupRequiredT.r(), esSignupRequired$SignupRequiredT.t()));
            case 4:
                EsCodeRequired$CodeRequired esCodeRequired$CodeRequiredP = esAuthenticateResult$AuthenticateResult.p();
                AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
                yf8 yf8Var = new yf8(atomicReference, function0, (byte) 1);
                int i4 = xf8.d[esCodeRequired$CodeRequiredP.o().u().ordinal()];
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (i4 == 1) {
                    uf8Var = new sf8(esCodeRequired$CodeRequiredP.o().q(), esCodeRequired$CodeRequiredP.o().o(), esCodeRequired$CodeRequiredP.o().t(), new Date(timeUnit.toMillis(esCodeRequired$CodeRequiredP.o().r())), esCodeRequired$CodeRequiredP.o().s(), new cg8(atomicReference, this, esCodeRequired$CodeRequiredP.p(), single, function0, (byte) 1), new ag8(atomicReference, this, esCodeRequired$CodeRequiredP.p(), single, function0, (byte) 1), yf8Var);
                } else {
                    cg8 cg8Var = new cg8(atomicReference, this, esCodeRequired$CodeRequiredP.p(), single, function0, (byte) 0);
                    bg8 bg8Var = new bg8(atomicReference, this, esCodeRequired$CodeRequiredP.p(), single, function0, (byte) 0);
                    uf8Var = new uf8(esCodeRequired$CodeRequiredP.o().n(), esCodeRequired$CodeRequiredP.o().o(), esCodeRequired$CodeRequiredP.o().t(), new Date(timeUnit.toMillis(esCodeRequired$CodeRequiredP.o().r())), esCodeRequired$CodeRequiredP.o().s(), cg8Var, new rr6(bg8Var, (byte) 26), yf8Var, bg8Var);
                }
                return new jh8(uf8Var);
            case 5:
                EsInteractionRequired$InteractionRequired esInteractionRequired$InteractionRequiredR = esAuthenticateResult$AuthenticateResult.r();
                AtomicReference atomicReference2 = new AtomicReference(Boolean.FALSE);
                return new jh8(new tf8(esInteractionRequired$InteractionRequiredR.q(), new bg8(atomicReference2, this, esInteractionRequired$InteractionRequiredR.o(), single, function0, (byte) 1), new yf8(atomicReference2, function0, (byte) 2)));
            case 6:
                EsAuthnPlatformRequired.AuthnPlatformRequired authnPlatformRequiredO = esAuthenticateResult$AuthenticateResult.o();
                AtomicReference atomicReference3 = new AtomicReference(Boolean.FALSE);
                return new jh8(new rf8(authnPlatformRequiredO.p().t(), new ag8(atomicReference3, this, authnPlatformRequiredO.n(), single, function0, (byte) 0), new yf8(atomicReference3, function0, (byte) 0)));
            default:
                return new ph8(new ug8(400, "Esperanto failure: incomplete response"));
        }
    }
}
