package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p.gzq;
import p.j541;
import p.jrn1;
import p.l1d;
import p.u9;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class DataItemAssetParcelable extends u9 implements gzq, ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new jrn1((byte) 28);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(gzq gzqVar) {
        String id = gzqVar.getId();
        zod.s(id);
        this.a = id;
        String strA = gzqVar.a();
        zod.s(strA);
        this.b = strA;
    }

    @Override // p.gzq
    public final String a() {
        return this.b;
    }

    @Override // p.on30
    public final /* bridge */ /* synthetic */ Object freeze() {
        return this;
    }

    @Override // p.gzq
    public final String getId() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.a;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(str);
        }
        sb.append(", key=");
        return l1d.n(this.b, "]", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.n(iJ, parcel);
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
