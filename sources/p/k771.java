package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.signup.signup.v2.proto.Error;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k771 implements Parcelable {
    public static final Parcelable.Creator<k771> CREATOR;
    public static final k771 N0;
    public static final k771 O0;
    public static final k771 P0;
    public static final k771 Q0;
    public static final k771 R0;
    public static final k771 S0;
    public static final /* synthetic */ k771[] T0;
    public static final k771 X;
    public static final k771 Y;
    public static final k771 Z;
    public static final k771 d;
    public static final k771 e;
    public static final k771 f;
    public static final k771 g;
    public static final k771 h;
    public static final k771 i;
    public static final k771 t;
    public final short a;
    public final yv61 b;
    public final boolean c;

    static {
        yv61 yv61Var = yv61.d;
        k771 k771Var = new k771("UNKNOWN_ERROR", 0, 100, yv61Var, false);
        d = k771Var;
        k771 k771Var2 = new k771("CREATE_OUTPUT_FILE_ERROR", 1, 103, yv61Var, false);
        e = k771Var2;
        k771 k771Var3 = new k771("COMPRESS_IMAGE_ERROR", 2, 104, yv61Var, false);
        f = k771Var3;
        k771 k771Var4 = new k771("FAILED_PROVIDING_SHARE_DATA", 3, 111, yv61Var, false);
        g = k771Var4;
        k771 k771Var5 = new k771("FAILED_LOADING_SHARE_FORMATS", 4, 112, yv61Var, false);
        h = k771Var5;
        k771 k771Var6 = new k771("FAILED_FETCHING_OFFPLATFORM_DESTINATIONS", 5, 114, yv61Var, false);
        i = k771Var6;
        k771 k771Var7 = new k771("FAILED_FETCHING_ONPLATFORM_DESTINATIONS", 6, 115, yv61Var, false);
        t = k771Var7;
        k771 k771Var8 = new k771("INVALID_ARGUMENTS", 7, 201, yv61Var, false);
        X = k771Var8;
        k771 k771Var9 = new k771("MISSING_PERMISSIONS", 8, 301, yv61Var, false);
        Y = k771Var9;
        yv61 yv61Var2 = yv61.c;
        k771 k771Var10 = new k771("REQUEST_SMART_SORTING_ERROR", 9, 105, yv61Var2, true);
        Z = k771Var10;
        k771 k771Var11 = new k771("REQUEST_SMART_SORTING_TIMEOUT", 10, Error.INVALID_COUNTRY_FIELD_NUMBER, yv61Var2, true);
        N0 = k771Var11;
        k771 k771Var12 = new k771("URL_GENERATION_REQUEST_ERROR", 11, 200, yv61Var2, true);
        O0 = k771Var12;
        k771 k771Var13 = new k771("LINK_PREVIEW_UPLOAD_ERROR", 12, 210, yv61Var2, true);
        P0 = k771Var13;
        k771 k771Var14 = new k771("ON_PLATFORM_PREVIEW_UPLOAD_ERROR", 13, 211, yv61Var2, true);
        Q0 = k771Var14;
        k771 k771Var15 = new k771("SHARE_CARD_CONFIG_UPLOAD_ERROR", 14, 212, yv61Var2, true);
        R0 = k771Var15;
        k771 k771Var16 = new k771("DEVICE_OFFLINE", 15, 300, yv61.b, true);
        S0 = k771Var16;
        T0 = new k771[]{k771Var, k771Var2, k771Var3, k771Var4, k771Var5, k771Var6, k771Var7, k771Var8, k771Var9, k771Var10, k771Var11, k771Var12, k771Var13, k771Var14, k771Var15, k771Var16};
        CREATOR = new o471((byte) 26);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k771(String str, int i2, int i3, yv61 yv61Var, boolean z) {
        super(str, i2);
        this.a = i3;
        this.b = yv61Var;
        this.c = z;
    }

    public static k771 valueOf(String str) {
        return (k771) Enum.valueOf(k771.class, str);
    }

    public static k771[] values() {
        return (k771[]) T0.clone();
    }

    public final int a() {
        return this.a;
    }

    public final yv61 b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean g() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(name());
    }
}
