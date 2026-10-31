package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class soe0 implements Function0 {
    public final voe0 a;
    public final Function0 b;
    public volatile Object c = uoe0.a;

    public soe0(voe0 voe0Var, Function0 function0) {
        this.a = voe0Var;
        this.b = function0;
    }

    public lls0 d(boolean z) {
        lls0 lls0VarC = this.a.c(null, "in a lazy value");
        if (lls0VarC != null) {
            return lls0VarC;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue", "recursionDetected"));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    public Object invoke() {
        Object objInvoke;
        lls0 lls0VarD;
        uoe0 uoe0Var = uoe0.c;
        uoe0 uoe0Var2 = uoe0.b;
        Object obj = this.c;
        if (!(obj instanceof uoe0)) {
            epo1.K(obj);
            return obj;
        }
        this.a.a.lock();
        try {
            Object obj2 = this.c;
            if (!(obj2 instanceof uoe0)) {
                epo1.K(obj2);
                this.a.a.unlock();
                return obj2;
            }
            if (obj2 == uoe0Var2) {
                this.c = uoe0Var;
                lls0 lls0VarD2 = d(true);
                if (!lls0VarD2.b) {
                    objInvoke = lls0VarD2.c;
                } else if (obj2 == uoe0Var) {
                    lls0VarD = d(false);
                    if (lls0VarD.b) {
                        this.c = uoe0Var2;
                        try {
                            objInvoke = this.b.invoke();
                            a(objInvoke);
                            this.c = objInvoke;
                        } catch (Throwable th) {
                            if (ggo1.I(th)) {
                                this.c = uoe0.a;
                                throw th;
                            }
                            if (this.c == uoe0Var2) {
                                this.c = new lim1(th);
                            }
                            this.a.b.getClass();
                            throw th;
                        }
                    } else {
                        objInvoke = lls0VarD.c;
                    }
                } else {
                    this.c = uoe0Var2;
                    objInvoke = this.b.invoke();
                    a(objInvoke);
                    this.c = objInvoke;
                }
            } else if (obj2 == uoe0Var) {
                lls0VarD = d(false);
                if (lls0VarD.b) {
                    objInvoke = lls0VarD.c;
                } else {
                    this.c = uoe0Var2;
                    objInvoke = this.b.invoke();
                    a(objInvoke);
                    this.c = objInvoke;
                }
            } else {
                this.c = uoe0Var2;
                objInvoke = this.b.invoke();
                a(objInvoke);
                this.c = objInvoke;
            }
            this.a.a.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            this.a.a.unlock();
            throw th2;
        }
    }

    public void a(Object obj) {
    }
}
