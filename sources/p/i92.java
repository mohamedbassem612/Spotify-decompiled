package p;

import android.graphics.Path;
import android.icu.text.SimpleDateFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import j$.util.DesugarTimeZone;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i92 extends ThreadLocal {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:90:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                try {
                    return (Cipher) k8y.e.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e) {
                    bhn0.p(e);
                    return null;
                }
            case 1:
                try {
                    return (Cipher) k8y.e.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e2) {
                    bhn0.p(e2);
                    return null;
                }
            case 2:
                try {
                    return (Cipher) k8y.e.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    bhn0.p(e3);
                    return null;
                }
            case 3:
                try {
                    return (Cipher) k8y.e.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e4) {
                    bhn0.p(e4);
                    return null;
                }
            case 4:
                try {
                    return (Cipher) k8y.e.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e5) {
                    bhn0.p(e5);
                    return null;
                }
            case 5:
                Locale locale = Locale.ROOT;
                List listM = p7h.M(new SimpleDateFormat[]{new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", locale)});
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    ((SimpleDateFormat) it.next()).setLenient(false);
                }
                return listM;
            case 6:
                return new SimpleDateFormat("HH:mm", Locale.ROOT);
            case 7:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    w55 w55Var = new w55(choreographer, zno1.g(looperMyLooper));
                    return flo1.l(w55Var, w55Var.Y);
                }
                eg.m("no Looper on this thread");
                return null;
            case 8:
                return new java.text.SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            case 9:
                return new Random();
            case 10:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return x2g0.A();
                }
                if (Looper.myLooper() != null) {
                    return new js50(new Handler(Looper.myLooper()));
                }
                return null;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new char[1024];
            case grn1.d /* 12 */:
                SecureRandom secureRandom2 = new SecureRandom();
                secureRandom2.nextLong();
                return secureRandom2;
            case 13:
                return new Path();
            case 14:
                return new Path();
            case 15:
                return new float[4];
            case 16:
                return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            case 17:
                return Boolean.FALSE;
            case 18:
                i92 i92Var = hkn1.a;
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
                GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
                gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
                simpleDateFormat.setCalendar(gregorianCalendar);
                return simpleDateFormat;
            case 19:
                return 0L;
            default:
                Provider providerL = ila0.L();
                if (providerL == null) {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                    if (provider != null) {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    break;
                } else {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerL);
                    } catch (GeneralSecurityException unused) {
                        try {
                            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                        } catch (Throwable unused2) {
                        }
                        if (provider != null) {
                            try {
                                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                            } catch (GeneralSecurityException unused3) {
                                secureRandom = new SecureRandom();
                            }
                        } else {
                            secureRandom = new SecureRandom();
                        }
                    }
                    break;
                }
                secureRandom.nextLong();
                return secureRandom;
        }
    }
}
