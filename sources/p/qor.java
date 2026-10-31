package p;

import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qor implements s4j0 {
    public final ynb0 a;
    public final kly0 b;
    public final mwb c;
    public final oqs d;
    public final q8n e;
    public final llm f;
    public final bpb1 g;
    public final xe01 h;
    public final bpb1 i;
    public final LinkedHashMap j;
    public final xgn0 k;
    public final xe01 l;
    public final xe01 m;

    public qor(ynb0 ynb0Var, a8p a8pVar, mwb mwbVar, oqs oqsVar, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = a8pVar;
        this.c = mwbVar;
        this.d = oqsVar;
        this.e = q8nVar;
        llm llmVarE = smo1.e(ha71.A(op71.f(), q8nVar));
        this.f = llmVarE;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.g = bpb1VarB;
        xe01 xe01VarH = d5p1.h(bpb1VarB);
        this.h = xe01VarH;
        bpb1 bpb1VarB2 = gio1.b(Boolean.FALSE);
        this.i = bpb1VarB2;
        this.j = new LinkedHashMap();
        this.k = ygn0.a();
        c921.y(llmVarE, (o8n) null, 0, new n1o(this, (lnm) null, (byte) 12), 3);
        this.l = d5p1.h(bpb1VarB2);
        this.m = d5p1.t(new xr0(xe01VarH, (byte) 10), llmVarE, new alb1(0L, Long.MAX_VALUE), (Object) null);
    }

    public final void a(nqs nqsVar, kub1 kub1Var) {
        c921.y(this.f, (o8n) null, 0, new du2(this, nqsVar, kub1Var, (lnm) null, (byte) 5), 3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:52:0x0176  */
    /* JADX WARN: Code duplicated, block: B:54:0x017c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0182  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0192  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01de  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0220  */
    public final Object b(nqs nqsVar, t6l t6lVar, m6l m6lVar, Long l, d3j0 d3j0Var, onm onmVar) throws NoWhenBranchMatchedException {
        lor lorVar;
        k6w0 k6w0Var;
        t6l t6lVar2;
        Long l2;
        m6l m6lVar2;
        Object next;
        Long l3;
        zg91 zg91Var;
        m6l m6lVar3;
        t6l t6lVar3;
        nqs nqsVar2;
        k6w0 k6w0Var2;
        boolean zBooleanValue;
        kh91 kh91Var;
        snb1 snb1Var;
        k6w0 k6w0Var3;
        zg91 zg91Var2;
        nqs nqsVarA;
        k6w0 k6w0Var4;
        boolean z;
        Long l4;
        m6l m6lVar4;
        t6l t6lVar4;
        nqs nqsVar3;
        ah91 ah91VarI;
        nqs nqsVar4 = nqsVar;
        if (onmVar instanceof lor) {
            lorVar = (lor) onmVar;
            int i = lorVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                lorVar.t = i - Integer.MIN_VALUE;
            } else {
                lorVar = new lor(this, onmVar);
            }
        } else {
            lorVar = new lor(this, onmVar);
        }
        Object obj = lorVar.h;
        int i2 = lorVar.t;
        bpb1 bpb1Var = this.g;
        oqs oqsVar = this.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            k6w0Var = new k6w0(p4j0.a, d3j0Var, new ro8(nqsVar4, (lnm) null, (byte) 8));
            lorVar.a = nqsVar4;
            lorVar.b = t6lVar;
            lorVar.c = m6lVar;
            lorVar.d = l;
            lorVar.e = k6w0Var;
            lorVar.t = 1;
            if (nqsVar4.g(lorVar) != d9nVar) {
                t6lVar2 = t6lVar;
                l2 = l;
                m6lVar2 = m6lVar;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            k6w0 k6w0Var5 = lorVar.e;
            l2 = lorVar.d;
            m6lVar2 = lorVar.c;
            t6lVar2 = lorVar.b;
            nqs nqsVar5 = lorVar.a;
            hm5.M(obj);
            k6w0Var = k6w0Var5;
            nqsVar4 = nqsVar5;
        } else {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i2 == 3) {
                zg91 zg91Var3 = lorVar.f;
                k6w0 k6w0Var6 = lorVar.e;
                Long l5 = lorVar.d;
                m6l m6lVar5 = lorVar.c;
                t6l t6lVar5 = lorVar.b;
                nqs nqsVar6 = lorVar.a;
                hm5.M(obj);
                zg91Var = zg91Var3;
                k6w0Var2 = k6w0Var6;
                l3 = l5;
                m6lVar3 = m6lVar5;
                t6lVar3 = t6lVar5;
                nqsVar2 = nqsVar6;
                zBooleanValue = ((Boolean) obj).booleanValue();
                kh91Var = (kh91) oqsVar.a().a.getValue();
                if (!zBooleanValue) {
                    a(nqsVar2, kub1.d);
                    return rih1Var;
                }
                if (kh91Var.a()) {
                    a(nqsVar2, f7p1.g(kh91Var));
                    return rih1Var;
                }
                snb1Var = (snb1) bpb1Var.getValue();
                if (snb1Var != null) {
                    nqsVarA = snb1Var.a();
                    lorVar.a = nqsVar2;
                    lorVar.b = t6lVar3;
                    lorVar.c = m6lVar3;
                    lorVar.d = l3;
                    lorVar.e = k6w0Var2;
                    lorVar.f = zg91Var;
                    lorVar.g = zBooleanValue;
                    lorVar.t = 4;
                    if (nqsVarA.e(kub1.Y, lorVar) != d9nVar) {
                        k6w0Var4 = k6w0Var2;
                        z = zBooleanValue;
                        zBooleanValue = z;
                        zg91Var2 = zg91Var;
                        k6w0Var3 = k6w0Var4;
                        l4 = l3;
                        m6lVar4 = m6lVar3;
                        t6lVar4 = t6lVar3;
                        lorVar.a = nqsVar2;
                        lorVar.b = t6lVar4;
                        lorVar.c = m6lVar4;
                        lorVar.d = l4;
                        lorVar.e = k6w0Var3;
                        lorVar.f = zg91Var2;
                        lorVar.g = zBooleanValue;
                        lorVar.t = 5;
                        if (nqsVar2.f(lorVar) != d9nVar) {
                            nqsVar3 = nqsVar2;
                        }
                    }
                } else {
                    zg91 zg91Var4 = zg91Var;
                    k6w0Var3 = k6w0Var2;
                    zg91Var2 = zg91Var4;
                    l4 = l3;
                    m6lVar4 = m6lVar3;
                    t6lVar4 = t6lVar3;
                    lorVar.a = nqsVar2;
                    lorVar.b = t6lVar4;
                    lorVar.c = m6lVar4;
                    lorVar.d = l4;
                    lorVar.e = k6w0Var3;
                    lorVar.f = zg91Var2;
                    lorVar.g = zBooleanValue;
                    lorVar.t = 5;
                    if (nqsVar2.f(lorVar) != d9nVar) {
                        nqsVar3 = nqsVar2;
                    }
                }
                return d9nVar;
            }
            if (i2 == 4) {
                z = lorVar.g;
                zg91Var = lorVar.f;
                k6w0Var4 = lorVar.e;
                l3 = lorVar.d;
                m6lVar3 = lorVar.c;
                t6lVar3 = lorVar.b;
                nqsVar2 = lorVar.a;
                hm5.M(obj);
                zBooleanValue = z;
                zg91Var2 = zg91Var;
                k6w0Var3 = k6w0Var4;
                l4 = l3;
                m6lVar4 = m6lVar3;
                t6lVar4 = t6lVar3;
                lorVar.a = nqsVar2;
                lorVar.b = t6lVar4;
                lorVar.c = m6lVar4;
                lorVar.d = l4;
                lorVar.e = k6w0Var3;
                lorVar.f = zg91Var2;
                lorVar.g = zBooleanValue;
                lorVar.t = 5;
                if (nqsVar2.f(lorVar) != d9nVar) {
                    nqsVar3 = nqsVar2;
                }
                return d9nVar;
            }
            if (i2 != 5) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zg91Var2 = lorVar.f;
            k6w0Var3 = lorVar.e;
            l4 = lorVar.d;
            m6lVar4 = lorVar.c;
            t6lVar4 = lorVar.b;
            nqsVar3 = lorVar.a;
            hm5.M(obj);
        }
        zg91 zg91Var5 = zg91Var2;
        k6w0 k6w0Var7 = k6w0Var3;
        Long l6 = l4;
        m6l m6lVar6 = m6lVar4;
        if (t6lVar4 instanceof s6l) {
            ah91VarI = new ah91((xpw) this.b.get(), new tw81((s6l) t6lVar4, nqsVar3));
        } else {
            if (!(t6lVar4 instanceof n6l)) {
                eg.o();
                return null;
            }
            ah91VarI = ((n6l) t6lVar4).a().i(nqsVar3);
        }
        nqs nqsVar7 = nqsVar3;
        snb1 snb1Var2 = new snb1(k6w0Var7, t6lVar4, m6lVar6, ah91VarI, nqsVar7, nqsVar3.b(), zg91Var5, l6);
        nqsVar7.i(snb1Var2);
        bpb1Var.getClass();
        bpb1Var.m((Object) null, snb1Var2);
        return rih1Var;
        kh91 kh91Var2 = (kh91) oqsVar.a().a.getValue();
        if (kh91Var2.a()) {
            kub1 kub1VarG = f7p1.g(kh91Var2);
            lorVar.a = null;
            lorVar.b = null;
            lorVar.c = null;
            lorVar.d = null;
            lorVar.e = null;
            lorVar.t = 2;
            if (nqsVar4.e(kub1VarG, lorVar) != d9nVar) {
                return rih1Var;
            }
        } else {
            Iterator it = p7h.M(new zg91[]{zg91.a, zg91.b, zg91.c}).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!this.j.containsKey((zg91) next));
            zg91 zg91Var6 = (zg91) next;
            if (zg91Var6 == null) {
                Logger.d("No containers attached, smart control cannot be shown", new Object[0]);
                a(nqsVar4, kub1.e);
                return rih1Var;
            }
            e4j0 e4j0Var = (e4j0) this.a.get();
            q4j0 q4j0VarG = k6w0Var.g();
            d3j0 d3j0VarA = k6w0Var.a();
            lorVar.a = nqsVar4;
            lorVar.b = t6lVar2;
            lorVar.c = m6lVar2;
            lorVar.d = l2;
            lorVar.e = k6w0Var;
            lorVar.f = zg91Var6;
            lorVar.t = 3;
            Object objB = e4j0Var.b(q4j0VarG, d3j0VarA, lorVar);
            if (objB != d9nVar) {
                l3 = l2;
                zg91Var = zg91Var6;
                m6lVar3 = m6lVar2;
                t6lVar3 = t6lVar2;
                nqsVar2 = nqsVar4;
                k6w0Var2 = k6w0Var;
                obj = objB;
                zBooleanValue = ((Boolean) obj).booleanValue();
                kh91Var = (kh91) oqsVar.a().a.getValue();
                if (!zBooleanValue) {
                    a(nqsVar2, kub1.d);
                    return rih1Var;
                }
                if (kh91Var.a()) {
                    a(nqsVar2, f7p1.g(kh91Var));
                    return rih1Var;
                }
                snb1Var = (snb1) bpb1Var.getValue();
                if (snb1Var != null) {
                    nqsVarA = snb1Var.a();
                    lorVar.a = nqsVar2;
                    lorVar.b = t6lVar3;
                    lorVar.c = m6lVar3;
                    lorVar.d = l3;
                    lorVar.e = k6w0Var2;
                    lorVar.f = zg91Var;
                    lorVar.g = zBooleanValue;
                    lorVar.t = 4;
                    if (nqsVarA.e(kub1.Y, lorVar) != d9nVar) {
                        k6w0Var4 = k6w0Var2;
                        z = zBooleanValue;
                        zBooleanValue = z;
                        zg91Var2 = zg91Var;
                        k6w0Var3 = k6w0Var4;
                        l4 = l3;
                        m6lVar4 = m6lVar3;
                        t6lVar4 = t6lVar3;
                        lorVar.a = nqsVar2;
                        lorVar.b = t6lVar4;
                        lorVar.c = m6lVar4;
                        lorVar.d = l4;
                        lorVar.e = k6w0Var3;
                        lorVar.f = zg91Var2;
                        lorVar.g = zBooleanValue;
                        lorVar.t = 5;
                        if (nqsVar2.f(lorVar) != d9nVar) {
                            nqsVar3 = nqsVar2;
                            zg91 zg91Var7 = zg91Var2;
                            k6w0 k6w0Var8 = k6w0Var3;
                            Long l7 = l4;
                            m6l m6lVar7 = m6lVar4;
                            if (t6lVar4 instanceof s6l) {
                                ah91VarI = new ah91((xpw) this.b.get(), new tw81((s6l) t6lVar4, nqsVar3));
                            } else {
                                if (!(t6lVar4 instanceof n6l)) {
                                    eg.o();
                                    return null;
                                }
                                ah91VarI = ((n6l) t6lVar4).a().i(nqsVar3);
                            }
                            nqs nqsVar8 = nqsVar3;
                            snb1 snb1Var3 = new snb1(k6w0Var8, t6lVar4, m6lVar7, ah91VarI, nqsVar8, nqsVar3.b(), zg91Var7, l7);
                            nqsVar8.i(snb1Var3);
                            bpb1Var.getClass();
                            bpb1Var.m((Object) null, snb1Var3);
                            return rih1Var;
                        }
                    }
                } else {
                    zg91 zg91Var8 = zg91Var;
                    k6w0Var3 = k6w0Var2;
                    zg91Var2 = zg91Var8;
                    l4 = l3;
                    m6lVar4 = m6lVar3;
                    t6lVar4 = t6lVar3;
                    lorVar.a = nqsVar2;
                    lorVar.b = t6lVar4;
                    lorVar.c = m6lVar4;
                    lorVar.d = l4;
                    lorVar.e = k6w0Var3;
                    lorVar.f = zg91Var2;
                    lorVar.g = zBooleanValue;
                    lorVar.t = 5;
                    if (nqsVar2.f(lorVar) != d9nVar) {
                        nqsVar3 = nqsVar2;
                        zg91 zg91Var9 = zg91Var2;
                        k6w0 k6w0Var9 = k6w0Var3;
                        Long l8 = l4;
                        m6l m6lVar8 = m6lVar4;
                        if (t6lVar4 instanceof s6l) {
                            ah91VarI = new ah91((xpw) this.b.get(), new tw81((s6l) t6lVar4, nqsVar3));
                        } else {
                            if (!(t6lVar4 instanceof n6l)) {
                                eg.o();
                                return null;
                            }
                            ah91VarI = ((n6l) t6lVar4).a().i(nqsVar3);
                        }
                        nqs nqsVar9 = nqsVar3;
                        snb1 snb1Var4 = new snb1(k6w0Var9, t6lVar4, m6lVar8, ah91VarI, nqsVar9, nqsVar3.b(), zg91Var9, l8);
                        nqsVar9.i(snb1Var4);
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, snb1Var4);
                        return rih1Var;
                    }
                }
            }
        }
        return d9nVar;
    }

    public final mr20 c() {
        return new dkm(this.h, (byte) 25);
    }

    public final nqs d(t6l t6lVar, m6l m6lVar, Long l) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        nqs nqsVar = new nqs(uuidRandomUUID, smo1.e(ha71.A(op71.f(), this.e)), new z6n(this, (byte) 16), new z6n(this, (byte) 17), new n7m(this, uuidRandomUUID, t6lVar, m6lVar, (byte) 14));
        this.c.a(uuidRandomUUID, 1, (kub1) null, t6lVar, m6lVar);
        c921.y(nqsVar.c(), (o8n) null, 0, new el0((byte) 22, this, nqsVar, t6lVar, m6lVar, l, (lnm) null), 3);
        return nqsVar;
    }
}
