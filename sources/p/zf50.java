package p;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zf50 {
    public final /* synthetic */ byte a;
    public boolean b;
    public int c;
    public int d;
    public Object e;
    public Object f;
    public Object g;

    public zf50(int i, int i2, boolean z) {
        this.a = (byte) 0;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        this.g = new SparseIntArray();
        this.c = i;
        this.d = i2;
        this.b = z;
    }

    public int a(int i, c681 c681Var) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.g;
        int i2 = this.c;
        int i3 = this.d;
        if (i == ((GridLayoutManager) ((TraitsLayoutManager) c681Var.b)).h1 - 1) {
            return Math.max(i3, i2);
        }
        int i4 = sparseIntArray.get(i, -1);
        if (i4 >= 0) {
            return i4;
        }
        int i5 = ((GridLayoutManager) ((TraitsLayoutManager) c681Var.b)).h1;
        int iMax = ((((i5 + 1) * i2) + Math.max((i3 - i2) * 2, 0)) / i5) - c(i, c681Var);
        sparseIntArray.put(i, iMax);
        return iMax;
    }

    public int b(int i, c681 c681Var) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        int i2 = sparseIntArray.get(i, -1);
        if (i2 >= 0) {
            return i2;
        }
        TraitsLayoutManager traitsLayoutManager = (TraitsLayoutManager) c681Var.b;
        int iD = ((GridLayoutManager) traitsLayoutManager).m1.d(i, ((GridLayoutManager) traitsLayoutManager).h1);
        sparseIntArray.put(i, iD);
        return iD;
    }

    public int c(int i, c681 c681Var) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f;
        int i2 = this.c;
        if (i == 0) {
            return Math.max(this.d, i2);
        }
        int i3 = sparseIntArray.get(i, -1);
        if (i3 >= 0) {
            return i3;
        }
        int iA = i2 - a(i - 1, c681Var);
        sparseIntArray.put(i, iA);
        return iA;
    }

    public ConcurrentMap d() {
        if (!this.b) {
            int i = this.c;
            if (i == -1) {
                i = 16;
            }
            int i2 = this.d;
            if (i2 == -1) {
                i2 = 4;
            }
            return new ConcurrentHashMap(i, 0.75f, i2);
        }
        gog0 gog0Var = ipg0.t;
        rog0 rog0Var = (rog0) this.e;
        rog0 rog0Var2 = rog0.a;
        if (((rog0) cwl1.y(rog0Var, rog0Var2)) == rog0Var2 && ((rog0) cwl1.y((rog0) this.f, rog0Var2)) == rog0Var2) {
            return new ipg0(this, ud20.N0);
        }
        rog0 rog0Var3 = (rog0) cwl1.y((rog0) this.e, rog0Var2);
        rog0 rog0Var4 = rog0.b;
        if (rog0Var3 == rog0Var2 && ((rog0) cwl1.y((rog0) this.f, rog0Var2)) == rog0Var4) {
            return new ipg0(this, rh20.N0);
        }
        if (((rog0) cwl1.y((rog0) this.e, rog0Var2)) == rog0Var4 && ((rog0) cwl1.y((rog0) this.f, rog0Var2)) == rog0Var2) {
            return new ipg0(this, xi20.O0);
        }
        if (((rog0) cwl1.y((rog0) this.e, rog0Var2)) == rog0Var4 && ((rog0) cwl1.y((rog0) this.f, rog0Var2)) == rog0Var4) {
            return new ipg0(this, yi20.Z);
        }
        hhg1.c();
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                rl1 rl1VarR0 = cwl1.r0(this);
                int i = this.c;
                if (i != -1) {
                    rl1VarR0.j(i, "initialCapacity");
                }
                int i2 = this.d;
                if (i2 != -1) {
                    rl1VarR0.j(i2, "concurrencyLevel");
                }
                rog0 rog0Var = (rog0) this.e;
                if (rog0Var != null) {
                    rl1VarR0.m(eth.W(rog0Var.toString()), "keyStrength");
                }
                rog0 rog0Var2 = (rog0) this.f;
                if (rog0Var2 != null) {
                    rl1VarR0.m(eth.W(rog0Var2.toString()), "valueStrength");
                }
                if (((mfz) this.g) != null) {
                    kqi0 kqi0Var = new kqi0((byte) 10);
                    ((kqi0) rl1VarR0.e).c = kqi0Var;
                    rl1VarR0.e = kqi0Var;
                    kqi0Var.d = "keyEquivalence";
                }
                return rl1VarR0.toString();
            default:
                return super.toString();
        }
    }

    public zf50() {
        this.a = (byte) 1;
        this.c = -1;
        this.d = -1;
    }

    public zf50(kov0 kov0Var, List list) {
        this.a = (byte) 2;
        this.g = kov0Var;
        this.e = list;
        this.f = new List[list.size()];
        if (list.isEmpty()) {
            tf80.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
