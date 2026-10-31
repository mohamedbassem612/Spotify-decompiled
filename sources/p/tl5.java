package p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tl5 {
    public tl5(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() % 2 == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public final int getMataDataInt(Context context, String str) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return 0;
            }
            return bundle.getInt(str);
        } catch (PackageManager.NameNotFoundException e) {
            cte0.a.e("AppContextRequestHelper", "Exception getting meta data", e);
            return 0;
        }
    }

    public final Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i);
        }
        return i2 >= 26 ? context.registerReceiver(broadcastReceiver, intentFilter, null, null, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[Catch: NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, TryCatch #4 {NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, blocks: (B:50:0x00bf, B:52:0x00c5, B:55:0x00de, B:60:0x00e8, B:62:0x00f1, B:64:0x0111, B:53:0x00d4), top: B:69:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4 A[Catch: NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, TryCatch #4 {NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, blocks: (B:50:0x00bf, B:52:0x00c5, B:55:0x00de, B:60:0x00e8, B:62:0x00f1, B:64:0x0111, B:53:0x00d4), top: B:69:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00de A[Catch: NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, TryCatch #4 {NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, blocks: (B:50:0x00bf, B:52:0x00c5, B:55:0x00de, B:60:0x00e8, B:62:0x00f1, B:64:0x0111, B:53:0x00d4), top: B:69:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[Catch: NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, TryCatch #4 {NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, blocks: (B:50:0x00bf, B:52:0x00c5, B:55:0x00de, B:60:0x00e8, B:62:0x00f1, B:64:0x0111, B:53:0x00d4), top: B:69:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1 A[Catch: NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, TryCatch #4 {NameNotFoundException -> 0x00e4, NoSuchAlgorithmException -> 0x00e6, blocks: (B:50:0x00bf, B:52:0x00c5, B:55:0x00de, B:60:0x00e8, B:62:0x00f1, B:64:0x0111, B:53:0x00d4), top: B:69:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:1: B:61:0x00ef->B:85:?, LOOP_END, SYNTHETIC] */
    public final vl5 validateContentProviderAuthority(Context context, Uri uri) {
        String str;
        vl5 vl5Var;
        Signature[] signingCertificateHistory;
        MessageDigest messageDigest;
        int length;
        Signature signature;
        PackageManager packageManager = context.getPackageManager();
        String authority = uri.getAuthority();
        authority.getClass();
        int i = 0;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            return vl5.b;
        }
        boolean zIsEmpty = ul5.b.isEmpty();
        cte0 cte0Var = cte0.a;
        if (zIsEmpty) {
            XmlResourceParser xml = context.getResources().getXml(noz0.context_handoff_requesters);
            String name = null;
            String attributeValue = null;
            while (xml.getEventType() != 1) {
                try {
                    int eventType = xml.getEventType();
                    if (eventType == 2) {
                        name = xml.getName();
                        if ("package".equals(name)) {
                            attributeValue = xml.getAttributeValue(null, "name");
                        }
                    } else if (eventType != 3) {
                        if (eventType == 4 && !TextUtils.isEmpty(name) && "cert-digest".equals(name) && !TextUtils.isEmpty(attributeValue)) {
                            String text = xml.getText();
                            if (!TextUtils.isEmpty(text)) {
                                ul5.b.put(attributeValue, text);
                            }
                        }
                    } else if (u890.j(xml.getName(), "package")) {
                        name = null;
                        attributeValue = null;
                    }
                    xml.next();
                } catch (IOException e) {
                    cte0Var.e("AppContextRequestHelper", "Exception loading approved requesters", e);
                } catch (XmlPullParserException e2) {
                    cte0Var.e("AppContextRequestHelper", "Exception loading approved requesters", e2);
                }
            }
            if (!ul5.b.isEmpty()) {
                if (ul5.b.keySet().contains(providerInfoResolveContentProvider.packageName)) {
                    str = providerInfoResolveContentProvider.packageName;
                    vl5Var = vl5.d;
                    try {
                        if (Build.VERSION.SDK_INT >= 28) {
                            signingCertificateHistory = tw20.l(packageManager.getPackageInfo(str, 134217728)).getSigningCertificateHistory();
                        } else {
                            signingCertificateHistory = packageManager.getPackageInfo(str, 64).signatures;
                        }
                        if (signingCertificateHistory == null) {
                            cte0Var.e("AppContextRequestHelper", "signatures must not be null");
                            return vl5Var;
                        }
                        messageDigest = MessageDigest.getInstance("SHA-256");
                        length = signingCertificateHistory.length;
                        while (i < length) {
                            signature = signingCertificateHistory[i];
                            i++;
                            if (nhc1.O(a(messageDigest.digest(signature.toByteArray())), (CharSequence) ul5.b.get(str))) {
                                return vl5.a;
                            }
                        }
                        return vl5Var;
                    } catch (PackageManager.NameNotFoundException e3) {
                        cte0Var.e("AppContextRequestHelper", "Couldn't get signature digest", e3);
                        return vl5Var;
                    } catch (NoSuchAlgorithmException e4) {
                        cte0Var.e("AppContextRequestHelper", "Couldn't get signature digest", e4);
                        return vl5Var;
                    }
                }
            }
        } else {
            if (ul5.b.keySet().contains(providerInfoResolveContentProvider.packageName)) {
                str = providerInfoResolveContentProvider.packageName;
                vl5Var = vl5.d;
                if (Build.VERSION.SDK_INT >= 28) {
                    signingCertificateHistory = tw20.l(packageManager.getPackageInfo(str, 134217728)).getSigningCertificateHistory();
                } else {
                    signingCertificateHistory = packageManager.getPackageInfo(str, 64).signatures;
                }
                if (signingCertificateHistory == null) {
                    cte0Var.e("AppContextRequestHelper", "signatures must not be null");
                    return vl5Var;
                }
                messageDigest = MessageDigest.getInstance("SHA-256");
                length = signingCertificateHistory.length;
                while (i < length) {
                    signature = signingCertificateHistory[i];
                    i++;
                    if (nhc1.O(a(messageDigest.digest(signature.toByteArray())), (CharSequence) ul5.b.get(str))) {
                        return vl5.a;
                    }
                }
                return vl5Var;
            }
        }
        return vl5.c;
    }
}
