package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/b8d1;", "Lp/uim0;", "Lp/j8d1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class b8d1 extends uim0 {
    public final Object a;
    public final Object b;
    public final Object[] c;
    public final PointerInputEventHandler d;

    public b8d1(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.a = obj;
        this.b = obj2;
        this.c = objArr;
        this.d = pointerInputEventHandler;
    }

    @Override // p.uim0
    public final pim0 a() {
        return new j8d1(this.a, this.b, this.c, this.d);
    }

    @Override // p.uim0
    public final void b(pim0 pim0Var) {
        j8d1 j8d1Var = (j8d1) pim0Var;
        Object obj = j8d1Var.O0;
        Object obj2 = this.a;
        boolean z = !u890.j(obj, obj2);
        j8d1Var.O0 = obj2;
        Object obj3 = j8d1Var.P0;
        Object obj4 = this.b;
        if (!u890.j(obj3, obj4)) {
            z = true;
        }
        j8d1Var.P0 = obj4;
        Object[] objArr = j8d1Var.Q0;
        Object[] objArr2 = this.c;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        j8d1Var.Q0 = objArr2;
        Class<?> cls = j8d1Var.R0.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            j8d1Var.J1();
        }
        j8d1Var.R0 = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8d1)) {
            return false;
        }
        b8d1 b8d1Var = (b8d1) obj;
        if (!u890.j(this.a, b8d1Var.a) || !u890.j(this.b, b8d1Var.b)) {
            return false;
        }
        Object[] objArr = b8d1Var.c;
        Object[] objArr2 = this.c;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.d == b8d1Var.d;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.c;
        return this.d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
