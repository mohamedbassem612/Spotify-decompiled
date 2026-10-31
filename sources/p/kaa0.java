package p;

import androidx.compose.ui.geometry.Offset;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class kaa0 {
    public static int[] _values() {
        return l1d.H(18);
    }

    public static final boolean a(int i, jyc jycVar) {
        return (jycVar.getKind() != 2) == (i == 1);
    }

    public static final String b(int i) {
        if (i == 1) {
            return "normal";
        }
        if (i == 2) {
            return "deeplink_with_item";
        }
        if (i == 3) {
            return "deeplink_without_item";
        }
        if (i == 4) {
            return "deeplink_item_not_found";
        }
        throw null;
    }

    public static final int c(int i) {
        int iC = l1d.C(i);
        if (iC == 2) {
            return 15;
        }
        if (iC == 3) {
            return 16;
        }
        if (iC == 4) {
            return 17;
        }
        if (iC != 5) {
            return iC != 16 ? 0 : 13;
        }
        return 18;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "podcast_scroll_npv";
        }
        if (i == 2) {
            return "music_npv";
        }
        if (i == 3) {
            return "playlist";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "podcast_scroll_npv";
        }
        if (i == 2) {
            return "music_npv";
        }
        if (i == 3) {
            return "playlist";
        }
        throw null;
    }

    public static int f(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static KotlinNothingValueException g(String str) {
        tf80.b(str);
        return new KotlinNothingValueException();
    }

    public static hrr0 h(long j, x340 x340Var) {
        hrr0 hrr0VarQ = v8r.q(new Offset(j));
        x340Var.s0(hrr0VarQ);
        return hrr0VarQ;
    }

    public static void i(int i, int i2, int i3, int i4, int i5) {
        mno1.d(i);
        mno1.d(i2);
        mno1.d(i3);
        mno1.d(i4);
        mno1.d(i5);
    }

    public static void j(long j, ven0 ven0Var) {
        ven0Var.setValue(new Offset(j));
    }

    public static /* synthetic */ void k(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void l(saa0 saa0Var, Object obj, i980 i980Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = saa0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(saa0Var, obj, i980Var) && atomicReferenceFieldUpdater.get(saa0Var) == obj) {
        }
    }

    public static /* synthetic */ boolean m(saa0 saa0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = saa0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(saa0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(saa0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean n(saa0 saa0Var, z5x z5xVar, n0g n0gVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = saa0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(saa0Var, z5xVar, n0gVar)) {
            if (atomicReferenceFieldUpdater.get(saa0Var) != z5xVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean o(saa0 saa0Var, iaa0 iaa0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = saa0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(saa0Var, iaa0Var, j1e1.g)) {
            if (atomicReferenceFieldUpdater.get(saa0Var) != iaa0Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "Measuring";
        }
        if (i == 2) {
            return "LookaheadMeasuring";
        }
        if (i == 3) {
            return "LayingOut";
        }
        if (i != 4) {
            return i != 5 ? "null" : "Idle";
        }
        return "LookaheadLayingOut";
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "Wrap";
        }
        if (i == 2) {
            return "Fixed";
        }
        if (i != 3) {
            return i != 4 ? "null" : "MatchParent";
        }
        return "Expand";
    }
}
