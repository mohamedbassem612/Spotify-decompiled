package p;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.view.View;
import com.spotify.authentication.login5esperanto.EsAuthenticateResult;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import spotify.autodownload.esperanto.proto.DecoratedFollowedShowsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ix7 implements Function, SingleOnSubscribe, nr81, tga, q4t, sz3, rz3 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public ix7(w6h1 w6h1Var, rwo rwoVar, kt91 kt91Var, Resources resources) {
        ic9 ic9Var;
        this.a = (byte) 29;
        this.b = kt91Var;
        this.c = resources;
        switch (rwoVar.a) {
            case 0:
                ic9Var = new ic9(w6h1Var, (fwo) ((qq) rwoVar.b.c).d, (byte) 15);
                break;
            default:
                ic9Var = new ic9(w6h1Var, (blp) ((wj3) rwoVar.b.c).e, (byte) 15);
                break;
        }
        this.d = ic9Var;
    }

    public static final /* synthetic */ bkp b(ix7 ix7Var) {
        return (bkp) ix7Var.c;
    }

    public static final /* synthetic */ w3b1 c(ix7 ix7Var) {
        return (swm0) ix7Var.d;
    }

    public static final /* synthetic */ ckp f(ix7 ix7Var) {
        return (ckp) ix7Var.b;
    }

    public void A(long j) {
        this.c = Long.valueOf(j);
    }

    public void B(String str, boolean z) {
        String str2;
        ic9 ic9Var = (ic9) this.d;
        i8h1 i8h1Var = (i8h1) ((jly0) ic9Var.c).get();
        r6h1 r6h1VarB = ((w6h1) ic9Var.b).b();
        char c = z ? (char) 1 : (char) 2;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-gen-alpha-parental-control-entity-block-failed-snackbar";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        if (c == 1) {
            str2 = "block";
        } else {
            if (c != 2) {
                throw null;
            }
            str2 = "unblock";
        }
        x6h1VarI.b = str2;
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = r6h1VarB;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
        ((kt91) this.b).k(new er91((fs91) null, ((Resources) this.c).getString(2131958074), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public void C(djl djlVar, int i, int i2, int i3) {
        int i4 = ((cjl) djlVar).d0;
        int i5 = ((cjl) djlVar).e0;
        ((cjl) djlVar).d0 = 0;
        ((cjl) djlVar).e0 = 0;
        djlVar.T(i2);
        djlVar.O(i3);
        if (i4 < 0) {
            ((cjl) djlVar).d0 = 0;
        } else {
            ((cjl) djlVar).d0 = i4;
        }
        if (i5 < 0) {
            ((cjl) djlVar).e0 = 0;
        } else {
            ((cjl) djlVar).e0 = i5;
        }
        djl djlVar2 = (djl) this.d;
        djlVar2.x0 = i;
        djlVar2.Z();
    }

    /* JADX WARN: Code duplicated, block: B:144:0x029b  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b5 A[LOOP:9: B:147:0x02af->B:149:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:154:0x0316  */
    /* JADX WARN: Code duplicated, block: B:155:0x031c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0320  */
    /* JADX WARN: Code duplicated, block: B:159:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x032c  */
    /* JADX WARN: Code duplicated, block: B:161:0x032e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0331  */
    /* JADX WARN: Code duplicated, block: B:164:0x0333  */
    /* JADX WARN: Code duplicated, block: B:166:0x0338  */
    /* JADX WARN: Code duplicated, block: B:174:0x034f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0360  */
    /* JADX WARN: Code duplicated, block: B:178:0x036c  */
    /* JADX WARN: Code duplicated, block: B:203:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:233:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:236:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:238:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:240:0x0403  */
    /* JADX WARN: Code duplicated, block: B:242:0x0407  */
    /* JADX WARN: Code duplicated, block: B:245:0x040d  */
    /* JADX WARN: Code duplicated, block: B:246:0x040f  */
    /* JADX WARN: Code duplicated, block: B:249:0x042a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0438  */
    /* JADX WARN: Code duplicated, block: B:252:0x0440  */
    /* JADX WARN: Code duplicated, block: B:254:0x0461  */
    /* JADX WARN: Code duplicated, block: B:260:0x0486  */
    /* JADX WARN: Code duplicated, block: B:262:0x048a  */
    /* JADX WARN: Code duplicated, block: B:273:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:275:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:287:0x04ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:295:0x0504 A[PHI: r33
      0x0504: PHI (r33v4 int) = (r33v2 int), (r33v2 int), (r33v2 int), (r33v5 int) binds: [B:285:0x04ea, B:294:0x0502, B:291:0x04fd, B:280:0x04dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:298:0x051f  */
    /* JADX WARN: Code duplicated, block: B:301:0x0534  */
    /* JADX WARN: Code duplicated, block: B:303:0x0539  */
    /* JADX WARN: Code duplicated, block: B:306:0x0558  */
    /* JADX WARN: Code duplicated, block: B:308:0x055b  */
    /* JADX WARN: Code duplicated, block: B:310:0x055e  */
    /* JADX WARN: Code duplicated, block: B:312:0x0563  */
    /* JADX WARN: Code duplicated, block: B:315:0x0582  */
    /* JADX WARN: Code duplicated, block: B:317:0x0585  */
    /* JADX WARN: Code duplicated, block: B:320:0x058a  */
    /* JADX WARN: Code duplicated, block: B:326:0x05a6 A[LOOP:5: B:271:0x04c4->B:326:0x05a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:360:0x05b1 A[EDGE_INSN: B:360:0x05b1->B:327:0x05b1 BREAK  A[LOOP:5: B:271:0x04c4->B:326:0x05a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x05b1 A[EDGE_INSN: B:361:0x05b1->B:327:0x05b1 BREAK  A[LOOP:5: B:271:0x04c4->B:326:0x05a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x058f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    public void D(djl djlVar, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        bjl bjlVar;
        int i10;
        cjl cjlVar;
        ArrayList arrayList;
        vda vdaVar;
        int i11;
        boolean zM;
        int i12;
        int i13;
        int size;
        bjl[] bjlVarArr;
        int i14;
        int i15;
        int iMax;
        int iMax2;
        int i16;
        int i17;
        int i18;
        ArrayList arrayList2;
        int i19;
        vda vdaVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        cjl cjlVar2;
        int i24;
        int iS;
        int iM;
        int i25;
        vda vdaVar3;
        int iS2;
        int i26;
        int iM2;
        ljk1 ljk1Var;
        int iS3;
        int iM3;
        int i27;
        vda vdaVar4;
        int i28;
        int iS4;
        int iM4;
        int i29;
        int size2;
        vda vdaVar5;
        int i30;
        cjl cjlVar3;
        bjl bjlVarL;
        bjl bjlVarL2;
        boolean z;
        ur60 ur60Var;
        s6j1 s6j1Var;
        int iMin;
        int iMin2;
        int i31;
        djl djlVar2;
        int i32;
        int i33;
        boolean z2;
        boolean z3;
        ArrayList<xpl1> arrayList3;
        int i34;
        boolean z4;
        cjl cjlVar4 = (djl) this.d;
        ArrayList arrayList4 = (ArrayList) this.b;
        vda vdaVar6 = djlVar.y0;
        vgr vgrVar = djlVar.w0;
        int size3 = djlVar.u0.size();
        int iS5 = djlVar.s();
        int iM5 = djlVar.m();
        boolean z5 = ltn1.z(i, 128);
        int i35 = (z5 || ltn1.z(i, 64)) ? 1 : 0;
        bjl bjlVar2 = bjl.c;
        if (i35 != 0) {
            int i36 = 0;
            i6 = 1;
            while (true) {
                if (i36 < size3) {
                    i7 = 0;
                    cjl cjlVar5 = (cjl) djlVar.u0.get(i36);
                    int i37 = i35;
                    bjl[] bjlVarArr2 = cjlVar5.U;
                    Object[] objArr = (bjlVarArr2[0] == bjlVar2) == true && (bjlVarArr2[1] == bjlVar2) == true && cjlVar5.Y > 0.0f;
                    if ((cjlVar5.z() && objArr == true) || ((cjlVar5.A() && objArr == true) || (cjlVar5 instanceof ljk1) || cjlVar5.z() || cjlVar5.A())) {
                        i8 = 0;
                    } else {
                        i36++;
                        i35 = i37;
                    }
                }
                i9 = i8 & (((i2 == 1073741824 || i4 != 1073741824) && !z5) ? i7 : i6);
                bjlVar = bjl.b;
                if (i9 != 0) {
                    i10 = i9;
                    iMin = Math.min(((cjl) djlVar).D[i7], i3);
                    i11 = size3;
                    iMin2 = Math.min(((cjl) djlVar).D[i6], i5);
                    i31 = 1073741824;
                    if (i2 == 1073741824) {
                        if (djlVar.s() != iMin) {
                            djlVar.T(iMin);
                            vgrVar.u();
                        }
                        i31 = 1073741824;
                    }
                    if (i4 == i31 && djlVar.m() != iMin2) {
                        djlVar.O(iMin2);
                        vgrVar.u();
                    }
                    if (i2 == i31 || i4 != i31) {
                        cjlVar = cjlVar4;
                        arrayList = arrayList4;
                        vdaVar = vdaVar6;
                        djlVar2 = (djl) vgrVar.c;
                        if (vgrVar.a) {
                            for (cjl cjlVar6 : djlVar2.u0) {
                                cjlVar6.j();
                                cjlVar6.a = false;
                                ur60 ur60Var2 = cjlVar6.d;
                                ((zct) ((xpl1) ur60Var2).e).j = false;
                                ((xpl1) ur60Var2).g = false;
                                ur60Var2.n();
                                s6j1 s6j1Var2 = cjlVar6.e;
                                ((zct) ((xpl1) s6j1Var2).e).j = false;
                                ((xpl1) s6j1Var2).g = false;
                                s6j1Var2.m();
                            }
                            i32 = 0;
                            djlVar2.j();
                            ((cjl) djlVar2).a = false;
                            ur60 ur60Var3 = ((cjl) djlVar2).d;
                            ((zct) ((xpl1) ur60Var3).e).j = false;
                            ((xpl1) ur60Var3).g = false;
                            ur60Var3.n();
                            s6j1 s6j1Var3 = ((cjl) djlVar2).e;
                            ((zct) ((xpl1) s6j1Var3).e).j = false;
                            ((xpl1) s6j1Var3).g = false;
                            s6j1Var3.m();
                            vgrVar.h();
                        } else {
                            i32 = 0;
                        }
                        vgrVar.f((djl) vgrVar.d);
                        ((cjl) djlVar2).a0 = i32;
                        ((cjl) djlVar2).b0 = i32;
                        ((xpl1) ((cjl) djlVar2).d).h.d(i32);
                        ((xpl1) ((cjl) djlVar2).e).h.d(i32);
                        i33 = 1073741824;
                        if (i2 == 1073741824) {
                            zM = vgrVar.m(i32, z5);
                            i12 = 1;
                        } else {
                            zM = true;
                            i12 = 0;
                        }
                        if (i4 == 1073741824) {
                            zM &= vgrVar.m(1, z5);
                            i12++;
                        }
                    } else {
                        ArrayList arrayList5 = (ArrayList) vgrVar.e;
                        cjl cjlVar7 = (djl) vgrVar.c;
                        if (vgrVar.a || vgrVar.b) {
                            Iterator it = ((djl) cjlVar7).u0.iterator();
                            while (it.hasNext()) {
                                ArrayList arrayList6 = arrayList5;
                                cjl cjlVar8 = (cjl) it.next();
                                cjlVar8.j();
                                cjlVar8.a = i7;
                                cjlVar8.d.n();
                                cjlVar8.e.m();
                                arrayList5 = arrayList6;
                                it = it;
                                i7 = 0;
                            }
                            arrayList3 = arrayList5;
                            cjlVar7.j();
                            i34 = 0;
                            cjlVar7.a = false;
                            cjlVar7.d.n();
                            cjlVar7.e.m();
                            vgrVar.b = false;
                        } else {
                            arrayList3 = arrayList5;
                            i34 = i7;
                        }
                        vgrVar.f((djl) vgrVar.d);
                        cjlVar7.a0 = i34;
                        cjlVar7.b0 = i34;
                        bjl bjlVarL3 = cjlVar7.l(i34);
                        vdaVar = vdaVar6;
                        bjl bjlVarL4 = cjlVar7.l(i6);
                        if (vgrVar.a) {
                            vgrVar.h();
                        }
                        int iT = cjlVar7.t();
                        arrayList = arrayList4;
                        int iU = cjlVar7.u();
                        cjlVar = cjlVar4;
                        ((xpl1) cjlVar7.d).h.d(iT);
                        ((xpl1) cjlVar7.e).h.d(iU);
                        vgrVar.y();
                        bjl bjlVar3 = bjl.a;
                        if (bjlVarL3 == bjlVar || bjlVarL4 == bjlVar) {
                            if (z5) {
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    if (!((xpl1) it2.next()).k()) {
                                        z5 = false;
                                        break;
                                    }
                                }
                            }
                            if (z5 && bjlVarL3 == bjlVar) {
                                cjlVar7.P(bjlVar3);
                                cjlVar7.T(vgrVar.j(cjlVar7, 0));
                                ((xpl1) cjlVar7.d).e.d(cjlVar7.s());
                            }
                            if (z5 && bjlVarL4 == bjlVar) {
                                cjlVar7.R(bjlVar3);
                                cjlVar7.O(vgrVar.j(cjlVar7, 1));
                                ((xpl1) cjlVar7.e).e.d(cjlVar7.m());
                            }
                        } else {
                            iU = iU;
                        }
                        bjl bjlVar4 = cjlVar7.U[0];
                        bjl bjlVar5 = bjl.d;
                        if (bjlVar4 == bjlVar3 || bjlVar4 == bjlVar5) {
                            int iS6 = cjlVar7.s() + iT;
                            ((xpl1) cjlVar7.d).i.d(iS6);
                            ((xpl1) cjlVar7.d).e.d(iS6 - iT);
                            vgrVar.y();
                            bjl bjlVar6 = cjlVar7.U[1];
                            if (bjlVar6 == bjlVar3 || bjlVar6 == bjlVar5) {
                                int iM6 = cjlVar7.m() + iU;
                                ((xpl1) cjlVar7.e).i.d(iM6);
                                ((xpl1) cjlVar7.e).e.d(iM6 - iU);
                            }
                            vgrVar.y();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        for (xpl1 xpl1Var : arrayList3) {
                            if (xpl1Var.b != cjlVar7 || xpl1Var.g) {
                                xpl1Var.e();
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                zM = true;
                                break;
                            }
                            xpl1 xpl1Var2 = (xpl1) it3.next();
                            if (z4 || xpl1Var2.b != cjlVar7) {
                                if (!xpl1Var2.h.j || ((!xpl1Var2.i.j && !(xpl1Var2 instanceof uq50)) || (!((zct) xpl1Var2.e).j && !(xpl1Var2 instanceof xbe) && !(xpl1Var2 instanceof uq50)))) {
                                    zM = false;
                                    break;
                                }
                            }
                        }
                        cjlVar7.P(bjlVarL3);
                        cjlVar7.R(bjlVarL4);
                        i33 = 1073741824;
                        i12 = 2;
                    }
                    if (zM) {
                        if (i2 == i33) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i4 == i33) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        djlVar.U(z2, z3);
                    }
                } else {
                    i10 = i9;
                    cjlVar = cjlVar4;
                    arrayList = arrayList4;
                    vdaVar = vdaVar6;
                    i11 = size3;
                    zM = false;
                    i12 = 0;
                }
                if (zM || i12 != 2) {
                    int i38 = djlVar.H0;
                    if (i11 > 0) {
                        size2 = djlVar.u0.size();
                        boolean zB0 = djlVar.b0(64);
                        vdaVar5 = djlVar.y0;
                        for (i30 = 0; i30 < size2; i30++) {
                            cjlVar3 = (cjl) djlVar.u0.get(i30);
                            if (!(cjlVar3 instanceof tq50) && !(cjlVar3 instanceof c9a) && !cjlVar3.G && (!zB0 || (ur60Var = cjlVar3.d) == null || (s6j1Var = cjlVar3.e) == null || !((zct) ((xpl1) ur60Var).e).j || !((zct) ((xpl1) s6j1Var).e).j)) {
                                bjlVarL = cjlVar3.l(0);
                                bjlVarL2 = cjlVar3.l(1);
                                if (bjlVarL == bjlVar2 || cjlVar3.s == 1 || bjlVarL2 != bjlVar2 || cjlVar3.t == 1) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (!z && djlVar.b0(1) && !(cjlVar3 instanceof ljk1)) {
                                    if (bjlVarL == bjlVar2 && cjlVar3.s == 0 && bjlVarL2 != bjlVar2 && !cjlVar3.z()) {
                                        z = true;
                                    }
                                    if (bjlVarL2 == bjlVar2 && cjlVar3.t == 0 && bjlVarL != bjlVar2 && !cjlVar3.z()) {
                                        z = true;
                                    }
                                    if ((bjlVarL != bjlVar2 || bjlVarL2 == bjlVar2) && cjlVar3.Y > 0.0f) {
                                    }
                                }
                                if (z) {
                                    p(0, vdaVar5, cjlVar3);
                                }
                            }
                        }
                        i13 = 0;
                        vdaVar5.a();
                    } else {
                        i13 = 0;
                    }
                    E(djlVar);
                    size = arrayList.size();
                    if (i11 > 0) {
                        C(djlVar, i13, iS5, iM5);
                    }
                    if (size > 0) {
                        bjlVarArr = ((cjl) djlVar).U;
                        if (bjlVarArr[i13] == bjlVar) {
                            i14 = 1;
                        } else {
                            i14 = i13;
                        }
                        if (bjlVarArr[1] == bjlVar) {
                            i15 = 1;
                        } else {
                            i15 = i13;
                        }
                        cjl cjlVar9 = cjlVar;
                        iMax = Math.max(djlVar.s(), cjlVar9.d0);
                        iMax2 = Math.max(djlVar.m(), cjlVar9.e0);
                        i16 = i13;
                        i17 = i16;
                        while (i16 < size) {
                            ArrayList arrayList7 = arrayList;
                            ljk1Var = (cjl) arrayList7.get(i16);
                            if (ljk1Var instanceof ljk1) {
                                iS3 = ljk1Var.s();
                                iM3 = ljk1Var.m();
                                i27 = i15;
                                vdaVar4 = vdaVar;
                                i28 = i17 | (p(1, vdaVar4, ljk1Var) ? 1 : 0);
                                iS4 = ljk1Var.s();
                                iM4 = ljk1Var.m();
                                if (iS4 != iS3) {
                                    ljk1Var.T(iS4);
                                    if (i14 != 0 && ljk1Var.t() + ((cjl) ljk1Var).W > iMax) {
                                        iMax = Math.max(iMax, ljk1Var.k(4).e() + ljk1Var.t() + ((cjl) ljk1Var).W);
                                    }
                                    i29 = 1;
                                } else {
                                    i29 = i28;
                                }
                                if (iM4 != iM3) {
                                    ljk1Var.O(iM4);
                                    if (i27 != 0 && ljk1Var.u() + ((cjl) ljk1Var).X > iMax2) {
                                        iMax2 = Math.max(iMax2, ljk1Var.k(5).e() + ljk1Var.u() + ((cjl) ljk1Var).X);
                                    }
                                    i29 = 1;
                                }
                                i17 = (ljk1Var.C0 ? 1 : 0) | i29;
                            } else {
                                i27 = i15;
                                vdaVar4 = vdaVar;
                            }
                            i16++;
                            vdaVar = vdaVar4;
                            arrayList = arrayList7;
                            i15 = i27;
                        }
                        i18 = i15;
                        arrayList2 = arrayList;
                        i19 = 0;
                        while (true) {
                            vdaVar2 = vdaVar;
                            if (i19 < 2) {
                                break;
                            }
                            i20 = i17;
                            i21 = 0;
                            while (i21 < size) {
                                cjlVar2 = (cjl) arrayList2.get(i21);
                                if (((cjlVar2 instanceof l660) || (cjlVar2 instanceof ljk1)) && !(cjlVar2 instanceof tq50)) {
                                    i24 = size;
                                    if (cjlVar2.i0 == 8 && ((i10 == 0 || !((zct) ((xpl1) cjlVar2.d).e).j || !((zct) ((xpl1) cjlVar2.e).e).j) && !(cjlVar2 instanceof ljk1))) {
                                        iS = cjlVar2.s();
                                        iM = cjlVar2.m();
                                        i25 = i21;
                                        int i39 = cjlVar2.c0;
                                        i20 |= p(i19 == 1 ? 2 : 1, vdaVar2, cjlVar2) ? 1 : 0;
                                        vdaVar3 = vdaVar2;
                                        iS2 = cjlVar2.s();
                                        i26 = i19;
                                        iM2 = cjlVar2.m();
                                        if (iS2 != iS) {
                                            cjlVar2.T(iS2);
                                            if (i14 == 0 && cjlVar2.t() + cjlVar2.W > iMax) {
                                                iMax = Math.max(iMax, cjlVar2.k(4).e() + cjlVar2.t() + cjlVar2.W);
                                            }
                                            i20 = 1;
                                        }
                                        if (iM2 != iM) {
                                            cjlVar2.O(iM2);
                                            if (i18 == 0 && cjlVar2.u() + cjlVar2.X > iMax2) {
                                                iMax2 = Math.max(iMax2, cjlVar2.k(5).e() + cjlVar2.u() + cjlVar2.X);
                                            }
                                            i20 = 1;
                                        }
                                        if (!cjlVar2.F && i39 != cjlVar2.c0) {
                                            i20 = 1;
                                        }
                                    }
                                    i21 = i25 + 1;
                                    size = i24;
                                    i19 = i26;
                                    vdaVar2 = vdaVar3;
                                } else {
                                    i24 = size;
                                }
                                vdaVar3 = vdaVar2;
                                i26 = i19;
                                i25 = i21;
                                i21 = i25 + 1;
                                size = i24;
                                i19 = i26;
                                vdaVar2 = vdaVar3;
                            }
                            i22 = size;
                            vdaVar = vdaVar2;
                            i23 = i19;
                            if (i20 != 0) {
                                break;
                            }
                            int i40 = i23 + 1;
                            C(djlVar, i40, iS5, iM5);
                            i19 = i40;
                            i17 = 0;
                            size = i22;
                        }
                    }
                    djlVar.H0 = i38;
                    yic0.p = djlVar.b0(512);
                }
                return;
            }
        }
        i6 = 1;
        i7 = 0;
        i8 = i35;
        i9 = i8 & (((i2 == 1073741824 || i4 != 1073741824) && !z5) ? i7 : i6);
        bjlVar = bjl.b;
        if (i9 != 0) {
            i10 = i9;
            iMin = Math.min(((cjl) djlVar).D[i7], i3);
            i11 = size3;
            iMin2 = Math.min(((cjl) djlVar).D[i6], i5);
            i31 = 1073741824;
            if (i2 == 1073741824) {
                if (djlVar.s() != iMin) {
                    djlVar.T(iMin);
                    vgrVar.u();
                }
                i31 = 1073741824;
            }
            if (i4 == i31) {
                djlVar.O(iMin2);
                vgrVar.u();
            }
            if (i2 == i31) {
                cjlVar = cjlVar4;
                arrayList = arrayList4;
                vdaVar = vdaVar6;
                djlVar2 = (djl) vgrVar.c;
                if (vgrVar.a) {
                    while (r5.hasNext()) {
                        cjlVar6.j();
                        cjlVar6.a = false;
                        ur60 ur60Var4 = cjlVar6.d;
                        ((zct) ((xpl1) ur60Var4).e).j = false;
                        ((xpl1) ur60Var4).g = false;
                        ur60Var4.n();
                        s6j1 s6j1Var4 = cjlVar6.e;
                        ((zct) ((xpl1) s6j1Var4).e).j = false;
                        ((xpl1) s6j1Var4).g = false;
                        s6j1Var4.m();
                    }
                    i32 = 0;
                    djlVar2.j();
                    ((cjl) djlVar2).a = false;
                    ur60 ur60Var5 = ((cjl) djlVar2).d;
                    ((zct) ((xpl1) ur60Var5).e).j = false;
                    ((xpl1) ur60Var5).g = false;
                    ur60Var5.n();
                    s6j1 s6j1Var5 = ((cjl) djlVar2).e;
                    ((zct) ((xpl1) s6j1Var5).e).j = false;
                    ((xpl1) s6j1Var5).g = false;
                    s6j1Var5.m();
                    vgrVar.h();
                } else {
                    i32 = 0;
                }
                vgrVar.f((djl) vgrVar.d);
                ((cjl) djlVar2).a0 = i32;
                ((cjl) djlVar2).b0 = i32;
                ((xpl1) ((cjl) djlVar2).d).h.d(i32);
                ((xpl1) ((cjl) djlVar2).e).h.d(i32);
                i33 = 1073741824;
                if (i2 == 1073741824) {
                    zM = vgrVar.m(i32, z5);
                    i12 = 1;
                } else {
                    zM = true;
                    i12 = 0;
                }
                if (i4 == 1073741824) {
                    zM &= vgrVar.m(1, z5);
                    i12++;
                }
            } else {
                cjlVar = cjlVar4;
                arrayList = arrayList4;
                vdaVar = vdaVar6;
                djlVar2 = (djl) vgrVar.c;
                if (vgrVar.a) {
                    while (r5.hasNext()) {
                        cjlVar6.j();
                        cjlVar6.a = false;
                        ur60 ur60Var6 = cjlVar6.d;
                        ((zct) ((xpl1) ur60Var6).e).j = false;
                        ((xpl1) ur60Var6).g = false;
                        ur60Var6.n();
                        s6j1 s6j1Var6 = cjlVar6.e;
                        ((zct) ((xpl1) s6j1Var6).e).j = false;
                        ((xpl1) s6j1Var6).g = false;
                        s6j1Var6.m();
                    }
                    i32 = 0;
                    djlVar2.j();
                    ((cjl) djlVar2).a = false;
                    ur60 ur60Var7 = ((cjl) djlVar2).d;
                    ((zct) ((xpl1) ur60Var7).e).j = false;
                    ((xpl1) ur60Var7).g = false;
                    ur60Var7.n();
                    s6j1 s6j1Var7 = ((cjl) djlVar2).e;
                    ((zct) ((xpl1) s6j1Var7).e).j = false;
                    ((xpl1) s6j1Var7).g = false;
                    s6j1Var7.m();
                    vgrVar.h();
                } else {
                    i32 = 0;
                }
                vgrVar.f((djl) vgrVar.d);
                ((cjl) djlVar2).a0 = i32;
                ((cjl) djlVar2).b0 = i32;
                ((xpl1) ((cjl) djlVar2).d).h.d(i32);
                ((xpl1) ((cjl) djlVar2).e).h.d(i32);
                i33 = 1073741824;
                if (i2 == 1073741824) {
                    zM = vgrVar.m(i32, z5);
                    i12 = 1;
                } else {
                    zM = true;
                    i12 = 0;
                }
                if (i4 == 1073741824) {
                    zM &= vgrVar.m(1, z5);
                    i12++;
                }
            }
            if (zM) {
                if (i2 == i33) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i4 == i33) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                djlVar.U(z2, z3);
            }
        } else {
            i10 = i9;
            cjlVar = cjlVar4;
            arrayList = arrayList4;
            vdaVar = vdaVar6;
            i11 = size3;
            zM = false;
            i12 = 0;
        }
        if (zM) {
        }
        int i310 = djlVar.H0;
        if (i11 > 0) {
            size2 = djlVar.u0.size();
            boolean zB1 = djlVar.b0(64);
            vdaVar5 = djlVar.y0;
            while (i30 < size2) {
                cjlVar3 = (cjl) djlVar.u0.get(i30);
                if (!(cjlVar3 instanceof tq50)) {
                    bjlVarL = cjlVar3.l(0);
                    bjlVarL2 = cjlVar3.l(1);
                    if (bjlVarL == bjlVar2) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (bjlVarL == bjlVar2) {
                            z = true;
                        }
                        if (bjlVarL2 == bjlVar2) {
                            z = true;
                        }
                        z = bjlVarL != bjlVar2 ? true : true;
                    }
                    if (z) {
                        p(0, vdaVar5, cjlVar3);
                    }
                }
            }
            i13 = 0;
            vdaVar5.a();
        } else {
            i13 = 0;
        }
        E(djlVar);
        size = arrayList.size();
        if (i11 > 0) {
            C(djlVar, i13, iS5, iM5);
        }
        if (size > 0) {
            bjlVarArr = ((cjl) djlVar).U;
            if (bjlVarArr[i13] == bjlVar) {
                i14 = 1;
            } else {
                i14 = i13;
            }
            if (bjlVarArr[1] == bjlVar) {
                i15 = 1;
            } else {
                i15 = i13;
            }
            cjl cjlVar10 = cjlVar;
            iMax = Math.max(djlVar.s(), cjlVar10.d0);
            iMax2 = Math.max(djlVar.m(), cjlVar10.e0);
            i16 = i13;
            i17 = i16;
            while (i16 < size) {
                ArrayList arrayList8 = arrayList;
                ljk1Var = (cjl) arrayList8.get(i16);
                if (ljk1Var instanceof ljk1) {
                    i27 = i15;
                    vdaVar4 = vdaVar;
                } else {
                    iS3 = ljk1Var.s();
                    iM3 = ljk1Var.m();
                    i27 = i15;
                    vdaVar4 = vdaVar;
                    i28 = i17 | (p(1, vdaVar4, ljk1Var) ? 1 : 0);
                    iS4 = ljk1Var.s();
                    iM4 = ljk1Var.m();
                    if (iS4 != iS3) {
                        ljk1Var.T(iS4);
                        if (i14 != 0) {
                            iMax = Math.max(iMax, ljk1Var.k(4).e() + ljk1Var.t() + ((cjl) ljk1Var).W);
                        }
                        i29 = 1;
                    } else {
                        i29 = i28;
                    }
                    if (iM4 != iM3) {
                        ljk1Var.O(iM4);
                        if (i27 != 0) {
                            iMax2 = Math.max(iMax2, ljk1Var.k(5).e() + ljk1Var.u() + ((cjl) ljk1Var).X);
                        }
                        i29 = 1;
                    }
                    i17 = (ljk1Var.C0 ? 1 : 0) | i29;
                }
                i16++;
                vdaVar = vdaVar4;
                arrayList = arrayList8;
                i15 = i27;
            }
            i18 = i15;
            arrayList2 = arrayList;
            i19 = 0;
            while (true) {
                vdaVar2 = vdaVar;
                if (i19 < 2) {
                    break;
                    break;
                }
                i20 = i17;
                i21 = 0;
                while (i21 < size) {
                    cjlVar2 = (cjl) arrayList2.get(i21);
                    if (cjlVar2 instanceof l660) {
                        i24 = size;
                        if (cjlVar2.i0 == 8) {
                            vdaVar3 = vdaVar2;
                            i26 = i19;
                            i25 = i21;
                        } else {
                            iS = cjlVar2.s();
                            iM = cjlVar2.m();
                            i25 = i21;
                            int i311 = cjlVar2.c0;
                            i20 |= p(i19 == 1 ? 2 : 1, vdaVar2, cjlVar2) ? 1 : 0;
                            vdaVar3 = vdaVar2;
                            iS2 = cjlVar2.s();
                            i26 = i19;
                            iM2 = cjlVar2.m();
                            if (iS2 != iS) {
                                cjlVar2.T(iS2);
                                if (i14 == 0) {
                                }
                                i20 = 1;
                            }
                            if (iM2 != iM) {
                                cjlVar2.O(iM2);
                                if (i18 == 0) {
                                }
                                i20 = 1;
                            }
                            if (!cjlVar2.F) {
                            }
                        }
                    } else {
                        i24 = size;
                        if (cjlVar2.i0 == 8) {
                            vdaVar3 = vdaVar2;
                            i26 = i19;
                            i25 = i21;
                        } else {
                            iS = cjlVar2.s();
                            iM = cjlVar2.m();
                            i25 = i21;
                            int i312 = cjlVar2.c0;
                            i20 |= p(i19 == 1 ? 2 : 1, vdaVar2, cjlVar2) ? 1 : 0;
                            vdaVar3 = vdaVar2;
                            iS2 = cjlVar2.s();
                            i26 = i19;
                            iM2 = cjlVar2.m();
                            if (iS2 != iS) {
                                cjlVar2.T(iS2);
                                if (i14 == 0) {
                                }
                                i20 = 1;
                            }
                            if (iM2 != iM) {
                                cjlVar2.O(iM2);
                                if (i18 == 0) {
                                }
                                i20 = 1;
                            }
                            if (!cjlVar2.F) {
                            }
                        }
                    }
                    i21 = i25 + 1;
                    size = i24;
                    i19 = i26;
                    vdaVar2 = vdaVar3;
                }
                i22 = size;
                vdaVar = vdaVar2;
                i23 = i19;
                if (i20 != 0) {
                    break;
                    break;
                }
                int i41 = i23 + 1;
                C(djlVar, i41, iS5, iM5);
                i19 = i41;
                i17 = 0;
                size = i22;
            }
        }
        djlVar.H0 = i310;
        yic0.p = djlVar.b0(512);
    }

    public void E(djl djlVar) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = djlVar.u0.size();
        for (int i = 0; i < size; i++) {
            cjl cjlVar = (cjl) djlVar.u0.get(i);
            bjl[] bjlVarArr = cjlVar.U;
            bjl bjlVar = bjlVarArr[0];
            bjl bjlVar2 = bjl.c;
            if (bjlVar == bjlVar2 || bjlVarArr[1] == bjlVar2) {
                arrayList.add(cjlVar);
            }
        }
        djlVar.w0.u();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r9 == r5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Enum F(com.spotify.player.model.ContextTrack r7, boolean r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.vr9
            if (r0 == 0) goto L13
            r0 = r9
            p.vr9 r0 = (p.vr9) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.vr9 r0 = new p.vr9
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r9)
            goto L6f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            boolean r8 = r0.b
            com.spotify.player.model.ContextTrack r7 = r0.a
            p.hm5.M(r9)
            goto L59
        L39:
            p.hm5.M(r9)
            boolean r9 = p.ul9.a(r7)
            if (r9 != 0) goto L45
            p.tr9 r6 = p.tr9.b
            return r6
        L45:
            if (r8 != 0) goto L48
            goto L79
        L48:
            java.lang.Object r9 = r6.c
            p.kr9 r9 = (p.kr9) r9
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r5) goto L59
            goto L6e
        L59:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L62
            goto L89
        L62:
            r0.a = r2
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = r6.l(r7, r0)
            if (r9 != r5) goto L6f
        L6e:
            return r5
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r6 = p.u890.j(r9, r6)
            if (r6 == 0) goto L7c
        L79:
            p.tr9 r6 = p.tr9.a
            return r6
        L7c:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r6 = p.u890.j(r9, r6)
            if (r6 == 0) goto L87
            p.tr9 r6 = p.tr9.c
            return r6
        L87:
            if (r9 != 0) goto L8c
        L89:
            p.tr9 r6 = p.tr9.d
            return r6
        L8c:
            p.eg.o()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ix7.F(com.spotify.player.model.ContextTrack, boolean, p.onm):java.lang.Enum");
    }

    public void a() {
        hdu0 hdu0Var = (hdu0) this.b;
        if (hdu0Var != null) {
            hdu0Var.U();
        }
        Disposable disposable = ((apa) this.c).e.c;
        if (disposable != null) {
            disposable.dispose();
        }
        ((rm5) this.d).H();
    }

    public Object apply(Object obj) {
        ktl ktlVar;
        switch (this.a) {
            case 3:
                return ((fg8) this.b).c((EsAuthenticateResult.AuthenticateResult) obj, (Single) this.c, new i26((AtomicReference) this.d, (byte) 24));
            default:
                uv00 uv00Var = (uv00) obj;
                ArrayList arrayList = (ArrayList) this.b;
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : arrayList) {
                    String str = (String) obj2;
                    str.getClass();
                    mtl mtlVar = uv00Var.a(mtl.class, str).b;
                    if (mtlVar == null || (ktlVar = mtlVar.a) == null) {
                        ktlVar = ktl.a;
                    }
                    linkedHashMap.put(obj2, ktlVar);
                }
                return nt8.a((DecoratedFollowedShowsResponse) this.c, linkedHashMap, (tr80) this.d);
        }
    }

    public void d(Bundle bundle) {
        synchronized (this.c) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.d = new CountDownLatch(1);
            ((h9n) this.b).d(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (((CountDownLatch) this.d).await(500L, TimeUnit.MILLISECONDS)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                }
            } catch (InterruptedException unused) {
            }
            this.d = null;
        }
    }

    public void e(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(ev8 ev8Var, onm onmVar) {
        vj8 vj8Var;
        if (onmVar instanceof vj8) {
            vj8Var = (vj8) onmVar;
            int i = vj8Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vj8Var.c = i - Integer.MIN_VALUE;
            } else {
                vj8Var = new vj8(this, onmVar);
            }
        } else {
            vj8Var = new vj8(this, onmVar);
        }
        Object objO = vj8Var.a;
        int i2 = vj8Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                if (ev8Var == null) {
                    hv8.Companion.getClass();
                    return new hv8(false, "Request sent with empty body", (String) null);
                }
                y610 y610Var = (y610) this.b;
                vc7 vc7Var = vc7.T0;
                Long l = new Long(5000L);
                ew0 ew0Var = new ew0(this, ev8Var, (lnm) null, (byte) 5);
                vj8Var.c = 1;
                objO = cwl1.o(y610Var, vc7Var, l, ew0Var, vj8Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            return (hv8) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gv8 gv8Var = hv8.Companion;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            gv8Var.getClass();
            return new hv8(false, message, (String) null);
        }
    }

    public f19 h() {
        String strConcat = ((String) this.b) == null ? " token" : "";
        if (((Long) this.c) == null) {
            strConcat = strConcat.concat(" tokenExpirationTimestamp");
        }
        if (((Long) this.d) == null) {
            strConcat = strConcat.concat(" tokenCreationTimestamp");
        }
        if (strConcat.isEmpty()) {
            return new f19(((Long) this.c).longValue(), ((Long) this.d).longValue(), (String) this.b);
        }
        eg.m("Missing required properties:".concat(strConcat));
        return null;
    }

    public z19 i() {
        String strConcat = ((Long) this.b) == null ? " delta" : "";
        if (((Long) this.c) == null) {
            strConcat = strConcat.concat(" maxAllowedDelay");
        }
        if (((Set) this.d) == null) {
            strConcat = strConcat.concat(" flags");
        }
        if (strConcat.isEmpty()) {
            return new z19(((Long) this.b).longValue(), ((Long) this.c).longValue(), (Set) this.d);
        }
        eg.m("Missing required properties:".concat(strConcat));
        return null;
    }

    public s29 j() {
        String strConcat = ((String) this.b) == null ? " backendName" : "";
        if (((xnw0) this.d) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new s29((String) this.b, (byte[]) this.c, (xnw0) this.d);
        }
        eg.m("Missing required properties:".concat(strConcat));
        return null;
    }

    public int k() {
        int i;
        jc9 jc9Var;
        twa twaVar = (twa) this.d;
        lb lbVar = (lb) this.b;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 1;
        if (i2 >= 30) {
            BiometricManager biometricManager = (BiometricManager) this.c;
            if (biometricManager == null) {
                return 1;
            }
            return hwa.a(biometricManager, 15);
        }
        Context context = lbVar.a;
        if (zua0.a(context) != null) {
            if (i2 == 29) {
                Method methodC = gwa.c();
                if (methodC != null) {
                    try {
                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                        keyStore.load(null);
                        KeyGenParameterSpec.Builder builderB = pco.b("androidxBiometric", 3);
                        pco.d(builderB);
                        pco.e(builderB);
                        i = -1;
                        try {
                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            pco.c(keyGenerator, pco.a(builderB));
                            keyGenerator.generateKey();
                            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
                            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                            cipher.init(1, secretKey);
                            jc9Var = new jc9(cipher, (byte) 4);
                        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused) {
                            jc9Var = null;
                        }
                    } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException unused2) {
                        i = -1;
                    }
                    BiometricPrompt.CryptoObject cryptoObjectA = jc9Var == null ? null : qco.a((Cipher) jc9Var.b);
                    if (cryptoObjectA != null) {
                        try {
                            Object objInvoke = Build.VERSION.SDK_INT == 29 ? methodC.invoke((BiometricManager) this.c, cryptoObjectA) : null;
                            if (objInvoke instanceof Integer) {
                                return ((Integer) objInvoke).intValue();
                            }
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused3) {
                        }
                    }
                } else {
                    i = -1;
                }
                BiometricManager biometricManager2 = (BiometricManager) this.c;
                int iA = biometricManager2 == null ? 1 : gwa.a(biometricManager2);
                String str = Build.MODEL;
                if (Build.VERSION.SDK_INT < 30 && str != null) {
                    for (String str2 : context.getResources().getStringArray(2130903042)) {
                        if (str.equals(str2)) {
                            return iA;
                        }
                    }
                }
                if (iA != 0) {
                    return iA;
                }
                KeyguardManager keyguardManagerA = zua0.a(lbVar.a);
                if (keyguardManagerA != null ? zua0.b(keyguardManagerA) : false) {
                    i3 = i;
                } else if (twaVar != null) {
                    i3 = 12;
                }
                return i3;
            }
            if (i2 == 28) {
                if (context != null && context.getPackageManager() != null && lzq0.a(context.getPackageManager())) {
                    KeyguardManager keyguardManagerA2 = zua0.a(lbVar.a);
                    if (keyguardManagerA2 != null ? zua0.b(keyguardManagerA2) : false) {
                        return -1;
                    }
                    return twaVar == null ? 1 : 12;
                }
            } else if (twaVar == null) {
                return 1;
            }
        }
        return 12;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(ContextTrack contextTrack, onm onmVar) {
        ur9 ur9Var;
        Object next;
        if (onmVar instanceof ur9) {
            ur9Var = (ur9) onmVar;
            int i = ur9Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ur9Var.d = i - Integer.MIN_VALUE;
            } else {
                ur9Var = new ur9(this, onmVar);
            }
        } else {
            ur9Var = new ur9(this, onmVar);
        }
        Object objY = ur9Var.b;
        int i2 = ur9Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                q8n q8nVar = (q8n) this.d;
                k96 k96Var = new k96(this, contextTrack, (lnm) null, (byte) 26);
                ur9Var.a = contextTrack;
                ur9Var.d = 1;
                objY = fn31.Y(q8nVar, k96Var, ur9Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                contextTrack = ur9Var.a;
                hm5.M(objY);
            }
            Iterator it = ((Iterable) objY).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((qfd) next).a.equals(contextTrack.uri()));
            qfd qfdVar = (qfd) next;
            if (qfdVar != null) {
                return Boolean.valueOf(qfdVar.b);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(onm onmVar) {
        wj8 wj8Var;
        if (onmVar instanceof wj8) {
            wj8Var = (wj8) onmVar;
            int i = wj8Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wj8Var.c = i - Integer.MIN_VALUE;
            } else {
                wj8Var = new wj8(this, onmVar);
            }
        } else {
            wj8Var = new wj8(this, onmVar);
        }
        Object objO = wj8Var.a;
        int i2 = wj8Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                y610 y610Var = (y610) this.b;
                vc7 vc7Var = vc7.U0;
                Long l = new Long(5000L);
                ew0 ew0Var = new ew0(this, (lnm) null, (byte) 6);
                wj8Var.c = 1;
                objO = cwl1.o(y610Var, vc7Var, l, ew0Var, wj8Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            return (jdi1) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            idi1 idi1Var = jdi1.Companion;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            idi1Var.getClass();
            return new jdi1((String) null, (String) null, false, message, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[PHI: r1 r3 r12 r13 r14
      0x0053: PHI (r1v12 p.ilo0) = (r1v10 p.ilo0), (r1v17 p.ilo0) binds: [B:71:0x015d, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:71:0x015d, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r12v11 java.lang.String) = (r12v9 java.lang.String), (r12v18 java.lang.String) binds: [B:71:0x015d, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r13v20 p.fto0) = (r13v16 p.fto0), (r13v24 p.fto0) binds: [B:71:0x015d, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r14v17 java.lang.Object) = (r14v16 java.lang.Object), (r14v1 java.lang.Object) binds: [B:71:0x015d, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf A[PHI: r1 r13
      0x00cf: PHI (r1v4 p.ilo0) = (r1v3 p.ilo0), (r1v3 p.ilo0), (r1v6 p.ilo0) binds: [B:39:0x00b7, B:41:0x00cb, B:24:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r13v7 java.lang.String) = (r13v5 java.lang.String), (r13v5 java.lang.String), (r13v9 java.lang.String) binds: [B:39:0x00b7, B:41:0x00cb, B:24:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8 A[PHI: r1 r7 r13 r14
      0x00e8: PHI (r1v7 java.lang.String) = (r1v5 java.lang.String), (r1v9 java.lang.String) binds: [B:44:0x00e4, B:23:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r7v2 p.ilo0) = (r7v1 p.ilo0), (r7v3 p.ilo0) binds: [B:44:0x00e4, B:23:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r13v10 java.lang.String) = (r13v8 java.lang.String), (r13v15 java.lang.String) binds: [B:44:0x00e4, B:23:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x00e8: PHI (r14v12 java.lang.Object) = (r14v11 java.lang.Object), (r14v1 java.lang.Object) binds: [B:44:0x00e4, B:23:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f A[LOOP:0: B:53:0x00ff->B:57:0x010f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x0143  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0184  */
    /* JADX WARN: Code duplicated, block: B:85:0x018b  */
    /* JADX WARN: Code duplicated, block: B:86:0x018c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b4 A[RETURN] */
    public Object n(LinkedHashMap linkedHashMap, onm onmVar) throws Throwable {
        oca ocaVar;
        String str;
        ilo0 ilo0Var;
        String str2;
        String str3;
        ilo0 ilo0Var2;
        String str4;
        String str5;
        t45 t45Var;
        or81[] or81VarArrValues;
        int length;
        int i;
        or81 or81Var;
        kly0 kly0Var;
        fto0 fto0Var;
        ilo0 ilo0Var3;
        fto0 fto0Var2;
        String str6;
        fto0 fto0Var3;
        String str7;
        t45 t45Var2;
        Map map;
        Throwable th;
        t45 t45Var3;
        Map map2;
        Map map3;
        if (onmVar instanceof oca) {
            ocaVar = (oca) onmVar;
            int i2 = ocaVar.X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ocaVar.X = i2 - Integer.MIN_VALUE;
            } else {
                ocaVar = new oca(this, onmVar);
            }
        } else {
            ocaVar = new oca(this, onmVar);
        }
        Object objP = ocaVar.i;
        int i3 = ocaVar.X;
        int i4 = 0;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (i3) {
            case 0:
                hm5.M(objP);
                ocaVar.a = linkedHashMap;
                ocaVar.X = 1;
                if (qgo1.i("silent_or_regular", "silent", ocaVar) != d9nVar) {
                    str = (String) linkedHashMap.get("push_context");
                    if (str != null && (ilo0Var = (ilo0) ((mbf) this.b).a(str)) != null && (str2 = ilo0Var.i) != null) {
                        str3 = ilo0Var.h;
                        if (str3 != null) {
                            ocaVar.a = null;
                            ocaVar.b = ilo0Var;
                            ocaVar.c = str2;
                            ocaVar.d = null;
                            ocaVar.h = 0;
                            ocaVar.X = 2;
                            if (qgo1.j("push_request_id", str3, ocaVar) != d9nVar) {
                                ilo0Var2 = ilo0Var;
                                str4 = str2;
                                ocaVar.a = null;
                                ocaVar.b = ilo0Var2;
                                ocaVar.c = str4;
                                str5 = "silent_receive_log";
                                ocaVar.d = "silent_receive_log";
                                ocaVar.h = 0;
                                ocaVar.X = 3;
                                objP = qgo1.p(ocaVar);
                                if (objP != d9nVar) {
                                    t45Var = (t45) objP;
                                    if (t45Var == null) {
                                        o(ilo0Var2);
                                    } else {
                                        t45.m(t45Var, str5, 2);
                                        try {
                                            o(ilo0Var2);
                                            t45Var.g(str5);
                                        } catch (Throwable th2) {
                                            t45Var.g(str5);
                                            throw th2;
                                        }
                                    }
                                    or81VarArrValues = or81.values();
                                    length = or81VarArrValues.length;
                                    i = 0;
                                    while (true) {
                                        if (i < length) {
                                            or81Var = or81VarArrValues[i];
                                            or81Var.getClass();
                                            if ("notification-removal".equals(str4)) {
                                                i++;
                                            }
                                        } else {
                                            or81Var = null;
                                        }
                                    }
                                    if (or81Var != null && (kly0Var = (kly0) ((gg11) this.d).get(or81Var)) != null && (fto0Var = (fto0) kly0Var.get()) != null) {
                                        ocaVar.a = null;
                                        ocaVar.b = ilo0Var2;
                                        ocaVar.c = null;
                                        ocaVar.d = null;
                                        ocaVar.e = fto0Var;
                                        ocaVar.X = 4;
                                        if (qgo1.i("silent_feature", str4, ocaVar) != d9nVar) {
                                            ilo0Var3 = ilo0Var2;
                                            fto0Var2 = fto0Var;
                                            ocaVar.a = null;
                                            ocaVar.b = ilo0Var3;
                                            ocaVar.c = null;
                                            ocaVar.d = null;
                                            ocaVar.e = fto0Var2;
                                            str6 = "silent_handler_work";
                                            ocaVar.f = "silent_handler_work";
                                            ocaVar.h = 0;
                                            ocaVar.X = 5;
                                            objP = qgo1.p(ocaVar);
                                            if (objP != d9nVar) {
                                                fto0Var3 = fto0Var2;
                                                str7 = str6;
                                                t45Var2 = (t45) objP;
                                                map = b7x.a;
                                                if (t45Var2 == null) {
                                                    map3 = ilo0Var3.j;
                                                    if (map3 != null) {
                                                        map = map3;
                                                    }
                                                    ocaVar.a = null;
                                                    ocaVar.b = null;
                                                    ocaVar.c = null;
                                                    ocaVar.d = null;
                                                    ocaVar.e = null;
                                                    ocaVar.f = null;
                                                    ocaVar.h = i4;
                                                    ocaVar.X = 6;
                                                    if (fto0Var3.a(map) == d9nVar) {
                                                    }
                                                } else {
                                                    t45.m(t45Var2, str7, 2);
                                                    try {
                                                        map2 = ilo0Var3.j;
                                                        if (map2 == null) {
                                                            map = map2;
                                                        }
                                                        ocaVar.a = null;
                                                        ocaVar.b = null;
                                                        ocaVar.c = null;
                                                        ocaVar.d = null;
                                                        ocaVar.e = null;
                                                        ocaVar.f = str7;
                                                        ocaVar.g = t45Var2;
                                                        ocaVar.h = i4;
                                                        ocaVar.X = 7;
                                                        if (fto0Var3.a(map) != d9nVar) {
                                                            t45Var3 = t45Var2;
                                                            t45Var3.g(str7);
                                                            return rih1Var;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        t45Var3 = t45Var2;
                                                        t45Var3.g(str7);
                                                        throw th;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ilo0Var2 = ilo0Var;
                            str4 = str2;
                            ocaVar.a = null;
                            ocaVar.b = ilo0Var2;
                            ocaVar.c = str4;
                            str5 = "silent_receive_log";
                            ocaVar.d = "silent_receive_log";
                            ocaVar.h = 0;
                            ocaVar.X = 3;
                            objP = qgo1.p(ocaVar);
                            if (objP != d9nVar) {
                                t45Var = (t45) objP;
                                if (t45Var == null) {
                                    o(ilo0Var2);
                                } else {
                                    t45.m(t45Var, str5, 2);
                                    o(ilo0Var2);
                                    t45Var.g(str5);
                                }
                                or81VarArrValues = or81.values();
                                length = or81VarArrValues.length;
                                i = 0;
                                while (true) {
                                    if (i < length) {
                                        or81Var = or81VarArrValues[i];
                                        or81Var.getClass();
                                        if ("notification-removal".equals(str4)) {
                                            i++;
                                        }
                                    } else {
                                        or81Var = null;
                                    }
                                }
                                if (or81Var != null) {
                                    ocaVar.a = null;
                                    ocaVar.b = ilo0Var2;
                                    ocaVar.c = null;
                                    ocaVar.d = null;
                                    ocaVar.e = fto0Var;
                                    ocaVar.X = 4;
                                    if (qgo1.i("silent_feature", str4, ocaVar) != d9nVar) {
                                        ilo0Var3 = ilo0Var2;
                                        fto0Var2 = fto0Var;
                                        ocaVar.a = null;
                                        ocaVar.b = ilo0Var3;
                                        ocaVar.c = null;
                                        ocaVar.d = null;
                                        ocaVar.e = fto0Var2;
                                        str6 = "silent_handler_work";
                                        ocaVar.f = "silent_handler_work";
                                        ocaVar.h = 0;
                                        ocaVar.X = 5;
                                        objP = qgo1.p(ocaVar);
                                        if (objP != d9nVar) {
                                            fto0Var3 = fto0Var2;
                                            str7 = str6;
                                            t45Var2 = (t45) objP;
                                            map = b7x.a;
                                            if (t45Var2 == null) {
                                                map3 = ilo0Var3.j;
                                                if (map3 != null) {
                                                    map = map3;
                                                }
                                                ocaVar.a = null;
                                                ocaVar.b = null;
                                                ocaVar.c = null;
                                                ocaVar.d = null;
                                                ocaVar.e = null;
                                                ocaVar.f = null;
                                                ocaVar.h = i4;
                                                ocaVar.X = 6;
                                                if (fto0Var3.a(map) == d9nVar) {
                                                }
                                            } else {
                                                t45.m(t45Var2, str7, 2);
                                                map2 = ilo0Var3.j;
                                                if (map2 == null) {
                                                    map = map2;
                                                }
                                                ocaVar.a = null;
                                                ocaVar.b = null;
                                                ocaVar.c = null;
                                                ocaVar.d = null;
                                                ocaVar.e = null;
                                                ocaVar.f = str7;
                                                ocaVar.g = t45Var2;
                                                ocaVar.h = i4;
                                                ocaVar.X = 7;
                                                if (fto0Var3.a(map) != d9nVar) {
                                                    t45Var3 = t45Var2;
                                                    t45Var3.g(str7);
                                                    return rih1Var;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                linkedHashMap = ocaVar.a;
                hm5.M(objP);
                str = (String) linkedHashMap.get("push_context");
                if (str != null) {
                    str3 = ilo0Var.h;
                    if (str3 != null) {
                        ocaVar.a = null;
                        ocaVar.b = ilo0Var;
                        ocaVar.c = str2;
                        ocaVar.d = null;
                        ocaVar.h = 0;
                        ocaVar.X = 2;
                        if (qgo1.j("push_request_id", str3, ocaVar) != d9nVar) {
                            ilo0Var2 = ilo0Var;
                            str4 = str2;
                            ocaVar.a = null;
                            ocaVar.b = ilo0Var2;
                            ocaVar.c = str4;
                            str5 = "silent_receive_log";
                            ocaVar.d = "silent_receive_log";
                            ocaVar.h = 0;
                            ocaVar.X = 3;
                            objP = qgo1.p(ocaVar);
                            if (objP != d9nVar) {
                                t45Var = (t45) objP;
                                if (t45Var == null) {
                                    o(ilo0Var2);
                                } else {
                                    t45.m(t45Var, str5, 2);
                                    o(ilo0Var2);
                                    t45Var.g(str5);
                                }
                                or81VarArrValues = or81.values();
                                length = or81VarArrValues.length;
                                i = 0;
                                while (true) {
                                    if (i < length) {
                                        or81Var = or81VarArrValues[i];
                                        or81Var.getClass();
                                        if ("notification-removal".equals(str4)) {
                                            i++;
                                        }
                                    } else {
                                        or81Var = null;
                                    }
                                }
                                if (or81Var != null) {
                                    ocaVar.a = null;
                                    ocaVar.b = ilo0Var2;
                                    ocaVar.c = null;
                                    ocaVar.d = null;
                                    ocaVar.e = fto0Var;
                                    ocaVar.X = 4;
                                    if (qgo1.i("silent_feature", str4, ocaVar) != d9nVar) {
                                        ilo0Var3 = ilo0Var2;
                                        fto0Var2 = fto0Var;
                                        ocaVar.a = null;
                                        ocaVar.b = ilo0Var3;
                                        ocaVar.c = null;
                                        ocaVar.d = null;
                                        ocaVar.e = fto0Var2;
                                        str6 = "silent_handler_work";
                                        ocaVar.f = "silent_handler_work";
                                        ocaVar.h = 0;
                                        ocaVar.X = 5;
                                        objP = qgo1.p(ocaVar);
                                        if (objP != d9nVar) {
                                            fto0Var3 = fto0Var2;
                                            str7 = str6;
                                            t45Var2 = (t45) objP;
                                            map = b7x.a;
                                            if (t45Var2 == null) {
                                                map3 = ilo0Var3.j;
                                                if (map3 != null) {
                                                    map = map3;
                                                }
                                                ocaVar.a = null;
                                                ocaVar.b = null;
                                                ocaVar.c = null;
                                                ocaVar.d = null;
                                                ocaVar.e = null;
                                                ocaVar.f = null;
                                                ocaVar.h = i4;
                                                ocaVar.X = 6;
                                                if (fto0Var3.a(map) == d9nVar) {
                                                }
                                            } else {
                                                t45.m(t45Var2, str7, 2);
                                                map2 = ilo0Var3.j;
                                                if (map2 == null) {
                                                    map = map2;
                                                }
                                                ocaVar.a = null;
                                                ocaVar.b = null;
                                                ocaVar.c = null;
                                                ocaVar.d = null;
                                                ocaVar.e = null;
                                                ocaVar.f = str7;
                                                ocaVar.g = t45Var2;
                                                ocaVar.h = i4;
                                                ocaVar.X = 7;
                                                if (fto0Var3.a(map) != d9nVar) {
                                                    t45Var3 = t45Var2;
                                                    t45Var3.g(str7);
                                                    return rih1Var;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        ilo0Var2 = ilo0Var;
                        str4 = str2;
                        ocaVar.a = null;
                        ocaVar.b = ilo0Var2;
                        ocaVar.c = str4;
                        str5 = "silent_receive_log";
                        ocaVar.d = "silent_receive_log";
                        ocaVar.h = 0;
                        ocaVar.X = 3;
                        objP = qgo1.p(ocaVar);
                        if (objP != d9nVar) {
                            t45Var = (t45) objP;
                            if (t45Var == null) {
                                o(ilo0Var2);
                            } else {
                                t45.m(t45Var, str5, 2);
                                o(ilo0Var2);
                                t45Var.g(str5);
                            }
                            or81VarArrValues = or81.values();
                            length = or81VarArrValues.length;
                            i = 0;
                            while (true) {
                                if (i < length) {
                                    or81Var = or81VarArrValues[i];
                                    or81Var.getClass();
                                    if ("notification-removal".equals(str4)) {
                                        i++;
                                    }
                                } else {
                                    or81Var = null;
                                }
                            }
                            if (or81Var != null) {
                                ocaVar.a = null;
                                ocaVar.b = ilo0Var2;
                                ocaVar.c = null;
                                ocaVar.d = null;
                                ocaVar.e = fto0Var;
                                ocaVar.X = 4;
                                if (qgo1.i("silent_feature", str4, ocaVar) != d9nVar) {
                                    ilo0Var3 = ilo0Var2;
                                    fto0Var2 = fto0Var;
                                    ocaVar.a = null;
                                    ocaVar.b = ilo0Var3;
                                    ocaVar.c = null;
                                    ocaVar.d = null;
                                    ocaVar.e = fto0Var2;
                                    str6 = "silent_handler_work";
                                    ocaVar.f = "silent_handler_work";
                                    ocaVar.h = 0;
                                    ocaVar.X = 5;
                                    objP = qgo1.p(ocaVar);
                                    if (objP != d9nVar) {
                                        fto0Var3 = fto0Var2;
                                        str7 = str6;
                                        t45Var2 = (t45) objP;
                                        map = b7x.a;
                                        if (t45Var2 == null) {
                                            map3 = ilo0Var3.j;
                                            if (map3 != null) {
                                                map = map3;
                                            }
                                            ocaVar.a = null;
                                            ocaVar.b = null;
                                            ocaVar.c = null;
                                            ocaVar.d = null;
                                            ocaVar.e = null;
                                            ocaVar.f = null;
                                            ocaVar.h = i4;
                                            ocaVar.X = 6;
                                            if (fto0Var3.a(map) == d9nVar) {
                                            }
                                        } else {
                                            t45.m(t45Var2, str7, 2);
                                            map2 = ilo0Var3.j;
                                            if (map2 == null) {
                                                map = map2;
                                            }
                                            ocaVar.a = null;
                                            ocaVar.b = null;
                                            ocaVar.c = null;
                                            ocaVar.d = null;
                                            ocaVar.e = null;
                                            ocaVar.f = str7;
                                            ocaVar.g = t45Var2;
                                            ocaVar.h = i4;
                                            ocaVar.X = 7;
                                            if (fto0Var3.a(map) != d9nVar) {
                                                t45Var3 = t45Var2;
                                                t45Var3.g(str7);
                                                return rih1Var;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return d9nVar;
                }
                return rih1Var;
            case 2:
                str2 = ocaVar.c;
                ilo0Var = ocaVar.b;
                hm5.M(objP);
                ilo0Var2 = ilo0Var;
                str4 = str2;
                ocaVar.a = null;
                ocaVar.b = ilo0Var2;
                ocaVar.c = str4;
                str5 = "silent_receive_log";
                ocaVar.d = "silent_receive_log";
                ocaVar.h = 0;
                ocaVar.X = 3;
                objP = qgo1.p(ocaVar);
                if (objP != d9nVar) {
                    t45Var = (t45) objP;
                    if (t45Var == null) {
                        o(ilo0Var2);
                    } else {
                        t45.m(t45Var, str5, 2);
                        o(ilo0Var2);
                        t45Var.g(str5);
                    }
                    or81VarArrValues = or81.values();
                    length = or81VarArrValues.length;
                    i = 0;
                    while (true) {
                        if (i < length) {
                            or81Var = or81VarArrValues[i];
                            or81Var.getClass();
                            if ("notification-removal".equals(str4)) {
                                i++;
                            }
                        } else {
                            or81Var = null;
                        }
                    }
                    if (or81Var != null) {
                        ocaVar.a = null;
                        ocaVar.b = ilo0Var2;
                        ocaVar.c = null;
                        ocaVar.d = null;
                        ocaVar.e = fto0Var;
                        ocaVar.X = 4;
                        if (qgo1.i("silent_feature", str4, ocaVar) != d9nVar) {
                            ilo0Var3 = ilo0Var2;
                            fto0Var2 = fto0Var;
                            ocaVar.a = null;
                            ocaVar.b = ilo0Var3;
                            ocaVar.c = null;
                            ocaVar.d = null;
                            ocaVar.e = fto0Var2;
                            str6 = "silent_handler_work";
                            ocaVar.f = "silent_handler_work";
                            ocaVar.h = 0;
                            ocaVar.X = 5;
                            objP = qgo1.p(ocaVar);
                            if (objP != d9nVar) {
                                fto0Var3 = fto0Var2;
                                str7 = str6;
                                t45Var2 = (t45) objP;
                                map = b7x.a;
                                if (t45Var2 == null) {
                                    map3 = ilo0Var3.j;
                                    if (map3 != null) {
                                        map = map3;
                                    }
                                    ocaVar.a = null;
                                    ocaVar.b = null;
                                    ocaVar.c = null;
                                    ocaVar.d = null;
                                    ocaVar.e = null;
                                    ocaVar.f = null;
                                    ocaVar.h = i4;
                                    ocaVar.X = 6;
                                    if (fto0Var3.a(map) == d9nVar) {
                                    }
                                } else {
                                    t45.m(t45Var2, str7, 2);
                                    map2 = ilo0Var3.j;
                                    if (map2 == null) {
                                        map = map2;
                                    }
                                    ocaVar.a = null;
                                    ocaVar.b = null;
                                    ocaVar.c = null;
                                    ocaVar.d = null;
                                    ocaVar.e = null;
                                    ocaVar.f = str7;
                                    ocaVar.g = t45Var2;
                                    ocaVar.h = i4;
                                    ocaVar.X = 7;
                                    if (fto0Var3.a(map) != d9nVar) {
                                        t45Var3 = t45Var2;
                                        t45Var3.g(str7);
                                        return rih1Var;
                                    }
                                }
                            }
                        }
                    }
                    return rih1Var;
                }
                return d9nVar;
            case 3:
                str5 = ocaVar.d;
                str4 = ocaVar.c;
                ilo0Var2 = ocaVar.b;
                hm5.M(objP);
                t45Var = (t45) objP;
                if (t45Var == null) {
                    o(ilo0Var2);
                } else {
                    t45.m(t45Var, str5, 2);
                    o(ilo0Var2);
                    t45Var.g(str5);
                }
                or81VarArrValues = or81.values();
                length = or81VarArrValues.length;
                i = 0;
                while (true) {
                    if (i < length) {
                        or81Var = or81VarArrValues[i];
                        or81Var.getClass();
                        if ("notification-removal".equals(str4)) {
                            i++;
                        }
                    } else {
                        or81Var = null;
                    }
                }
                if (or81Var != null) {
                    ocaVar.a = null;
                    ocaVar.b = ilo0Var2;
                    ocaVar.c = null;
                    ocaVar.d = null;
                    ocaVar.e = fto0Var;
                    ocaVar.X = 4;
                    if (qgo1.i("silent_feature", str4, ocaVar) != d9nVar) {
                        ilo0Var3 = ilo0Var2;
                        fto0Var2 = fto0Var;
                        ocaVar.a = null;
                        ocaVar.b = ilo0Var3;
                        ocaVar.c = null;
                        ocaVar.d = null;
                        ocaVar.e = fto0Var2;
                        str6 = "silent_handler_work";
                        ocaVar.f = "silent_handler_work";
                        ocaVar.h = 0;
                        ocaVar.X = 5;
                        objP = qgo1.p(ocaVar);
                        if (objP != d9nVar) {
                            fto0Var3 = fto0Var2;
                            str7 = str6;
                            t45Var2 = (t45) objP;
                            map = b7x.a;
                            if (t45Var2 == null) {
                                map3 = ilo0Var3.j;
                                if (map3 != null) {
                                    map = map3;
                                }
                                ocaVar.a = null;
                                ocaVar.b = null;
                                ocaVar.c = null;
                                ocaVar.d = null;
                                ocaVar.e = null;
                                ocaVar.f = null;
                                ocaVar.h = i4;
                                ocaVar.X = 6;
                                if (fto0Var3.a(map) == d9nVar) {
                                }
                            } else {
                                t45.m(t45Var2, str7, 2);
                                map2 = ilo0Var3.j;
                                if (map2 == null) {
                                    map = map2;
                                }
                                ocaVar.a = null;
                                ocaVar.b = null;
                                ocaVar.c = null;
                                ocaVar.d = null;
                                ocaVar.e = null;
                                ocaVar.f = str7;
                                ocaVar.g = t45Var2;
                                ocaVar.h = i4;
                                ocaVar.X = 7;
                                if (fto0Var3.a(map) != d9nVar) {
                                    t45Var3 = t45Var2;
                                    t45Var3.g(str7);
                                    return rih1Var;
                                }
                            }
                        }
                    }
                    return d9nVar;
                }
                return rih1Var;
            case 4:
                fto0Var = ocaVar.e;
                ilo0 ilo0Var4 = ocaVar.b;
                hm5.M(objP);
                ilo0Var3 = ilo0Var4;
                fto0Var2 = fto0Var;
                ocaVar.a = null;
                ocaVar.b = ilo0Var3;
                ocaVar.c = null;
                ocaVar.d = null;
                ocaVar.e = fto0Var2;
                str6 = "silent_handler_work";
                ocaVar.f = "silent_handler_work";
                ocaVar.h = 0;
                ocaVar.X = 5;
                objP = qgo1.p(ocaVar);
                if (objP != d9nVar) {
                    fto0Var3 = fto0Var2;
                    str7 = str6;
                    t45Var2 = (t45) objP;
                    map = b7x.a;
                    if (t45Var2 == null) {
                        map3 = ilo0Var3.j;
                        if (map3 != null) {
                            map = map3;
                        }
                        ocaVar.a = null;
                        ocaVar.b = null;
                        ocaVar.c = null;
                        ocaVar.d = null;
                        ocaVar.e = null;
                        ocaVar.f = null;
                        ocaVar.h = i4;
                        ocaVar.X = 6;
                        if (fto0Var3.a(map) == d9nVar) {
                            return rih1Var;
                        }
                    } else {
                        t45.m(t45Var2, str7, 2);
                        map2 = ilo0Var3.j;
                        if (map2 == null) {
                            map = map2;
                        }
                        ocaVar.a = null;
                        ocaVar.b = null;
                        ocaVar.c = null;
                        ocaVar.d = null;
                        ocaVar.e = null;
                        ocaVar.f = str7;
                        ocaVar.g = t45Var2;
                        ocaVar.h = i4;
                        ocaVar.X = 7;
                        if (fto0Var3.a(map) != d9nVar) {
                            t45Var3 = t45Var2;
                            t45Var3.g(str7);
                            return rih1Var;
                        }
                    }
                }
                return d9nVar;
            case 5:
                i4 = ocaVar.h;
                str6 = ocaVar.f;
                fto0Var2 = ocaVar.e;
                ilo0Var3 = ocaVar.b;
                hm5.M(objP);
                fto0Var3 = fto0Var2;
                str7 = str6;
                t45Var2 = (t45) objP;
                map = b7x.a;
                if (t45Var2 == null) {
                    map3 = ilo0Var3.j;
                    if (map3 != null) {
                        map = map3;
                    }
                    ocaVar.a = null;
                    ocaVar.b = null;
                    ocaVar.c = null;
                    ocaVar.d = null;
                    ocaVar.e = null;
                    ocaVar.f = null;
                    ocaVar.h = i4;
                    ocaVar.X = 6;
                    if (fto0Var3.a(map) == d9nVar) {
                        return rih1Var;
                    }
                } else {
                    t45.m(t45Var2, str7, 2);
                    map2 = ilo0Var3.j;
                    if (map2 == null) {
                        map = map2;
                    }
                    ocaVar.a = null;
                    ocaVar.b = null;
                    ocaVar.c = null;
                    ocaVar.d = null;
                    ocaVar.e = null;
                    ocaVar.f = str7;
                    ocaVar.g = t45Var2;
                    ocaVar.h = i4;
                    ocaVar.X = 7;
                    if (fto0Var3.a(map) != d9nVar) {
                        t45Var3 = t45Var2;
                        t45Var3.g(str7);
                        return rih1Var;
                    }
                }
                return d9nVar;
            case 6:
                hm5.M(objP);
                return rih1Var;
            case 7:
                t45Var3 = ocaVar.g;
                str7 = ocaVar.f;
                try {
                    hm5.M(objP);
                    t45Var3.g(str7);
                    return rih1Var;
                } catch (Throwable th4) {
                    th = th4;
                    t45Var3.g(str7);
                    throw th;
                }
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public void o(ilo0 ilo0Var) {
        kdy0 kdy0Var = (kdy0) this.c;
        String str = ilo0Var.h;
        if (str == null) {
            str = "";
        }
        fn31.T((llm) kdy0Var.b, (o8n) null, 0, new d821(kdy0Var, new pr81(str, ilo0Var.d, ilo0Var.i, ilo0Var.j), (lnm) null, (byte) 16), 3);
    }

    public boolean p(int i, vda vdaVar, cjl cjlVar) {
        uda udaVar = (uda) this.c;
        bjl[] bjlVarArr = cjlVar.U;
        int[] iArr = cjlVar.u;
        udaVar.a = bjlVarArr[0];
        udaVar.b = bjlVarArr[1];
        udaVar.c = cjlVar.s();
        udaVar.d = cjlVar.m();
        udaVar.i = false;
        udaVar.j = i;
        bjl bjlVar = udaVar.a;
        bjl bjlVar2 = bjl.c;
        boolean z = bjlVar == bjlVar2;
        boolean z2 = udaVar.b == bjlVar2;
        boolean z3 = z && cjlVar.Y > 0.0f;
        boolean z4 = z2 && cjlVar.Y > 0.0f;
        bjl bjlVar3 = bjl.a;
        if (z3 && iArr[0] == 4) {
            udaVar.a = bjlVar3;
        }
        if (z4 && iArr[1] == 4) {
            udaVar.b = bjlVar3;
        }
        vdaVar.b(cjlVar, udaVar);
        cjlVar.T(udaVar.e);
        cjlVar.O(udaVar.f);
        cjlVar.F = udaVar.h;
        cjlVar.K(udaVar.g);
        udaVar.j = 0;
        return udaVar.i;
    }

    public void q(String str, tv80 tv80Var) {
        if (str == null) {
            Logger.d("No ctaUrl provided: doing nothing", new Object[0]);
            return;
        }
        Set set = s4b1.f;
        if (uic.u(str)) {
            lzn0 lzn0Var = (lzn0) this.c;
            if (tv80Var != null) {
                lzn0Var.a(str, tv80Var, (Bundle) null);
                return;
            } else {
                lzn0Var.h(str);
                return;
            }
        }
        zhh1 zhh1Var = (zhh1) this.b;
        Activity activity = (Activity) this.d;
        Uri uri = Uri.parse(str);
        xxf xxfVar = dxf.b;
        xxf xxfVar2 = xxf.b;
        if (xxfVar == xxfVar2) {
            n57.e("CheckoutSource must not be " + xxfVar2);
        }
        x8g x8gVar = zhh1Var.a;
        v5g v5gVarB = x8gVar.c(uri) ? x8gVar.b(xxfVar, uri) : null;
        activity.startActivity(v5gVarB != null ? x8g.a(activity, v5gVarB) : zhh1Var.b.a(activity, new lyf(xxfVar, new jyf(activity.getString(2131953829)), uri)));
    }

    public void r(String str, String str2) {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((pdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("toast", str, (Integer) null, (String) null, str2));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public void s(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null backendName");
        }
    }

    public void subscribe(SingleEmitter singleEmitter) {
        cxc cxcVar = (cxc) ((km3) this.b).c;
        String str = (String) this.c;
        ne neVar = new ne((byte) 9);
        ((t360) neVar.c).b("Accept", "application/json");
        ((t360) neVar.c).b("Accept", "application/x-www-form-urlencoded");
        ((t360) neVar.c).b("Accept", "text/html");
        ((t360) neVar.c).b("Content-Type", "application/x-www-form-urlencoded");
        neVar.e0(str);
        cxcVar.a(new ln21(neVar)).d(new em3(singleEmitter, (String) this.d, (byte) 29));
    }

    public void t(long j) {
        this.b = Long.valueOf(j);
    }

    public void u(byte[] bArr) {
        this.c = bArr;
    }

    public void unregister() {
        if (((AtomicBoolean) this.d).compareAndSet(false, true)) {
            ((lbc0) this.c).invoke((UUID) this.b);
        }
    }

    public void v(Set set) {
        if (set != null) {
            this.d = set;
        } else {
            bhn0.i("Null flags");
        }
    }

    public void w() {
        this.c = 86400000L;
    }

    public void x(xnw0 xnw0Var) {
        if (xnw0Var != null) {
            this.d = xnw0Var;
        } else {
            bhn0.i("Null priority");
        }
    }

    public void y(String str) {
        if (str != null) {
            this.b = str;
        } else {
            bhn0.i("Null token");
        }
    }

    public void z(long j) {
        this.d = Long.valueOf(j);
    }

    public /* synthetic */ ix7(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ix7(ArrayList arrayList, nt8 nt8Var, DecoratedFollowedShowsResponse decoratedFollowedShowsResponse, tr80 tr80Var) {
        this.a = (byte) 10;
        this.b = arrayList;
        this.c = decoratedFollowedShowsResponse;
        this.d = tr80Var;
    }

    public ix7(mt8 mt8Var, Scheduler scheduler) {
        this.a = (byte) 8;
        this.b = mt8Var;
        this.c = scheduler;
        this.d = new idd1(new i26(this, (byte) 28));
    }

    public ix7(UUID uuid, lbc0 lbc0Var) {
        this.a = (byte) 21;
        this.b = uuid;
        this.c = lbc0Var;
        this.d = new AtomicBoolean(false);
    }

    public ix7(String str, i8h1 i8h1Var) {
        this.a = (byte) 22;
        this.b = i8h1Var;
        this.c = new pdl0((byte) 4);
        this.d = str;
    }

    public ix7(Context context, t2j0 t2j0Var, l270 l270Var, ckp ckpVar, bkp bkpVar, nfa0 nfa0Var, rma rmaVar, Scheduler scheduler, Scheduler scheduler2, q8n q8nVar, q8n q8nVar2, yqg yqgVar, zwz0 zwz0Var, swm0 swm0Var, byp0 byp0Var) {
        this.a = (byte) 23;
        this.b = ckpVar;
        this.c = bkpVar;
        this.d = swm0Var;
    }

    public ix7(Context context, ut71 ut71Var, bx7 bx7Var) {
        this.a = (byte) 0;
        this.b = ut71Var;
        this.c = bx7Var;
        this.d = context.getApplicationContext();
    }

    public /* synthetic */ ix7(byte b) {
        this.a = b;
    }

    public ix7(h9n h9nVar) {
        this.a = (byte) 28;
        this.c = new Object();
        this.b = h9nVar;
    }

    public ix7(djl djlVar) {
        this.a = (byte) 20;
        this.b = new ArrayList();
        this.c = new uda();
        this.d = djlVar;
    }

    public ix7(lb lbVar) {
        this.a = (byte) 26;
        this.b = lbVar;
        int i = Build.VERSION.SDK_INT;
        this.c = i >= 29 ? gwa.b(lbVar.a) : null;
        this.d = i <= 29 ? new twa() : null;
    }
}
