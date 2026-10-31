package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class g810 extends ov61 {
    public final bpb1 a;
    public final mr20 b;

    public g810() {
        lnm lnmVar = null;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.a = bpb1VarB;
        pbg pbgVar = new pbg(this, (lnm) null, (byte) 22);
        jt61 jt61Var = (jt61) bpb1VarB.getValue();
        this.b = (jt61Var != null ? jt61Var.a() : null) != null ? new any(bpb1VarB, (byte) 18) : h4p1.g(new n641((Object) bpb1VarB, (Object) pbgVar, lnmVar, (byte) 24));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(g810 g810Var, Object obj, Object obj2, tv80 tv80Var, onm onmVar) {
        f810 f810Var;
        if (onmVar instanceof f810) {
            f810Var = (f810) onmVar;
            int i = f810Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                f810Var.e = i - Integer.MIN_VALUE;
            } else {
                f810Var = new f810(g810Var, onmVar);
            }
        } else {
            f810Var = new f810(g810Var, onmVar);
        }
        Object objC = f810Var.c;
        int i2 = f810Var.e;
        rih1 rih1Var = d9n.a;
        if (i2 == 0) {
            hm5.M(objC);
            f810Var.a = g810Var;
            f810Var.e = 1;
            objC = g810Var.c(obj, obj2, tv80Var, f810Var);
            if (objC != rih1Var) {
            }
            return rih1Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it61 it61Var = f810Var.b;
            hm5.M(objC);
            return it61Var;
        }
        g810Var = f810Var.a;
        hm5.M(objC);
        it61 it61Var2 = (jt61) objC;
        if (it61Var2 instanceof it61) {
            bpb1 bpb1Var = g810Var.a;
            f810Var.a = null;
            f810Var.b = it61Var2;
            f810Var.e = 2;
            bpb1Var.emit(it61Var2, f810Var);
            if (rih1.a == rih1Var) {
                return rih1Var;
            }
        }
        return it61Var2;
    }

    public abstract Object a(onm onmVar);

    public abstract Object c(Object obj, Object obj2, tv80 tv80Var, f810 f810Var);

    public final mr20 getValue() {
        return this.b;
    }

    public final Object setValue(Object obj, Object obj2, tv80 tv80Var, lnm lnmVar) {
        return b(this, obj, obj2, tv80Var, (onm) lnmVar);
    }
}
