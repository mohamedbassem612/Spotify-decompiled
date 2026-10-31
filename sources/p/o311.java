package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o311 extends a8d1 implements xu30 {
    public final /* synthetic */ p311 X;
    public List a;
    public List b;
    public List c;
    public oen0 d;
    public oen0 e;
    public oen0 f;
    public Set g;
    public oen0 h;
    public byte i;
    public /* synthetic */ rjm0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o311(p311 p311Var, lnm lnmVar) {
        super(3, lnmVar);
        this.X = p311Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[Catch: all -> 0x002c, LOOP:1: B:12:0x0042->B:22:0x0078, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[Catch: all -> 0x002c, LOOP:3: B:27:0x0090->B:37:0x00bd, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100 A[Catch: all -> 0x002c, LOOP:5: B:41:0x00d0->B:51:0x0100, LOOP_END, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x000d, B:6:0x001d, B:9:0x002f, B:12:0x0042, B:14:0x0053, B:16:0x005d, B:18:0x0063, B:19:0x0070, B:24:0x0083, B:27:0x0090, B:29:0x009b, B:31:0x00a5, B:33:0x00ab, B:34:0x00b5, B:37:0x00bd, B:38:0x00c0, B:41:0x00d0, B:43:0x00db, B:45:0x00e5, B:47:0x00eb, B:48:0x00f8, B:51:0x0100, B:52:0x0103, B:22:0x0078), top: B:57:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0083 A[EDGE_INSN: B:61:0x0083->B:24:0x0083 BREAK  A[LOOP:1: B:12:0x0042->B:22:0x0078], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0 A[EDGE_INSN: B:66:0x00c0->B:38:0x00c0 BREAK  A[LOOP:3: B:27:0x0090->B:37:0x00bd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0103 A[EDGE_INSN: B:71:0x0103->B:52:0x0103 BREAK  A[LOOP:5: B:41:0x00d0->B:51:0x0100], SYNTHETIC] */
    public static final void e(p311 p311Var, List list, List list2, List list3, oen0 oen0Var, oen0 oen0Var2, oen0 oen0Var3, oen0 oen0Var4) {
        char c;
        long j;
        long j2;
        synchronized (p311Var.d) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    h4k h4kVar = (h4k) list3.get(i);
                    h4kVar.a();
                    p311Var.Q(h4kVar);
                }
                list3.clear();
                Object[] objArr = oen0Var.b;
                long[] jArr = oen0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    h4k h4kVar2 = (h4k) objArr[(i2 << 3) + i4];
                                    h4kVar2.a();
                                    p311Var.Q(h4kVar2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                oen0Var.b();
                Object[] objArr2 = oen0Var2.b;
                long[] jArr2 = oen0Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) == j2) {
                            if (i5 != length2) {
                                break;
                                break;
                            }
                            i5++;
                        } else {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((h4k) objArr2[(i5 << 3) + i7]).j();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 != length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                oen0Var2.b();
                oen0Var3.b();
                Object[] objArr3 = oen0Var4.b;
                long[] jArr3 = oen0Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) == j2) {
                            if (i8 != length3) {
                                break;
                                break;
                            }
                            i8++;
                        } else {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    h4k h4kVar3 = (h4k) objArr3[(i8 << 3) + i10];
                                    h4kVar3.a();
                                    p311Var.Q(h4kVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 != length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                oen0Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void g(List list, p311 p311Var) {
        list.clear();
        synchronized (p311Var.d) {
            try {
                ArrayList arrayList = p311Var.l;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((znm0) arrayList.get(i));
                }
                p311Var.l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        o311 o311Var = new o311(this.X, (lnm) obj3);
        o311Var.t = (rjm0) obj2;
        o311Var.invokeSuspend(rih1.a);
        return d9n.a;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:113:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x00a5 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e5 A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #3 {, blocks: (B:19:0x00dd, B:22:0x00e5), top: B:113:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:43:0x0143  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x02a2 -> B:103:0x029d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0143 -> B:44:0x014b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o311.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
