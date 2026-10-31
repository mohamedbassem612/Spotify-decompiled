package p;

import android.credentials.Credential;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a6o implements OutcomeReceiver {
    public final /* synthetic */ rjn a;

    public a6o(rjn rjnVar, b6o b6oVar) {
        this.a = rjnVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.credentials.internal.FrameworkClassParsingException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d A[Catch: FrameworkClassParsingException -> 0x007a, TryCatch #0 {FrameworkClassParsingException -> 0x007a, blocks: (B:22:0x0067, B:24:0x006d, B:25:0x0074, B:26:0x0079), top: B:32:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074 A[Catch: FrameworkClassParsingException -> 0x007a, TryCatch #0 {FrameworkClassParsingException -> 0x007a, blocks: (B:22:0x0067, B:24:0x006d, B:25:0x0074, B:26:0x0079), top: B:32:0x0067 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onError(Throwable th) {
        GetCredentialException getCredentialCustomException;
        String type;
        String message;
        android.credentials.GetCredentialException getCredentialException = (android.credentials.GetCredentialException) th;
        String type2 = getCredentialException.getType();
        switch (type2.hashCode()) {
            case -781118336:
                if (type2.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    getCredentialCustomException = new GetCredentialUnknownException(getCredentialException.getMessage());
                } else if (nhc1.Y(getCredentialException.getType(), "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i = GetPublicKeyCredentialException.d;
                    type = getCredentialException.getType();
                    message = getCredentialException.getMessage();
                    try {
                        if (!nhc1.Y(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            throw new FrameworkClassParsingException();
                        }
                        int i2 = GetPublicKeyCredentialDomException.e;
                        getCredentialCustomException = acq0.C(type, message);
                    } catch (FrameworkClassParsingException unused) {
                        getCredentialCustomException = new GetCredentialCustomException(type, message);
                    }
                } else {
                    getCredentialCustomException = new GetCredentialCustomException(getCredentialException.getType(), getCredentialException.getMessage());
                }
                this.a.c(getCredentialCustomException);
                return;
            case -45448328:
                if (type2.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    getCredentialCustomException = new GetCredentialInterruptedException(getCredentialException.getMessage());
                } else if (nhc1.Y(getCredentialException.getType(), "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i3 = GetPublicKeyCredentialException.d;
                    type = getCredentialException.getType();
                    message = getCredentialException.getMessage();
                    if (!nhc1.Y(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i4 = GetPublicKeyCredentialDomException.e;
                    getCredentialCustomException = acq0.C(type, message);
                } else {
                    getCredentialCustomException = new GetCredentialCustomException(getCredentialException.getType(), getCredentialException.getMessage());
                }
                this.a.c(getCredentialCustomException);
                return;
            case 580557411:
                if (type2.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    getCredentialCustomException = new GetCredentialCancellationException(getCredentialException.getMessage());
                } else if (nhc1.Y(getCredentialException.getType(), "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i5 = GetPublicKeyCredentialException.d;
                    type = getCredentialException.getType();
                    message = getCredentialException.getMessage();
                    if (!nhc1.Y(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i6 = GetPublicKeyCredentialDomException.e;
                    getCredentialCustomException = acq0.C(type, message);
                } else {
                    getCredentialCustomException = new GetCredentialCustomException(getCredentialException.getType(), getCredentialException.getMessage());
                }
                this.a.c(getCredentialCustomException);
                return;
            case 627896683:
                if (type2.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    getCredentialCustomException = new NoCredentialException(getCredentialException.getMessage());
                } else if (nhc1.Y(getCredentialException.getType(), "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i7 = GetPublicKeyCredentialException.d;
                    type = getCredentialException.getType();
                    message = getCredentialException.getMessage();
                    if (!nhc1.Y(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i8 = GetPublicKeyCredentialDomException.e;
                    getCredentialCustomException = acq0.C(type, message);
                } else {
                    getCredentialCustomException = new GetCredentialCustomException(getCredentialException.getType(), getCredentialException.getMessage());
                }
                this.a.c(getCredentialCustomException);
                return;
            default:
                if (nhc1.Y(getCredentialException.getType(), "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i9 = GetPublicKeyCredentialException.d;
                    type = getCredentialException.getType();
                    message = getCredentialException.getMessage();
                    if (!nhc1.Y(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i10 = GetPublicKeyCredentialDomException.e;
                    getCredentialCustomException = acq0.C(type, message);
                } else {
                    getCredentialCustomException = new GetCredentialCustomException(getCredentialException.getType(), getCredentialException.getMessage());
                }
                this.a.c(getCredentialCustomException);
                return;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.credentials.internal.FrameworkClassParsingException */
    public final void onResult(Object obj) {
        yf xpoVar;
        Credential credential = ((GetCredentialResponse) obj).getCredential();
        String type = credential.getType();
        Bundle data = credential.getData();
        try {
            if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                try {
                    String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                    String string2 = data.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                    string.getClass();
                    string2.getClass();
                    xpoVar = new y5s0(string, string2, data);
                } catch (Exception unused) {
                    throw new FrameworkClassParsingException();
                }
            } else {
                if (!type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    throw new FrameworkClassParsingException();
                }
                try {
                    String string3 = data.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                    string3.getClass();
                    xpoVar = new qmy0(string3, data);
                } catch (Exception unused2) {
                    throw new FrameworkClassParsingException();
                }
            }
        } catch (FrameworkClassParsingException unused3) {
            xpoVar = new xpo(type, data);
        }
        km40 km40Var = new km40(xpoVar);
        ohd ohdVar = (ohd) this.a.b;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(km40Var);
        }
    }
}
