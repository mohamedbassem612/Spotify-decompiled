package p;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class cqn1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqn1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ cqn1(uqn1 uqn1Var, int i, byte b) {
        this.a = b;
        this.b = uqn1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int i = this.c;
                uqn1 uqn1Var = this.b;
                arn1 arn1Var = uqn1Var.l;
                if (i == 0) {
                    arn1Var.G = (byte) 3;
                    arn1Var.n = true;
                    arn1Var.o = true;
                    synchronized (arn1Var.F) {
                        try {
                            Iterator it = arn1Var.F.iterator();
                            while (it.hasNext()) {
                                ((uhp1) it.next()).a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return;
                }
                arn1Var.G = (byte) 1;
                synchronized (arn1Var.F) {
                    try {
                        Iterator it2 = arn1Var.F.iterator();
                        while (it2.hasNext()) {
                            zhn1 zhn1Var = ((uhp1) it2.next()).a.e;
                            if (zhn1Var != null) {
                                try {
                                    lal lalVar = new lal(i, (PendingIntent) null, (String) null);
                                    rgn1 rgn1Var = (rgn1) zhn1Var;
                                    Parcel parcelA1 = rgn1Var.a1();
                                    osn1.b(parcelA1, lalVar);
                                    rgn1Var.c1(3, parcelA1);
                                } catch (RemoteException unused) {
                                    b4e.m.b("Unable to call %s on %s.", new Object[]{"onConnectionFailed", zhn1.class.getSimpleName()});
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                uqn1Var.l.j();
                return;
            case 1:
                arn1 arn1Var2 = this.b.l;
                arn1Var2.G = (byte) 4;
                List list = arn1Var2.F;
                int i2 = this.c;
                synchronized (list) {
                    try {
                        Iterator it3 = arn1Var2.F.iterator();
                        while (it3.hasNext()) {
                            zhn1 zhn1Var2 = ((uhp1) it3.next()).a.e;
                            if (zhn1Var2 != null) {
                                try {
                                    rgn1 rgn1Var2 = (rgn1) zhn1Var2;
                                    Parcel parcelA2 = rgn1Var2.a1();
                                    parcelA2.writeInt(i2);
                                    rgn1Var2.c1(2, parcelA2);
                                } catch (RemoteException unused2) {
                                    b4e.m.b("Unable to call %s on %s.", new Object[]{"onConnectionSuspended", zhn1.class.getSimpleName()});
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case 2:
                this.b.l.E.b(this.c);
                return;
            default:
                uqn1 uqn1Var2 = this.b;
                arn1 arn1Var3 = uqn1Var2.l;
                arn1Var3.y = -1;
                arn1Var3.z = -1;
                arn1Var3.u = null;
                arn1Var3.v = null;
                arn1Var3.w = 0.0d;
                arn1Var3.v();
                arn1Var3.x = false;
                arn1Var3.A = null;
                arn1Var3.G = (byte) 1;
                List list2 = arn1Var3.F;
                int i3 = this.c;
                synchronized (list2) {
                    try {
                        Iterator it4 = arn1Var3.F.iterator();
                        while (it4.hasNext()) {
                            zhn1 zhn1Var3 = ((uhp1) it4.next()).a.e;
                            if (zhn1Var3 != null) {
                                try {
                                    lal lalVar2 = new lal(i3, (PendingIntent) null, (String) null);
                                    rgn1 rgn1Var3 = (rgn1) zhn1Var3;
                                    Parcel parcelA3 = rgn1Var3.a1();
                                    osn1.b(parcelA3, lalVar2);
                                    rgn1Var3.c1(3, parcelA3);
                                } catch (RemoteException unused3) {
                                    b4e.m.b("Unable to call %s on %s.", new Object[]{"onDisconnected", zhn1.class.getSimpleName()});
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                arn1 arn1Var4 = uqn1Var2.l;
                arn1Var4.j();
                c9d0 c9d0Var = (c9d0) dzo1.j(arn1Var4.l, ((kz40) arn1Var4).g, "castDeviceControllerListenerKey").b;
                zod.t(c9d0Var, "Key must not be null");
                arn1Var4.c(c9d0Var, 8415);
                return;
        }
    }
}
