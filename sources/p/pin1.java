package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pin1 implements cgo1 {
    public final /* synthetic */ byte a;
    public final Serializable b;
    public Object c;
    public volatile Object d;

    public pin1(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.b = new wjn1();
                this.c = nfp1.class.getName();
                break;
            default:
                bbn1 bbn1Var = bbn1.d;
                this.b = new wjn1();
                this.d = bbn1Var;
                break;
        }
    }

    public Logger a() {
        Logger logger;
        Logger logger2;
        switch (this.a) {
            case 1:
                Logger logger3 = (Logger) this.d;
                if (logger3 != null) {
                    return logger3;
                }
                synchronized (((wjn1) this.b)) {
                    try {
                        logger = (Logger) this.d;
                        if (logger == null) {
                            logger = Logger.getLogger((String) this.c);
                            this.d = logger;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return logger;
            default:
                Logger logger4 = (Logger) this.d;
                if (logger4 != null) {
                    return logger4;
                }
                synchronized (((wjn1) this.b)) {
                    try {
                        logger2 = (Logger) this.d;
                        if (logger2 == null) {
                            logger2 = Logger.getLogger((String) this.c);
                            this.d = logger2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return logger2;
        }
    }

    public String toString() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String strQ = (no5) this.d;
                if (strQ == null) {
                    String strValueOf = String.valueOf(this.c);
                    strQ = l1d.q(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
                }
                String string = strQ.toString();
                return l1d.q(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
            case 1:
            default:
                return super.toString();
            case 2:
                String strQ2 = (cgo1) this.d;
                if (strQ2 == rdn1.c) {
                    String strValueOf2 = String.valueOf(this.c);
                    strQ2 = l1d.q(new StringBuilder(strValueOf2.length() + 25), "<supplier that returned ", strValueOf2, ">");
                }
                String strValueOf3 = String.valueOf(strQ2);
                return l1d.q(new StringBuilder(strValueOf3.length() + 19), "Suppliers.memoize(", strValueOf3, ")");
        }
    }

    public Object zza() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (((no5) this.d) != null) {
                    synchronized (((wjn1) this.b)) {
                        try {
                            if (((no5) this.d) != null) {
                                Object objC = ((no5) this.d).c();
                                this.c = objC;
                                this.d = null;
                                return objC;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return this.c;
            default:
                cgo1 cgo1Var = (cgo1) this.d;
                rdn1 rdn1Var = rdn1.c;
                if (cgo1Var != rdn1Var) {
                    synchronized (((wjn1) this.b)) {
                        try {
                            if (((cgo1) this.d) != rdn1Var) {
                                Object objZza = ((cgo1) this.d).zza();
                                this.c = objZza;
                                this.d = rdn1Var;
                                return objZza;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return this.c;
        }
    }

    public pin1(Class cls) {
        this.a = (byte) 1;
        this.b = new wjn1();
        this.c = cls.getName();
    }

    public pin1(no5 no5Var) {
        this.a = (byte) 0;
        this.b = new wjn1();
        this.d = no5Var;
    }
}
