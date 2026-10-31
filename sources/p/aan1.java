package p;

import android.app.Activity;
import android.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class aan1 extends kz40 {
    public static final em3 m = new em3("Auth.Api.Identity.CredentialSaving.API", new a8n1((byte) 6), new ytw0((byte) 10));
    public final String l;

    public aan1(Activity activity, fan1 fan1Var) {
        super(activity, activity, m, fan1Var, jz40.c);
        byte[] bArr = new byte[16];
        ban1.a.nextBytes(bArr);
        this.l = Base64.encodeToString(bArr, 11);
    }
}
