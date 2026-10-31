package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fes extends View.BaseSavedState {
    public static final Parcelable.Creator<fes> CREATOR = new aw91((byte) 5);
    public l6s a;
    public Bundle b;

    public fes(Parcel parcel, ClassLoader classLoader) {
        l6s l6sVar;
        super(parcel);
        if (parcel.readInt() != 0) {
            SparseArray sparseArray = parcel.readSparseArray(classLoader);
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) ((Parcelable) parcel.readTypedObject(creator));
            Bundle bundle2 = (Bundle) ((Parcelable) parcel.readTypedObject(creator));
            if (sparseArray != null) {
                if (bundle != null) {
                    bundle.setClassLoader(classLoader);
                }
                if (bundle2 != null) {
                    bundle2.setClassLoader(classLoader);
                }
                l6sVar = new l6s(sparseArray, bundle, bundle2);
            } else {
                l6sVar = null;
            }
            this.a = l6sVar;
        }
        Bundle bundle3 = (Bundle) ((Parcelable) parcel.readTypedObject(Bundle.CREATOR));
        this.b = bundle3;
        if (bundle3 != null) {
            bundle3.setClassLoader(classLoader);
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        if (this.a != null) {
            parcel.writeInt(1);
            l6s l6sVar = this.a;
            parcel.writeSparseArray((SparseArray) l6sVar.a);
            parcel.writeTypedObject((Bundle) l6sVar.b, 0);
            parcel.writeTypedObject((Bundle) l6sVar.c, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeTypedObject(this.b, 0);
    }

    public fes(Parcelable parcelable) {
        super(parcelable);
    }
}
