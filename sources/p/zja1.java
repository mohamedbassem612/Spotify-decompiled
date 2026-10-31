package p;

import android.media.SoundPool;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zja1 {
    public final rgn0 a;
    public final kly0 b;
    public final luc c;
    public final llm e;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final idd1 g = new idd1(new gga1(this, 1));

    public zja1(rgn0 rgn0Var, kly0 kly0Var, luc lucVar, q8n q8nVar) {
        this.a = rgn0Var;
        this.b = kly0Var;
        this.c = lucVar;
        this.e = us71.h(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        uja1 uja1Var;
        if (onmVar instanceof uja1) {
            uja1Var = (uja1) onmVar;
            int i = uja1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uja1Var.d = i - Integer.MIN_VALUE;
            } else {
                uja1Var = new uja1(this, onmVar);
            }
        } else {
            uja1Var = new uja1(this, onmVar);
        }
        Object objA = uja1Var.b;
        int i2 = uja1Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            uja1Var.a = str;
            uja1Var.d = 1;
            objA = this.c.a(str, uja1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = uja1Var.a;
            hm5.M(objA);
        }
        File file = (File) objA;
        if (file == null) {
            Logger.k(l1d.m("Failed to load sound: ", str), new Object[0]);
        }
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        vja1 vja1Var;
        Exception e;
        String str2;
        if (onmVar instanceof vja1) {
            vja1Var = (vja1) onmVar;
            int i = vja1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vja1Var.d = i - Integer.MIN_VALUE;
            } else {
                vja1Var = new vja1(this, onmVar);
            }
        } else {
            vja1Var = new vja1(this, onmVar);
        }
        Object objA = vja1Var.b;
        int i2 = vja1Var.d;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            vja1Var.a = str;
            vja1Var.d = 1;
            objA = a(str, vja1Var);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = vja1Var.a;
            try {
                hm5.M(objA);
                return (Integer) objA;
            } catch (Exception e2) {
                e = e2;
                n57.s("Failed to load sound: " + str2 + ", error: " + e.getMessage());
                return null;
            }
        }
        str = vja1Var.a;
        hm5.M(objA);
        File file = (File) objA;
        if (file == null) {
            return null;
        }
        ayh ayhVarA = sap1.a();
        this.f.put(new Integer(((SoundPool) this.g.getValue()).load(file.getPath(), 1)), ayhVarA);
        try {
            vja1Var.a = str;
            vja1Var.d = 2;
            objA = ayhVarA.Q(vja1Var);
            if (objA != obj) {
                str2 = str;
                return (Integer) objA;
            }
            return obj;
        } catch (Exception e3) {
            String str3 = str;
            e = e3;
            str2 = str3;
            n57.s("Failed to load sound: " + str2 + ", error: " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(rvt0 rvt0Var, onm onmVar) {
        wja1 wja1Var;
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        rvt0 rvt0Var2;
        String str;
        Integer num;
        Integer num2;
        Object objPutIfAbsent;
        if (onmVar instanceof wja1) {
            wja1Var = (wja1) onmVar;
            int i = wja1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                wja1Var.f = i - Integer.MIN_VALUE;
            } else {
                wja1Var = new wja1(this, onmVar);
            }
        } else {
            wja1Var = new wja1(this, onmVar);
        }
        Object obj2 = wja1Var.d;
        int i2 = wja1Var.f;
        rih1 rih1Var = rih1.a;
        Object obj3 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            long j = rvt0Var.c;
            if (j > 0) {
                wja1Var.a = rvt0Var;
                wja1Var.f = 1;
                if (hap1.i(j, wja1Var) != obj3) {
                }
                return obj3;
            }
            SoundPool soundPool = (SoundPool) this.g.getValue();
            int iIntValue = ((Integer) obj).intValue();
            float f = rvt0Var.b;
            soundPool.play(iIntValue, f, f, 1, 0, 1.0f);
            return rih1Var;
        }
        if (i2 == 1) {
            rvt0Var = wja1Var.a;
            hm5.M(obj2);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = wja1Var.c;
            concurrentHashMap = wja1Var.b;
            rvt0Var2 = wja1Var.a;
            hm5.M(obj2);
        }
        num = (Integer) obj2;
        if (num != null) {
            return rih1Var;
        }
        num2 = new Integer(num.intValue());
        objPutIfAbsent = concurrentHashMap.putIfAbsent(str, num2);
        if (objPutIfAbsent == null) {
            obj = num2;
        } else {
            obj = objPutIfAbsent;
        }
        rvt0Var = rvt0Var2;
        SoundPool soundPool2 = (SoundPool) this.g.getValue();
        int iIntValue2 = ((Integer) obj).intValue();
        float f2 = rvt0Var.b;
        soundPool2.play(iIntValue2, f2, f2, 1, 0, 1.0f);
        return rih1Var;
        String str2 = rvt0Var.a;
        concurrentHashMap = this.d;
        obj = concurrentHashMap.get(str2);
        if (obj == null) {
            String str3 = rvt0Var.a;
            wja1Var.a = rvt0Var;
            wja1Var.b = concurrentHashMap;
            wja1Var.c = str2;
            wja1Var.f = 2;
            Object objB = b(str3, wja1Var);
            if (objB != obj3) {
                rvt0Var2 = rvt0Var;
                str = str2;
                obj2 = objB;
                num = (Integer) obj2;
                if (num != null) {
                    return rih1Var;
                }
                num2 = new Integer(num.intValue());
                objPutIfAbsent = concurrentHashMap.putIfAbsent(str, num2);
                if (objPutIfAbsent == null) {
                    obj = num2;
                } else {
                    obj = objPutIfAbsent;
                }
                rvt0Var = rvt0Var2;
            }
            return obj3;
        }
        SoundPool soundPool3 = (SoundPool) this.g.getValue();
        int iIntValue3 = ((Integer) obj).intValue();
        float f3 = rvt0Var.b;
        soundPool3.play(iIntValue3, f3, f3, 1, 0, 1.0f);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:15:0x0040->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:22:0x0068). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object d(java.util.Collection r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.xja1
            if (r0 == 0) goto L13
            r0 = r8
            p.xja1 r0 = (p.xja1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.xja1 r0 = new p.xja1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            int r7 = r0.d
            java.lang.String r1 = r0.c
            java.util.concurrent.ConcurrentHashMap r3 = r0.b
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
            if (r8 == 0) goto L79
            java.lang.Object r8 = r4.next()
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            java.util.concurrent.ConcurrentHashMap r3 = r6.d
            java.lang.Object r8 = r3.get(r1)
            if (r8 != 0) goto L40
            r0.a = r4
            r0.b = r3
            r0.c = r1
            r0.d = r7
            r0.g = r2
            java.lang.Object r8 = r6.b(r1, r0)
            p.d9n r5 = p.d9n.a
            if (r8 != r5) goto L68
            return r5
        L68:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L40
            int r8 = r8.intValue()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r8)
            r3.putIfAbsent(r1, r5)
            goto L40
        L79:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zja1.d(java.util.Collection, p.onm):java.lang.Object");
    }
}
