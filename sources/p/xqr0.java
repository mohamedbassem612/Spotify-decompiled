package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xqr0 implements Parcelable.Creator {
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0113  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:80:0x013d  */
    /* JADX WARN: Code duplicated, block: B:81:0x013f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0146  */
    /* JADX WARN: Code duplicated, block: B:85:0x0148  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x015c  */
    public static yqr0 a(Parcel parcel) {
        int i;
        String string;
        boolean z;
        boolean z2;
        String string2;
        kp90 kp90Var;
        String string3 = parcel.readString();
        string3.getClass();
        String string4 = parcel.readString();
        string4.getClass();
        String string5 = parcel.readString();
        string5.getClass();
        int i2 = 4;
        if (string5 != null) {
            if (string5.equals("UNKNOWN")) {
                i = 1;
            } else if (string5.equals("COMPUTER")) {
                i = 2;
            } else if (string5.equals("TABLET")) {
                i = 3;
            } else if (string5.equals("SMARTPHONE")) {
                i = 4;
            } else if (string5.equals("SPEAKER")) {
                i = 5;
            } else if (string5.equals("HEADPHONES")) {
                i = 6;
            } else if (string5.equals("TV")) {
                i = 7;
            } else if (string5.equals("AVR")) {
                i = 8;
            } else if (string5.equals("STB")) {
                i = 9;
            } else if (string5.equals("AUDIO_DONGLE")) {
                i = 10;
            } else if (string5.equals("GAME_CONSOLE")) {
                i = 11;
            } else if (string5.equals("CAST_VIDEO")) {
                i = 12;
            } else if (string5.equals("CAST_AUDIO")) {
                i = 13;
            } else if (string5.equals("AUTOMOBILE")) {
                i = 14;
            } else if (string5.equals("SMARTWATCH")) {
                i = 15;
            } else if (string5.equals("CHROMEBOOK")) {
                i = 16;
            } else if (string5.equals("UNKNOWN_SPOTIFY")) {
                i = 17;
            } else if (string5.equals("HOME_THING")) {
                i = 18;
            } else {
                hhg1.n("No enum constant com.spotify.jam.jam.Jam.PlaybackDeviceInfo.DeviceType.".concat(string5));
            }
            string = parcel.readString();
            string.getClass();
            if (string != null) {
                if (string.equals("BLUETOOTH")) {
                    i2 = 1;
                } else if (string.equals("AIRPLAY")) {
                    i2 = 2;
                } else if (string.equals("CAST")) {
                    i2 = 3;
                } else if (!string.equals("CONNECT")) {
                    hhg1.n("No enum constant com.spotify.jam.jam.Jam.PlaybackDeviceInfo.TechType.".concat(string));
                }
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readByte() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z3 = parcel.readByte() != 0;
                string2 = parcel.readString();
                if (string2 != null) {
                    kp90Var = new kp90(string2);
                } else {
                    kp90Var = null;
                }
                return new yqr0(new lp90(string3, string4, i, i2, z, new jp90(z2, z3, kp90Var)));
            }
            bhn0.i("Name is null");
            i2 = 0;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readByte() != 0) {
            }
            string2 = parcel.readString();
            if (string2 != null) {
                kp90Var = new kp90(string2);
            } else {
                kp90Var = null;
            }
            return new yqr0(new lp90(string3, string4, i, i2, z, new jp90(z2, z3, kp90Var)));
        }
        bhn0.i("Name is null");
        i = 0;
        string = parcel.readString();
        string.getClass();
        if (string != null) {
            if (string.equals("BLUETOOTH")) {
                i2 = 1;
            } else if (string.equals("AIRPLAY")) {
                i2 = 2;
            } else if (string.equals("CAST")) {
                i2 = 3;
            } else if (!string.equals("CONNECT")) {
                hhg1.n("No enum constant com.spotify.jam.jam.Jam.PlaybackDeviceInfo.TechType.".concat(string));
            }
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readByte() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readByte() != 0) {
            }
            string2 = parcel.readString();
            if (string2 != null) {
                kp90Var = new kp90(string2);
            } else {
                kp90Var = null;
            }
            return new yqr0(new lp90(string3, string4, i, i2, z, new jp90(z2, z3, kp90Var)));
        }
        bhn0.i("Name is null");
        i2 = 0;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readByte() != 0) {
        }
        string2 = parcel.readString();
        if (string2 != null) {
            kp90Var = new kp90(string2);
        } else {
            kp90Var = null;
        }
        return new yqr0(new lp90(string3, string4, i, i2, z, new jp90(z2, z3, kp90Var)));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new yqr0[i];
    }
}
