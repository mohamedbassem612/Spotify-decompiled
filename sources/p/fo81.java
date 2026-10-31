package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.login.signupapi.services.model.MarketingMessagesOption;
import com.spotify.login.signupapi.services.model.PrivacyPolicyAcceptance;
import com.spotify.login.signupapi.services.model.TermsConditionAcceptance;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fo81 implements Parcelable {
    public static final Parcelable.Creator<fo81> CREATOR = new ro71(22);
    public static final fo81 Q0 = new fo81(false, false, false, false, false, false, 0, false, null, null, null, false, false, null, 65535);
    public final boolean N0;
    public final boolean O0;
    public final String P0;
    public final TermsConditionAcceptance X;
    public final PrivacyPolicyAcceptance Y;
    public final MarketingMessagesOption Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final boolean t;

    public /* synthetic */ fo81(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, boolean z7, TermsConditionAcceptance termsConditionAcceptance, PrivacyPolicyAcceptance privacyPolicyAcceptance, MarketingMessagesOption marketingMessagesOption, boolean z8, boolean z9, String str, int i2) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, false, (i2 & 32) != 0 ? false : z5, (i2 & 64) != 0 ? false : z6, false, (i2 & 256) != 0 ? 13 : i, (i2 & 512) != 0 ? false : z7, (i2 & 1024) != 0 ? TermsConditionAcceptance.EXPLICIT : termsConditionAcceptance, (i2 & 2048) != 0 ? PrivacyPolicyAcceptance.EXPLICIT : privacyPolicyAcceptance, (i2 & 4096) != 0 ? MarketingMessagesOption.OPT_IN : marketingMessagesOption, (i2 & 8192) != 0 ? false : z8, (i2 & 16384) != 0 ? false : z9, (i2 & 32768) != 0 ? "" : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo81)) {
            return false;
        }
        fo81 fo81Var = (fo81) obj;
        return this.a == fo81Var.a && this.b == fo81Var.b && this.c == fo81Var.c && this.d == fo81Var.d && this.e == fo81Var.e && this.f == fo81Var.f && this.g == fo81Var.g && this.h == fo81Var.h && this.i == fo81Var.i && this.t == fo81Var.t && this.X == fo81Var.X && this.Y == fo81Var.Y && this.Z == fo81Var.Z && this.N0 == fo81Var.N0 && this.O0 == fo81Var.O0 && u890.j(this.P0, fo81Var.P0);
    }

    public final int hashCode() {
        return this.P0.hashCode() + xcg1.g(xcg1.g((this.Z.hashCode() + ((this.Y.hashCode() + ((this.X.hashCode() + xcg1.g(kaa0.f(this.i, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.t)) * 31)) * 31)) * 31, 31, this.N0), 31, this.O0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.X.name());
        parcel.writeString(this.Y.name());
        parcel.writeString(this.Z.name());
        parcel.writeInt(this.N0 ? 1 : 0);
        parcel.writeInt(this.O0 ? 1 : 0);
        parcel.writeString(this.P0);
    }

    public fo81(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, boolean z9, TermsConditionAcceptance termsConditionAcceptance, PrivacyPolicyAcceptance privacyPolicyAcceptance, MarketingMessagesOption marketingMessagesOption, boolean z10, boolean z11, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = i;
        this.t = z9;
        this.X = termsConditionAcceptance;
        this.Y = privacyPolicyAcceptance;
        this.Z = marketingMessagesOption;
        this.N0 = z10;
        this.O0 = z11;
        this.P0 = str;
    }
}
