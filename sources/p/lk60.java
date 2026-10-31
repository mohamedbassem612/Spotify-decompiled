package p;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lk60 {
    public final d1s a;
    public final o2r b;
    public final o2r c;
    public final vr51 d;
    public final ml60[] e;
    public final ie30[] f;
    public final h1s g;
    public final mk60 h;
    public final pnf1 i;
    public final List j;
    public final dbu0 l;
    public boolean m;
    public BehindLiveWindowException o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f87p;
    public Uri q;
    public boolean r;
    public qp00 s;
    public final bm00 k = new bm00((byte) 8);
    public byte[] n = zoi1.b;
    public long t = -9223372036854775807L;

    public lk60(d1s d1sVar, h1s h1sVar, ml60[] ml60VarArr, ie30[] ie30VarArr, nk60 nk60Var, yeg1 yeg1Var, vr51 vr51Var, List list, dbu0 dbu0Var) {
        this.a = d1sVar;
        this.g = h1sVar;
        this.h = h1sVar.Z;
        this.e = ml60VarArr;
        this.f = ie30VarArr;
        this.d = vr51Var;
        this.j = list;
        this.l = dbu0Var;
        o2r o2rVarA = nk60Var.a(1);
        this.b = o2rVarA;
        if (yeg1Var != null) {
            o2rVarA.a(yeg1Var);
        }
        this.c = nk60Var.a(3);
        this.i = new pnf1("", ie30VarArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < ml60VarArr.length; i2++) {
            if ((ie30VarArr[i2].f & TlsSocketProvider.READ_BUFFER_SIZE) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        pnf1 pnf1Var = this.i;
        int[] iArrB0 = bmq0.b0(arrayList);
        jk60 jk60Var = new jk60(0, pnf1Var, iArrB0);
        ie30 ie30Var = pnf1Var.d[iArrB0[0]];
        while (i < jk60Var.b) {
            if (jk60Var.d[i] == ie30Var) {
                jk60Var.h = i;
                this.s = jk60Var;
            }
            i++;
        }
        i = -1;
        jk60Var.h = i;
        this.s = jk60Var;
    }

    public static kk60 f(bl60 bl60Var, long j, int i) {
        long j2 = bl60Var.k;
        b380 b380Var = bl60Var.s;
        int i2 = (int) (j - j2);
        b380 b380Var2 = bl60Var.r;
        if (i2 == b380Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < b380Var.size()) {
                return new kk60((zk60) b380Var.get(i), j, i);
            }
            return null;
        }
        yk60 yk60Var = (yk60) b380Var2.get(i2);
        if (i == -1) {
            return new kk60(yk60Var, j, -1);
        }
        if (i < yk60Var.Z.size()) {
            return new kk60((zk60) yk60Var.Z.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < b380Var2.size()) {
            return new kk60((zk60) b380Var2.get(i3), j + 1, -1);
        }
        if (b380Var.isEmpty()) {
            return null;
        }
        return new kk60((zk60) b380Var.get(0), j + 1, 0);
    }

    public final a2e0 a(Uri uri) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        h1s h1sVar = this.g;
        g1s g1sVar = (g1s) h1sVar.d.get(uri);
        ml60 ml60Var = g1sVar != null ? g1sVar.a : null;
        ml60Var.getClass();
        HashMap map = ml60Var.b;
        int size = map.size();
        mjh1 mjh1VarK = t380.p(map.values()).k();
        boolean z = false;
        int i = 0;
        while (mjh1VarK.hasNext()) {
            if (h1sVar.e((Uri) mjh1VarK.next(), jElapsedRealtime)) {
                i++;
            }
        }
        int length = this.s.length();
        mk60 mk60Var = this.h;
        if (mk60Var != null && mk60Var.k) {
            z = true;
        }
        boolean z2 = z;
        return new a2e0(z2, size, i, length, d(jElapsedRealtime, z2));
    }

    public final vjh0[] b(qk60 qk60Var, long j) {
        List listUnmodifiableList;
        lk60 lk60Var = this;
        qk60 qk60Var2 = qk60Var;
        int iB = qk60Var2 == null ? -1 : lk60Var.i.b(qk60Var2.d);
        int length = lk60Var.s.length();
        vjh0[] vjh0VarArr = new vjh0[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iF = lk60Var.s.f(i);
            Uri uriB = lk60Var.e[iF].b();
            h1s h1sVar = lk60Var.g;
            if (h1sVar.g(uriB)) {
                bl60 bl60VarB = h1sVar.b(uriB, z);
                bl60VarB.getClass();
                long j2 = bl60VarB.h - h1sVar.V0;
                Pair pairE = lk60Var.e(qk60Var2, iF != iB ? true : z, bl60VarB, j2, j);
                long jLongValue = ((Long) pairE.first).longValue();
                int iIntValue = ((Integer) pairE.second).intValue();
                String str = bl60VarB.a;
                long j3 = bl60VarB.k;
                b380 b380Var = bl60VarB.s;
                b380 b380Var2 = bl60VarB.r;
                int i2 = (int) (jLongValue - j3);
                if (i2 < 0 || b380Var2.size() < i2) {
                    w280 w280Var = b380.b;
                    listUnmodifiableList = bg11.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < b380Var2.size()) {
                        if (iIntValue != -1) {
                            yk60 yk60Var = (yk60) b380Var2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(yk60Var);
                            } else if (iIntValue < yk60Var.Z.size()) {
                                b380 b380Var3 = yk60Var.Z;
                                arrayList.addAll(b380Var3.subList(iIntValue, b380Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(b380Var2.subList(i2, b380Var2.size()));
                        iIntValue = 0;
                    }
                    if (bl60VarB.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < b380Var.size()) {
                            arrayList.addAll(b380Var.subList(iIntValue, b380Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                vjh0VarArr[i] = new ik60(str, j2, listUnmodifiableList);
            } else {
                vjh0VarArr[i] = vjh0.a;
            }
            i++;
            lk60Var = this;
            qk60Var2 = qk60Var;
            z = false;
        }
        return vjh0VarArr;
    }

    public final int c(qk60 qk60Var) {
        int i = qk60Var.o;
        if (i == -1) {
            return 1;
        }
        bl60 bl60VarB = this.g.b(qk60Var.m, false);
        bl60VarB.getClass();
        b380 b380Var = bl60VarB.r;
        int i2 = (int) (qk60Var.j - bl60VarB.k);
        if (i2 < 0) {
            return 1;
        }
        b380 b380Var2 = i2 < b380Var.size() ? ((yk60) b380Var.get(i2)).Z : bl60VarB.s;
        if (i >= b380Var2.size()) {
            return 2;
        }
        wk60 wk60Var = (wk60) b380Var2.get(i);
        if (wk60Var.Z) {
            return 0;
        }
        return Objects.equals(Uri.parse(pno1.p(bl60VarB.a, wk60Var.a)), qk60Var.b.a) ? 1 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    public final int d(long j, boolean z) {
        qp00 qp00Var = this.s;
        int length = qp00Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int iF = qp00Var.f(i2);
            ml60[] ml60VarArr = this.e;
            h1s h1sVar = this.g;
            if (z) {
                if (qp00Var.a(i2, j) || h1sVar.e(ml60VarArr[iF].b(), j)) {
                    i++;
                }
            } else if (qp00Var.a(i2, j) || h1sVar.f(ml60VarArr[iF], j)) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    public final Pair e(qk60 qk60Var, boolean z, bl60 bl60Var, long j, long j2) {
        b380 b380Var;
        int i = -1;
        boolean z2 = true;
        if (qk60Var != null) {
            long jC = qk60Var.j;
            int i2 = qk60Var.o;
            if (!z) {
                if (!qk60Var.H) {
                    return new Pair(Long.valueOf(jC), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    jC = qk60Var.c();
                }
                return new Pair(Long.valueOf(jC), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j3 = bl60Var.u;
        long j4 = bl60Var.k;
        b380 b380Var2 = bl60Var.s;
        b380 b380Var3 = bl60Var.r;
        long j5 = j + j3;
        long j6 = (qk60Var == null || this.r) ? j2 : qk60Var.g;
        if (!bl60Var.o && j6 >= j5) {
            return new Pair(Long.valueOf(j4 + ((long) b380Var3.size())), -1);
        }
        long j7 = j6 - j;
        Long lValueOf = Long.valueOf(j7);
        h1s h1sVar = this.g;
        if (h1sVar.U0 && qk60Var != null) {
            z2 = false;
        }
        int iC = zoi1.c(b380Var3, lValueOf, z2);
        long j8 = ((long) iC) + j4;
        if (!h1sVar.U0) {
            return new Pair(Long.valueOf(j8), -1);
        }
        if (iC >= 0) {
            if (b380Var3.isEmpty()) {
                b380Var = b380Var2;
            } else {
                yk60 yk60Var = (yk60) b380Var3.get(iC);
                if (j7 < yk60Var.e + yk60Var.c) {
                    b380Var = yk60Var.Z;
                } else {
                    b380Var = b380Var2;
                }
            }
            for (int i3 = 0; i3 < b380Var.size(); i3++) {
                wk60 wk60Var = (wk60) b380Var.get(i3);
                if (j7 < wk60Var.e + wk60Var.c) {
                    if (!wk60Var.Y) {
                        break;
                    }
                    j8 += (b380Var != b380Var2 || b380Var3.isEmpty()) ? 0L : 1L;
                    i = i3;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j8), Integer.valueOf(i));
    }

    public final hk60 g(Uri uri, int i, boolean z) {
        nr30 nr30Var = (nr30) this.k.b;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) nr30Var.remove(uri);
        if (bArr != null) {
            return null;
        }
        n3r n3rVar = new n3r(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1, null);
        ie30 ie30Var = this.f[i];
        int iT = this.s.t();
        Object objJ = this.s.j();
        byte[] bArr2 = this.n;
        hk60 hk60Var = new hk60(this.c, n3rVar, 3, ie30Var, iT, objJ, -9223372036854775807L, -9223372036854775807L, null);
        if (bArr2 == null) {
            bArr2 = zoi1.b;
        }
        hk60Var.j = bArr2;
        return hk60Var;
    }
}
