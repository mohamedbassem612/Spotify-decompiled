package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class br21 {
    public static final z771 g;
    public final Context a;
    public final k811 b;
    public final gw70 c;
    public final bjx d;
    public final zxa e;
    public final q8n f;

    static {
        Set set = s4b1.f;
        g = new z771(uic.x("spotify:shareformat:reserved"));
    }

    public br21(Context context, k811 k811Var, gw70 gw70Var, bjx bjxVar, zxa zxaVar, q8n q8nVar) {
        this.a = context;
        this.b = k811Var;
        this.c = gw70Var;
        this.d = bjxVar;
        this.e = zxaVar;
        this.f = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x0110  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(wa71 wa71Var, onm onmVar) {
        xq21 xq21Var;
        wa71 wa71Var2;
        as21 as21Var;
        Bitmap bitmap;
        Bitmap bitmap2;
        wa71 wa71Var3;
        Uri uri;
        f0a f0aVar;
        String str;
        dqi1 dqi1Var;
        String str2;
        String str3;
        if (onmVar instanceof xq21) {
            xq21Var = (xq21) onmVar;
            int i = xq21Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                xq21Var.e = i - Integer.MIN_VALUE;
            } else {
                xq21Var = new xq21(this, onmVar);
            }
        } else {
            xq21Var = new xq21(this, onmVar);
        }
        Object objO = xq21Var.c;
        int i2 = xq21Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objO);
            String str4 = wa71Var.a;
            xq21Var.a = wa71Var;
            xq21Var.e = 1;
            objO = rc2.O(3000L, new ae1(this.b, str4, (lnm) null, (byte) 18), xq21Var);
            if (objO != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            wa71Var = xq21Var.a;
            hm5.M(objO);
        } else {
            if (i2 == 2) {
                as21Var = xq21Var.b;
                wa71Var2 = xq21Var.a;
                hm5.M(objO);
                mmr0 mmr0Var = (mmr0) objO;
                bitmap = (Bitmap) mmr0Var.a;
                bitmap2 = (Bitmap) mmr0Var.b;
                if (bitmap != null) {
                    Bitmap bitmapS = this.d.S(as21Var, bitmap, bitmap2);
                    xq21Var.a = wa71Var2;
                    xq21Var.b = as21Var;
                    xq21Var.e = 3;
                    objO = zxa.d(this.e, bitmapS, xq21Var);
                    if (objO != d9nVar) {
                        wa71Var3 = wa71Var2;
                    }
                    return d9nVar;
                }
                return null;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            as21Var = xq21Var.b;
            wa71Var3 = xq21Var.a;
            hm5.M(objO);
        }
        uri = (Uri) objO;
        if (uri != null) {
            jlw0 jlw0Var = new jlw0(uri, xcg1.i(this.a.getString(2131961302, as21Var.b), "\n", as21Var.c));
            int i3 = as21Var.i;
            f0aVar = new f0a();
            f0aVar.b = wa71Var3.a;
            List listM = p7h.M(new ilw0[]{new ilw0(i3, i3, ""), new ilw0(i3, -16777216, "")});
            ArrayList arrayList = (ArrayList) f0aVar.g;
            arrayList.clear();
            arrayList.addAll(listM);
            f0aVar.i = jlw0Var;
            f0aVar.Y = new oz9(jlw0Var, (jlw0) null);
            f0aVar.h = g;
            f0aVar.X = null;
            f0aVar.P0 = dz61.d;
            ((LinkedHashMap) f0aVar.Z).putAll(wa71Var3.c);
            str = wa71Var3.b;
            if (str != null) {
                f0aVar.e = str;
            }
            dqi1Var = wa71Var3.d;
            if (dqi1Var != null) {
                f0aVar.t = dqi1Var;
            }
            str2 = wa71Var3.e;
            if (str2 != null) {
                f0aVar.c = str2;
            }
            str3 = wa71Var3.f;
            if (str3 != null) {
                f0aVar.d = str3;
            }
            return f0aVar.p();
        }
        return null;
        as21 as21Var2 = (as21) objO;
        if (as21Var2 != null) {
            xq21Var.a = wa71Var;
            xq21Var.b = as21Var2;
            xq21Var.e = 2;
            Object objS = smo1.s(new hgo0(this, as21Var2, (lnm) null, (byte) 13), xq21Var);
            if (objS != d9nVar) {
                wa71Var2 = wa71Var;
                as21Var = as21Var2;
                objO = objS;
                mmr0 mmr0Var2 = (mmr0) objO;
                bitmap = (Bitmap) mmr0Var2.a;
                bitmap2 = (Bitmap) mmr0Var2.b;
                if (bitmap != null) {
                    Bitmap bitmapS2 = this.d.S(as21Var, bitmap, bitmap2);
                    xq21Var.a = wa71Var2;
                    xq21Var.b = as21Var;
                    xq21Var.e = 3;
                    objO = zxa.d(this.e, bitmapS2, xq21Var);
                    if (objO != d9nVar) {
                        wa71Var3 = wa71Var2;
                        uri = (Uri) objO;
                        if (uri != null) {
                            jlw0 jlw0Var2 = new jlw0(uri, xcg1.i(this.a.getString(2131961302, as21Var.b), "\n", as21Var.c));
                            int i4 = as21Var.i;
                            f0aVar = new f0a();
                            f0aVar.b = wa71Var3.a;
                            List listM2 = p7h.M(new ilw0[]{new ilw0(i4, i4, ""), new ilw0(i4, -16777216, "")});
                            ArrayList arrayList2 = (ArrayList) f0aVar.g;
                            arrayList2.clear();
                            arrayList2.addAll(listM2);
                            f0aVar.i = jlw0Var2;
                            f0aVar.Y = new oz9(jlw0Var2, (jlw0) null);
                            f0aVar.h = g;
                            f0aVar.X = null;
                            f0aVar.P0 = dz61.d;
                            ((LinkedHashMap) f0aVar.Z).putAll(wa71Var3.c);
                            str = wa71Var3.b;
                            if (str != null) {
                                f0aVar.e = str;
                            }
                            dqi1Var = wa71Var3.d;
                            if (dqi1Var != null) {
                                f0aVar.t = dqi1Var;
                            }
                            str2 = wa71Var3.e;
                            if (str2 != null) {
                                f0aVar.c = str2;
                            }
                            str3 = wa71Var3.f;
                            if (str3 != null) {
                                f0aVar.d = str3;
                            }
                            return f0aVar.p();
                        }
                    }
                }
            }
            return d9nVar;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, String str, onm onmVar) {
        yq21 yq21Var;
        if (onmVar instanceof yq21) {
            yq21Var = (yq21) onmVar;
            int i2 = yq21Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yq21Var.c = i2 - Integer.MIN_VALUE;
            } else {
                yq21Var = new yq21(this, onmVar);
            }
        } else {
            yq21Var = new yq21(this, onmVar);
        }
        Object objJ = yq21Var.a;
        int i3 = yq21Var.c;
        try {
            if (i3 == 0) {
                hm5.M(objJ);
                ixg ixgVarF = this.c.f(str);
                ixgVarF.p(i, i, 1);
                ixgVarF.d();
                ixgVarF.g = false;
                Single singleI = ixgVarF.i();
                yq21Var.c = 1;
                objJ = fc11.j(singleI, yq21Var);
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
            return (Bitmap) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
    
        if (r0 == r10) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.gs21 r12, p.onm r13) {
        /*
            r11 = this;
            boolean r2 = r13 instanceof p.ar21
            if (r2 == 0) goto L14
            r2 = r13
            p.ar21 r2 = (p.ar21) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r2.d = r3
        L12:
            r7 = r2
            goto L1a
        L14:
            p.ar21 r2 = new p.ar21
            r2.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r7.b
            int r2 = r7.d
            r3 = 13
            r8 = 3
            r4 = 2
            r5 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r2 == 0) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L3a
            if (r2 != r8) goto L34
            p.as21 r2 = r7.a
            p.hm5.M(r0)
            goto L93
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r9
        L3a:
            p.as21 r2 = r7.a
            p.hm5.M(r0)
            goto L6f
        L40:
            p.hm5.M(r0)
            goto L59
        L44:
            p.hm5.M(r0)
            r7.d = r5
            p.ciw0 r0 = new p.ciw0
            p.k811 r2 = r11.b
            r0.<init>(r2, r12, r9, r3)
            r5 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = p.rc2.O(r5, r0, r7)
            if (r0 != r10) goto L59
            goto L92
        L59:
            r2 = r0
            p.as21 r2 = (p.as21) r2
            if (r2 != 0) goto L5f
            goto L97
        L5f:
            r7.a = r2
            r7.d = r4
            p.hgo0 r0 = new p.hgo0
            r0.<init>(r11, r2, r9, r3)
            java.lang.Object r0 = p.smo1.s(r0, r7)
            if (r0 != r10) goto L6f
            goto L92
        L6f:
            p.mmr0 r0 = (p.mmr0) r0
            java.lang.Object r3 = r0.a
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r0 = r0.b
            r4 = r0
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            if (r3 != 0) goto L7d
            goto L97
        L7d:
            p.elu0 r0 = new p.elu0
            r5 = 0
            r6 = 22
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a = r2
            r7.d = r8
            p.q8n r3 = r11.f
            java.lang.Object r0 = p.fn31.Y(r3, r0, r7)
            if (r0 != r10) goto L93
        L92:
            return r10
        L93:
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 != 0) goto L98
        L97:
            return r9
        L98:
            p.wr21 r3 = new p.wr21
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r2.b
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            android.content.Context r1 = r11.a
            r4 = 2131961302(0x7f1325d6, float:1.9559297E38)
            java.lang.String r1 = r1.getString(r4, r2)
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.br21.c(p.gs21, p.onm):java.lang.Object");
    }
}
