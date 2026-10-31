package p;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vp40 extends u9 {
    public static final Parcelable.Creator<vp40> CREATOR = new hmo1((byte) 10);
    public static final Scope[] O0 = new Scope[0];
    public static final pl10[] P0 = new pl10[0];
    public final String N0;
    public final boolean X;
    public final int Y;
    public boolean Z;
    public final int a;
    public final int b;
    public final int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public pl10[] i;
    public pl10[] t;

    public vp40(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, pl10[] pl10VarArr, pl10[] pl10VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? O0 : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        pl10[] pl10VarArr3 = P0;
        pl10VarArr = pl10VarArr == null ? pl10VarArr3 : pl10VarArr;
        pl10VarArr2 = pl10VarArr2 == null ? pl10VarArr3 : pl10VarArr2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str)) {
            this.d = "com.google.android.gms";
        } else {
            this.d = str;
        }
        if (i < 2) {
            this.h = iBinder != null ? ok.c1(ok.b1(iBinder)) : null;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = pl10VarArr;
        this.t = pl10VarArr2;
        this.X = z;
        this.Y = i4;
        this.Z = z2;
        this.N0 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        hmo1.a(this, parcel, i);
    }
}
