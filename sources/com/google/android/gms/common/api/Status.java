package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p.drj0;
import p.gm50;
import p.j541;
import p.jrn1;
import p.k8p1;
import p.lal;
import p.p331;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Status extends u9 implements p331, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final lal d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status g = new Status(8, null, null, null);
    public static final Status h = new Status(15, null, null, null);
    public static final Status i = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new jrn1((byte) 29);

    public Status(int i2, String str, PendingIntent pendingIntent, lal lalVar) {
        this.a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = lalVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && k8p1.h(this.b, status.b) && k8p1.h(this.c, status.c) && k8p1.h(this.d, status.d);
    }

    @Override // p.p331
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return k8p1.j(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final boolean j() {
        return this.a <= 0;
    }

    public final String toString() {
        drj0 drj0VarR = k8p1.r(this);
        String strW = this.b;
        if (strW == null) {
            strW = gm50.w(this.a);
        }
        drj0VarR.d(strW, "statusCode");
        drj0VarR.d(this.c, "resolution");
        return drj0VarR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 1, this.a);
        j541.F(parcel, 2, this.b);
        j541.E(parcel, 3, this.c, i2);
        j541.E(parcel, 4, this.d, i2);
        j541.n(iJ, parcel);
    }
}
