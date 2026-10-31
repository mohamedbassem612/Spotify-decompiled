package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tcc implements Parcelable {
    public static final Parcelable.Creator<tcc> CREATOR = new scc((byte) 0);
    public final Bundle a;

    public tcc(Object obj) {
        ArrayMap arrayMap = ldc.a;
        String strI = ldc.i(obj.getClass());
        Log.isLoggable("CarApp.Bun", 3);
        this.a = ldc.p(obj, strI, new jdc(null, "", new ArrayDeque()));
    }

    public final Object a() {
        ArrayMap arrayMap = ldc.a;
        boolean zIsLoggable = Log.isLoggable("CarApp.Bun", 3);
        Bundle bundle = this.a;
        if (zIsLoggable) {
        }
        return ldc.f(bundle, new jdc(null, "", new ArrayDeque()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public tcc(Bundle bundle) {
        this.a = bundle;
    }
}
