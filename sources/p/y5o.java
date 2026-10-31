package p;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y5o implements OutcomeReceiver {
    public final /* synthetic */ i6b a;
    public final /* synthetic */ xjn b;

    public y5o(i6b i6bVar, xjn xjnVar, b6o b6oVar) {
        this.a = i6bVar;
        this.b = xjnVar;
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
        CreateCredentialCancellationException createCredentialCustomException;
        String type;
        String message;
        CreateCredentialException createCredentialException = (CreateCredentialException) th;
        String type2 = createCredentialException.getType();
        switch (type2.hashCode()) {
            case -2055374133:
                if (type2.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    createCredentialCustomException = new CreateCredentialCancellationException(createCredentialException.getMessage());
                } else if (nhc1.Y(createCredentialException.getType(), "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i = CreatePublicKeyCredentialException.d;
                    type = createCredentialException.getType();
                    message = createCredentialException.getMessage();
                    try {
                        if (!ihc1.h0(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                            throw new FrameworkClassParsingException();
                        }
                        int i2 = CreatePublicKeyCredentialDomException.e;
                        createCredentialCustomException = wpo1.l(type, message);
                    } catch (FrameworkClassParsingException unused) {
                        createCredentialCustomException = new CreateCredentialCustomException(type, message);
                    }
                } else {
                    createCredentialCustomException = new CreateCredentialCustomException(createCredentialException.getType(), createCredentialException.getMessage());
                }
                this.a.o(createCredentialCustomException);
                return;
            case 1316905704:
                if (type2.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    createCredentialCustomException = new CreateCredentialUnknownException(createCredentialException.getMessage());
                } else if (nhc1.Y(createCredentialException.getType(), "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i3 = CreatePublicKeyCredentialException.d;
                    type = createCredentialException.getType();
                    message = createCredentialException.getMessage();
                    if (!ihc1.h0(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i4 = CreatePublicKeyCredentialDomException.e;
                    createCredentialCustomException = wpo1.l(type, message);
                } else {
                    createCredentialCustomException = new CreateCredentialCustomException(createCredentialException.getType(), createCredentialException.getMessage());
                }
                this.a.o(createCredentialCustomException);
                return;
            case 2092588512:
                if (type2.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    createCredentialCustomException = new CreateCredentialInterruptedException(createCredentialException.getMessage());
                } else if (nhc1.Y(createCredentialException.getType(), "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i5 = CreatePublicKeyCredentialException.d;
                    type = createCredentialException.getType();
                    message = createCredentialException.getMessage();
                    if (!ihc1.h0(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i6 = CreatePublicKeyCredentialDomException.e;
                    createCredentialCustomException = wpo1.l(type, message);
                } else {
                    createCredentialCustomException = new CreateCredentialCustomException(createCredentialException.getType(), createCredentialException.getMessage());
                }
                this.a.o(createCredentialCustomException);
                return;
            case 2131915191:
                if (type2.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    createCredentialCustomException = new CreateCredentialNoCreateOptionException(createCredentialException.getMessage());
                } else if (nhc1.Y(createCredentialException.getType(), "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i7 = CreatePublicKeyCredentialException.d;
                    type = createCredentialException.getType();
                    message = createCredentialException.getMessage();
                    if (!ihc1.h0(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i8 = CreatePublicKeyCredentialDomException.e;
                    createCredentialCustomException = wpo1.l(type, message);
                } else {
                    createCredentialCustomException = new CreateCredentialCustomException(createCredentialException.getType(), createCredentialException.getMessage());
                }
                this.a.o(createCredentialCustomException);
                return;
            default:
                if (nhc1.Y(createCredentialException.getType(), "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i9 = CreatePublicKeyCredentialException.d;
                    type = createCredentialException.getType();
                    message = createCredentialException.getMessage();
                    if (!ihc1.h0(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i10 = CreatePublicKeyCredentialDomException.e;
                    createCredentialCustomException = wpo1.l(type, message);
                } else {
                    createCredentialCustomException = new CreateCredentialCustomException(createCredentialException.getType(), createCredentialException.getMessage());
                }
                this.a.o(createCredentialCustomException);
                return;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.credentials.internal.FrameworkClassParsingException */
    public final void onResult(Object obj) {
        Object zjnVar;
        String str = (String) this.b.a;
        Bundle data = ((CreateCredentialResponse) obj).getData();
        try {
            if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                zjnVar = new qon();
            } else {
                if (!str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    throw new FrameworkClassParsingException();
                }
                try {
                    String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                    string.getClass();
                    zjnVar = new kqn(string);
                } catch (Exception unused) {
                    throw new FrameworkClassParsingException();
                }
            }
        } catch (FrameworkClassParsingException unused2) {
            zjnVar = new zjn();
            if (str.length() <= 0) {
                hhg1.n("type should not be empty");
                return;
            }
        }
        ohd ohdVar = (ohd) this.a.b;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(zjnVar);
        }
    }
}
