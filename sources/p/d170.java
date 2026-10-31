package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d170 implements wf80 {
    public static final bv40 a;
    public static final bv40 b;
    public static final bv40 c;
    public static final bv40 d;
    public static final bv40 e;
    public static final bv40 f;

    static {
        cp5 cp5VarI = bv40.i();
        cp5VarI.e('A', 'Z');
        cp5VarI.e('a', 'z');
        bv40 bv40Var = new bv40(cp5VarI);
        a = bv40Var;
        b = bv40Var;
        cp5 cp5VarO = bv40Var.o();
        cp5VarO.e('0', '9');
        cp5VarO.a('-');
        c = new bv40(cp5VarO);
        cp5 cp5VarO2 = bv40Var.o();
        cp5VarO2.a('_');
        cp5VarO2.a(':');
        bv40 bv40Var2 = new bv40(cp5VarO2);
        d = bv40Var2;
        cp5 cp5VarO3 = bv40Var2.o();
        cp5VarO3.e('0', '9');
        cp5VarO3.a('.');
        cp5VarO3.a('-');
        e = new bv40(cp5VarO3);
        cp5 cp5VarI2 = bv40.i();
        cp5VarI2.a(' ');
        cp5VarI2.a('\t');
        cp5VarI2.a('\n');
        cp5VarI2.a((char) 11);
        cp5VarI2.a('\f');
        cp5VarI2.a('\r');
        cp5VarI2.a('\"');
        cp5VarI2.a('\'');
        cp5VarI2.a('=');
        cp5VarI2.a('<');
        cp5VarI2.a('>');
        cp5VarI2.a('`');
        f = new bv40(cp5VarI2);
    }

    public static zhq0 b(d9z0 d9z0Var, yr31 yr31Var) {
        String strB = yr31Var.d(d9z0Var, yr31Var.l()).b();
        c170 c170Var = new c170();
        c170Var.g = strB;
        return new zhq0(c170Var, yr31Var.l(), (byte) 11);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0090 A[EDGE_INSN: B:115:0x0090->B:35:0x0090 BREAK  A[LOOP:1: B:30:0x007c->B:40:0x009a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a A[LOOP:1: B:30:0x007c->B:40:0x009a, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0097 -> B:6:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p.wf80
    public final p.zhq0 a(p.ug80 r9) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d170.a(p.ug80):p.zhq0");
    }
}
