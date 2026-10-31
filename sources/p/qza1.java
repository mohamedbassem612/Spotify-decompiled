package p;

import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qza1 implements yu50 {
    public final String a;
    public final ur00 b;
    public final fza1 c;
    public final ay0 d;
    public final ge4 e;
    public final orq f;
    public final n0b1 g;
    public final wu50 h;

    public qza1(iac0 iac0Var, String str, ur00 ur00Var, fza1 fza1Var, ay0 ay0Var, ge4 ge4Var, orq orqVar, lza1 lza1Var, n0b1 n0b1Var) {
        this.a = str;
        this.b = ur00Var;
        this.c = fza1Var;
        this.d = ay0Var;
        this.e = ge4Var;
        this.f = orqVar;
        this.g = n0b1Var;
        iac0Var.getLifecycle().a(new mza1(iac0Var, this));
        this.h = new wu50(new nza1(this, (byte) 1), (bpb1) ur00Var.f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:28:0x0066 A[Catch: Exception -> 0x0122, CancellationException -> 0x0123, TryCatch #2 {CancellationException -> 0x0123, Exception -> 0x0122, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0115, B:15:0x0034, B:50:0x00e7, B:16:0x0039, B:47:0x00db, B:17:0x003e, B:34:0x0095, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a2, B:39:0x00a6, B:42:0x00b2, B:44:0x00ba, B:52:0x00ee, B:53:0x00f3, B:21:0x0049, B:23:0x0051, B:54:0x00f4), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[Catch: Exception -> 0x0122, CancellationException -> 0x0123, TryCatch #2 {CancellationException -> 0x0123, Exception -> 0x0122, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0115, B:15:0x0034, B:50:0x00e7, B:16:0x0039, B:47:0x00db, B:17:0x003e, B:34:0x0095, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a2, B:39:0x00a6, B:42:0x00b2, B:44:0x00ba, B:52:0x00ee, B:53:0x00f3, B:21:0x0049, B:23:0x0051, B:54:0x00f4), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095 A[Catch: Exception -> 0x0122, CancellationException -> 0x0123, TryCatch #2 {CancellationException -> 0x0123, Exception -> 0x0122, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0115, B:15:0x0034, B:50:0x00e7, B:16:0x0039, B:47:0x00db, B:17:0x003e, B:34:0x0095, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a2, B:39:0x00a6, B:42:0x00b2, B:44:0x00ba, B:52:0x00ee, B:53:0x00f3, B:21:0x0049, B:23:0x0051, B:54:0x00f4), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[Catch: Exception -> 0x0122, CancellationException -> 0x0123, TryCatch #2 {CancellationException -> 0x0123, Exception -> 0x0122, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0115, B:15:0x0034, B:50:0x00e7, B:16:0x0039, B:47:0x00db, B:17:0x003e, B:34:0x0095, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a2, B:39:0x00a6, B:42:0x00b2, B:44:0x00ba, B:52:0x00ee, B:53:0x00f3, B:21:0x0049, B:23:0x0051, B:54:0x00f4), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6 A[Catch: Exception -> 0x0122, CancellationException -> 0x0123, TryCatch #2 {CancellationException -> 0x0123, Exception -> 0x0122, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0115, B:15:0x0034, B:50:0x00e7, B:16:0x0039, B:47:0x00db, B:17:0x003e, B:34:0x0095, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a2, B:39:0x00a6, B:42:0x00b2, B:44:0x00ba, B:52:0x00ee, B:53:0x00f3, B:21:0x0049, B:23:0x0051, B:54:0x00f4), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2 A[Catch: Exception -> 0x0122, CancellationException -> 0x0123, TryCatch #2 {CancellationException -> 0x0123, Exception -> 0x0122, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0115, B:15:0x0034, B:50:0x00e7, B:16:0x0039, B:47:0x00db, B:17:0x003e, B:34:0x0095, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a2, B:39:0x00a6, B:42:0x00b2, B:44:0x00ba, B:52:0x00ee, B:53:0x00f3, B:21:0x0049, B:23:0x0051, B:54:0x00f4), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba A[Catch: Exception -> 0x0122, CancellationException -> 0x0123, TryCatch #2 {CancellationException -> 0x0123, Exception -> 0x0122, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0115, B:15:0x0034, B:50:0x00e7, B:16:0x0039, B:47:0x00db, B:17:0x003e, B:34:0x0095, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a2, B:39:0x00a6, B:42:0x00b2, B:44:0x00ba, B:52:0x00ee, B:53:0x00f3, B:21:0x0049, B:23:0x0051, B:54:0x00f4), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db A[Catch: Exception -> 0x0122, CancellationException -> 0x0123, TryCatch #2 {CancellationException -> 0x0123, Exception -> 0x0122, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0115, B:15:0x0034, B:50:0x00e7, B:16:0x0039, B:47:0x00db, B:17:0x003e, B:34:0x0095, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a2, B:39:0x00a6, B:42:0x00b2, B:44:0x00ba, B:52:0x00ee, B:53:0x00f3, B:21:0x0049, B:23:0x0051, B:54:0x00f4), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[Catch: Exception -> 0x0122, CancellationException -> 0x0123, TryCatch #2 {CancellationException -> 0x0123, Exception -> 0x0122, blocks: (B:12:0x002b, B:14:0x002f, B:57:0x0115, B:15:0x0034, B:50:0x00e7, B:16:0x0039, B:47:0x00db, B:17:0x003e, B:34:0x0095, B:18:0x0042, B:26:0x0060, B:28:0x0066, B:31:0x0074, B:37:0x00a2, B:39:0x00a6, B:42:0x00b2, B:44:0x00ba, B:52:0x00ee, B:53:0x00f3, B:21:0x0049, B:23:0x0051, B:54:0x00f4), top: B:64:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(onm onmVar) throws NoWhenBranchMatchedException {
        pza1 pza1Var;
        px0 px0Var;
        qrd1 qrd1Var;
        ay0 ay0Var;
        ay0 ay0Var2;
        qrd1 qrd1Var2;
        ay0 ay0Var3;
        ay0 ay0Var4;
        ay0 ay0Var5;
        ay0 ay0Var6;
        rih1 rih1Var = rih1.a;
        if (onmVar instanceof pza1) {
            pza1Var = (pza1) onmVar;
            int i = pza1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pza1Var.c = i - Integer.MIN_VALUE;
            } else {
                pza1Var = new pza1(this, onmVar);
            }
        } else {
            pza1Var = new pza1(this, onmVar);
        }
        Object objI = pza1Var.a;
        d9n d9nVar = d9n.a;
        try {
            switch (pza1Var.c) {
                case 0:
                    hm5.M(objI);
                    if (this.e.h()) {
                        xe01 xe01Var = this.d.i;
                        pza1Var.c = 1;
                        objI = b5p1.i(xe01Var, pza1Var);
                        if (objI != d9nVar) {
                            px0Var = (px0) objI;
                            if (px0Var instanceof mx0) {
                                if (u890.j(this.c.h, this.a)) {
                                    return rih1Var;
                                }
                                qrd1Var2 = new qrd1(new mmr0[]{new mmr0(new prd1(), this.a)});
                                ay0Var3 = this.d;
                                pza1Var.c = 2;
                                if (ay0.b(ay0Var3, qrd1Var2, pza1Var, 2) == d9nVar) {
                                    ay0Var4 = this.d;
                                    pza1Var.c = 3;
                                    if (ay0Var4.e(pza1Var) == d9nVar) {
                                    }
                                    this.c.h = this.a;
                                    return rih1Var;
                                }
                            } else {
                                if (px0Var instanceof nx0) {
                                    ay0Var2 = this.d;
                                    pza1Var.c = 4;
                                    if (ay0Var2.e(pza1Var) == d9nVar) {
                                    }
                                    this.c.h = this.a;
                                    return rih1Var;
                                }
                                if (u890.j(px0Var, ox0.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                qrd1Var = new qrd1(new mmr0[]{new mmr0(new prd1(), this.a)});
                                ay0Var = this.d;
                                pza1Var.c = 5;
                                if (ay0.b(ay0Var, qrd1Var, pza1Var, 2) == d9nVar) {
                                    ay0Var5 = this.d;
                                    pza1Var.c = 6;
                                    if (ay0Var5.e(pza1Var) == d9nVar) {
                                    }
                                    this.c.h = this.a;
                                    return rih1Var;
                                }
                            }
                        }
                    } else {
                        qrd1 qrd1Var3 = new qrd1(new mmr0[]{new mmr0(new prd1(), this.a)});
                        ay0 ay0Var7 = this.d;
                        pza1Var.c = 7;
                        if (ay0.b(ay0Var7, qrd1Var3, pza1Var, 2) != d9nVar) {
                            ay0Var6 = this.d;
                            pza1Var.c = 8;
                            if (ay0Var6.e(pza1Var) != d9nVar) {
                                return rih1Var;
                            }
                        }
                    }
                    return d9nVar;
                case 1:
                    hm5.M(objI);
                    px0Var = (px0) objI;
                    if (px0Var instanceof mx0) {
                        if (u890.j(this.c.h, this.a)) {
                            return rih1Var;
                        }
                        qrd1Var2 = new qrd1(new mmr0[]{new mmr0(new prd1(), this.a)});
                        ay0Var3 = this.d;
                        pza1Var.c = 2;
                        if (ay0.b(ay0Var3, qrd1Var2, pza1Var, 2) == d9nVar) {
                            ay0Var4 = this.d;
                            pza1Var.c = 3;
                            if (ay0Var4.e(pza1Var) == d9nVar) {
                            }
                            this.c.h = this.a;
                            return rih1Var;
                        }
                    } else {
                        if (px0Var instanceof nx0) {
                            ay0Var2 = this.d;
                            pza1Var.c = 4;
                            if (ay0Var2.e(pza1Var) == d9nVar) {
                            }
                            this.c.h = this.a;
                            return rih1Var;
                        }
                        if (u890.j(px0Var, ox0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qrd1Var = new qrd1(new mmr0[]{new mmr0(new prd1(), this.a)});
                        ay0Var = this.d;
                        pza1Var.c = 5;
                        if (ay0.b(ay0Var, qrd1Var, pza1Var, 2) == d9nVar) {
                            ay0Var5 = this.d;
                            pza1Var.c = 6;
                            if (ay0Var5.e(pza1Var) == d9nVar) {
                            }
                            this.c.h = this.a;
                            return rih1Var;
                        }
                    }
                    return d9nVar;
                case 2:
                    hm5.M(objI);
                    ay0Var4 = this.d;
                    pza1Var.c = 3;
                    if (ay0Var4.e(pza1Var) == d9nVar) {
                        return d9nVar;
                    }
                    this.c.h = this.a;
                    return rih1Var;
                case 3:
                case 4:
                case 6:
                    hm5.M(objI);
                    this.c.h = this.a;
                    return rih1Var;
                case 5:
                    hm5.M(objI);
                    ay0Var5 = this.d;
                    pza1Var.c = 6;
                    if (ay0Var5.e(pza1Var) == d9nVar) {
                        return d9nVar;
                    }
                    this.c.h = this.a;
                    return rih1Var;
                case 7:
                    hm5.M(objI);
                    ay0Var6 = this.d;
                    pza1Var.c = 8;
                    if (ay0Var6.e(pza1Var) != d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                case 8:
                    hm5.M(objI);
                    return rih1Var;
                default:
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    @Override // p.yu50
    public final wu50 u() {
        return this.h;
    }
}
