package p;

import android.security.keystore.KeyGenParameterSpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class h8h0 {
    public static final /* synthetic */ int a = 0;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }
}
