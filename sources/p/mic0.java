package p;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mic0 extends zv61 implements n790 {
    public final List d;
    public final List e;
    public final long f;
    public final long g;
    public final int h;

    public mic0(int i, long j, long j2, List list, List list2) {
        this.d = list;
        this.e = list2;
        this.f = j;
        this.g = j2;
        this.h = i;
    }

    @Override // p.n790
    public final Object b(float f, Object obj) {
        if (obj == null) {
            int i = u7h.l;
            obj = new n6a1(nfb.o());
        }
        boolean z = obj instanceof n6a1;
        List list = this.d;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                long j = ((u7h) list.get(i2)).a;
                arrayList.add(new u7h(((n6a1) obj).a));
            }
            obj = new mic0(this.h, this.f, this.g, arrayList, this.e);
        }
        if (!(obj instanceof mic0)) {
            return null;
        }
        mic0 mic0Var = (mic0) obj;
        ArrayList arrayListB = anm1.B(list, mic0Var.d, f);
        ArrayList arrayListD = anm1.D(this.e, mic0Var.e, f);
        long jE = anm1.E(f, this.f, mic0Var.f);
        long jE2 = anm1.E(f, this.g, mic0Var.g);
        if (f >= 0.5f) {
            this = mic0Var;
        }
        return new mic0(this.h, jE, jE2, arrayListB, arrayListD);
    }

    @Override // p.zv61
    public final Shader c(long j) {
        long j2 = this.f;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.g;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        return kto1.j(this.h, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mic0)) {
            return false;
        }
        mic0 mic0Var = (mic0) obj;
        return u890.j(this.d, mic0Var.d) && u890.j(this.e, mic0Var.e) && Offset.c(this.f, mic0Var.f) && Offset.c(this.g, mic0Var.g) && lap1.j(this.h, mic0Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        List list = this.e;
        return lap1.l(this.h) + cy30.f(cy30.f((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f, 31), this.g, 31);
    }

    public final String toString() {
        long j = this.f;
        String strF = ((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? f4i1.f("start=", Offset.i(j), ", ") : "";
        long j2 = this.g;
        String strF2 = ((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? f4i1.f("end=", Offset.i(j2), ", ") : "";
        String strR = lap1.r(this.h);
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.d);
        sb.append(", stops=");
        sb.append(this.e);
        sb.append(", ");
        bb00.j(sb, strF, strF2, "tileMode=", strR);
        sb.append(")");
        return sb.toString();
    }
}
