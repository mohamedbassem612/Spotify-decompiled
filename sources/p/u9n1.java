package p;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u9n1 extends u9 {
    public static final Parcelable.Creator<u9n1> CREATOR = new e9n1((byte) 5);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public u9n1(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.E(parcel, 2, this.b, i);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c);
        j541.E(parcel, 4, this.d, i);
        j541.M(iL, parcel);
    }
}
