package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hh70 implements kh70 {
    public IBinder a;

    @Override // p.kh70
    public final void B(eh70 eh70Var, int i, Surface surface, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, surface);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.a.transact(3061, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void C(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3041, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void C0(eh70 eh70Var, int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            tyo1.t(parcelObtain, bundle);
            this.a.transact(3030, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void D(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3004, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void E(eh70 eh70Var, int i, int i2, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeStrongBinder(iBinder);
            this.a.transact(3032, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void E0(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3024, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void F(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3040, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void F0(eh70 eh70Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.a.transact(3019, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void G0(eh70 eh70Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.a.transact(3020, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void H0(eh70 eh70Var, int i, IBinder iBinder, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(1);
            this.a.transact(3011, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void I(eh70 eh70Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            this.a.transact(3033, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void J(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3046, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void J0(eh70 eh70Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(3018, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void K(eh70 eh70Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            this.a.transact(3048, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void K0(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3005, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void L0(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3026, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void M(eh70 eh70Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            this.a.transact(3027, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void M0(eh70 eh70Var, int i, IBinder iBinder, int i2, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            this.a.transact(3012, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void N(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3043, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void O(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3059, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void P(eh70 eh70Var, int i, int i2, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeLong(j);
            this.a.transact(3039, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void P0(eh70 eh70Var, int i, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeStrongBinder(iBinder);
            this.a.transact(3031, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void R0(eh70 eh70Var, int i, Bundle bundle, Bundle bundle2, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            tyo1.t(parcelObtain, bundle2);
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(3060, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void S0(eh70 eh70Var, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.a.transact(3028, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void U(eh70 eh70Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(3013, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void U0(eh70 eh70Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            this.a.transact(3014, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void V0(eh70 eh70Var, int i, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeLong(j);
            this.a.transact(3038, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void X(eh70 eh70Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.a.transact(3037, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void a0(eh70 eh70Var, int i, int i2, int i3, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeStrongBinder(iBinder);
            this.a.transact(3056, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // p.kh70
    public final void b0(eh70 eh70Var, int i, int i2, int i3, int i4) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            parcelObtain.writeInt(i4);
            this.a.transact(3023, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void c0(eh70 eh70Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            this.a.transact(3015, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void d(eh70 eh70Var, int i, float f) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeFloat(f);
            this.a.transact(3002, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void d0(eh70 eh70Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.a.transact(3017, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void e0(eh70 eh70Var, int i, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(3006, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void f(eh70 eh70Var, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            parcelObtain.writeInt(z ? 1 : 0);
            this.a.transact(3057, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void g(eh70 eh70Var, int i, Bundle bundle, long j) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            parcelObtain.writeLong(j);
            this.a.transact(3008, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void g0(eh70 eh70Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.a.transact(3053, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void h(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3021, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void i(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3035, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void i0(eh70 eh70Var, int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            tyo1.t(parcelObtain, bundle2);
            this.a.transact(3016, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void j(eh70 eh70Var, int i, boolean z, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(i2);
            this.a.transact(3054, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void j0(eh70 eh70Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.a.transact(3052, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void k(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3036, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void l(eh70 eh70Var, int i, int i2, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            tyo1.t(parcelObtain, bundle);
            this.a.transact(3055, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void m(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3042, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void n(eh70 eh70Var, int i, int i2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            this.a.transact(3003, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void n0(eh70 eh70Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.a.transact(3051, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void p(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3025, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void q(eh70 eh70Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.a.transact(3022, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void r(eh70 eh70Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            this.a.transact(3045, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void u0(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3034, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void v(eh70 eh70Var, int i, Bundle bundle, boolean z) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            parcelObtain.writeInt(1);
            this.a.transact(3009, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void w(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3058, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void w0(eh70 eh70Var, int i, Surface surface) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, surface);
            this.a.transact(3044, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void y(eh70 eh70Var, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            this.a.transact(3047, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void y0(eh70 eh70Var, int i, int i2, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            parcelObtain.writeInt(i2);
            parcelObtain.writeInt(i3);
            this.a.transact(3062, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p.kh70
    public final void z(eh70 eh70Var, int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
            parcelObtain.writeStrongInterface(eh70Var);
            parcelObtain.writeInt(i);
            tyo1.t(parcelObtain, bundle);
            this.a.transact(3007, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
