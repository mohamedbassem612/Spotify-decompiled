package p;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ai7 implements tob1 {
    public final List a;
    public final c2h1 b;
    public final g23 c;
    public final iu30 d;
    public final w741 e;
    public final hrr0 f;
    public boolean g = true;

    public ai7(List list, Object obj, c2h1 c2h1Var, g23 g23Var, iu30 iu30Var, w741 w741Var) {
        this.a = list;
        this.b = c2h1Var;
        this.c = g23Var;
        this.d = iu30Var;
        this.e = w741Var;
        this.f = v8r.q(obj);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0072, B:32:0x0098, B:36:0x00bf, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0072, B:32:0x0098, B:36:0x00bf, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0072, B:32:0x0098, B:36:0x00bf, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:25:0x0066, B:27:0x0072, B:32:0x0098, B:36:0x00bf, B:20:0x0051, B:23:0x005a), top: B:44:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[PHI: r0 r3 r7 r12
      0x00d5: PHI (r0v15 java.util.List) = (r0v11 java.util.List), (r0v16 java.util.List) binds: [B:26:0x0070, B:39:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r3v10 int) = (r3v9 int), (r3v11 int) binds: [B:26:0x0070, B:39:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r7v7 int) = (r7v3 int), (r7v8 int) binds: [B:26:0x0070, B:39:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r12v3 int) = (r12v2 int), (r12v5 int) binds: [B:26:0x0070, B:39:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0070 -> B:40:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d1 -> B:39:0x00d4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(p.onm r18) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ai7.c(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(a930 a930Var, onm onmVar) {
        zh7 zh7Var;
        if (onmVar instanceof zh7) {
            zh7Var = (zh7) onmVar;
            int i = zh7Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                zh7Var.d = i - os00.INVALID_ID;
            } else {
                zh7Var = new zh7(this, onmVar);
            }
        } else {
            zh7Var = new zh7(this, onmVar);
        }
        Object obj = zh7Var.b;
        int i2 = zh7Var.d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a930 a930Var2 = zh7Var.a;
                hm5.M(obj);
                return obj;
            }
            hm5.M(obj);
            k96 k96Var = new k96(this, a930Var, (lnm) null, (byte) 11);
            zh7Var.a = a930Var;
            zh7Var.d = 1;
            Object objO = rc2.O(15000L, k96Var, zh7Var);
            d9n d9nVar = d9n.a;
            return objO == d9nVar ? d9nVar : objO;
        } catch (CancellationException e) {
            if (!op71.C(zh7Var.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            r8n r8nVarA = zh7Var.getContext().A(olj0.T0);
            if (r8nVarA != null) {
                r8nVarA.p(new IllegalStateException("Unable to load font " + a930Var, e2), zh7Var.getContext());
            }
            return null;
        }
    }

    public final Object getValue() {
        return this.f.getValue();
    }
}
