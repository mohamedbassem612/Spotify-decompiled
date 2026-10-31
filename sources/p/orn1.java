package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class orn1 extends u9 {
    public static final Parcelable.Creator<orn1> CREATOR = new jrn1(2);
    public final ntn1 a;
    public final int b;
    public final int c;
    public final int d;

    public orn1(ntn1 ntn1Var, int i, int i2, int i3) {
        this.a = ntn1Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void j(lfe lfeVar) {
        ntn1 ntn1Var = this.a;
        int i = this.b;
        if (i == 1) {
            lfeVar.d(ntn1Var);
            return;
        }
        if (i == 2) {
            lfeVar.e(ntn1Var);
            return;
        }
        if (i == 3) {
            lfeVar.a(ntn1Var);
        } else if (i != 4) {
            new StringBuilder(String.valueOf(i).length() + 14);
        } else {
            lfeVar.c(ntn1Var);
        }
    }

    public final String toString() {
        String string;
        String string2;
        String strValueOf = String.valueOf(this.a);
        int i = this.b;
        if (i == 1) {
            string = "CHANNEL_OPENED";
        } else if (i == 2) {
            string = "CHANNEL_CLOSED";
        } else if (i != 3) {
            string = i != 4 ? Integer.toString(i) : "OUTPUT_CLOSED";
        } else {
            string = "INPUT_CLOSED";
        }
        int i2 = this.c;
        if (i2 == 0) {
            string2 = "CLOSE_REASON_NORMAL";
        } else if (i2 == 1) {
            string2 = "CLOSE_REASON_DISCONNECTED";
        } else if (i2 != 2) {
            string2 = i2 != 3 ? Integer.toString(i2) : "CLOSE_REASON_LOCAL_CLOSE";
        } else {
            string2 = "CLOSE_REASON_REMOTE_CLOSE";
        }
        int length = String.valueOf(string2).length() + String.valueOf(string).length() + strValueOf.length() + 40 + 14;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + length + 15 + 1);
        bb00.j(sb, "ChannelEventParcelable[, channel=", strValueOf, ", type=", string);
        sb.append(", closeReason=");
        sb.append(string2);
        sb.append(", appErrorCode=");
        sb.append(i3);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 2, this.a, i);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.c);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.d);
        j541.M(iL, parcel);
    }
}
