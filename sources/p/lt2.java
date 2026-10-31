package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class lt2 {
    public static final se11 a = new se11("^spotify:user:[^:]+:playlist:.+");

    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0053 -> B:12:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(p.jr2 r6, java.lang.String r7, p.onm r8) {
        /*
            boolean r0 = r8 instanceof p.kt2
            if (r0 == 0) goto L13
            r0 = r8
            p.kt2 r0 = (p.kt2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.kt2 r0 = new p.kt2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.d
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            java.util.List r6 = r0.c
            java.util.List r6 = (java.util.List) r6
            java.lang.String r7 = r0.b
            p.jr2 r1 = r0.a
            p.hm5.M(r8)
            r5 = r0
            r0 = r6
            r6 = r1
        L30:
            r1 = r5
            goto L57
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r3
        L38:
            java.util.ArrayList r8 = p.hrt.j(r8)
            r1 = r3
        L3d:
            r0.a = r6
            r0.b = r7
            r4 = r8
            java.util.List r4 = (java.util.List) r4
            r0.c = r4
            r0.e = r2
            p.wr2 r6 = (p.wr2) r6
            java.lang.Object r1 = r6.f(r7, r1, r0)
            p.d9n r4 = p.d9n.a
            if (r1 != r4) goto L53
            return r4
        L53:
            r5 = r0
            r0 = r8
            r8 = r1
            goto L30
        L57:
            p.qs2 r8 = (p.qs2) r8
            r0.add(r8)
            java.lang.String r8 = r8.b
            if (r8 == 0) goto L67
            boolean r4 = p.ihc1.y0(r8)
            if (r4 != 0) goto L67
            goto L68
        L67:
            r8 = r3
        L68:
            if (r8 != 0) goto L6b
            return r0
        L6b:
            r5 = r1
            r1 = r8
            r8 = r0
            r0 = r5
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lt2.a(p.jr2, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    public static final ys2 b(ArrayList arrayList) {
        ijg1 ijg1Var;
        xs2 xs2Var;
        int i;
        Iterator it = arrayList.iterator();
        do {
            ijg1Var = null;
            if (!it.hasNext()) {
                xs2Var = null;
                break;
            }
            xs2Var = ((gr2) it.next()).a;
        } while (xs2Var == null);
        if (xs2Var != null) {
            String str = xs2Var.a;
            String str2 = !ihc1.y0(str) ? str : null;
            if (str2 != null) {
                String str3 = xs2Var.b;
                String str4 = (str3 == null || ihc1.y0(str3)) ? null : str3;
                Long l = xs2Var.c;
                String str5 = xs2Var.d;
                if (str5 != null) {
                    int iHashCode = str5.hashCode();
                    if (iHashCode != 324393423) {
                        if (iHashCode != 1795426889) {
                            if (iHashCode == 2041810981 && str5.equals("TRANSITION_MODE_UNSPECIFIED")) {
                                ijg1Var = ijg1.a;
                            }
                        } else if (str5.equals("TRANSITION_MODE_SEAMLESS")) {
                            ijg1Var = ijg1.c;
                        }
                    } else if (str5.equals("TRANSITION_MODE_INSTANT")) {
                        ijg1Var = ijg1.b;
                    }
                }
                ijg1 ijg1Var2 = ijg1Var;
                h290 h290Var = xs2Var.e;
                String str6 = xs2Var.f;
                if (str6 == null) {
                    i = 0;
                } else {
                    int iHashCode2 = str6.hashCode();
                    if (iHashCode2 != -739603623) {
                        if (iHashCode2 != -738078943) {
                            if (iHashCode2 == 668878485 && str6.equals("SHUFFLE_MODE_ON")) {
                                i = 2;
                            } else {
                                i = 0;
                            }
                        } else if (str6.equals("SHUFFLE_MODE_UNSPECIFIED")) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } else if (str6.equals("SHUFFLE_MODE_OFF")) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                }
                return new ys2(str2, str4, l, ijg1Var2, h290Var, i);
            }
        }
        return null;
    }
}
