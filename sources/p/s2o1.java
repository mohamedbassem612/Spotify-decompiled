package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s2o1 extends u9 implements fzq {
    public static final Parcelable.Creator<s2o1> CREATOR = new w2o1(0);
    public final Uri a;
    public final HashMap b;
    public final byte[] c;

    public s2o1(Uri uri, Bundle bundle, byte[] bArr) {
        this.a = uri;
        HashMap map = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            DataItemAssetParcelable parcelable = bundle.getParcelable(str);
            parcelable.getClass();
            map.put(str, parcelable);
        }
        this.b = map;
        this.c = bArr;
    }

    public final byte[] getData() {
        return this.c;
    }

    public final Uri getUri() {
        return this.a;
    }

    public final Map h() {
        return this.b;
    }

    public final String toString() {
        boolean zIsLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.c;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        HashMap map = this.b;
        int size = map.size();
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 12);
        sb2.append(", numAssets=");
        sb2.append(size);
        sb.append(sb2.toString());
        sb.append(", uri=".concat(String.valueOf(this.a)));
        if (!zIsLoggable) {
            sb.append("]");
            return sb.toString();
        }
        sb.append("]\n  assets: ");
        for (String str : map.keySet()) {
            String strValueOf = String.valueOf(map.get(str));
            sb.append(rjx.o(new StringBuilder(String.valueOf(str).length() + 7 + strValueOf.length()), "\n    ", str, ": ", strValueOf));
        }
        sb.append("\n  ]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 2, this.a, i);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((gzq) entry.getValue()));
        }
        j541.u(parcel, 4, bundle);
        j541.v(parcel, 5, this.c);
        j541.M(iL, parcel);
    }

    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }
}
