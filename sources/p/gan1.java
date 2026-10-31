package p;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gan1 extends px40 {
    public final GoogleSignInOptions B;

    public gan1(Context context, Looper looper, d520 d520Var, GoogleSignInOptions googleSignInOptions, h8n1 h8n1Var, h8n1 h8n1Var2) {
        super(context, looper, 91, d520Var, h8n1Var, h8n1Var2);
        Set<Scope> set = (Set) d520Var.d;
        q450 q450Var = googleSignInOptions != null ? new q450(googleSignInOptions) : new q450();
        byte[] bArr = new byte[16];
        ban1.a.nextBytes(bArr);
        q450Var.g = Base64.encodeToString(bArr, 11);
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = (HashSet) q450Var.d;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.B = q450Var.a();
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof nan1 ? (nan1) iInterfaceQueryLocalInterface : new nan1(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", (byte) 0);
    }

    public final int l() {
        return 12451000;
    }

    public final String o() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String p() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
