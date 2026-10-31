package p;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p7n1 implements e7n1 {
    public static final String c;
    public final mvg a;
    public final SharedPreferences b;

    static {
        String canonicalName = p7n1.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = p7n1.class.getSimpleName();
        }
        c = canonicalName;
    }

    public p7n1(mvg mvgVar, SharedPreferences sharedPreferences) {
        this.a = mvgVar;
        this.b = sharedPreferences;
    }

    public static String a(Application application) {
        return Build.VERSION.SDK_INT >= 30 ? application.getPackageManager().getInstallSourceInfo(application.getPackageName()).getInstallingPackageName() : String.valueOf(application.getPackageManager().getInstallerPackageName(application.getPackageName()));
    }

    public static long b(ZipFile zipFile) {
        ArrayList list = Collections.list(zipFile.entries());
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = list.get(i2);
            i2++;
            if (nhc1.Y(((ZipEntry) obj).getName(), "classes", false)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        long size3 = 0;
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            size3 += ((ZipEntry) obj2).getSize();
        }
        return size3;
    }

    public static long c(ZipFile zipFile) {
        ArrayList list = Collections.list(zipFile.entries());
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj = list.get(i);
            i++;
            ZipEntry zipEntry = (ZipEntry) obj;
            zipEntry.isDirectory();
            if (nhc1.Y(zipEntry.getName(), "classes", false)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        long crc = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ZipEntry zipEntry2 = (ZipEntry) obj2;
            String str = "entry name = " + zipEntry2 + ", entry size = " + zipEntry2.getSize();
            utw0 utw0Var = ike1.a;
            utw0Var.y(c);
            utw0Var.o(str, new Object[0]);
            crc += zipEntry2.getCrc();
        }
        return crc;
    }

    public static boolean d(Application application) {
        String strA = a(application);
        if (strA == null) {
            return false;
        }
        int iHashCode = strA.hashCode();
        if (iHashCode == -1859733809) {
            return strA.equals("com.amazon.venezia");
        }
        if (iHashCode == -1637701853) {
            return strA.equals("com.huawei.appmarket");
        }
        if (iHashCode != -1225090538) {
            return iHashCode == -1046965711 && strA.equals("com.android.vending");
        }
        return strA.equals("com.sec.android.app.samsungapps");
    }
}
