package p;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sl81 {
    public final tm81 a;
    public final idd1 b;
    public Boolean c;
    public final /* synthetic */ ul81 d;

    public sl81(ul81 ul81Var, tm81 tm81Var) {
        this.d = ul81Var;
        this.a = tm81Var;
        this.b = new idd1(new fh61(ul81Var, this, (byte) 26));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(onm onmVar) {
        ql81 ql81Var;
        ul81 ul81Var = this.d;
        vrn vrnVar = ul81Var.a;
        if (onmVar instanceof ql81) {
            ql81Var = (ql81) onmVar;
            int i = ql81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ql81Var.c = i - Integer.MIN_VALUE;
            } else {
                ql81Var = new ql81(this, onmVar);
            }
        } else {
            ql81Var = new ql81(this, onmVar);
        }
        Object objInvoke = ql81Var.a;
        int i2 = ql81Var.c;
        tm81 tm81Var = this.a;
        if (i2 == 0) {
            hm5.M(objInvoke);
            iu30 iu30Var = tm81Var.b;
            ql81Var.c = 1;
            objInvoke = iu30Var.invoke(ql81Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objInvoke);
        }
        LocalDate localDate = (LocalDate) objInvoke;
        if (localDate == null) {
            return Boolean.FALSE;
        }
        yqg yqgVar = vrnVar.b;
        if (Instant.ofEpochMilli(yqgVar.b()).atZone(ZoneId.of(yqgVar.g().getID())).toLocalDate().compareTo(localDate) >= 0) {
            return Boolean.FALSE;
        }
        Instant instantB = ul81Var.b.b(tm81Var);
        if (instantB == null) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(ChronoUnit.DAYS.between(instantB, Instant.ofEpochMilli(vrnVar.b.b())) < 30);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        rl81 rl81Var;
        Boolean bool;
        if (onmVar instanceof rl81) {
            rl81Var = (rl81) onmVar;
            int i = rl81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rl81Var.c = i - Integer.MIN_VALUE;
            } else {
                rl81Var = new rl81(this, onmVar);
            }
        } else {
            rl81Var = new rl81(this, onmVar);
        }
        Object objA = rl81Var.a;
        int i2 = rl81Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            bool = this.c;
            if (bool == null) {
                rl81Var.c = 1;
                objA = a(rl81Var);
                Object obj = d9n.a;
                if (objA == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(bool.booleanValue());
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objA);
        bool = (Boolean) objA;
        bool.getClass();
        this.c = bool;
        return Boolean.valueOf(bool.booleanValue());
    }
}
