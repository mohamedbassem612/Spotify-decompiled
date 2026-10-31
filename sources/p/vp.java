package p;

import android.content.Context;
import java.security.KeyStore;
import java.security.KeyStoreException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class vp extends hab0 implements Function0 {
    public final /* synthetic */ iq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(iq iqVar) {
        super(0);
        this.a = iqVar;
    }

    public final Object invoke() {
        iq iqVar = this.a;
        sr srVar = iqVar.c;
        try {
            return srVar.a();
        } catch (Exception e) {
            iq.e("Account Switching preferences could not be created first time", e);
            if (!(e instanceof KeyStoreException)) {
                return null;
            }
            try {
                Context context = iqVar.a;
                try {
                    context.getSharedPreferences("accountswitching_encrypted_sharedprefs", 0).edit().clear().apply();
                    context.deleteSharedPreferences("accountswitching_encrypted_sharedprefs");
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    keyStore.deleteEntry("_androidx_security_master_key_");
                } catch (Exception e2) {
                    iq.e("Account Switching failed to delete shared preferences file", e2);
                }
                return srVar.a();
            } catch (Exception e3) {
                iq.e("Account Switching could not recreate shared preferences", e3);
                return null;
            }
        }
    }
}
