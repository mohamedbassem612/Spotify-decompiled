package p;

import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cqa1 {
    public final ylk0 a;
    public final llm b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public cqa1(q8n q8nVar, ylk0 ylk0Var, agc0 agc0Var) {
        this.a = ylk0Var;
        this.b = us71.h(q8nVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[Catch: Exception -> 0x0029, CancellationException -> 0x008f, TryCatch #0 {CancellationException -> 0x008f, blocks: (B:12:0x0025, B:24:0x0052, B:26:0x0056, B:27:0x0060, B:29:0x0064, B:30:0x0076, B:33:0x007b, B:34:0x0080, B:19:0x0035), top: B:42:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060 A[Catch: Exception -> 0x0029, CancellationException -> 0x008f, TryCatch #0 {CancellationException -> 0x008f, blocks: (B:12:0x0025, B:24:0x0052, B:26:0x0056, B:27:0x0060, B:29:0x0064, B:30:0x0076, B:33:0x007b, B:34:0x0080, B:19:0x0035), top: B:42:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064 A[Catch: Exception -> 0x0029, CancellationException -> 0x008f, TryCatch #0 {CancellationException -> 0x008f, blocks: (B:12:0x0025, B:24:0x0052, B:26:0x0056, B:27:0x0060, B:29:0x0064, B:30:0x0076, B:33:0x007b, B:34:0x0080, B:19:0x0035), top: B:42:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: Exception -> 0x0029, CancellationException -> 0x008f, TryCatch #0 {CancellationException -> 0x008f, blocks: (B:12:0x0025, B:24:0x0052, B:26:0x0056, B:27:0x0060, B:29:0x0064, B:30:0x0076, B:33:0x007b, B:34:0x0080, B:19:0x0035), top: B:42:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b A[Catch: Exception -> 0x0029, CancellationException -> 0x008f, TryCatch #0 {CancellationException -> 0x008f, blocks: (B:12:0x0025, B:24:0x0052, B:26:0x0056, B:27:0x0060, B:29:0x0064, B:30:0x0076, B:33:0x007b, B:34:0x0080, B:19:0x0035), top: B:42:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(zpa1 zpa1Var, String str, List list, List list2, onm onmVar) throws NoWhenBranchMatchedException {
        aqa1 aqa1Var;
        String str2;
        ly21 ly21Var;
        if (onmVar instanceof aqa1) {
            aqa1Var = (aqa1) onmVar;
            int i = aqa1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqa1Var.d = i - Integer.MIN_VALUE;
            } else {
                aqa1Var = new aqa1(this, onmVar);
            }
        } else {
            aqa1Var = new aqa1(this, onmVar);
        }
        Object objO = aqa1Var.b;
        int i2 = aqa1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                try {
                    hgo0 hgo0Var = new hgo0((byte) 23, this, zpa1Var, str, list, list2, (lnm) null);
                    aqa1Var.a = str;
                    aqa1Var.d = 1;
                    objO = rc2.O(20000L, hgo0Var, aqa1Var);
                    d9n d9nVar = d9n.a;
                    if (objO == d9nVar) {
                        return d9nVar;
                    }
                    str2 = str;
                    ly21Var = (py21) objO;
                    if (ly21Var == null) {
                        Logger.k("Timed out copying selected speeds and transitions to %s", new Object[]{str2});
                    } else if (ly21Var instanceof ly21) {
                        Logger.k("Failed to copy selected speeds and transitions to %s: %s", new Object[]{str2, ly21Var.a.b()});
                    } else if (ly21Var instanceof oy21) {
                        throw new NoWhenBranchMatchedException();
                    }
                } catch (Exception e) {
                    e = e;
                    str2 = str;
                    Logger.e(e, "Failed to copy selected speeds and transitions to %s", new Object[]{str2});
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = aqa1Var.a;
                try {
                    hm5.M(objO);
                    ly21Var = (py21) objO;
                    if (ly21Var == null) {
                        Logger.k("Timed out copying selected speeds and transitions to %s", new Object[]{str2});
                    } else if (ly21Var instanceof ly21) {
                        Logger.k("Failed to copy selected speeds and transitions to %s: %s", new Object[]{str2, ly21Var.a.b()});
                    } else if (ly21Var instanceof oy21) {
                        throw new NoWhenBranchMatchedException();
                    }
                } catch (Exception e2) {
                    e = e2;
                    Logger.e(e, "Failed to copy selected speeds and transitions to %s", new Object[]{str2});
                }
            }
            return rih1.a;
        } catch (CancellationException e3) {
            throw e3;
        }
    }
}
