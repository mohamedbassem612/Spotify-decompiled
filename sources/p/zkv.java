package p;

import android.media.SoundPool;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFromFuture;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zkv {
    public final chp a;
    public final h54 b;
    public final idd1 c = new idd1(new v7v(this, (byte) 5));
    public final LinkedHashMap d = new LinkedHashMap();

    public zkv(chp chpVar, h54 h54Var) {
        this.a = chpVar;
        this.b = h54Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(alv alvVar, onm onmVar) {
        wkv wkvVar;
        if (onmVar instanceof wkv) {
            wkvVar = (wkv) onmVar;
            int i = wkvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkvVar.c = i - Integer.MIN_VALUE;
            } else {
                wkvVar = new wkv(this, onmVar);
            }
        } else {
            wkvVar = new wkv(this, onmVar);
        }
        Object objM = wkvVar.a;
        int i2 = wkvVar.c;
        if (i2 == 0) {
            hm5.M(objM);
            String str = alvVar.a;
            wkvVar.c = 1;
            h54 h54Var = this.b;
            if (!h54Var.e) {
                eg.m("Asset loader not initialized!");
                return null;
            }
            q57 q57Var = (q57) ((t57) h54Var.b.get()).b.get(str);
            if (q57Var == null) {
                bhn0.t(f4i1.f("No asset found with name ", str, "."));
                return null;
            }
            FutureTask futureTask = new FutureTask(new e71(h54Var, q57Var));
            h54Var.a.execute(futureTask);
            objM = fc11.m(new MaybeFlatten(new MaybeFromFuture(futureTask).j(Schedulers.c), new mcn1(str, (byte) 1)), wkvVar);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        File file = (File) objM;
        if (file != null) {
            return yah0.p(((SoundPool) this.c.getValue()).load(file.getPath(), 1));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(alv alvVar, lnm lnmVar) {
        xkv xkvVar;
        Object objP;
        LinkedHashMap linkedHashMap;
        if (lnmVar instanceof xkv) {
            xkvVar = (xkv) lnmVar;
            int i = xkvVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkvVar.e = i - Integer.MIN_VALUE;
            } else {
                xkvVar = new xkv(this, lnmVar);
            }
        } else {
            xkvVar = new xkv(this, lnmVar);
        }
        Object obj = xkvVar.c;
        int i2 = xkvVar.e;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            LinkedHashMap linkedHashMap2 = this.d;
            objP = linkedHashMap2.get(alvVar);
            if (objP == null) {
                xkvVar.a = linkedHashMap2;
                xkvVar.b = alvVar;
                xkvVar.e = 1;
                Object objA = a(alvVar, xkvVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
                linkedHashMap = linkedHashMap2;
                obj = objA;
            }
            ((SoundPool) this.c.getValue()).play(((Number) objP).intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        alvVar = xkvVar.b;
        linkedHashMap = xkvVar.a;
        hm5.M(obj);
        Integer num = (Integer) obj;
        if (num == null) {
            return rih1Var;
        }
        objP = yah0.p(num.intValue());
        linkedHashMap.put(alvVar, objP);
        ((SoundPool) this.c.getValue()).play(((Number) objP).intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:15:0x0040->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:22:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.List r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.ykv
            if (r0 == 0) goto L13
            r0 = r8
            p.ykv r0 = (p.ykv) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.ykv r0 = new p.ykv
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            int r7 = r0.d
            p.alv r1 = r0.c
            java.util.LinkedHashMap r3 = r0.b
            java.util.Iterator r4 = r0.a
            p.hm5.M(r8)
            goto L68
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L34:
            p.hm5.M(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
            r4 = r7
            r7 = r8
        L40:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L78
            java.lang.Object r8 = r4.next()
            r1 = r8
            p.alv r1 = (p.alv) r1
            java.util.LinkedHashMap r3 = r6.d
            java.lang.Object r8 = r3.get(r1)
            if (r8 != 0) goto L40
            r0.a = r4
            r0.b = r3
            r0.c = r1
            r0.d = r7
            r0.g = r2
            java.lang.Object r8 = r6.a(r1, r0)
            p.d9n r5 = p.d9n.a
            if (r8 != r5) goto L68
            return r5
        L68:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L40
            int r8 = r8.intValue()
            java.lang.Integer r8 = p.yah0.p(r8)
            r3.put(r1, r8)
            goto L40
        L78:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zkv.c(java.util.List, p.onm):java.lang.Object");
    }
}
