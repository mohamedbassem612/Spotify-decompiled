package p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fsn1 extends mh70 implements IInterface {
    public static final pue0 s = new pue0("MediaRouterProxy", null);
    public final owh0 l;
    public final p3e m;
    public final HashMap n;
    public final ytn1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f39p;
    public boolean q;
    public boolean r;

    public fsn1(Context context, owh0 owh0Var, p3e p3eVar, pxo1 pxo1Var) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", (byte) 3);
        this.n = new HashMap();
        this.l = owh0Var;
        this.m = p3eVar;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        s.a("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.o = new ytn1(p3eVar);
        Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
        intent.setPackage(context.getPackageName());
        this.f39p = !context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.q = true;
        pxo1Var.f(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).b(new qeh1(this, (byte) 17));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        dqn1 dqn1Var;
        dwh0 dwh0Var = null;
        Bundle bundle = null;
        dwh0 dwh0Var2 = null;
        dwh0 dwh0Var3 = null;
        dwh0 dwh0Var4 = null;
        HashMap map = this.n;
        pue0 pue0Var = s;
        int i2 = 0;
        owh0 owh0Var = this.l;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) osn1.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    dqn1Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    dqn1Var = iInterfaceQueryLocalInterface instanceof dqn1 ? (dqn1) iInterfaceQueryLocalInterface : new dqn1(strongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", (byte) 1);
                }
                osn1.d(parcel);
                if (bundle2 != null) {
                    dwh0Var = new dwh0(bundle2, null);
                } else {
                    dwh0 dwh0Var5 = dwh0.c;
                }
                if (dwh0Var != null) {
                    if (!map.containsKey(dwh0Var)) {
                        map.put(dwh0Var, new HashSet());
                    }
                    ((Set) map.get(dwh0Var)).add(new vqn1(dqn1Var, this, this.o));
                }
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle3 = (Bundle) osn1.a(parcel, Bundle.CREATOR);
                int i3 = parcel.readInt();
                osn1.d(parcel);
                if (bundle3 != null) {
                    dwh0Var4 = new dwh0(bundle3, null);
                } else {
                    dwh0 dwh0Var6 = dwh0.c;
                }
                if (dwh0Var4 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        c1(dwh0Var4, i3);
                    } else {
                        new jim0(Looper.getMainLooper(), (byte) 5).post(new wr3(this, dwh0Var4, i3, (byte) 12));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle4 = (Bundle) osn1.a(parcel, Bundle.CREATOR);
                osn1.d(parcel);
                if (bundle4 != null) {
                    dwh0Var3 = new dwh0(bundle4, null);
                } else {
                    dwh0 dwh0Var7 = dwh0.c;
                }
                if (dwh0Var3 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        d1(dwh0Var3);
                    } else {
                        new jim0(Looper.getMainLooper(), (byte) 5).post(new ni(this, dwh0Var3, false, (byte) 5));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle5 = (Bundle) osn1.a(parcel, Bundle.CREATOR);
                int i4 = parcel.readInt();
                osn1.d(parcel);
                if (bundle5 != null) {
                    dwh0Var2 = new dwh0(bundle5, null);
                } else {
                    dwh0 dwh0Var8 = dwh0.c;
                }
                if (dwh0Var2 != null) {
                    owh0Var.getClass();
                    owh0.b();
                    kv40 kv40VarC = owh0.c();
                    ArrayList arrayList = kv40VarC.i;
                    dwh0Var2.a();
                    if (!dwh0Var2.b.isEmpty()) {
                        if ((i4 & 2) == 0 && kv40VarC.f65p) {
                            i2 = 1;
                        } else {
                            swh0 swh0Var = kv40VarC.u;
                            Object[] objArr = swh0Var != null && swh0Var.c && kv40VarC.i();
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                lwh0 lwh0Var = (lwh0) arrayList.get(i5);
                                if (((i4 & 1) == 0 || !lwh0Var.d()) && ((!objArr == true || lwh0Var.d() || lwh0Var.b() == kv40VarC.r) && lwh0Var.g(dwh0Var2))) {
                                    i2 = 1;
                                }
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            case 5:
                String string = parcel.readString();
                osn1.d(parcel);
                pue0Var.a("select route with routeId = %s", string);
                owh0Var.getClass();
                owh0.b();
                for (lwh0 lwh0Var2 : owh0.c().i) {
                    if (lwh0Var2.c.equals(string)) {
                        pue0Var.a("media route is found and selected", new Object[0]);
                        lwh0Var2.k(true);
                        parcel2.writeNoException();
                        return true;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                owh0Var.getClass();
                owh0.b();
                lwh0 lwh0Var3 = owh0.c().v;
                if (lwh0Var3 == null) {
                    eg.m("There is no default route.  The media router has not yet been fully initialized.");
                    return false;
                }
                lwh0Var3.k(true);
                parcel2.writeNoException();
                return true;
            case 7:
                owh0Var.getClass();
                owh0.b();
                lwh0 lwh0Var4 = owh0.c().v;
                if (lwh0Var4 == null) {
                    eg.m("There is no default route.  The media router has not yet been fully initialized.");
                    return false;
                }
                owh0.b();
                boolean zEquals = owh0.c().h().c.equals(lwh0Var4.c);
                parcel2.writeNoException();
                int i6 = osn1.a;
                parcel2.writeInt(zEquals ? 1 : 0);
                return true;
            case 8:
                String string2 = parcel.readString();
                osn1.d(parcel);
                owh0Var.getClass();
                owh0.b();
                for (lwh0 lwh0Var5 : owh0.c().i) {
                    if (lwh0Var5.c.equals(string2)) {
                        bundle = lwh0Var5.s;
                        parcel2.writeNoException();
                        if (bundle == null) {
                            parcel2.writeInt(0);
                            return true;
                        }
                        parcel2.writeInt(1);
                        bundle.writeToParcel(parcel2, 1);
                        return true;
                    }
                }
                parcel2.writeNoException();
                if (bundle == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            case 9:
                owh0Var.getClass();
                owh0.b();
                String str = owh0.c().h().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 11:
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        owh0Var.e((fwh0) it2.next());
                    }
                }
                map.clear();
                parcel2.writeNoException();
                return true;
            case 12:
                owh0Var.getClass();
                owh0.b();
                lwh0 lwh0Var6 = owh0.c().w;
                if (lwh0Var6 != null) {
                    owh0.b();
                    if (owh0.c().h().c.equals(lwh0Var6.c)) {
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                int i7 = osn1.a;
                parcel2.writeInt(i2);
                return true;
            case 13:
                int i8 = parcel.readInt();
                osn1.d(parcel);
                owh0Var.getClass();
                owh0.h(i8);
                parcel2.writeNoException();
                return true;
            case 14:
                String string3 = parcel.readString();
                osn1.d(parcel);
                owh0Var.getClass();
                owh0.b();
                for (iwh0 iwh0Var : owh0.c().e()) {
                    if (iwh0Var.c.equals(string3)) {
                        pue0Var.a("clean up the connectedGroupRoute = %s", iwh0Var);
                        iwh0Var.a();
                    }
                }
                owh0.b();
                lwh0 lwh0VarH = owh0.c().h();
                if (lwh0VarH != null && !lwh0VarH.h && lwh0VarH.c.equals(string3)) {
                    pue0Var.a("clean up the selected route = %s", lwh0VarH);
                    owh0.h(0);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final boolean b1() {
        p3e p3eVar;
        return this.f39p && this.q && (p3eVar = this.m) != null && p3eVar.Z;
    }

    public final void c1(dwh0 dwh0Var, int i) {
        Set set = (Set) this.n.get(dwh0Var);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.l.a(dwh0Var, (fwh0) it.next(), i);
        }
    }

    public final void d1(dwh0 dwh0Var) {
        Set set = (Set) this.n.get(dwh0Var);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.l.e((fwh0) it.next());
        }
    }
}
