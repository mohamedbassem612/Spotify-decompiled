package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p.j541;
import p.jrn1;
import p.k8p1;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class Asset extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new jrn1((byte) 20);
    public final byte[] a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final Uri d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.a = bArr;
        this.b = str;
        this.c = parcelFileDescriptor;
        this.d = uri;
    }

    public final byte[] F() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.a, asset.a) && k8p1.h(this.b, asset.b) && k8p1.h(this.c, asset.c) && k8p1.h(this.d, asset.d);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String j() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.b;
        if (str == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(str);
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            sb.append(", size=");
            sb.append(bArr.length);
        }
        ParcelFileDescriptor parcelFileDescriptor = this.c;
        if (parcelFileDescriptor != null) {
            sb.append(", fd=");
            sb.append(parcelFileDescriptor);
        }
        Uri uri = this.d;
        if (uri != null) {
            sb.append(", uri=");
            sb.append(uri);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = i | 1;
        int iL = j541.L(20293, parcel);
        j541.v(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.E(parcel, 4, this.c, i2);
        j541.E(parcel, 5, this.d, i2);
        j541.M(iL, parcel);
    }
}
