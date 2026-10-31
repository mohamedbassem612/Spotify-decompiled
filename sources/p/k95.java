package p;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class k95 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k95(ArrayList arrayList, n811 n811Var, List list, int i, lpb0 lpb0Var) {
        this.a = (byte) 4;
        this.b = arrayList;
        this.c = n811Var;
        this.d = list;
        this.e = lpb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                o95 o95Var = (o95) obj5;
                ie5 ie5Var = (ie5) obj4;
                iu30 iu30Var = (iu30) obj3;
                l811 l811Var = (l811) obj2;
                de5 de5Var = (de5) obj;
                ie5 ie5Var2 = o95Var.c;
                wwo1.N(de5Var, ie5Var2);
                hrr0 hrr0Var = de5Var.e;
                Object objC = o95Var.c(hrr0Var.getValue());
                if (!u890.j(objC, hrr0Var.getValue())) {
                    ie5Var2.b.setValue(objC);
                    ie5Var.b.setValue(objC);
                    if (iu30Var != null) {
                        iu30Var.invoke(o95Var);
                    }
                    de5Var.a();
                    l811Var.a = true;
                } else if (iu30Var != null) {
                    iu30Var.invoke(o95Var);
                }
                return rih1Var;
            case 1:
                r1c0 r1c0Var = (r1c0) obj5;
                z8e1 z8e1Var = (z8e1) obj4;
                c8e1 c8e1Var = (c8e1) obj3;
                x180 x180Var = (x180) obj2;
                if (r1c0Var.b()) {
                    jut jutVar = r1c0Var.d;
                    l7n l7nVar = r1c0Var.v;
                    l7n l7nVar2 = r1c0Var.w;
                    p811 p811Var = new p811();
                    d5e1 d5e1Var = new d5e1(jutVar, l7nVar, p811Var, b2);
                    vdt0 vdt0Var = z8e1Var.a;
                    vdt0Var.h(c8e1Var, x180Var, d5e1Var, l7nVar2);
                    c9e1 c9e1Var = new c9e1(z8e1Var, vdt0Var);
                    z8e1Var.b.set(c9e1Var);
                    p811Var.a = c9e1Var;
                    r1c0Var.e = c9e1Var;
                }
                return new tj4((byte) 9);
            case 2:
                o811 o811Var = (o811) obj4;
                p811 p811Var2 = (p811) obj3;
                be50 be50Var = (be50) obj2;
                lsl lslVar = (lsl) obj;
                x9h x9hVar = ((zk70) obj5).Q0;
                long jA = x9hVar != null ? x9hVar.a() : u7h.k;
                long j = o811Var.a;
                int i = u7h.l;
                if (!z4h1.b(j, jA)) {
                    o811Var.a = jA;
                    f2b f2bVar = jA != 16 ? new f2b(jA, 5) : null;
                    p811Var2.a = f2bVar;
                    fe50 fe50Var = be50Var.a;
                    if (!u890.j(fe50Var.l(), f2bVar)) {
                        fe50Var.H(f2bVar);
                    }
                }
                m5n1.r(lslVar, be50Var);
                return rih1Var;
            case 3:
                db80 db80Var = (db80) obj4;
                m811 m811Var = (m811) obj3;
                c9n c9nVar = (c9n) obj2;
                long jLongValue = ((Long) obj).longValue();
                tob1 tob1Var = (tob1) ((ven0) obj5).getValue();
                long jLongValue2 = tob1Var != null ? ((Number) tob1Var.getValue()).longValue() : jLongValue;
                long j2 = db80Var.c;
                bfn0 bfn0Var = db80Var.a;
                if (j2 == Long.MIN_VALUE || m811Var.a != wwo1.C(c9nVar.J())) {
                    db80Var.c = jLongValue;
                    Object[] objArr = bfn0Var.a;
                    int i2 = bfn0Var.c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((cb80) objArr[i3]).g = true;
                    }
                    m811Var.a = wwo1.C(c9nVar.J());
                }
                float f = m811Var.a;
                if (f == 0.0f) {
                    Object[] objArr2 = bfn0Var.a;
                    int i4 = bfn0Var.c;
                    while (b2 < i4) {
                        cb80 cb80Var = (cb80) objArr2[b2];
                        cb80Var.d.setValue(cb80Var.e.c);
                        cb80Var.g = true;
                        b2++;
                    }
                } else {
                    long j3 = (long) ((jLongValue2 - db80Var.c) / f);
                    Object[] objArr3 = bfn0Var.a;
                    int i5 = bfn0Var.c;
                    boolean z = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        cb80 cb80Var2 = (cb80) objArr3[i6];
                        boolean zD = cb80Var2.f;
                        if (!zD) {
                            cb80Var2.i.b.setValue(Boolean.FALSE);
                            if (cb80Var2.g) {
                                cb80Var2.g = false;
                                cb80Var2.h = j3;
                            }
                            long j4 = j3 - cb80Var2.h;
                            cb80Var2.d.setValue(cb80Var2.e.g(j4));
                            zD = cb80Var2.e.d(j4);
                            cb80Var2.f = zD;
                        }
                        if (!zD) {
                            z = false;
                        }
                    }
                    db80Var.d.setValue(Boolean.valueOf(!z));
                }
                return rih1Var;
            case 4:
                List list = (List) obj5;
                n811 n811Var = (n811) obj4;
                List list2 = (List) obj3;
                lpb0 lpb0Var = (lpb0) obj2;
                kov0 kov0Var = (kov0) obj;
                rlc1 rlc1Var = kov0Var.e;
                int iB = rlc1Var != null ? rlc1Var.b() : 0;
                int iA = 0;
                for (int i7 = 0; i7 < iB; i7++) {
                    qqq0 qqq0Var = lpb0Var.r;
                    rlc1 rlc1Var2 = kov0Var.e;
                    iA += (int) (qqq0Var == qqq0.a ? 4294967295L & (rlc1Var2 != null ? rlc1Var2.a(i7) : 0L) : (rlc1Var2 != null ? rlc1Var2.a(i7) : 0L) >> 32);
                }
                if (list != null) {
                    list.add(Integer.valueOf(iA));
                }
                if (n811Var.a != list2.size()) {
                    n811Var.a++;
                }
                return rih1Var;
            case 5:
                tsb0 tsb0Var = (tsb0) obj5;
                tsb0Var.c = new rl1((dsb0) obj4, (slc1) obj3, (mov0) obj2, (byte) 27);
                return new k6r(tsb0Var, (byte) 18);
            case 6:
                m811 m811Var2 = (m811) obj5;
                wnm0 wnm0Var = (wnm0) obj4;
                cu41 cu41Var = (cu41) obj3;
                kl4 kl4Var = (kl4) obj2;
                de5 de5Var2 = (de5) obj;
                float fFloatValue = ((Number) de5Var2.e.getValue()).floatValue() - m811Var2.a;
                if (dsa0.q(fFloatValue)) {
                    if (((Boolean) kl4Var.invoke(Float.valueOf(m811Var2.a))).booleanValue()) {
                        de5Var2.a();
                    }
                } else if (dsa0.q(fFloatValue - wnm0Var.c(cu41Var, fFloatValue))) {
                    m811Var2.a += fFloatValue;
                    if (((Boolean) kl4Var.invoke(Float.valueOf(m811Var2.a))).booleanValue()) {
                        de5Var2.a();
                    }
                } else {
                    de5Var2.a();
                }
                return rih1Var;
            case 7:
                hyy0 hyy0Var = (hyy0) obj5;
                Intent intent = (Intent) obj4;
                qy11 qy11Var = (qy11) obj3;
                zio1 zio1Var = (zio1) obj2;
                String str = (String) obj;
                if (str == null) {
                    str = "com.google.android.wearable.app";
                }
                ((Context) ((kdy0) hyy0Var.b).c).sendBroadcast(kdy0.f(intent, qy11Var, zio1Var.a, str));
                return rih1Var;
            default:
                Function0 function0 = (Function0) obj4;
                r7e1 r7e1Var = (r7e1) obj3;
                ree1 ree1Var = (ree1) obj2;
                r3e1 r3e1Var = (r3e1) obj;
                ((Function0) obj5).invoke();
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    r3e1Var.close();
                }
                r7e1Var.x(ree1Var);
                return rih1Var;
        }
    }

    public /* synthetic */ k95(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ k95(hyy0 hyy0Var, kdy0 kdy0Var, Intent intent, qy11 qy11Var, zio1 zio1Var) {
        this.a = (byte) 7;
        this.b = hyy0Var;
        this.c = intent;
        this.d = qy11Var;
        this.e = zio1Var;
    }
}
