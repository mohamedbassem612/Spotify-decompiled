package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zon1 extends c8 {
    public final Object b;
    public int c;
    public final /* synthetic */ rpn1 d;

    public zon1(rpn1 rpn1Var, int i) {
        super((byte) 1, false);
        this.d = rpn1Var;
        Object obj = rpn1.t;
        this.b = rpn1Var.b()[i];
        this.c = i;
    }

    public final void a() {
        int i = this.c;
        Object obj = this.b;
        rpn1 rpn1Var = this.d;
        if (i != -1 && i < rpn1Var.size()) {
            if (poo1.K(obj, rpn1Var.b()[this.c])) {
                return;
            }
        }
        Object obj2 = rpn1.t;
        this.c = rpn1Var.h(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        rpn1 rpn1Var = this.d;
        Map mapD = rpn1Var.d();
        if (mapD != null) {
            return mapD.get(this.b);
        }
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return rpn1Var.c()[i];
    }

    @Override // p.c8, java.util.Map.Entry
    public final Object setValue(Object obj) {
        rpn1 rpn1Var = this.d;
        Map mapD = rpn1Var.d();
        Object obj2 = this.b;
        if (mapD != null) {
            return mapD.put(obj2, obj);
        }
        a();
        int i = this.c;
        if (i == -1) {
            rpn1Var.put(obj2, obj);
            return null;
        }
        Object obj3 = rpn1Var.c()[i];
        rpn1Var.c()[this.c] = obj;
        return obj3;
    }
}
