package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g8u0 implements f961 {
    public final yqg a;
    public final kly0 b;
    public final zuw0 c;
    public final add d;
    public final Flowable e;
    public final llm f;
    public i8u0 g;

    public g8u0(yqg yqgVar, kly0 kly0Var, zuw0 zuw0Var, add addVar, Flowable flowable, q8n q8nVar) {
        this.a = yqgVar;
        this.b = kly0Var;
        this.c = zuw0Var;
        this.d = addVar;
        this.e = flowable;
        p8n p8nVar = q8n.b;
        q8n q8nVarM = q8nVar.M(1);
        j0d1 j0d1VarB = guo1.B();
        q8nVarM.getClass();
        this.f = smo1.e(flo1.l(q8nVarM, j0d1VarB).y(new z8n("PlayedReceiptTracker")));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[Catch: all -> 0x008f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:22:0x0032, B:23:0x0035, B:25:0x007c, B:26:0x007f, B:12:0x001d, B:14:0x0023), top: B:32:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0032 A[Catch: all -> 0x008f, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:22:0x0032, B:23:0x0035, B:25:0x007c, B:26:0x007f, B:12:0x001d, B:14:0x0023), top: B:32:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[Catch: all -> 0x008f, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:22:0x0032, B:23:0x0035, B:25:0x007c, B:26:0x007f, B:12:0x001d, B:14:0x0023), top: B:32:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x002c, please report this as an issue */
    public final synchronized void a(String str, String str2, String str3) {
        x2p1 x2p1Var;
        x2p1 d8u0Var;
        i8u0 i8u0Var;
        xab1 xab1Var;
        if (this.d.i()) {
            if (!nzy.g(str)) {
                if (nzy.c(str)) {
                    d8u0Var = new d8u0(str);
                } else {
                    x2p1Var = null;
                }
                if (x2p1Var == null) {
                    return;
                }
                i8u0Var = this.g;
                if (i8u0Var != null) {
                    i8u0Var.b();
                }
                this.g = null;
                yqg yqgVar = this.a;
                ytw0 ytw0Var = jfv.b;
                int iO = this.d.a.O();
                ngv ngvVar = ngv.e;
                i8u0 i8u0Var2 = new i8u0(x2p1Var, yqgVar, fdg1.k0(iO, ngvVar), fdg1.k0(this.d.a.N(), ngvVar), null, new f8u0(this, str2, str3, (byte) 0));
                this.g = i8u0Var2;
                llm llmVar = this.f;
                Flowable flowable = this.e;
                vbm[] vbmVarArr = q601.a;
                kge kgeVar = new kge(flowable);
                i8u0Var2.e(llmVar);
                xab1Var = i8u0Var2.l;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                i8u0Var2.l = fn31.T(llmVar, (o8n) null, 0, new dvq0(kgeVar, i8u0Var2, llmVar, (lnm) null, (byte) 24), 3);
            }
            d8u0Var = new e8u0(str);
            x2p1Var = d8u0Var;
            if (x2p1Var == null) {
                return;
            }
            i8u0Var = this.g;
            if (i8u0Var != null) {
                i8u0Var.b();
            }
            this.g = null;
            yqg yqgVar2 = this.a;
            ytw0 ytw0Var2 = jfv.b;
            int iO2 = this.d.a.O();
            ngv ngvVar2 = ngv.e;
            i8u0 i8u0Var3 = new i8u0(x2p1Var, yqgVar2, fdg1.k0(iO2, ngvVar2), fdg1.k0(this.d.a.N(), ngvVar2), null, new f8u0(this, str2, str3, (byte) 0));
            this.g = i8u0Var3;
            llm llmVar2 = this.f;
            Flowable flowable2 = this.e;
            vbm[] vbmVarArr2 = q601.a;
            kge kgeVar2 = new kge(flowable2);
            i8u0Var3.e(llmVar2);
            xab1Var = i8u0Var3.l;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            i8u0Var3.l = fn31.T(llmVar2, (o8n) null, 0, new dvq0(kgeVar2, i8u0Var3, llmVar2, (lnm) null, (byte) 24), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[Catch: all -> 0x00be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0032 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:24:0x0034 A[Catch: all -> 0x00be, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0038 A[Catch: all -> 0x00be, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x003e A[Catch: all -> 0x00be, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0043 A[Catch: all -> 0x00be, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0047 A[Catch: all -> 0x00be, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0051 A[Catch: all -> 0x00be, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005c A[Catch: all -> 0x00be, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0062  */
    /* JADX WARN: Code duplicated, block: B:42:0x0067 A[Catch: all -> 0x00be, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8 A[Catch: all -> 0x00be, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000f, B:10:0x0016, B:20:0x002e, B:24:0x0034, B:26:0x0038, B:28:0x003e, B:32:0x004b, B:34:0x0051, B:40:0x0063, B:42:0x0067, B:43:0x006a, B:45:0x00a8, B:46:0x00ab, B:29:0x0043, B:31:0x0047, B:37:0x005c, B:38:0x0061, B:12:0x001d, B:14:0x0023), top: B:52:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x002c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x0032, please report this as an issue */
    public final synchronized void b(String str, r091 r091Var, String str2, String str3) {
        x2p1 x2p1Var;
        x2p1 d8u0Var;
        i8u0 i8u0Var;
        jfv jfvVar;
        i8u0 i8u0Var2;
        xab1 xab1Var;
        x2p1 x2p1Var2;
        String str4;
        jfv jfvVar2;
        if (this.d.i()) {
            if (!nzy.g(str)) {
                if (nzy.c(str)) {
                    d8u0Var = new d8u0(str);
                } else {
                    x2p1Var = null;
                }
                if (x2p1Var == null) {
                    return;
                }
                if (x2p1Var instanceof e8u0) {
                    i8u0Var = this.g;
                    if (i8u0Var != null) {
                        x2p1Var2 = i8u0Var.a;
                        if (x2p1Var2 instanceof e8u0) {
                            str4 = ((e8u0) x2p1Var2).c;
                        } else {
                            if (x2p1Var2 instanceof d8u0) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str4 = ((d8u0) x2p1Var2).c;
                        }
                        if (u890.j(str4, str)) {
                            jfvVar2 = new jfv(i8u0Var.g);
                        } else {
                            jfvVar2 = null;
                        }
                        jfvVar = jfvVar2;
                    } else {
                        jfvVar = null;
                    }
                    i8u0Var2 = this.g;
                    if (i8u0Var2 != null) {
                        i8u0Var2.b();
                    }
                    this.g = null;
                    yqg yqgVar = this.a;
                    ytw0 ytw0Var = jfv.b;
                    int iO = this.d.a.O();
                    ngv ngvVar = ngv.e;
                    i8u0 i8u0Var3 = new i8u0(x2p1Var, yqgVar, fdg1.k0(iO, ngvVar), fdg1.k0(this.d.a.N(), ngvVar), jfvVar, new f8u0(this, str2, str3, (byte) 1));
                    this.g = i8u0Var3;
                    llm llmVar = this.f;
                    i8u0Var3.e(llmVar);
                    xab1Var = i8u0Var3.l;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    i8u0Var3.l = fn31.T(llmVar, (o8n) null, 0, new dvq0(r091Var, i8u0Var3, llmVar, (lnm) null, (byte) 25), 3);
                }
                return;
            }
            d8u0Var = new e8u0(str);
            x2p1Var = d8u0Var;
            if (x2p1Var == null) {
                return;
            }
            if (x2p1Var instanceof e8u0) {
                return;
            }
            i8u0Var = this.g;
            if (i8u0Var != null) {
                x2p1Var2 = i8u0Var.a;
                if (x2p1Var2 instanceof e8u0) {
                    str4 = ((e8u0) x2p1Var2).c;
                } else {
                    if (x2p1Var2 instanceof d8u0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str4 = ((d8u0) x2p1Var2).c;
                }
                if (u890.j(str4, str)) {
                    jfvVar2 = new jfv(i8u0Var.g);
                } else {
                    jfvVar2 = null;
                }
                jfvVar = jfvVar2;
            } else {
                jfvVar = null;
            }
            i8u0Var2 = this.g;
            if (i8u0Var2 != null) {
                i8u0Var2.b();
            }
            this.g = null;
            yqg yqgVar2 = this.a;
            ytw0 ytw0Var2 = jfv.b;
            int iO2 = this.d.a.O();
            ngv ngvVar2 = ngv.e;
            i8u0 i8u0Var4 = new i8u0(x2p1Var, yqgVar2, fdg1.k0(iO2, ngvVar2), fdg1.k0(this.d.a.N(), ngvVar2), jfvVar, new f8u0(this, str2, str3, (byte) 1));
            this.g = i8u0Var4;
            llm llmVar2 = this.f;
            i8u0Var4.e(llmVar2);
            xab1Var = i8u0Var4.l;
            if (xab1Var != null) {
                xab1Var.d((CancellationException) null);
            }
            i8u0Var4.l = fn31.T(llmVar2, (o8n) null, 0, new dvq0(r091Var, i8u0Var4, llmVar2, (lnm) null, (byte) 25), 3);
        }
    }

    public final synchronized void shutdown() {
        i8u0 i8u0Var = this.g;
        if (i8u0Var != null) {
            i8u0Var.b();
        }
        this.g = null;
        smo1.p(this.f, (CancellationException) null);
    }

    public final Object getApi() {
        return this;
    }
}
