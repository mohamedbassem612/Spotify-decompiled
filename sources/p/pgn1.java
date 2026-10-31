package p;

import android.os.Binder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pgn1 extends qdo1 {
    public final WeakReference l;
    public volatile int m = -1;

    public pgn1(SpotifyWearableListenerService spotifyWearableListenerService) {
        this.l = new WeakReference(spotifyWearableListenerService);
    }

    @Override // p.udo1
    public final boolean A(edo1 edo1Var) {
        udo1 ndo1Var;
        SpotifyWearableListenerService spotifyWearableListenerServiceB1 = b1("onGetService");
        if (spotifyWearableListenerServiceB1 == null) {
            return false;
        }
        if (Log.isLoggable("WearableLS", 3)) {
            Objects.toString(spotifyWearableListenerServiceB1.a);
        }
        if (!d1(spotifyWearableListenerServiceB1)) {
            return false;
        }
        try {
            hqo1 hqo1Var = new hqo1(spotifyWearableListenerServiceB1.getPackageName());
            mh70 mh70Var = spotifyWearableListenerServiceB1.c;
            if (mh70Var == null) {
                ndo1Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = mh70Var.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
                ndo1Var = iInterfaceQueryLocalInterface instanceof udo1 ? (udo1) iInterfaceQueryLocalInterface : new ndo1(mh70Var);
            }
            Parcel parcelA1 = edo1Var.a1();
            zsn1.b(parcelA1, hqo1Var);
            zsn1.c(parcelA1, ndo1Var);
            edo1Var.Z0(1, parcelA1);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // p.udo1
    public final void H(pgo1 pgo1Var, cdo1 cdo1Var) {
        if (c1(new sl21(this, cdo1Var, pgo1Var), "onRequestReceived", pgo1Var)) {
            return;
        }
        try {
            cdo1Var.g1(null, false);
        } catch (RemoteException unused) {
        }
    }

    @Override // p.udo1
    public final void I0(ArrayList arrayList) {
        c1(new sjj1(this, (Object) arrayList, (byte) 7), "onConnectedNodes", arrayList);
    }

    @Override // p.udo1
    public final void N0(rso1 rso1Var) {
        c1(new wcn1(this, rso1Var, (byte) 1), "onNotificationReceived", rso1Var);
    }

    @Override // p.udo1
    public final void O0(uio1 uio1Var) {
        sjj1 sjj1Var = new sjj1((Object) this, (Object) uio1Var, (byte) 8);
        DataHolder dataHolder = uio1Var.b;
        int i = dataHolder.h;
        if (c1(sjj1Var, "onNodeMigrated", fd21.h(new StringBuilder(String.valueOf(i).length() + 17), "DataHolder[rows=", i, "]"))) {
            return;
        }
        dataHolder.close();
    }

    @Override // p.udo1
    public final void R(okn1 okn1Var) {
        c1(new wcn1(this, okn1Var, (byte) 0), "onConnectedCapabilityChanged", okn1Var);
    }

    @Override // p.udo1
    public final void S(zio1 zio1Var) {
        c1(new wcn1(this, zio1Var, (byte) 5), "onPeerDisconnected", zio1Var);
    }

    @Override // p.udo1
    public final void T(DataHolder dataHolder) {
        sjj1 sjj1Var = new sjj1(this, (Object) dataHolder, (byte) 18);
        try {
            String strValueOf = String.valueOf(dataHolder);
            int i = dataHolder.h;
            StringBuilder sb = new StringBuilder(strValueOf.length() + 7 + String.valueOf(i).length());
            sb.append(strValueOf);
            sb.append(", rows=");
            sb.append(i);
            if (c1(sjj1Var, "onDataItemChanged", sb.toString())) {
                return;
            }
            dataHolder.close();
        } catch (Throwable th) {
            dataHolder.close();
            throw th;
        }
    }

    @Override // p.udo1
    public final void V(pgo1 pgo1Var) {
        c1(new wcn1(this, pgo1Var, (byte) 3), "onMessageReceived", pgo1Var);
    }

    @Override // p.udo1
    public final void Z(zio1 zio1Var) {
        c1(new wcn1(this, zio1Var, (byte) 4), "onPeerConnected", zio1Var);
    }

    public final SpotifyWearableListenerService b1(String str) {
        SpotifyWearableListenerService spotifyWearableListenerService = (SpotifyWearableListenerService) this.l.get();
        if (spotifyWearableListenerService != null || !Log.isLoggable("WearableLS", 3)) {
            return spotifyWearableListenerService;
        }
        str.concat(": service reference no longer valid");
        return null;
    }

    public final boolean c1(Runnable runnable, String str, Object obj) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("postEvent (");
        sb.append(str);
        sb.append(")");
        SpotifyWearableListenerService spotifyWearableListenerServiceB1 = b1(sb.toString());
        if (spotifyWearableListenerServiceB1 != null) {
            if (Log.isLoggable("WearableLS", 3)) {
                String.format("%s: %s %s", str, spotifyWearableListenerServiceB1.a, obj);
            }
            if (d1(spotifyWearableListenerServiceB1)) {
                synchronized (spotifyWearableListenerServiceB1.f) {
                    try {
                        if (spotifyWearableListenerServiceB1.g) {
                            return false;
                        }
                        spotifyWearableListenerServiceB1.b.post(runnable);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    public final boolean d1(SpotifyWearableListenerService spotifyWearableListenerService) {
        int callingUid = Binder.getCallingUid();
        if (callingUid == this.m) {
            return true;
        }
        if ((kro1.a(spotifyWearableListenerService).b() && l6o1.G(callingUid, spotifyWearableListenerService, "com.google.android.wearable.app.cn")) || l6o1.u(spotifyWearableListenerService, callingUid)) {
            this.m = callingUid;
            return true;
        }
        new StringBuilder(String.valueOf(callingUid).length() + 46);
        return false;
    }

    @Override // p.udo1
    public final void x(orn1 orn1Var) {
        c1(new mqh1(this, orn1Var, false, (byte) 10), "onChannelEvent", orn1Var);
    }

    @Override // p.udo1
    public final void z0(ylo1 ylo1Var) {
        c1(new wcn1(this, ylo1Var, (byte) 2), "onEntityUpdate", ylo1Var);
    }
}
