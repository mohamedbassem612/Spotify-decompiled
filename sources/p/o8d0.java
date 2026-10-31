package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class o8d0 implements nzc, plh0, Function, akl, cdd1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o8d0(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    public void accept(Object obj) {
        ch61 ch61Var;
        int i;
        fzh0 fzh0Var = (fzh0) this.c;
        ixh0 ixh0Var = (ixh0) this.d;
        try {
            ch61Var = (ch61) ((n8d0) obj).get();
            dm5.s(ch61Var, "SessionResult must not be null");
        } catch (InterruptedException e) {
            e = e;
            oon1.I("Session operation failed", e);
            if (e.getCause() instanceof UnsupportedOperationException) {
                i = -6;
            } else {
                i = -1;
            }
            ch61Var = new ch61(i);
        } catch (CancellationException e2) {
            oon1.I("Session operation cancelled", e2);
            ch61Var = new ch61(1);
        } catch (ExecutionException e3) {
            e = e3;
            oon1.I("Session operation failed", e);
            if (e.getCause() instanceof UnsupportedOperationException) {
                i = -6;
            } else {
                i = -1;
            }
            ch61Var = new ch61(i);
        }
        h2i0.i1(fzh0Var, ixh0Var, this.b, ch61Var);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006b  */
    /* JADX WARN: Code duplicated, block: B:16:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public Object apply(Object obj) {
        UbiSpecificationId ubiSpecificationId;
        j5 j5VarA;
        Completable completableIgnoreElement;
        byte b = this.a;
        Object obj2 = this.d;
        int i = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 3:
                rxh0 rxh0Var = (rxh0) obj3;
                String str = (String) obj2;
                Logger.h((Throwable) obj, "Resolving with the session-less callback instead.", new Object[0]);
                txh0 txh0Var = rxh0Var.b;
                x610 x610Var = txh0Var.d;
                if (x610Var != null) {
                    for (uxh0 uxh0Var : rxh0Var.a) {
                        if (uxh0Var != null && uxh0Var.b(str)) {
                            return uxh0Var.c(x610Var, i);
                        }
                    }
                }
                Logger.g("Couldn't create a callback for package %s. Binder: %s. Resolving with the default callback instead", new Object[]{str, x610Var});
                bkv bkvVar = txh0Var.b;
                return bkvVar == null ? txh0Var.a : bkvVar;
            default:
                b791 b791Var = (b791) obj3;
                m210 m210Var = (m210) obj2;
                spq0 spq0Var = (spq0) obj;
                g710 g710Var = b791Var.c;
                if (!spq0Var.c()) {
                    return CompletableEmpty.a;
                }
                ContextTrack contextTrack = (ContextTrack) spq0Var.b();
                String strUri = contextTrack.uri();
                String strUri2 = contextTrack.uri();
                String str2 = (String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_CONTEXT_URI);
                String str3 = m210Var.k;
                oyr oyrVar = b791Var.d;
                Iterator it = oyrVar.b.entrySet().iterator();
                do {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        ubiSpecificationId = (UbiSpecificationId) entry.getKey();
                        ((r64) entry.getValue()).getClass();
                    } else {
                        ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                    }
                    if (ubiSpecificationId == UbiSpecificationId.UNKNOWN) {
                        j5VarA = j5.a;
                    } else {
                        if (str2 == null) {
                            str2 = strUri2;
                        }
                        j5VarA = oyrVar.a(false, strUri2, new r710(ubiSpecificationId, str2, "com.spotify.queue", Integer.valueOf(i)));
                    }
                    completableIgnoreElement = b791Var.a.e(m210Var, strUri, (w7h1) j5VarA.h(), (ou80) null, 1).ignoreElement();
                    if (i > 0) {
                        return g710Var.k.a(q9u0.k(SkipToNextTrackCommand.builder().track(contextTrack).build())).ignoreElement().q(completableIgnoreElement);
                    }
                    if (i < 0) {
                        return g710Var.k.a(new o9u0(SkipToPrevTrackCommand.builder().track(contextTrack).build())).ignoreElement().q(completableIgnoreElement);
                    }
                    return completableIgnoreElement;
                } while (!jo31.o(str3));
                if (ubiSpecificationId == UbiSpecificationId.UNKNOWN) {
                    j5VarA = j5.a;
                } else {
                    if (str2 == null) {
                        str2 = strUri2;
                    }
                    j5VarA = oyrVar.a(false, strUri2, new r710(ubiSpecificationId, str2, "com.spotify.queue", Integer.valueOf(i)));
                }
                completableIgnoreElement = b791Var.a.e(m210Var, strUri, (w7h1) j5VarA.h(), (ou80) null, 1).ignoreElement();
                if (i > 0) {
                    return g710Var.k.a(q9u0.k(SkipToNextTrackCommand.builder().track(contextTrack).build())).ignoreElement().q(completableIgnoreElement);
                }
                if (i < 0) {
                    return g710Var.k.a(new o9u0(SkipToPrevTrackCommand.builder().track(contextTrack).build())).ignoreElement().q(completableIgnoreElement);
                }
                return completableIgnoreElement;
        }
    }

    public Object attachCompleter(mzc mzcVar) {
        o8n o8nVar = (o8n) this.c;
        vu30 vu30Var = (vu30) this.d;
        mzcVar.a(new gv40(o8nVar.A(fkj0.W0), (byte) 10), k5u.a);
        return fn31.T(smo1.e(o8nVar), (o8n) null, this.b, new n0a0(vu30Var, mzcVar, (lnm) null, (byte) 19), 1);
    }

    public Object c() {
        ywv0 ywv0Var = (ywv0) this.c;
        ((haa0) ywv0Var.d).s((s29) this.d, this.b + 1, false);
        return null;
    }

    public void f(kh70 kh70Var, int i) {
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.b;
        rlh0 rlh0Var = (rlh0) this.c;
        switch (b) {
            case 1:
                List list = (List) obj;
                xlh0 xlh0Var = rlh0Var.c;
                v280 v280VarM = b380.m();
                for (int i3 = 0; i3 < list.size(); i3++) {
                    v280VarM.c(((yoh0) list.get(i3)).e(rlh0Var.o(), true));
                }
                kh70Var.E(xlh0Var, i, i2, new occ(v280VarM.g()));
                break;
            default:
                yoh0 yoh0Var = (yoh0) obj;
                int iO = rlh0Var.o();
                xlh0 xlh0Var2 = rlh0Var.c;
                if (iO >= 2) {
                    kh70Var.l(xlh0Var2, i, i2, yoh0Var.e(rlh0Var.o(), true));
                } else {
                    kh70Var.C0(xlh0Var2, i, i2 + 1, yoh0Var.e(rlh0Var.o(), true));
                    kh70Var.F0(xlh0Var2, i, i2);
                }
                break;
        }
    }

    public /* synthetic */ o8d0(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
