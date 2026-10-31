package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sye0 implements Parcelable {
    public static final Parcelable.Creator<sye0> CREATOR = new rwe0((byte) 7);
    public final int a;
    public final xd b;
    public final rl8 c;
    public final String d;
    public final String e;
    public final rye0 f;
    public Map g;
    public HashMap h;

    public sye0(Parcel parcel) {
        String string = parcel.readString();
        string = string == null ? "error" : string;
        int i = 0;
        if (string == null) {
            bhn0.i("Name is null");
        } else if (string.equals("SUCCESS")) {
            i = 1;
        } else if (string.equals("CANCEL")) {
            i = 2;
        } else if (string.equals("ERROR")) {
            i = 3;
        } else {
            hhg1.n("No enum constant com.facebook.login.LoginClient.Result.Code.".concat(string));
        }
        this.a = i;
        this.b = parcel.readParcelable(xd.class.getClassLoader());
        this.c = (rl8) parcel.readParcelable(rl8.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = (rye0) parcel.readParcelable(rye0.class.getClassLoader());
        this.g = fpi1.G(parcel);
        this.h = fpi1.G(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "SUCCESS";
        } else if (i2 == 2) {
            str = "CANCEL";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "ERROR";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        fpi1.S(parcel, this.g);
        fpi1.S(parcel, this.h);
    }

    public sye0(rye0 rye0Var, int i, xd xdVar, rl8 rl8Var, String str, String str2) {
        this.f = rye0Var;
        this.b = xdVar;
        this.c = rl8Var;
        this.d = str;
        this.a = i;
        this.e = str2;
    }
}
