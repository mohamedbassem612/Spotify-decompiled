package p;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.car.app.k;
import androidx.car.app.serialization.BundlerException;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bwc implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iwc b;

    public /* synthetic */ bwc(iwc iwcVar, byte b) {
        this.a = b;
        this.b = iwcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r9 == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r9 == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p.hwc r10, p.lnm r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bwc.b(p.hwc, p.lnm):java.lang.Object");
    }

    public final Object emit(Object obj, lnm lnmVar) {
        xab1 xab1Var;
        byte b = this.a;
        lnm lnmVar2 = null;
        rih1 rih1Var = rih1.a;
        byte b2 = 0;
        iwc iwcVar = this.b;
        byte b3 = 1;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ynb0 ynb0Var = iwcVar.g;
                bpb1 bpb1Var = iwcVar.N0;
                idd1 idd1Var = iwcVar.O0;
                if (zBooleanValue) {
                    qhd1 qhd1Var = (qhd1) idd1Var.getValue();
                    xab1 xab1Var2 = qhd1Var.S0;
                    if (xab1Var2 == null || xab1Var2.isCancelled() || ((xab1Var = qhd1Var.S0) != null && xab1Var.v())) {
                        qhd1Var.S0 = fn31.T(cto1.q(qhd1Var), (o8n) null, 0, new nhd1(qhd1Var, lnmVar2, b3), 3);
                        qhd1Var.U0 = fn31.T(cto1.q(qhd1Var), (o8n) null, 0, new nhd1(qhd1Var, lnmVar2, (byte) 2), 3);
                        xab1 xab1Var3 = qhd1Var.S0;
                        if (xab1Var3 != null) {
                            xab1Var3.L(new phd1(qhd1Var, b2));
                        }
                        xab1 xab1Var4 = qhd1Var.U0;
                        if (xab1Var4 != null) {
                            xab1Var4.L(new phd1(qhd1Var, b3));
                        }
                    }
                    ewc ewcVar = new ewc(bpb1Var.getValue() instanceof fwc);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, ewcVar);
                    b5a0 b5a0Var = (b5a0) ynb0Var.get();
                    u9c0 u9c0VarQ = cto1.q(iwcVar);
                    b5a0Var.getClass();
                    b5a0Var.d = fn31.T(u9c0VarQ, (o8n) null, 0, new no70(b5a0Var, (lnm) null, (byte) 15), 3);
                } else {
                    qhd1 qhd1Var2 = (qhd1) idd1Var.getValue();
                    xab1 xab1Var5 = qhd1Var2.S0;
                    if (xab1Var5 != null) {
                        xab1Var5.d((CancellationException) null);
                    }
                    xab1 xab1Var6 = qhd1Var2.U0;
                    if (xab1Var6 != null) {
                        xab1Var6.d((CancellationException) null);
                    }
                    fwc fwcVar = new fwc(bpb1Var.getValue() instanceof ewc);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, fwcVar);
                    b5a0 b5a0Var2 = (b5a0) ynb0Var.get();
                    xab1 xab1Var7 = b5a0Var2.d;
                    if (xab1Var7 != null) {
                        xab1Var7.d((CancellationException) null);
                    }
                    b5a0Var2.d = null;
                }
                return rih1Var;
            case 1:
                MediaSessionCompat.Token token = (MediaSessionCompat.Token) obj;
                k kVar = ((ia61) iwcVar).c;
                Objects.requireNonNull(kVar);
                wth0 wth0VarE = kVar.e(wth0.class);
                wth0VarE.getClass();
                sge1.a();
                try {
                    wth0VarE.a.a("media_playback", "registerMediaSessionToken", new c8d0(new tcc(token), (byte) 17));
                    return rih1Var;
                } catch (BundlerException e) {
                    throw new IllegalArgumentException("Serialization failure", e);
                }
            case 2:
                return b((hwc) obj, lnmVar);
            default:
                nie nieVar = (nie) obj;
                String str = nieVar.a;
                bqk0 bqk0Var = iwcVar.Z;
                bqk0Var.getClass();
                x6h1 x6h1VarC = bqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("chapter_list_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str2 = nieVar.a;
                w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis());
                ou80 ou80Var = iwcVar.i.m(w7h1Var, (xj61) null).a;
                iwcVar.t.a(w7h1Var, ou80Var);
                Object objF = ((qzn0) iwcVar.f.get()).f(new vpn0(str2), new ezn0(ou80Var), lnmVar);
                return objF == d9n.a ? objF : rih1Var;
        }
    }
}
