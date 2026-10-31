package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cvn1 extends mh70 {
    public final AtomicReference l;
    public boolean m;

    public cvn1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver", (byte) 11);
        this.l = new AtomicReference();
    }

    public static final Object e1(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        return cls.cast(obj);
    }

    public final void D0(Bundle bundle) {
        AtomicReference atomicReference = this.l;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.m = true;
                    this.l.notify();
                } catch (Throwable th) {
                    this.l.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i2 = drn1.a;
        Parcelable parcelable = parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel);
        drn1.c(parcel);
        D0((Bundle) parcelable);
        parcel2.writeNoException();
        return true;
    }

    public final String b1(long j) {
        return (String) e1(d1(j), String.class);
    }

    public final Long c1() {
        return (Long) e1(d1(500L), Long.class);
    }

    public final Bundle d1(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.l;
        synchronized (atomicReference) {
            if (!this.m) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.l.get();
        }
        return bundle;
    }
}
