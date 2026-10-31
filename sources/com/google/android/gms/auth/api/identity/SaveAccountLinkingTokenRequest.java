package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;
import p.e9n1;
import p.j541;
import p.k8p1;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class SaveAccountLinkingTokenRequest extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new e9n1((byte) 8);
    public final PendingIntent a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = saveAccountLinkingTokenRequest.d;
        List list2 = this.d;
        return list2.size() == list.size() && list2.containsAll(list) && k8p1.h(this.a, saveAccountLinkingTokenRequest.a) && k8p1.h(this.b, saveAccountLinkingTokenRequest.b) && k8p1.h(this.c, saveAccountLinkingTokenRequest.c) && k8p1.h(this.e, saveAccountLinkingTokenRequest.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 1, this.a, i);
        j541.F(parcel, 2, this.b);
        j541.F(parcel, 3, this.c);
        j541.H(parcel, 4, this.d);
        j541.F(parcel, 5, this.e);
        j541.M(iL, parcel);
    }
}
