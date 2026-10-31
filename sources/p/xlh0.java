package p;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xlh0 extends Binder implements eh70 {
    public final WeakReference a;
    public int l;

    public xlh0(rlh0 rlh0Var) {
        attachInterface(this, "androidx.media3.session.IMediaController");
        this.a = new WeakReference(rlh0Var);
        this.l = -1;
    }

    public static eh70 s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof eh70)) {
            return (eh70) iInterfaceQueryLocalInterface;
        }
        dh70 dh70Var = new dh70();
        dh70Var.a = iBinder;
        return dh70Var;
    }

    public final void B0(wlh0 wlh0Var) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            rlh0 rlh0Var = (rlh0) this.a.get();
            if (rlh0Var == null) {
                return;
            }
            zoi1.c0(rlh0Var.a.e, new ag20(rlh0Var, wlh0Var, (byte) 17));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // p.eh70
    public final void G(int i, List list) {
        if (list == null || this.l == -1) {
            return;
        }
        try {
            v280 v280VarM = b380.m();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                v280VarM.c(udh.h(this.l, bundle));
            }
            B0(new mp5(i, v280VarM.g(), (byte) 3));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for CommandButton", e);
        }
    }

    @Override // p.eh70
    public final void L(int i, Bundle bundle) {
        int i2;
        if (bundle == null || (i2 = this.l) == -1) {
            return;
        }
        try {
            X0(i, s7c0.a(i2, bundle));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for LibraryResult", e);
        }
    }

    @Override // p.eh70
    public final void Q(Bundle bundle, int i, boolean z) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(ebu0.d, z);
        bundle2.putBoolean(ebu0.e, true);
        s0(i, bundle, bundle2);
    }

    @Override // p.eh70
    public final void Q0(int i, int i2, Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            oon1.H("onSearchResultChanged(): Ignoring empty query");
            return;
        }
        if (i2 < 0) {
            td6.p(i2, "onSearchResultChanged(): Ignoring negative itemCount: ");
            return;
        }
        if (bundle != null) {
            try {
                iph0.a(bundle);
            } catch (RuntimeException e) {
                oon1.I("Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        B0(new swg0((byte) 11));
    }

    @Override // p.eh70
    public final void T0(int i, Bundle bundle) {
        Bundle bundleP = zoi1.p(bundle);
        if (bundleP == null) {
            oon1.H("Ignoring null Bundle for extras");
        } else {
            B0(new vlh0(bundleP, (byte) 0));
        }
    }

    @Override // p.eh70
    public final void W(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            X0(i, ch61.a(bundle));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for SessionResult", e);
        }
    }

    public final void X0(int i, Object obj) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            rlh0 rlh0Var = (rlh0) this.a.get();
            if (rlh0Var == null) {
                return;
            }
            rlh0Var.b.i(i, obj);
            rlh0Var.a.g1(new xu7((Object) rlh0Var, i, (byte) 7));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // p.eh70
    public final void a(int i, PendingIntent pendingIntent) {
        B0(new ulh0(i, pendingIntent));
    }

    @Override // p.eh70
    public final void b(int i) {
        B0(new swg0((byte) 9));
    }

    @Override // p.eh70
    public final void c(int i, int i2, int i3) {
        B0(new ko00((byte) 2, i2, i3));
    }

    @Override // p.eh70
    public final void e(int i, List list) {
        if (list == null || this.l == -1) {
            return;
        }
        try {
            v280 v280VarM = b380.m();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Bundle bundle = (Bundle) list.get(i2);
                bundle.getClass();
                v280VarM.c(udh.h(this.l, bundle));
            }
            B0(new mp5(i, v280VarM.g(), (byte) 4));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for CommandButton", e);
        }
    }

    @Override // p.eh70
    public final void k0(int i, Bundle bundle) {
        try {
            ke61.a(bundle);
            B0(new swg0((byte) 8));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for SessionError", e);
        }
    }

    @Override // p.eh70
    public final void o0(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            B0(new slh0(m8u0.b(bundle)));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for Commands", e);
        }
    }

    @Override // p.eh70
    public final void onDisconnected() {
        B0(new swg0((byte) 10));
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("androidx.media3.session.IMediaController");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.media3.session.IMediaController");
            return true;
        }
        if (i == 4001) {
            q0(parcel.readInt(), parcel.readInt(), (Bundle) ryo1.y(parcel, Bundle.CREATOR), parcel.readString());
            return true;
        }
        if (i == 4002) {
            Q0(parcel.readInt(), parcel.readInt(), (Bundle) ryo1.y(parcel, Bundle.CREATOR), parcel.readString());
            return true;
        }
        switch (i) {
            case 3001:
                u(parcel.readInt(), (Bundle) ryo1.y(parcel, Bundle.CREATOR));
                return true;
            case 3002:
                W(parcel.readInt(), (Bundle) ryo1.y(parcel, Bundle.CREATOR));
                return true;
            case 3003:
                L(parcel.readInt(), (Bundle) ryo1.y(parcel, Bundle.CREATOR));
                return true;
            case 3004:
                e(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 3005:
                int i3 = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                r0(i3, (Bundle) ryo1.y(parcel, creator), (Bundle) ryo1.y(parcel, creator));
                return true;
            case 3006:
                parcel.readInt();
                onDisconnected();
                return true;
            case 3007:
                Q((Bundle) ryo1.y(parcel, Bundle.CREATOR), parcel.readInt(), parcel.readInt() != 0);
                return true;
            case 3008:
                p0(parcel.readInt(), (Bundle) ryo1.y(parcel, Bundle.CREATOR));
                return true;
            case 3009:
                o0(parcel.readInt(), (Bundle) ryo1.y(parcel, Bundle.CREATOR));
                return true;
            case 3010:
                int i4 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                x0(i4, (Bundle) ryo1.y(parcel, creator2), (Bundle) ryo1.y(parcel, creator2));
                return true;
            case 3011:
                b(parcel.readInt());
                return true;
            case 3012:
                T0(parcel.readInt(), (Bundle) ryo1.y(parcel, Bundle.CREATOR));
                return true;
            case 3013:
                int i5 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                s0(i5, (Bundle) ryo1.y(parcel, creator3), (Bundle) ryo1.y(parcel, creator3));
                return true;
            case 3014:
                a(parcel.readInt(), (PendingIntent) ryo1.y(parcel, PendingIntent.CREATOR));
                return true;
            case 3015:
                k0(parcel.readInt(), (Bundle) ryo1.y(parcel, Bundle.CREATOR));
                return true;
            case 3016:
                G(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 3017:
                int i6 = parcel.readInt();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle = (Bundle) ryo1.y(parcel, creator4);
                Bundle bundle2 = (Bundle) ryo1.y(parcel, creator4);
                Bundle bundle3 = (Bundle) ryo1.y(parcel, creator4);
                if (bundle == null || bundle2 == null) {
                    oon1.H("Ignoring custom command progress update with null args.");
                } else {
                    try {
                        B0(new nfr(i6, pa61.a(bundle), bundle2, bundle3));
                    } catch (RuntimeException e) {
                        oon1.I("Ignoring malformed Bundle for SessionCommand", e);
                    }
                }
                return true;
            case 3018:
                c(parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // p.eh70
    public final void p0(int i, Bundle bundle) {
        int i2;
        if (bundle == null || (i2 = this.l) == -1) {
            return;
        }
        try {
            B0(new c8d0(xg61.b(i2, bundle), (byte) 16));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for SessionPositionInfo", e);
        }
    }

    @Override // p.eh70
    public final void q0(int i, int i2, Bundle bundle, String str) {
        if (TextUtils.isEmpty(str)) {
            oon1.H("onChildrenChanged(): Ignoring empty parentId");
            return;
        }
        if (i2 < 0) {
            td6.p(i2, "onChildrenChanged(): Ignoring negative itemCount: ");
            return;
        }
        if (bundle != null) {
            try {
                iph0.a(bundle);
            } catch (RuntimeException e) {
                oon1.I("Ignoring malformed Bundle for LibraryParams", e);
                return;
            }
        }
        B0(new swg0((byte) 11));
    }

    @Override // p.eh70
    public final void r0(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            oon1.H("Ignoring custom command with null args.");
            return;
        }
        try {
            B0(new mp5(i, pa61.a(bundle), bundle2));
        } catch (RuntimeException e) {
            oon1.I("Ignoring malformed Bundle for SessionCommand", e);
        }
    }

    @Override // p.eh70
    public final void s0(int i, Bundle bundle, Bundle bundle2) {
        int i2;
        if (bundle == null || bundle2 == null || (i2 = this.l) == -1) {
            return;
        }
        try {
            try {
                B0(new x8a0((Object) jbu0.q(i2, bundle), (Object) new ebu0(bundle2.getBoolean(ebu0.d, false), bundle2.getBoolean(ebu0.e, false)), (byte) 9));
            } catch (RuntimeException e) {
                oon1.I("Ignoring malformed Bundle for BundlingExclusions", e);
            }
        } catch (RuntimeException e2) {
            oon1.I("Ignoring malformed Bundle for PlayerInfo", e2);
        }
    }

    @Override // p.eh70
    public final void u(int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            xal xalVarA = xal.a(bundle);
            this.l = xalVarA.b;
            B0(new c8d0(xalVarA, (byte) 15));
        } catch (RuntimeException e) {
            oon1.I("Malformed Bundle for ConnectionResult. Disconnected from the session.", e);
            onDisconnected();
        }
    }

    @Override // p.eh70
    public final void x0(int i, Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        try {
            try {
                B0(new tlh0(qa61.b(bundle), m8u0.b(bundle2)));
            } catch (RuntimeException e) {
                oon1.I("Ignoring malformed Bundle for Commands", e);
            }
        } catch (RuntimeException e2) {
            oon1.I("Ignoring malformed Bundle for SessionCommands", e2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
