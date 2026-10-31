package p;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l9d1 extends zv61 implements n790 {
    public final long d;
    public final ArrayList e;
    public final List f;

    public l9d1(long j, ArrayList arrayList, List list) {
        this.d = j;
        this.e = arrayList;
        this.f = list;
    }

    public final Object b(float f, Object obj) {
        if (obj == null) {
            obj = new n6a1(u7h.j);
        }
        boolean z = obj instanceof n6a1;
        List list = this.f;
        ArrayList arrayList = this.e;
        long j = this.d;
        if (z) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                long j2 = ((u7h) arrayList.get(i)).a;
                arrayList2.add(new u7h(((n6a1) obj).a));
            }
            obj = new l9d1(j, arrayList2, list);
        }
        if (!(obj instanceof l9d1)) {
            return null;
        }
        l9d1 l9d1Var = (l9d1) obj;
        return new l9d1(hm5.A(f, j, l9d1Var.d), anm1.B(arrayList, l9d1Var.e, f), anm1.D(list, l9d1Var.f, f));
    }

    public final Shader c(long j) {
        long jFloatToRawIntBits;
        long j2 = this.d;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            jFloatToRawIntBits = zno1.o(j);
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat(i2);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        }
        ArrayList arrayList = this.e;
        List list = this.f;
        men1.G(arrayList, list);
        if (Build.VERSION.SDK_INT >= 29) {
            return q650.a.c(jFloatToRawIntBits, men1.E(arrayList), list != null ? o7h.i1(list) : null);
        }
        int iQ = men1.q(arrayList);
        return new SweepGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), men1.A(iQ, arrayList), men1.B(iQ, list, arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9d1)) {
            return false;
        }
        l9d1 l9d1Var = (l9d1) obj;
        return Offset.c(this.d, l9d1Var.d) && this.e.equals(l9d1Var.e) && u890.j(this.f, l9d1Var.f);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.e, Long.hashCode(this.d) * 31, 31);
        List list = this.f;
        return iF + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        long j = this.d;
        return "SweepGradient(" + ((9223372034707292159L & j) != 9205357640488583168L ? f4i1.f("center=", Offset.i(j), ", ") : "") + "colors=" + this.e + ", stops=" + this.f + ")";
    }
}
