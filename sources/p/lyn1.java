package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lyn1 extends u9 {
    public static final Parcelable.Creator<lyn1> CREATOR = new jrn1((byte) 24);
    public final int a;
    public final String b;
    public final Intent c;

    public lyn1(int i, Intent intent, String str) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    public static lyn1 j(Activity activity) {
        return new lyn1(activity.hashCode(), activity.getIntent(), activity.getClass().getCanonicalName());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyn1)) {
            return false;
        }
        lyn1 lyn1Var = (lyn1) obj;
        return this.a == lyn1Var.a && Objects.equals(this.b, lyn1Var.b) && Objects.equals(this.c, lyn1Var.c);
    }

    public final int hashCode() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 1, this.a);
        j541.F(parcel, 2, this.b);
        j541.E(parcel, 3, this.c, i);
        j541.n(iJ, parcel);
    }
}
