package p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class t450 {
    public static t450 b;
    public final Context a;

    public t450(Context context, byte b2) {
        switch (b2) {
            case 1:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static t450 a(Context context) {
        t450 t450Var;
        zod.s(context);
        synchronized (t450.class) {
            t450Var = b;
            if (t450Var == null) {
                m2o1 m2o1Var = ozo1.a;
                synchronized (ozo1.class) {
                    try {
                        if (ozo1.c == null) {
                            ozo1.c = context.getApplicationContext();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                t450Var = new t450(context, (byte) 0);
                b = t450Var;
            }
        }
        return t450Var;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z) {
        chn1 chn1Var;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                chn1 chn1Var2 = z ? qxo1.c : qxo1.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        ten1 ten1Var = egn1.g;
                        Object[] objArr = {byteArray};
                        mno1.D(1, objArr);
                        chn1Var = new chn1(1, objArr);
                    } else {
                        ten1 ten1Var2 = egn1.g;
                        chn1Var = chn1.t;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfoL = tw20.l(packageInfo);
                    if (signingInfoL == null || signingInfoL.hasMultipleSigners() || signingInfoL.getSigningCertificateHistory() == null) {
                        ten1 ten1Var3 = egn1.g;
                        chn1Var = chn1.t;
                    } else {
                        ten1 ten1Var4 = egn1.g;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfoL.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        chn1Var = i4 == 0 ? chn1.t : new chn1(i4, objArrCopyOf);
                    }
                }
                if (chn1Var.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                egn1 egn1VarP = chn1Var.p();
                int size = egn1VarP.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) egn1VarP.get(i6);
                    ten1 ten1VarR = chn1Var2.r(0);
                    do {
                        int i7 = i6 + 1;
                        if (!ten1VarR.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) ten1VarR.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                if ((z ? d(packageInfo, qxo1.a) : d(packageInfo, qxo1.a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static cmo1 d(PackageInfo packageInfo, cmo1... cmo1VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        lpo1 lpo1Var = new lpo1(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < cmo1VarArr.length; i++) {
            if (cmo1VarArr[i].equals(lpo1Var)) {
                return cmo1VarArr[i];
            }
        }
        return null;
    }

    public boolean b() {
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.amazon.dee.app", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode() > 866607211;
            }
            if (packageInfo != null) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
