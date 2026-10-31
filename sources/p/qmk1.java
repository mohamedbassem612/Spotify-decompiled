package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qmk1 extends g810 {
    public final nmk1 c;

    public qmk1(nmk1 nmk1Var) {
        this.c = nmk1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        omk1 omk1Var;
        Object objB;
        if (onmVar instanceof omk1) {
            omk1Var = (omk1) onmVar;
            int i = omk1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                omk1Var.c = i - Integer.MIN_VALUE;
            } else {
                omk1Var = new omk1(this, onmVar);
            }
        } else {
            omk1Var = new omk1(this, onmVar);
        }
        Object obj = omk1Var.a;
        int i2 = omk1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            omk1Var.c = 1;
            objB = this.c.b(omk1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objB = ((e331) obj).a;
        }
        boolean z = objB instanceof m231;
        if (z) {
            return new ht61((Integer) null, 0);
        }
        Boolean bool = (Boolean) (z ? null : objB);
        return new it61(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
    }

    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, tv80 tv80Var, f810 f810Var) {
        return d(((Boolean) obj2).booleanValue(), f810Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(boolean z, onm onmVar) {
        pmk1 pmk1Var;
        Object objC;
        if (onmVar instanceof pmk1) {
            pmk1Var = (pmk1) onmVar;
            int i = pmk1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pmk1Var.d = i - Integer.MIN_VALUE;
            } else {
                pmk1Var = new pmk1(this, onmVar);
            }
        } else {
            pmk1Var = new pmk1(this, onmVar);
        }
        Object obj = pmk1Var.b;
        int i2 = pmk1Var.d;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            hm5.M(obj);
            pmk1Var.a = z;
            pmk1Var.d = 1;
            objC = this.c.c(z, pmk1Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = pmk1Var.a;
            hm5.M(obj);
            objC = ((e331) obj).a;
        }
        boolean z2 = objC instanceof m231;
        if (z2) {
            return new ht61((Integer) null, 0);
        }
        Boolean bool = (Boolean) (z2 ? null : objC);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else if (!z) {
            zBooleanValue = false;
        }
        return new it61(Boolean.valueOf(zBooleanValue));
    }
}
