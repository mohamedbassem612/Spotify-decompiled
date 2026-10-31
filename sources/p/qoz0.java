package p;

import android.graphics.Shader;
import androidx.car.app.model.Alert;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qoz0 extends zv61 implements n790 {
    public final List d;
    public final List e;
    public final long f;
    public final float g;

    public qoz0(float f, long j, List list, List list2) {
        this.d = list;
        this.e = list2;
        this.f = j;
        this.g = f;
    }

    public final Object b(float f, Object obj) {
        if (obj == null) {
            obj = new n6a1(u7h.j);
        }
        boolean z = obj instanceof n6a1;
        List list = this.d;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                long j = ((u7h) list.get(i)).a;
                arrayList.add(new u7h(((n6a1) obj).a));
            }
            obj = new qoz0(this.g, this.f, arrayList, this.e);
        }
        if (!(obj instanceof qoz0)) {
            return null;
        }
        qoz0 qoz0Var = (qoz0) obj;
        ArrayList arrayListB = anm1.B(list, qoz0Var.d, f);
        ArrayList arrayListD = anm1.D(this.e, qoz0Var.e, f);
        return new qoz0(dm5.T(this.g, qoz0Var.g, f), hm5.A(f, this.f, qoz0Var.f), arrayListB, arrayListD);
    }

    public final Shader c(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.f;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jO = zno1.o(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jO >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jO & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fE = this.g;
        if (fE == Float.POSITIVE_INFINITY) {
            fE = Size.e(j) / 2.0f;
        }
        return men1.b(fE, jFloatToRawIntBits, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qoz0)) {
            return false;
        }
        qoz0 qoz0Var = (qoz0) obj;
        return this.d.equals(qoz0Var.d) && u890.j(this.e, qoz0Var.e) && Offset.c(this.f, qoz0Var.f) && this.g == qoz0Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        List list = this.e;
        return Integer.hashCode(0) + x0d.f(cy30.f((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f, 31), 31, this.g);
    }

    public final String toString() {
        long j = this.f;
        String strF = (9223372034707292159L & j) != 9205357640488583168L ? f4i1.f("center=", Offset.i(j), ", ") : "";
        float f = this.g;
        String strH = (Float.floatToRawIntBits(f) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 ? c13.h("radius=", f, ", ") : "";
        String strR = lap1.r(0);
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.d);
        sb.append(", stops=");
        sb.append(this.e);
        sb.append(", ");
        bb00.j(sb, strF, strH, "tileMode=", strR);
        sb.append(")");
        return sb.toString();
    }
}
