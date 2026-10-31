package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ca70 implements de70 {
    public static final t380 a = t380.t(k970.b.a, gb70.b.a);

    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:70:0x00eb  */
    public final y570 b(y570 y570Var) {
        kd70 kd70Var;
        String str;
        ha70 ha70Var;
        j4b1 j4b1Var;
        vxo1 vxo1VarI;
        jd70 jd70Var;
        if (!a.contains(y570Var.h().a())) {
            return y570Var;
        }
        me70 me70VarT = y570Var.t();
        ld70 ld70Var = ((dd70) y570Var.k()).a.c;
        if (me70VarT != null && ld70Var != null && ((str = (kd70Var = ld70Var.a).d) == null || !kd70Var.e.s().contains("style"))) {
            String str2 = ((od70) me70VarT).a.a;
            if (str2 != null) {
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str2);
                v5b1 v5b1Var = s4b1VarX.d;
                b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
                if (type == nyu0.e || type == wyu0.f) {
                    j4b1Var = j4b1.t5;
                } else {
                    int iOrdinal = s4b1VarX.c.ordinal();
                    if (iOrdinal == 30) {
                        j4b1Var = j4b1.O0;
                    } else if (iOrdinal == 44) {
                        j4b1Var = j4b1.f1;
                    } else if (iOrdinal == 111) {
                        j4b1Var = j4b1.x1;
                    } else if (iOrdinal == 173) {
                        j4b1Var = j4b1.f1;
                    } else if (iOrdinal == 704) {
                        j4b1Var = j4b1.n7;
                    } else if (iOrdinal == 844 || iOrdinal == 860) {
                        j4b1Var = j4b1.A5;
                    } else if (iOrdinal != 900) {
                        j4b1Var = iOrdinal != 926 ? j4b1.b7 : j4b1.b7;
                    } else {
                        j4b1Var = j4b1.H5;
                    }
                }
                int iOrdinal2 = uic.x(str2).c.ordinal();
                if (iOrdinal2 == 44 || iOrdinal2 == 173 || iOrdinal2 == 704) {
                    ha70Var = ha70.CIRCULAR;
                } else if (iOrdinal2 == 755 || iOrdinal2 == 757 || iOrdinal2 == 752) {
                    ha70Var = ha70.SQUARE_WITH_RIPPLE;
                } else {
                    ha70Var = iOrdinal2 != 753 ? ha70.DEFAULT : ha70.CIRCULAR_WITH_RIPPLE;
                }
            } else {
                ha70Var = null;
                j4b1Var = null;
            }
            if (str != null) {
                vxo1VarI = kd70Var;
            } else {
                String strName = j4b1Var != null ? j4b1Var.name() : null;
                if (u890.j(str, strName)) {
                    vxo1VarI = kd70Var;
                } else {
                    jd70Var = new jd70();
                    jd70Var.c = kd70Var.c;
                    jd70Var.e = kd70Var.e.a;
                    jd70Var.d = strName;
                }
            }
            if (ha70Var != null && !kd70Var.e.s().contains("style")) {
                vxo1VarI = jd70Var;
                vxo1VarI = vxo1VarI.i(ha70Var.a);
            }
            vxo1VarI = jd70Var;
            vxo1VarI = jd70Var;
            fd70 builder = y570Var.toBuilder();
            cd70 cd70Var = ((dd70) y570Var.k()).a;
            ld70 ld70VarJ = vxo1VarI.j();
            boolean zJ = u890.j(cd70Var.c, ld70VarJ);
            uwo1 uwo1Var = cd70Var;
            if (!zJ) {
                bd70 bd70Var = new bd70(cd70Var);
                bd70Var.c = ld70VarJ;
                uwo1Var = bd70Var;
            }
            builder.getClass();
            y570Var = builder.F(uwo1Var.k()).x();
        }
        ba70 ba70Var = (ba70) aa70.a.o(y570Var.g().B("label")).h();
        return y570Var.toBuilder().p("label", ba70Var != null ? ba70Var.a : "").x();
    }
}
