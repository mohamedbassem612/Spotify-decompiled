package com.google.android.engage.service;

import android.os.Parcel;
import android.os.Parcelable;
import p.bg11;
import p.dm5;
import p.e9n1;
import p.hql1;
import p.v280;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class ClusterMetadata implements Parcelable {
    public static final Parcelable.Creator<ClusterMetadata> CREATOR = new e9n1((byte) 18);
    public final bg11 a;

    public ClusterMetadata(hql1 hql1Var) {
        bg11 bg11VarG = ((v280) hql1Var.a).g();
        this.a = bg11VarG;
        dm5.n(!bg11VarG.isEmpty(), "Cluster Type list cannot be empty");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        bg11 bg11Var = this.a;
        boolean zIsEmpty = bg11Var.isEmpty();
        int i2 = bg11Var.d;
        if (zIsEmpty) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeInt(((Integer) bg11Var.get(i3)).intValue());
        }
    }
}
