package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p.f5j1;
import p.g5j1;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(f5j1 f5j1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = f5j1Var.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (f5j1Var.e(2)) {
            Parcel parcel = ((g5j1) f5j1Var).e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = f5j1Var.g(3, iconCompat.d);
        iconCompat.e = f5j1Var.f(iconCompat.e, 4);
        iconCompat.f = f5j1Var.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) f5j1Var.g(6, iconCompat.g);
        String string = iconCompat.i;
        if (f5j1Var.e(7)) {
            string = ((g5j1) f5j1Var).e.readString();
        }
        iconCompat.i = string;
        String string2 = iconCompat.j;
        if (f5j1Var.e(8)) {
            string2 = ((g5j1) f5j1Var).e.readString();
        }
        iconCompat.j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    return iconCompat;
                }
                hhg1.n("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.c;
                iconCompat.b = bArr3;
                iconCompat.a = 3;
                iconCompat.e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.c, Charset.forName("UTF-16"));
                iconCompat.b = str;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.b = iconCompat.c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, f5j1 f5j1Var) {
        f5j1Var.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            f5j1Var.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            f5j1Var.i(2);
            Parcel parcel = ((g5j1) f5j1Var).e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            f5j1Var.k(3, parcelable);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            f5j1Var.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            f5j1Var.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            f5j1Var.k(6, colorStateList);
        }
        String str = iconCompat.i;
        if (str != null) {
            f5j1Var.i(7);
            ((g5j1) f5j1Var).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            f5j1Var.i(8);
            ((g5j1) f5j1Var).e.writeString(str2);
        }
    }
}
