package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class grr0 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public /* synthetic */ grr0(byte b) {
        this.a = b;
    }

    public static hrr0 a(Parcel parcel, ClassLoader classLoader) {
        c4x0 c4x0Var;
        if (classLoader == null) {
            classLoader = grr0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            c4x0Var = f331.X0;
        } else if (i == 1) {
            c4x0Var = kcx0.R0;
        } else {
            if (i != 2) {
                eg.m(gvg.e(i, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            c4x0Var = c4x0.f;
        }
        return new hrr0(value, c4x0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return i5.b;
                }
                eg.m("superState must be null");
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new hrr0[i];
            default:
                return new i5[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return i5.b;
                }
                eg.m("superState must be null");
                return null;
        }
    }
}
