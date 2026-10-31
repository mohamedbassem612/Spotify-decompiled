package p;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class o5 implements j06, ps40 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public o5(String str, Rect rect, List list, String str2, Matrix matrix) {
        this.a = (byte) 4;
        this.b = str;
        Rect rect2 = new Rect(rect);
        if (matrix != null) {
            RectF rectF = new RectF(rect2);
            matrix.mapRect(rectF);
            rect2.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        this.c = rect2;
        int size = list.size();
        Point[] pointArr = new Point[size];
        for (int i = 0; i < list.size(); i++) {
            pointArr[i] = new Point((Point) list.get(i));
        }
        if (matrix != null) {
            float[] fArr = new float[size + size];
            for (int i2 = 0; i2 < size; i2++) {
                Point point = pointArr[i2];
                int i3 = i2 + i2;
                fArr[i3] = point.x;
                fArr[i3 + 1] = point.y;
            }
            matrix.mapPoints(fArr);
            for (int i4 = 0; i4 < size; i4++) {
                int i5 = i4 + i4;
                pointArr[i4].set((int) fArr[i5], (int) fArr[i5 + 1]);
            }
        }
        this.d = str2;
    }

    public static void y(int i, int i2, int i3, List list) {
        int i4 = i > i2 ? i2 : i2 - i3;
        if (i3 != 1) {
            List listSubList = list.subList(i, i3 + i);
            ArrayList arrayList = new ArrayList(listSubList);
            listSubList.clear();
            list.addAll(i4, arrayList);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }

    public u8 A(ohc ohcVar) {
        return vl60.s(ohcVar, tz00.a());
    }

    public void B(Bitmap bitmap, xj30 xj30Var, rgl rglVar) {
        throw new UnsupportedOperationException();
    }

    public void C(int i, long j) {
        throw new UnsupportedOperationException();
    }

    public void E(xj30 xj30Var) {
        throw new UnsupportedOperationException();
    }

    public void J(hym0 hym0Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void K(dos dosVar);

    public void L() {
        ((roj1) this.c).f(new vys(this, (byte) 1), true);
    }

    public abstract void M();

    public Set N() {
        return ((Map) this.c).keySet();
    }

    public void P(u8 u8Var) {
        vl60 vl60Var = (vl60) u8Var;
        gsi1.c(vl60Var.q());
        if (vl60Var.o().size() >= 16) {
            zl60.Q(vl60Var.p());
        } else {
            k220.r("key too short");
        }
    }

    public Object a() {
        return this.c;
    }

    public void clear() {
        ((ArrayList) this.d).clear();
        this.c = this.b;
        z();
    }

    public void h(Object obj) {
        ((ArrayList) this.d).add(this.c);
        this.c = obj;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.d;
        this.c = arrayList.remove(arrayList.size() - 1);
    }

    public abstract void m();

    public abstract kf30 n();

    public void onFlush() {
        ((roj1) this.c).f(new vys(this, (byte) 3), true);
    }

    public Class p() {
        return (Class) this.d;
    }

    public void q() {
        synchronized (this.b) {
            try {
                qoj1 qoj1Var = (qoj1) this.d;
                if (qoj1Var != null) {
                    ((roj1) this.c).g(qoj1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Surface r() {
        throw new UnsupportedOperationException();
    }

    public String s() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public int t() {
        return 0;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return getClass().getSimpleName() + ": " + n();
            default:
                return super.toString();
        }
    }

    public Object u() {
        return this.b;
    }

    public abstract void v();

    public abstract k9 w();

    public apa0 x() {
        return apa0.c;
    }

    public void z() {
        ((s3x) this.b).b.clear();
    }

    public void F() {
    }

    public void G() {
    }

    public void H() {
    }

    public void O() {
    }

    public void o() {
    }

    public void D(cca ccaVar) {
    }

    public void I(xj30 xj30Var, boolean z) {
    }

    public o5(zjn0 zjn0Var, l141 l141Var, mka1 mka1Var) {
        this.a = (byte) 3;
        this.b = zjn0Var;
        this.c = l141Var;
        this.d = mka1Var;
    }

    public o5(int i) {
        this.a = (byte) 1;
        this.c = new float[i * 2];
        this.d = new int[i];
    }

    public o5(roj1 roj1Var) {
        this.a = (byte) 5;
        this.c = roj1Var;
        this.b = new Object();
    }

    public o5(Class cls, ypa0[] ypa0VarArr) {
        this.a = (byte) 2;
        this.b = cls;
        HashMap map = new HashMap();
        for (ypa0 ypa0Var : ypa0VarArr) {
            boolean zContainsKey = map.containsKey(ypa0Var.a);
            Class cls2 = ypa0Var.a;
            if (!zContainsKey) {
                map.put(cls2, ypa0Var);
            } else {
                hhg1.n(cy30.k(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                throw null;
            }
        }
        if (ypa0VarArr.length > 0) {
            this.d = ypa0VarArr[0].a;
        } else {
            this.d = Void.class;
        }
        this.c = Collections.unmodifiableMap(map);
    }

    public o5(Object obj) {
        this.a = (byte) 0;
        this.b = obj;
        this.d = new ArrayList();
        this.c = obj;
    }
}
