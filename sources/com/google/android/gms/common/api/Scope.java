package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p.j541;
import p.jrn1;
import p.u9;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class Scope extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new jrn1((byte) 21);
    public final int a;
    public final String b;

    public Scope(int i, String str) {
        zod.p(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 1, this.a);
        j541.F(parcel, 2, this.b);
        j541.n(iJ, parcel);
    }
}
