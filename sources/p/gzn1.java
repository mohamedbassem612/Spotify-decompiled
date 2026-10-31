package p;

import android.os.Parcel;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gzn1 extends w4o1 {
    public final /* synthetic */ lyn1 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ u6o1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzn1(u6o1 u6o1Var, lyn1 lyn1Var, String str, String str2) {
        super(u6o1Var, true);
        this.e = lyn1Var;
        this.f = str;
        this.g = str2;
        Objects.requireNonNull(u6o1Var);
        this.h = u6o1Var;
    }

    public final void a() {
        kvn1 kvn1Var = this.h.f;
        zod.s(kvn1Var);
        lyn1 lyn1Var = this.e;
        String str = this.f;
        String str2 = this.g;
        long j = ((w4o1) this).a;
        kvn1 kvn1Var2 = kvn1Var;
        Parcel parcelS = kvn1Var2.s();
        drn1.a(parcelS, lyn1Var);
        parcelS.writeString(str);
        parcelS.writeString(str2);
        parcelS.writeLong(j);
        kvn1Var2.B0(50, parcelS);
    }
}
