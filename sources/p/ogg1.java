package p;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.transformer.ExportException;
import com.comscore.streaming.ContentMediaFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ogg1 implements a67 {
    public final int a;
    public final e4w b;
    public final b3k c;
    public final zfg1 d;
    public final hfb e;
    public final yys f;
    public final yjq g;
    public final LogSessionId h;
    public long i;
    public final /* synthetic */ pgg1 j;

    public ogg1(pgg1 pgg1Var, int i, b3k b3kVar, zfg1 zfg1Var, hfb hfbVar, yys yysVar, yjq yjqVar, LogSessionId logSessionId) {
        this.j = pgg1Var;
        this.a = i;
        this.b = (e4w) ((f4w) ((b380) b3kVar.b).get(i)).a.get(0);
        this.c = b3kVar;
        this.d = zfg1Var;
        this.e = hfbVar;
        this.f = yysVar;
        this.g = yjqVar;
        this.h = logSessionId;
    }

    public final void a(int i) {
        if (i <= 0) {
            b(ExportException.a(ContentMediaFormat.FULL_CONTENT_GENERIC, new IllegalStateException("AssetLoader instances must provide at least 1 track.")));
            return;
        }
        synchronized (this.j.k) {
            hce1 hce1Var = this.j.l;
            ((mgg1) ((ArrayList) hce1Var.b).get(this.a)).b = i;
        }
    }

    public final void b(ExportException exportException) {
        this.j.c(exportException);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.transformer.ExportException */
    public final void c(ie30 ie30Var) throws ExportException {
        ie30 ie30Var2;
        long j;
        int i;
        String str = ie30Var.f66p;
        int iG = mue1.G(str);
        pgg1 pgg1Var = this.j;
        cab cabVar = pgg1Var.d;
        hce1 hce1Var = pgg1Var.l;
        dm5.y(((h541) ((SparseArray) hce1Var.c).get(iG)) == null);
        SparseArray sparseArray = ((mgg1) ((ArrayList) hce1Var.b).get(this.a)).a;
        String str2 = zoi1.a;
        dm5.y(sparseArray.indexOfKey(iG) >= 0);
        ie30 ie30Var3 = (ie30) sparseArray.get(iG);
        boolean zK = asj0.k(str);
        yjq yjqVar = this.g;
        b3k b3kVar = this.c;
        if (zK) {
            hce1Var.B(1, new e48(ie30Var3, ie30Var, this.d, this.b, ((cnw) b3kVar.d).a, this.e, cabVar, pgg1Var.n, yjqVar, this.h));
            return;
        }
        if (asj0.o(str)) {
            boolean z = this.d.d == 1;
            x8h x8hVar = ie30Var3.H;
            if (x8hVar == null || !x8hVar.f()) {
                x8hVar = x8h.h;
            }
            if (z && x8h.h(x8hVar)) {
                x8hVar = x8h.h;
            }
            ge30 ge30VarA = ie30Var3.a();
            ge30VarA.G = x8hVar;
            ie30Var2 = new ie30(ge30VarA);
        } else {
            if (!asj0.m(str)) {
                throw ExportException.d(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
            }
            ge30 ge30VarA2 = ie30Var.a();
            x8h x8hVar2 = ie30Var.H;
            if (x8hVar2 == null || !x8hVar2.f()) {
                x8hVar2 = x8h.h;
            }
            ge30VarA2.G = x8hVar2;
            ie30Var2 = new ie30(ge30VarA2);
        }
        Context context = pgg1Var.a;
        m9x0 m9x0Var = (m9x0) b3kVar.c;
        b380 b380Var = ((cnw) b3kVar.d).b;
        dhn0 dhn0Var = pgg1Var.n;
        ifb1 ifb1Var = new ifb1(this, (byte) 22);
        ie30 ie30Var4 = ie30Var2;
        long j2 = pgg1Var.g;
        ArrayList arrayList = (ArrayList) hce1Var.b;
        if (arrayList.size() >= 2) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < arrayList.size()) {
                long j3 = j2;
                if (((mgg1) arrayList.get(i2)).a.indexOfKey(2) >= 0) {
                    i3++;
                }
                i2++;
                j2 = j3;
            }
            j = j2;
            i = 2;
            boolean z2 = i3 > 1;
            hce1Var.B(i, new fxj1(context, ie30Var4, this.d, m9x0Var, b380Var, this.f, cabVar, dhn0Var, ifb1Var, yjqVar, j, z2, pgg1Var.t, this.h));
        }
        j = j2;
        i = 2;
        hce1Var.B(i, new fxj1(context, ie30Var4, this.d, m9x0Var, b380Var, this.f, cabVar, dhn0Var, ifb1Var, yjqVar, j, z2, pgg1Var.t, this.h));
    }

    public final boolean d(int i, ie30 ie30Var) {
        boolean zH;
        int iG = mue1.G(ie30Var.f66p);
        synchronized (this.j.k) {
            try {
                hce1 hce1Var = this.j.l;
                int i2 = this.a;
                hce1Var.getClass();
                int iG2 = mue1.G(ie30Var.f66p);
                SparseArray sparseArray = ((mgg1) ((ArrayList) hce1Var.b).get(i2)).a;
                dm5.y(!(sparseArray.indexOfKey(iG2) >= 0));
                sparseArray.put(iG2, ie30Var);
                if (this.j.l.v()) {
                    ArrayList arrayList = (ArrayList) this.j.l.b;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        SparseArray sparseArray2 = ((mgg1) arrayList.get(i5)).a;
                        if (sparseArray2.indexOfKey(1) >= 0) {
                            i3 = 1;
                        }
                        if (sparseArray2.indexOfKey(2) >= 0) {
                            i4 = 1;
                        }
                    }
                    int i6 = i3 + i4;
                    dhn0 dhn0Var = this.j.n;
                    if (dhn0Var.m != 2) {
                        dm5.z(dhn0Var.d.size() == 0, "The track count cannot be changed after adding track formats.");
                        dhn0Var.s = i6;
                    }
                    ((AtomicInteger) this.g.e).set(i6);
                }
                zH = h(i, ie30Var);
                if (!zH && mue1.G(ie30Var.f66p) == 2) {
                    dhn0 dhn0Var2 = this.j.n;
                    float fO = mue1.O(ie30Var, this.b.f.b);
                    if (fO == 90.0f || fO == 180.0f || fO == 270.0f) {
                        int iRound = 360 - Math.round(fO);
                        dm5.z(dhn0Var2.d.size() == 0 || dhn0Var2.r == iRound, "The additional rotation cannot be changed after adding track formats.");
                        dhn0Var2.r = iRound;
                    }
                }
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.j.l.d;
                if (sparseBooleanArray.indexOfKey(iG) >= 0) {
                    dm5.y(zH == sparseBooleanArray.get(iG));
                } else {
                    sparseBooleanArray.put(iG, zH);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zH;
    }

    public final d541 e(ie30 ie30Var) {
        synchronized (this.j.k) {
            try {
                if (!this.j.l.v()) {
                    return null;
                }
                final int iG = mue1.G(ie30Var.f66p);
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.j.l.d;
                dm5.y(sparseBooleanArray.indexOfKey(iG) >= 0);
                if (sparseBooleanArray.get(iG)) {
                    hce1 hce1Var = this.j.l;
                    ArrayList arrayList = (ArrayList) hce1Var.b;
                    dm5.z(hce1Var.v(), "Primary track can only be queried after all tracks are added.");
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            i = -1;
                            break;
                        }
                        if (((mgg1) arrayList.get(i)).a.indexOfKey(iG) >= 0) {
                            break;
                        }
                        i++;
                    }
                    if (i == this.a) {
                        c(ie30Var);
                    }
                } else {
                    g(iG);
                }
                h541 h541Var = (h541) ((SparseArray) this.j.l.c).get(iG);
                if (h541Var == null) {
                    return null;
                }
                final gd50 gd50VarJ = h541Var.j(this.b, ie30Var, this.a);
                p5q0 p5q0Var = new p5q0() { // from class: p.ngg1
                    @Override // p.p5q0
                    public final void a(e4w e4wVar, long j, ie30 ie30Var2, boolean z) {
                        ogg1 ogg1Var = this.a;
                        int i2 = iG;
                        gd50 gd50Var = gd50VarJ;
                        pgg1 pgg1Var = ogg1Var.j;
                        if (pgg1Var.c) {
                            synchronized (pgg1Var.k) {
                                try {
                                    boolean z2 = true;
                                    if (((mgg1) ((ArrayList) ogg1Var.j.l.b).get(ogg1Var.a)).a.size() <= 1 || i2 != 2) {
                                        ((f4w) ((b380) ogg1Var.c.b).get(ogg1Var.a)).getClass();
                                        dm5.z(j != -9223372036854775807L, "MediaItem duration required for sequence looping could not be extracted.");
                                        ogg1Var.i += j;
                                        synchronized (ogg1Var.j.f112p) {
                                            if (z) {
                                                try {
                                                    ogg1Var.j.x--;
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            pgg1 pgg1Var2 = ogg1Var.j;
                                            if (pgg1Var2.x != 0) {
                                                z2 = false;
                                            }
                                            long j2 = ogg1Var.i;
                                            long j3 = pgg1Var2.w;
                                            if (j2 > j3 || z2) {
                                                pgg1Var2.w = Math.max(j2, j3);
                                                for (int i3 = 0; i3 < ogg1Var.j.j.size(); i3++) {
                                                    ((q561) ogg1Var.j.j.get(i3)).getClass();
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        gd50Var.a(e4wVar, j, ie30Var2, z);
                    }
                };
                HashMap map = ((q561) this.j.j.get(this.a)).h;
                dm5.m(iG == 1 || iG == 2);
                dm5.m(map.get(Integer.valueOf(iG)) == null);
                map.put(Integer.valueOf(iG), p5q0Var);
                SparseIntArray sparseIntArray = (SparseIntArray) this.j.l.e;
                String str = zoi1.a;
                sparseIntArray.put(iG, sparseIntArray.indexOfKey(iG) >= 0 ? sparseIntArray.get(iG) + 1 : 1);
                hce1 hce1Var2 = this.j.l;
                ArrayList arrayList2 = (ArrayList) hce1Var2.b;
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (((mgg1) arrayList2.get(i3)).a.indexOfKey(iG) >= 0) {
                        i2++;
                    }
                }
                if (((SparseIntArray) hce1Var2.e).get(iG) == i2) {
                    this.j.d();
                    this.j.i.c(2, h541Var).b();
                }
                return gd50VarJ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(int i) {
        pgg1 pgg1Var = this.j;
        hce1 hce1Var = pgg1Var.l;
        dm5.y(((h541) ((SparseArray) hce1Var.c).get(i)) == null);
        b380 b380Var = (b380) this.c.b;
        int i2 = this.a;
        dm5.n(!((f4w) b380Var.get(i2)).a(), "Gaps can not be transmuxed.");
        SparseArray sparseArray = ((mgg1) ((ArrayList) hce1Var.b).get(i2)).a;
        String str = zoi1.a;
        dm5.y(sparseArray.indexOfKey(i) >= 0);
        hce1Var.B(i, new sax((ie30) sparseArray.get(i), this.d, pgg1Var.n, this.g, pgg1Var.g));
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0142  */
    /* JADX WARN: Code duplicated, block: B:91:0x0163  */
    public final boolean h(int i, ie30 ie30Var) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        pgg1 pgg1Var = this.j;
        boolean z4 = pgg1Var.u;
        cab cabVar = pgg1Var.d;
        boolean z5 = true;
        boolean z6 = (i & 1) != 0;
        int iG = mue1.G(ie30Var.f66p);
        if (!z6) {
            return true;
        }
        zfg1 zfg1Var = this.d;
        int i2 = this.a;
        b3k b3kVar = this.c;
        if (iG == 1) {
            dhn0 dhn0Var = pgg1Var.n;
            b380 b380Var = (b380) b3kVar.b;
            if (b380Var.size() > 1 || ((f4w) b380Var.get(i2)).a.d > 1) {
                z2 = !b3kVar.e;
                return z2;
            }
            b380 b380Var2 = (b380) b3kVar.b;
            int i3 = 0;
            while (true) {
                if (i3 >= b380Var2.size()) {
                    z3 = false;
                    break;
                }
                if (((f4w) b380Var2.get(i3)).a()) {
                    z3 = true;
                    break;
                }
                i3++;
            }
            if (z3 || cabVar.e()) {
                return true;
            }
            String str2 = zfg1Var.b;
            if (str2 != null && !str2.equals(ie30Var.f66p)) {
                return true;
            }
            if ((zfg1Var.b == null && !dhn0Var.d(ie30Var.f66p)) || !((e4w) ((f4w) b380Var.get(i2)).a.get(0)).f.a.isEmpty() || !((cnw) b3kVar.d).a.isEmpty()) {
                return true;
            }
            return false;
        }
        if (iG == 2) {
            dhn0 dhn0Var2 = pgg1Var.n;
            b380 b380Var3 = (b380) b3kVar.b;
            if (b380Var3.size() > 1 || ((f4w) b380Var3.get(i2)).a.d > 1) {
                z = !b3kVar.f;
            } else if (!cabVar.a() && zfg1Var.d == 0 && (((str = zfg1Var.c) == null || str.equals(ie30Var.f66p) || str.equals(hkh0.c(ie30Var))) && ((str != null || dhn0Var2.d(ie30Var.f66p) || dhn0Var2.d(hkh0.c(ie30Var))) && ie30Var.E == 1.0f))) {
                e4w e4wVar = (e4w) ((f4w) b380Var3.get(i2)).a.get(0);
                v280 v280Var = new v280(4);
                v280Var.e(e4wVar.f.b);
                v280Var.e(((cnw) b3kVar.d).b);
                bg11 bg11VarG = v280Var.g();
                if (bg11VarG.isEmpty() || mue1.O(ie30Var, bg11VarG) != -1.0f) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            if (z) {
                z2 = true;
            } else {
                yoh0 yoh0Var = this.b.a;
                if (!z4) {
                    noh0 noh0Var = yoh0Var.e;
                    if (noh0Var.a > 0 && !noh0Var.g) {
                        z2 = true;
                    }
                }
                z2 = false;
            }
            if (z4 && z2) {
                z5 = false;
            }
            dm5.A(z5, "Transcoding is required for track %s but MP4 edit list trimming is enabled. Disable mp4EditListTrimEnabled or ensure this track does not require transcoding.", ie30Var);
            return z2;
        }
        return false;
    }

    public final void f(long j) {
    }
}
