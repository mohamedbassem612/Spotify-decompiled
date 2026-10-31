package p;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v4o1 extends w4o1 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ u6o1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4o1(u6o1 u6o1Var, String str, String str2, Bundle bundle, boolean z) {
        super(u6o1Var, true);
        this.e = str;
        this.f = str2;
        this.g = bundle;
        this.h = z;
        this.i = u6o1Var;
    }

    public final void a() {
        long j = ((w4o1) this).a;
        long j2 = ((w4o1) this).b;
        kvn1 kvn1Var = this.i.f;
        zod.s(kvn1Var);
        String str = this.e;
        String str2 = this.f;
        Bundle bundle = this.g;
        boolean z = this.h;
        kvn1 kvn1Var2 = kvn1Var;
        Parcel parcelS = kvn1Var2.s();
        parcelS.writeString(str);
        parcelS.writeString(str2);
        drn1.a(parcelS, bundle);
        parcelS.writeInt(z ? 1 : 0);
        parcelS.writeInt(1);
        parcelS.writeLong(j);
        parcelS.writeLong(j2);
        kvn1Var2.B0(59, parcelS);
    }
}
