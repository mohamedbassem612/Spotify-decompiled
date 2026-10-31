package p;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ukh0 extends Binder implements gh70 {
    public final WeakReference a;

    /* JADX WARN: Multi-variable type inference failed */
    public ukh0() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(null);
    }

    public static gh70 s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        gh70 gh70VarQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
        if (gh70VarQueryLocalInterface != null && (gh70VarQueryLocalInterface instanceof gh70)) {
            return gh70VarQueryLocalInterface;
        }
        fh70 fh70Var = new fh70();
        fh70Var.a = iBinder;
        return fh70Var;
    }

    public final void W0(PlaybackStateCompat playbackStateCompat) {
        if (this.a.get() == null) {
            return;
        }
        bhn0.d();
    }

    public final void onRepeatModeChanged(int i) {
        if (this.a.get() == null) {
            return;
        }
        bhn0.d();
    }

    public final void onShuffleModeChanged(int i) {
        if (this.a.get() == null) {
            return;
        }
        bhn0.d();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                if (this.a.get() != null) {
                    bhn0.d();
                    return false;
                }
                return true;
            case 2:
                hhg1.c();
                return false;
            case 3:
                W0((PlaybackStateCompat) syo1.C(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                hhg1.c();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
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
                onRepeatModeChanged(parcel.readInt());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.a.get() != null) {
                    bhn0.d();
                    return false;
                }
                return true;
            case 12:
                onShuffleModeChanged(parcel.readInt());
                return true;
            case 13:
                if (this.a.get() != null) {
                    bhn0.d();
                    return false;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    public final IBinder asBinder() {
        return this;
    }
}
