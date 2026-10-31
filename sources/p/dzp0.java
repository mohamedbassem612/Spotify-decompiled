package p;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.recaptcha.internal.zzhm;
import com.spotify.messages.ZeroFrictionFeatureFlagExposureNonAuth;
import com.spotify.messages.ZeroFrictionFeatureFlagFallbackNonAuth;
import com.spotify.messages.ZeroFrictionSicComponentExposureNonAuth;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dzp0 implements k2r, vmw0, t2n, Function, vy11 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public dzp0(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        this.a = (byte) 7;
        gsi1.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.b = secretKeySpec;
        Cipher cipher = (Cipher) k8y.e.a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrT = cwl1.t(cipher.doFinal(new byte[16]));
        this.c = bArrT;
        this.d = cwl1.t(bArrT);
    }

    public static final /* synthetic */ zzhm h(dzp0 dzp0Var, Exception exc) {
        x15 x15Var = (x15) dzp0Var.b;
        boolean z = exc instanceof TimeoutCancellationException;
        tgo1 tgo1Var = tgo1.d;
        if (z) {
            return x15Var.a(exc, new zzhm(tgo1Var, ij81.e, exc.getMessage(), (Exception) null));
        }
        return exc instanceof zzhm ? x15Var.a(exc, (zzhm) exc) : x15Var.a(exc, new zzhm(tgo1Var, ij81.N0, exc.getMessage(), (Exception) null));
    }

    @Override // p.vmw0
    public byte[] a(byte[] bArr, int i) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrJ;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipher = (Cipher) k8y.e.a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.b);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrJ = ila0.I((iMax - 1) * 16, 0, 16, bArr, (byte[]) this.c);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                hhg1.n("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrJ = ila0.J(bArrCopyOf, (byte[]) this.d);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(ila0.I(0, i2 * 16, 16, bArrDoFinal, bArr));
        }
        return Arrays.copyOf(cipher.doFinal(ila0.J(bArrJ, bArrDoFinal)), i);
    }

    @Override // p.vy11
    public /* synthetic */ void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 17:
                ((arn1) this.b).f((o2e) this.c, (String) this.d, (vhp1) obj, (bsd1) obj2);
                break;
            case 18:
                arn1 arn1Var = (arn1) this.b;
                arn1Var.w((String) this.c, (String) this.d, (vhp1) obj, (bsd1) obj2);
                break;
            default:
                ((arn1) this.b).x((String) this.c, (ckb0) this.d, (vhp1) obj, (bsd1) obj2);
                break;
        }
    }

    public Object apply(Object obj) {
        a2a1 a2a1Var = (a2a1) obj;
        String str = a2a1Var.a;
        n381 n381Var = (n381) this.b;
        Scheduler scheduler = (Scheduler) this.c;
        return n381Var.f(str).p(y6x0.O0).g(new tt60((r1a1) this.d, a2a1Var.b, (byte) 28)).e(Single.just(new a4a1(str, true))).timeout(10000L, TimeUnit.MILLISECONDS, scheduler, Single.error(new TimeoutException())).doOnError(new z0u0((byte) 19, new Object[0], "Failed to leave session")).toObservable().onErrorReturn(new dr41(a2a1Var, (byte) 17));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(onm onmVar) {
        flt0 flt0Var;
        if (onmVar instanceof flt0) {
            flt0Var = (flt0) onmVar;
            int i = flt0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flt0Var.c = i - Integer.MIN_VALUE;
            } else {
                flt0Var = new flt0(this, onmVar);
            }
        } else {
            flt0Var = new flt0(this, onmVar);
        }
        Object objA = flt0Var.a;
        int i2 = flt0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            c6n1 c6n1Var = (c6n1) this.d;
            if (c6n1Var != null) {
                return c6n1Var;
            }
            flt0Var.c = 1;
            l441 l441Var = new l441(aym.t(flt0Var));
            ((wmy) this.b).N();
            n5n1 n5n1Var = (n5n1) this.c;
            byte b = (byte) (((byte) (0 | 2)) | 1);
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b & 1) == 0) {
                    sb.append(" cloudProjectNumber");
                }
                if ((b & 2) == 0) {
                    sb.append(" webViewRequestMode");
                }
                eg.m("Missing required properties:".concat(sb.toString()));
                return null;
            }
            hfp1 hfp1VarA = n5n1Var.a(new h7n1(603244941621L));
            hfp1VarA.d(dsd1.a, new glt0(this, l441Var, (byte) 0));
            hfp1VarA.m(new glt0(this, l441Var, (byte) 1));
            objA = l441Var.a();
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        return ((e331) objA).a;
    }

    public j6k1 c(String str) {
        j6k1 j6k1Var = (j6k1) ((LinkedHashMap) this.d).get(str);
        if (j6k1Var != null) {
            return j6k1Var;
        }
        k220.f("Invalid videoId: ".concat(str));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(mfw mfwVar, onm onmVar) {
        cib1 cib1Var;
        if (onmVar instanceof cib1) {
            cib1Var = (cib1) onmVar;
            int i = cib1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cib1Var.d = i - Integer.MIN_VALUE;
            } else {
                cib1Var = new cib1(this, onmVar);
            }
        } else {
            cib1Var = new cib1(this, onmVar);
        }
        Object objJ = cib1Var.b;
        int i2 = cib1Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            hj31 hj31Var = (hj31) this.d;
            cib1Var.a = mfwVar;
            cib1Var.d = 1;
            if (hj31.b(hj31Var, cib1Var) != d9nVar) {
            }
        }
        if (i2 == 1) {
            mfwVar = cib1Var.a;
            hm5.M(objJ);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        Single map = ((xvo) this.c).a(true).first(yah0.m(false)).map(new esa1(mfwVar, this, (byte) 8));
        cib1Var.a = null;
        cib1Var.d = 2;
        objJ = fc11.j(map, cib1Var);
        return objJ == d9nVar ? d9nVar : objJ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void e(w0h1 w0h1Var) throws NoWhenBranchMatchedException {
        t2j0 t2j0Var = (t2j0) this.c;
        x2g1 x2g1Var = (x2g1) this.b;
        if (w0h1Var instanceof nm10) {
            nm10 nm10Var = (nm10) w0h1Var;
            q3n1 q3n1VarN = ZeroFrictionFeatureFlagExposureNonAuth.n();
            q3n1VarN.r(x2g1Var.a.b());
            q3n1VarN.s(x2g1Var.a.a());
            q3n1VarN.n(nm10Var.d);
            q3n1VarN.q(nm10Var.e);
            t2j0Var.a(q3n1VarN.build());
            return;
        }
        if (w0h1Var instanceof om10) {
            s3n1 s3n1VarO = ZeroFrictionFeatureFlagFallbackNonAuth.o();
            s3n1VarO.q(x2g1Var.a.b());
            s3n1VarO.r(x2g1Var.a.a());
            s3n1VarO.n(((om10) w0h1Var).d);
            t2j0Var.a(s3n1VarO.build());
            return;
        }
        if (!(w0h1Var instanceof tf81)) {
            eg.o();
            return;
        }
        z3n1 z3n1VarN = ZeroFrictionSicComponentExposureNonAuth.n();
        z3n1VarN.r(x2g1Var.a.a());
        z3n1VarN.q(((dp21) this.d).a.k(dp21.b));
        z3n1VarN.n(((tf81) w0h1Var).d);
        t2j0Var.a(z3n1VarN.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r8 == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(java.lang.String r7, p.onm r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.hlt0
            if (r0 == 0) goto L13
            r0 = r8
            p.hlt0 r0 = (p.hlt0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.hlt0 r0 = new p.hlt0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L8f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            java.lang.String r7 = r0.a
            p.hm5.M(r8)
            p.e331 r8 = (p.e331) r8
            java.lang.Object r8 = r8.a
            goto L49
        L3b:
            p.hm5.M(r8)
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r6.b(r0)
            if (r8 != r5) goto L49
            goto L8e
        L49:
            java.lang.Throwable r1 = p.e331.a(r8)
            if (r1 != 0) goto L98
            p.c6n1 r8 = (p.c6n1) r8
            r0.a = r2
            r0.d = r3
            java.lang.Object r1 = r6.b
            p.wmy r1 = (p.wmy) r1
            r1.P()
            p.l441 r1 = new p.l441
            p.lnm r0 = p.aym.t(r0)
            r1.<init>(r0)
            p.j5n1 r0 = p.j5n1.X
            if (r0 == 0) goto L92
            p.l7n1 r2 = new p.l7n1
            r2.<init>(r7, r0)
            p.hfp1 r7 = r8.a(r2)
            p.glt0 r8 = new p.glt0
            r8.<init>(r6, r1, r3)
            r7.getClass()
            p.ve90 r0 = p.dsd1.a
            r7.d(r0, r8)
            p.glt0 r8 = new p.glt0
            r0 = 3
            r8.<init>(r6, r1, r0)
            r7.m(r8)
            java.lang.Object r8 = r1.a()
            if (r8 != r5) goto L8f
        L8e:
            return r5
        L8f:
            p.p0f1 r8 = (p.p0f1) r8
            return r8
        L92:
            java.lang.String r6 = "Null verdictOptOut"
            p.bhn0.i(r6)
            return r2
        L98:
            boolean r6 = r1 instanceof com.google.android.gms.common.api.ApiException
            if (r6 == 0) goto Lac
            p.m0f1 r6 = new p.m0f1
            com.google.android.gms.common.api.ApiException r1 = (com.google.android.gms.common.api.ApiException) r1
            int r7 = r1.getStatusCode()
            java.lang.String r7 = p.fbp1.p(r7)
            r6.<init>(r7)
            return r6
        Lac:
            p.m0f1 r6 = new p.m0f1
            java.lang.String r7 = r1.getMessage()
            if (r7 != 0) goto Lb6
            java.lang.String r7 = "Failed to initialise"
        Lb6:
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.dzp0.f(java.lang.String, p.onm):java.lang.Object");
    }

    public Object g(Object obj) {
        y1t0 y1t0Var = (y1t0) this.d;
        return zov0.c(((nfa0) y1t0Var.b).b((nma0) this.c, obj), (r8i0) this.b);
    }

    public void i(String str, Object obj) {
        zrj1 zrj1Var = new zrj1((byte) 25);
        ((zrj1) this.d).d = zrj1Var;
        this.d = zrj1Var;
        zrj1Var.c = obj;
        zrj1Var.b = str;
    }

    @Override // p.k2r
    public o2r j() {
        switch (this.a) {
            case 0:
                ezp0 ezp0Var = new ezp0((cxc) this.c, (vx40) this.b);
                yeg1 yeg1Var = (yeg1) this.d;
                if (yeg1Var != null) {
                    ezp0Var.a(yeg1Var);
                }
                return ezp0Var;
            default:
                return new fzp0((cxc) this.c, (String) this.d, (vx40) this.b);
        }
    }

    public String toString() {
        switch (this.a) {
            case 16:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                zrj1 zrj1Var = (zrj1) ((zrj1) this.c).d;
                String str = "";
                while (zrj1Var != null) {
                    Object obj = zrj1Var.c;
                    sb.append(str);
                    String str2 = (String) zrj1Var.b;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    zrj1Var = (zrj1) zrj1Var.d;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public dzp0(bym1 bym1Var, x15 x15Var, qeh1 qeh1Var) {
        this.a = (byte) 20;
        this.c = bym1Var;
        this.b = x15Var;
        this.d = qeh1Var;
    }

    public /* synthetic */ dzp0(String str) {
        this.a = (byte) 16;
        zrj1 zrj1Var = new zrj1((byte) 25);
        this.c = zrj1Var;
        this.d = zrj1Var;
        this.b = str;
    }

    public dzp0(Flowable flowable, t2j0 t2j0Var) {
        this.a = (byte) 3;
        this.b = flowable;
        this.c = t2j0Var;
        this.d = new rku();
    }

    public dzp0(String str, woa woaVar) {
        this.a = (byte) 14;
        this.b = str;
        this.c = woaVar;
        this.d = new LinkedHashMap();
    }

    public dzp0(Application application, wmy wmyVar) {
        this.a = (byte) 5;
        this.b = wmyVar;
        this.c = u890.s(application.getApplicationContext());
    }

    public dzp0(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                break;
            default:
                hrr0 hrr0VarT = xto.t((Object) null);
                this.b = hrr0VarT;
                this.c = hrr0VarT;
                break;
        }
    }

    public dzp0(LayoutInflater layoutInflater, ViewGroup viewGroup, xfx xfxVar, ivj1 ivj1Var, af10 af10Var, boolean z) {
        this.a = (byte) 6;
        this.b = new idd1(new t800(layoutInflater, viewGroup, (byte) 1));
        this.c = new idd1(new zg6(xfxVar, ivj1Var, af10Var, z, (byte) 8));
        this.d = new idd1(new z6v0(this, (byte) 14));
    }

    public /* synthetic */ dzp0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public dzp0(cxc cxcVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = cxcVar;
                this.b = new vx40((byte) 13);
                break;
            default:
                this.c = cxcVar;
                this.b = new vx40((byte) 13);
                break;
        }
    }
}
