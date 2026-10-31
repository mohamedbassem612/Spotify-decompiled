package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pck1 {
    public final Context a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;
    public final ynb0 e;
    public final mr20 f;
    public final ae5 g;
    public final p2f0 h;
    public final p85 i;
    public final zsc j;
    public final ynb0 k;

    public pck1(Context context, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, f15 f15Var, ynb0 ynb0Var4, mr20 mr20Var, ae5 ae5Var, p2f0 p2f0Var, p85 p85Var, zsc zscVar, ynb0 ynb0Var5) {
        this.a = context;
        this.b = ynb0Var;
        this.c = ynb0Var2;
        this.d = ynb0Var3;
        this.e = ynb0Var4;
        this.f = mr20Var;
        this.g = ae5Var;
        this.h = p2f0Var;
        this.i = p85Var;
        this.j = zscVar;
        this.k = ynb0Var5;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PlayerState playerState, t45 t45Var, onm onmVar) {
        jck1 jck1Var;
        b7g1 b7g1Var;
        if (onmVar instanceof jck1) {
            jck1Var = (jck1) onmVar;
            int i = jck1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jck1Var.d = i - Integer.MIN_VALUE;
            } else {
                jck1Var = new jck1(this, onmVar);
            }
        } else {
            jck1Var = new jck1(this, onmVar);
        }
        Object objA = jck1Var.b;
        int i2 = jck1Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            if (!this.i.d()) {
                return y6g1.a;
            }
            t45Var.getClass();
            t45Var.l("traits_metadata_fetch", null, (2 & 4) != 0);
            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
            String strUri = contextTrack != null ? contextTrack.uri() : null;
            if (strUri == null) {
                b7g1Var = z6g1.a;
            } else {
                uq40 uq40Var = (uq40) this.e.get();
                jck1Var.a = t45Var;
                jck1Var.d = 1;
                objA = uq40Var.a(strUri, jck1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            }
            t45Var.g("traits_metadata_fetch");
            return b7g1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        t45Var = jck1Var.a;
        hm5.M(objA);
        b7g1Var = (b7g1) objA;
        t45Var.g("traits_metadata_fetch");
        return b7g1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(String str, String str2, t45 t45Var, boolean z, onm onmVar) {
        kck1 kck1Var;
        String str3;
        String str4;
        String str5;
        if (onmVar instanceof kck1) {
            kck1Var = (kck1) onmVar;
            int i = kck1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kck1Var.d = i - Integer.MIN_VALUE;
            } else {
                kck1Var = new kck1(this, onmVar);
            }
        } else {
            kck1Var = new kck1(this, onmVar);
        }
        kck1 kck1Var2 = kck1Var;
        Object objN = kck1Var2.b;
        int i2 = kck1Var2.d;
        ae5 ae5Var = this.g;
        if (i2 == 0) {
            hm5.M(objN);
            try {
                long jA = qck1.a();
                lck1 lck1Var = new lck1(this, t45Var, str, str2, z, (lnm) null);
                kck1Var2.a = str;
                kck1Var2.d = 1;
                objN = rc2.N(jA, lck1Var, kck1Var2);
                d9n d9nVar = d9n.a;
                if (objN == d9nVar) {
                    return d9nVar;
                }
                str5 = str;
            } catch (TimeoutCancellationException e) {
                e = e;
                str4 = str;
                ae5Var.i(str4, 3, new TimeoutException(e.getMessage()));
                return new WidgetState.TapToReload(str4);
            } catch (Exception e2) {
                e = e2;
                str3 = str;
                Logger.l(e, "Widget can't load recommendations", new Object[0]);
                ae5Var.e(str3, 1, e);
                return new WidgetState.TapToReload(str3);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = kck1Var2.a;
            try {
                hm5.M(objN);
            } catch (TimeoutCancellationException e3) {
                e = e3;
                str4 = str5;
                ae5Var.i(str4, 3, new TimeoutException(e.getMessage()));
                return new WidgetState.TapToReload(str4);
            } catch (Exception e4) {
                e = e4;
                str3 = str5;
                Logger.l(e, "Widget can't load recommendations", new Object[0]);
                ae5Var.e(str3, 1, e);
                return new WidgetState.TapToReload(str3);
            }
        }
        return (WidgetState) objN;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(String str, t45 t45Var, boolean z, onm onmVar) {
        mck1 mck1Var;
        String str2;
        String str3;
        String str4;
        if (onmVar instanceof mck1) {
            mck1Var = (mck1) onmVar;
            int i = mck1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mck1Var.d = i - Integer.MIN_VALUE;
            } else {
                mck1Var = new mck1(this, onmVar);
            }
        } else {
            mck1Var = new mck1(this, onmVar);
        }
        mck1 mck1Var2 = mck1Var;
        Object objN = mck1Var2.b;
        int i2 = mck1Var2.d;
        ae5 ae5Var = this.g;
        if (i2 == 0) {
            hm5.M(objN);
            try {
                long jA = qck1.a();
                du2 du2Var = new du2(this, str, t45Var, z, (lnm) null, (byte) 23);
                mck1Var2.a = str;
                mck1Var2.d = 1;
                objN = rc2.N(jA, du2Var, mck1Var2);
                d9n d9nVar = d9n.a;
                if (objN == d9nVar) {
                    return d9nVar;
                }
                str4 = str;
            } catch (TimeoutCancellationException e) {
                e = e;
                str3 = str;
                ae5Var.i(str3, 1, new TimeoutException(e.getMessage()));
                jfv.v(qck1.a());
                return new WidgetState.TapToReload(str3);
            } catch (Exception e2) {
                e = e2;
                str2 = str;
                Logger.l(e, "Widget can't load recommendations", new Object[0]);
                ae5Var.e(str2, 2, e);
                return new WidgetState.TapToReload(str2);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = mck1Var2.a;
            try {
                hm5.M(objN);
            } catch (TimeoutCancellationException e3) {
                e = e3;
                str3 = str4;
                ae5Var.i(str3, 1, new TimeoutException(e.getMessage()));
                jfv.v(qck1.a());
                return new WidgetState.TapToReload(str3);
            } catch (Exception e4) {
                e = e4;
                str2 = str4;
                Logger.l(e, "Widget can't load recommendations", new Object[0]);
                ae5Var.e(str2, 2, e);
                return new WidgetState.TapToReload(str2);
            }
        }
        return (WidgetState) objN;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x0121  */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:51:0x013d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x0194  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0187, code lost:
    
        if (r14 == r6) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(int r8, java.lang.String r9, p.qol1 r10, p.t45 r11, java.lang.String r12, boolean r13, p.onm r14) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pck1.d(int, java.lang.String, p.qol1, p.t45, java.lang.String, boolean, p.onm):java.lang.Object");
    }
}
