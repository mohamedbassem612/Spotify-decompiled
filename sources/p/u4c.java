package p;

import com.google.android.recaptcha.internal.zzhm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u4c extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public byte b;
    public Object c;
    public long d;
    public Object e;
    public Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4c(b1o1 b1o1Var, String str, yln1 yln1Var, sln1 sln1Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.e = b1o1Var;
        this.f = str;
        this.g = yln1Var;
        this.h = sln1Var;
        this.d = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                u4c u4cVar = new u4c((a5c) obj3, (List) obj2, lnmVar);
                u4cVar.c = obj;
                return u4cVar;
            case 1:
                u4c u4cVar2 = new u4c((b1o1) this.e, (String) this.f, (yln1) obj3, (sln1) obj2, this.d, lnmVar);
                u4cVar2.c = obj;
                return u4cVar2;
            default:
                return new u4c((zwo1) this.f, (alg1) obj3, (xnn1) obj2, this.d, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:101:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f9  */
    public final Object invokeSuspend(Object obj) throws zzhm {
        long jB;
        Set setP1;
        Object objM;
        Object objL;
        Set set;
        q4c q4cVar;
        ArrayList arrayList;
        String str;
        String str2;
        Map mapSingletonMap;
        rvo1 rvo1Var;
        Object objA;
        Object objA2;
        yln1 m231Var;
        Object nwo1Var;
        zwo1 zwo1Var;
        Object objA3;
        yln1 yln1Var;
        Object qwo1Var;
        yln1 yln1Var2;
        byte b = this.a;
        Object obj2 = this.h;
        d9n d9nVar = d9n.a;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                a5c a5cVar = (a5c) obj3;
                r87 r87Var = a5cVar.i;
                ssw0 ssw0Var = (ssw0) this.c;
                byte b2 = this.b;
                w7x w7xVar = w7x.a;
                if (b2 != 0) {
                    if (b2 == 1) {
                        jB = this.d;
                        setP1 = (Set) this.e;
                        hm5.M(obj);
                        objM = obj;
                    } else if (b2 == 2) {
                        jB = this.d;
                        q4cVar = (q4c) this.f;
                        set = (Set) this.e;
                        hm5.M(obj);
                        objL = obj;
                        List list = (List) objL;
                        String str3 = a5cVar.l.a;
                        long j = jB;
                        arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (!set.contains(((i) obj4).getUri())) {
                                arrayList.add(obj4);
                            }
                        }
                        ka61 ka61Var = new ka61(new ivd(arrayList, !list.isEmpty(), null, w7xVar, r87Var), j);
                        if (q4cVar != null) {
                            str = q4cVar.a;
                        } else {
                            str = null;
                        }
                        if (q4cVar != null) {
                            str2 = q4cVar.b;
                        } else {
                            str2 = null;
                        }
                        mapSingletonMap = Collections.singletonMap(str3, new p4c(ka61Var, str, str2));
                        this.c = null;
                        this.e = null;
                        this.f = null;
                        this.d = j;
                        this.b = (byte) 3;
                        if (ssw0Var.b(mapSingletonMap, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (b2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1.a;
                }
                hm5.M(obj);
                jB = a5cVar.b.b();
                setP1 = o7h.p1((List) obj2);
                this.c = ssw0Var;
                this.e = setP1;
                this.d = jB;
                this.b = (byte) 1;
                objM = a5cVar.m(this);
                if (objM == d9nVar) {
                    return d9nVar;
                }
                q4c q4cVar2 = (q4c) objM;
                int i = r87Var.e;
                String strValueOf = String.valueOf(jB);
                this.c = ssw0Var;
                this.e = setP1;
                this.f = q4cVar2;
                this.d = jB;
                this.b = (byte) 2;
                objL = a5cVar.l(i, strValueOf, w7xVar, this);
                if (objL == d9nVar) {
                    return d9nVar;
                }
                set = setP1;
                q4cVar = q4cVar2;
                List list2 = (List) objL;
                String str4 = a5cVar.l.a;
                long j2 = jB;
                arrayList = new ArrayList();
                while (r9.hasNext()) {
                    if (!set.contains(((i) obj4).getUri())) {
                        arrayList.add(obj4);
                    }
                }
                ka61 ka61Var2 = new ka61(new ivd(arrayList, !list2.isEmpty(), null, w7xVar, r87Var), j2);
                if (q4cVar != null) {
                    str = q4cVar.a;
                } else {
                    str = null;
                }
                if (q4cVar != null) {
                    str2 = q4cVar.b;
                } else {
                    str2 = null;
                }
                mapSingletonMap = Collections.singletonMap(str4, new p4c(ka61Var2, str, str2));
                this.c = null;
                this.e = null;
                this.f = null;
                this.d = j2;
                this.b = (byte) 3;
                if (ssw0Var.b(mapSingletonMap, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1.a;
            case 1:
                byte b3 = this.b;
                tgo1 tgo1Var = tgo1.c;
                try {
                    if (b3 != 0) {
                        if (b3 != 1) {
                            hm5.M(obj);
                            objA2 = obj;
                        } else {
                            rvo1Var = (rvo1) this.c;
                            hm5.M(obj);
                            objA = obj;
                        }
                        return (pmn1) objA2;
                    }
                    hm5.M(obj);
                    rvo1Var = (rvo1) this.c;
                    long j3 = this.d;
                    this.c = rvo1Var;
                    this.b = (byte) 1;
                    objA = ((b1o1) this.e).a((String) this.f, ((yln1) obj3).y(), (sln1) obj2, j3);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    this.c = null;
                    this.b = (byte) 2;
                    objA2 = ((nwo1) objA).a(rvo1Var.a, this);
                    if (objA2 == d9nVar) {
                        return d9nVar;
                    }
                    return (pmn1) objA2;
                } catch (TimeoutCancellationException e) {
                    throw new zzhm(tgo1Var, ij81.e, e.getMessage(), (Exception) null);
                } catch (Exception e2) {
                    throw new zzhm(tgo1Var, ij81.W0, e2.getMessage(), (Exception) null);
                } catch (zzhm e3) {
                    throw e3;
                }
            default:
                alg1 alg1Var = (alg1) obj3;
                zwo1 zwo1Var2 = (zwo1) this.f;
                byte b4 = this.b;
                try {
                    if (b4 != 0) {
                        if (b4 == 1) {
                            zwo1 zwo1Var3 = (zwo1) this.c;
                            hm5.M(obj);
                            zwo1Var = zwo1Var3;
                            nwo1Var = obj;
                        } else if (b4 == 2) {
                            hm5.M(obj);
                            objA3 = obj;
                            yln1Var = (yln1) objA3;
                            fqn1 fqn1Var = (fqn1) alg1Var.c;
                            this.c = yln1Var;
                            this.e = zwo1Var2;
                            this.b = (byte) 3;
                            qwo1Var = new qwo1(new s0p1(fqn1Var, yln1Var, (lnm) null));
                            if (qwo1Var == d9nVar) {
                                return d9nVar;
                            }
                            yln1Var2 = yln1Var;
                            this.c = yln1Var2;
                            this.e = null;
                            this.b = (byte) 4;
                            if (((qwo1) qwo1Var).a.invoke(zwo1Var2, this) == d9nVar) {
                                return d9nVar;
                            }
                            m231Var = yln1Var2;
                        } else if (b4 != 3) {
                            m231Var = (yln1) this.c;
                            hm5.M(obj);
                        } else {
                            zwo1Var2 = (zwo1) this.e;
                            yln1Var2 = (yln1) this.c;
                            hm5.M(obj);
                            qwo1Var = obj;
                            this.c = yln1Var2;
                            this.e = null;
                            this.b = (byte) 4;
                            if (((qwo1) qwo1Var).a.invoke(zwo1Var2, this) == d9nVar) {
                                return d9nVar;
                            }
                            m231Var = yln1Var2;
                        }
                        return new e331(m231Var);
                    }
                    hm5.M(obj);
                    long j4 = this.d;
                    this.c = zwo1Var2;
                    this.b = (byte) 1;
                    nwo1Var = new nwo1(55, new gxn1(j4, alg1Var, (xnn1) obj2, (lnm) null), (Integer) null);
                    if (nwo1Var == d9nVar) {
                        return d9nVar;
                    }
                    zwo1Var = zwo1Var2;
                    this.c = null;
                    this.b = (byte) 2;
                    objA3 = ((nwo1) nwo1Var).a(zwo1Var, this);
                    if (objA3 == d9nVar) {
                        return d9nVar;
                    }
                    yln1Var = (yln1) objA3;
                    fqn1 fqn1Var2 = (fqn1) alg1Var.c;
                    this.c = yln1Var;
                    this.e = zwo1Var2;
                    this.b = (byte) 3;
                    qwo1Var = new qwo1(new s0p1(fqn1Var2, yln1Var, (lnm) null));
                    if (qwo1Var == d9nVar) {
                        return d9nVar;
                    }
                    yln1Var2 = yln1Var;
                    this.c = yln1Var2;
                    this.e = null;
                    this.b = (byte) 4;
                    if (((qwo1) qwo1Var).a.invoke(zwo1Var2, this) == d9nVar) {
                        return d9nVar;
                    }
                    m231Var = yln1Var2;
                    return new e331(m231Var);
                } catch (zzhm e4) {
                    m231Var = new m231(e4);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4c(a5c a5cVar, List list, lnm lnmVar) {
        super(2, lnmVar);
        this.g = a5cVar;
        this.h = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4c(zwo1 zwo1Var, alg1 alg1Var, xnn1 xnn1Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.f = zwo1Var;
        this.g = alg1Var;
        this.h = xnn1Var;
        this.d = j;
    }
}
