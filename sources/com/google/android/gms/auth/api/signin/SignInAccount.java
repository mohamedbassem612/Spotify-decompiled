package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p.e9n1;
import p.j541;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class SignInAccount extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new e9n1((byte) 7);
    public String a;
    public GoogleSignInAccount b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 4, this.a);
        j541.E(parcel, 7, this.b, i);
        j541.F(parcel, 8, this.c);
        j541.M(iL, parcel);
    }
}
