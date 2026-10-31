package p;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o580 {
    public static final o580 a = new o580();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* JADX WARN: Code duplicated, block: B:24:0x0035 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #3 {, blocks: (B:16:0x0023, B:24:0x0035, B:22:0x0030, B:19:0x002c), top: B:87:0x0023, outer: #0, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x005d A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {, blocks: (B:39:0x004b, B:47:0x005d, B:45:0x0058, B:42:0x0054), top: B:83:0x004b, outer: #0, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x006e A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x000d, B:12:0x0017, B:14:0x0020, B:15:0x0022, B:28:0x003c, B:29:0x003d, B:56:0x006a, B:58:0x006e, B:61:0x0074, B:63:0x007d, B:72:0x0095, B:69:0x008d, B:73:0x00a5, B:34:0x0044, B:37:0x0048, B:38:0x004a, B:51:0x0064, B:52:0x0065, B:55:0x0069, B:39:0x004b, B:47:0x005d, B:45:0x0058, B:16:0x0023, B:24:0x0035, B:22:0x0030, B:66:0x0089), top: B:82:0x000d, outer: #5, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0074 A[Catch: all -> 0x0040, TRY_ENTER, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x000d, B:12:0x0017, B:14:0x0020, B:15:0x0022, B:28:0x003c, B:29:0x003d, B:56:0x006a, B:58:0x006e, B:61:0x0074, B:63:0x007d, B:72:0x0095, B:69:0x008d, B:73:0x00a5, B:34:0x0044, B:37:0x0048, B:38:0x004a, B:51:0x0064, B:52:0x0065, B:55:0x0069, B:39:0x004b, B:47:0x005d, B:45:0x0058, B:16:0x0023, B:24:0x0035, B:22:0x0030, B:66:0x0089), top: B:82:0x000d, outer: #5, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x000d, B:12:0x0017, B:14:0x0020, B:15:0x0022, B:28:0x003c, B:29:0x003d, B:56:0x006a, B:58:0x006e, B:61:0x0074, B:63:0x007d, B:72:0x0095, B:69:0x008d, B:73:0x00a5, B:34:0x0044, B:37:0x0048, B:38:0x004a, B:51:0x0064, B:52:0x0065, B:55:0x0069, B:39:0x004b, B:47:0x005d, B:45:0x0058, B:16:0x0023, B:24:0x0035, B:22:0x0030, B:66:0x0089), top: B:82:0x000d, outer: #5, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0087  */
    /* JADX WARN: Code duplicated, block: B:71:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a5 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:8:0x000d, B:12:0x0017, B:14:0x0020, B:15:0x0022, B:28:0x003c, B:29:0x003d, B:56:0x006a, B:58:0x006e, B:61:0x0074, B:63:0x007d, B:72:0x0095, B:69:0x008d, B:73:0x00a5, B:34:0x0044, B:37:0x0048, B:38:0x004a, B:51:0x0064, B:52:0x0065, B:55:0x0069, B:39:0x004b, B:47:0x005d, B:45:0x0058, B:16:0x0023, B:24:0x0035, B:22:0x0030, B:66:0x0089), top: B:82:0x000d, outer: #5, inners: #1, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final synchronized void b(Context context, int i) {
        boolean z;
        Set set = dhn.a;
        if (set.contains(o580.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = b;
            if (atomicBoolean.get()) {
                return;
            }
            p811 p811Var = new p811();
            Object objA = null;
            if (i == 3) {
                synchronized (u580.l) {
                    if (!set.contains(u580.class)) {
                        try {
                            objA = u580.m;
                        } catch (Throwable th) {
                            dhn.a(u580.class, th);
                        }
                        if (objA == null) {
                            objA = dgb.d(context);
                        }
                    } else if (objA == null) {
                        objA = dgb.d(context);
                    }
                }
                p811Var.a = objA;
                if (p811Var.a == null) {
                    atomicBoolean.set(true);
                    return;
                }
                if (mn10.b(kn10.b1)) {
                    vey0 vey0Var = vey0.a;
                    if (set.contains(vey0.class)) {
                        z = false;
                    } else {
                        try {
                            z = vey0.b;
                        } catch (Throwable th2) {
                            dhn.a(vey0.class, th2);
                            z = false;
                        }
                    }
                    if (z || i == 3) {
                        ((p580) p811Var.a).a(b680.INAPP, new z0d(p811Var, i, context, (byte) 6));
                    } else {
                        ((p580) p811Var.a).a(b680.INAPP, new n580(i, context, (byte) 0));
                    }
                } else {
                    ((p580) p811Var.a).a(b680.INAPP, new n580(i, context, (byte) 0));
                }
                return;
            }
            if (i != 4) {
                if (p811Var.a == null) {
                    atomicBoolean.set(true);
                    return;
                }
                if (mn10.b(kn10.b1)) {
                    vey0 vey0Var2 = vey0.a;
                    if (set.contains(vey0.class)) {
                        z = false;
                    } else {
                        z = vey0.b;
                    }
                    if (z) {
                    }
                    ((p580) p811Var.a).a(b680.INAPP, new z0d(p811Var, i, context, (byte) 6));
                } else {
                    ((p580) p811Var.a).a(b680.INAPP, new n580(i, context, (byte) 0));
                }
                return;
            }
            s580 s580Var = v580.G;
            synchronized (s580Var) {
                if (!set.contains(v580.class)) {
                    try {
                        objA = v580.I;
                    } catch (Throwable th3) {
                        dhn.a(v580.class, th3);
                    }
                    if (objA == null) {
                        objA = s580Var.a(context);
                    }
                } else if (objA == null) {
                    objA = s580Var.a(context);
                }
            }
            p811Var.a = objA;
            if (p811Var.a == null) {
                atomicBoolean.set(true);
                return;
            }
            if (mn10.b(kn10.b1)) {
                vey0 vey0Var3 = vey0.a;
                if (set.contains(vey0.class)) {
                    z = false;
                } else {
                    z = vey0.b;
                }
                if (z) {
                }
                ((p580) p811Var.a).a(b680.INAPP, new z0d(p811Var, i, context, (byte) 6));
            } else {
                ((p580) p811Var.a).a(b680.INAPP, new n580(i, context, (byte) 0));
            }
            return;
            throw th;
        } catch (Throwable th4) {
            dhn.a(o580.class, th4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a(int i, String str) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        ConcurrentHashMap concurrentHashMap4;
        ConcurrentHashMap concurrentHashMap5;
        Set set = dhn.a;
        if (set.contains(this)) {
            return;
        }
        try {
            boolean z = false;
            if (!set.contains(y580.class)) {
                try {
                    z = !wf10.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).contains("APP_HAS_BEEN_LAUNCHED_KEY");
                } catch (Throwable th) {
                    dhn.a(y580.class, th);
                }
            }
            boolean z2 = z;
            if (z2) {
                y580.e();
            }
            if (i == 3) {
                y580.d(u580.b(), u580.c(), false, str, i, z2);
                y580.d(u580.d(), u580.c(), true, str, i, z2);
                u580.b().clear();
                u580.d().clear();
            } else {
                s580 s580Var = v580.G;
                ConcurrentHashMap concurrentHashMap6 = null;
                if (dhn.a.contains(v580.class)) {
                    concurrentHashMap = null;
                    if (dhn.a.contains(v580.class)) {
                        concurrentHashMap2 = null;
                        y580.d(concurrentHashMap, concurrentHashMap2, false, str, i, z2);
                        if (dhn.a.contains(v580.class)) {
                            concurrentHashMap3 = null;
                            if (dhn.a.contains(v580.class)) {
                                concurrentHashMap4 = null;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        try {
                                            concurrentHashMap6 = v580.K;
                                        } catch (Throwable th2) {
                                            dhn.a(v580.class, th2);
                                        }
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    try {
                                        concurrentHashMap5 = v580.J;
                                    } catch (Throwable th3) {
                                        dhn.a(v580.class, th3);
                                        concurrentHashMap5 = null;
                                    }
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                try {
                                    concurrentHashMap4 = v580.L;
                                } catch (Throwable th4) {
                                    dhn.a(v580.class, th4);
                                    concurrentHashMap4 = null;
                                }
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            try {
                                concurrentHashMap3 = v580.K;
                            } catch (Throwable th5) {
                                dhn.a(v580.class, th5);
                                concurrentHashMap3 = null;
                            }
                            if (dhn.a.contains(v580.class)) {
                                concurrentHashMap4 = null;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = v580.L;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    } else {
                        try {
                            concurrentHashMap2 = v580.L;
                        } catch (Throwable th6) {
                            dhn.a(v580.class, th6);
                            concurrentHashMap2 = null;
                        }
                        y580.d(concurrentHashMap, concurrentHashMap2, false, str, i, z2);
                        if (dhn.a.contains(v580.class)) {
                            concurrentHashMap3 = null;
                            if (dhn.a.contains(v580.class)) {
                                concurrentHashMap4 = null;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = v580.L;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            concurrentHashMap3 = v580.K;
                            if (dhn.a.contains(v580.class)) {
                                concurrentHashMap4 = null;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = v580.L;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    }
                } else {
                    try {
                        concurrentHashMap = v580.J;
                    } catch (Throwable th7) {
                        dhn.a(v580.class, th7);
                        concurrentHashMap = null;
                    }
                    if (dhn.a.contains(v580.class)) {
                        concurrentHashMap2 = null;
                        y580.d(concurrentHashMap, concurrentHashMap2, false, str, i, z2);
                        if (dhn.a.contains(v580.class)) {
                            concurrentHashMap3 = null;
                            if (dhn.a.contains(v580.class)) {
                                concurrentHashMap4 = null;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = v580.L;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            concurrentHashMap3 = v580.K;
                            if (dhn.a.contains(v580.class)) {
                                concurrentHashMap4 = null;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = v580.L;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    } else {
                        concurrentHashMap2 = v580.L;
                        y580.d(concurrentHashMap, concurrentHashMap2, false, str, i, z2);
                        if (dhn.a.contains(v580.class)) {
                            concurrentHashMap3 = null;
                            if (dhn.a.contains(v580.class)) {
                                concurrentHashMap4 = null;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = v580.L;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        } else {
                            concurrentHashMap3 = v580.K;
                            if (dhn.a.contains(v580.class)) {
                                concurrentHashMap4 = null;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            } else {
                                concurrentHashMap4 = v580.L;
                                y580.d(concurrentHashMap3, concurrentHashMap4, true, str, i, z2);
                                if (dhn.a.contains(v580.class)) {
                                    concurrentHashMap5 = null;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                } else {
                                    concurrentHashMap5 = v580.J;
                                    concurrentHashMap5.clear();
                                    if (!dhn.a.contains(v580.class)) {
                                        concurrentHashMap6 = v580.K;
                                    }
                                    concurrentHashMap6.clear();
                                }
                            }
                        }
                    }
                }
            }
            if (z2) {
                y580.f();
            }
        } catch (Throwable th8) {
            dhn.a(this, th8);
        }
    }
}
