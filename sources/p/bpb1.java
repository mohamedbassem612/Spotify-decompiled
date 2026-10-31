package p;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bpb1 extends ba implements wen0, phd, fx30 {
    public static final /* synthetic */ long f = avg.a.objectFieldOffset(bpb1.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public bpb1(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p.sen0
    public final boolean a(Object obj) {
        l(obj);
        return true;
    }

    @Override // p.fx30
    public final mr20 b(o8n o8nVar, int i, int i2) {
        return gio1.n(this, o8nVar, i, i2);
    }

    @Override // p.at71
    public final List c() {
        return k4p1.x(getValue());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:33:0x0086, B:35:0x0090, B:37:0x0095, B:47:0x00b9, B:50:0x00c9, B:52:0x00ee, B:53:0x00f1, B:39:0x009b, B:43:0x00a2, B:21:0x004b, B:24:0x0054, B:32:0x0077, B:27:0x0062, B:29:0x0066), top: B:60:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:33:0x0086, B:35:0x0090, B:37:0x0095, B:47:0x00b9, B:50:0x00c9, B:52:0x00ee, B:53:0x00f1, B:39:0x009b, B:43:0x00a2, B:21:0x004b, B:24:0x0054, B:32:0x0077, B:27:0x0062, B:29:0x0066), top: B:60:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:33:0x0086, B:35:0x0090, B:37:0x0095, B:47:0x00b9, B:50:0x00c9, B:52:0x00ee, B:53:0x00f1, B:39:0x009b, B:43:0x00a2, B:21:0x004b, B:24:0x0054, B:32:0x0077, B:27:0x0062, B:29:0x0066), top: B:60:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:33:0x0086, B:35:0x0090, B:37:0x0095, B:47:0x00b9, B:50:0x00c9, B:52:0x00ee, B:53:0x00f1, B:39:0x009b, B:43:0x00a2, B:21:0x004b, B:24:0x0054, B:32:0x0077, B:27:0x0062, B:29:0x0066), top: B:60:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00c8 -> B:33:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p.mr20
    public final java.lang.Object collect(p.vr20 r12, p.lnm r13) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bpb1.collect(p.vr20, p.lnm):java.lang.Object");
    }

    @Override // p.sen0
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p.sen0, p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        l(obj);
        return rih1.a;
    }

    @Override // p.zob1
    public final Object getValue() {
        Object objectVolatile = avg.a.getObjectVolatile(this, f);
        if (objectVolatile == wqn1.a) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean k(Object obj, Object obj2) {
        jm jmVar = wqn1.a;
        if (obj == null) {
            obj = jmVar;
        }
        if (obj2 == null) {
            obj2 = jmVar;
        }
        return m(obj, obj2);
    }

    public final void l(Object obj) {
        if (obj == null) {
            obj = wqn1.a;
        }
        m(null, obj);
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        ca[] caVarArr;
        synchronized (this) {
            Unsafe unsafe = avg.a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !u890.j(objectVolatile, obj)) {
                return false;
            }
            if (u890.j(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            ca[] caVarArr2 = this.a;
            while (true) {
                hpb1[] hpb1VarArr = (hpb1[]) caVarArr2;
                if (hpb1VarArr != null) {
                    for (hpb1 hpb1Var : hpb1VarArr) {
                        if (hpb1Var != null) {
                            AtomicReference atomicReference = hpb1Var.a;
                            while (true) {
                                Object objJ = s110.j(atomicReference);
                                if (objJ == null || objJ == gio1.b) {
                                    break;
                                }
                                if (objJ != gio1.a) {
                                    if (h4b1.k(atomicReference, objJ)) {
                                        ((ohd) objJ).resumeWith(rih1.a);
                                        break;
                                    }
                                } else {
                                    if (h4b1.i(atomicReference, objJ)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    caVarArr = this.a;
                }
                caVarArr2 = caVarArr;
                i3 = i;
            }
        }
    }
}
