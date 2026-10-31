package p;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h3e extends u9 {
    public final String a;
    public final String b;
    public final jpn1 c;
    public final vro0 d;
    public final boolean e;
    public final boolean f;
    public static final pue0 g = new pue0("CastMediaOptions", null);
    public static final Parcelable.Creator<h3e> CREATOR = new e9n1((byte) 13);

    public h3e(String str, String str2, IBinder iBinder, vro0 vro0Var, boolean z, boolean z2) {
        jpn1 jpn1Var;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            jpn1Var = null;
        } else {
            jpn1 jpn1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            jpn1Var = jpn1VarQueryLocalInterface instanceof jpn1 ? jpn1VarQueryLocalInterface : new jpn1(iBinder);
        }
        this.c = jpn1Var;
        this.d = vro0Var;
        this.e = z;
        this.f = z2;
    }

    public final void j() {
        jpn1 jpn1Var = this.c;
        if (jpn1Var != null) {
            try {
                pze0.m(qfp0.c1(jpn1Var.g1()));
            } catch (RemoteException unused) {
                g.b("Unable to call %s on %s.", "getWrappedClientObject", jpn1.class.getSimpleName());
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        jpn1 jpn1Var = this.c;
        j541.y(parcel, 4, jpn1Var == null ? null : jpn1Var.asBinder());
        j541.E(parcel, 5, this.d, i);
        j541.s(parcel, 6, this.e);
        j541.s(parcel, 7, this.f);
        j541.n(iJ, parcel);
    }
}
