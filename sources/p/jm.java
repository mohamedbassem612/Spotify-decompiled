package p;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.spotify.contentdelivery.downloadimpl.ManifestException;
import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jm implements Function, c5x {
    public final /* synthetic */ byte a;
    public final String b;

    public jm(String str) {
        this.a = (byte) 6;
        this.b = l1d.j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public static String f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = gvg.h(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return f4i1.f(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            f(this.b, str, objArr);
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 1:
                Throwable th = (Throwable) obj;
                return th instanceof NullTransportException ? Single.error(new ManifestException(l1d.m("Failed to get manifest for manifestId: ", str))) : Single.error(th);
            default:
                return bqz.a(str, (EsPrefs.PrefValues) obj);
        }
    }

    public void b(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            f(this.b, str, objArr);
        }
    }

    @Override // p.c5x
    public boolean c(CharSequence charSequence, int i, int i2, a2h1 a2h1Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.b)) {
            return true;
        }
        a2h1Var.c = (a2h1Var.c & 3) | 4;
        return false;
    }

    public void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            f(this.b, str, objArr);
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            f(this.b, str, objArr);
        }
    }

    public String toString() {
        boolean zContainsAlias;
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 4:
                StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
                sb.append(str);
                sb.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    zContainsAlias = keyStore.containsAlias(str);
                    break;
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    zContainsAlias = false;
                }
                return l1d.r(sb, zContainsAlias, "}");
            case 5:
                return gvg.k(new StringBuilder("<"), str, '>');
            default:
                return super.toString();
        }
    }

    @Override // p.c5x
    public Object getResult() {
        return this;
    }

    public jm(bqz bqzVar, String str) {
        this.a = (byte) 3;
        this.b = str;
    }

    public /* synthetic */ jm(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public jm(String str, Object obj) {
        this.a = (byte) 4;
        this.b = str;
    }
}
