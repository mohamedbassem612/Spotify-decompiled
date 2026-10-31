package p;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.media3.session.legacy.MediaSessionManager;
import com.google.android.gms.common.api.Status;
import com.google.android.play.agesignals.AgeSignalsException;
import com.google.android.play.core.crossdeviceprompt.CrossDevicePromptException;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mh70 extends Binder implements IInterface {
    public final /* synthetic */ byte a;

    public mh70(String str, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            case 6:
                attachInterface(this, str);
                break;
            case 7:
            case 8:
            case 9:
            default:
                attachInterface(this, str);
                break;
            case 10:
                attachInterface(this, str);
                break;
            case 11:
                attachInterface(this, str);
                break;
        }
    }

    public abstract boolean B0(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean X0(int i, Parcel parcel, Parcel parcel2);

    public boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract void Z0(Status status, dm00 dm00Var);

    public abstract void a1(Status status, mc80 mc80Var);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        byte b = this.a;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zlo1 zlo1Var;
        boolean zOnTransact = false;
        switch (this.a) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
                }
                if (i == 1598968902) {
                    parcel2.writeString("androidx.media3.session.IMediaSessionService");
                    return true;
                }
                if (i != 3001) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                final eh70 eh70VarS = xlh0.s(parcel.readStrongBinder());
                Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
                final c1i0 c1i0Var = (c1i0) this;
                if (eh70VarS == null || bundle == null) {
                    iqo1.r(eh70VarS);
                    return true;
                }
                try {
                    final kal kalVarA = kal.a(bundle);
                    String str = kalVarA.c;
                    d1i0 d1i0Var = (d1i0) c1i0Var.l.get();
                    if (d1i0Var == null) {
                        iqo1.r(eh70VarS);
                        return true;
                    }
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    if (callingPid == 0) {
                        callingPid = kalVarA.d;
                    }
                    if (iqo1.o(callingUid, d1i0Var, str) == 0) {
                        final MediaSessionManager.RemoteUserInfo remoteUserInfo = new MediaSessionManager.RemoteUserInfo(str, callingPid, callingUid);
                        final boolean zIsTrustedForMediaControl = MediaSessionManager.getSessionManager(d1i0Var.getApplicationContext()).isTrustedForMediaControl(remoteUserInfo);
                        c1i0Var.n.add(eh70VarS);
                        try {
                            c1i0Var.m.post(new Runnable() { // from class: p.b1i0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    MediaSessionManager.RemoteUserInfo remoteUserInfo2 = remoteUserInfo;
                                    kal kalVar = kalVarA;
                                    boolean z = zIsTrustedForMediaControl;
                                    c1i0 c1i0Var2 = c1i0Var;
                                    Set set = c1i0Var2.n;
                                    eh70 eh70Var = eh70VarS;
                                    set.remove(eh70Var);
                                    try {
                                        try {
                                            d1i0 d1i0Var2 = (d1i0) c1i0Var2.l.get();
                                            if (d1i0Var2 == null) {
                                                iqo1.r(eh70Var);
                                                return;
                                            }
                                            int i3 = kalVar.a;
                                            int i4 = kalVar.b;
                                            ixh0 ixh0Var = new ixh0(remoteUserInfo2, i3, i4, z, new a2i0(eh70Var, i4), kalVar.e);
                                            kph0 kph0VarN = d1i0Var2.n(ixh0Var);
                                            if (kph0VarN == null) {
                                                iqo1.r(eh70Var);
                                                return;
                                            } else {
                                                d1i0Var2.i(kph0VarN);
                                                kph0VarN.a.g.s(eh70Var, ixh0Var);
                                                return;
                                            }
                                        } catch (Exception e) {
                                            oon1.I("Failed to add a session to session service", e);
                                            iqo1.r(eh70Var);
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        iqo1.r(eh70Var);
                                        throw th;
                                    }
                                    iqo1.r(eh70Var);
                                    throw th;
                                }
                            });
                            return true;
                        } finally {
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    }
                    oon1.H("Ignoring connection from invalid package name " + str + " (uid=" + callingUid + ")");
                    iqo1.r(eh70VarS);
                    return true;
                } catch (RuntimeException e) {
                    oon1.I("Ignoring malformed Bundle for ConnectionRequest", e);
                    iqo1.r(eh70VarS);
                    return true;
                }
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return X0(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (zOnTransact) {
                    return true;
                }
                return B0(i, parcel, parcel2);
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return Y0(i, parcel, parcel2);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return Y0(i, parcel, parcel2);
            case 5:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return s(i, parcel);
            case 6:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return Y0(i, parcel, parcel2);
            case 7:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 8:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                e7o1 e7o1Var = (e7o1) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i3 = wsn1.a;
                Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(f4i1.c(iDataAvail, "Parcel data not fully consumed, unread size: "));
                }
                gzo1 gzo1Var = e7o1Var.n.a;
                if (gzo1Var != null) {
                    bsd1 bsd1Var = e7o1Var.m;
                    synchronized (gzo1Var.f) {
                        gzo1Var.e.remove(bsd1Var);
                        break;
                    }
                    gzo1Var.a().post(new qio1(gzo1Var));
                }
                e7o1Var.l.b("onGetLaunchPromptFlowInfo", new Object[0]);
                PendingIntent pendingIntent = (PendingIntent) bundle2.get("confirmation_intent");
                boolean z = bundle2.getBoolean("is_cross_device_prompt_no_op");
                bsd1 bsd1Var2 = e7o1Var.m;
                if (pendingIntent == null) {
                    bsd1Var2.c(new CrossDevicePromptException(-100));
                } else {
                    bsd1Var2.d(new yan1(pendingIntent, z));
                }
                return true;
            case 9:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                d7o1 d7o1Var = (d7o1) this;
                hdn1 hdn1Var = d7o1Var.l;
                bsd1 bsd1Var3 = d7o1Var.m;
                mbo1 mbo1Var = d7o1Var.n;
                if (i == 1) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i4 = xsn1.a;
                    Bundle bundle3 = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator2.createFromParcel(parcel));
                    int iDataAvail2 = parcel.dataAvail();
                    if (iDataAvail2 > 0) {
                        throw new BadParcelableException(f4i1.c(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
                    mbo1Var.b.c(bsd1Var3);
                    hdn1Var.g("onCompleteCheckAgeSignals", new Object[0]);
                    if (bundle3.containsKey("user.status")) {
                        zlo1Var = new zlo1(bundle3.containsKey("user.status") ? Integer.valueOf(bundle3.getInt("user.status")) : null, bundle3.containsKey("age.range.lower") ? Integer.valueOf(bundle3.getInt("age.range.lower")) : null, bundle3.containsKey("age.range.upper") ? Integer.valueOf(bundle3.getInt("age.range.upper")) : null, bundle3.containsKey("most.recent.approval.date") ? new Date(bundle3.getLong("most.recent.approval.date")) : null, bundle3.containsKey("install.id") ? bundle3.getString("install.id") : null);
                    } else {
                        zlo1Var = new zlo1((Integer) null, (Integer) null, (Integer) null, (Date) null, (String) null);
                    }
                    bsd1Var3.d(zlo1Var);
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    int i5 = xsn1.a;
                    Bundle bundle4 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                    int iDataAvail3 = parcel.dataAvail();
                    if (iDataAvail3 > 0) {
                        throw new BadParcelableException(f4i1.c(iDataAvail3, "Parcel data not fully consumed, unread size: "));
                    }
                    mbo1Var.b.c(bsd1Var3);
                    int i6 = bundle4.getInt("error.code");
                    Object[] objArr = {Integer.valueOf(i6)};
                    hdn1Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        hdn1.i(hdn1Var.b, "onError(%d)", objArr);
                    }
                    bsd1Var3.c(new AgeSignalsException(i6));
                }
                return true;
            case 10:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return Y0(i, parcel, parcel2);
            case 11:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return Y0(i, parcel, parcel2);
            case 12:
                if (i > 16777215) {
                    if (!super.onTransact(i, parcel, parcel2, i2)) {
                    }
                    return true;
                }
                parcel.enforceInterface(getInterfaceDescriptor());
                if (i == 1) {
                    Status status = (Status) ysn1.a(parcel, Status.CREATOR);
                    mc80 mc80Var = (mc80) ysn1.a(parcel, mc80.CREATOR);
                    int iDataAvail4 = parcel.dataAvail();
                    if (iDataAvail4 > 0) {
                        throw new BadParcelableException(f4i1.c(iDataAvail4, "Parcel data not fully consumed, unread size: "));
                    }
                    a1(status, mc80Var);
                } else {
                    if (i != 2) {
                        return false;
                    }
                    Status status2 = (Status) ysn1.a(parcel, Status.CREATOR);
                    dm00 dm00Var = (dm00) ysn1.a(parcel, dm00.CREATOR);
                    int iDataAvail5 = parcel.dataAvail();
                    if (iDataAvail5 > 0) {
                        throw new BadParcelableException(f4i1.c(iDataAvail5, "Parcel data not fully consumed, unread size: "));
                    }
                    Z0(status2, dm00Var);
                }
                return true;
        }
    }

    public abstract boolean s(int i, Parcel parcel);

    public mh70() {
        this.a = (byte) 12;
        attachInterface(this, "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }
}
