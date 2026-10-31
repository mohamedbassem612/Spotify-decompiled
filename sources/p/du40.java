package p;

import android.view.ViewGroup;
import com.spotify.common.uri.SpotifyUriParserException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class du40 implements byf0 {
    public final /* synthetic */ byte a;
    public xab1 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public /* synthetic */ du40(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    public final void c() {
        byte b = this.a;
        Object obj = this.g;
        switch (b) {
            case 0:
                if (((f95) this.f).e()) {
                    xab1 xab1Var = this.b;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    this.b = fn31.T(cto1.q((gj5) obj), (o8n) null, 0, new bu40(this, null, (byte) 2), 3);
                    break;
                }
                break;
            default:
                this.b = fn31.T((c9n) this.e, (q8n) obj, 0, new ic01(this, (lnm) null, (byte) 26), 2);
                break;
        }
    }

    public final void d() {
        switch (this.a) {
            case 0:
                xab1 xab1Var = this.b;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.b = null;
                break;
            default:
                xab1 xab1Var2 = this.b;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, onm onmVar) {
        iq41 iq41Var;
        if (onmVar instanceof iq41) {
            iq41Var = (iq41) onmVar;
            int i = iq41Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iq41Var.c = i - Integer.MIN_VALUE;
            } else {
                iq41Var = new iq41(this, onmVar);
            }
        } else {
            iq41Var = new iq41(this, onmVar);
        }
        Object objA = iq41Var.a;
        int i2 = iq41Var.c;
        boolean zBooleanValue = false;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                int iOrdinal = new y6b1(str, false).c.ordinal();
                if (iOrdinal == 6) {
                    zBooleanValue = true;
                } else if (iOrdinal == 63 || iOrdinal == 64) {
                    f771 f771Var = (f771) this.c;
                    iq41Var.c = 1;
                    objA = f771Var.a(str, iq41Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                }
                return Boolean.valueOf(zBooleanValue);
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
            zBooleanValue = ((Boolean) objA).booleanValue();
        } catch (SpotifyUriParserException unused) {
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final void g(ViewGroup viewGroup) {
        byte b = this.a;
    }

    private final void a(ViewGroup viewGroup) {
    }

    private final void b(ViewGroup viewGroup) {
    }
}
