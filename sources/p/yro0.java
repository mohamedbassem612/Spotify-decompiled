package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yro0 implements Parcelable {
    public static final Parcelable.Creator<yro0> CREATOR = new b4o0((byte) 23);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    public yro0(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yro0)) {
            return false;
        }
        yro0 yro0Var = (yro0) obj;
        return u890.j(this.a, yro0Var.a) && u890.j(this.b, yro0Var.b) && u890.j(this.c, yro0Var.c) && u890.j(this.d, yro0Var.d) && this.e == yro0Var.e;
    }

    public final String g() {
        return this.c;
    }

    public final String getTitle() {
        return this.a;
    }

    public final int h() {
        return this.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        switch (this.e) {
            case 1:
                str = "CDP_ALBUM";
                break;
            case 2:
                str = "LE_EVENT";
                break;
            case 3:
                str = "LE_ARTIST_EVENTS";
                break;
            case 4:
                str = "NOTIFICATION_PREFERENCE_SETTINGS_TOGGLE";
                break;
            case 5:
                str = "AUDIOBOOK_PRERELEASE_PRESAVE_BUTTON";
                break;
            case 6:
                str = "NPV_PRERELEASE_PRESAVE_BUTTON";
                break;
            case 7:
                str = "MARQUEE_PRERELEASE_PRESAVE_BUTTON";
                break;
            case 8:
                str = "MESSAGING_NOTIFICATION_OPT_IN_NUDGE";
                break;
            case 9:
                str = "MUSIC_VIDEO_PRERELEASE_PRESAVE_BUTTON";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }
}
