package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gb5 {
    public final o95 a;
    public final ven0 b;
    public final ven0 c;
    public final ven0 d;

    public gb5(o95 o95Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3) {
        this.a = o95Var;
        this.b = ven0Var;
        this.c = ven0Var2;
        this.d = ven0Var3;
    }

    public final o4w a() {
        o4w o4wVar = (o4w) this.d.getValue();
        if (o4wVar != null) {
            return o4wVar;
        }
        o4w o4wVar2 = (o4w) this.b.getValue();
        ven0 ven0Var = this.c;
        if (o4wVar2 == null) {
            return (o4w) ven0Var.getValue();
        }
        o4w o4wVar3 = (o4w) ven0Var.getValue();
        if (o4wVar3 == null) {
            return null;
        }
        float fFloatValue = ((Number) this.a.e()).floatValue();
        return fFloatValue >= 1.0f ? o4wVar3 : lrn1.t(o4wVar2, o4wVar3, fFloatValue);
    }

    public final o4w b() {
        o4w o4wVarA = a();
        if (o4wVarA == null) {
            return null;
        }
        o4w o4wVarA2 = o4w.a(o4wVarA, (ArrayList) null, (ArrayList) null, (Integer) null, 27);
        d(o4wVarA2);
        return o4wVarA2;
    }

    public final boolean c() {
        o4w o4wVar;
        o4w o4wVar2;
        return (((Number) this.a.e()).floatValue() >= 1.0f || this.d.getValue() != null || (o4wVar = (o4w) this.b.getValue()) == null || (o4wVar2 = (o4w) this.c.getValue()) == null || o4wVar.b().size() == o4wVar2.b().size()) ? false : true;
    }

    public final void d(o4w o4wVar) {
        this.d.setValue(o4wVar);
        this.c.setValue(o4wVar);
    }
}
