package p;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import android.view.View;
import com.google.android.recaptcha.internal.zzx;
import com.google.android.recaptcha.internal.zzy;
import com.google.android.recaptcha.internal.zzz;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionError;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.JsonEncodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b8p1 implements Function, SingleTransformer, s180, o490, jl60, h8q0 {
    public static b8p1 f;
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public b8p1(ynb0 ynb0Var, i2i1 i2i1Var) {
        this.a = (byte) 14;
        ArrayList arrayList = new ArrayList();
        euc eucVar = (buc) ynb0Var.get();
        ztc ztcVar = new ztc((Integer) null, 253);
        euc eucVar2 = eucVar;
        eucVar2.getClass();
        this.c = rqt0.F(o6x.a, new hsc(eucVar2, ztcVar, (lnm) null, (byte) 2)).map(dj10.T0);
        this.d = Observable.defer(new aj91(i2i1Var, (byte) 4)).firstOrError().doOnSuccess(p.Y0).onErrorReturnItem(z6x.a);
        this.e = Single.just(arrayList).flatMap(new d4e0(this, (byte) 28)).onErrorResumeNext(f331.Z0);
    }

    public static /* bridge */ /* synthetic */ Context B(b8p1 b8p1Var) {
        return (Context) b8p1Var.c;
    }

    public static synchronized b8p1 E(Context context) {
        b8p1 b8p1Var;
        b8p1Var = f;
        if (b8p1Var == null) {
            b8p1Var = new b8p1(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new pkn0("MessengerIpcClient"))));
            f = b8p1Var;
        }
        return b8p1Var;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService H(b8p1 b8p1Var) {
        return (ScheduledExecutorService) b8p1Var.d;
    }

    public static final void L(long j) throws zzy {
        long[] jArr = {1239547247, 271084552, 603409185, 805905448, 612732982, 1384275531, 148774773, 1155505365, 905894996};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % 905894996)) != 0) {
            throw new zzy();
        }
    }

    public void A(char[] cArr, int i) throws IOException {
        byte[] bArr = (byte[]) this.d;
        if (i < 0) {
            hhg1.n("count < 0");
            return;
        }
        if (i > cArr.length) {
            t8e1.l(cArr.length, cy30.r(i, "count > string.length: ", " > "));
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.b < 1) {
                    n();
                }
                int i3 = this.b;
                int i4 = i3 + 1;
                this.b = i4;
                bArr[i3] = (byte) c;
                i2++;
                int iMin = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c2 = cArr[i2];
                    if (c2 >= 128) {
                        break;
                    }
                    int i5 = this.b;
                    this.b = i5 + 1;
                    bArr[i5] = (byte) c2;
                    i2++;
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.b < 2) {
                        n();
                    }
                    int i6 = this.b;
                    int i7 = i6 + 1;
                    this.b = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    this.b = i6 + 2;
                    bArr[i7] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.b < 3) {
                        n();
                    }
                    int i8 = this.b;
                    int i9 = i8 + 1;
                    this.b = i9;
                    bArr[i8] = (byte) ((c >> '\f') | 224);
                    int i10 = i8 + 2;
                    this.b = i10;
                    bArr[i9] = (byte) (((c >> 6) & 63) | 128);
                    this.b = i8 + 3;
                    bArr[i10] = (byte) ((c & '?') | 128);
                } else {
                    int i11 = i2 + 1;
                    char c3 = i11 < i ? cArr[i11] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.b < 1) {
                            n();
                        }
                        int i12 = this.b;
                        this.b = i12 + 1;
                        bArr[i12] = 63;
                        i2 = i11;
                    } else {
                        int i13 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.b < 4) {
                            n();
                        }
                        int i14 = this.b;
                        int i15 = i14 + 1;
                        this.b = i15;
                        bArr[i14] = (byte) ((i13 >> 18) | 240);
                        int i16 = i14 + 2;
                        this.b = i16;
                        bArr[i15] = (byte) (((i13 >> 12) & 63) | 128);
                        int i17 = i14 + 3;
                        this.b = i17;
                        bArr[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        this.b = i14 + 4;
                        bArr[i17] = (byte) ((i13 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public void C(long j) throws zzz, zzy {
        long[] jArr = {1540846267, 571107382, 1484708369, 709108262, 1568035521, 3652851584L, 192048860, 2037335344, 1874960596};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        L(j);
        long j10 = j / (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + j8) ^ (j9 % 1874960596));
        if (j10 < 0 || j10 > ((tdp1) this.c).a.length) {
            throw new zzz();
        }
        this.b = (int) j10;
    }

    public long D() {
        long[] jArr = {1714636915, 1758565436, 174653550, 1653642768, 38095596, 2318926016L, 596516649, 1804289383, 846930886};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        return ((long) this.b) * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + jArr[6]) ^ (jArr[7] % 846930886));
    }

    public long F() throws zzz {
        try {
            amo1 amo1Var = (amo1) this.d;
            tdp1 tdp1Var = (tdp1) this.c;
            int i = this.b;
            this.b = i + 1;
            return amo1Var.a(tdp1Var, i);
        } catch (IndexOutOfBoundsException e) {
            throw new zzz(e);
        }
    }

    public int G() throws zzz {
        try {
            amo1 amo1Var = (amo1) this.d;
            tdp1 tdp1Var = (tdp1) this.c;
            int i = this.b;
            this.b = i + 1;
            int iA = amo1Var.a(tdp1Var, i) & 255;
            amo1 amo1Var2 = (amo1) this.d;
            tdp1 tdp1Var2 = (tdp1) this.c;
            int i2 = this.b;
            this.b = i2 + 1;
            int iA2 = iA | ((amo1Var2.a(tdp1Var2, i2) & 255) << 8);
            amo1 amo1Var3 = (amo1) this.d;
            tdp1 tdp1Var3 = (tdp1) this.c;
            int i3 = this.b;
            this.b = i3 + 1;
            int iA3 = iA2 | ((amo1Var3.a(tdp1Var3, i3) & 255) << 16);
            amo1 amo1Var4 = (amo1) this.d;
            tdp1 tdp1Var4 = (tdp1) this.c;
            int i4 = this.b;
            this.b = i4 + 1;
            return (amo1Var4.a(tdp1Var4, i4) << 24) | iA3;
        } catch (IndexOutOfBoundsException e) {
            throw new zzz(e);
        }
    }

    public tdp1 I(long j) throws zzz, zzy {
        int[] iArr = {2004270296, 933109376, 745751825, 330111618, 543277087, 1377683891, 125737768, 1632381616, 422449966};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = xvj1.i((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        L(D() + j);
        int i10 = this.b;
        long j2 = i10;
        tdp1 tdp1Var = (tdp1) this.c;
        long j3 = (j >> ((i8 % 422449966) ^ i9)) + j2;
        if (j3 > tdp1Var.a.length || j3 < j2) {
            throw new zzz();
        }
        try {
            int i11 = (int) j3;
            tdp1 tdp1VarC = ((amo1) this.d).c(tdp1Var, i10, i11);
            this.b = i11;
            return tdp1VarC;
        } catch (IndexOutOfBoundsException e) {
            throw new AssertionError(bap1.a("CEiv6BFfPnitUE+D"), e);
        }
    }

    public long J() throws zzz, zzx {
        int i = 0;
        long j = 0;
        while (i < 64) {
            try {
                amo1 amo1Var = (amo1) this.d;
                tdp1 tdp1Var = (tdp1) this.c;
                int i2 = this.b;
                this.b = i2 + 1;
                byte bA = amo1Var.a(tdp1Var, i2);
                j |= ((long) (bA & 127)) << i;
                if (i == 63) {
                    if (bA > 1) {
                        throw new zzx();
                    }
                    i = 63;
                }
                if ((bA & 128) == 0) {
                    return (-(j & 1)) ^ (j >>> 1);
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzz(e);
            }
        }
        throw new zzx();
    }

    public synchronized hfp1 K(a1p1 a1p1Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                new StringBuilder(String.valueOf(a1p1Var).length() + 9);
            }
            if (!((fvo1) this.e).d(a1p1Var)) {
                fvo1 fvo1Var = new fvo1(this);
                this.e = fvo1Var;
                fvo1Var.d(a1p1Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a1p1Var.b.a;
    }

    public long a(long j) {
        ggg1 ggg1Var = (ggg1) this.c;
        return (ggg1Var.d == null && ggg1Var.c == null) ? j : ggg1Var.k(j);
    }

    public Object apply(Object obj) {
        Object objInvoke;
        String string;
        switch (this.a) {
            case 5:
                x3g1 x3g1Var = (x3g1) obj;
                fu fuVar = new fu((iqr) this.c, (String) this.d, (String) this.e, this.b);
                if (x3g1Var instanceof v3g1) {
                    objInvoke = Single.just(zy1.f);
                } else {
                    if (!(x3g1Var instanceof w3g1)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = fuVar.invoke(x3g1Var);
                }
                return (SingleSource) objInvoke;
            case 9:
                iqr iqrVar = ((aas) this.c).a;
                String str = (String) this.d;
                String str2 = (String) this.e;
                return iqrVar.a(this.b, str, str2, (List) obj);
            case 13:
                mmr0 mmr0Var = (mmr0) obj;
                spq0 spq0Var = (spq0) mmr0Var.a;
                return ((lf81) this.c).a(this.b, (yrc0) spq0Var.h()).map(new o0g1((String) this.d, (String) this.e, this.b, spq0Var, (xd41) mmr0Var.b, (byte) 11));
            case 15:
                ytp0 ytp0Var = (ytp0) this.c;
                return Observable.combineLatest(Observable.interval(0L, 1L, TimeUnit.HOURS, (Scheduler) ytp0Var.e), ((xvo) ytp0Var.f).a(true), ((ifl1) ytp0Var.c).g().toObservable(), ud20.W0).switchMap(new o0g1((m210) this.d, this.b, (r9c) this.e, ytp0Var, (b510) obj));
            default:
                int i = this.b;
                p1f0 p1f0Var = (p1f0) this.c;
                if (((Boolean) obj).booleanValue()) {
                    return Single.just(in91.c);
                }
                View view = (View) this.d;
                l8s l8sVar = (l8s) p1f0Var.e;
                Context context = (Context) p1f0Var.a;
                int iC = l1d.C(i);
                if (iC == 0) {
                    string = context.getString(2131962583);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    string = context.getString(2131962578);
                }
                return l8sVar.c(new ijo0(new mx81(string, 2, 3, 10000L, 38), view, (w4f1) null, 12)).flatMap(new mgc(p1f0Var, (String) this.e, i, (byte) 28));
        }
    }

    public h1s b(nk60 nk60Var, ij81 ij81Var, il60 il60Var) {
        h1s h1sVar = new h1s(nk60Var, ij81Var, il60Var);
        h1sVar.e.add(new wod1((o5n) this.c, h1sVar, (String) this.d, this.b, (bnh0) this.e));
        return h1sVar;
    }

    public Single c(Single single) {
        switch (this.a) {
            case 6:
                k9r k9rVar = (k9r) this.c;
                fu fuVar = new fu(k9rVar, (String) this.d, this.b, (String) this.e, (byte) 8);
                return single.doOnSuccess(new lgr(fuVar, k9rVar, (byte) 3)).doOnError(new yrh(fuVar, (byte) 22));
            default:
                j16 j16Var = (j16) this.c;
                k9r k9rVar2 = (k9r) this.d;
                nok nokVar = new nok(j16Var, k9rVar2, this.b, (vr60) this.e);
                return single.doOnSuccess(new lgr(k9rVar2, nokVar, (byte) 4)).doOnError(new yrh(nokVar, (byte) 23));
        }
    }

    public int d() {
        h4e1 h4e1Var = (h4e1) this.d;
        return h4e1Var != null ? h4e1Var.c.length() : ((ggg1) this.c).h().d.length();
    }

    public long e(long j) {
        ggg1 ggg1Var = (ggg1) this.c;
        return (ggg1Var.d == null && ggg1Var.c == null) ? j : ggg1Var.j(j);
    }

    public void f(zau0 zau0Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.e;
        bbu0 bbu0Var = (bbu0) this.d;
        if (bbu0Var != null) {
            zau0 zau0Var2 = (zau0) bbu0Var.c.get();
            if (zau0Var2 == null) {
                eg.m("reference has been gc'd");
                return;
            } else {
                bbu0Var.e = false;
                zau0Var2.b.m((Object) null, Boolean.FALSE);
                zau0Var2.c = null;
            }
        }
        bbu0 bbu0Var2 = (bbu0) weakHashMap.get(zau0Var);
        if (bbu0Var2 != null && bbu0Var2.c.get() == null) {
            weakHashMap.remove(zau0Var);
        }
        Object bbu0Var3 = weakHashMap.get(zau0Var);
        if (bbu0Var3 == null) {
            bbu0Var3 = new bbu0(zau0Var, (nsm0) this.c, this.b);
            weakHashMap.put(zau0Var, bbu0Var3);
        }
        bbu0 bbu0Var4 = (bbu0) bbu0Var3;
        this.d = bbu0Var4;
        zau0 zau0Var3 = (zau0) bbu0Var4.c.get();
        if (zau0Var3 == null) {
            eg.m("reference has been gc'd");
            return;
        }
        bbu0Var4.e = true;
        zau0Var3.c = bbu0Var4;
        zau0Var3.b.m((Object) null, Boolean.TRUE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.json.JsonEncodingException */
    public void g(char c) throws JsonEncodingException, IOException {
        byte[] bArr = (byte[]) this.d;
        if (c < 128) {
            if (bArr.length - this.b < 1) {
                n();
            }
            int i = this.b;
            this.b = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.b < 2) {
                n();
            }
            int i2 = this.b;
            int i3 = i2 + 1;
            this.b = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.b = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.b < 1) {
                n();
            }
            int i4 = this.b;
            this.b = i4 + 1;
            bArr[i4] = 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.b < 3) {
                n();
            }
            int i5 = this.b;
            int i6 = i5 + 1;
            this.b = i6;
            bArr[i5] = -32;
            int i7 = i5 + 2;
            this.b = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.b = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
            return;
        }
        if (c > 65535) {
            throw new JsonEncodingException(6, gvg.e(c, "Unexpected code point: ", ". Check your strings for malformed UTF-8 sequences."), (String) null);
        }
        if (bArr.length - this.b < 4) {
            n();
        }
        int i8 = this.b;
        int i9 = i8 + 1;
        this.b = i9;
        bArr[i8] = -16;
        int i10 = i8 + 2;
        this.b = i10;
        bArr[i9] = -128;
        int i11 = i8 + 3;
        this.b = i11;
        bArr[i10] = (byte) (((c >> 6) & 63) | 128);
        this.b = i8 + 4;
        bArr[i11] = (byte) ((c & '?') | 128);
    }

    public b8p1 h(int i, int i2, boolean z) {
        vhd vhdVar = (vhd) this.c;
        ei51 ei51Var = (ei51) this.d;
        return new b8p1((Object) vhdVar, (Object) new ei51(ei51Var.a, ei51Var.b, ei51Var.c, ei51Var.d, Integer.valueOf(i), z), this.e, i2, (byte) 18);
    }

    public void i() {
        j84 j84Var = (j84) this.d;
        ((wt7) this.c).b(vt7.b, this.b == 2 ? 0 : j84Var.a(), j84Var.b() / 100.0f);
        this.b = 2;
    }

    public void j(iu30 iu30Var) {
        this.b++;
        ((bfn0) this.e).b(iu30Var);
        k();
    }

    public boolean k() {
        ggg1 ggg1Var = (ggg1) this.c;
        bfn0 bfn0Var = (bfn0) this.e;
        int i = this.b - 1;
        this.b = i;
        if (i == 0 && bfn0Var.c != 0) {
            y7e1 y7e1Var = ggg1Var.a;
            dk80 dk80Var = ggg1Var.b;
            y7e1Var.b.c().h();
            h4e1 h4e1Var = y7e1Var.b;
            if (ggg1Var.d == null && ggg1Var.c == null) {
                this.d = h4e1Var;
            }
            Object[] objArr = bfn0Var.a;
            int i2 = bfn0Var.c;
            for (int i3 = 0; i3 < i2; i3++) {
                ((iu30) objArr[i3]).invoke(h4e1Var);
            }
            ggg1Var.r(h4e1Var);
            y7e1Var.b(dk80Var, false, 1);
            y7e1Var.g(true);
            y7e1Var.f(y7e1Var.b.e);
            bfn0Var.g();
        }
        return this.b > 0;
    }

    public void l(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.e;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.e = Arrays.copyOf(cArr, i3);
        }
    }

    public void m(List list, lp9 lp9Var, float f2, boolean z) {
        if (!z) {
            ((wt7) this.c).b(vt7.b, 0, f2);
            this.b = 1;
            return;
        }
        if (!(lp9Var instanceof jp9)) {
            if (lp9Var instanceof kp9) {
                z(f2);
                return;
            } else {
                eg.o();
                return;
            }
        }
        jp9 jp9Var = (jp9) lp9Var;
        int iC = l1d.C(jp9Var.c);
        if (iC == 0) {
            List<pq9> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return;
            }
            for (pq9 pq9Var : list2) {
                long j = jp9Var.a;
                if (j >= pq9Var.a && j < pq9Var.b) {
                    i();
                    return;
                }
            }
            return;
        }
        if (iC != 1) {
            if (iC == 2 || iC == 3 || iC == 4) {
                z(f2);
                return;
            } else {
                eg.o();
                return;
            }
        }
        long jA = jp9Var.a(((yqg) this.e).b());
        List<pq9> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (pq9 pq9Var2 : list3) {
                if (jA >= pq9Var2.a && jA < pq9Var2.b) {
                    i();
                    return;
                }
            }
        }
        z(f2);
    }

    public void n() throws IOException {
        ((FileOutputStream) this.c).write((byte[]) this.d, 0, this.b);
        this.b = 0;
    }

    public zau0 o() {
        bbu0 bbu0Var = (bbu0) this.d;
        if (bbu0Var != null) {
            return bbu0Var.a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0045  */
    public void onSuccess(Object obj) {
        e821 e821Var;
        emo1 emo1Var = (emo1) this.c;
        String str = (String) this.d;
        int i = this.b;
        SharedPreferences sharedPreferences = (SharedPreferences) this.e;
        Bundle bundle = (Bundle) obj;
        wf61 wf61Var = emo1Var.a;
        zod.s(wf61Var);
        ytn1 ytn1Var = emo1Var.b;
        if (i == 3) {
            son1 son1Var = emo1Var.c;
            e821Var = new e821();
            e821Var.b = emo1Var;
            e821Var.a = son1Var;
            e821Var.c = str;
            e821Var.e = new utw0(e821Var);
            wf61Var.a(new ksn1(e821Var));
            if (ytn1Var != null) {
                hvo1 hvo1Var = new hvo1(e821Var, (byte) 1);
                ytn1.g.a("register callback = %s", new Object[]{hvo1Var});
                zod.n("Must be called from the main thread.");
                ytn1Var.b.add(hvo1Var);
            }
        } else if (i == 2) {
            i = 2;
            son1 son1Var2 = emo1Var.c;
            e821Var = new e821();
            e821Var.b = emo1Var;
            e821Var.a = son1Var2;
            e821Var.c = str;
            e821Var.e = new utw0(e821Var);
            wf61Var.a(new ksn1(e821Var));
            if (ytn1Var != null) {
                hvo1 hvo1Var2 = new hvo1(e821Var, (byte) 1);
                ytn1.g.a("register callback = %s", new Object[]{hvo1Var2});
                zod.n("Must be called from the main thread.");
                ytn1Var.b.add(hvo1Var2);
            }
        }
        if (i == 1 || i == 2) {
            txo1 txo1Var = new txo1(sharedPreferences, emo1Var, emo1Var.c, bundle, str);
            wf61Var.a(new fg61(txo1Var, (byte) 1));
            if (ytn1Var != null) {
                hvo1 hvo1Var3 = new hvo1(txo1Var, (byte) 0);
                ytn1.g.a("register callback = %s", new Object[]{hvo1Var3});
                zod.n("Must be called from the main thread.");
                ytn1Var.b.add(hvo1Var3);
            }
        }
    }

    public void p(String str) throws IOException {
        byte b;
        l(0, str.length() + 2);
        char[] cArr = (char[]) this.e;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i = length + 1;
        int length2 = 1;
        while (length2 < i) {
            char c = cArr[length2];
            byte[] bArr = ahc1.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length3 = str.length();
                for (int i2 = length2 - 1; i2 < length3; i2++) {
                    l(length2, 2);
                    char cCharAt = str.charAt(i2);
                    byte[] bArr2 = ahc1.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i3 = length2 + 1;
                        ((char[]) this.e)[length2] = cCharAt;
                        length2 = i3;
                    } else if (b == 1) {
                        String str2 = ahc1.a[cCharAt];
                        str2.getClass();
                        l(length2, str2.length());
                        str2.getChars(0, str2.length(), (char[]) this.e, length2);
                        length2 = str2.length() + length2;
                    } else {
                        char[] cArr2 = (char[]) this.e;
                        cArr2[length2] = '\\';
                        cArr2[length2 + 1] = (char) b;
                        length2 += 2;
                    }
                }
                l(length2, 1);
                char[] cArr3 = (char[]) this.e;
                cArr3[length2] = '\"';
                A(cArr3, length2 + 1);
                n();
                return;
            }
            length2++;
        }
        cArr[i] = '\"';
        A(cArr, length + 2);
        n();
    }

    public int q() {
        int i = this.b;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public synchronized ix21 r() {
        ix21 ix21Var;
        try {
            if (this.b == 3) {
                ix21Var = ix21.e;
            } else {
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                ix21 ix21Var2 = ix21.c;
                if (linkedHashSet.contains(ix21Var2)) {
                    ix21Var = ix21Var2;
                } else {
                    ix21Var2 = ix21.d;
                    if (!linkedHashSet.contains(ix21Var2)) {
                        ix21 ix21Var3 = ix21.b;
                        if (linkedHashSet.contains(ix21Var3)) {
                            ix21Var = ix21Var3;
                        }
                    }
                    ix21Var = ix21Var2;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return ix21Var;
    }

    public void s(String str) throws IOException {
        int length = str.length();
        l(0, length);
        str.getChars(0, length, (char[]) this.e, 0);
        A((char[]) this.e, length);
    }

    public void t(ti tiVar) {
        String str;
        t2j0 t2j0Var = (t2j0) this.c;
        b12 b12VarN = AddressCollectionError.n();
        b12VarN.n(((UUID) this.e).toString());
        b12VarN.q(tiVar.b());
        p12 p12Var = tiVar instanceof p12 ? (p12) tiVar : null;
        if (p12Var != null && (str = p12Var.c) != null) {
            b12VarN.r(str);
        }
        t2j0Var.a(b12VarN.build());
    }

    public void u(int i, int i2, int i3) {
        vhd vhdVar = (vhd) this.c;
        ei51 ei51Var = (ei51) this.d;
        mn41 mn41Var = new mn41(this, (byte) 11);
        LinkedHashMap linkedHashMap = (LinkedHashMap) vhdVar.d;
        Object kkk1Var = linkedHashMap.get(ei51Var);
        if (kkk1Var == null) {
            kkk1Var = new kkk1(vhdVar.c && ei51Var.d && ei51Var.f);
            linkedHashMap.put(ei51Var, kkk1Var);
        }
        kkk1 kkk1Var2 = (kkk1) kkk1Var;
        int iP = yoi1.p(i, 0, i3);
        int iP2 = yoi1.p(i2, iP, i3);
        Set setP1 = o7h.p1(yoi1.Q(iP, iP2));
        if (kkk1Var2.a && !kkk1Var2.b.isEmpty() && ((Number) o7h.F0(kkk1Var2.b)).intValue() == i3 - 1 && iP2 == i3 && setP1.containsAll(kkk1Var2.b) && iP < ((Number) o7h.I0(kkk1Var2.b)).intValue()) {
            return;
        }
        Iterator it = dm61.v0(setP1, kkk1Var2.b).iterator();
        while (it.hasNext()) {
            mn41Var.invoke(it.next());
        }
        kkk1Var2.b = setP1;
    }

    public void v() {
        HandlerThread handlerThread;
        synchronized (this.c) {
            try {
                dm5.y(this.b > 0);
                int i = this.b - 1;
                this.b = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.e) != null) {
                    handlerThread.quit();
                    this.e = null;
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Single w(Single single) {
        return single.map(new fp8(this, (byte) 23)).doOnError(new mba(this, (byte) 27));
    }

    public void writeLong(long j) throws IOException {
        s(String.valueOf(j));
    }

    public void x(float f2, int i) {
        mmr0 mmr0Var;
        int i2 = this.b;
        float[] fArr = (float[]) this.c;
        Arrays.fill(fArr, 0, fArr.length, 1.0f);
        fArr[i] = f2;
        if (i != fArr.length - 1) {
            fArr[i + 1] = 1.0f - f2;
        }
        Float fValueOf = Float.valueOf(3.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (i2 <= 4) {
            mmr0Var = new mmr0(fValueOf2, Float.valueOf(i2 - 1.0f));
        } else {
            int length = fArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                } else if (fArr[i3] < 1.0f) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                mmr0Var = new mmr0(fValueOf2, fValueOf);
            } else {
                float f3 = fArr[i3];
                int i4 = i3 - 2;
                if (i4 < 0) {
                    mmr0Var = new mmr0(fValueOf2, fValueOf);
                } else {
                    float f4 = i4 + f3;
                    float f5 = i2 - 4;
                    if (f4 > f5) {
                        f4 = f5;
                    }
                    mmr0Var = new mmr0(Float.valueOf(f4), Float.valueOf((f4 + 4.0f) - 1.0f));
                }
            }
        }
        this.d = mmr0Var;
        t9l1[] t9l1VarArr = new t9l1[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            t9l1VarArr[i5] = new t9l1(1.0f);
        }
        if (i2 >= 4) {
            int iCeil = (int) Math.ceil(((Number) ((mmr0) this.d).a).floatValue());
            int iFloor = (int) Math.floor(((Number) ((mmr0) this.d).a).floatValue());
            if (iCeil != iFloor) {
                float fFloatValue = ((Number) ((mmr0) this.d).a).floatValue() - iFloor;
                if (iFloor > 0) {
                    t9l1VarArr[iFloor] = new t9l1(fFloatValue);
                    t9l1VarArr[iCeil] = new t9l1(1.0f - fFloatValue);
                } else if (iCeil > 0) {
                    t9l1VarArr[iCeil] = new t9l1(1.0f - fFloatValue);
                }
            } else if (iCeil > 0) {
                t9l1VarArr[iCeil] = new t9l1(0.0f);
            }
            int iFloor2 = (int) Math.floor(((Number) ((mmr0) this.d).b).floatValue());
            int iCeil2 = (int) Math.ceil(((Number) ((mmr0) this.d).b).floatValue());
            if (iFloor2 != iCeil2) {
                float fFloatValue2 = iCeil2 - ((Number) ((mmr0) this.d).b).floatValue();
                int i6 = i2 - 1;
                if (iCeil2 < i6) {
                    t9l1VarArr[iCeil2] = new t9l1(fFloatValue2);
                    t9l1VarArr[iFloor2] = new t9l1(1.0f - fFloatValue2);
                } else if (iFloor2 < i6) {
                    t9l1VarArr[iFloor2] = new t9l1(1.0f - fFloatValue2);
                }
            } else if (iFloor2 < i2 - 1) {
                t9l1VarArr[iFloor2] = new t9l1(0.0f);
            }
        }
        this.e = t9l1VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    public llb1 y(long j, klb1 klb1Var) {
        ix21 ix21Var;
        int i;
        long j2 = 1000 * j;
        long j3 = klb1Var != null ? klb1Var.b : 0L;
        if (j3 < 1) {
            j3 = 1;
        }
        long j4 = j3 + j2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Map map = klb1Var != null ? klb1Var.a : null;
        if (map == null) {
            map = b7x.a;
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ix21Var = ix21.d;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            String str = (String) entry.getValue();
            Set setEntrySet = ((LinkedHashMap) this.d).entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                np51 np51Var = (np51) ((Map.Entry) obj).getKey();
                if (str != null && np51Var.d == iIntValue && u890.j(np51Var.e, str)) {
                    arrayList.add(obj);
                }
            }
            boolean z = false;
            long jMax = j2;
            for (Map.Entry entry2 : o7h.a1(arrayList, new be21((byte) 16))) {
                np51 np51Var2 = (np51) entry2.getKey();
                Set set = (Set) entry2.getValue();
                boolean z2 = np51Var2.f;
                it = it;
                j2 = j2;
                long j5 = np51Var2.h;
                if (z2) {
                    r7h.W(set, linkedHashSet);
                    z = true;
                } else {
                    long j6 = np51Var2.g;
                    if (j6 != -9223372036854775807L && j6 < j4 && j2 < j5) {
                        if (j6 > jMax) {
                            linkedHashSet2.add(ix21Var);
                        }
                        r7h.W(set, linkedHashSet2);
                        jMax = Math.max(jMax, j5);
                    }
                }
            }
            Iterator it2 = it;
            long j7 = j2;
            if (!z) {
                linkedHashSet.add(ix21Var);
            }
            if (jMax < j4) {
                linkedHashSet2.add(ix21Var);
            }
            it = it2;
            j2 = j7;
        }
        ix21 ix21VarR = r();
        ix21 ix21Var2 = ix21.c;
        boolean zContains = linkedHashSet.contains(ix21Var2);
        ix21 ix21Var3 = ix21.b;
        ix21 ix21Var4 = zContains ? ix21Var2 : (!linkedHashSet.contains(ix21Var) && linkedHashSet.contains(ix21Var3)) ? ix21Var3 : ix21Var;
        if (linkedHashSet2.contains(ix21Var3) && linkedHashSet2.contains(ix21Var2)) {
            i = 2;
        } else if (linkedHashSet2.contains(ix21Var)) {
            i = 4;
        } else if (linkedHashSet2.contains(ix21Var3)) {
            i = 1;
        } else if (linkedHashSet2.contains(ix21Var2)) {
            i = 3;
        } else {
            i = 4;
        }
        return new llb1(ix21VarR, ix21Var4, i);
    }

    public void z(float f2) {
        wt7 wt7Var = (wt7) this.c;
        int i = this.b;
        vt7 vt7Var = vt7.b;
        if (i != 2 || f2 < 1.0f) {
            wt7Var.b(vt7Var, 0, f2);
        } else {
            wt7Var.c(vt7Var, ((j84) this.d).a());
        }
        this.b = 1;
    }

    public /* synthetic */ b8p1(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ b8p1(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public b8p1(tdp1 tdp1Var, int i, amo1 amo1Var) {
        this.a = (byte) 24;
        this.c = tdp1Var;
        this.b = i;
        this.d = amo1Var;
    }

    public b8p1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.a = (byte) 0;
        this.e = new fvo1(this);
        this.b = 1;
        this.d = scheduledExecutorService;
        this.c = context.getApplicationContext();
    }

    public b8p1(nsm0 nsm0Var, int i) {
        this.a = (byte) 17;
        this.c = nsm0Var;
        this.b = i;
        this.e = new WeakHashMap();
    }

    public b8p1(FileOutputStream fileOutputStream) {
        this.a = (byte) 10;
        this.c = fileOutputStream;
        this.d = kgc.c.A(512);
        this.e = ime.c.U0(128);
    }

    public b8p1(wt7 wt7Var, j84 j84Var, yqg yqgVar) {
        this.a = (byte) 2;
        this.c = wt7Var;
        this.d = j84Var;
        this.e = yqgVar;
        this.b = 1;
    }

    public /* synthetic */ b8p1(Object obj, int i, String str, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = str;
        this.e = obj2;
    }

    public b8p1(dfn0 dfn0Var) {
        this.a = (byte) 12;
        Activity activity = dfn0Var.a;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131167208);
        bpb1 bpb1VarB = gio1.b(0);
        this.c = bpb1VarB;
        this.d = bpb1VarB;
        this.e = new Rect(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.b = activity.getResources().getDimensionPixelSize(2131167207);
    }

    public b8p1(byte b) {
        this.a = b;
        switch (b) {
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                this.b = 5;
                this.c = new LinkedHashSet();
                this.d = new LinkedHashMap();
                break;
            default:
                this.c = new Object();
                this.d = null;
                this.e = null;
                this.b = 0;
                break;
        }
    }

    public b8p1(Context context) {
        this.a = (byte) 4;
        this.c = context;
        this.b = -1;
    }

    public b8p1(ggg1 ggg1Var) {
        this.a = (byte) 8;
        this.c = ggg1Var;
        this.e = new bfn0(0, new iu30[16]);
    }

    public b8p1(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.a = (byte) 22;
        this.c = str;
        this.b = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.d = listUnmodifiableList;
        this.e = bArr;
    }

    public b8p1(int i) {
        this.a = (byte) 23;
        Float fValueOf = Float.valueOf(0.0f);
        this.b = i;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = 1.0f;
        }
        this.c = fArr;
        this.d = new mmr0(fValueOf, fValueOf);
        int i3 = this.b;
        t9l1[] t9l1VarArr = new t9l1[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            t9l1VarArr[i4] = new t9l1(1.0f);
        }
        this.e = t9l1VarArr;
    }
}
