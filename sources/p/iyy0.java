package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iyy0 extends u9 {
    public static final Parcelable.Creator<iyy0> CREATOR = new agm0((byte) 25);
    public final Uri a;
    public final Bundle b;
    public byte[] c;
    public long d;

    static {
        new SecureRandom();
    }

    public iyy0(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.a = uri;
        this.b = bundle;
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        this.c = bArr;
        this.d = j;
    }

    public final Map h() {
        HashMap map = new HashMap();
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            map.put(str, bundle.getParcelable(str));
        }
        return Collections.unmodifiableMap(map);
    }

    public final void j(String str, Asset asset) {
        str.getClass();
        this.b.putParcelable(str, asset);
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder sb = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.c;
        sb.append("dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        Bundle bundle = this.b;
        int size = bundle.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        sb.append(", uri=".concat(String.valueOf(this.a)));
        long j = this.d;
        StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 15);
        sb3.append(", syncDeadline=");
        sb3.append(j);
        sb.append(sb3.toString());
        if (!zIsLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : bundle.keySet()) {
            String strValueOf = String.valueOf(bundle.getParcelable(str));
            sb.append(rjx.o(new StringBuilder(String.valueOf(str).length() + 7 + strValueOf.length()), "\n    ", str, ": ", strValueOf));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zno1.F(parcel, "dest must not be null");
        int iJ = j541.j(parcel);
        j541.E(parcel, 2, this.a, i);
        j541.u(parcel, 4, this.b);
        j541.v(parcel, 5, this.c);
        j541.C(parcel, 6, this.d);
        j541.n(iJ, parcel);
    }
}
