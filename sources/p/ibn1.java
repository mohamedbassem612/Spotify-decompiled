package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ibn1 extends mh70 {
    public final /* synthetic */ byte l;
    public final bsd1 m;
    public final /* synthetic */ ndn1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibn1(ndn1 ndn1Var, bsd1 bsd1Var, byte b) {
        super("com.google.android.engage.protocol.IAppEngageServicePublishStatusCallback", (byte) 5);
        this.l = b;
        switch (b) {
            case 1:
                this.n = ndn1Var;
                super("com.google.android.engage.protocol.IAppEngageServiceAvailableCallback", (byte) 5);
                this.m = bsd1Var;
                break;
            case 2:
                this.n = ndn1Var;
                super("com.google.android.engage.protocol.IAppEngageServiceDeleteClustersCallback", (byte) 5);
                this.m = bsd1Var;
                break;
            case 3:
                this.n = ndn1Var;
                super("com.google.android.engage.protocol.IAppEngageServicePublishClustersCallback", (byte) 5);
                this.m = bsd1Var;
                break;
            default:
                this.n = ndn1Var;
                this.m = bsd1Var;
                break;
        }
    }

    @Override // p.mh70
    public final boolean s(int i, Parcel parcel) {
        byte b = this.l;
        ndn1 ndn1Var = this.n;
        bsd1 bsd1Var = this.m;
        switch (b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) qsn1.a(parcel);
                qsn1.b(parcel);
                rzo1 rzo1Var = ndn1Var.e;
                if (rzo1Var != null) {
                    rzo1Var.e(bsd1Var);
                }
                bsd1Var.d(bundle);
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) qsn1.a(parcel);
                qsn1.b(parcel);
                rzo1 rzo1Var2 = ndn1Var.e;
                if (rzo1Var2 != null) {
                    rzo1Var2.e(bsd1Var);
                }
                bsd1Var.d(bundle2);
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) qsn1.a(parcel);
                qsn1.b(parcel);
                rzo1 rzo1Var3 = ndn1Var.e;
                if (rzo1Var3 != null) {
                    rzo1Var3.e(bsd1Var);
                }
                bsd1Var.d(bundle3);
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) qsn1.a(parcel);
                qsn1.b(parcel);
                rzo1 rzo1Var4 = ndn1Var.e;
                if (rzo1Var4 != null) {
                    rzo1Var4.e(bsd1Var);
                }
                bsd1Var.d(bundle4);
                return true;
        }
    }
}
