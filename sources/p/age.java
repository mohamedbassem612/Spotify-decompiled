package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class age implements fx30 {
    public final o8n a;
    public final int b;
    public final int c;

    public age(o8n o8nVar, int i, int i2) {
        this.a = o8nVar;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // p.fx30
    public final mr20 b(o8n o8nVar, int i, int i2) {
        o8n o8nVar2 = this.a;
        o8n o8nVarY = o8nVar.y(o8nVar2);
        int i3 = this.c;
        int i4 = this.b;
        if (i2 == 1) {
            if (i4 != -3) {
                if (i == -3) {
                    i = i4;
                } else if (i4 != -2) {
                    if (i == -2) {
                        i = i4;
                    } else {
                        i += i4;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            i2 = i3;
        }
        return (u890.j(o8nVarY, o8nVar2) && i == i4 && i2 == i3) ? this : h(o8nVarY, i, i2);
    }

    @Override // p.mr20
    public Object collect(vr20 vr20Var, lnm lnmVar) {
        Object objS = smo1.s(new zfe(vr20Var, this, null, (byte) 0), lnmVar);
        return objS == d9n.a ? objS : rih1.a;
    }

    public String f() {
        return null;
    }

    public abstract Object g(ssw0 ssw0Var, lnm lnmVar);

    public abstract age h(o8n o8nVar, int i, int i2);

    public mr20 i() {
        return null;
    }

    public jfe j(c9n c9nVar) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        vu30 hscVar = new hsc(this, (lnm) null, (byte) 7);
        rsw0 rsw0Var = new rsw0(ulo1.o(c9nVar, this.a), mno1.a(i, this.c, 4));
        rsw0Var.A0(3, rsw0Var, hscVar);
        return rsw0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strF = f();
        if (strF != null) {
            arrayList.add(strF);
        }
        o6x o6xVar = o6x.a;
        o8n o8nVar = this.a;
        if (o8nVar != o6xVar) {
            arrayList.add("context=" + o8nVar);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(z5c.r(i2)));
        }
        StringBuilder sb = new StringBuilder(v8r.l(this));
        sb.append('[');
        return gvg.k(sb, o7h.y0(arrayList, ", ", null, null, null, 62), ']');
    }
}
