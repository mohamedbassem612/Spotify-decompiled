package com.comscore.android.id;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.provider.Settings;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p.bhn0;
import p.eg;
import p.o0c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class IdHelperAndroid {
    public static final String NO_ID_AVAILABLE = "none";
    public static final String[] INVALID_ID_VALUES = {"0123456789ABCDEF", "0123456789abcdef", "9774d56d682e549c", "9774D56D682E549C", "unknown", "UNKNOWN", "android_id", "ANDROID_ID"};
    public static final String[] INVALID_AD_ID_VALUES = {"00000000-0000-0000-0000-000000000000"};
    private static boolean c = false;
    private static final String a = "com.google.android.gms";
    private static final String b = "com.google.android.gms.ads.identifier.service.START";

    public static final class b implements IInterface {
        private IBinder a;

        public b(IBinder iBinder) {
            this.a = iBinder;
        }

        public boolean a(boolean z) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z ? 1 : 0);
                this.a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.a;
        }

        public String getId() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    private static Boolean a(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eg.m("Cannot be called from the main thread");
            return null;
        }
        if (!z && c) {
            return Boolean.FALSE;
        }
        try {
            boolean z2 = Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking") == 0;
            if (!z && !z2) {
                c = true;
            }
            return Boolean.valueOf(z2);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean b(Context context) {
        if (Build.MODEL.matches("AFTN")) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static String getAmazonAdvertisingId(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eg.m("Cannot be called from the main thread");
            return null;
        }
        Boolean boolA = a(context, z);
        if (boolA == null) {
            return null;
        }
        return boolA.booleanValue() ? a(context) : NO_ID_AVAILABLE;
    }

    public static AppSetIdInfo getAppSetID(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eg.m("Cannot be called from the main thread");
            return null;
        }
        try {
            Class.forName("com.google.android.gms.appset.AppSet");
            try {
                return (AppSetIdInfo) o0c.h(AppSet.getClient(context).getAppSetIdInfo(), 5L, TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eg.m("Cannot be called from the main thread");
            return null;
        }
        if (b(context)) {
            String amazonAdvertisingId = getAmazonAdvertisingId(context, z);
            if (amazonAdvertisingId != null) {
                return new CrossPublisherId(amazonAdvertisingId, 1);
            }
        } else {
            DeviceId googlePlayAdvertisingDeviceId = getGooglePlayAdvertisingDeviceId(context, z);
            if (googlePlayAdvertisingDeviceId != null) {
                return new CrossPublisherId(googlePlayAdvertisingDeviceId.getId(), 1);
            }
        }
        return new CrossPublisherId(null, 0);
    }

    public static DeviceId getDeviceId(Context context) {
        AppSetIdInfo appSetID = getAppSetID(context);
        if (appSetID != null) {
            int scope = appSetID.getScope();
            if (scope == 1) {
                return new DeviceId("AppSetIdScopeApp", appSetID.getId(), 7, 2, 4);
            }
            if (scope == 2) {
                return new DeviceId("AppSetIdScopeDeveloper", appSetID.getId(), 6, 2, 3);
            }
        }
        return a();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public static DeviceId getGooglePlayAdvertisingDeviceId(Context context, boolean z) {
        String str;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eg.m("Cannot be called from the main thread");
            return null;
        }
        if (!isGooglePlayServicesAvailable(context)) {
            return null;
        }
        if (isAdvertisingIdEnabled(context, z)) {
            String googlePlayAdvertisingId = getGooglePlayAdvertisingId(context);
            if (isAdvertisementIdValid(googlePlayAdvertisingId)) {
                str = googlePlayAdvertisingId;
            } else {
                str = NO_ID_AVAILABLE;
            }
        } else {
            str = NO_ID_AVAILABLE;
        }
        return new DeviceId("googleplayapp", str, 0, 0, -1);
    }

    public static String getGooglePlayAdvertisingId(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eg.m("Cannot be called from the main thread");
            return null;
        }
        a aVar = new a(0);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        if (context.bindService(intent, aVar, 1)) {
            try {
                return new b(aVar.a()).getId();
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        return "";
    }

    public static boolean isAdvertisementIdValid(String str) {
        for (String str2 : INVALID_AD_ID_VALUES) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAdvertisingIdEnabled(Context context, boolean z) {
        boolean z2 = false;
        z2 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eg.m("Cannot be called from the main thread");
            return false;
        }
        if (!z && c) {
            return false;
        }
        a aVar = new a(z2 ? 1 : 0);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        if (context.bindService(intent, aVar, 1)) {
            try {
                z2 = !new b(aVar.a()).a(true);
            } catch (Exception unused) {
            } finally {
                context.unbindService(aVar);
            }
        }
        if (!z && !z2) {
            c = true;
        }
        return z2;
    }

    public static boolean isGooglePlayServicesAvailable(Context context) {
        int i = 0;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            eg.m("Cannot be called from the main thread");
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            a aVar = new a(i);
            Intent intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, aVar, 1)) {
                context.unbindService(aVar);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String md5(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            bhn0.o("Huh, MD5 should be supported?", e);
            return null;
        }
    }

    public static final class a implements ServiceConnection {
        boolean a;
        private final LinkedBlockingQueue<IBinder> b;

        private a() {
            this.a = false;
            this.b = new LinkedBlockingQueue<>(1);
        }

        public IBinder a() {
            if (this.a) {
                bhn0.w();
                return null;
            }
            this.a = true;
            return this.b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    private static String a(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    private static DeviceId a() {
        return new DeviceId("random", UUID.randomUUID().toString(), 7, 2, 0);
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context) {
        return getCrossPublisherDeviceId(context, false);
    }

    public static boolean isAdvertisingIdEnabled(Context context) {
        return isAdvertisingIdEnabled(context, false);
    }
}
