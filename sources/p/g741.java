package p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g741 {
    public static final bg11 b;
    public static final Pattern c;
    public final Context a;

    static {
        w280 w280Var = b380.b;
        Object[] objArr = {"34:DF:0E:7A:9F:1C:F1:89:2E:45:C0:56:B4:97:3C:D8:1C:CF:14:8A:40:50:D1:1A:EA:4A:C5:A6:5F:90:0A:42", "0A:01:21:31:B1:BD:F9:E8:0E:F9:7D:37:F3:B4:83:62:BE:36:3A:46:4C:84:45:EC:F8:36:27:EB:E8:49:3A:1E", "C8:A2:E9:BC:CF:59:7C:2F:B6:DC:66:BE:E2:93:FC:13:F2:FC:47:EC:77:BC:6B:2B:0D:52:C1:1F:51:19:2A:B8"};
        i8p1.m(objArr);
        b = b380.l(3, objArr);
        c = Pattern.compile(":");
    }

    public g741(Context context) {
        this.a = context;
    }

    public final long a() {
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.osp.app.signin", 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1L;
        }
    }

    public final boolean b() {
        String str;
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo("com.osp.app.signin", 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length != 1) {
                str = "";
            } else {
                try {
                    byte[] byteArray = signatureArr[0].toByteArray();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(byteArray);
                    str = String.format("%064X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
                } catch (NoSuchAlgorithmException e) {
                    Logger.e(e, "This should not happen", new Object[0]);
                    str = "";
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        w280 w280VarR = b.r(0);
        while (w280VarR.hasNext()) {
            if (u890.j(c.matcher((String) w280VarR.next()).replaceAll(""), str)) {
                return true;
            }
        }
        return false;
    }
}
