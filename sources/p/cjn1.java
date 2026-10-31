package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cjn1 extends mh70 {
    public final /* synthetic */ byte l = 1;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjn1(ca61 ca61Var) {
        super("com.google.android.gms.cast.framework.ISessionProxy", (byte) 3);
        this.m = ca61Var;
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        byte b = this.l;
        Object obj = this.m;
        boolean z = false;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                dbm dbmVar = (dbm) obj;
                if (i == 1) {
                    b0u b0uVar = (b0u) osn1.a(parcel, b0u.CREATOR);
                    osn1.d(parcel);
                    dbmVar.h(new owf1(this, b0uVar));
                } else {
                    if (i != 2) {
                        return false;
                    }
                    b0u b0uVar2 = (b0u) osn1.a(parcel, b0u.CREATOR);
                    osn1.d(parcel);
                    dbmVar.h(new f2g1(this, b0uVar2));
                }
                return true;
            case 1:
                b4e b4eVar = (ca61) obj;
                switch (i) {
                    case 1:
                        qfp0 qfp0Var = new qfp0(b4eVar);
                        parcel2.writeNoException();
                        osn1.c(parcel2, qfp0Var);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) osn1.a(parcel, Bundle.CREATOR);
                        osn1.d(parcel);
                        b4eVar.f(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) osn1.a(parcel, Bundle.CREATOR);
                        osn1.d(parcel);
                        b4eVar.f(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i2 = osn1.a;
                        int i3 = parcel.readInt() != 0 ? 1 : 0;
                        osn1.d(parcel);
                        b4e b4eVar2 = b4eVar;
                        zhn1 zhn1Var = b4eVar2.e;
                        if (zhn1Var != null) {
                            try {
                                rgn1 rgn1Var = (rgn1) zhn1Var;
                                Parcel parcelA1 = rgn1Var.a1();
                                parcelA1.writeInt(i3);
                                parcelA1.writeInt(0);
                                rgn1Var.c1(6, parcelA1);
                            } catch (RemoteException unused) {
                                b4e.m.b("Unable to call %s on %s.", new Object[]{"disconnectFromDevice", zhn1.class.getSimpleName()});
                            }
                            b4eVar2.b(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        b4e b4eVar3 = b4eVar;
                        b4eVar3.getClass();
                        zod.n("Must be called from the main thread.");
                        e321 e321Var = b4eVar3.j;
                        long jF = e321Var == null ? 0L : e321Var.f() - b4eVar3.j.b();
                        parcel2.writeNoException();
                        parcel2.writeLong(jF);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) osn1.a(parcel, Bundle.CREATOR);
                        osn1.d(parcel);
                        b4e b4eVar4 = b4eVar;
                        b4eVar4.getClass();
                        b4eVar4.k = CastDevice.F(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) osn1.a(parcel, Bundle.CREATOR);
                        osn1.d(parcel);
                        b4e b4eVar5 = b4eVar;
                        b4eVar5.getClass();
                        b4eVar5.k = CastDevice.F(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) osn1.a(parcel, Bundle.CREATOR);
                        osn1.d(parcel);
                        b4e b4eVar6 = b4eVar;
                        b4eVar6.getClass();
                        CastDevice castDeviceF = CastDevice.F(bundle5);
                        if (castDeviceF != null) {
                            String str = castDeviceF.d;
                            if (!castDeviceF.equals(b4eVar6.k)) {
                                if (!TextUtils.isEmpty(str) && ((castDevice2 = b4eVar6.k) == null || !TextUtils.equals(castDevice2.d, str))) {
                                    z = true;
                                }
                                b4eVar6.k = castDeviceF;
                                b4e.m.a("update to device (%s) with name %s", new Object[]{castDeviceF, true != z ? "unchanged" : "changed"});
                                if (z && (castDevice = b4eVar6.k) != null) {
                                    a8p1 a8p1Var = b4eVar6.h;
                                    if (a8p1Var != null) {
                                        a8p1.v.c("update Cast device to %s", new Object[]{castDevice});
                                        a8p1Var.o = castDevice;
                                        a8p1Var.c();
                                    }
                                    Iterator it = new HashSet(b4eVar6.d).iterator();
                                    while (it.hasNext()) {
                                        ((zdp1) it.next()).getClass();
                                    }
                                    utw0 utw0Var = b4eVar6.l;
                                    if (utw0Var != null) {
                                        ((e821) utw0Var.a).A().u++;
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
                return true;
            case 2:
                ppn1 ppn1Var = (ppn1) obj;
                if (i == 1) {
                    String string = parcel.readString();
                    osn1.d(parcel);
                    ppn1Var.getClass();
                    Context context = ppn1Var.a;
                    String str2 = ppn1Var.b;
                    Context context2 = ppn1Var.a;
                    p3e p3eVar = ppn1Var.d;
                    fsn1 fsn1Var = ppn1Var.e;
                    vh70 vh70VarD = new b4e(context, str2, string, p3eVar, fsn1Var, new a8p1(context2, p3eVar, fsn1Var)).d();
                    parcel2.writeNoException();
                    osn1.c(parcel2, vh70VarD);
                } else if (i == 2) {
                    boolean z2 = ppn1Var.d.e;
                    parcel2.writeNoException();
                    int i4 = osn1.a;
                    parcel2.writeInt(z2 ? 1 : 0);
                } else if (i == 3) {
                    String str3 = ppn1Var.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str3);
                } else {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
            default:
                if (i == 1) {
                    long j = parcel.readLong();
                    long j2 = parcel.readLong();
                    osn1.d(parcel);
                    ((oxn1) obj).publishProgress(Long.valueOf(j), Long.valueOf(j2));
                    parcel2.writeNoException();
                } else {
                    if (i != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjn1(non1 non1Var, dbm dbmVar) {
        super("com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsCallback", (byte) 3);
        this.m = dbmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjn1(ppn1 ppn1Var) {
        super("com.google.android.gms.cast.framework.ISessionProvider", (byte) 3);
        this.m = ppn1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjn1(oxn1 oxn1Var) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", (byte) 3);
        this.m = oxn1Var;
    }
}
