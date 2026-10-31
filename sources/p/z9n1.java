package p;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import org.json.JSONException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z9n1 extends mh70 {
    public final /* synthetic */ byte l = 1;
    public final Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9n1(bsd1 bsd1Var) {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback", (byte) 1);
        this.m = bsd1Var;
    }

    public final boolean X0(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        BasePendingResult u8n1Var;
        String strE;
        byte b = this.l;
        Object obj = this.m;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (i != 1) {
                    return false;
                }
                Status statusA = ean1.a(parcel, Status.CREATOR);
                n841 n841Var = (n841) ean1.a(parcel, n841.CREATOR);
                bsd1 bsd1Var = (bsd1) obj;
                if (statusA.j()) {
                    bsd1Var.b(n841Var);
                } else {
                    bsd1Var.a(rzn1.r(statusA));
                }
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i == 1) {
                    b1();
                    l0c1 l0c1VarA = l0c1.a(revocationBoundService);
                    GoogleSignInAccount googleSignInAccountB = l0c1VarA.b();
                    GoogleSignInOptions googleSignInOptionsJ = GoogleSignInOptions.X;
                    if (googleSignInAccountB != null) {
                        String strE2 = l0c1VarA.e("defaultGoogleSignInAccount");
                        if (TextUtils.isEmpty(strE2) || (strE = l0c1VarA.e(l0c1.f("googleSignInOptions", strE2))) == null) {
                            googleSignInOptionsJ = null;
                        } else {
                            try {
                                googleSignInOptionsJ = GoogleSignInOptions.j(strE);
                            } catch (JSONException unused) {
                                googleSignInOptionsJ = null;
                            }
                        }
                    }
                    o9n1 o9n1VarX = vpb1.x(revocationBoundService, googleSignInOptionsJ);
                    if (googleSignInAccountB != null) {
                        j8n1 j8n1Var = ((kz40) o9n1VarX).i;
                        Context context = ((kz40) o9n1VarX).a;
                        boolean z = o9n1VarX.j() == 3;
                        kan1.a.b("Revoking access", new Object[0]);
                        String strE3 = l0c1.a(context).e("refreshToken");
                        kan1.b(context);
                        if (!z) {
                            ian1 ian1Var = new ian1(j8n1Var, (byte) 1);
                            j8n1Var.a.d(1, ian1Var);
                            u8n1Var = ian1Var;
                        } else if (strE3 == null) {
                            que0 que0Var = can1.c;
                            Status status = new Status(4, (String) null, (PendingIntent) null, (lal) null);
                            zod.j("Status code must not be SUCCESS", !status.j());
                            u8n1Var = new u8n1(status);
                            u8n1Var.g(status);
                        } else {
                            can1 can1Var = new can1(strE3);
                            new Thread(can1Var).start();
                            u8n1Var = can1Var.b;
                        }
                        ezn1.u(u8n1Var, new t9n1());
                    } else {
                        o9n1VarX.h();
                    }
                } else {
                    if (i != 2) {
                        return false;
                    }
                    b1();
                    lan1.d(revocationBoundService).e();
                }
                return true;
        }
    }

    public void b1() {
        if (l6o1.u((RevocationBoundService) this.m, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    public z9n1(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", (byte) 1);
        this.m = revocationBoundService;
    }
}
