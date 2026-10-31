package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.pageactivityproxy.PageActivityProxy;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pn40 extends o1p1 {
    public final /* synthetic */ byte c;
    public Object d;

    public /* synthetic */ pn40(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    public final Object D(Intent intent, int i) {
        Uri data;
        s450 s450Var;
        GoogleSignInAccount googleSignInAccount;
        switch (this.c) {
            case 0:
                if (i != -1) {
                    return null;
                }
                return (intent == null || (data = intent.getData()) == null) ? (Uri) this.d : data;
            case 1:
                que0 que0Var = kan1.a;
                Status status = Status.g;
                if (intent == null) {
                    s450Var = new s450((GoogleSignInAccount) null, status);
                } else {
                    Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
                    GoogleSignInAccount parcelableExtra = intent.getParcelableExtra("googleSignInAccount");
                    if (parcelableExtra == null) {
                        if (status2 != null) {
                            status = status2;
                        }
                        s450Var = new s450((GoogleSignInAccount) null, status);
                    } else {
                        s450Var = new s450(parcelableExtra, Status.e);
                    }
                }
                Status status3 = s450Var.a;
                try {
                    return new oj81((GoogleSignInAccount) ((!status3.j() || (googleSignInAccount = s450Var.b) == null) ? o0c.y(rzn1.r(status3)) : o0c.z(googleSignInAccount)).h(ApiException.class));
                } catch (ApiException e) {
                    Logger.k(f4i1.c(e.getStatusCode(), "signInResult:failed code="), new Object[0]);
                    return new nj81(e.getStatusCode());
                }
            default:
                if (intent != null) {
                    return (Parcelable) ila0.s(intent, "EXTRA_RESULT", tan.class);
                }
                return null;
        }
    }

    public Intent I(Context context, Uri uri) {
        ArrayList arrayList = new ArrayList();
        this.d = uri;
        if (uri != null) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", (Uri) this.d);
            arrayList.add(intent);
        }
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.setType("image/*");
        arrayList.add(intent2);
        Intent intent3 = new Intent("android.intent.action.PICK");
        intent3.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        Intent intentCreateChooser = Intent.createChooser(intent3, context.getString(2131963828));
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
        return intentCreateChooser;
    }

    public final Intent z(Context context, Object obj) {
        switch (this.c) {
            case 0:
                return I(context, (Uri) obj);
            case 1:
                o9n1 o9n1Var = (o9n1) ((l7m0) this.d).b;
                GoogleSignInOptions googleSignInOptions = ((kz40) o9n1Var).e;
                Context context2 = ((kz40) o9n1Var).a;
                int iJ = o9n1Var.j();
                int i = iJ - 1;
                if (iJ == 0) {
                    throw null;
                }
                if (i == 2) {
                    kan1.a.b("getFallbackSignInIntent()", new Object[0]);
                    Intent intentA = kan1.a(context2, googleSignInOptions);
                    intentA.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
                    return intentA;
                }
                if (i == 3) {
                    return kan1.a(context2, googleSignInOptions);
                }
                kan1.a.b("getNoImplementationSignInIntent()", new Object[0]);
                Intent intentA2 = kan1.a(context2, googleSignInOptions);
                intentA2.setAction("com.google.android.gms.auth.NO_IMPL");
                return intentA2;
            default:
                Intent intent = new Intent(context, (Class<?>) PageActivityProxy.class);
                intent.putExtra("EXTRA_PAGE_URI", (String) this.d);
                intent.putExtra("EXTRA_INPUT", (Parcelable) obj);
                intent.putExtra("EXTRA_INPUT_CLASS_NAME", van.class.getName());
                return intent;
        }
    }
}
