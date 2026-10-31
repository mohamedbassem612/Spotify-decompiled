package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ckb0 extends u9 {
    public static final Parcelable.Creator<ckb0> CREATOR = new e9n1((byte) 29);
    public boolean a;
    public final String b;
    public boolean c;
    public final d6o d;

    public ckb0() {
        Locale locale = Locale.getDefault();
        Pattern pattern = o4e.a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        this(false, sb.toString(), false, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ckb0)) {
            return false;
        }
        ckb0 ckb0Var = (ckb0) obj;
        return this.a == ckb0Var.a && o4e.c(this.b, ckb0Var.b) && this.c == ckb0Var.c && o4e.c(this.d, ckb0Var.d);
    }

    public final int hashCode() {
        return k8p1.j(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder("LaunchOptions(relaunchIfRunning=");
        sb.append(z);
        sb.append(", language=");
        sb.append(this.b);
        sb.append(", androidReceiverCompatible: ");
        return l1d.r(sb, z2, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.s(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.s(parcel, 4, this.c);
        j541.E(parcel, 5, this.d, i);
        j541.n(iJ, parcel);
    }

    public ckb0(boolean z, String str, boolean z2, d6o d6oVar) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = d6oVar;
    }
}
