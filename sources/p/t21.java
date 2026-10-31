package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t21 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:178:0x0349  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        n5o n5oVar;
        boolean z;
        Boolean boolValueOf;
        int i = 3;
        switch (this.a) {
            case 0:
                String string = parcel.readString();
                if (string != null) {
                    if (string.equals("NONE")) {
                        i = 1;
                    } else if (string.equals("API_CREATE")) {
                        i = 2;
                    } else if (!string.equals("API_COMPLETE_CREATION")) {
                        if (string.equals("API_GET_SESSION")) {
                            i = 4;
                        } else if (string.equals("API_AUTH_CLIENT")) {
                            i = 5;
                        } else if (string.equals("CHALLENGE_IN_PROGRESS")) {
                            i = 6;
                        } else if (string.equals("SESSION_ID_MISMATCH")) {
                            i = 7;
                        } else if (string.equals("CHALLENGE_PASSKEY_AUTHN_REQUEST")) {
                            i = 8;
                        } else if (string.equals("CHALLENGE_SMSCODE_REQUEST")) {
                            i = 9;
                        } else if (string.equals("CHALLENGE_EMAILCODE_REQUEST")) {
                            i = 10;
                        } else {
                            hhg1.n("No enum constant com.spotify.login.adaptiveauthentication.domain.AdaptiveAuthenticationModel.Error.ErrorSource.".concat(string));
                        }
                    }
                    return new s31(i, parcel.readString(), parcel.readParcelable(s31.class.getClassLoader()), parcel.readInt() != 0 ? bk8.valueOf(parcel.readString()) : null);
                }
                bhn0.i("Name is null");
                i = 0;
                return new s31(i, parcel.readString(), parcel.readParcelable(s31.class.getClassLoader()), parcel.readInt() != 0 ? bk8.valueOf(parcel.readString()) : null);
            case 1:
                return new v21(kk0.F(parcel.readString()), kk0.E(parcel.readString()));
            case 2:
                return new w21(parcel.readString(), parcel.readString());
            case 3:
                return new x21(parcel.readInt() != 0);
            case 4:
                return new y21(parcel.readInt() != 0);
            case 5:
                return new z21(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
            case 6:
                return new a31(parcel.readInt() != 0 ? bk8.valueOf(parcel.readString()) : null);
            case 7:
                parcel.readInt();
                return b31.a;
            case 8:
                return new g31(parcel.readParcelable(g31.class.getClassLoader()));
            case 9:
                parcel.readInt();
                return c31.a;
            case 10:
                parcel.readInt();
                return d31.a;
            case 11:
                parcel.readInt();
                return e31.a;
            case 12:
                parcel.readInt();
                return h31.a;
            case 13:
                parcel.readInt();
                return i31.a;
            case 14:
                return new j31(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 15:
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("CREDENTIAL_NOT_FOUND")) {
                        i = 1;
                    } else if (string2.equals("CONNECTION")) {
                        i = 2;
                    } else if (!string2.equals("UNKNOWN")) {
                        hhg1.n("No enum constant com.spotify.login.credentialmanager.PasskeyAuthenticationError.".concat(string2));
                    }
                    return new k31(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new k31(i);
            case 16:
                return new l31(parcel.readParcelable(l31.class.getClassLoader()));
            case 17:
                return new m31(parcel.readString());
            case 18:
                return new n31(parcel.readString(), parcel.readString());
            case 19:
                return new o31(parcel.readString(), parcel.readString());
            case 20:
                return new p31(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 21:
                return new q31(parcel.readString(), parcel.readString());
            case 22:
                return new t31((w01) w01.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readParcelable(t31.class.getClassLoader()), (ri8) (parcel.readInt() != 0 ? ri8.CREATOR.createFromParcel(parcel) : null), parcel.readParcelable(t31.class.getClassLoader()), parcel.readParcelable(t31.class.getClassLoader()));
            case 23:
                l3f0 parcelable = parcel.readParcelable(u31.class.getClassLoader());
                boolean z2 = parcel.readInt() != 0;
                w01 w01Var = (w01) (parcel.readInt() != 0 ? w01.CREATOR.createFromParcel(parcel) : null);
                n5o parcelable2 = parcel.readParcelable(u31.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                    n5oVar = parcelable2;
                } else {
                    n5oVar = parcelable2;
                    z = false;
                }
                return new u31(parcelable, z2, w01Var, n5oVar, z);
            case 24:
                xwe0 parcelable3 = parcel.readParcelable(v31.class.getClassLoader());
                l3f0 parcelable4 = parcel.readParcelable(v31.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new v31(parcelable3, parcelable4, boolValueOf, (w01) (parcel.readInt() != 0 ? w01.CREATOR.createFromParcel(parcel) : null), 16);
            case 25:
                return new w31(parcel.readParcelable(w31.class.getClassLoader()), (epv0) parcel.readParcelable(w31.class.getClassLoader()), parcel.readParcelable(w31.class.getClassLoader()), (jj01) (parcel.readInt() != 0 ? jj01.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0);
            case 26:
                return new b41(parcel.readString(), parcel.readInt() != 0, parcel.readParcelable(b41.class.getClassLoader()));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new x31(parcel.readParcelable(x31.class.getClassLoader()));
            case 28:
                return new y31(parcel.readString());
            default:
                parcel.readInt();
                return z31.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new s31[i];
            case 1:
                return new v21[i];
            case 2:
                return new w21[i];
            case 3:
                return new x21[i];
            case 4:
                return new y21[i];
            case 5:
                return new z21[i];
            case 6:
                return new a31[i];
            case 7:
                return new b31[i];
            case 8:
                return new g31[i];
            case 9:
                return new c31[i];
            case 10:
                return new d31[i];
            case 11:
                return new e31[i];
            case 12:
                return new h31[i];
            case 13:
                return new i31[i];
            case 14:
                return new j31[i];
            case 15:
                return new k31[i];
            case 16:
                return new l31[i];
            case 17:
                return new m31[i];
            case 18:
                return new n31[i];
            case 19:
                return new o31[i];
            case 20:
                return new p31[i];
            case 21:
                return new q31[i];
            case 22:
                return new t31[i];
            case 23:
                return new u31[i];
            case 24:
                return new v31[i];
            case 25:
                return new w31[i];
            case 26:
                return new b41[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new x31[i];
            case 28:
                return new y31[i];
            default:
                return new z31[i];
        }
    }
}
