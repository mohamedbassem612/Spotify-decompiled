package p;

import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ums {
    public final bl3 a;
    public final j6g1 b;

    public ums(bl3 bl3Var, j6g1 j6g1Var) {
        this.a = bl3Var;
        this.b = j6g1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:40:0x0084 A[Catch: Exception -> 0x002e, CancellationException -> 0x00ae, TryCatch #1 {Exception -> 0x002e, blocks: (B:13:0x002a, B:37:0x0073, B:38:0x007e, B:40:0x0084, B:42:0x008e, B:46:0x0099, B:43:0x0093, B:45:0x0097, B:47:0x009d, B:48:0x00a2), top: B:56:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x008e A[Catch: Exception -> 0x002e, CancellationException -> 0x00ae, TryCatch #1 {Exception -> 0x002e, blocks: (B:13:0x002a, B:37:0x0073, B:38:0x007e, B:40:0x0084, B:42:0x008e, B:46:0x0099, B:43:0x0093, B:45:0x0097, B:47:0x009d, B:48:0x00a2), top: B:56:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[Catch: Exception -> 0x002e, CancellationException -> 0x00ae, TryCatch #1 {Exception -> 0x002e, blocks: (B:13:0x002a, B:37:0x0073, B:38:0x007e, B:40:0x0084, B:42:0x008e, B:46:0x0099, B:43:0x0093, B:45:0x0097, B:47:0x009d, B:48:0x00a2), top: B:56:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0097 A[Catch: Exception -> 0x002e, CancellationException -> 0x00ae, TryCatch #1 {Exception -> 0x002e, blocks: (B:13:0x002a, B:37:0x0073, B:38:0x007e, B:40:0x0084, B:42:0x008e, B:46:0x0099, B:43:0x0093, B:45:0x0097, B:47:0x009d, B:48:0x00a2), top: B:56:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:59:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    public final Serializable a(List list, uio uioVar, onm onmVar) throws NoWhenBranchMatchedException, AbortFlowException {
        tms tmsVar;
        Exception e;
        ?? r7;
        String str;
        LinkedHashSet linkedHashSet;
        String str2;
        if (onmVar instanceof tms) {
            tmsVar = (tms) onmVar;
            int i = tmsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmsVar.d = i - Integer.MIN_VALUE;
            } else {
                tmsVar = new tms(this, onmVar);
            }
        } else {
            tmsVar = new tms(this, onmVar);
        }
        Object objB = tmsVar.b;
        int i2 = tmsVar.d;
        w7x w7xVar = w7x.a;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objB);
                    str = (String) o7h.X0((List) list);
                    if (str != null) {
                        j6g1 j6g1Var = this.b;
                        tmsVar.a = str;
                        tmsVar.d = 1;
                        objB = j6g1Var.b(str, uioVar, tmsVar);
                        if (objB == d9nVar) {
                            list = str;
                        }
                        return d9nVar;
                    }
                    return w7xVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7 = tmsVar.a;
                    try {
                        hm5.M(objB);
                        r7 = r7;
                        linkedHashSet = new LinkedHashSet();
                        for (ck3 ck3Var : (Iterable) objB) {
                            if (ck3Var instanceof ck3) {
                                str2 = ck3Var.a;
                            } else {
                                if (ck3Var instanceof bk3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str2 = bo1.b;
                            }
                            linkedHashSet.add(str2);
                        }
                        return linkedHashSet;
                    } catch (Exception e2) {
                        e = e2;
                        Logger.l(e, "Failed to resolve default save locations for %s", new Object[]{r7});
                        return w7xVar;
                    }
                }
                String str3 = tmsVar.a;
                hm5.M(objB);
                list = str3;
                list = str;
                ak3 ak3Var = (ak3) objB;
                if (ak3Var != null) {
                    mr20 mr20VarN = this.a.n(ak3Var);
                    tmsVar.a = list;
                    tmsVar.d = 2;
                    objB = b5p1.i(mr20VarN, tmsVar);
                    if (objB != d9nVar) {
                        r7 = list;
                        linkedHashSet = new LinkedHashSet();
                        while (r9.hasNext()) {
                            if (ck3Var instanceof ck3) {
                                str2 = ck3Var.a;
                            } else {
                                if (ck3Var instanceof bk3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str2 = bo1.b;
                            }
                            linkedHashSet.add(str2);
                        }
                        return linkedHashSet;
                    }
                    return d9nVar;
                }
                return w7xVar;
            } catch (Exception e3) {
                ?? r6 = list;
                e = e3;
                r7 = r6;
            }
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
