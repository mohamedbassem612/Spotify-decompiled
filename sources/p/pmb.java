package p;

import android.view.View;
import com.spotify.show_esperanto.proto.MarkShowAsPlayedResponse;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pmb {
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final dg30 a;
    public final wsg0 b;
    public final kt91 c;
    public final i8h1 d;
    public final zeu0 e;
    public final t8u0 f;
    public xab1 g;

    static {
        ytw0 ytw0Var = jfv.b;
        h = fdg1.k0(1, ngv.e);
    }

    public pmb(dg30 dg30Var, wsg0 wsg0Var, kt91 kt91Var, i8h1 i8h1Var, zeu0 zeu0Var, t8u0 t8u0Var) {
        this.a = dg30Var;
        this.b = wsg0Var;
        this.c = kt91Var;
        this.d = i8h1Var;
        this.e = zeu0Var;
        this.f = t8u0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object a(String str, String str2, zqg0 zqg0Var, onm onmVar) {
        kmb kmbVar;
        String str3;
        Object obj;
        zqg0 zqg0Var2;
        String str4;
        wqk0 wqk0Var;
        if (onmVar instanceof kmb) {
            kmbVar = (kmb) onmVar;
            int i2 = kmbVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kmbVar.g = i2 - Integer.MIN_VALUE;
            } else {
                kmbVar = new kmb(this, onmVar);
            }
        } else {
            kmbVar = new kmb(this, onmVar);
        }
        Object obj2 = kmbVar.e;
        int i3 = kmbVar.g;
        if (i3 == 0) {
            hm5.M(obj2);
            wqk0 wqk0Var2 = new wqk0(1, str2, zqg0Var.c, (byte) 3);
            kmbVar.a = str;
            kmbVar.b = str2;
            kmbVar.c = zqg0Var;
            kmbVar.d = wqk0Var2;
            kmbVar.g = 1;
            Object objE = e(str, str2, kmbVar);
            Object obj3 = d9n.a;
            if (objE == obj3) {
                return obj3;
            }
            str3 = str;
            obj = objE;
            zqg0Var2 = zqg0Var;
            str4 = str2;
            wqk0Var = wqk0Var2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wqk0 wqk0Var3 = kmbVar.d;
            zqg0 zqg0Var3 = kmbVar.c;
            str4 = kmbVar.b;
            String str5 = kmbVar.a;
            hm5.M(obj2);
            wqk0Var = wqk0Var3;
            obj = obj2;
            zqg0Var2 = zqg0Var3;
            str3 = str5;
        }
        MarkShowAsPlayedResponse markShowAsPlayedResponse = (MarkShowAsPlayedResponse) obj;
        rih1 rih1Var = rih1.a;
        if (markShowAsPlayedResponse == null) {
            return rih1Var;
        }
        int i4 = hmb.a[markShowAsPlayedResponse.n().n().ordinal()];
        kt91 kt91Var = this.c;
        if (i4 != 1) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962596});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131962596, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
            return rih1Var;
        }
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962595});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        r6h1 r6h1Var = zqg0Var2.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-audiobook-mark-as-played-snackbar";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = "played";
        x6h1VarI.d = str4;
        x6h1 x6h1VarC = x6h1VarI.a().c();
        x6h1VarC.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("mark_as_unplayed", 1, Collections.singletonMap("item_unplayed", str4 == null ? "" : str4)), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962595});
        String str6 = str4;
        kt91Var.k(new er91((fs91) null, "", 2131962595, (String) null, 2131962597, new jmb((byte) 0, str3, this, zqg0Var2, w7h1Var, str6), (cvr) null, (xq91) null, false));
        zqg0Var2.d.invoke(leu.a);
        this.d.f(wqk0Var.e(), (Set) null);
        this.g = fn31.T(cto1.q(this.a), (o8n) null, 0, new imb(this, str3, str6, null, (byte) 1), 3);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    public final Object b(String str, String str2, zqg0 zqg0Var, onm onmVar) {
        lmb lmbVar;
        String str3;
        zqg0 zqg0Var2;
        String str4;
        Object obj;
        wqk0 wqk0Var;
        if (onmVar instanceof lmb) {
            lmbVar = (lmb) onmVar;
            int i2 = lmbVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lmbVar.g = i2 - Integer.MIN_VALUE;
            } else {
                lmbVar = new lmb(this, onmVar);
            }
        } else {
            lmbVar = new lmb(this, onmVar);
        }
        Object obj2 = lmbVar.e;
        int i3 = lmbVar.g;
        if (i3 == 0) {
            hm5.M(obj2);
            wqk0 wqk0Var2 = new wqk0(2, str2, zqg0Var.c, (byte) 3);
            lmbVar.a = str;
            lmbVar.b = str2;
            lmbVar.c = zqg0Var;
            lmbVar.d = wqk0Var2;
            lmbVar.g = 1;
            Object objF = f(str, str2, lmbVar);
            Object obj3 = d9n.a;
            if (objF == obj3) {
                return obj3;
            }
            str3 = str;
            zqg0Var2 = zqg0Var;
            str4 = str2;
            obj = objF;
            wqk0Var = wqk0Var2;
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wqk0 wqk0Var3 = lmbVar.d;
            zqg0 zqg0Var3 = lmbVar.c;
            str4 = lmbVar.b;
            String str5 = lmbVar.a;
            hm5.M(obj2);
            wqk0Var = wqk0Var3;
            zqg0Var2 = zqg0Var3;
            str3 = str5;
            obj = obj2;
        }
        MarkShowAsPlayedResponse markShowAsPlayedResponse = (MarkShowAsPlayedResponse) obj;
        rih1 rih1Var = rih1.a;
        if (markShowAsPlayedResponse == null) {
            return rih1Var;
        }
        if (hmb.a[markShowAsPlayedResponse.n().n().ordinal()] != 1) {
            c();
            return rih1Var;
        }
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962598});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.c.k(new er91((fs91) null, "", 2131962598, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        zqg0Var2.d.invoke(leu.b);
        this.d.f(wqk0Var.e(), (Set) null);
        this.g = fn31.T(cto1.q(this.a), (o8n) null, 0, new imb(this, str3, str4, null, (byte) 2), 3);
        return rih1Var;
    }

    public final void c() {
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962599});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.c.k(new er91((fs91) null, "", 2131962599, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object d(String str, String str2, onm onmVar, boolean z) {
        mmb mmbVar;
        boolean z2;
        String str3;
        String str4;
        boolean z3;
        feh m231Var;
        feh fehVar;
        if (onmVar instanceof mmb) {
            mmbVar = (mmb) onmVar;
            int i2 = mmbVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mmbVar.f = i2 - Integer.MIN_VALUE;
            } else {
                mmbVar = new mmb(this, onmVar);
            }
        } else {
            mmbVar = new mmb(this, onmVar);
        }
        Object objP = mmbVar.d;
        int i3 = mmbVar.f;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(objP);
                w7a w7aVar = new w7a(this, (lnm) null, (byte) 18);
                mmbVar.a = str;
                mmbVar.b = str2;
                z2 = z;
                mmbVar.c = z2;
                mmbVar.f = 1;
                objP = rc2.P(h, w7aVar, mmbVar);
                if (objP != obj) {
                    str3 = str2;
                }
                return obj;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        hm5.M(objP);
                        return rih1Var;
                    }
                    if (i3 == 4) {
                        hm5.M(objP);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = mmbVar.c;
                str3 = mmbVar.b;
                str4 = mmbVar.a;
                try {
                    hm5.M(objP);
                    m231Var = (feh) objP;
                } catch (Throwable th) {
                    th = th;
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                fehVar = m231Var;
                if (fehVar != null && (fehVar instanceof ceh)) {
                    mmbVar.a = null;
                    mmbVar.b = null;
                    mmbVar.c = z3;
                    if (z3) {
                        mmbVar.f = 3;
                        if (e(str4, str3, mmbVar) == obj) {
                            return obj;
                        }
                    } else {
                        mmbVar.f = 4;
                        if (f(str4, str3, mmbVar) == obj) {
                            return obj;
                        }
                    }
                }
                return rih1Var;
            }
            boolean z4 = mmbVar.c;
            str3 = mmbVar.b;
            String str5 = mmbVar.a;
            hm5.M(objP);
            z2 = z4;
            str = str5;
            String str6 = (String) objP;
            if (str6 != null && str6.equals(str)) {
                try {
                    Single singleA = this.f.a(((f0i) this.a).a).a().a(new p9u0());
                    mmbVar.a = str;
                    mmbVar.b = str3;
                    mmbVar.c = z2;
                    mmbVar.f = 2;
                    objP = fc11.j(singleA, mmbVar);
                    if (objP != obj) {
                        str4 = str;
                        z3 = z2;
                        m231Var = (feh) objP;
                        if (m231Var instanceof m231) {
                            m231Var = null;
                        }
                        fehVar = m231Var;
                        if (fehVar != null) {
                            mmbVar.a = null;
                            mmbVar.b = null;
                            mmbVar.c = z3;
                            if (z3) {
                                mmbVar.f = 3;
                                if (e(str4, str3, mmbVar) == obj) {
                                }
                            } else {
                                mmbVar.f = 4;
                                if (f(str4, str3, mmbVar) == obj) {
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str4 = str;
                    z3 = z2;
                    m231Var = new m231(th);
                }
                return obj;
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, onm onmVar) {
        nmb nmbVar;
        MarkShowAsPlayedResponse m231Var;
        if (onmVar instanceof nmb) {
            nmbVar = (nmb) onmVar;
            int i2 = nmbVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nmbVar.c = i2 - Integer.MIN_VALUE;
            } else {
                nmbVar = new nmb(this, onmVar);
            }
        } else {
            nmbVar = new nmb(this, onmVar);
        }
        Object objJ = nmbVar.a;
        int i3 = nmbVar.c;
        try {
            if (i3 == 0) {
                hm5.M(objJ);
                Single singleB = this.b.b(str, str2);
                nmbVar.c = 1;
                objJ = fc11.j(singleB, nmbVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            m231Var = (MarkShowAsPlayedResponse) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, String str2, onm onmVar) {
        omb ombVar;
        MarkShowAsPlayedResponse m231Var;
        if (onmVar instanceof omb) {
            ombVar = (omb) onmVar;
            int i2 = ombVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ombVar.c = i2 - Integer.MIN_VALUE;
            } else {
                ombVar = new omb(this, onmVar);
            }
        } else {
            ombVar = new omb(this, onmVar);
        }
        Object objJ = ombVar.a;
        int i3 = ombVar.c;
        try {
            if (i3 == 0) {
                hm5.M(objJ);
                Single singleA = this.b.a(str, str2);
                ombVar.c = 1;
                objJ = fc11.j(singleA, ombVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            m231Var = (MarkShowAsPlayedResponse) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }
}
