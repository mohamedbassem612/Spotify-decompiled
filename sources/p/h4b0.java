package p;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class h4b0 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static hl4 a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (hl4 hl4Var : a) {
            synchronized (hl4Var) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return hl4Var;
            }
        }
        throw new GeneralSecurityException(l1d.m("No KMS client does support: ", str));
    }
}
