package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cpx extends hux {
    public static final Parcelable.Creator<cpx> CREATOR;
    public static final cpx c;

    static {
        b180 b180VarB = fho1.c;
        if (b180VarB == null) {
            a180 a180Var = new a180("Encore.Vector.Mix16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarG = lf51.g(8.0f, 5.25f);
            cwh0VarG.c(2.75f, 2.75f, true, false, 0.0f, 5.5f);
            cwh0VarG.c(2.75f, 2.75f, false, false, 0.0f, -5.5f);
            cwh0VarG.l(3.75f, 8.0f);
            cwh0VarG.c(4.25f, 4.25f, true, true, 8.5f, 0.0f);
            cwh0VarG.c(4.25f, 4.25f, false, true, -8.5f, 0.0f);
            cwh0VarG.m(3.5f, -6.0f);
            cwh0VarG.j(7.25f, 0.0f);
            cwh0VarG.i(1.5f);
            cwh0VarG.v(2.0f);
            cwh0VarG.e();
            cwh0VarG.l(7.25f, 16.0f);
            cwh0VarG.v(-2.0f);
            cwh0VarG.i(1.5f);
            cwh0VarG.v(2.0f);
            cwh0VarG.e();
            cwh0VarG.l(11.712f, 3.227f);
            cwh0VarG.j(13.127f, 1.813f);
            ydh.k(cwh0VarG, 14.187f, 2.873f, 12.773f, 4.288f);
            cwh0VarG.l(1.813f, 13.127f);
            cwh0VarG.j(3.227f, 11.712f);
            ydh.k(cwh0VarG, 4.287f, 12.773f, 2.873f, 14.187f);
            rjx.z(cwh0VarG, 14.0f, 7.25f, 2.0f, 1.5f);
            rjx.v(cwh0VarG, -2.0f, 0.0f, 7.25f, 2.0f);
            cwh0VarG.v(1.5f);
            cwh0VarG.j(0.0f, 8.75f);
            cwh0VarG.e();
            cwh0VarG.l(12.773f, 11.712f);
            cwh0VarG.j(14.187f, 13.127f);
            ydh.k(cwh0VarG, 13.127f, 14.187f, 11.712f, 12.773f);
            cwh0VarG.l(2.874f, 1.813f);
            cwh0VarG.k(1.414f, 1.414f);
            rjx.C(cwh0VarG, -1.06f, 1.06f, -1.415f, -1.413f);
            a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
            b180VarB = a180Var.b();
            fho1.c = b180VarB;
        }
        b180 b180VarB2 = hm5.k;
        if (b180VarB2 == null) {
            a180 a180Var2 = new a180("Encore.Vector.Mix24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i2 = bui1.a;
            int i3 = u7h.l;
            n6a1 n6a1Var2 = new n6a1(u7h.b);
            cwh0 cwh0VarG2 = lf51.g(12.0f, 7.5f);
            cwh0VarG2.c(4.5f, 4.5f, true, false, 0.0f, 9.0f);
            cwh0VarG2.c(4.5f, 4.5f, false, false, 0.0f, -9.0f);
            cwh0VarG2.l(5.5f, 12.0f);
            cwh0VarG2.c(6.5f, 6.5f, true, true, 13.0f, 0.0f);
            cwh0VarG2.c(6.5f, 6.5f, false, true, -13.0f, 0.0f);
            cwh0VarG2.l(11.0f, 3.0f);
            cwh0VarG2.j(11.0f, 0.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.v(3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(11.0f, 24.0f);
            cwh0VarG2.v(-3.0f);
            cwh0VarG2.i(2.0f);
            cwh0VarG2.v(3.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(17.657f, 4.929f);
            cwh0VarG2.j(19.778f, 2.808f);
            ydh.k(cwh0VarG2, 21.193f, 4.222f, 19.071f, 6.343f);
            cwh0VarG2.l(2.808f, 19.778f);
            cwh0VarG2.k(2.12f, -2.121f);
            rjx.C(cwh0VarG2, 1.415f, 1.414f, -2.121f, 2.121f);
            rjx.z(cwh0VarG2, 21.0f, 11.0f, 3.0f, 2.0f);
            rjx.v(cwh0VarG2, -3.0f, 0.0f, 11.0f, 3.0f);
            cwh0VarG2.v(2.0f);
            cwh0VarG2.j(0.0f, 13.0f);
            cwh0VarG2.e();
            cwh0VarG2.l(19.071f, 17.657f);
            cwh0VarG2.j(21.192f, 19.778f);
            ydh.k(cwh0VarG2, 19.778f, 21.193f, 17.657f, 19.071f);
            cwh0VarG2.l(4.222f, 2.808f);
            cwh0VarG2.k(2.121f, 2.121f);
            ydh.k(cwh0VarG2, 4.93f, 6.343f, 2.808f, 4.222f);
            a180.a(a180Var2, cwh0VarG2.a, n6a1Var2, 1.0f, 2, 1.0f);
            b180VarB2 = a180Var2.b();
            hm5.k = b180VarB2;
        }
        c = new cpx(new dsx(b180VarB, b180VarB2), null);
        CREATOR = new yox((byte) 3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cpx);
    }

    public final int hashCode() {
        return -1525560089;
    }

    public final String toString() {
        return "Mix";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
