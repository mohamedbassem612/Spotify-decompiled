package p;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gjv {
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static b1p1 m;
    public static c3p1 n;
    public final Context a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final i92 k = new i92((byte) 19);
    public static final rtw0 l = new rtw0((byte) 23);
    public static final bbn1 b = new bbn1();
    public static final bdn1 c = new bdn1();
    public static final hen1 d = new hen1();

    public gjv(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (k8p1.h(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            new StringBuilder(String.valueOf(declaredField.get(null)).length() + 50 + String.valueOf(str).length() + 1);
            return 0;
        } catch (ClassNotFoundException unused) {
            new StringBuilder(String.valueOf(str).length() + 45);
            return 0;
        } catch (Exception e2) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage()));
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e0 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01e8 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01f2 A[Catch: all -> 0x01f0, TRY_ENTER, TryCatch #0 {, blocks: (B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f2, B:108:0x01f9), top: B:151:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0249  */
    /* JADX WARN: Code duplicated, block: B:126:0x024f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0258  */
    /* JADX WARN: Code duplicated, block: B:134:0x0269 A[Catch: all -> 0x0091, TryCatch #3 {all -> 0x0091, blocks: (B:7:0x003a, B:11:0x008a, B:18:0x0096, B:22:0x009d, B:34:0x00c4, B:111:0x01fc, B:112:0x0206, B:115:0x0209, B:116:0x020a, B:117:0x0211, B:134:0x0269, B:135:0x0287, B:118:0x0212, B:120:0x0229, B:122:0x0237, B:132:0x0261, B:133:0x0268, B:136:0x0288, B:137:0x02d3), top: B:152:0x003a, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x009d A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #3 {all -> 0x0091, blocks: (B:7:0x003a, B:11:0x008a, B:18:0x0096, B:22:0x009d, B:34:0x00c4, B:111:0x01fc, B:112:0x0206, B:115:0x0209, B:116:0x020a, B:117:0x0211, B:134:0x0269, B:135:0x0287, B:118:0x0212, B:120:0x0229, B:122:0x0237, B:132:0x0261, B:133:0x0268, B:136:0x0288, B:137:0x02d3), top: B:152:0x003a, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00af  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[Catch: all -> 0x01f0, TryCatch #0 {, blocks: (B:37:0x00c9, B:39:0x00cf, B:40:0x00d1, B:107:0x01f2, B:108:0x01f9), top: B:151:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0164 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x016f A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x018d A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0194 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x019c A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ad A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01b7 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01c1 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d0 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d8 A[Catch: all -> 0x012b, DynamiteModule$LoadingException -> 0x012e, RemoteException -> 0x0131, TryCatch #8 {RemoteException -> 0x0131, DynamiteModule$LoadingException -> 0x012e, all -> 0x012b, blocks: (B:36:0x00c8, B:42:0x00d4, B:44:0x00db, B:45:0x00f3, B:49:0x00f9, B:51:0x0101, B:53:0x0105, B:54:0x0111, B:61:0x011c, B:69:0x0142, B:71:0x014a, B:72:0x0151, B:73:0x0158, B:68:0x0134, B:76:0x015b, B:77:0x015c, B:78:0x0163, B:79:0x0164, B:80:0x016b, B:83:0x016e, B:84:0x016f, B:86:0x018d, B:88:0x0194, B:90:0x019c, B:96:0x01ca, B:98:0x01d0, B:99:0x01d8, B:100:0x01df, B:91:0x01ad, B:92:0x01b4, B:94:0x01b7, B:95:0x01c1, B:101:0x01e0, B:102:0x01e7, B:103:0x01e8, B:104:0x01ef, B:110:0x01fb), top: B:160:0x00c8 }] */
    public static gjv c(Context context, fjv fjvVar, String str) throws Throwable {
        long j2;
        gjv gjvVar;
        Cursor cursor;
        int i2;
        Boolean bool;
        b1p1 b1p1VarH;
        int iK1;
        vh70 vh70VarG1;
        Object objC1;
        sxo1 sxo1Var;
        c3p1 c3p1Var;
        sxo1 sxo1Var2;
        boolean z;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new DynamiteModule$LoadingException("null application Context");
        }
        ThreadLocal threadLocal = j;
        sxo1 sxo1Var3 = (sxo1) threadLocal.get();
        sxo1 sxo1Var4 = new sxo1();
        threadLocal.set(sxo1Var4);
        i92 i92Var = k;
        Long l2 = (Long) i92Var.get();
        long jLongValue = l2.longValue();
        try {
            j2 = jLongValue;
            try {
                i92Var.set(Long.valueOf(SystemClock.uptimeMillis()));
                cc9 cc9VarC = fjvVar.c(context, str, l);
                new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(cc9VarC.a).length() + 19 + String.valueOf(str).length() + 1 + String.valueOf(cc9VarC.b).length());
                int i3 = cc9VarC.c;
                if (i3 != 0) {
                    if (i3 != -1) {
                        if (i3 == 1 || cc9VarC.b != 0) {
                            if (i3 == -1) {
                                "Selected local version of ".concat(String.valueOf(str));
                                gjv gjvVar2 = new gjv(applicationContext);
                                if (j2 == 0) {
                                    i92Var.remove();
                                } else {
                                    i92Var.set(l2);
                                }
                                cursor2 = sxo1Var4.a;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                threadLocal.set(sxo1Var3);
                                return gjvVar2;
                            }
                            if (i3 == 1) {
                                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 36);
                                sb.append("VersionPolicy returned invalid code:");
                                sb.append(i3);
                                throw new DynamiteModule$LoadingException(sb.toString());
                            }
                            try {
                                i2 = cc9VarC.b;
                                try {
                                    synchronized (gjv.class) {
                                        if (e(context)) {
                                            throw new DynamiteModule$LoadingException("Remote loading disabled");
                                        }
                                        bool = e;
                                    }
                                    if (bool != null) {
                                        throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                        synchronized (gjv.class) {
                                            c3p1Var = n;
                                        }
                                        if (c3p1Var != null) {
                                            throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                        }
                                        sxo1Var2 = (sxo1) threadLocal.get();
                                        if (sxo1Var2 != null || sxo1Var2.a == null) {
                                            throw new DynamiteModule$LoadingException("No result cursor");
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor3 = sxo1Var2.a;
                                        new qfp0(null);
                                        synchronized (gjv.class) {
                                            z = h >= 2;
                                        }
                                        Context context2 = (Context) qfp0.c1(z ? c3p1Var.h1(new qfp0(applicationContext2), str, i2, new qfp0(cursor3)) : c3p1Var.g1(new qfp0(applicationContext2), str, i2, new qfp0(cursor3)));
                                        if (context2 == null) {
                                            throw new DynamiteModule$LoadingException("Failed to get module context");
                                        }
                                        gjvVar = new gjv(context2);
                                    } else {
                                        new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                        b1p1VarH = h(context);
                                        if (b1p1VarH != null) {
                                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                                        }
                                        iK1 = b1p1VarH.k1();
                                        if (iK1 >= 3) {
                                            sxo1Var = (sxo1) threadLocal.get();
                                            if (sxo1Var != null) {
                                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                            }
                                            vh70VarG1 = b1p1VarH.m1(new qfp0(context), str, i2, new qfp0(sxo1Var.a));
                                        } else if (iK1 == 2) {
                                            vh70VarG1 = b1p1VarH.i1(new qfp0(context), str, i2);
                                        } else {
                                            vh70VarG1 = b1p1VarH.g1(new qfp0(context), str, i2);
                                        }
                                        objC1 = qfp0.c1(vh70VarG1);
                                        if (objC1 != null) {
                                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                                        }
                                        gjvVar = new gjv((Context) objC1);
                                    }
                                    if (j2 == 0) {
                                        k.remove();
                                    } else {
                                        k.set(l2);
                                    }
                                    cursor = sxo1Var4.a;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    j.set(sxo1Var3);
                                    return gjvVar;
                                } catch (RemoteException e2) {
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", e2);
                                } catch (DynamiteModule$LoadingException e3) {
                                    throw e3;
                                } catch (Throwable th) {
                                    poo1.v(context, th);
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                }
                            } catch (DynamiteModule$LoadingException e4) {
                                new StringBuilder(String.valueOf(e4.getMessage()).length() + 30);
                                int i4 = cc9VarC.a;
                                if (i4 == 0 || fjvVar.c(context, str, new hn5(i4)).c != -1) {
                                    throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e4);
                                }
                                "Selected local version of ".concat(String.valueOf(str));
                                gjvVar = new gjv(applicationContext);
                            }
                        }
                    } else if (cc9VarC.a != 0) {
                        i3 = -1;
                        if (i3 == 1) {
                        }
                        if (i3 == -1) {
                            "Selected local version of ".concat(String.valueOf(str));
                            gjv gjvVar3 = new gjv(applicationContext);
                            if (j2 == 0) {
                                i92Var.remove();
                            } else {
                                i92Var.set(l2);
                            }
                            cursor2 = sxo1Var4.a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(sxo1Var3);
                            return gjvVar3;
                        }
                        if (i3 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i3);
                            throw new DynamiteModule$LoadingException(sb2.toString());
                        }
                        i2 = cc9VarC.b;
                        synchronized (gjv.class) {
                            if (e(context)) {
                                throw new DynamiteModule$LoadingException("Remote loading disabled");
                            }
                            bool = e;
                            if (bool != null) {
                                throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                            }
                            if (bool.booleanValue()) {
                                new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                                synchronized (gjv.class) {
                                    c3p1Var = n;
                                    if (c3p1Var != null) {
                                        throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                    }
                                    sxo1Var2 = (sxo1) threadLocal.get();
                                    if (sxo1Var2 != null) {
                                    }
                                    throw new DynamiteModule$LoadingException("No result cursor");
                                }
                            }
                            new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(i2).length());
                            b1p1VarH = h(context);
                            if (b1p1VarH != null) {
                                throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                            }
                            iK1 = b1p1VarH.k1();
                            if (iK1 >= 3) {
                                sxo1Var = (sxo1) threadLocal.get();
                                if (sxo1Var != null) {
                                    throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                }
                                vh70VarG1 = b1p1VarH.m1(new qfp0(context), str, i2, new qfp0(sxo1Var.a));
                            } else if (iK1 == 2) {
                                vh70VarG1 = b1p1VarH.i1(new qfp0(context), str, i2);
                            } else {
                                vh70VarG1 = b1p1VarH.g1(new qfp0(context), str, i2);
                            }
                            objC1 = qfp0.c1(vh70VarG1);
                            if (objC1 != null) {
                                throw new DynamiteModule$LoadingException("Failed to load remote module.");
                            }
                            gjvVar = new gjv((Context) objC1);
                            if (j2 == 0) {
                                k.remove();
                            } else {
                                k.set(l2);
                            }
                            cursor = sxo1Var4.a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            j.set(sxo1Var3);
                            return gjvVar;
                        }
                    }
                }
                int i5 = cc9VarC.a;
                int i6 = cc9VarC.b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(i5).length() + 23 + String.valueOf(i6).length() + 1);
                sb3.append("No acceptable module ");
                sb3.append(str);
                sb3.append(" found. Local version is ");
                sb3.append(i5);
                sb3.append(" and remote version is ");
                sb3.append(i6);
                sb3.append(".");
                throw new DynamiteModule$LoadingException(sb3.toString());
            } catch (Throwable th2) {
                th = th2;
                if (j2 == 0) {
                    k.remove();
                } else {
                    k.set(l2);
                }
                Cursor cursor4 = sxo1Var4.a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                j.set(sxo1Var3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = jLongValue;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:112:0x0175 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:3:0x0002, B:63:0x00d6, B:65:0x00dc, B:73:0x00fb, B:103:0x0164, B:112:0x0175, B:128:0x01b3, B:129:0x01b6, B:123:0x01aa, B:71:0x00e7, B:131:0x01b8, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00d3, B:21:0x004a, B:44:0x00a1, B:47:0x00a4, B:54:0x00bc, B:62:0x00d5, B:60:0x00c2), top: B:135:0x0002, inners: #6, #11 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0 A[Catch: all -> 0x0037, TryCatch #10 {all -> 0x0037, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b9, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x0050, B:27:0x0054, B:30:0x005d, B:32:0x0065, B:35:0x006c, B:42:0x0098, B:43:0x00a0, B:38:0x0073, B:40:0x0079, B:41:0x008a, B:46:0x00a3, B:49:0x00a6, B:50:0x00b0, B:17:0x003f), top: B:143:0x0027, inners: #12 }] */
    public static int d(Context context, String str, boolean z) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (gjv.class) {
                Boolean bool = e;
                boolean z2 = true;
                Cursor cursor2 = null;
                int iJ1 = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (DynamiteModule$LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (g) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z, true);
                                                String str2 = f;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderM = jhc1.M();
                                                    if (classLoaderM == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            djv.b();
                                                            String str3 = f;
                                                            zod.s(str3);
                                                            classLoaderM = djv.a(ClassLoader.getSystemClassLoader(), str3);
                                                        } else {
                                                            String str4 = f;
                                                            zod.s(str4);
                                                            classLoaderM = new yxn1(ClassLoader.getSystemClassLoader(), str4);
                                                        }
                                                    }
                                                    g(classLoaderM);
                                                    declaredField.set(null, classLoaderM);
                                                    e = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (DynamiteModule$LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                e = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        new StringBuilder(e2.toString().length() + 30);
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z, false);
                    } catch (DynamiteModule$LoadingException e3) {
                        new StringBuilder(String.valueOf(e3.getMessage()).length() + 42);
                        return 0;
                    }
                }
                b1p1 b1p1VarH = h(context);
                if (b1p1VarH != null) {
                    try {
                        try {
                            int iK1 = b1p1VarH.k1();
                            if (iK1 >= 3) {
                                ThreadLocal threadLocal = j;
                                sxo1 sxo1Var = (sxo1) threadLocal.get();
                                if (sxo1Var == null || (cursor = sxo1Var.a) == null) {
                                    Cursor cursor3 = (Cursor) qfp0.c1(b1p1VarH.l1(new qfp0(context), str, z, ((Long) k.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i2 = cursor3.getInt(0);
                                                if (i2 > 0) {
                                                    sxo1 sxo1Var2 = (sxo1) threadLocal.get();
                                                    if (sxo1Var2 == null || sxo1Var2.a != null) {
                                                        z2 = false;
                                                    } else {
                                                        sxo1Var2.a = cursor3;
                                                    }
                                                    cursor2 = z2 ? null : cursor3;
                                                }
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iJ1 = i2;
                                            } else if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        } catch (RemoteException e4) {
                                            remoteException = e4;
                                            cursor2 = cursor3;
                                            new StringBuilder(String.valueOf(remoteException.getMessage()).length() + 42);
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } else if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                } else {
                                    iJ1 = cursor.getInt(0);
                                }
                            } else {
                                iJ1 = iK1 == 2 ? b1p1VarH.j1(new qfp0(context), str, z) : b1p1VarH.h1(new qfp0(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            remoteException = e5;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return iJ1;
            }
        } catch (Throwable th5) {
            poo1.v(context, th5);
            throw th5;
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != wyo1.k() ? 0 : 268435456);
            if (mz40.b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                g = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    public static int f(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z3;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z4 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) k.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z5 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (gjv.class) {
                                    try {
                                        f = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            h = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = matrixCursor.getInt(columnIndex2) != 0;
                                            g = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                sxo1 sxo1Var = (sxo1) j.get();
                                if (sxo1Var == null || sxo1Var.a != null) {
                                    z4 = false;
                                } else {
                                    sxo1Var.a = matrixCursor;
                                }
                                z5 = z3;
                                matrixCursor2 = z4 ? null : matrixCursor;
                            }
                            if (z2 && z5) {
                                throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (Exception e2) {
                        exc = e2;
                        if (exc instanceof DynamiteModule$LoadingException) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new DynamiteModule$LoadingException(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e3) {
            exc = e3;
        }
    }

    public static void g(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            c3p1 c3p1Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                Object objQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                c3p1Var = objQueryLocalInterface instanceof c3p1 ? (c3p1) objQueryLocalInterface : new c3p1(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", (byte) 2);
            }
            n = c3p1Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    public static b1p1 h(Context context) {
        b1p1 b1p1Var;
        synchronized (gjv.class) {
            b1p1 b1p1Var2 = m;
            if (b1p1Var2 != null) {
                return b1p1Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    b1p1Var = null;
                } else {
                    b1p1 b1p1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    b1p1Var = b1p1VarQueryLocalInterface instanceof b1p1 ? b1p1VarQueryLocalInterface : new b1p1(iBinder);
                }
                if (b1p1Var != null) {
                    m = b1p1Var;
                    return b1p1Var;
                }
            } catch (Exception e2) {
                new StringBuilder(String.valueOf(e2.getMessage()).length() + 45);
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
