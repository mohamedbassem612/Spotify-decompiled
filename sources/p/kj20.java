package p;

import android.text.TextUtils;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class kj20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lj20 b;

    public /* synthetic */ kj20(lj20 lj20Var, byte b) {
        this.a = b;
        this.b = lj20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s19 s19VarO;
        s19 s19VarG;
        byte b = this.a;
        lj20 lj20Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                lj20Var.a();
                return;
            default:
                Object obj = lj20.l;
                synchronized (obj) {
                    try {
                        wi20 wi20Var = lj20Var.a;
                        wi20Var.a();
                        rm5 rm5VarK = rm5.k(wi20Var.a);
                        try {
                            s19VarO = lj20Var.c.o();
                            if (rm5VarK != null) {
                                rm5VarK.I();
                            }
                        } catch (Throwable th) {
                            if (rm5VarK != null) {
                                rm5VarK.I();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i = s19VarO.b;
                    if (i == 5) {
                        s19VarG = lj20Var.g(s19VarO);
                    } else {
                        if (i == 3) {
                            s19VarG = lj20Var.g(s19VarO);
                        } else if (!lj20Var.d.a(s19VarO)) {
                            return;
                        } else {
                            s19VarG = lj20Var.b(s19VarO);
                        }
                    }
                    synchronized (obj) {
                        try {
                            wi20 wi20Var2 = lj20Var.a;
                            wi20Var2.a();
                            rm5 rm5VarK2 = rm5.k(wi20Var2.a);
                            try {
                                lj20Var.c.g(s19VarG);
                                if (rm5VarK2 != null) {
                                    rm5VarK2.I();
                                }
                            } catch (Throwable th3) {
                                if (rm5VarK2 != null) {
                                    rm5VarK2.I();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (lj20Var) {
                        try {
                            if (lj20Var.j.size() != 0 && !TextUtils.equals(s19VarO.a, s19VarG.a)) {
                                Iterator it = lj20Var.j.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (s19VarG.b == 4) {
                        String str = s19VarG.a;
                        synchronized (lj20Var) {
                            lj20Var.i = str;
                        }
                    }
                    int i2 = s19VarG.b;
                    if (i2 == 5) {
                        lj20Var.h(new FirebaseInstallationsException());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        lj20Var.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        lj20Var.i(s19VarG);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    lj20Var.h(e);
                    return;
                }
        }
    }
}
