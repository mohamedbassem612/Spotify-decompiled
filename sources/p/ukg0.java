package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ukg0 extends g0y implements Iterator, ola0 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ukg0(xkg0 xkg0Var, boolean z) {
        super(xkg0Var);
        this.e = (byte) 0;
    }

    public void h(StringBuilder sb) {
        int i = this.a;
        xkg0 xkg0Var = this.d;
        if (i >= xkg0Var.f) {
            hhg1.k();
            return;
        }
        this.a = i + 1;
        this.b = i;
        Object obj = xkg0Var.a[i];
        if (obj == xkg0Var) {
            sb.append("(this Map)");
        } else {
            sb.append(obj);
        }
        sb.append('=');
        Object[] objArr = xkg0Var.b;
        objArr.getClass();
        Object obj2 = objArr[this.b];
        if (obj2 == xkg0Var) {
            sb.append("(this Map)");
        } else {
            sb.append(obj2);
        }
        e();
    }

    public int i() {
        int i = this.a;
        xkg0 xkg0Var = this.d;
        if (i >= xkg0Var.f) {
            hhg1.k();
            return 0;
        }
        this.a = i + 1;
        this.b = i;
        Object obj = xkg0Var.a[i];
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object[] objArr = xkg0Var.b;
        objArr.getClass();
        Object obj2 = objArr[this.b];
        int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        e();
        return iHashCode2;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.e;
        xkg0 xkg0Var = this.d;
        switch (b) {
            case 0:
                a();
                int i = this.a;
                xkg0 xkg0Var2 = xkg0Var;
                if (i >= xkg0Var2.f) {
                    hhg1.k();
                    return null;
                }
                this.a = i + 1;
                this.b = i;
                vkg0 vkg0Var = new vkg0(xkg0Var2, i);
                e();
                return vkg0Var;
            default:
                a();
                int i2 = this.a;
                xkg0 xkg0Var3 = xkg0Var;
                if (i2 >= xkg0Var3.f) {
                    hhg1.k();
                    return null;
                }
                this.a = i2 + 1;
                this.b = i2;
                Object[] objArr = xkg0Var3.b;
                objArr.getClass();
                Object obj = objArr[this.b];
                e();
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ukg0(xkg0 xkg0Var, byte b) {
        super(xkg0Var);
        this.e = b;
    }
}
