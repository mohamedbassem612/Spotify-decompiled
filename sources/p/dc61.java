package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dc61 implements xpw {
    public final p40 O0;
    public final poy0 P0;
    public final psw R0;
    public final zob1 X;
    public final q8n Y;
    public final q8n Z;
    public final nfa0 a;
    public final Context b;
    public final String c;
    public final iac0 d;
    public final koc0 e;
    public final iyc0 f;
    public final m021 g;
    public final xp4 h;
    public final kt91 i;
    public final lzn0 t;
    public final bpb1 N0 = gio1.b(w7x.a);
    public final eih1 Q0 = new eih1();

    public dc61(nfa0 nfa0Var, Context context, String str, iac0 iac0Var, koc0 koc0Var, iyc0 iyc0Var, m021 m021Var, xp4 xp4Var, kt91 kt91Var, lzn0 lzn0Var, zob1 zob1Var, q8n q8nVar, q8n q8nVar2) {
        this.a = nfa0Var;
        this.b = context;
        this.c = str;
        this.d = iac0Var;
        this.e = koc0Var;
        this.f = iyc0Var;
        this.g = m021Var;
        this.h = xp4Var;
        this.i = kt91Var;
        this.t = lzn0Var;
        this.X = zob1Var;
        this.Y = q8nVar;
        this.Z = q8nVar2;
        this.O0 = new p40(m021Var);
        this.P0 = h4o1.q(new ac61(this, (byte) 0), s861.e1, qr51.Q0, q8nVar2, new ac61(this, (byte) 1));
        j2i j2iVar = new j2i(274170791, new hg31(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.R0 = new psw(j2iVar, (byte) 0);
    }

    public static Object g(dc61 dc61Var, vb61 vb61Var, String str, ou80 ou80Var, a8d1 a8d1Var, int i) {
        return dc61Var.f(vb61Var, str, (i & 2) != 0 ? null : ou80Var, new sg0(1, null, (byte) 28), w661.f, a8d1Var);
    }

    public final rqw a() {
        return this.Q0;
    }

    public final jsw c() {
        return this.R0;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0255  */
    /* JADX WARN: Code duplicated, block: B:129:0x0257  */
    /* JADX WARN: Code duplicated, block: B:133:0x026e  */
    /* JADX WARN: Code duplicated, block: B:139:0x027b  */
    public final void e(int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var, boolean z) {
        int i2;
        c380 c380Var2;
        x340 x340Var;
        int i3;
        Integer num;
        xtb0 xtb0Var;
        boolean z2;
        boolean z3;
        c380 c380VarA;
        boolean z4;
        boolean z5;
        Object objT;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-801614748);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var2.g(c380Var) : x340Var2.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(this) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            Object objT2 = x340Var2.T();
            ljx0 ljx0Var = ljx0.a;
            if (objT2 == obj) {
                objT2 = v8r.q(ljx0Var);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object[] objArr = new Object[0];
            Object objT3 = x340Var2.T();
            if (objT3 == obj) {
                objT3 = w661.e;
                x340Var2.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT3, x340Var2, 48);
            int i4 = i2 & 14;
            boolean zI = (i4 == 4 || ((i2 & 8) != 0 && x340Var2.i(c380Var))) | x340Var2.i(xtb0VarA);
            Object objT4 = x340Var2.T();
            if (zI || objT4 == obj) {
                objT4 = new lc41(c380Var, xtb0VarA, (lnm) null, (byte) 24);
                x340Var2.s0(objT4);
            }
            int i5 = 8 | i4;
            qxd0.t(c380Var, x340Var2, (vu30) objT4);
            boolean z6 = i4 == 4 || ((i2 & 8) != 0 && x340Var2.g(c380Var));
            Object objT5 = x340Var2.T();
            if (z6 || objT5 == obj) {
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(((vb61) it.next()).a);
                    i5 = i5;
                }
                i3 = i5;
                objT5 = Integer.valueOf(o7h.Z0(arrayList).hashCode());
                x340Var2.s0(objT5);
            } else {
                i3 = i5;
            }
            int iIntValue = ((Number) objT5).intValue();
            Integer num2 = (Integer) ven0Var2.getValue();
            boolean z7 = num2 == null || num2.intValue() != iIntValue;
            Integer numValueOf = Integer.valueOf(iIntValue);
            boolean zI2 = (i4 == 4 || ((i2 & 8) != 0 && x340Var2.i(c380Var))) | x340Var2.i(ven0Var) | x340Var2.h(z7) | x340Var2.i(ven0Var2) | x340Var2.e(iIntValue);
            Object objT6 = x340Var2.T();
            if (zI2 || objT6 == obj) {
                num = numValueOf;
                xtb0Var = xtb0VarA;
                z2 = false;
                f1d0 f1d0Var = new f1d0(c380Var, z7, iIntValue, ven0Var, ven0Var2, null);
                x340Var2.s0(f1d0Var);
                objT6 = f1d0Var;
            } else {
                xtb0Var = xtb0VarA;
                num = numValueOf;
                z2 = false;
            }
            qxd0.t(num, x340Var2, (vu30) objT6);
            if (((ljx0) ven0Var.getValue()) == ljx0.d) {
                x340Var2.i0(-885450505);
                boolean zI3 = x340Var2.i(ven0Var);
                Object objT7 = x340Var2.T();
                if (zI3 || objT7 == obj) {
                    objT7 = new g8y0(ven0Var, (byte) 18);
                    x340Var2.s0(objT7);
                }
                oho1.e(c380Var, this.O0, iu30Var, (Function0) objT7, qim0Var, x340Var2, i3 | ((i2 << 3) & 896) | (57344 & (i2 << 6)));
                c380Var2 = c380Var;
                x340Var2.r(z2);
                x340Var = x340Var2;
            } else {
                c380Var2 = c380Var;
                x340Var2.i0(-885156625);
                if (((ljx0) ven0Var.getValue()) == ljx0Var) {
                    c380VarA = fg91.b;
                } else {
                    if (((ljx0) ven0Var.getValue()) == ljx0.b || ((ljx0) ven0Var.getValue()) == ljx0.c) {
                        z3 = true;
                        c380VarA = mqo1.A(o7h.d1(c380Var2, 1));
                    } else {
                        c380VarA = c380Var2;
                    }
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    zzq0 zzq0Var = new zzq0(16.0f, 6.0f, 16.0f, 16.0f);
                    if ((i2 & 7168) == 2048) {
                        z4 = z3;
                    } else {
                        z4 = z2;
                    }
                    boolean zI4 = z4 | x340Var2.i(ven0Var) | x340Var2.i(this) | x340Var2.i(c380VarA);
                    if ((i2 & 112) != 32) {
                        z3 = z2;
                    }
                    z5 = z3 | zI4;
                    objT = x340Var2.T();
                    if (z5 || objT == obj) {
                        o96 o96Var = new o96(z, c380VarA, ven0Var, this, iu30Var);
                        x340Var2.s0(o96Var);
                        objT = o96Var;
                    }
                    x340Var = x340Var2;
                    too1.b(qim0VarF, xtb0Var, zzq0Var, (iu30) objT, x340Var, 0, 0);
                    x340Var.r(z2);
                }
                z3 = true;
                qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var2).b;
                cvx cvxVar6 = cbx.b(x340Var2).b;
                cvx cvxVar7 = cbx.b(x340Var2).b;
                cvx cvxVar8 = cbx.b(x340Var2).b;
                zzq0 zzq0Var2 = new zzq0(16.0f, 6.0f, 16.0f, 16.0f);
                if ((i2 & 7168) == 2048) {
                    z4 = z3;
                } else {
                    z4 = z2;
                }
                boolean zI5 = z4 | x340Var2.i(ven0Var) | x340Var2.i(this) | x340Var2.i(c380VarA);
                if ((i2 & 112) != 32) {
                    z3 = z2;
                }
                z5 = z3 | zI5;
                objT = x340Var2.T();
                if (z5) {
                    o96 o96Var2 = new o96(z, c380VarA, ven0Var, this, iu30Var);
                    x340Var2.s0(o96Var2);
                    objT = o96Var2;
                } else {
                    o96 o96Var3 = new o96(z, c380VarA, ven0Var, this, iu30Var);
                    x340Var2.s0(o96Var3);
                    objT = o96Var3;
                }
                x340Var = x340Var2;
                too1.b(qim0VarF2, xtb0Var, zzq0Var2, (iu30) objT, x340Var, 0, 0);
                x340Var.r(z2);
            }
        } else {
            c380Var2 = c380Var;
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(this, c380Var2, iu30Var, qim0Var, z, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (h(r10, r12, r3) == r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r2.invoke(r3) == r9) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(p.vb61 r19, java.lang.String r20, p.ou80 r21, p.sg0 r22, kotlin.jvm.functions.Function0 r23, p.onm r24) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dc61.f(p.vb61, java.lang.String, p.ou80, p.sg0, kotlin.jvm.functions.Function0, p.onm):java.lang.Object");
    }

    public final mqw getBehavior() {
        return this.P0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(vb61 vb61Var, String str, onm onmVar) {
        cc61 cc61Var;
        dc61 dc61Var;
        vb61 vb61Var2;
        if (onmVar instanceof cc61) {
            cc61Var = (cc61) onmVar;
            int i = cc61Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cc61Var.d = i - Integer.MIN_VALUE;
            } else {
                cc61Var = new cc61(this, onmVar);
            }
        } else {
            cc61Var = new cc61(this, onmVar);
        }
        Object obj = cc61Var.b;
        int i2 = cc61Var.d;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj);
            dc61Var = this;
            i3y0 i3y0Var = new i3y0((Object) dc61Var, (Object) vb61Var, (Object) str, lnmVar, (byte) 22);
            cc61Var.a = vb61Var;
            cc61Var.d = 1;
            Object objY = fn31.Y(dc61Var.Y, i3y0Var, cc61Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            vb61Var2 = vb61Var;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vb61Var2 = cc61Var.a;
            hm5.M(obj);
            dc61Var = this;
        }
        String str2 = vb61Var2.a;
        m021 m021Var = dc61Var.g;
        i8h1 i8h1Var = (i8h1) m021Var.b;
        opl0 opl0Var = (opl0) m021Var.c;
        x6h1 x6h1VarC = opl0Var.c.c();
        x6h1VarC.i.add(new a7h1("retry_snackbar", str2, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = opl0Var.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
        return rih1.a;
    }
}
