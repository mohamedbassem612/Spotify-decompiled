package p;

import android.app.Activity;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fqe0 {
    public final Activity a;
    public final lzn0 b;
    public final swv0 c;
    public final fre0 d;
    public final yge0 e;
    public final kt91 f;
    public final q8n g;
    public final q8n h;

    public fqe0(Activity activity, lzn0 lzn0Var, swv0 swv0Var, fre0 fre0Var, yge0 yge0Var, kt91 kt91Var, q8n q8nVar, q8n q8nVar2) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = swv0Var;
        this.d = fre0Var;
        this.e = yge0Var;
        this.f = kt91Var;
        this.g = q8nVar;
        this.h = q8nVar2;
    }

    public final Object a(onm onmVar) {
        Object objY = fn31.Y(this.h, new tpe0(this, null, (byte) 1), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[Catch: Exception -> 0x00df, CancellationException -> 0x0110, TRY_LEAVE, TryCatch #1 {Exception -> 0x00df, blocks: (B:44:0x00b8, B:46:0x00c1), top: B:66:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ppe0 ppe0Var, onm onmVar) {
        dqe0 dqe0Var;
        String string;
        String strH1;
        Exception e;
        String str;
        ppe0 ppe0Var2;
        String str2;
        q8n q8nVar;
        p6d0 p6d0Var;
        String str3;
        ppe0 ppe0Var3;
        if (onmVar instanceof dqe0) {
            dqe0Var = (dqe0) onmVar;
            int i = dqe0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqe0Var.f = i - Integer.MIN_VALUE;
            } else {
                dqe0Var = new dqe0(this, onmVar);
            }
        } else {
            dqe0Var = new dqe0(this, onmVar);
        }
        Object obj = dqe0Var.d;
        int i2 = dqe0Var.f;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                string = this.a.getString(2131957661);
                String str4 = ppe0Var.a;
                if (ihc1.i0(str4, '\\')) {
                    strH1 = null;
                } else {
                    strH1 = ihc1.h1(str4, new char[]{'/'});
                    if (strH1.length() == 0 || ihc1.h0(strH1, "://", false) || ihc1.h0(strH1, "..", false)) {
                        strH1 = null;
                    }
                }
                if (strH1 == null) {
                    Logger.k("LockStateCallback: Rejected unsafe callback path: ".concat(ppe0Var.a), new Object[0]);
                    return new kqe0(ppe0Var.c, string);
                }
                try {
                    fre0 fre0Var = this.d;
                    dqe0Var.a = ppe0Var;
                    dqe0Var.b = string;
                    dqe0Var.c = strH1;
                    dqe0Var.f = 1;
                    if (fre0Var.b(strH1, dqe0Var) != d9nVar) {
                        ppe0Var2 = ppe0Var;
                        str2 = strH1;
                        hap1.e(ppe0Var2.b);
                        if (ppe0Var2.d) {
                            q8nVar = this.h;
                            p6d0Var = new p6d0(this, (lnm) null, (byte) 12);
                            dqe0Var.a = ppe0Var2;
                            dqe0Var.b = string;
                            dqe0Var.c = str2;
                            dqe0Var.f = 2;
                            if (fn31.Y(q8nVar, p6d0Var, dqe0Var) != d9nVar) {
                                str = str2;
                                str3 = string;
                                ppe0Var3 = ppe0Var2;
                                string = str3;
                                ppe0Var = ppe0Var3;
                            }
                        } else {
                            str = str2;
                            ppe0Var = ppe0Var2;
                        }
                        return new lqe0(ppe0Var.b);
                    }
                    return d9nVar;
                } catch (Exception e2) {
                    e = e2;
                    str = strH1;
                }
            } else if (i2 == 1) {
                str2 = dqe0Var.c;
                String str5 = dqe0Var.b;
                ppe0Var2 = dqe0Var.a;
                try {
                    hm5.M(obj);
                    string = str5;
                    try {
                        hap1.e(ppe0Var2.b);
                        if (ppe0Var2.d) {
                            q8nVar = this.h;
                            p6d0Var = new p6d0(this, (lnm) null, (byte) 12);
                            dqe0Var.a = ppe0Var2;
                            dqe0Var.b = string;
                            dqe0Var.c = str2;
                            dqe0Var.f = 2;
                            if (fn31.Y(q8nVar, p6d0Var, dqe0Var) != d9nVar) {
                                str = str2;
                                str3 = string;
                                ppe0Var3 = ppe0Var2;
                                string = str3;
                                ppe0Var = ppe0Var3;
                            }
                            return d9nVar;
                        }
                        str = str2;
                        ppe0Var = ppe0Var2;
                        return new lqe0(ppe0Var.b);
                    } catch (Exception e3) {
                        e = e3;
                        str = str2;
                        ppe0Var = ppe0Var2;
                    }
                } catch (Exception e4) {
                    str = str2;
                    e = e4;
                    string = str5;
                    ppe0Var = ppe0Var2;
                    Logger.k(gvg.h("LockStateCallback: Callback failed for path: ", str, ", follow-up: ", hap1.e(ppe0Var.c)), new Object[]{e});
                    return new kqe0(ppe0Var.c, string);
                }
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = dqe0Var.c;
                str3 = dqe0Var.b;
                ppe0Var3 = dqe0Var.a;
                try {
                    hm5.M(obj);
                    string = str3;
                    ppe0Var = ppe0Var3;
                    try {
                        return new lqe0(ppe0Var.b);
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    string = str3;
                    ppe0Var = ppe0Var3;
                    e = e6;
                }
            }
            Logger.k(gvg.h("LockStateCallback: Callback failed for path: ", str, ", follow-up: ", hap1.e(ppe0Var.c)), new Object[]{e});
            return new kqe0(ppe0Var.c, string);
        } catch (CancellationException e7) {
            throw e7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        eqe0 eqe0Var;
        if (onmVar instanceof eqe0) {
            eqe0Var = (eqe0) onmVar;
            int i = eqe0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eqe0Var.c = i - Integer.MIN_VALUE;
            } else {
                eqe0Var = new eqe0(this, onmVar);
            }
        } else {
            eqe0Var = new eqe0(this, onmVar);
        }
        Object objE = eqe0Var.a;
        int i2 = eqe0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                yge0 yge0Var = this.e;
                eqe0Var.c = 1;
                objE = yge0Var.e(eqe0Var);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objE);
            }
            xoe0 xoe0Var = (xoe0) objE;
            if (xoe0Var != null) {
                return new nqe0(xoe0Var);
            }
            Logger.k("LockStateCallback: Content reload returned null", new Object[0]);
            return new mqe0("No lock definition");
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.k("LockStateCallback: Content reload failed", new Object[]{e2});
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new mqe0(message);
        }
    }
}
