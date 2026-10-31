package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fzc0 implements Parcelable {
    public static final Parcelable.Creator<fzc0> CREATOR = new rqc0((byte) 28);
    public final Intent a;
    public final String b;
    public final ezc0 c;

    public fzc0(Intent intent, String str, ezc0 ezc0Var) {
        this.a = intent;
        this.b = str;
        this.c = ezc0Var;
    }

    public static fzc0 a(fzc0 fzc0Var, String str, ezc0 ezc0Var, int i) {
        Intent intent = fzc0Var.a;
        if ((i & 2) != 0) {
            str = fzc0Var.b;
        }
        if ((i & 4) != 0) {
            ezc0Var = fzc0Var.c;
        }
        return new fzc0(intent, str, ezc0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzc0)) {
            return false;
        }
        fzc0 fzc0Var = (fzc0) obj;
        return u890.j(this.a, fzc0Var.a) && u890.j(this.b, fzc0Var.b) && u890.j(this.c, fzc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ fzc0(String str, Intent intent) {
        this(intent, str, azc0.a);
    }
}
