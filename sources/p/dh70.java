package p;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dh70 implements eh70 {
    public IBinder a;

    @Override // p.eh70
    public final void G(int i, List list) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.E(parcelObtain, list);
            this.a.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void L(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            this.a.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void Q(Bundle bundle, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void Q0(int i, int i2, Bundle bundle, String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(Alert.DURATION_SHOW_INDEFINITELY);
            ryo1.F(parcelObtain, bundle);
            this.a.transact(4002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void T0(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            this.a.transact(3012, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void W(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            this.a.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void a(int i, PendingIntent pendingIntent) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, pendingIntent);
            this.a.transact(3014, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // p.eh70
    public final void b(int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            this.a.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void c(int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.a.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void e(int i, List list) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.E(parcelObtain, list);
            this.a.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void k0(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            this.a.transact(3015, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void o0(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            this.a.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void onDisconnected() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(0);
            this.a.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void p0(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            this.a.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void q0(int i, int i2, Bundle bundle, String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(Alert.DURATION_SHOW_INDEFINITELY);
            ryo1.F(parcelObtain, bundle);
            this.a.transact(4001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void r0(int i, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = Bundle.EMPTY;
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            ryo1.F(parcelObtain, bundle3);
            this.a.transact(3005, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void s0(int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            ryo1.F(parcelObtain, bundle2);
            this.a.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void u(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            this.a.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.eh70
    public final void x0(int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
            parcelObtain.writeInt(i);
            ryo1.F(parcelObtain, bundle);
            ryo1.F(parcelObtain, bundle2);
            this.a.transact(3010, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
