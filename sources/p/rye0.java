package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rye0 implements Parcelable {
    public static final Parcelable.Creator<rye0> CREATOR = new rwe0((byte) 6);
    public final int N0;
    public boolean O0;
    public boolean P0;
    public final String Q0;
    public final String R0;
    public final String S0;
    public final int T0;
    public final String X;
    public String Y;
    public boolean Z;
    public final int a;
    public Set b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public boolean h;
    public final String i;
    public final String t;

    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x011f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0130  */
    /* JADX WARN: Code duplicated, block: B:67:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x013b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0168  */
    /* JADX WARN: Code duplicated, block: B:78:0x0170  */
    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    /* JADX WARN: Code duplicated, block: B:82:0x017b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0186  */
    public rye0(Parcel parcel) {
        int i;
        String string;
        boolean z;
        boolean z2;
        String string2;
        int i2;
        boolean z3;
        boolean z4;
        String string3;
        String string4 = parcel.readString();
        w0h1.D(string4, "loginBehavior");
        int i3 = 4;
        int i4 = 2;
        int i5 = 0;
        if (string4 != null) {
            if (string4.equals("NATIVE_WITH_FALLBACK")) {
                i = 1;
            } else if (string4.equals("NATIVE_ONLY")) {
                i = 2;
            } else if (string4.equals("KATANA_ONLY")) {
                i = 3;
            } else if (string4.equals("WEB_ONLY")) {
                i = 4;
            } else if (string4.equals("DIALOG_ONLY")) {
                i = 5;
            } else if (string4.equals("DEVICE_AUTH")) {
                i = 6;
            } else {
                hhg1.n("No enum constant com.facebook.login.LoginBehavior.".concat(string4));
            }
            this.a = i;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.b = new HashSet(arrayList);
            string = parcel.readString();
            if (string == null) {
                i3 = 1;
            } else {
                if (string != null) {
                    bhn0.i("Name is null");
                } else if (string.equals("NONE")) {
                    i3 = 1;
                } else if (string.equals("ONLY_ME")) {
                    i3 = 2;
                } else if (string.equals("FRIENDS")) {
                    i3 = 3;
                } else if (!string.equals("EVERYONE")) {
                    hhg1.n("No enum constant com.facebook.login.DefaultAudience.".concat(string));
                }
                i3 = 0;
            }
            this.c = i3;
            String string5 = parcel.readString();
            w0h1.D(string5, "applicationId");
            this.d = string5;
            this.e = parcel.readString();
            this.f = parcel.readString();
            String string6 = parcel.readString();
            w0h1.D(string6, "authId");
            this.g = string6;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.h = z;
            this.i = parcel.readString();
            String string7 = parcel.readString();
            w0h1.D(string7, "authType");
            this.t = string7;
            this.X = parcel.readString();
            this.Y = parcel.readString();
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.Z = z2;
            string2 = parcel.readString();
            if (string2 == null) {
                i2 = 1;
            } else {
                if (string2 != null) {
                    bhn0.i("Name is null");
                } else if (string2.equals("FACEBOOK")) {
                    i2 = 1;
                } else if (string2.equals("INSTAGRAM")) {
                    i2 = 2;
                } else {
                    hhg1.n("No enum constant com.facebook.login.LoginTargetApp.".concat(string2));
                }
                i2 = 0;
            }
            this.N0 = i2;
            if (parcel.readByte() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.O0 = z3;
            if (parcel.readByte() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.P0 = z4;
            String string8 = parcel.readString();
            w0h1.D(string8, "nonce");
            this.Q0 = string8;
            this.R0 = parcel.readString();
            this.S0 = parcel.readString();
            string3 = parcel.readString();
            if (string3 != null) {
                if (string3 != null) {
                    if (string3.equals("S256")) {
                        i4 = 1;
                    } else if (!string3.equals("PLAIN")) {
                        hhg1.n("No enum constant com.facebook.login.CodeChallengeMethod.".concat(string3));
                    }
                    i5 = i4;
                } else {
                    bhn0.i("Name is null");
                }
                i4 = 0;
                i5 = i4;
            }
            this.T0 = i5;
        }
        bhn0.i("Name is null");
        i = 0;
        this.a = i;
        ArrayList arrayList2 = new ArrayList();
        parcel.readStringList(arrayList2);
        this.b = new HashSet(arrayList2);
        string = parcel.readString();
        if (string == null) {
            i3 = 1;
        } else {
            if (string != null) {
                bhn0.i("Name is null");
            } else if (string.equals("NONE")) {
                i3 = 1;
            } else if (string.equals("ONLY_ME")) {
                i3 = 2;
            } else if (string.equals("FRIENDS")) {
                i3 = 3;
            } else if (!string.equals("EVERYONE")) {
                hhg1.n("No enum constant com.facebook.login.DefaultAudience.".concat(string));
            }
            i3 = 0;
        }
        this.c = i3;
        String string9 = parcel.readString();
        w0h1.D(string9, "applicationId");
        this.d = string9;
        this.e = parcel.readString();
        this.f = parcel.readString();
        String string10 = parcel.readString();
        w0h1.D(string10, "authId");
        this.g = string10;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        this.i = parcel.readString();
        String string11 = parcel.readString();
        w0h1.D(string11, "authType");
        this.t = string11;
        this.X = parcel.readString();
        this.Y = parcel.readString();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.Z = z2;
        string2 = parcel.readString();
        if (string2 == null) {
            i2 = 1;
        } else {
            if (string2 != null) {
                bhn0.i("Name is null");
            } else if (string2.equals("FACEBOOK")) {
                i2 = 1;
            } else if (string2.equals("INSTAGRAM")) {
                i2 = 2;
            } else {
                hhg1.n("No enum constant com.facebook.login.LoginTargetApp.".concat(string2));
            }
            i2 = 0;
        }
        this.N0 = i2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.O0 = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.P0 = z4;
        String string12 = parcel.readString();
        w0h1.D(string12, "nonce");
        this.Q0 = string12;
        this.R0 = parcel.readString();
        this.S0 = parcel.readString();
        string3 = parcel.readString();
        if (string3 != null) {
            if (string3 != null) {
                if (string3.equals("S256")) {
                    i4 = 1;
                } else if (!string3.equals("PLAIN")) {
                    hhg1.n("No enum constant com.facebook.login.CodeChallengeMethod.".concat(string3));
                }
                i5 = i4;
            } else {
                bhn0.i("Name is null");
            }
            i4 = 0;
            i5 = i4;
        }
        this.T0 = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(g5d0.s(this.a));
        parcel.writeStringList(new ArrayList(this.b));
        parcel.writeString(eqq.w(this.c));
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
        int i2 = this.N0;
        if (i2 == 1) {
            str = "FACEBOOK";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "INSTAGRAM";
        }
        parcel.writeString(str);
        parcel.writeByte(this.O0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.P0 ? (byte) 1 : (byte) 0);
        parcel.writeString(this.Q0);
        parcel.writeString(this.R0);
        parcel.writeString(this.S0);
        int i3 = this.T0;
        parcel.writeString(i3 != 0 ? ktd.u(i3) : null);
    }

    public rye0(Set set, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7) {
        this.a = 1;
        this.b = set;
        this.c = 3;
        this.t = "rerequest";
        this.d = str;
        this.e = str6;
        this.f = str7;
        this.g = str2;
        this.N0 = 1;
        if (str3.length() == 0) {
            this.Q0 = UUID.randomUUID().toString();
        } else {
            this.Q0 = str3;
        }
        this.R0 = str4;
        this.S0 = str5;
        this.T0 = i;
    }
}
