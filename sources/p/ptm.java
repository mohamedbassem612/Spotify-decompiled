package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract class ptm {
    public static final o3r a = w3p1.o(new l4r(hvm.a, 1, atm.e, new j4r(atm.c), atm.f), atm.d);

    /* JADX WARN: Code duplicated, block: B:146:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149 A[Catch: all -> 0x015e, Exception -> 0x0164, CancellationException -> 0x0169, TryCatch #13 {CancellationException -> 0x0169, Exception -> 0x0164, all -> 0x015e, blocks: (B:55:0x0139, B:56:0x0143, B:58:0x0149, B:70:0x0170, B:72:0x0174, B:74:0x0178), top: B:144:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0174 A[Catch: all -> 0x015e, Exception -> 0x0164, CancellationException -> 0x0169, TryCatch #13 {CancellationException -> 0x0169, Exception -> 0x0164, all -> 0x015e, blocks: (B:55:0x0139, B:56:0x0143, B:58:0x0149, B:70:0x0170, B:72:0x0174, B:74:0x0178), top: B:144:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0177  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r1v10, types: [p.los] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [p.los] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [p.los] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [p.los] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [p.los] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [p.ixb] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final Object a(d0r d0rVar, oum oumVar, ttm ttmVar, String str, String str2, los losVar, lwq lwqVar, itm itmVar, onm onmVar) throws Throwable {
        otm otmVar;
        ixb ixbVar;
        ixb ixbVar2;
        rih1 rih1Var;
        ?? r4;
        mqm mqmVar;
        itm itmVar2;
        ttm ttmVar2;
        String str3;
        itm itmVar3;
        ?? r1;
        Iterator it;
        Object next;
        som somVar;
        String str4;
        ?? r2;
        ?? r3;
        ?? r5;
        d0r d0rVar2 = d0rVar;
        ttm ttmVar3 = ttmVar;
        ?? r6 = losVar;
        itm itmVar4 = itmVar;
        hvm hvmVar = hvm.a;
        if (onmVar instanceof otm) {
            otmVar = (otm) onmVar;
            int i = otmVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                otmVar.h = i - Integer.MIN_VALUE;
            } else {
                otmVar = new otm(onmVar);
            }
        } else {
            otmVar = new otm(onmVar);
        }
        Object objJ = otmVar.g;
        int i2 = otmVar.h;
        rih1 rih1Var2 = rih1.a;
        ixb ixbVar3 = ixb.c;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i2 != 0) {
                    try {
                        try {
                            if (i2 == 1) {
                                mqm mqmVar2 = otmVar.f;
                                itm itmVar5 = otmVar.d;
                                los losVar2 = otmVar.c;
                                ttm ttmVar4 = otmVar.b;
                                d0r d0rVar3 = otmVar.a;
                                hm5.M(objJ);
                                itmVar4 = itmVar5;
                                ttmVar3 = ttmVar4;
                                rih1Var = rih1Var2;
                                ixbVar2 = ixbVar3;
                                mqmVar = mqmVar2;
                                d0rVar2 = d0rVar3;
                                r2 = losVar2;
                                ay8 ay8VarF = d3p1.F(d0rVar2, a, mqmVar);
                                jte jteVar = new jte(2, (lnm) null, (byte) 7);
                                otmVar.a = null;
                                otmVar.b = ttmVar3;
                                otmVar.c = r2;
                                otmVar.d = itmVar4;
                                otmVar.e = null;
                                otmVar.f = null;
                                otmVar.h = 2;
                                objJ = b5p1.j(ay8VarF, jteVar, otmVar);
                                if (objJ != d9nVar) {
                                    ?? r0 = r2;
                                    ttmVar2 = ttmVar3;
                                    r1 = r0;
                                    itmVar2 = itmVar4;
                                }
                                return d9nVar;
                            }
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    eg.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                str3 = otmVar.e;
                                itmVar3 = otmVar.d;
                                los losVar3 = otmVar.c;
                                hm5.M(objJ);
                                rih1Var = rih1Var2;
                                ixbVar2 = ixbVar3;
                                r5 = losVar3;
                                itmVar3.invoke(str3);
                                r3 = r5;
                                r3.a(ixbVar2);
                                return rih1Var;
                            }
                            itmVar2 = otmVar.d;
                            los losVar4 = otmVar.c;
                            ttmVar2 = otmVar.b;
                            try {
                                hm5.M(objJ);
                                rih1Var = rih1Var2;
                                ixbVar2 = ixbVar3;
                                r1 = losVar4;
                            } catch (CancellationException e) {
                                e = e;
                                throw e;
                            } catch (Exception unused) {
                                r6 = losVar4;
                                rih1Var = rih1Var2;
                                r4 = ixbVar3;
                                r6.a((ixb) r4);
                                return rih1Var;
                            } catch (Throwable th) {
                                th = th;
                                r6 = losVar4;
                                ixbVar = ixbVar3;
                                r6.a(ixbVar);
                                throw th;
                            }
                            it = ((Iterable) ((i1r) objJ).a).iterator();
                            do {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!u890.j(((som) next).d, ((qtm) ttmVar2).e));
                            somVar = (som) next;
                            if (somVar != null) {
                                str4 = somVar.a;
                            } else {
                                str4 = null;
                            }
                            itmVar2.invoke(str4);
                            r3 = r1;
                            r3.a(ixbVar2);
                            return rih1Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            throw e;
                        } catch (Exception unused2) {
                            r6 = r1;
                            r4 = ixbVar2;
                            r6.a((ixb) r4);
                            return rih1Var;
                        } catch (Throwable th2) {
                            th = th2;
                            r6 = r1;
                            ixbVar = ixbVar2;
                            r6.a(ixbVar);
                            throw th;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                    } catch (Exception unused3) {
                        r6 = str2;
                    } catch (Throwable th3) {
                        th = th3;
                        r6 = str2;
                    }
                } else {
                    hm5.M(objJ);
                    try {
                        try {
                            mum mumVar = new mum(str);
                            boolean z = ttmVar3 instanceof qtm;
                            ovm ovmVar = ovm.a;
                            try {
                                if (z) {
                                    try {
                                        jvm jvmVar = new jvm(((qtm) ttmVar3).b, ((qtm) ttmVar3).c, ((qtm) ttmVar3).d);
                                        rih1Var = rih1Var2;
                                        try {
                                            ixbVar2 = ixbVar3;
                                            mqmVar = new mqm(new jvm(((qtm) ttmVar3).b, ((qtm) ttmVar3).c, ((qtm) ttmVar3).d), new lqm(Collections.singletonList(ovmVar), oumVar.a(), null, 4));
                                            prm prmVar = new prm(jvmVar, mumVar);
                                            if (itmVar4 != null) {
                                                otmVar.a = d0rVar2;
                                                otmVar.b = ttmVar3;
                                                otmVar.c = r6;
                                                otmVar.d = itmVar4;
                                                otmVar.e = null;
                                                otmVar.f = mqmVar;
                                                otmVar.h = 1;
                                                d0rVar2.getClass();
                                                if (d0r.d(d0rVar2, hvmVar, mqmVar, prmVar, otmVar) != d9nVar) {
                                                    r2 = r6;
                                                    ay8 ay8VarF2 = d3p1.F(d0rVar2, a, mqmVar);
                                                    jte jteVar2 = new jte(2, (lnm) null, (byte) 7);
                                                    otmVar.a = null;
                                                    otmVar.b = ttmVar3;
                                                    otmVar.c = r2;
                                                    otmVar.d = itmVar4;
                                                    otmVar.e = null;
                                                    otmVar.f = null;
                                                    otmVar.h = 2;
                                                    objJ = b5p1.j(ay8VarF2, jteVar2, otmVar);
                                                    if (objJ != d9nVar) {
                                                        ?? r7 = r2;
                                                        ttmVar2 = ttmVar3;
                                                        r1 = r7;
                                                        itmVar2 = itmVar4;
                                                        it = ((Iterable) ((i1r) objJ).a).iterator();
                                                        do {
                                                            if (it.hasNext()) {
                                                                next = null;
                                                                break;
                                                            }
                                                            next = it.next();
                                                        } while (!u890.j(((som) next).d, ((qtm) ttmVar2).e));
                                                        somVar = (som) next;
                                                        if (somVar != null) {
                                                            str4 = somVar.a;
                                                        } else {
                                                            str4 = null;
                                                        }
                                                        itmVar2.invoke(str4);
                                                        r3 = r1;
                                                    }
                                                }
                                                return d9nVar;
                                            }
                                            lwq.a(lwqVar, mqmVar, prmVar);
                                            r3 = r6;
                                        } catch (Exception unused4) {
                                            ixbVar2 = ixbVar3;
                                            r4 = ixbVar2;
                                            r6.a((ixb) r4);
                                            return rih1Var;
                                        }
                                    } catch (CancellationException e4) {
                                        e = e4;
                                        ixbVar2 = ixbVar3;
                                        throw e;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        ixbVar2 = ixbVar3;
                                        ixbVar = ixbVar2;
                                        r6.a(ixbVar);
                                        throw th;
                                    }
                                } else {
                                    rih1Var = rih1Var2;
                                    r4 = ttmVar3 instanceof stm;
                                    try {
                                        if (r4 == 0) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (str2 == null) {
                                            r6.a(ixbVar3);
                                            return rih1Var;
                                        }
                                        jvm jvmVar2 = new jvm(((stm) ttmVar3).b, ((stm) ttmVar3).c, ((stm) ttmVar3).d);
                                        ixbVar2 = ixbVar3;
                                        mqm mqmVar3 = new mqm(new jvm(((stm) ttmVar3).b, ((stm) ttmVar3).c, ((stm) ttmVar3).d), new lqm(Collections.singletonList(ovmVar), oumVar.a(), null, 4));
                                        rrm rrmVar = new rrm(jvmVar2, str2, mumVar);
                                        if (itmVar4 != null) {
                                            otmVar.a = null;
                                            otmVar.b = null;
                                            otmVar.c = r6;
                                            otmVar.d = itmVar4;
                                            otmVar.e = str2;
                                            otmVar.f = null;
                                            otmVar.h = 3;
                                            d0rVar2.getClass();
                                            if (d0r.d(d0rVar2, hvmVar, mqmVar3, rrmVar, otmVar) != d9nVar) {
                                                str3 = str2;
                                                r5 = r6;
                                                itmVar3 = itmVar4;
                                                itmVar3.invoke(str3);
                                                r3 = r5;
                                            }
                                            return d9nVar;
                                        }
                                        lwq.a(lwqVar, mqmVar3, rrmVar);
                                        r3 = r6;
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Exception unused5) {
                                        r6.a((ixb) r4);
                                        return rih1Var;
                                    }
                                }
                                r3.a(ixbVar2);
                                return rih1Var;
                            } catch (CancellationException e6) {
                                e = e6;
                            } catch (Exception unused6) {
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Exception unused7) {
                            rih1Var = rih1Var2;
                            r4 = ixbVar3;
                            r6.a((ixb) r4);
                            return rih1Var;
                        }
                    } catch (CancellationException e7) {
                        e = e7;
                        throw e;
                    } catch (Throwable th6) {
                        th = th6;
                        ixbVar = ixbVar3;
                        r6.a(ixbVar);
                        throw th;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (CancellationException e8) {
            e = e8;
        } catch (Exception unused8) {
            r6 = str2;
        } catch (Throwable th8) {
            th = th8;
            r6 = str2;
        }
    }
}
