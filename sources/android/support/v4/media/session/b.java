package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.concurrent.atomic.AtomicReference;
import p.eyh0;
import p.f0i0;
import p.gh70;
import p.hhg1;
import p.lh70;
import p.ukh0;
import p.vyo1;
import p.yxh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b extends Binder implements lh70 {
    public static final /* synthetic */ int l = 0;
    public final AtomicReference a;

    public b(yxh0 yxh0Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(yxh0Var);
    }

    @Override // p.lh70
    public final PlaybackStateCompat getPlaybackState() {
        yxh0 yxh0Var = (yxh0) this.a.get();
        if (yxh0Var != null) {
            return eyh0.j(yxh0Var.g, yxh0Var.i);
        }
        return null;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                hhg1.c();
                return false;
            case 2:
                hhg1.c();
                return false;
            case 3:
                gh70 gh70VarS = ukh0.s(parcel.readStrongBinder());
                yxh0 yxh0Var = (yxh0) this.a.get();
                if (yxh0Var != null) {
                    yxh0Var.f.register(gh70VarS, new f0i0("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                    synchronized (yxh0Var.d) {
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                gh70 gh70VarS2 = ukh0.s(parcel.readStrongBinder());
                yxh0 yxh0Var2 = (yxh0) this.a.get();
                if (yxh0Var2 != null) {
                    yxh0Var2.f.unregister(gh70VarS2);
                    Binder.getCallingPid();
                    Binder.getCallingUid();
                    synchronized (yxh0Var2.d) {
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 5:
                hhg1.c();
                return false;
            case 6:
                hhg1.c();
                return false;
            case 7:
                hhg1.c();
                return false;
            case 8:
                hhg1.c();
                return false;
            case 9:
                hhg1.c();
                return false;
            case 10:
                hhg1.c();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                hhg1.c();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                hhg1.c();
                return false;
            case 13:
                hhg1.c();
                return false;
            case 14:
                parcel.readString();
                hhg1.c();
                return false;
            case 15:
                parcel.readString();
                hhg1.c();
                return false;
            case 16:
                hhg1.c();
                return false;
            case 17:
                parcel.readLong();
                hhg1.c();
                return false;
            case 18:
                hhg1.c();
                return false;
            case 19:
                hhg1.c();
                return false;
            case 20:
                hhg1.c();
                return false;
            case 21:
                hhg1.c();
                return false;
            case 22:
                hhg1.c();
                return false;
            case 23:
                hhg1.c();
                return false;
            case 24:
                parcel.readLong();
                hhg1.c();
                return false;
            case 25:
                hhg1.c();
                return false;
            case 26:
                parcel.readString();
                hhg1.c();
                return false;
            case 27:
                hhg1.c();
                return false;
            case 28:
                PlaybackStateCompat playbackState = getPlaybackState();
                parcel2.writeNoException();
                vyo1.E(parcel2, playbackState);
                return true;
            case 29:
                parcel2.writeNoException();
                vyo1.D(parcel2);
                return true;
            case 30:
                hhg1.c();
                return false;
            case 31:
                hhg1.c();
                return false;
            case 32:
                yxh0 yxh0Var3 = (yxh0) this.a.get();
                byte b = yxh0Var3 != null ? yxh0Var3.j : (byte) 0;
                parcel2.writeNoException();
                parcel2.writeInt(b);
                return true;
            case 33:
                hhg1.c();
                return false;
            case 34:
                parcel.readString();
                hhg1.c();
                return false;
            case 35:
                parcel.readString();
                hhg1.c();
                return false;
            case 36:
                hhg1.c();
                return false;
            case 37:
                yxh0 yxh0Var4 = (yxh0) this.a.get();
                i3 = yxh0Var4 != null ? yxh0Var4.k : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.readInt();
                hhg1.c();
                return false;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                hhg1.c();
                return false;
            case 42:
                parcel.readInt();
                hhg1.c();
                return false;
            case 43:
                hhg1.c();
                return false;
            case 44:
                parcel.readInt();
                hhg1.c();
                return false;
            case 45:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                parcel.readInt();
                hhg1.c();
                return false;
            case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                yxh0 yxh0Var5 = (yxh0) this.a.get();
                i3 = yxh0Var5 != null ? yxh0Var5.l : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                parcel.readInt();
                hhg1.c();
                return false;
            case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                parcel.readFloat();
                hhg1.c();
                return false;
            case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                yxh0 yxh0Var6 = (yxh0) this.a.get();
                Bundle bundle = yxh0Var6.e == null ? null : new Bundle(yxh0Var6.e);
                parcel2.writeNoException();
                vyo1.E(parcel2, bundle);
                return true;
            case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                hhg1.c();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
