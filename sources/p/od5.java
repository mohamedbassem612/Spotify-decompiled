package p;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class od5 implements Choreographer.FrameCallback {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ od5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0128  */
    /* JADX WARN: Code duplicated, block: B:39:0x0140  */
    /* JADX WARN: Code duplicated, block: B:60:0x0144 A[SYNTHETIC] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2;
        long j3;
        boolean z;
        float f;
        e8b1 e8b1Var;
        boolean z2;
        float f2;
        float f3;
        e8b1 e8b1Var2;
        boolean z3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pd5 pd5Var = (pd5) ((x5j1) ((g23) obj).b).b;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = pd5Var.b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                boolean z4 = false;
                int i = 0;
                while (i < arrayList.size()) {
                    d8b1 d8b1Var = (d8b1) arrayList.get(i);
                    if (d8b1Var == null) {
                        i = i;
                    } else {
                        jv81 jv81Var = pd5Var.a;
                        Long l = (Long) jv81Var.get(d8b1Var);
                        if (l == null) {
                            j2 = d8b1Var.i;
                            if (j2 == 0) {
                                d8b1Var.i = jUptimeMillis;
                                d8b1Var.c(d8b1Var.b);
                                i = i;
                            } else {
                                j3 = jUptimeMillis - j2;
                                d8b1Var.i = jUptimeMillis;
                                z = d8b1Var.o;
                                f = d8b1Var.n;
                                if (z) {
                                    if (f != Float.MAX_VALUE) {
                                        d8b1Var.m.i = f;
                                        d8b1Var.n = Float.MAX_VALUE;
                                    }
                                    d8b1Var.b = (float) d8b1Var.m.i;
                                    d8b1Var.a = 0.0f;
                                    d8b1Var.o = z4;
                                    i = i;
                                    z3 = true;
                                } else {
                                    e8b1Var = d8b1Var.m;
                                    if (f != Float.MAX_VALUE) {
                                        z2 = true;
                                        double d = e8b1Var.i;
                                        long j4 = j3 / 2;
                                        bhv bhvVarC = e8b1Var.c(d8b1Var.b, d8b1Var.a, j4);
                                        e8b1 e8b1Var3 = d8b1Var.m;
                                        e8b1Var3.i = d8b1Var.n;
                                        d8b1Var.n = Float.MAX_VALUE;
                                        bhv bhvVarC2 = e8b1Var3.c(bhvVarC.a, bhvVarC.b, j4);
                                        f2 = bhvVarC2.a;
                                        d8b1Var.b = f2;
                                        d8b1Var.a = bhvVarC2.b;
                                    } else {
                                        z2 = true;
                                        bhv bhvVarC3 = e8b1Var.c(d8b1Var.b, d8b1Var.a, j3);
                                        float f4 = bhvVarC3.a;
                                        d8b1Var.b = f4;
                                        d8b1Var.a = bhvVarC3.b;
                                        f2 = f4;
                                    }
                                    float fMax = Math.max(f2, d8b1Var.h);
                                    d8b1Var.b = fMax;
                                    float fMin = Math.min(fMax, d8b1Var.g);
                                    d8b1Var.b = fMin;
                                    f3 = d8b1Var.a;
                                    e8b1Var2 = d8b1Var.m;
                                    e8b1Var2.getClass();
                                    if (Math.abs(f3) < e8b1Var2.e) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                }
                                float fMin2 = Math.min(d8b1Var.b, d8b1Var.g);
                                d8b1Var.b = fMin2;
                                float fMax2 = Math.max(fMin2, d8b1Var.h);
                                d8b1Var.b = fMax2;
                                d8b1Var.c(fMax2);
                                if (z3) {
                                    d8b1Var.b(false);
                                }
                            }
                        } else if (l.longValue() < jUptimeMillis2) {
                            jv81Var.remove(d8b1Var);
                            j2 = d8b1Var.i;
                            if (j2 == 0) {
                                d8b1Var.i = jUptimeMillis;
                                d8b1Var.c(d8b1Var.b);
                                i = i;
                            } else {
                                j3 = jUptimeMillis - j2;
                                d8b1Var.i = jUptimeMillis;
                                z = d8b1Var.o;
                                f = d8b1Var.n;
                                if (z) {
                                    if (f != Float.MAX_VALUE) {
                                        d8b1Var.m.i = f;
                                        d8b1Var.n = Float.MAX_VALUE;
                                    }
                                    d8b1Var.b = (float) d8b1Var.m.i;
                                    d8b1Var.a = 0.0f;
                                    d8b1Var.o = z4;
                                    i = i;
                                    z3 = true;
                                } else {
                                    e8b1Var = d8b1Var.m;
                                    if (f != Float.MAX_VALUE) {
                                        z2 = true;
                                        double d2 = e8b1Var.i;
                                        long j5 = j3 / 2;
                                        bhv bhvVarC4 = e8b1Var.c(d8b1Var.b, d8b1Var.a, j5);
                                        e8b1 e8b1Var4 = d8b1Var.m;
                                        e8b1Var4.i = d8b1Var.n;
                                        d8b1Var.n = Float.MAX_VALUE;
                                        bhv bhvVarC5 = e8b1Var4.c(bhvVarC4.a, bhvVarC4.b, j5);
                                        f2 = bhvVarC5.a;
                                        d8b1Var.b = f2;
                                        d8b1Var.a = bhvVarC5.b;
                                    } else {
                                        z2 = true;
                                        bhv bhvVarC6 = e8b1Var.c(d8b1Var.b, d8b1Var.a, j3);
                                        float f5 = bhvVarC6.a;
                                        d8b1Var.b = f5;
                                        d8b1Var.a = bhvVarC6.b;
                                        f2 = f5;
                                    }
                                    float fMax3 = Math.max(f2, d8b1Var.h);
                                    d8b1Var.b = fMax3;
                                    float fMin3 = Math.min(fMax3, d8b1Var.g);
                                    d8b1Var.b = fMin3;
                                    f3 = d8b1Var.a;
                                    e8b1Var2 = d8b1Var.m;
                                    e8b1Var2.getClass();
                                    if (Math.abs(f3) < e8b1Var2.e || Math.abs(fMin3 - ((float) e8b1Var2.i)) >= e8b1Var2.d) {
                                        z3 = false;
                                    } else {
                                        d8b1Var.b = (float) d8b1Var.m.i;
                                        d8b1Var.a = 0;
                                        z3 = z2;
                                    }
                                }
                                float fMin4 = Math.min(d8b1Var.b, d8b1Var.g);
                                d8b1Var.b = fMin4;
                                float fMax4 = Math.max(fMin4, d8b1Var.h);
                                d8b1Var.b = fMax4;
                                d8b1Var.c(fMax4);
                                if (z3) {
                                    d8b1Var.b(false);
                                }
                            }
                        } else {
                            i = i;
                        }
                    }
                    i++;
                    z4 = false;
                }
                if (pd5Var.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    pd5Var.e = false;
                }
                if (arrayList.size() > 0) {
                    g23 g23Var = pd5Var.d;
                    if (g23Var == null) {
                        g23Var = new g23(pd5Var.c);
                        pd5Var.d = g23Var;
                    }
                    ((Choreographer) g23Var.c).postFrameCallback((od5) g23Var.d);
                }
                break;
            default:
                ((cfx0) obj).run();
                break;
        }
    }
}
