package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import app.p000rive.semantics.SemanticState;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hjk1 implements d4i1 {
    public final ht21 X;
    public final ht21 Y;
    public final HashSet a;
    public final l4i1 e;
    public final n3d f;
    public final n3d g;
    public final HashSet i;
    public final HashMap t;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final dkj0 h = new dkj0(this, (byte) 1);

    public hjk1(n3d n3dVar, n3d n3dVar2, HashSet hashSet, l4i1 l4i1Var, uh61 uh61Var) {
        this.f = n3dVar;
        this.g = n3dVar2;
        this.e = l4i1Var;
        this.a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            e4i1 e4i1Var = (e4i1) it.next();
            map.put(e4i1Var, e4i1Var.l(n3dVar.g(), null, e4i1Var.e(true, l4i1Var)));
        }
        this.t = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.i = hashSet2;
        this.X = new ht21(n3dVar, hashSet2);
        if (this.g != null) {
            this.Y = new ht21(this.g, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            e4i1 e4i1Var2 = (e4i1) it2.next();
            this.d.put(e4i1Var2, Boolean.FALSE);
            this.c.put(e4i1Var2, new gjk1(n3dVar, this, uh61Var));
        }
    }

    public static void q(n3d1 n3d1Var, j2t j2tVar, bb61 bb61Var) {
        n3d1Var.d();
        try {
            w8p1.m();
            n3d1Var.a();
            m3d1 m3d1Var = n3d1Var.l;
            m3d1Var.g(j2tVar, new j3d1(m3d1Var, (byte) 1));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            ya61 ya61Var = bb61Var.f;
            if (ya61Var != null) {
                ya61Var.a(bb61Var);
            }
        }
    }

    public static j2t r(e4i1 e4i1Var) {
        List listB = e4i1Var instanceof pr70 ? e4i1Var.m.b() : Collections.unmodifiableList(e4i1Var.m.g.a);
        o0c.q((String) null, listB.size() <= 1);
        if (listB.size() == 1) {
            return (j2t) listB.get(0);
        }
        return null;
    }

    @Override // p.d4i1
    public final void b(e4i1 e4i1Var) {
        w8p1.m();
        if (s(e4i1Var)) {
            this.d.put(e4i1Var, Boolean.FALSE);
            n3d1 n3d1Var = (n3d1) this.b.get(e4i1Var);
            Objects.requireNonNull(n3d1Var);
            w8p1.m();
            n3d1Var.a();
            n3d1Var.l.a();
        }
    }

    @Override // p.d4i1
    public final void e(e4i1 e4i1Var) {
        j2t j2tVarR;
        w8p1.m();
        n3d1 n3d1Var = (n3d1) this.b.get(e4i1Var);
        Objects.requireNonNull(n3d1Var);
        if (s(e4i1Var) && (j2tVarR = r(e4i1Var)) != null) {
            q(n3d1Var, j2tVarR, e4i1Var.m);
        }
    }

    @Override // p.d4i1
    public final void i(e4i1 e4i1Var) {
        w8p1.m();
        if (s(e4i1Var)) {
            return;
        }
        this.d.put(e4i1Var, Boolean.TRUE);
        j2t j2tVarR = r(e4i1Var);
        if (j2tVarR != null) {
            n3d1 n3d1Var = (n3d1) this.b.get(e4i1Var);
            Objects.requireNonNull(n3d1Var);
            q(n3d1Var, j2tVarR, e4i1Var.m);
        }
    }

    @Override // p.d4i1
    public final void j(e4i1 e4i1Var) {
        w8p1.m();
        if (s(e4i1Var)) {
            n3d1 n3d1Var = (n3d1) this.b.get(e4i1Var);
            Objects.requireNonNull(n3d1Var);
            j2t j2tVarR = r(e4i1Var);
            if (j2tVarR != null) {
                q(n3d1Var, j2tVarR, e4i1Var.m);
                return;
            }
            w8p1.m();
            n3d1Var.a();
            n3d1Var.l.a();
        }
    }

    public final o19 p(e4i1 e4i1Var, ht21 ht21Var, n3d n3dVar, n3d1 n3d1Var, int i, boolean z) {
        Size sizeD;
        int i2;
        int iJ = n3dVar.g().j(i);
        Matrix matrix = n3d1Var.b;
        RectF rectF = pfg1.a;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f2 * f4) + (f * f3);
        float f6 = (f * f4) - (f2 * f3);
        float f7 = (f4 * f4) + (f3 * f3);
        boolean z2 = false;
        double dSqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt(f7);
        boolean z3 = ((float) Math.toDegrees(Math.atan2(((double) f6) / dSqrt, ((double) f5) / dSqrt))) > 0.0f;
        i4i1 i4i1Var = (i4i1) this.t.get(e4i1Var);
        Objects.requireNonNull(i4i1Var);
        Rect rectA = n3d1Var.d;
        float[] fArr2 = new float[9];
        n3d1Var.b.getValues(fArr2);
        int iF = pfg1.f((int) Math.round(Math.atan2(fArr2[3], fArr2[0]) * 57.29577951308232d));
        ht21Var.getClass();
        if (pfg1.b(iF)) {
            rectA = new Rect(rectA.top, rectA.left, rectA.bottom, rectA.right);
            z2 = true;
        }
        if (z) {
            sizeD = pfg1.d(rectA);
            Iterator it = ht21Var.b(i4i1Var).iterator();
            while (it.hasNext()) {
                Size sizeD2 = pfg1.d(ht21.a((Size) it.next(), sizeD));
                if (!ht21.c(sizeD2, sizeD)) {
                    sizeD = sizeD2;
                    break;
                }
            }
        } else {
            Size sizeD3 = pfg1.d(rectA);
            List listB = ht21Var.b(i4i1Var);
            Iterator it2 = listB.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listB.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            sizeD = sizeD3;
                            break;
                        }
                        Size size = (Size) it3.next();
                        if (!ht21.c(size, sizeD3)) {
                            sizeD = size;
                            break;
                        }
                    }
                } else {
                    Size size2 = (Size) it2.next();
                    Rational rationalG = g57.a;
                    if (!g57.a(rationalG, sizeD3)) {
                        rationalG = g57.c;
                        if (!g57.a(rationalG, sizeD3)) {
                            rationalG = ht21.g(sizeD3);
                        }
                    }
                    if (!ht21Var.d(rationalG, size2) && !ht21.c(size2, sizeD3)) {
                        sizeD = size2;
                        break;
                    }
                }
            }
            rectA = ht21.a(sizeD3, sizeD);
        }
        Pair pair = new Pair(rectA, sizeD);
        Rect rect = (Rect) pair.first;
        Size size3 = (Size) pair.second;
        if (z2) {
            Size size4 = new Size(size3.getHeight(), size3.getWidth());
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
            size3 = size4;
        }
        Pair pair2 = new Pair(rect, size3);
        Rect rect2 = (Rect) pair2.first;
        Size size5 = (Size) pair2.second;
        int iJ2 = this.f.g().j(((cx70) e4i1Var.f).p());
        gjk1 gjk1Var = (gjk1) this.c.get(e4i1Var);
        Objects.requireNonNull(gjk1Var);
        gjk1Var.c.c = iJ2;
        int iF2 = pfg1.f((n3d1Var.i + iJ2) - iJ);
        if (e4i1Var instanceof law0) {
            i2 = 1;
        } else {
            i2 = e4i1Var instanceof pr70 ? 4 : 2;
        }
        return new o19(UUID.randomUUID(), i2, e4i1Var instanceof pr70 ? SemanticState.Hidden : 34, rect2, pfg1.e(size5, iF2), iF2, e4i1Var.k(n3dVar) ^ z3);
    }

    public final boolean s(e4i1 e4i1Var) {
        Boolean bool = (Boolean) this.d.get(e4i1Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void t(HashMap map) {
        HashMap map2 = this.b;
        map2.clear();
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            e4i1 e4i1Var = (e4i1) entry.getKey();
            n3d1 n3d1Var = (n3d1) entry.getValue();
            e4i1Var.y(n3d1Var.d);
            e4i1Var.x(n3d1Var.b);
            e4i1Var.g = e4i1Var.v(n3d1Var.g, null);
            e4i1Var.o();
        }
    }
}
