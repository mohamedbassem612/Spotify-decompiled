package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import java.util.HashMap;
import p.dbl;
import p.j7o1;
import p.mz40;
import p.nsn1;
import p.nxn1;
import p.v1o1;
import p.x8b;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class AdvertisingIdClient {
    x8b zza;
    j7o1 zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzg;

    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z = this.zzb;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzd = new Object();
        zod.s(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info infoZzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(infoZzd, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            advertisingIdClient.zza();
            return infoZzd;
        } catch (Throwable th) {
            try {
                advertisingIdClient.zzc(null, true, 0.0f, -1L, "", th);
                throw th;
            } catch (Throwable th2) {
                advertisingIdClient.zza();
                throw th2;
            }
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean z;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            zod.r("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            zzb zzbVar = advertisingIdClient.zze;
                            if (zzbVar == null || !zzbVar.zzb) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        }
                    }
                    zod.s(advertisingIdClient.zza);
                    zod.s(advertisingIdClient.zzb);
                    try {
                        nxn1 nxn1Var = (nxn1) advertisingIdClient.zzb;
                        nxn1Var.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        Parcel parcelS = nxn1Var.s(6, parcelObtain);
                        int i = nsn1.a;
                        z = parcelS.readInt() != 0;
                        parcelS.recycle();
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            advertisingIdClient.zze();
            advertisingIdClient.zza();
            return z;
        } catch (Throwable th2) {
            advertisingIdClient.zza();
            throw th2;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzd(int i) {
        Info info;
        zod.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        zzb zzbVar = this.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                zod.s(this.zza);
                zod.s(this.zzb);
                try {
                    nxn1 nxn1Var = (nxn1) this.zzb;
                    nxn1Var.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelS = nxn1Var.s(1, parcelObtain);
                    String string = parcelS.readString();
                    parcelS.recycle();
                    nxn1 nxn1Var2 = (nxn1) this.zzb;
                    nxn1Var2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i2 = nsn1.a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelS2 = nxn1Var2.s(2, parcelObtain2);
                    boolean z = parcelS2.readInt() != 0;
                    parcelS2.recycle();
                    info = new Info(string, z);
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new zzb(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return zzd(-1);
    }

    public void start() {
        zzb(true);
    }

    public final void zza() {
        zod.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        dbl.a().b(this.zzg, this.zza);
                    }
                } catch (Throwable unused) {
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(boolean z) {
        zod.r("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = mz40.b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    x8b x8bVar = new x8b();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!dbl.a().c(context, context.getClass().getName(), intent, x8bVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = x8bVar;
                        try {
                            try {
                                IBinder iBinderA = x8bVar.a();
                                int i = v1o1.a;
                                IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                this.zzb = iInterfaceQueryLocalInterface instanceof j7o1 ? (j7o1) iInterfaceQueryLocalInterface : new nxn1(iBinderA);
                                this.zzc = true;
                                if (z) {
                                    zze();
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            }
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean zzc(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                map.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j));
        new zza(this, map).start();
        return true;
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }
}
